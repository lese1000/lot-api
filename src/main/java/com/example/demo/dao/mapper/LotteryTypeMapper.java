package com.example.demo.dao.mapper;

import com.example.demo.model.entity.LotteryType;

public interface LotteryTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LotteryType record);

    int insertSelective(LotteryType record);

    LotteryType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LotteryType record);

    int updateByPrimaryKey(LotteryType record);
}