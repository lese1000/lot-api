package com.example.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.filter.AuthenFilter;

@Configuration
public class FilterConfig {
	
	  	@Bean
	    public FilterRegistrationBean LoginFilterRegistration() {
	        FilterRegistrationBean registration = new FilterRegistrationBean(new AuthenFilter());
	        registration.addUrlPatterns("/*");
	        return registration;
	    }

}
