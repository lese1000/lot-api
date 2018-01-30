package com.example.demo.dao.mapper;

import com.example.demo.model.entity.Card;

public interface CardMapper {
    int deleteByPrimaryKey(Long cardId);

    int insert(Card record);

    int insertSelective(Card record);

    Card selectByPrimaryKey(Long cardId);

    int updateByPrimaryKeySelective(Card record);

    int updateByPrimaryKey(Card record);
}