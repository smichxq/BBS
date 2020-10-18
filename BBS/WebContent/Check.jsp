
<%@page import="biz.impl.UserBizImpl"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="entity.*,dao.impl.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<%!
String acc = null;

String pw =null;

BaseDao bd = null;

Statement ps = null;

Connection connection = null;

String string = null;

User user = null;

%>
<%
	

	acc = request.getParameter("acc");
	pw = request.getParameter("pwd");
	UserBizImpl ubi = new UserBizImpl();
	user = ubi.findUser(acc);
	string = user.getUserPass();

	if(user.getUserPass().equalsIgnoreCase(pw))

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