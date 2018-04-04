package com.example.demo.dao;

import com.example.demo.model.entity.Order;

public interface OrderDaoMapper {

    int insertReturnPrimaryKey(Order record);

    int insertSelectiveReturnPrimaryKey(Order record);


}