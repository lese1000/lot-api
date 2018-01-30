package com.example.demo.dao.mapper;

import com.example.demo.model.entity.BalanceRecord;

public interface BalanceRecordMapper {
    int deleteByPrimaryKey(Long balanceRecordId);

    int insert(BalanceRecord record);

    int insertSelective(BalanceRecord record);

    BalanceRecord selectByPrimaryKey(Long balanceRecordId);

    int updateByPrimaryKeySelective(BalanceRecord record);

    int updateByPrimaryKey(BalanceRecord record);
}