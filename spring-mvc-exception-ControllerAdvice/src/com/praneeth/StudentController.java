package com.praneeth;

import java.io.FileNotFoundException;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class StudentController {

	@RequestMapping("/")
	public String getRegisterForm()
	{
		
		
		return "register";
	}
	@RequestMapping("/login")
	public String getSuccess(@ModelAttribute("student") Student student,BindingResult rs) throws Exception
	{
		if(student.getUsername().isEmpty())
		{
			 throw new NullPointerException();
		}
		if(student.getPassword().isEmpty())
		{
			 throw new Exception();
		}
		/*
		 * while(rs.hasErrors()) { return "register"; }
		 */
		return "success";
	}

	
}
