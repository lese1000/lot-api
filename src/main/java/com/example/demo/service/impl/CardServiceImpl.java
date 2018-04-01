package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.mapper.CardMapper;
import com.example.demo.model.entity.Card;
import com.example.demo.service.CardService;

@Service
public class CardServiceImpl implements CardService{
	
	@Autowired
	private CardMapper cardMapper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return cardMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Card record) {
		// TODO Auto-generated method stub
		return cardMapper.insert(record);
	}

	@Override
	public int insertSelective(Card record) {
		// TODO Auto-generated method stub
		return cardMapper.insertSelective(record);
	}

	@Override
	public Card selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return cardMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Card record) {
		// TODO Auto-generated method stub
		return cardMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Card record) {
		// TODO Auto-generated method stub
		return cardMapper.updateByPrimaryKey(record);
	}

}
