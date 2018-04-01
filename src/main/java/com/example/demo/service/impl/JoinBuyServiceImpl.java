package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.mapper.JoinBuyMapper;
import com.example.demo.model.entity.JoinBuy;
import com.example.demo.service.JoinBuyService;

@Service 
public class JoinBuyServiceImpl implements JoinBuyService{

	@Autowired
	private JoinBuyMapper joinBuyMapper;
	
	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return joinBuyMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(JoinBuy record) {
		// TODO Auto-generated method stub
		return joinBuyMapper.insert(record);
	}

	@Override
	public int insertSelective(JoinBuy record) {
		// TODO Auto-generated method stub
		return joinBuyMapper.insertSelective(record);
	}

	@Override
	public JoinBuy selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return joinBuyMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(JoinBuy record) {
		// TODO Auto-generated method stub
		return joinBuyMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(JoinBuy record) {
		// TODO Auto-generated method stub
		return joinBuyMapper.updateByPrimaryKey(record);
	}

}
