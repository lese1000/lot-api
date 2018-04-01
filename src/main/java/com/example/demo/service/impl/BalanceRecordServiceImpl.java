package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.mapper.BalanceRecordMapper;
import com.example.demo.model.entity.BalanceRecord;
import com.example.demo.service.BalanceRecordService;

@Service
public class BalanceRecordServiceImpl implements BalanceRecordService {
	@Autowired
	private BalanceRecordMapper balanceRecordMapper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return balanceRecordMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(BalanceRecord record) {
		// TODO Auto-generated method stub
		return balanceRecordMapper.insert(record);
	}

	@Override
	public int insertSelective(BalanceRecord record) {
		// TODO Auto-generated method stub
		return balanceRecordMapper.insertSelective(record);
	}

	@Override
	public BalanceRecord selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return balanceRecordMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(BalanceRecord record) {
		// TODO Auto-generated method stub
		return balanceRecordMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(BalanceRecord record) {
		// TODO Auto-generated method stub
		return balanceRecordMapper.updateByPrimaryKey(record);
	}

}
