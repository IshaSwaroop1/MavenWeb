<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Profile</h1>
<p> name: <%=request.getAttribute("name") %></p>
<p> password :<%=request.getAttribute("password") %></p>
</body>
</html>