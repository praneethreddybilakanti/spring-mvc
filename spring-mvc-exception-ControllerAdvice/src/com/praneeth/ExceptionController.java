package com.praneeth;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionNullMethod()
	{
		System.out.println("controller advice from null pinter");
		return "NullPointer";
		
	}
	@ExceptionHandler(value=Exception.class)
	public String exceptionMethod()
	{
		System.out.println("controller advice from exception");

		return "Exception";
		
	}

}
