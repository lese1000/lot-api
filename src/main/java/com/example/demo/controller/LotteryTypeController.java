package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.base.BaseController;
import com.example.demo.model.dto.JsonDto;
import com.example.demo.model.entity.LotteryType;
import com.example.demo.service.LotteryTypeService;

@RestController
@RequestMapping("api/v1/lotteryType")
public class LotteryTypeController extends BaseController{
	
	@Autowired
	private LotteryTypeService lotteryTypeService;
	
	@RequestMapping("list")
	public JsonDto listLotteryType() {
		try {
			LotteryType entity = new LotteryType();
			entity.setDelFlag(0);//
			List<LotteryType> lotteryTypeList = lotteryTypeService.listLotteryTypeSelective(entity);
			json.setData(lotteryTypeList);
			json.setSuccess();
		} catch (Exception e) {
			log.error("listLotteryType Error ",e);
			json.setError();
		}
		return json;
	}

}
