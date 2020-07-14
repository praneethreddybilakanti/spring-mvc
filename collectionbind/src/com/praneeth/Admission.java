package com.praneeth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Admission {

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView getAdmission(@RequestParam("name") String name,@RequestParam("hobby") String hobby)
	{
		ModelAndView model=new ModelAndView("Success");
		model.addObject("msg", "hello\t"+name+"\tyour hobby is\t"+hobby);
		return model;
	}
}
