package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.base.utils.libaray.util.NetworkUtil;
import com.example.demo.controller.base.BaseController;
import com.example.demo.model.dto.JsonDto;

@RestController
@RequestMapping("/api/v1/player/")
public class PlayerController extends BaseController{
	
	
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
	
	

	
}
