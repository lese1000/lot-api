package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.mapper.ReceivablesInfoMapper;
import com.example.demo.model.entity.ReceivablesInfo;
import com.example.demo.service.ReceivablesInfoService;

@Service
public class ReceivablesInfoServiceImpl implements ReceivablesInfoService {
	
	@Autowired
	private ReceivablesInfoMapper receivablesInfoMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return receivablesInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(ReceivablesInfo record) {
		// TODO Auto-generated method stub
		return receivablesInfoMapper.insert(record);
	}

	@Override
	public int insertSelective(ReceivablesInfo record) {
		// TODO Auto-generated method stub
		return receivablesInfoMapper.insertSelective(record);
	}

	@Override
	public ReceivablesInfo selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return receivablesInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(ReceivablesInfo record) {
		// TODO Auto-generated method stub
		return receivablesInfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ReceivablesInfo record) {
		// TODO Auto-generated method stub
		return receivablesInfoMapper.updateByPrimaryKey(record);
	}

}
