package com.example.demo.filter;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.base.utils.libaray.util.JacksonUtils;
//import com.base.utils.libaray.util.JacksonUtils;
import com.example.demo.common.Constant;
import com.example.demo.model.dto.JsonDto;



public class AuthenFilter implements Filter{
	Logger log = LoggerFactory.getLogger(this.getClass());
	private final String NO_INTERCEPTOR_PATH = "((/)|(/api/v1/auth/.*)|(/login)|(/resource/.*)|(/goReg))";
//	private final String NO_INTERCEPTOR_PATH = "((/)|(/api/.*)|(/login)|(/resource/.*)|(/goReg))";

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse  httpResponse = (HttpServletResponse) response;
		HttpSession session = httpRequest.getSession();
		Object player = session.getAttribute(Constant.PLAYER_INFO);
		JsonDto json = new JsonDto();
		String requestPath = httpRequest.getServletPath();
		if(null == player) {
			//排除不需要登录的路径
			boolean needAuthentication = true;
			if(requestPath.matches(NO_INTERCEPTOR_PATH)) {
				needAuthentication = false;
			}
			if(!needAuthentication) {
				filterChain.doFilter(request,response);
			}else {
				json.setCode("401");
				json.setMessage("Unauthorized");
				JacksonUtils.outPutJson(json, httpResponse);
			}
		}else {
			//已经登陆,继续此次请求
			filterChain.doFilter(request,response);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
