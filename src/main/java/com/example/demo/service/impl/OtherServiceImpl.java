package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OtherDaoMapper;
import com.example.demo.model.vo.PlayerRechargeVo;
import com.example.demo.model.vo.WinPrizeVo;
import com.example.demo.service.OtherService;
import com.github.pagehelper.PageHelper;

@Service
public class OtherServiceImpl implements OtherService{
	
	@Autowired
	private OtherDaoMapper otherDaoMapper;

	@Override
	public List<WinPrizeVo> listWinPrizePlayer(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return otherDaoMapper.listWinPrizePlayer();
	}

	@Override
	public List<PlayerRechargeVo> listPlayerRecharge(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		return otherDaoMapper.listPlayerRecharge();
	}

}
