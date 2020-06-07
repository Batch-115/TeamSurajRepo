package com.webcore.app.easyemi.customerRegistration.exception;

import org.springframework.http.HttpStatus;

public class ErrorResponse {
	private String msg;
	private String requestUri;
	private int numericStatusCode;
	HttpStatus stringStatusCode;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getRequestUri() {
		return requestUri;
	}
	public void setRequestUri(String requestUri) {
		this.requestUri = requestUri;
	}
	public int getNumericStatusCode() {
		return numericStatusCode;
	}
	public void setNumericStatusCode(int numericStatusCode) {
		this.numericStatusCode = numericStatusCode;
	}
	public HttpStatus getStringStatusCode() {
		return stringStatusCode;
	}
	public void setStringStatusCode(HttpStatus stringStatusCode) {
		this.stringStatusCode = stringStatusCode;
	}
	
	
	
}
