package com.example.demo.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.base.utils.libaray.util.Md5;
import com.base.utils.libaray.util.NetworkUtil;
import com.example.demo.controller.base.BaseController;
import com.example.demo.model.dto.JsonDto;
import com.example.demo.model.entity.Player;
import com.example.demo.service.PlayerService;

@RestController
@RequestMapping("/api/v1/player")
public class PlayerController extends BaseController{
	
	@Autowired
	private PlayerService playerService;
	
	
	@RequestMapping("invitorUrl")
	public JsonDto getInvitorUrl() {
		try {
			String InvitationUrl = NetworkUtil.getDomain(request) + "/goReg?p=" + this.playerId;
			json.setData(InvitationUrl);
			json.setSuccess();
			
		} catch (Exception e) {
			json.setError();
			log.error("getInvitorUrl Error",e);
		}
		return json;
	}
	
	@RequestMapping("addOrupdatePayPasswd")
	public JsonDto addOrupdatePayPasswd() {
		try {
			boolean isAdd = true;
			String payPasswd = this.player.getPassword();
			if(StringUtils.isNotBlank(payPasswd)) {
				isAdd = false;
				json.setData(isAdd);
			}
			json.setSuccess();
		} catch (Exception e) {
			log.error("addOrupdatePayPasswd Error",e);
			json.setError();
		}
		return json;
	}
	
	@RequestMapping("updatePayPasswd")
	public JsonDto updatePayPasswd(boolean isAdd , String passwd1, String passwd2) {
		try {
			if(StringUtils.isBlank(passwd1)) {
				json.setFailure("密码不能为空");
				return json;
			}
			if(StringUtils.isBlank(passwd2)) {
				json.setFailure("密码不能为空");
				return json;
			}
			
			if(isAdd) {
				if(!passwd1.equals(passwd2)) {
					json.setFailure("两次密码不一致");
					return json;
				}
				
			}else {
				if(!passwd1.equals(this.player.getPayPassword())) {
					json.setFailure("旧密码错误，请重试");
					return json;
				}
			}
			Player record = new Player();
			record.setId(this.getPlayerId());
			record.setPayPassword(passwd2);
			playerService.updateByPrimaryKeySelective(record);
			json.setSuccess();
			
		} catch (Exception e) {
			log.error("updatePayPasswd Error",e);
			json.setError();
		}
		return json;
	}
	
	@RequestMapping("updateLoginPasswd")
	public JsonDto updateLoginPasswd(boolean isAdd , String passwd1, String passwd2) {
		try {
			if(StringUtils.isBlank(passwd1)) {
				json.setFailure("旧密码不能为空");
				return json;
			}
			if(StringUtils.isBlank(passwd2)) {
				json.setFailure("新密码不能为空");
				return json;
			}
				
			if(!Md5.getMd5String(passwd1).equals(this.player.getPassword())) {
				json.setFailure("旧密码错误，请重试");
				return json;
			}
			Player record = new Player();
			record.setId(this.getPlayerId());
			record.setPassword(Md5.getMd5String(passwd2));
			playerService.updateByPrimaryKeySelective(record);
			json.setSuccess("修改成功");
			
		} catch (Exception e) {
			log.error("updatePayPasswd Error",e);
			json.setError();
		}
		return json;
	}
	
	
	
	

	
}
