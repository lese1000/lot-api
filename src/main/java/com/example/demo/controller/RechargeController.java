package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.base.BaseController;
import com.example.demo.model.dto.JsonDto;
import com.example.demo.model.entity.ReceivablesInfo;
import com.example.demo.model.entity.RechargeRecord;
import com.example.demo.service.ReceivablesInfoService;
import com.example.demo.service.RechargeRecordService;

@RestController
@RequestMapping("api/v1/recharge")
public class RechargeController extends BaseController{
	
	@Autowired
	private ReceivablesInfoService receivablesInfoService;
	@Autowired
	private RechargeRecordService rechargeRecordService;

	
	@RequestMapping("getReceivablesInfo")
	public JsonDto getReceivablesInfo() {
		try {
			List<ReceivablesInfo> receivableInfoList = receivablesInfoService.listReceivablesInfo();
			json.setData(receivableInfoList);
			json.setSuccess();
		} catch (Exception e) {
			json.setError();
			log.error("getReceivablesInfo Error",e);
		}
		return json;
	}
	
	@RequestMapping("saveRechargeRecord")
	public JsonDto saveRechargeRecord(RechargeRecord record) {
		try {
			if(null != record) {
				if(StringUtils.isBlank(record.getFullName())) {
					json.setFailure("存款人姓名不能为空");
					return json;
				}
				if(StringUtils.isBlank(record.getPayAccount())) {
					json.setFailure("支付账号不能为空");
					return json;
				}
				if(null == record.getRechargeVal() || record.getRechargeVal() == 0) {
					json.setFailure("充值金额不能为空");
					return json;
				}
				
				Byte status = 1;//待审核
				record.setStatus(status);
				record.setPlayerId(this.getPlayerId());
				record.setCreateDate(new Date());
				rechargeRecordService.insertSelective(record);
				json.setSuccess("充值信息已提交，正在审核中");
			}else {
				json.setFailure("请求参数不能为空");
			}
		} catch (Exception e) {
			log.error("doRecharge Error");
		}
		return json;
	}
	
	@RequestMapping("listRechargeRecord")
	public JsonDto listRechargeRecord() {
		try {
			List<RechargeRecord> rechargeRecordList = rechargeRecordService.listRechargeRecord(this.getPlayerId(), pageNum, pageSize);
			json.setData(rechargeRecordList);
			json.setSuccess();
		} catch (Exception e) {
			log.error("listRechargeRecord Error",e);
			json.setError();
		}
		
		return json;
	}
	
}
