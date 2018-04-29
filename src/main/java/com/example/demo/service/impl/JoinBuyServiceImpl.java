package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.JoinBuyDaoMapper;
import com.example.demo.dao.mapper.JoinBuyMapper;
import com.example.demo.model.entity.JoinBuy;
import com.example.demo.service.JoinBuyService;
import com.github.pagehelper.PageHelper;

@Service 
public class JoinBuyServiceImpl implements JoinBuyService{

	@Autowired
	private JoinBuyMapper joinBuyMapper;
	
	@Autowired
	private JoinBuyDaoMapper joinBuyDaoMapper;
	
	@Transactional
	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return joinBuyMapper.deleteByPrimaryKey(id);
	}

	@Transactional
	@Override
	public int insert(JoinBuy record) {
		// TODO Auto-generated method stub
		return joinBuyMapper.insert(record);
	}

	@Transactional
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

	@Transactional
	@Override
	public int updateByPrimaryKeySelective(JoinBuy record) {
		// TODO Auto-generated method stub
		return joinBuyMapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(JoinBuy record) {
		// TODO Auto-generated method stub
		return joinBuyMapper.updateByPrimaryKey(record);
	}

	@Override
	public int insertReturnPrimaryKey(JoinBuy joinBuy) {
		// TODO Auto-generated method stub
		return joinBuyDaoMapper.insertReturnPrimaryKey(joinBuy);
	}

	@Transactional
	@Override
	public int insertSelectiveReturnPrimaryKey(JoinBuy joinBuy) {
		// TODO Auto-generated method stub
		return joinBuyDaoMapper.insertSelectiveReturnPrimaryKey(joinBuy);
	}

	@Override
	public List<JoinBuy> listJoinBuy(JoinBuy joinBuy, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return joinBuyDaoMapper.listJoinBuy(joinBuy);
	}

}
