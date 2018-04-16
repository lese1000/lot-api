package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.mapper.CashRecordMapper;
import com.example.demo.model.entity.CashRecord;

public interface CashRecordService extends CashRecordMapper{

	List<CashRecord> listCashRecord(Long playerId, int pageNum, int pageSize);
}
