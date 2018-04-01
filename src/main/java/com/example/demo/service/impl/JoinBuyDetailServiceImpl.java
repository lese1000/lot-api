package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.mapper.JoinBuyDetailMapper;
import com.example.demo.model.entity.JoinBuyDetail;
import com.example.demo.service.JoinBuyDetailService;

@Service
public class JoinBuyDetailServiceImpl implements JoinBuyDetailService{

	@Autowired
	private JoinBuyDetailMapper joinBuyDetailMapper;
	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return joinBuyDetailMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(JoinBuyDetail record) {
		// TODO Auto-generated method stub
		return joinBuyDetailMapper.insert(record);
	}

	@Override
	public int insertSelective(JoinBuyDetail record) {
		// TODO Auto-generated method stub
		return joinBuyDetailMapper.insertSelective(record);
	}

	@Override
	public JoinBuyDetail selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return joinBuyDetailMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(JoinBuyDetail record) {
		// TODO Auto-generated method stub
		return joinBuyDetailMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(JoinBuyDetail record) {
		// TODO Auto-generated method stub
		return joinBuyDetailMapper.updateByPrimaryKey(record);
	}

}
