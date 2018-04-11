package com.example.demo.dao;

import org.apache.ibatis.annotations.Param;

import com.example.demo.model.entity.LotteryNum;

public interface LotteryNumDaoMapper {

	LotteryNum getNewestLotteryNum(@Param(value="lotteryTypeId")Long lotteryTypeId);
}
