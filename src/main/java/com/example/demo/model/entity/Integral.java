package com.example.demo.model.entity;

import java.util.Date;

public class Integral {
    private Long integralId;

    private Double integralVal;

    private Date createDate;

    private Date updateDate;

    private Long playerId;

    public Long getIntegralId() {
        return integralId;
    }

    public void setIntegralId(Long integralId) {
        this.integralId = integralId;
    }

    public Double getIntegralVal() {
        return integralVal;
    }

    public void setIntegralVal(Double integralVal) {
        this.integralVal = integralVal;
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

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }
}