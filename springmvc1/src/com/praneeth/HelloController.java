package com.praneeth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {


	@RequestMapping("/hello")
	public String helloClient()
	{
		System.out.println("hi................");
		return "display";
		
	}
}
