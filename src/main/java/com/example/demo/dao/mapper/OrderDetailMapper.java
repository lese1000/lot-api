package com.example.demo.dao.mapper;

import com.example.demo.model.entity.OrderDetail;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(Long orderDetailId);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Long orderDetailId);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}