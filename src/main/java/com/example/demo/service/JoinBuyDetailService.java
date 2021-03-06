package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.mapper.JoinBuyDetailMapper;
import com.example.demo.model.entity.JoinBuyDetail;
import com.example.demo.model.vo.JoinBuyDetailVo;

public interface JoinBuyDetailService extends JoinBuyDetailMapper{

	List<JoinBuyDetailVo> listJoinBuyDetailByJoinBuyId(Long joinBuyId, int pageNum, int pageSize);
	
	List<JoinBuyDetail> listJoinBuyDetailByPlayerId(Long playerId, int pageNum, int pageSize);
}
