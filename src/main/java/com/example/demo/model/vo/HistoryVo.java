package com.example.demo.model.vo;

import java.util.Date;
import java.util.List;

import com.example.demo.model.entity.OrderDetail;

public class HistoryVo {

	private String lotteryTypeName;
	private String lotteryNum;
	
	private String orderNum;
	private Byte orderStatus;
	private Double totalBettingMoney;
	private Double totalWinMoney;
	
	private Date createDate;
	
	private Long joinBuyId;
	private Long orderId;
	
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
	public Double getTotalWinMoney() {
		return totalWinMoney;
	}
	public void setTotalWinMoney(Double totalWinMoney) {
		this.totalWinMoney = totalWinMoney;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Long getJoinBuyId() {
		return joinBuyId;
	}
	public void setJoinBuyId(Long joinBuyId) {
		this.joinBuyId = joinBuyId;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public List<OrderDetail> getOrderDetailList() {
		return orderDetailList;
	}
	public void setOrderDetailList(List<OrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
	
	
	
}
