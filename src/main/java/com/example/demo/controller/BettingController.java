package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.base.BaseController;
import com.example.demo.model.dto.JsonDto;
import com.example.demo.service.BettingService;

@RestController
@RequestMapping("api/v1/betting")
public class BettingController extends BaseController{
	
	@Autowired
	private BettingService bettingService;
	

	//一键投注和立即投注
	@RequestMapping(value = "doBetting", method = RequestMethod.POST)
	public JsonDto doBettingStr(Long lotteryNumId, Long lotteryTypeId, Long ruleId, String bettingInfoStr ) {
		
		
		try {
			return bettingService.doBettingStr(lotteryNumId, lotteryTypeId, ruleId, bettingInfoStr, this.playerId);
		} catch (Exception e) {
			log.error("doBetting Error",e);
			json.setError();
		}
		return this.json;
	}
	
	@RequestMapping(value = "doJoinBuy", method = RequestMethod.POST)
	public JsonDto doJoinBuyStr(Long lotteryNumId, Long lotteryTypeId, Long ruleId, String bettingInfoStr, String joinBuyInfoStr ) {
		
		try {
			return bettingService.doJoinBuyStr(lotteryNumId, lotteryTypeId, ruleId, bettingInfoStr, joinBuyInfoStr, this.playerId);
		} catch (Exception e) {
			log.error("doJoinBuyStr Error",e);
			json.setError();
		}
		return this.json;
	}
	
	

}
