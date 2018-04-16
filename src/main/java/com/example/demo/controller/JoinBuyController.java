package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.base.BaseController;
import com.example.demo.model.dto.JsonDto;
import com.example.demo.model.entity.Balance;
import com.example.demo.model.entity.BalanceRecord;
import com.example.demo.model.entity.JoinBuy;
import com.example.demo.model.entity.JoinBuyDetail;
import com.example.demo.model.entity.LotteryNum;
import com.example.demo.model.entity.LotteryType;
import com.example.demo.model.entity.Order;
import com.example.demo.model.entity.OrderDetail;
import com.example.demo.model.vo.JoinBuyDetailVo;
import com.example.demo.model.vo.JoinBuyInfoVo2;
import com.example.demo.model.vo.OrderDetailVo;
import com.example.demo.service.BalanceRecordService;
import com.example.demo.service.BalanceService;
import com.example.demo.service.JoinBuyDetailService;
import com.example.demo.service.JoinBuyService;
import com.example.demo.service.LotteryNumService;
import com.example.demo.service.LotteryTypeService;
import com.example.demo.service.OrderDetailService;
import com.example.demo.service.OrderService;

@RestController
@RequestMapping("api/v1/joinBuy")
public class JoinBuyController extends BaseController{
	
	@Autowired
	private JoinBuyService joinBuyService;
	@Autowired
	private LotteryTypeService lotteryTypeService;
	@Autowired
	private LotteryNumService lotteryNumService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private BalanceService balanceService;
	@Autowired
	private BalanceRecordService balanceRecordService;
	@Autowired
	private JoinBuyDetailService joinBuyDetailService;
	@Autowired
	private OrderDetailService orderDetailService;
	
	@RequestMapping("list")
	public JsonDto getJoinBuyList(JoinBuy joinBuy) {
		try {
			List<JoinBuyInfoVo2> joinBuyInfoList = null;
			List<JoinBuy> joinBuyList = joinBuyService.listJoinBuy(joinBuy, pageNum, pageSize);
			if(null != joinBuyList) {
				joinBuyInfoList = new ArrayList<>();
				for(JoinBuy item: joinBuyList) {
					
					Order order = orderService.selectByPrimaryKey(item.getOrderId());
					LotteryNum lotteryNum = lotteryNumService.selectByPrimaryKey(order.getLotteryNumId());
					LotteryType lotteryType = lotteryTypeService.selectByPrimaryKey(lotteryNum.getLotteryTypeId());
					
					
					JoinBuyInfoVo2 tmpInfo = new JoinBuyInfoVo2();
					
					tmpInfo.setLotteryNum(lotteryNum.getLotteryNum());
					tmpInfo.setLotteryTypeName(lotteryType.getLotteryTypeName());
					
					tmpInfo.setOrderId(order.getId());
					tmpInfo.setOrderNum(order.getOrderNum());
					tmpInfo.setOrderStatus(order.getOrderStatus());
					tmpInfo.setTotalBettingMoney(order.getTotalBettingMoney());
					
					tmpInfo.setLeastNum(item.getLeastNum());
					tmpInfo.setTotalPieceNum(item.getTotalPieceNum());
					tmpInfo.setRemainingPieceNum(item.getRemainingPieceNum());
					tmpInfo.setJoinBuyId(item.getId());
					
					int progressInt = item.getTotalPieceNum() - item.getRemainingPieceNum();
					int t = progressInt * 10000 / item.getTotalPieceNum();
					String progress = (Math.rint(new Double(t))/100) + "%";
					tmpInfo.setProgress(progress);
					
					joinBuyInfoList.add(tmpInfo);
				}
			}
			
			json.setData(joinBuyInfoList);
			json.setSuccess();
			
		} catch (Exception e) {
			json.setError();
			log.error("getJoinBuyList Error",e);
		}
		return json;
	}
	
	@RequestMapping("getJoinBuyInfo")
	public JsonDto getJoinBuyInfo (Long joinBuyId) {
		try {
			if(null != joinBuyId && joinBuyId != 0) {
				JoinBuy joinBuy = joinBuyService.selectByPrimaryKey(joinBuyId);
				json.setData(joinBuy);
				json.setSuccess();
			}else {
				json.setFailure("请求参数不能为空");
			}
		} catch (Exception e) {
			json.setError();
			log.error("getJoinBuyInfo Error",e);
		}
		return json;
	}
	
