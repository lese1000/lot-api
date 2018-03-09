package com.example.demo.dao;

import com.example.demo.model.entity.Player;

public interface PlayerDaoMapper {

	Player findByNameAndPassowrd(Player player);
}
