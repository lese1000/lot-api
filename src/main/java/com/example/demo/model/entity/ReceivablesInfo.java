package com.example.demo.model.entity;

import java.util.Date;

public class ReceivablesInfo {
    private Integer receivablesInfoId;

    private String bank;

    private String fullName;

    private String openingBank;

    private String account;

    private Byte useImg;

    private String imgUrl;

    private Byte type;

    private Long createUser;

    private Long updateUser;

    private Date updateDate;

    private Date createDate;

    public Integer getReceivablesInfoId() {
        return receivablesInfoId;
    }

    public void setReceivablesInfoId(Integer receivablesInfoId) {
        this.receivablesInfoId = receivablesInfoId;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public String getOpeningBank() {
        return openingBank;
    }

    public void setOpeningBank(String openingBank) {
        this.openingBank = openingBank == null ? null : openingBank.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public Byte getUseImg() {
        return useImg;
    }

    public void setUseImg(Byte useImg) {
        this.useImg = useImg;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}