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
<jsp:include page = "PageNext.jsp" />


</body>
</html>