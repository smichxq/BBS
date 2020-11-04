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
	User loginUser = (User)session.getAttribute("savedUser");
	session.setAttribute("loginUser", loginUser);
%>
<h1>Success!</h1>
<h1>Welcome: <%=loginUser.toString()%></h1>

</body>
</html>