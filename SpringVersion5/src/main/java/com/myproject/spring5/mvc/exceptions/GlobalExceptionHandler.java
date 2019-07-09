package com.myproject.spring5.mvc.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler
	public String handleBusinessException(BusinessException ex) {
		return "Handled BusinessException";
	}

}
