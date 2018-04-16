package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.entity.JoinBuyDetail;
import com.example.demo.model.vo.JoinBuyDetailVo;

public interface JoinBuyDetailDaoMapper {

	List<JoinBuyDetailVo> listJoinBuyDetailByJoinBuyId(Long joinBuyId);
	List<JoinBuyDetail> listJoinBuyDetailByPlayerId(Long playerId);
}
