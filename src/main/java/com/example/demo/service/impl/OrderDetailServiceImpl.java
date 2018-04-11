package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OrderDetailDaoMapper;
import com.example.demo.dao.mapper.OrderDetailMapper;
import com.example.demo.model.entity.OrderDetail;
import com.example.demo.service.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService{
	
	@Autowired
	private OrderDetailMapper orderDetailMapper;
	
	@Autowired
	private OrderDetailDaoMapper orderDetailDaoMapper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return orderDetailMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(OrderDetail record) {
		// TODO Auto-generated method stub
		return orderDetailMapper.insert(record);
	}

	@Override
	public int insertSelective(OrderDetail record) {
		// TODO Auto-generated method stub
		return orderDetailMapper.insertSelective(record);
	}

	@Override
	public OrderDetail selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return orderDetailMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(OrderDetail record) {
		// TODO Auto-generated method stub
		return orderDetailMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(OrderDetail record) {
		// TODO Auto-generated method stub
		return orderDetailMapper.updateByPrimaryKey(record);
	}

	@Override
	public int batchInsert(List<OrderDetail> orderDetailList) {
		// TODO Auto-generated method stub
		return orderDetailDaoMapper.batchInsert(orderDetailList);
	}

}
