package com.example.demo.dao.mapper;

import com.example.demo.model.entity.Card;

public interface CardMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Card record);

    int insertSelective(Card record);

    Card selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Card record);

    int updateByPrimaryKey(Card record);
}