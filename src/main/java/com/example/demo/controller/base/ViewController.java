package com.example.demo.controller.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.base.utils.libaray.util.CookieUtils;
import com.base.utils.libaray.util.NetworkUtil;

@Controller
public class ViewController extends BaseController{

	@RequestMapping("/")
	public String index() {
		return "redirect:/resource/index.html";
	}
	
	@RequestMapping("goReg")
	public String goReg(String p) {
		CookieUtils.setCookie(response, "p", p);
		return "redirect:" +	NetworkUtil.getDomain(request) + "/resource/index.html#/reg";
	}
}
