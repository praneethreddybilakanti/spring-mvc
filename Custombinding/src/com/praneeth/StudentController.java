package com.praneeth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping(value="/admission",method=RequestMethod.GET)
	public ModelAndView getAdmission()
	{
		
		ModelAndView model1 = new ModelAndView("AdmissionForm");

		return model1;
	}
	

	@ModelAttribute
    public void addingCommonObjects(Model model1) {
		
		model1.addAttribute("headerMessage", "Gontu College of Engineering, India");
	}

	@RequestMapping(value="/Custombinding/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student, BindingResult result) {
		
		 if (result.hasErrors()) {

				ModelAndView model1 = new ModelAndView("AdmissionForm");
				return model1;
		 }

		ModelAndView model1 = new ModelAndView("success");
		return model1;
	}
	
}



