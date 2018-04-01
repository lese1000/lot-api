package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.mapper.LotteryRuleMapper;
import com.example.demo.model.entity.LotteryRule;
import com.example.demo.service.LotteryRuleService;

@Service 
public class LotteryRuleServiceImpl implements LotteryRuleService{
	
	@Autowired
	private LotteryRuleMapper lotteryRuleMapper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return lotteryRuleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(LotteryRule record) {
		// TODO Auto-generated method stub
		return lotteryRuleMapper.insert(record);
	}

	@Override
	public int insertSelective(LotteryRule record) {
		// TODO Auto-generated method stub
		return lotteryRuleMapper.insertSelective(record);
	}

	@Override
	public LotteryRule selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return lotteryRuleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(LotteryRule record) {
		// TODO Auto-generated method stub
		return lotteryRuleMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(LotteryRule record) {
		// TODO Auto-generated method stub
		return lotteryRuleMapper.updateByPrimaryKey(record);
	}

}
