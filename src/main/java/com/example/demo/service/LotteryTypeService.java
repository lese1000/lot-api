package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.mapper.LotteryTypeMapper;
import com.example.demo.model.entity.LotteryType;

public interface LotteryTypeService extends LotteryTypeMapper{
	
	List<LotteryType> listLotteryTypeSelective(LotteryType entity);

}
