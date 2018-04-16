package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.entity.RechargeRecord;

public interface RechargeRecordDaoMapper {

	List<RechargeRecord> listRechargeRecord(Long playerId);
}
