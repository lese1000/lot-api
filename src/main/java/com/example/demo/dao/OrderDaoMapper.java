package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.entity.Order;

public interface OrderDaoMapper {

    int insertReturnPrimaryKey(Order record);

    int insertSelectiveReturnPrimaryKey(Order record);
    
    List<Order> listOrderSelective(Order record);


}