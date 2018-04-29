package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.base.BaseController;
import com.example.demo.model.dto.JsonDto;
import com.example.demo.model.entity.AcContent;
import com.example.demo.service.AcContentService;

@RestController
@RequestMapping("api/v1/acContent")
public class AcContentController extends BaseController{
	
	@Autowired
	private AcContentService acContentService;
	
	@RequestMapping("list")
	public JsonDto listAcContent(AcContent param) {
		
		try {
			param.setDelFlag(0);
			json.setData(acContentService.listAcContentSelective(param, pageNum, pageSize));
			json.setSuccess();
		} catch (Exception e) {
			log.error("listAcContent Error",e);
			json.setError();
		}
		
		return json;
	}
	
	@RequestMapping("detail")
	public JsonDto getAcContentDetail(String id) {
		
		try {
			json.setData(acContentService.selectByPrimaryKey(id));
			json.setSuccess();
		} catch (Exception e) {
			log.error("listAcContent Error",e);
			json.setError();
		}
		
		return json;
	}

}
