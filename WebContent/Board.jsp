<%@page import="java.text.SimpleDateFormat"%>
<%@page import="biz.impl.UserBizImpl"%>
<%@page import="entity.User"%>
<%@page import="entity.Topic"%>
<%@page import="biz.impl.TopicBizImpl"%>
<%@page import="biz.TopicBiz"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="CSS/Board.css" type="text/css" rel="stylesheet"/>
<meta charset="UTF-8">
<title>BBS</title>
</head>
<%
	Topic topic = null;
	TopicBiz topicBiz = new TopicBizImpl();
	

	topic = topicBiz.findTopic((int)request.getAttribute("topicId"));
		


	
	User boardUser = null;
	UserBizImpl userBizImpl = new UserBizImpl();
	boardUser = userBizImpl.findUser(topic.getUserId());
	//SimpleDateFormat date = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
	
%>
<body>
<!-- 主题框架 -->

<div class="d1-board">

<!-- 回复数 -->
	<div class="d1-replyCount">
	
		<div class ="d1-inner-reply">
			121
		</div>
		
	</div>
	
	<!-- 主题内容 -->
	<div class="d1-topic-container">
		<div class="topic">
		<a href="ReplyBoard.jsp"><%=topic.getTitle() %></a>
		</div>
	
	</div>
	
	<!-- 帖子发布者 回复者-->

		
		<!-- 楼主-->
		<div class = "d2-master">
		<%=boardUser.getUserName() %>
		</div>

		
		<!-- 最后回贴-->
		<div class = "d2-reply">
		<%=topic.getModifyTime()%>
		</div>
		<!-- 回贴时间 -->
		<div class = "d2-reply-date">
		
		</div>
</div>
</body>
</html>