<%@page import="entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="CSS/User.css" type="text/css" rel="stylesheet"/>

<title>用户中心</title>
<%
	User user = null;
	user = (User)session.getAttribute("user");
%>

</head>
<body>
<!-- 增加用户信息 并提供修改功能 -->
<%if(user==null){ %>
	<jsp:forward page="Regist.jsp"></jsp:forward>
<%}else{ %>
	<div class = "user-container">
	
	<%out.println("<img src= '../" + user.getUserName() + ".jpg" + "'" + " width='50' " + "height='50' />"); %>
	<div class="user-inner">
		<a>账号: <%=user.getUserId() %> </a>
		</div>
	<div class="user-inner">
		<a>密码: <%=user.getUserPass() %></a>
		</div>
	<div class="user-inner">
		<a>昵称: <%=user.getUserName() %></a>
		</div>
	<div class="user-inner">
		<a>注册日期: <%=user.getRegTime() %></a>
		</div>
	<div class="user-inner">
		<a href="index.jsp">点此跳转</a>
		</div>
	
	</div>
	<%} %>

<script>

</script>

</body>
</html>