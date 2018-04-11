package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.mapper.JoinBuyMapper;
import com.example.demo.model.entity.JoinBuy;

public interface JoinBuyService extends JoinBuyMapper{

	int insertReturnPrimaryKey(JoinBuy joinBuy);
	
	int insertSelectiveReturnPrimaryKey(JoinBuy joinBuy);
	
	List<JoinBuy> listJoinBuy(JoinBuy joinBuy, int pageNum, int pageSize);
}
