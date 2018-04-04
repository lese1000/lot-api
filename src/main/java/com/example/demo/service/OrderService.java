package com.example.demo.service;

import com.example.demo.dao.mapper.OrderMapper;
import com.example.demo.model.entity.Order;

public interface OrderService extends OrderMapper{

	 int insertReturnPrimaryKey(Order record);

	 int insertSelectiveReturnPrimaryKey(Order record);
}
