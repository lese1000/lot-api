package com.example.demo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoginFilter implements Filter{
	Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse respone, FilterChain filterChain)
			throws IOException, ServletException {
		log.info(">>>>>>>>login<<<<<<<<<<<<<");
		filterChain.doFilter(request,respone);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
