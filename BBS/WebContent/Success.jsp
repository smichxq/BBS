<%@page import="entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
<%
	User user = (User)session.getAttribute("user");
	session.setAttribute("loginUser", user);
%>
<h1>Success!</h1>
<h1>Welcome: <%=user.toString()%></h1>

</body>
</html>