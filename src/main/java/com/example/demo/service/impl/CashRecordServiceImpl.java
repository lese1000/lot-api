package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.mapper.CashRecordMapper;
import com.example.demo.model.entity.CashRecord;
import com.example.demo.service.CashRecordService;

@Service 
public class CashRecordServiceImpl implements CashRecordService{
	
	@Autowired
	private CashRecordMapper cashRecordMapper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return cashRecordMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(CashRecord record) {
		// TODO Auto-generated method stub
		return cashRecordMapper.insert(record);
	}

	@Override
	public int insertSelective(CashRecord record) {
		// TODO Auto-generated method stub
		return cashRecordMapper.insertSelective(record);
	}

	@Override
	public CashRecord selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return cashRecordMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(CashRecord record) {
		// TODO Auto-generated method stub
		return cashRecordMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CashRecord record) {
		// TODO Auto-generated method stub
		return cashRecordMapper.updateByPrimaryKey(record);
	}

}
