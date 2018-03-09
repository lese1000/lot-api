package com.example.demo.model.entity;

import java.util.Date;

public class RechargeRecord {
    private Long id;

    private Long playerId;

    private String fullName;

    private String payAccount;

    private String payTypeId;

    private Double rechargeVal;

    private Date createDate;

    private Date updateDate;

    private Byte status;

    private String auditor;

    private Date auditTime;

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount == null ? null : payAccount.trim();
    }

    public String getPayTypeId() {
        return payTypeId;
    }

    public void setPayTypeId(String payTypeId) {
        this.payTypeId = payTypeId == null ? null : payTypeId.trim();
    }

    public Double getRechargeVal() {
        return rechargeVal;
    }

    public void setRechargeVal(Double rechargeVal) {
        this.rechargeVal = rechargeVal;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }
}