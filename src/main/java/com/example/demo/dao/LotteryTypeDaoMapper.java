package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.entity.LotteryType;

public interface LotteryTypeDaoMapper {

	List<LotteryType> listLotteryTypeSelective(LotteryType entity);
}
