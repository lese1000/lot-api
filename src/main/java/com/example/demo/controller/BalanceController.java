package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.base.BaseController;
import com.example.demo.model.dto.JsonDto;
import com.example.demo.model.entity.Balance;
import com.example.demo.service.BalanceRecordService;
import com.example.demo.service.BalanceService;

@RestController
@RequestMapping("api/v1/balance")
public class BalanceController extends BaseController{

	@Autowired
	private BalanceService balanceService;
	@Autowired
	private BalanceRecordService balanceRecordService; 
	
	@RequestMapping("getBalanceVal")
	public JsonDto getBalanceVal() {
		Double balanceVal = 0d;
		try {
			Balance balance = balanceService.getBalanceByPlayerId(this.getPlayerId());
			if(null != balance) {
				balanceVal = balance.getBalanceVal();
			}
			json.setData(balanceVal);
			json.setSuccess();
		} catch (Exception e) {
			json.setError();
			log.error("getBalance Error",e);
		}
		return json;
	}
	
	@RequestMapping("listBalanceRecord")
	public JsonDto listBalanceRecord() {
		
		try {
			json.setData(balanceRecordService.listBalanceRecord(this.getPlayerId(), pageNum, pageSize));
			json.setSuccess();
		} catch (Exception e) {
			json.setError();
			log.error("listBalanceRecord Error",e);
		}
		return json;
	}
	
}
