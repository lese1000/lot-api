package com.example.demo.model.entity;

import java.util.Date;

public class Order {
    private Long orderId;

    private String orderNum;

    private Long lotteryNumId;

    private Integer playerId;

    private Byte isJoinBuy;

    private Byte orderStatus;

    private Date createTime;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public Long getLotteryNumId() {
        return lotteryNumId;
    }

    public void setLotteryNumId(Long lotteryNumId) {
        this.lotteryNumId = lotteryNumId;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Byte getIsJoinBuy() {
        return isJoinBuy;
    }

    public void setIsJoinBuy(Byte isJoinBuy) {
        this.isJoinBuy = isJoinBuy;
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}