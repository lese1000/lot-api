package com.example.demo.service;

import com.example.demo.dao.mapper.LotteryNumMapper;
import com.example.demo.model.entity.LotteryNum;

public interface LotteryNumService extends LotteryNumMapper{
	
	LotteryNum getNewestLotteryNum(Long lotteryTypeId);

}
