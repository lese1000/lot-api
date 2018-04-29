package com.example.demo.dao.mapper;

import com.example.demo.model.entity.AcContent;

public interface AcContentMapper {
    int deleteByPrimaryKey(String id);

    int insert(AcContent record);

    int insertSelective(AcContent record);

    AcContent selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AcContent record);

    int updateByPrimaryKeyWithBLOBs(AcContent record);

    int updateByPrimaryKey(AcContent record);
}