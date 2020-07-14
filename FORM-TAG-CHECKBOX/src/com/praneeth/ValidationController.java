package com.praneeth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ValidationController  {


	@RequestMapping("/register")
	public String getRegisterForm(Model model)
	{
		Student stu=new Student();
		model.addAttribute("student", stu);
		
		return "Register";
	}
	
	@RequestMapping("/submit")  
	// @ModelAttribute binds form data to the object  
	public String submitForm(@ModelAttribute("student") Student student)  
	{  
	    return "confirmation-page";  
	}  
	}  