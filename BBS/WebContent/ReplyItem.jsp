<%@ page import="java.util.*,java.text.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<meta charset="UTF-8">
<link href="CSS/ReplyItem.css" type="text/css" rel="stylesheet"/>
<title>Insert title here</title>

<div class="reply">
	<div id = "inner-L">
	<!-- 用户头像 -->
	<img id="img" src="img.jpg" width="122" height="102">
	<!-- 用户名字 -->
	<a class="user" href="index.jsp">smithx</a>
	</div>
	<div id = "inner-M">
	<!-- 用户回复 -->
	<p>15日，疑似阿塞拜疆残忍虐待射杀两名战俘的画面流传网络。视频显示，两名战俘被抓后被要求举起手来，其中一名胡子花白的老年战俘被阿士兵一把拽倒在地上，还被抢抵着头部。随后另一段视频则显示，阿士兵在两名战俘身上披上亚美尼亚国旗，在对两人进行一番羞辱和殴打后，将他们残忍射杀。</p>
	</div>
	<div id = "inner-R">
	<!-- 回复时间 -->
	<p class="time">
	<%
		Date date = new Date();
	 	SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
	%>
	<%=ft.format(date) %>
	</p>
	</div>
</div>

