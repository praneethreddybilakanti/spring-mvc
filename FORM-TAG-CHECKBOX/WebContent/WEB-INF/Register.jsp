
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

name: <form:input path="username"/>
<br/>
number
 <form:input path="number" type="number"/>
 <br/>
 Gender:
Male <form:radiobutton path="gender" value="Male"/>  
<br/>
Female <form:radiobutton path="gender" value="Female"/> 
        <br/>
        <br/>
hobbies:
        <br>
 
cricket: <form:checkbox path="hobbies" value="cricket"/>
       <br>
football:<form:checkbox path="hobbies" value="football"/>
       <br>
<input type="submit" value="submit"/>
</form:form>
</body>
</html>