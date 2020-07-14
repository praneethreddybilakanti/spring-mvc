<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
String name;
int id;
double sal;
%>
<%

name=request.getParameter("name");
id=Integer.parseInt(request.getParameter("id"));
sal=Double.parseDouble(request.getParameter("sal"));


%>
/*
<jsp:useBean id="s" class="com.praneeth.Employee">
</jsp:useBean>
 
<jsp:setProperty property="name" name="s" value="name"/>
<jsp:setProperty property="id" name="s" value="id"/>
<jsp:setProperty property="sal" name="s" value="sal"/>
*/
if(name.equals("naresh"))
	{
		out.println("======================================================");
		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
		
	}
	
	else
	{
		out.println("sorry plz try again later");
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
	rd.include(request, response);
	}
	


</body>
</html>