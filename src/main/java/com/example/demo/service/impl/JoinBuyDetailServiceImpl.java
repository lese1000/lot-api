package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.JoinBuyDetailDaoMapper;
import com.example.demo.dao.mapper.JoinBuyDetailMapper;
import com.example.demo.model.entity.JoinBuyDetail;
import com.example.demo.model.vo.JoinBuyDetailVo;
import com.example.demo.service.JoinBuyDetailService;
import com.github.pagehelper.PageHelper;

@Service
public class JoinBuyDetailServiceImpl implements JoinBuyDetailService{

	@Autowired
	private JoinBuyDetailMapper joinBuyDetailMapper;
	@Autowired
	private JoinBuyDetailDaoMapper joinBuyDetailDaoMapper;
	
	@Transactional
	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return joinBuyDetailMapper.deleteByPrimaryKey(id);
	}

	@Transactional
	@Override
	public int insert(JoinBuyDetail record) {
		// TODO Auto-generated method stub
		return joinBuyDetailMapper.insert(record);
	}

	@Transactional
	@Override
	public int insertSelective(JoinBuyDetail record) {
		// TODO Auto-generated method stub
		return joinBuyDetailMapper.insertSelective(record);
	}

	@Override
	public JoinBuyDetail selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return joinBuyDetailMapper.selectByPrimaryKey(id);
	}

	@Transactional
	@Override
	public int updateByPrimaryKeySelective(JoinBuyDetail record) {
		// TODO Auto-generated method stub
		return joinBuyDetailMapper.updateByPrimaryKeySelective(record);
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(JoinBuyDetail record) {
		// TODO Auto-generated method stub
		return joinBuyDetailMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<JoinBuyDetailVo> listJoinBuyDetailByJoinBuyId(Long joinBuyId, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		return joinBuyDetailDaoMapper.listJoinBuyDetailByJoinBuyId(joinBuyId);
	}

	@Override
	public List<JoinBuyDetail> listJoinBuyDetailByPlayerId(Long playerId, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		return joinBuyDetailDaoMapper.listJoinBuyDetailByPlayerId(playerId);
	}

}
