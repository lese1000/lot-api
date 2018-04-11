package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.base.BaseController;
import com.example.demo.model.dto.JsonDto;
import com.example.demo.model.entity.JoinBuy;
import com.example.demo.model.entity.LotteryNum;
import com.example.demo.model.entity.LotteryType;
import com.example.demo.model.entity.Order;
import com.example.demo.model.vo.JoinBuyInfoVo2;
import com.example.demo.service.JoinBuyService;
import com.example.demo.service.LotteryNumService;
import com.example.demo.service.LotteryTypeService;
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

}
