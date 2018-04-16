package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.mapper.OrderMapper;
import com.example.demo.model.entity.Order;

public interface OrderService extends OrderMapper{

	 int insertReturnPrimaryKey(Order record);

	 int insertSelectiveReturnPrimaryKey(Order record);
	 
	 List<Order> listOrderSelective(Order record, int pageNum, int pageSize);
}
