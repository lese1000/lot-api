package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PlayerDaoMapper;
import com.example.demo.dao.mapper.PlayerMapper;
import com.example.demo.model.entity.Player;
import com.example.demo.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService{
	@Autowired
	private PlayerMapper playerMapper;
	@Autowired
	private PlayerDaoMapper playerDao;

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return playerMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Player record) {
		// TODO Auto-generated method stub
		return playerMapper.insert(record);
	}

	@Override
	public int insertSelective(Player record) {
		// TODO Auto-generated method stub
		return playerMapper.insertSelective(record);
	}

	@Override
	public Player selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return playerMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Player record) {
		// TODO Auto-generated method stub
		return playerMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Player record) {
		// TODO Auto-generated method stub
		return playerMapper.updateByPrimaryKey(record);
	}

	@Override
	public Player findByNameAndPassowrd(Player player) {
		// TODO Auto-generated method stub
		return playerDao.findByNameAndPassowrd(player);
	}

	@Override
	public Player findByPlayerName(String playerName) {
		// TODO Auto-generated method stub
		return playerDao.findByPlayerName(playerName);
	}

}
