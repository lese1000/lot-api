package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.entity.JoinBuy;

public interface JoinBuyDaoMapper {

	int insertReturnPrimaryKey(JoinBuy joinBuy);
	
	int insertSelectiveReturnPrimaryKey(JoinBuy joinBuy);
	
	List<JoinBuy> listJoinBuy(JoinBuy joinBuy);
}
