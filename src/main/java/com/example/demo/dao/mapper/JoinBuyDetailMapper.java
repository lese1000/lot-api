package com.example.demo.dao.mapper;

import com.example.demo.model.entity.JoinBuyDetail;

public interface JoinBuyDetailMapper {
    int deleteByPrimaryKey(Long joinBuyDetailId);

    int insert(JoinBuyDetail record);

    int insertSelective(JoinBuyDetail record);

    JoinBuyDetail selectByPrimaryKey(Long joinBuyDetailId);

    int updateByPrimaryKeySelective(JoinBuyDetail record);

    int updateByPrimaryKey(JoinBuyDetail record);
}