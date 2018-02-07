package com.example.demo.handler;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.example.demo.model.dto.JsonDto;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
	private Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    
    /**
     * 400 - Bad Request
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public JsonDto handleHttpMessageNotReadableException(
            HttpMessageNotReadableException e) {
        log.error("could_not_read_json...", e);
        JsonDto json = new JsonDto();
        json.setMessage("could_not_read_json");
        json.setCode("400");
        return json;
    }

    /**
     * 400 - Bad Request
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({MethodArgumentNotValidException.class})
    public JsonDto handleValidationException(MethodArgumentNotValidException e) {
        log.error("parameter_validation_exception...", e);
        JsonDto json = new JsonDto();
        json.setMessage("parameter_validation_exception");
        json.setCode("400");
        return json;
    }
    
    
    /**
     * 404 - NoHandlerFoundException
     */
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = NoHandlerFoundException.class)
    public JsonDto defaultErrorHandler(HttpServletRequest request, Exception e) throws Exception {
        
        JsonDto json = new JsonDto();
        json.setMessage(e.getMessage());
        json.setCode("404");
        return json;
    }

    /**
     * 405 - Method Not Allowed。HttpRequestMethodNotSupportedException
     * 是ServletException的子类,需要Servlet API支持
     */
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public JsonDto handleHttpRequestMethodNotSupportedException(
            HttpRequestMethodNotSupportedException e) {
        log.error("request_method_not_supported...", e);
        JsonDto json = new JsonDto();
        json.setMessage("request_method_not_supported");
        json.setCode("405");
        return json;
    }

    /**
     * 415 - Unsupported Media Type。HttpMediaTypeNotSupportedException
     * 是ServletException的子类,需要Servlet API支持
     */
    @ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
    @ExceptionHandler({ HttpMediaTypeNotSupportedException.class })
    public JsonDto handleHttpMediaTypeNotSupportedException(Exception e) {
        log.error("content_type_not_supported...", e);
        JsonDto json = new JsonDto();
        json.setMessage("content_type_not_supported");
        json.setCode("415");
        return json;
    }


    /**
     * 500 - Internal Server Error
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public JsonDto handleException(Exception e) {
        log.error("Internal Server Error...", e);
        JsonDto json = new JsonDto();
        json.setMessage("Internal Server Error");
        json.setCode("500");
        return json;
    }
}
