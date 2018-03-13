package com.example.demo.dao;

import org.apache.ibatis.annotations.Param;

import com.example.demo.model.entity.Player;

public interface PlayerDaoMapper {

	Player findByNameAndPassowrd(Player player);
	Player findByPlayerName(@Param("playerName") String playerName);
}
