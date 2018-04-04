package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.base.utils.libaray.util.DateUtil;
import com.base.utils.libaray.util.JacksonUtils;
import com.example.demo.controller.base.BaseController;
import com.example.demo.model.dto.JsonDto;
import com.example.demo.model.entity.Balance;
import com.example.demo.model.entity.BalanceRecord;
import com.example.demo.model.entity.LotteryType;
import com.example.demo.model.entity.Order;
import com.example.demo.model.entity.OrderDetail;
import com.example.demo.model.entity.Rule;
import com.example.demo.model.param.BettingInfoParam;
import com.example.demo.model.vo.BettingInfoVo;
import com.example.demo.service.BalanceRecordService;
import com.example.demo.service.BalanceService;
import com.example.demo.service.LotteryTypeService;
import com.example.demo.service.OrderDetailService;
import com.example.demo.service.OrderService;
import com.example.demo.service.RuleService;
import com.example.demo.util.CombinatorialUtil;

@RestController
@RequestMapping("api/v1/betting")
public class BettingController extends BaseController{
	
	@Autowired
	private RuleService ruleService;
	@Autowired
	private LotteryTypeService lotteryTypeService;
	@Autowired
	private BalanceService balanceService;
	@Autowired
	private BalanceRecordService balanceRecordService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private OrderDetailService orderDetailService;
	

	//一键投注和立即投注
	@RequestMapping(value = "doBetting", method = RequestMethod.POST)
	public JsonDto doBettingStr(Long lotteryTypeId, Long ruleId, Byte isJoinBuy, String bettingInfoStr ) {
		System.out.println(bettingInfoStr);
		List<BettingInfoVo> bettingInfoList = null;
		try {
			//1)判断请求参数是否合法
			bettingInfoList = JacksonUtils.toList(bettingInfoStr, BettingInfoVo.class);
		} catch (Exception e) {
			json.setFailure("请求参数异常");
			return json;
		}
		try {
			int minSelectNum = 3;//默认选三个号码
			double singlePrice = 2;//默认单注2元
			double totalBettingMoney = 0;
			
			
			if(null == lotteryTypeId || lotteryTypeId == 0) {
				json.setFailure("请选择彩种");
				return json;
			}else {
				LotteryType lotteryType = lotteryTypeService.selectByPrimaryKey(lotteryTypeId);
				if(null == lotteryType) {
					json.setFailure("未找到匹配的彩种");
					return json;
				}else {
					singlePrice = lotteryType.getSinglePrice();
				}
			}
			
			
			if(null == ruleId || ruleId == 0) {
				json.setFailure("请选择玩法");
				return json;
			}else {
				Rule rule = ruleService.selectByPrimaryKey(ruleId);
				if(null == rule) {
					json.setFailure("未找到匹配的玩法规则");
					return json;
				}else {
					minSelectNum = rule.getSelectNumber();
				}
			}
			if(null != bettingInfoList ) {
				List<OrderDetail> orderDetailList = new ArrayList<>();
				for (BettingInfoVo bettingInfoVo : bettingInfoList) {
					String selectedNum = bettingInfoVo.getSelectedNum();
					System.out.println(selectedNum);
					if(StringUtils.isNotBlank(selectedNum)) {
						//2）计算每注号码及金额
						String[] selectedNumArr = selectedNum.split(",");
						if(selectedNumArr.length < minSelectNum) {
							json.setFailure("至少选择" + minSelectNum + "位号码");
							return json;
						}
						int bettingAmounts = CombinatorialUtil.getCombinatorial(selectedNumArr.length, minSelectNum);
						double curMoney = bettingAmounts * singlePrice * bettingInfoVo.getRateAmounts();
						totalBettingMoney += curMoney;
						
						//====
						OrderDetail orderDetail = new OrderDetail();
						orderDetail.setBettingCount(bettingAmounts);
						orderDetail.setBettingMoney(curMoney);
						orderDetail.setBettingNum(selectedNum);
						orderDetail.setCreateDate(new Date());
						orderDetail.setRate(bettingInfoVo.getRateAmounts());
						orderDetailList.add(orderDetail);
						
						
					}else {
						json.setFailure("投注号码不能为空");
						return json;
					}
				}
				//3）判断余额是否可购买，
				double balanceVal = 0;
				Balance balance = balanceService.getBalanceByPlayerId(this.getPlayerId());
				if(null != balance) {
					 balanceVal = balance.getBalanceVal();
				}else {
					json.setFailure("余额不足，请先充值");
					return json;
				}
				if( balanceVal < totalBettingMoney) {
					json.setFailure("余额不足，请先充值");
					return json;
				}
				//4)扣除余额，增加余额使用记录
				balance.setBalanceVal((balanceVal - totalBettingMoney));
				balance.setUpdateDate(new Date());
				balanceService.updateByPrimaryKeySelective(balance);
				
				BalanceRecord balanceRecord = new BalanceRecord();
				Byte balanceType = 3;//消费
				balanceRecord.setBalanceType(balanceType);
				balanceRecord.setBalanceVal(totalBettingMoney);
				balanceRecord.setCreateDate(new Date());
				balanceRecord.setPlayerId(getPlayerId());				
				balanceRecordService.insertSelective(balanceRecord);
				
				//5）保存投注订单
				Order order = new Order();
				order.setCreateTime(new Date());
				order.setPlayerId(this.getPlayerId());
				if(null == isJoinBuy) {
					isJoinBuy = 0;
				}
				order.setIsJoinBuy(isJoinBuy);
				order.setOrderNum(DateUtil.fomatDate(new Date(),DateUtil.DATE_TIME_FORMAT_10));
				Byte orderStatus = 0;
				order.setOrderStatus(orderStatus);
				order.setRuleId(ruleId);
				order.setTotalBettingMoney(totalBettingMoney);
				orderService.insertSelective(order);
				
				//6）批量保存订单明细
				for(OrderDetail detailItem : orderDetailList) {
					detailItem.setOrderId(order.getId());
				}
				orderDetailService.batchInsert(orderDetailList);
			
			}
		} catch (Exception e) {
			log.error("doBetting Error",e);
			json.setError();
		}
		return this.json;
	}

}
