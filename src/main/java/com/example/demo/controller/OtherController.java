package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.base.BaseController;
import com.example.demo.model.dto.JsonDto;
import com.example.demo.service.OtherService;

@RestController
@RequestMapping("api/v1/other")
public class OtherController extends BaseController {
	
	@Autowired
	private OtherService otherService;
	
	@RequestMapping("getNewestWinPrize")
	public JsonDto getNewestWinPrizePlayer() {
		try {
			json.setData(otherService.listWinPrizePlayer(pageNum, pageSize));
			json.setSuccess();
		} catch (Exception e) {
			json.setError();
			log.error("getNewestWinPrizePlayer Error",e);
		}
		return json;
	}
	
	@RequestMapping("getNewestRechargeList")
	public JsonDto getNewestRechargeList() {
		try {
			json.setData(otherService.listPlayerRecharge(pageNum, pageSize));
			json.setSuccess();
		} catch (Exception e) {
			log.error("getNewestRechargeList Error",e);
			json.setError();
		}
		
		return json;
	}
	
	
	

}
