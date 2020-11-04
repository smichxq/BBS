<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>JAVA技术</title>
</head>
<body>
<jsp:include page = "Head.jsp" />
<%
	Integer boardId = new Integer(1);
	request.setAttribute("topicId", boardId);
%>
<%for(int i = 0; i<10; i++){ %>

	<%@ include file = "Board.jsp" %>
	<br>
	<%} %>
	
<jsp:include page = "PageNext.jsp" />
</body>
</html>