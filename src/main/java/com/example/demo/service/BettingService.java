package com.example.demo.service;

import com.example.demo.model.dto.JsonDto;

public interface BettingService {

	JsonDto doBettingStr(Long lotteryNumId, Long lotteryTypeId, Long ruleId, String bettingInfoStr,Long playerId );
	JsonDto doJoinBuyStr(Long lotteryNumId, Long lotteryTypeId, Long ruleId, String bettingInfoStr, String joinBuyInfoStr, Long playerId );
}
