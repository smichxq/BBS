<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BBS</title>
</head>
<body style="background-color:#ffffff;">
<jsp:include page = "Head.jsp" />
<%
Integer boardId = new Integer(1);
request.setAttribute("topicId", boardId);
%>


<%for(int i = 0; i<10; i++){ %>
		<jsp:include page = "Board.jsp" />
		<br>
		<%} %>


<jsp:include page = "PageNext.jsp" />
</body>
</html>