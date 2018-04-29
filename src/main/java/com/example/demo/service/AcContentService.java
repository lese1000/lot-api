package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.mapper.AcContentMapper;
import com.example.demo.model.entity.AcContent;

public interface AcContentService extends AcContentMapper{
	
	List<AcContent> listAcContentSelective(AcContent entity, int pageNum, int pageSize);
}
