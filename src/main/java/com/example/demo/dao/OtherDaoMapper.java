package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.vo.PlayerRechargeVo;
import com.example.demo.model.vo.WinPrizeVo;

public interface OtherDaoMapper {

	
	List<WinPrizeVo> listWinPrizePlayer();
	List<PlayerRechargeVo> listPlayerRecharge();
}
