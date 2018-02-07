package com.example.demo.model.dto;

public class JsonDto {
	
	private boolean isSuccess;
	private String code;
	private String message;
	private Object data;
	
	public JsonDto(){
		this.isSuccess = false;
	}
	
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess() {
		this.isSuccess = true;
		this.code = "200";
		this.message = "成功";
	}
	
	public void setFailure(String msg) {
		this.isSuccess = false;
		this.code = "400";
		this.message = msg;
	}
	
	public void setError() {
		this.isSuccess = false;
		this.code = "500";
		this.message = "服务器内部异常";
	}
	
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	

}
