package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.mapper.LoginRecordMapper;
import com.example.demo.model.entity.LoginRecord;
import com.example.demo.service.LoginRecordService;

@Service
public class LoginRecordServiceImpl implements LoginRecordService{
	
	@Autowired
	private LoginRecordMapper loginRecordMapper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return loginRecordMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(LoginRecord record) {
		// TODO Auto-generated method stub
		return loginRecordMapper.insert(record);
	}

	@Override
	public int insertSelective(LoginRecord record) {
		// TODO Auto-generated method stub
		return loginRecordMapper.insertSelective(record);
	}

	@Override
	public LoginRecord selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return loginRecordMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(LoginRecord record) {
		// TODO Auto-generated method stub
		return loginRecordMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(LoginRecord record) {
		// TODO Auto-generated method stub
		return loginRecordMapper.updateByPrimaryKey(record);
	}

}
