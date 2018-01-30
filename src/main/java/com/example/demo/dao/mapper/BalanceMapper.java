package com.example.demo.dao.mapper;

import com.example.demo.model.entity.Balance;

public interface BalanceMapper {
    int deleteByPrimaryKey(Long balanceId);

    int insert(Balance record);

    int insertSelective(Balance record);

    Balance selectByPrimaryKey(Long balanceId);

    int updateByPrimaryKeySelective(Balance record);

    int updateByPrimaryKey(Balance record);
}