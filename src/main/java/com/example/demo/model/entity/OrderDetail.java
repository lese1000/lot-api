package com.example.demo.model.entity;

import java.util.Date;

public class OrderDetail {
    private Long orderDetailId;

    private String bettingNum;

    private Integer bettingCount;

    private Double bettingMoney;

    private Double winPrize;

    private Long playerId;

    private Date createDate;

    public Long getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getBettingNum() {
        return bettingNum;
    }

    public void setBettingNum(String bettingNum) {
        this.bettingNum = bettingNum == null ? null : bettingNum.trim();
    }

    public Integer getBettingCount() {
        return bettingCount;
    }

    public void setBettingCount(Integer bettingCount) {
        this.bettingCount = bettingCount;
    }

    public Double getBettingMoney() {
        return bettingMoney;
    }

    public void setBettingMoney(Double bettingMoney) {
        this.bettingMoney = bettingMoney;
    }

    public Double getWinPrize() {
        return winPrize;
    }

    public void setWinPrize(Double winPrize) {
        this.winPrize = winPrize;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}