package com.praneeth;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Catch;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private ServletResponse response=null;



	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();

		System.out.println("==============i am service=================\n");//3
		response.setContentType("text/html");
		out.println(" service=====================");

		String username=request.getParameter("name");
		String date=request.getParameter("date");
		Date d=null;
		try {
			 d=new SimpleDateFormat("dd/mm/yyyy").parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("date"+d);
		System.out.println();

		super.service(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();

System.out.println("/n   --------i am get");//2
out.println(" do get\n=====================");

response.setContentType("text/html");
String username=request.getParameter("name");
String date=request.getParameter("date");
Date d=null;
try {
	 d=new SimpleDateFormat("dd/mm/yyyy").parse(date);
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
out.println("date"+d);
System.out.println();
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();

		response.setContentType("text/html");
out.println(" do post\n=====================");
		System.out.println("999999999999999999go to get method");//1
		doGet(request, response);
	}

}
