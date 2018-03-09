package com.example.demo.dao.mapper;

import com.example.demo.model.entity.RechargeRecord;

public interface RechargeRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RechargeRecord record);

    int insertSelective(RechargeRecord record);

    RechargeRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RechargeRecord record);

    int updateByPrimaryKey(RechargeRecord record);
}