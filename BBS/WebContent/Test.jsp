<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%!
boolean flagA = true;


Integer boardCount,childBoardCount;
%>
<%if(flagA){%>

<jsp:forward page = "HeadNavigator-Demo.jsp" />

<%flagA = false;%>
<%} %>
<%
	
	boardCount = (Integer)session.getAttribute("i");
    childBoardCount = (Integer)session.getAttribute("j");
    
    
    
%>
<body>
<h1>
<%=boardCount.intValue()%>
<%=childBoardCount.intValue()%>
</h1>

</body>
</html>