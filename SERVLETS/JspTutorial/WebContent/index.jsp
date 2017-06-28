<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- Import declaration -->
<%@ page import="java.util.*, java.text.*"%>
<%@ page import="java.util.List, java.text.*"%>

<%!
 
public int sum(int a, int b)  {
 return a + b;
}
 
public void exampleMethod()  {
  // Code here
}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
             "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Hello JSP Page</h1>

	<%
		Date date = new java.util.Date();
	%>

	<h2>
		Now is
		<%=date.toString()%>
	</h2>
</body>
</html>