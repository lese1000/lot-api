package com.example.demo.dao.mapper;

import com.example.demo.model.entity.LotteryNum;
import com.example.demo.model.entity.LotteryNumKey;

public interface LotteryNumMapper {
    int deleteByPrimaryKey(LotteryNumKey key);

    int insert(LotteryNum record);

    int insertSelective(LotteryNum record);

    LotteryNum selectByPrimaryKey(LotteryNumKey key);

    int updateByPrimaryKeySelective(LotteryNum record);

    int updateByPrimaryKey(LotteryNum record);
}