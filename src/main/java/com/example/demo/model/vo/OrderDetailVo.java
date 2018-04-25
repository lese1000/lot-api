package com.example.demo.model.vo;

import java.util.List;

import com.example.demo.model.entity.OrderDetail;

public class OrderDetailVo {
	private String lotteryTypeName;
	private String lotteryNum;
	
	private String orderNum;
	private Byte orderStatus;
	private Double totalBettingMoney;
	
	private Long joinBuyId;
	
	private String winNum;
	
	private List<OrderDetail> orderDetailList;

	public String getLotteryTypeName() {
		return lotteryTypeName;
	}

	public void setLotteryTypeName(String lotteryTypeName) {
		this.lotteryTypeName = lotteryTypeName;
	}

	public String getLotteryNum() {
		return lotteryNum;
	}

	public void setLotteryNum(String lotteryNum) {
		this.lotteryNum = lotteryNum;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public Byte getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Byte orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Double getTotalBettingMoney() {
		return totalBettingMoney;
	}

	public void setTotalBettingMoney(Double totalBettingMoney) {
		this.totalBettingMoney = totalBettingMoney;
	}

	public Long getJoinBuyId() {
		return joinBuyId;
	}

	public void setJoinBuyId(Long joinBuyId) {
		this.joinBuyId = joinBuyId;
	}

	public List<OrderDetail> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<OrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}

	public String getWinNum() {
		return winNum;
	}

	public void setWinNum(String winNum) {
		this.winNum = winNum;
	}
	
	


    
    

}
