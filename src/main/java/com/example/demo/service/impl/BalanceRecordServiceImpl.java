package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.BalanceRecordDaoMapper;
import com.example.demo.dao.mapper.BalanceRecordMapper;
import com.example.demo.model.entity.BalanceRecord;
import com.example.demo.service.BalanceRecordService;
import com.github.pagehelper.PageHelper;

@Service
public class BalanceRecordServiceImpl implements BalanceRecordService {
	@Autowired
	private BalanceRecordMapper balanceRecordMapper;
	@Autowired
	private BalanceRecordDaoMapper balanceRecordDaoMapper;

	@Transactional
	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return balanceRecordMapper.deleteByPrimaryKey(id);
	}

	@Transactional
	@Override
	public int insert(BalanceRecord record) {
		// TODO Auto-generated method stub
		return balanceRecordMapper.insert(record);
	}

	@Transactional
	@Override
	public int insertSelective(BalanceRecord record) {
		// TODO Auto-generated method stub
		return balanceRecordMapper.insertSelective(record);
	}

	@Override
	public BalanceRecord selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return balanceRecordMapper.selectByPrimaryKey(id);
	}

	@Transactional
	@Override
	public int updateByPrimaryKeySelective(BalanceRecord record) {
		// TODO Auto-generated method stub
		return balanceRecordMapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(BalanceRecord record) {
		// TODO Auto-generated method stub
		return balanceRecordMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<BalanceRecord> listBalanceRecord(Long playerId, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		return balanceRecordDaoMapper.listBalanceRecord(playerId);
	}

}
