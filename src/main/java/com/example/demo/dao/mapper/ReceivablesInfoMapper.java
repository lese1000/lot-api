package com.example.demo.dao.mapper;

import com.example.demo.model.entity.ReceivablesInfo;

public interface ReceivablesInfoMapper {
    int deleteByPrimaryKey(Integer receivablesInfoId);

    int insert(ReceivablesInfo record);

    int insertSelective(ReceivablesInfo record);

    ReceivablesInfo selectByPrimaryKey(Integer receivablesInfoId);

    int updateByPrimaryKeySelective(ReceivablesInfo record);

    int updateByPrimaryKey(ReceivablesInfo record);
}