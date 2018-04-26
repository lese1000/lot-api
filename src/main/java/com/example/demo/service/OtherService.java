package com.example.demo.service;

import java.util.List;

import com.example.demo.model.vo.PlayerRechargeVo;
import com.example.demo.model.vo.WinPrizeVo;

public interface OtherService {
	
	List<WinPrizeVo> listWinPrizePlayer(int pageNum, int pageSize);
	
	List<PlayerRechargeVo> listPlayerRecharge(int pageNum, int pageSize);

}
