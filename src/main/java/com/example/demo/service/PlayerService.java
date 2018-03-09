package com.example.demo.service;

import com.example.demo.dao.mapper.PlayerMapper;
import com.example.demo.model.entity.Player;

public interface PlayerService extends PlayerMapper{

	Player findByNameAndPassowrd(Player player);
}
