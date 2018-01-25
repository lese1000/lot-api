package com.example.demo.dao.mapper;

import com.example.demo.model.entity.Player;

public interface PlayerMapper {
    int deleteByPrimaryKey(Long playerId);

    int insert(Player record);

    int insertSelective(Player record);

    Player selectByPrimaryKey(Long playerId);

    int updateByPrimaryKeySelective(Player record);

    int updateByPrimaryKey(Player record);
}