package com.example.demo.dao.mapper;

import com.example.demo.model.entity.LotteryRule;

public interface LotteryRuleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LotteryRule record);

    int insertSelective(LotteryRule record);

    LotteryRule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LotteryRule record);

    int updateByPrimaryKey(LotteryRule record);
}