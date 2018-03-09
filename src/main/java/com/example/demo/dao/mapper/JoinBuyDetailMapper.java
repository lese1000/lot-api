package com.example.demo.dao.mapper;

import com.example.demo.model.entity.JoinBuyDetail;

public interface JoinBuyDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(JoinBuyDetail record);

    int insertSelective(JoinBuyDetail record);

    JoinBuyDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(JoinBuyDetail record);

    int updateByPrimaryKey(JoinBuyDetail record);
}