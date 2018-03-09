package com.example.demo.dao.mapper;

import com.example.demo.model.entity.LotteryNum;

public interface LotteryNumMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LotteryNum record);

    int insertSelective(LotteryNum record);

    LotteryNum selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LotteryNum record);

    int updateByPrimaryKey(LotteryNum record);
}