	@RequestMapping("getOrderDetail")
	public JsonDto getOrderDetail(Long joinBuyId) {
		try {
			if(null != joinBuyId && joinBuyId != 0) {
				JoinBuy joinBuy = joinBuyService.selectByPrimaryKey(joinBuyId);
				Order order = orderService.selectByPrimaryKey(joinBuy.getOrderId());
				List<OrderDetail> orderDetailList = orderDetailService.listOrderDetailByOrderId(order.getId());
				LotteryNum lotteryNum = lotteryNumService.selectByPrimaryKey(order.getLotteryNumId());
				LotteryType lotteryType = lotteryTypeService.selectByPrimaryKey(lotteryNum.getLotteryTypeId());
				
				OrderDetailVo orderDetailVo = new OrderDetailVo();
				orderDetailVo.setJoinBuyId(joinBuyId);
				
				orderDetailVo.setLotteryNum(lotteryNum.getLotteryNum());
				orderDetailVo.setLotteryTypeName(lotteryType.getLotteryTypeName());
				orderDetailVo.setOrderDetailList(orderDetailList);
				orderDetailVo.setOrderNum(order.getOrderNum());
				orderDetailVo.setOrderStatus(order.getOrderStatus());
				orderDetailVo.setTotalBettingMoney(order.getTotalBettingMoney());
				
				json.setData(orderDetailVo);
				json.setSuccess();
			}else {
				json.setFailure("请求参数不能为空");
			}
		} catch (Exception e) {
			json.setError();
			log.error("getOrderDetail Error",e);
		}
		return json;
	}
	
	@RequestMapping("listJoinBuyDetail")
	public JsonDto listJoinBuyDetail(Long joinBuyId) {
		try {
			try {
				if(null != joinBuyId && joinBuyId != 0) {
					 List<JoinBuyDetailVo> joinBuyDetailList = joinBuyDetailService.listJoinBuyDetailByJoinBuyId(joinBuyId,this.pageNum,this.pageSize);
					json.setData(joinBuyDetailList);
					json.setSuccess();
				}else {
					json.setFailure("请求参数不能为空");
				}
			} catch (Exception e) {
				json.setError();
				log.error("getJoinBuyInfo Error",e);
			}
		} catch (Exception e) {
			json.setError();
			log.error("listJoinDetail Error");
		}
		return json;
	}
	
	@RequestMapping("doJoinBuy2")
	public synchronized	JsonDto doJoinBuy2(Long joinBuyId, Integer buyPieceNum) {
		try {
			if(null != joinBuyId && joinBuyId !=0) {
				JoinBuy joinBuy = joinBuyService.selectByPrimaryKey(joinBuyId);
				if(null == joinBuy) {
					json.setFailure("未获取到合买信息");
					return json;
				}
				if(null == buyPieceNum || buyPieceNum ==0) {
					json.setFailure("合买份数不能为空");
					return json;
				}else if(buyPieceNum < joinBuy.getLeastNum()) {
					json.setFailure("合买失败，保底份数为:" + joinBuy.getLeastNum() + "份");
				}
				//1)判断剩余份数是否足够
				if(joinBuy.getRemainingPieceNum() < buyPieceNum) {
					json.setFailure("合买失败，剩余份数已不足");
					return json;
				}
				
				
				Order order = orderService.selectByPrimaryKey(joinBuy.getOrderId());
				if(null == order) {
					json.setFailure("未获取到合买订单信息");
					return json;
				}
				LotteryNum lotteryNum = lotteryNumService.selectByPrimaryKey(order.getLotteryNumId());
				if(null == lotteryNum) {
					json.setFailure("未获取到期号信息");
					return json;
				}
				//2) 判断是否结束投注
				Date endTime = lotteryNum.getEndTime();
				Date nowTime = new Date();
				if(nowTime.after(endTime)) {
					json.setFailure("合买失败，该期彩票已结束投注");
					return json;
				}
				//3）判断余额是否足够
				Double singlePrice = joinBuy.getSinglePieceMoney();
				Double bettingMoney = singlePrice * buyPieceNum;
				Balance balance = balanceService.getBalanceByPlayerId(this.getPlayerId());
				if(null == balance) {
					json.setFailure("合买失败，余额不足");
					return json;
				}
				if(balance.getBalanceVal() < bettingMoney) {
					json.setFailure("合买失败，余额不足");
					return json;
				}
				
				//扣除余额
				balance.setBalanceVal(balance.getBalanceVal() - bettingMoney);
				balanceService.updateByPrimaryKeySelective(balance);
				
				//增加余额记录
				BalanceRecord record = new BalanceRecord ();
				Byte balanceType = 3;
				record.setBalanceType(balanceType);
				record.setOrderId(order.getId());
				balanceRecordService.insert(record);
				
				//更新合买信息,保存合买记录
				joinBuy.setRemainingPieceNum(joinBuy.getRemainingPieceNum() - buyPieceNum);
				joinBuyService.updateByPrimaryKeySelective(joinBuy);
				
				JoinBuyDetail joinBuyDetail = new JoinBuyDetail();
				joinBuyDetail.setBuyCount(buyPieceNum);
				joinBuyDetail.setBuyMoney(bettingMoney);
				
				joinBuyDetail.setCreateDate(new Date());
				joinBuyDetail.setJoinBuyId(joinBuyId);
				joinBuyDetail.setPlayerId(this.getPlayerId());
				joinBuyDetailService.insertSelective(joinBuyDetail);
				
				json.setSuccess("合买成功！");
				
				
				
				
				
			}else {
				json.setFailure("合买请求参数不能为空");
			}
		} catch (Exception e) {
			json.setError();
			log.error("joinBuy Error",e);
		}
		return json;
	}

}
