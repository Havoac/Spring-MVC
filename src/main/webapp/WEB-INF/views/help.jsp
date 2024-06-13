<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!-- by default it is true, so it is set as false to use jsp -->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Model and View</title>
</head>
<body>
	<%
	/* String name = (String)request.getAttribute("name");
	Integer rollNo = (Integer)request.getAttribute("roll no"); */
	%>

	<h1>
		My name is ${name}
		<%-- <%=name %> --%>
		and my roll no is ${roll_no}
		<%-- <%=rollNo %> --%>
	</h1>

	<hr>

	<c:forEach var="item" items="${marks }">
		<h1>${item }</h1>
	</c:forEach>
</body>
</html>