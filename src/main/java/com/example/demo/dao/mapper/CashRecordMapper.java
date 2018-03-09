package com.example.demo.dao.mapper;

import com.example.demo.model.entity.CashRecord;

public interface CashRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CashRecord record);

    int insertSelective(CashRecord record);

    CashRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CashRecord record);

    int updateByPrimaryKey(CashRecord record);
}