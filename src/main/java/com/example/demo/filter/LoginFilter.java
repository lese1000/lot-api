package com.example.demo.filter;

import java.io.IOException;

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

import com.example.demo.common.Constant;


public class LoginFilter implements Filter{
	Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		log.info(">>>>>>>>login<<<<<<<<<<<<<");
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse  httpResponet = (HttpServletResponse) response;
		HttpSession session = httpRequest.getSession();
		Object player = session.getAttribute(Constant.PLAYER_INFO);
		
		if(null == player) {
			response.getWriter().write("");
		}else {
			//已经登陆,继续此次请求
			filterChain.doFilter(request,response);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
