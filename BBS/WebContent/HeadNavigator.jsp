<%@page import="entity.Board"%>
<%@page import="java.util.Map"%>
<%@page import="biz.impl.BoardBizImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%!
	boolean flagFrm = true;
String style = "font-family: Consolas, 'Andale Mono', 'Lucida Console', 'Lucida Sans Typewriter', Monaco, 'Courier New', monospace; font-style: normal;";
%>
<%//if(flagFrm){ %>
<%
	//BoardBizImpl bd1 = new BoardBizImpl();
	//BoardBizImpl bd2 = new BoardBizImpl();
	//Map<Board,Board> map1 = bd1.findBoard();
	//Map<Board,Board> map2 = bd2.findBoard();
%>
<body>
<div id="d1-head">
	<h1 id="d1-title">BBS</h1>
</div>

<div class="d3-navigate">

<%//for(Board keyBoard1 : map1.keySet()){ %>
<!-- 如果是父板块 -->
<%//if(map1.get(keyBoard1)==null){ %>

<button class='d2-head1'><%//=keyBoard1.getBoardName() %> 

<div class="drop-content">
<!-- 再次遍历 -->
<%//for(Board keyBoard2 : map2.keySet()){%>
<!-- 如果内层遍历的父板块等于外层的父板块 且 不是专用与存放父板块的map -->
<%//if(map2.get(keyBoard2)!=null && map2.get(keyBoard2).getBoardId()==keyBoard1.getBoardId()  ) { %>
<!-- 就输出子板块名字 -->
<%//out.println("<a href='JAVA.jsp' " + " style=" + style + ">" + keyBoard2.getBoardName() + "</a>"); %>
<!-- 如果内层遍历的父板块不等于外层的父板块-->
<%//}%>
<!-- 开始内层下一次遍历 -->
<%//}%>
<%
//out.println("</div>");
//out.println("</button>");
%>
<%//} %>
<%//} %>
<% //flagFrm = false; %>
<%//} %>

</div>