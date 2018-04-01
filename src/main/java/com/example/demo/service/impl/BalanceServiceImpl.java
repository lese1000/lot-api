package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BalanceDaoMapper;
import com.example.demo.dao.mapper.BalanceMapper;
import com.example.demo.model.entity.Balance;
import com.example.demo.service.BalanceService;

@Service
public class BalanceServiceImpl implements BalanceService{
	
	@Autowired
	private BalanceDaoMapper balanceDaoMapper;
	@Autowired
	private BalanceMapper balanceMapper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return balanceMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Balance record) {
		// TODO Auto-generated method stub
		return balanceMapper.insert(record);
	}

	@Override
	public int insertSelective(Balance record) {
		// TODO Auto-generated method stub
		return balanceMapper.insertSelective(record);
	}

	@Override
	public Balance selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return balanceMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Balance record) {
		// TODO Auto-generated method stub
		return balanceMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Balance record) {
		// TODO Auto-generated method stub
		return balanceMapper.updateByPrimaryKey(record);
	}

	@Override
	public Balance getBalanceByPlayerId(Long playerId) {
		// TODO Auto-generated method stub
		return balanceDaoMapper.getBalanceByPlayerId(playerId);
	}

}
