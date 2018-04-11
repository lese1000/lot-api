package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OrderDaoMapper;
import com.example.demo.dao.mapper.OrderMapper;
import com.example.demo.model.entity.Order;
import com.example.demo.service.OrderService;

@Service 
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderMapper orderMapper;
	
	@Autowired
	private OrderDaoMapper orderDaoMapper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return orderMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Order record) {
		// TODO Auto-generated method stub
		return orderMapper.insert(record);
	}

	@Override
	public int insertSelective(Order record) {
		// TODO Auto-generated method stub
		return orderMapper.insertSelective(record);
	}

	@Override
	public Order selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return orderMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Order record) {
		// TODO Auto-generated method stub
		return orderMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Order record) {
		// TODO Auto-generated method stub
		return orderMapper.updateByPrimaryKey(record);
	}

	@Override
	public int insertReturnPrimaryKey(Order record) {
		// TODO Auto-generated method stub
		return orderDaoMapper.insertReturnPrimaryKey(record);
	}

	@Override
	public int insertSelectiveReturnPrimaryKey(Order record) {
		// TODO Auto-generated method stub
		return orderDaoMapper.insertSelectiveReturnPrimaryKey(record);
	}

}
