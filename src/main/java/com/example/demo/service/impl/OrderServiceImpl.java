package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.OrderDaoMapper;
import com.example.demo.dao.mapper.OrderMapper;
import com.example.demo.model.entity.Order;
import com.example.demo.service.OrderService;
import com.github.pagehelper.PageHelper;

@Service 
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderMapper orderMapper;
	
	@Autowired
	private OrderDaoMapper orderDaoMapper;

	@Transactional
	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return orderMapper.deleteByPrimaryKey(id);
	}

	@Transactional
	@Override
	public int insert(Order record) {
		// TODO Auto-generated method stub
		return orderMapper.insert(record);
	}

	@Transactional
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

	@Transactional
	@Override
	public int updateByPrimaryKeySelective(Order record) {
		// TODO Auto-generated method stub
		return orderMapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(Order record) {
		// TODO Auto-generated method stub
		return orderMapper.updateByPrimaryKey(record);
	}

	@Transactional
	@Override
	public int insertReturnPrimaryKey(Order record) {
		// TODO Auto-generated method stub
		return orderDaoMapper.insertReturnPrimaryKey(record);
	}

	@Transactional
	@Override
	public int insertSelectiveReturnPrimaryKey(Order record) {
		// TODO Auto-generated method stub
		return orderDaoMapper.insertSelectiveReturnPrimaryKey(record);
	}

	@Override
	public List<Order> listOrderSelective(Order record, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		return orderDaoMapper.listOrderSelective(record);
	}

}
