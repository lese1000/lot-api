package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.entity.AcContent;

public interface AcContentDaoMapper {

	List<AcContent> listAcContentSelective(AcContent entity);
}
