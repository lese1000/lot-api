package com.example.demo.dao.mapper;

import com.example.demo.model.entity.JoinBuy;

public interface JoinBuyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(JoinBuy record);

    int insertSelective(JoinBuy record);

    JoinBuy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(JoinBuy record);

    int updateByPrimaryKey(JoinBuy record);
}