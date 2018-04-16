package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.base.BaseController;
import com.example.demo.model.dto.JsonDto;
import com.example.demo.model.entity.CashRecord;
import com.example.demo.service.CashRecordService;
import com.example.demo.service.PlayerService;

@RestController
@RequestMapping("api/v1/cash")
public class CashController extends BaseController{
	
	@Autowired
	private CashRecordService cashRecordService;
	private PlayerService playerService;
	
	@RequestMapping("saveCashRecord")
	public JsonDto saveCashRecord(CashRecord record, String payPasswd) {
		try {
			json.setData(record);
			
			if(null != record) {
				if(StringUtils.isBlank(record.getFullName())) {
					json.setFailure("收款人姓名不能为空");
					return json;
				}
				if(StringUtils.isBlank(record.getBank())) {
					json.setFailure("开户银行不能为空");
					return json;
				}
				if(StringUtils.isBlank(record.getAccount())) {
					json.setFailure("银行账号不能为空");
					return json;
				}
				if(null == record.getCashVal() && record.getCashVal() == 0) {
					json.setFailure("提款金额不能为空");
					return json;
				}
				if(StringUtils.isBlank(payPasswd)) {
					json.setFailure("提款密码不能为空");
					return json;
				}else {
					String tmpPasswd = this.player.getPayPassword();
					if(StringUtils.isBlank(tmpPasswd)) {
						json.setFailure("首次取款，请先到个人中心设置取款密码");
						return json;
					}else if(!tmpPasswd.equals(payPasswd)) {
						json.setFailure("取款密码不正确");
						return json;
					}
				}
				Byte status = 1;
				record.setStatus(status);
				record.setCreateDate(new Date());
				record.setPlayerId(this.getPlayerId());
				
				cashRecordService.insertSelective(record);
				json.setSuccess("提款信息已提交，正在审核中");
			}else {
				json.setFailure("参数不能为空");
			}
		} catch (Exception e) {
			json.setError();
			log.error("drawCash Error",e);
		}
		return json;
	}
	
	@RequestMapping("listCashRecord")
	public JsonDto listCashRecord() {
		try {
			List<CashRecord> cashRecordList = cashRecordService.listCashRecord(this.getPlayerId(), pageNum, pageSize);
			json.setData(cashRecordList);
			json.setSuccess();
		} catch (Exception e) {
			log.error("listCashRecord Error",e);
			json.setError();
		}
		
		return json;
	}

}
