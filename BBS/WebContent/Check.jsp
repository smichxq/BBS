<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<%
	String acc = request.getParameter("acc");

	String pw = request.getParameter("pwd");

	if(acc.equals("tom") && pw.equals("123"))

	{ %>
	
		<jsp:forward page = "Success.jsp">
			<jsp:param value="<%= acc %>" name="accc"></jsp:param>
			</jsp:forward>
		
	<%} else{ %>
	
		<jsp:forward page="ReTry.jsp"></jsp:forward>
		
		<%} %>

<body>

</body>
</html>