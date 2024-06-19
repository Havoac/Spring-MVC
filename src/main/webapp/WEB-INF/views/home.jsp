<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="<c:url value='/resources/css/style.css' />" rel="stylesheet">
<script src="<c:url value='/resources/js/script.js' />"></script>
<title>Home page</title>
</head>
<body>
	<img alt="my_image"
		src="<c:url value="/resources/images/Naruto.png" />">
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