package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.mapper.BalanceRecordMapper;
import com.example.demo.model.entity.BalanceRecord;

public interface BalanceRecordService extends BalanceRecordMapper   {
	
	List<BalanceRecord> listBalanceRecord(Long playerId, int pageNum, int pageSize);
}
