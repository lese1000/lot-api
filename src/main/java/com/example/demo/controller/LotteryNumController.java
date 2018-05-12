package com.example.demo.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.base.BaseController;
import com.example.demo.model.dto.JsonDto;
import com.example.demo.model.entity.LotteryNum;
import com.example.demo.service.LotteryNumService;

@RestController
@RequestMapping("api/v1/lotteryNum")
public class LotteryNumController extends BaseController{
	
	@Autowired
	private LotteryNumService lotteryNumService;
	
	@RequestMapping("getNewest")
	public JsonDto getNewestLotteryNum(Long lotteryTypeId) {
		try {
			LotteryNum lotteryNum = lotteryNumService.getNewestLotteryNum(lotteryTypeId);
			if(null == lotteryNum ) {
				TimeUnit.SECONDS.sleep(1);//等待一秒
				lotteryNum = lotteryNumService.getNewestLotteryNum(lotteryTypeId);
				if(null == lotteryNum) {
					json.setFailure("该彩种已暂停投注");
					return json;
				}
				
			}
			json.setData(lotteryNum);
			json.setSuccess();
		} catch (Exception e) {
			json.setError();
			log.error("getNewestLotteryNum Error",e);
		}
		return json;
	}
	
	

}
