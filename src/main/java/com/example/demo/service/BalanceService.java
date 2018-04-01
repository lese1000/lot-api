package com.example.demo.service;

import org.apache.ibatis.annotations.Param;

import com.example.demo.dao.mapper.BalanceMapper;
import com.example.demo.model.entity.Balance;

public interface BalanceService extends BalanceMapper{

	Balance getBalanceByPlayerId(@Param("playerId") Long playerId);
}
