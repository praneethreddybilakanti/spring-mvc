
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student form</title>
</head>
<body>
<h1>student registration form</h1>
<form:form action="./submit" modelAttribute="student">

name: <form:password path="username"/>
<br/>
password:
<form:input path="password"/>
 <br/>
<input type="submit" value="submit"/>
</form:form>
</body>
</html>