package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.Constant;
import com.example.demo.controller.base.BaseController;
import com.example.demo.model.dto.JsonDto;
import com.example.demo.model.entity.Player;
import com.example.demo.service.PlayerService;

@RestController
@RequestMapping("api/v1/auth")
public class LoginController extends BaseController{
	
	@Autowired
	private PlayerService playService;

	@RequestMapping("login")
	public JsonDto login(Player player) {
		try {
			Player entity = playService.findByNameAndPassowrd(player);
			if(null != entity) {
				this.session.setAttribute(Constant.PLAYER_INFO, entity);
				json.setSuccess();
			}else {
				json.setFailure("用户名或密码错误");
			}
		} catch (Exception e) {
			log.error("login Error",e);
		}
		return this.json;
	}
}
