package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.LotteryNumDaoMapper;
import com.example.demo.dao.mapper.LotteryNumMapper;
import com.example.demo.model.entity.LotteryNum;
import com.example.demo.service.LotteryNumService;

@Service
public class LotteryNumServiceImpl implements LotteryNumService{

	@Autowired
	private LotteryNumMapper lotteryNumMapper;
	
	@Autowired
	private LotteryNumDaoMapper lotteryNumDaoMapper;
	
	@Transactional
	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return lotteryNumMapper.deleteByPrimaryKey(id);
	}

	@Transactional
	@Override
	public int insert(LotteryNum record) {
		// TODO Auto-generated method stub
		return lotteryNumMapper.insert(record);
	}

	@Transactional
	@Override
	public int insertSelective(LotteryNum record) {
		// TODO Auto-generated method stub
		return lotteryNumMapper.insertSelective(record);
	}

	@Override
	public LotteryNum selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return lotteryNumMapper.selectByPrimaryKey(id);
	}

	@Transactional
	@Override
	public int updateByPrimaryKeySelective(LotteryNum record) {
		// TODO Auto-generated method stub
		return lotteryNumMapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(LotteryNum record) {
		// TODO Auto-generated method stub
		return lotteryNumMapper.updateByPrimaryKey(record);
	}

	@Override
	public LotteryNum getNewestLotteryNum(Long lotteryTypeId) {
		// TODO Auto-generated method stub
		return lotteryNumDaoMapper.getNewestLotteryNum(lotteryTypeId);
	}

}
