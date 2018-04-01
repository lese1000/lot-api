package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.mapper.IntegralMapper;
import com.example.demo.model.entity.Integral;
import com.example.demo.service.IntegralService;


@Service
public class IntegralServiceImpl implements IntegralService{
	
	@Autowired
	private IntegralMapper integralMapper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return integralMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Integral record) {
		// TODO Auto-generated method stub
		return integralMapper.insert(record);
	}

	@Override
	public int insertSelective(Integral record) {
		// TODO Auto-generated method stub
		return integralMapper.insertSelective(record);
	}

	@Override
	public Integral selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return integralMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Integral record) {
		// TODO Auto-generated method stub
		return integralMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Integral record) {
		// TODO Auto-generated method stub
		return integralMapper.updateByPrimaryKey(record);
	}

}
