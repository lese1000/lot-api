package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.base.BaseController;
import com.example.demo.model.dto.JsonDto;
import com.example.demo.model.entity.JoinBuy;
import com.example.demo.model.entity.JoinBuyDetail;
import com.example.demo.model.entity.LotteryNum;
import com.example.demo.model.entity.LotteryType;
import com.example.demo.model.entity.Order;
import com.example.demo.model.entity.OrderDetail;
import com.example.demo.model.vo.HistoryVo;
import com.example.demo.service.JoinBuyDetailService;
import com.example.demo.service.JoinBuyService;
import com.example.demo.service.LotteryNumService;
import com.example.demo.service.LotteryTypeService;
import com.example.demo.service.OrderDetailService;
import com.example.demo.service.OrderService;

@RestController
@RequestMapping("api/v1/history")
public class HistoryController extends BaseController{
	
	@Autowired
	private OrderService orderService;
	@Autowired
	private OrderDetailService orderDetailService;
	@Autowired
	private JoinBuyService joinBuyService;
	@Autowired
	private JoinBuyDetailService joinBuyDetailService;
	@Autowired
	private LotteryNumService lotteryNumService;
	@Autowired
	private LotteryTypeService lotteryTypeService;

	@RequestMapping("personalList")
	public JsonDto personalBetting() {
		try {
			List<HistoryVo> historyList = new ArrayList<>();
			
			Order orderParam = new Order();
			orderParam.setPlayerId(this.getPlayerId());
			Byte isJoinBuy = 0;
			orderParam.setIsJoinBuy(isJoinBuy);
			List<Order> orderList = orderService.listOrderSelective(orderParam, pageNum, pageSize);
			if(null != orderList) {
				for(Order item : orderList) {
					HistoryVo historyVo = new HistoryVo();
					List<OrderDetail> orderDetailList = orderDetailService.listOrderDetailByOrderId(item.getId());
					historyVo.setOrderDetailList(orderDetailList);
					
					LotteryNum lotteryNum = lotteryNumService.selectByPrimaryKey(item.getLotteryNumId());
					historyVo.setLotteryNum(lotteryNum.getLotteryNum());
					if(item.getOrderStatus() !=0) {
						historyVo.setWinNum(lotteryNum.getWinNum());
					}
					
					LotteryType lotteryType = lotteryTypeService.selectByPrimaryKey(lotteryNum.getLotteryTypeId());
					historyVo.setLotteryTypeName(lotteryType.getLotteryTypeName());
					
					historyVo.setCreateDate(item.getCreateTime());
					historyVo.setOrderId(item.getId());
					historyVo.setOrderNum(item.getOrderNum());
					historyVo.setOrderStatus(item.getOrderStatus());
					historyVo.setTotalBettingMoney(item.getTotalBettingMoney());
					if(null == item.getTotalWinMoney()) {
						historyVo.setTotalWinMoney(0d);
					}else {
						historyVo.setTotalWinMoney(item.getTotalWinMoney());
					}
					
					
					historyList.add(historyVo);
					
				}
			}
			
			json.setData(historyList);
			json.setSuccess();
			
		} catch (Exception e) {
			log.error("personalBetting Error",e);
			json.setError();
		}
		return json;
	}
	
	@RequestMapping("joinBuyList")
	public JsonDto JoinBuyBetting() {
		try {
			List<HistoryVo> historyList = new ArrayList<>();
			List<JoinBuyDetail> joinBuyDetailList = joinBuyDetailService.listJoinBuyDetailByPlayerId(this.getPlayerId(), pageNum, pageSize);
			if(null != joinBuyDetailList) {
				for(JoinBuyDetail item : joinBuyDetailList) {
					HistoryVo historyVo = new HistoryVo();
					JoinBuy joinBuy = joinBuyService.selectByPrimaryKey(item.getJoinBuyId());
					historyVo.setJoinBuyId(joinBuy.getId());
					
					Order order = orderService.selectByPrimaryKey(joinBuy.getOrderId());
					historyVo.setOrderId(order.getId());
					historyVo.setOrderNum(order.getOrderNum());
					historyVo.setOrderStatus(order.getOrderStatus());
					
					List<OrderDetail> orderDetailList = orderDetailService.listOrderDetailByOrderId(order.getId());
					historyVo.setOrderDetailList(orderDetailList);
					
					LotteryNum lotteryNum = lotteryNumService.selectByPrimaryKey(order.getLotteryNumId());
					historyVo.setLotteryNum(lotteryNum.getLotteryNum());
					if(order.getOrderStatus() !=0) {
						historyVo.setWinNum(lotteryNum.getWinNum());
					}
					
					LotteryType lotteryType = lotteryTypeService.selectByPrimaryKey(lotteryNum.getLotteryTypeId());
					historyVo.setLotteryTypeName(lotteryType.getLotteryTypeName());
					
					historyVo.setCreateDate(item.getCreateDate());
					historyVo.setTotalBettingMoney(item.getBuyMoney());
					if(null == item.getWinPrize()) {
						historyVo.setTotalWinMoney(0d);
					}else {
						historyVo.setTotalWinMoney(item.getWinPrize());
					}
					
					
					historyList.add(historyVo);
				}
			}
			
			
			json.setData(historyList);
			json.setSuccess();
			
		} catch (Exception e) {
			log.error("personalBetting Error",e);
			json.setError();
		}
		return json;
	}
}
