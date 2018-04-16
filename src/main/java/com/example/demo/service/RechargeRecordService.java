package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.mapper.RechargeRecordMapper;
import com.example.demo.model.entity.RechargeRecord;

public interface RechargeRecordService extends RechargeRecordMapper {

	List<RechargeRecord> listRechargeRecord(Long playerId, int pageNum, int pageSize);
}
