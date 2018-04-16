package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.base.BaseController;
import com.example.demo.model.dto.JsonDto;

@RestController
@RequestMapping("api/v1/history")
public class HistoryController extends BaseController{

	public JsonDto personalBetting() {
		try {
			
		} catch (Exception e) {
			log.error("personalBetting Error",e);
			json.setError();
		}
		return json;
	}
	
	public JsonDto Betting() {
		try {
			
		} catch (Exception e) {
			log.error("personalBetting Error",e);
			json.setError();
		}
		return json;
	}
}
