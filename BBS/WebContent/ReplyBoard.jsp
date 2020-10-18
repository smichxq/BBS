<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body  style="background-color:#ffffff;">
<%@ include file = "Head.jsp" %>
<%for(int i = 0; i<10; i++){ %>
<%@ include file = "ReplyItem.jsp" %>
	<br>
	<%} %>

<div id="next">
<a href="index.jsp">next page</a>
<a href="index.jsp">last page</a>
</div>



</body>
</html>