package com.example.demo.dao.mapper;

import com.example.demo.model.entity.IntegralRecord;

public interface IntegralRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(IntegralRecord record);

    int insertSelective(IntegralRecord record);

    IntegralRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IntegralRecord record);

    int updateByPrimaryKey(IntegralRecord record);
}