package com.example.demo.model.entity;

import java.util.Date;

public class BalanceRecord {
    private Long balanceRecordId;

    private Byte balanceType;

    private Long orderId;

    private Long playerId;

    private Double balanceVal;

    private Date createDate;

    public Long getBalanceRecordId() {
        return balanceRecordId;
    }

    public void setBalanceRecordId(Long balanceRecordId) {
        this.balanceRecordId = balanceRecordId;
    }

    public Byte getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(Byte balanceType) {
        this.balanceType = balanceType;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Double getBalanceVal() {
        return balanceVal;
    }

    public void setBalanceVal(Double balanceVal) {
        this.balanceVal = balanceVal;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}