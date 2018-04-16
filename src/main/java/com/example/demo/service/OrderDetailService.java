package com.example.demo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.dao.mapper.OrderDetailMapper;
import com.example.demo.model.entity.OrderDetail;

public interface OrderDetailService extends OrderDetailMapper{
	
	int batchInsert(@Param(value="orderDetailList") List<OrderDetail> orderDetailList);
	
	List<OrderDetail> listOrderDetailByOrderId(Long orderId);

}
