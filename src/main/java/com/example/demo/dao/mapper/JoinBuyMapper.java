package com.example.demo.dao.mapper;

import com.example.demo.model.entity.JoinBuy;

public interface JoinBuyMapper {
    int deleteByPrimaryKey(Long joinBuyId);

    int insert(JoinBuy record);

    int insertSelective(JoinBuy record);

    JoinBuy selectByPrimaryKey(Long joinBuyId);

    int updateByPrimaryKeySelective(JoinBuy record);

    int updateByPrimaryKey(JoinBuy record);
}