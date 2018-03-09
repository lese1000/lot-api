package com.example.demo.model.entity;

import java.util.Date;

public class Balance {
    private Long id;

    private Long playerId;

    private Double balanceVal;

    private Date createDate;

    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}