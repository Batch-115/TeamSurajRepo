package com.webcore.app.easyemi.customerRegistration.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomerRegisterException {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ErrorResponse HandleResourceNotFoundException(ResourceNotFoundException rs,HttpServletRequest req) {
		
		ErrorResponse er=new ErrorResponse();
		er.setMsg(rs.getMessage());
		er.setRequestUri(req.getRequestURI());
		er.setNumericStatusCode(HttpServletResponse.SC_NOT_FOUND);
		er.setStringStatusCode(HttpStatus.NOT_FOUND);
		return er;
	}

}
