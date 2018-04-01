package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.mapper.LotteryTypeMapper;
import com.example.demo.model.entity.LotteryType;
import com.example.demo.service.LotteryTypeService;

@Service
public class LotteryTypeServiceImpl implements LotteryTypeService{
	
	@Autowired
	private LotteryTypeMapper lotteryTypeMapper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return lotteryTypeMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(LotteryType record) {
		// TODO Auto-generated method stub
		return lotteryTypeMapper.insert(record);
	}

	@Override
	public int insertSelective(LotteryType record) {
		// TODO Auto-generated method stub
		return lotteryTypeMapper.insertSelective(record);
	}

	@Override
	public LotteryType selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return lotteryTypeMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(LotteryType record) {
		// TODO Auto-generated method stub
		return lotteryTypeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(LotteryType record) {
		// TODO Auto-generated method stub
		return lotteryTypeMapper.updateByPrimaryKey(record);
	}

}
