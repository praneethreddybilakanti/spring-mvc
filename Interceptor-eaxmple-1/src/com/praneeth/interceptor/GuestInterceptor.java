package com.praneeth.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class GuestInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
	      System.out.println("Called before handler method");

	      request.setAttribute("fname", "Elizabeth");

	return true;
	}
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView model) throws Exception {
	      System.out.println("Called after handler method request completion,"
	              + " before rendering the view");

	        model.addObject("lname", "Brown");
	     }
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
	      System.out.println("Called after rendering the view");
	}
	
}
