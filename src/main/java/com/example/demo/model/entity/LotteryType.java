package com.example.demo.model.entity;

import java.util.Date;

public class LotteryType {
    private Long lotteryTypeId;

    private Long ruleId;

    private String lotteryTypeName;

    private Date createDate;

    public Long getLotteryTypeId() {
        return lotteryTypeId;
    }

    public void setLotteryTypeId(Long lotteryTypeId) {
        this.lotteryTypeId = lotteryTypeId;
    }

    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public String getLotteryTypeName() {
        return lotteryTypeName;
    }

    public void setLotteryTypeName(String lotteryTypeName) {
        this.lotteryTypeName = lotteryTypeName == null ? null : lotteryTypeName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}