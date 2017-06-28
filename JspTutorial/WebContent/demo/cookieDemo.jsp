<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="org.o7planning.tutorial.jsp.utils.CookieUtils"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cookie Demo</title>
</head>
<body>

	<%
		CookieUtils.demoUserCookie(request, response, out);
	%>

	<a href="">Try again!!</a>


</body>
</html>