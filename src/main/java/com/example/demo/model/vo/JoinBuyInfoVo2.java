package com.example.demo.model.vo;

public class JoinBuyInfoVo2 {
	
	private String lotteryTypeName;
	private String lotteryNum;
	
	private String orderNum;
	private Byte orderStatus;
	private Double totalBettingMoney;
	
	private Integer totalPieceNum;
	private Integer remainingPieceNum;
	private Integer leastNum;
	
	private String progress;
	
	private Long orderId;
	private Long joinBuyId;

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

	public Integer getTotalPieceNum() {
		return totalPieceNum;
	}

	public void setTotalPieceNum(Integer totalPieceNum) {
		this.totalPieceNum = totalPieceNum;
	}

	public Integer getRemainingPieceNum() {
		return remainingPieceNum;
	}

	public void setRemainingPieceNum(Integer remainingPieceNum) {
		this.remainingPieceNum = remainingPieceNum;
	}

	public Integer getLeastNum() {
		return leastNum;
	}

	public void setLeastNum(Integer leastNum) {
		this.leastNum = leastNum;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getJoinBuyId() {
		return joinBuyId;
	}

	public void setJoinBuyId(Long joinBuyId) {
		this.joinBuyId = joinBuyId;
	}
	
	
	

}
