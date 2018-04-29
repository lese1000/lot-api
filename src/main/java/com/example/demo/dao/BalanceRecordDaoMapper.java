package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.model.entity.BalanceRecord;

public interface BalanceRecordDaoMapper {

	List<BalanceRecord> listBalanceRecord(@Param("playerId") Long playerId);
}
