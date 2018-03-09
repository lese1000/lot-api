package com.example.demo.model.entity;

import java.util.Date;

public class IntegralRecord {
    private Long id;

    private Byte integralType;

    private Long playerId;

    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getIntegralType() {
        return integralType;
    }

    public void setIntegralType(Byte integralType) {
        this.integralType = integralType;
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