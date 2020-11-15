<%@page import="entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	User user = (User)session.getAttribute("user");
	
%>
<body>
<%=title %>
<%=content %>
</body>
</html>