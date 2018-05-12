package com.example.demo.controller;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.base.utils.libaray.util.CookieUtils;
import com.base.utils.libaray.util.Md5;
import com.base.utils.libaray.util.NetworkUtil;
import com.example.demo.common.Constant;
import com.example.demo.controller.base.BaseController;
import com.example.demo.model.dto.JsonDto;
import com.example.demo.model.entity.LoginRecord;
import com.example.demo.model.entity.Player;
import com.example.demo.service.LoginRecordService;
import com.example.demo.service.PlayerService;

@RestController
@RequestMapping("api/v1/auth")
public class AuthController extends BaseController{
	
	@Autowired
	private PlayerService playerService;
	
	@Autowired
	private LoginRecordService loginRecordService;

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public JsonDto login(Player param) {
		try {
			if(StringUtils.isBlank(param.getPlayerName())){
				json.setFailure("用户名不能为空");
				return json;
			}
			if(StringUtils.isBlank(param.getPassword())){
				json.setFailure("密码不能为空");
				return json;
			}else {
				param.setPassword(Md5.getMd5String(param.getPassword()));
			}
			Player entity = playerService.findByNameAndPassowrd(param);
			if(null != entity) {
				this.session.setAttribute(Constant.PLAYER_INFO, entity);
				//添加登陆记录
				String idAddr = NetworkUtil.getIpAddress(request);
				LoginRecord record = new LoginRecord();
				record.setCreateDate(new Date());
				record.setIpAddr(idAddr);
				record.setPlayerId(entity.getId());
				loginRecordService.insert(record);
				
				//
				CookieUtils.setSessionCookie(response, "playerId", entity.getId()+"");
				json.setSuccess();
			}else {
				json.setFailure("用户名或密码错误");
			}
		} catch (Exception e) {
			log.error("login Error",e);
			json.setError();
		}
		return this.json;
	}
	
	@RequestMapping(value = "reg", method = RequestMethod.POST)
	public JsonDto reg(String playerName,String password,Long p) {
		try {
			if(null == p || p == 0) {
//				json.setFailure("无效的注册链接");
//				return json;
				p = 0L;
			}
			
			if(StringUtils.isBlank(playerName)){
				json.setFailure("用户名不能为空");
				return json;
			}else {
				Player entity = playerService.findByPlayerName(playerName);
				if(null != entity) {
					json.setFailure("该用户名已存在");
					return json;
				}
			}
			if(StringUtils.isBlank(password)){
				json.setFailure("密码不能为空");
				return json;
			}
			Player record = new Player();
			record.setCreateDate(new Date());
			record.setParent(p);
			record.setPassword(Md5.getMd5String(password));
			record.setPlayerName(playerName);
			byte playerType = 1;
			record.setCreateUser("register");
			record.setPlayerType(playerType);
			playerService.insertSelective(record);
			json.setSuccess();
		} catch (Exception e) {
			log.error("reg Error",e);
			json.setError();
		}
		return this.json;
	}
	
	
	@RequestMapping(value = "logout", method = RequestMethod.POST)
	public JsonDto logout() {
		try {
			this.getSession().removeAttribute(Constant.PLAYER_INFO);
			json.setSuccess();
		} catch (Exception e) {
			log.error("logout Error",e);
			json.setError();
		}
		return this.json;
	}
}
