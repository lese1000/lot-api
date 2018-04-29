package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.CashRecordDaoMapper;
import com.example.demo.dao.mapper.CashRecordMapper;
import com.example.demo.model.entity.CashRecord;
import com.example.demo.service.CashRecordService;
import com.github.pagehelper.PageHelper;

@Service 
public class CashRecordServiceImpl implements CashRecordService{
	
	@Autowired
	private CashRecordMapper cashRecordMapper;
	@Autowired
	private CashRecordDaoMapper cashRecordDaoMapper;

	@Transactional
	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return cashRecordMapper.deleteByPrimaryKey(id);
	}

	@Transactional
	@Override
	public int insert(CashRecord record) {
		// TODO Auto-generated method stub
		return cashRecordMapper.insert(record);
	}

	@Transactional
	@Override
	public int insertSelective(CashRecord record) {
		// TODO Auto-generated method stub
		return cashRecordMapper.insertSelective(record);
	}

	@Override
	public CashRecord selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return cashRecordMapper.selectByPrimaryKey(id);
	}

	@Transactional
	@Override
	public int updateByPrimaryKeySelective(CashRecord record) {
		// TODO Auto-generated method stub
		return cashRecordMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CashRecord record) {
		// TODO Auto-generated method stub
		return cashRecordMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<CashRecord> listCashRecord(Long playerId, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		return cashRecordDaoMapper.listCashRecord(playerId);
	}

}
