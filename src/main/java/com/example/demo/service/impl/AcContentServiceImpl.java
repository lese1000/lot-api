package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AcContentDaoMapper;
import com.example.demo.dao.mapper.AcContentMapper;
import com.example.demo.model.entity.AcContent;
import com.example.demo.service.AcContentService;
import com.github.pagehelper.PageHelper;

@Service
public class AcContentServiceImpl implements AcContentService {
	
	@Autowired
	private AcContentMapper acContentMapper;
	@Autowired
	private AcContentDaoMapper acContentDaoMapper;

	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return acContentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(AcContent record) {
		// TODO Auto-generated method stub
		return acContentMapper.insert(record);
	}

	@Override
	public int insertSelective(AcContent record) {
		// TODO Auto-generated method stub
		return acContentMapper.insertSelective(record);
	}

	@Override
	public AcContent selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return acContentMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(AcContent record) {
		// TODO Auto-generated method stub
		return acContentMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(AcContent record) {
		// TODO Auto-generated method stub
		return acContentMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(AcContent record) {
		// TODO Auto-generated method stub
		return acContentMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<AcContent> listAcContentSelective(AcContent entity, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		return acContentDaoMapper.listAcContentSelective(entity);
	}

}
