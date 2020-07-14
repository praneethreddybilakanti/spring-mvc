<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<body>
	<h1>Spring MVC Internationalization i18n Example</h1>

	Select Language : <a href="?lang=en">English</a> | <a href="?lang=fr">french</a>

	<h2>
		<spring:message code="spring.welcome" />
	</h2>
	<h3>
		<spring:message code="spring.content" />
	</h3>

</body>
</html>