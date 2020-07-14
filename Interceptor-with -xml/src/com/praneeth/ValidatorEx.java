package com.praneeth;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class ValidatorEx extends HandlerInterceptorAdapter {

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView model) throws Exception {
		// TODO Auto-generated method stub
	      LocalTime time = LocalTime.now();
	      int hrs = time.getHour();
	      if (hrs >= 0 && hrs <= 12) {
	         model.addObject("greeting", "Good morning!");
	      } else if (hrs > 12 && hrs <= 17) {
	         model.addObject("greeting", "Good afternoon!");
	      } else {
	         model.addObject("greeting", "Good evening!");
	      }
	   }
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
throws Exception {
		Calendar cal = Calendar.getInstance(); 
		
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);  //getting the day on which request is made
		
		if(dayOfWeek == 6) { // 1 means Sunday, 2 means Monday....7 means Saturday
			
			response.getWriter().write("The Website is closed on Sunday; please try accessing it " +
					"on any other week day!!");
			
			return true;
		}
		
		return true;

}
	}