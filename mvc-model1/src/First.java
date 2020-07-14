

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First
 */
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		response.setContentType("text/html");
		
		PrintWriter out =response.getWriter();
	String name=request.getParameter("name");
	int id=Integer.parseInt(request.getParameter("id"));
	double sal=Double.parseDouble(request.getParameter("sal"));
	out.print(name);
	Employee e=new Employee();
	e.setId(id);
	e.setName(name);

	e.setSal(sal);
	
	if(name.equals("naresh"))

	{
		out.println("======================================================");
		RequestDispatcher rd=request.getRequestDispatcher("/success.jsp");
		rd.forward(request, response);
		
	}
	
	else
	{
		out.println("sorry plz try again later");
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
	rd.include(request, response);
	}
	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}



}
