package com.example.demo.dao;

import org.apache.ibatis.annotations.Param;

import com.example.demo.model.entity.Balance;

public interface BalanceDaoMapper {
	
	Balance getBalanceByPlayerId(@Param("playerId") Long playerId);
}
