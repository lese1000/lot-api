package com.example.demo.dao.mapper;

import com.example.demo.model.entity.LoginRecord;

public interface LoginRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LoginRecord record);

    int insertSelective(LoginRecord record);

    LoginRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LoginRecord record);

    int updateByPrimaryKey(LoginRecord record);
}