<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Model and View</title>
</head>
<body>
	<h1>Hey, this is help page</h1>

	<%
		String name = (String)request.getAttribute("name");
		Integer rollNo = (Integer)request.getAttribute("roll no");
	%>

	<h1>
		My name is
		<%=name %>
		and my roll no is
		<%=rollNo %>
	</h1>
</body>
</html>