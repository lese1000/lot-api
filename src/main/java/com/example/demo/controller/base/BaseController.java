package com.example.demo.controller.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.model.dto.JsonDto;


public class BaseController {
	protected JsonDto json = new JsonDto();
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
}
