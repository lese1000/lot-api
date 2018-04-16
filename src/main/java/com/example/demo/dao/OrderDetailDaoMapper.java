package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.model.entity.OrderDetail;

public interface OrderDetailDaoMapper {
   
	int batchInsert(@Param(value="orderDetailList") List<OrderDetail> orderDetailList);
	
	List<OrderDetail> listOrderDetailByOrderId(@Param("orderId")Long orderId);
}