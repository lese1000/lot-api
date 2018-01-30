package com.example.demo.handler;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.dto.JsonDto;

@ControllerAdvice
public class GlobalExceptionHandler {
	private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * API系统异常处理，比如：404,500
     * @param req
     * @param resp
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public JsonDto defaultErrorHandler(HttpServletRequest request, Exception e) throws Exception {
        
        JsonDto json = new JsonDto();
        json.setMessage(e.getMessage());
        if (e instanceof org.springframework.web.servlet.NoHandlerFoundException) {
        	json.setCode("404");
        } else {
        	json.setCode("500");
        	logger.error("defaultErrorHandler ", e);
        }
        json.setSuccess(false);
        return json;
    }
}
