package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.mapper.RuleMapper;
import com.example.demo.model.entity.Rule;
import com.example.demo.service.RuleService;

@Service
public class RuleServiceImpl implements RuleService{
	
	@Autowired
	private RuleMapper ruleMapper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return ruleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Rule record) {
		// TODO Auto-generated method stub
		return ruleMapper.insert(record);
	}

	@Override
	public int insertSelective(Rule record) {
		// TODO Auto-generated method stub
		return ruleMapper.insertSelective(record);
	}

	@Override
	public Rule selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return ruleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Rule record) {
		// TODO Auto-generated method stub
		return ruleMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Rule record) {
		// TODO Auto-generated method stub
		return ruleMapper.updateByPrimaryKey(record);
	}

}
