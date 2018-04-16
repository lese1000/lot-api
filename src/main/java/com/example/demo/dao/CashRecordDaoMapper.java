package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.entity.CashRecord;

public interface CashRecordDaoMapper {

	List<CashRecord> listCashRecord(Long playerId);
}
