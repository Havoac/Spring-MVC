<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>called by home controller</h1>
	<h1>url /home</h1>
	<%
	String name = (String) request.getAttribute("name");
	List<String> friends = (List<String>) request.getAttribute("f");
	%>
	<h1>
		Name is
		<%=name%>
	</h1>
	<h1>
		<%
		for (String fr : friends) {
		%>
		<h1>
			<%=fr%>
		</h1>
		<%
		}
		%>
	</h1>
</body>
</html>