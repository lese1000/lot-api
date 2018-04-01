package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.mapper.IntegralRecordMapper;
import com.example.demo.model.entity.IntegralRecord;
import com.example.demo.service.IntegralRecordService;

@Service
public class IntegralRecordServiceImpl implements IntegralRecordService{

	@Autowired
	private IntegralRecordMapper integralRecordMapper;
	
	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return integralRecordMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(IntegralRecord record) {
		// TODO Auto-generated method stub
		return integralRecordMapper.insert(record);
	}

	@Override
	public int insertSelective(IntegralRecord record) {
		// TODO Auto-generated method stub
		return integralRecordMapper.insertSelective(record);
	}

	@Override
	public IntegralRecord selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return integralRecordMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(IntegralRecord record) {
		// TODO Auto-generated method stub
		return integralRecordMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(IntegralRecord record) {
		// TODO Auto-generated method stub
		return integralRecordMapper.updateByPrimaryKey(record);
	}

}
