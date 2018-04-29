package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.RechargeRecordDaoMapper;
import com.example.demo.dao.mapper.RechargeRecordMapper;
import com.example.demo.model.entity.RechargeRecord;
import com.example.demo.service.RechargeRecordService;
import com.github.pagehelper.PageHelper;

@Service
public class RechargeRecordServiceImpl implements RechargeRecordService{
	
	@Autowired
	private RechargeRecordMapper rechargeRecordMapper;
	@Autowired
	private RechargeRecordDaoMapper rechargeRecordDaoMapper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return rechargeRecordMapper.deleteByPrimaryKey(id);
	}

	@Transactional
	@Override
	public int insert(RechargeRecord record) {
		// TODO Auto-generated method stub
		return rechargeRecordMapper.insert(record);
	}

	@Transactional
	@Override
	public int insertSelective(RechargeRecord record) {
		// TODO Auto-generated method stub
		return rechargeRecordMapper.insertSelective(record);
	}

	@Override
	public RechargeRecord selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return rechargeRecordMapper.selectByPrimaryKey(id);
	}

	@Transactional
	@Override
	public int updateByPrimaryKeySelective(RechargeRecord record) {
		// TODO Auto-generated method stub
		return rechargeRecordMapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(RechargeRecord record) {
		// TODO Auto-generated method stub
		return rechargeRecordMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<RechargeRecord> listRechargeRecord(Long playerId, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		return rechargeRecordDaoMapper.listRechargeRecord(playerId);
	}

}
