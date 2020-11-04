<%@page import="entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="CSS/Head.css" type="text/css" rel="stylesheet"/>
<title>Insert title here</title>
<%
	User user1 = null;
	user1 = (User)session.getAttribute("user");
%>
</head>
<!--  
	导航栏的父板块是调用BoardBizImpl的findBoard方法实现
	
	但是findBoard返回的是Map,每次客户端请求都会使用Map
	
	Map是以哈希算法储存,同时,每当客户端提交请求HeadNavi
	
	gator-Demo.jsp都会动态执行一次,所以每次从Map取出来的
	
	Board无顺序，表现在网页上就是每次都不一样,如果想要查看
	
	这个问题，请将 HeadNavigator-Demo.jsp 改为HeadNavigator.jsp
	
-->
<%@include file = "HeadNavigator-Demo.jsp" %> 




<div class="d4-head">
<%if(user1==null) {%>
	<a id="a1-head" href="Login.jsp">登录</a>
	<a id="a2-head" href="Regist.jsp">注册</a>
	
	<%}else{%>
	<%out.println("<img src= '../" + user1.getUserName() + ".jpg" + "'" + " width='50' " + "height='50' />"); %>
	<a href="User.jsp"><%=user1.getUserName() %></h>
	
	<%} %>
</div>


