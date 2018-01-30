package com.example.demo.dao.mapper;

import com.example.demo.model.entity.LoginRecord;

public interface LoginRecordMapper {
    int deleteByPrimaryKey(Long loginId);

    int insert(LoginRecord record);

    int insertSelective(LoginRecord record);

    LoginRecord selectByPrimaryKey(Long loginId);

    int updateByPrimaryKeySelective(LoginRecord record);

    int updateByPrimaryKey(LoginRecord record);
}