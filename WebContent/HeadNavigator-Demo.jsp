<%@page import="org.eclipse.jdt.internal.compiler.ast.NullLiteral"%>
<%@page import="biz.BoardBiz"%>
<%@page import="entity.Board"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="biz.impl.BoardBizImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%!
	BoardBiz bd = new BoardBizImpl();
	Map<List,List> map = null;
	List <Board> fBoardsList = null;
	List <Board> cBoardsList = null;
	Board fBoard = null;
	Board cBoard = null;
	String style = "font-family: Consolas, 'Andale Mono', 'Lucida Console', 'Lucida Sans Typewriter', Monaco, 'Courier New', monospace; font-style: normal;";

	
%>
<body>
<div id="d1-head">
	<h1 id="d1-title">BBS</h1>
</div>

<div class="d3-navigate">
<%
	map = bd.findBoard();
	for(List<Board> list : map.keySet()){
		fBoardsList = list;
		cBoardsList = map.get(list);
	}
%>
<%for(int i = 0 ; i < fBoardsList.size(); i++){ %>
<%fBoard = fBoardsList.get(i);%>
<button class='d2-head1'><%=fBoard.getBoardName() %> 
<div class="drop-content">
<%for(int j = 0 ; j < cBoardsList.size(); j++) {%>
<%cBoard = cBoardsList.get(j); %>
<%if(fBoard.getBoardId() == cBoard.getParentId()){ %>
<%out.println("<a href='JAVA.jsp' " + " style=" + style + ">" +cBoard.getBoardName() + "</a>"); %>
<%} %>
<%} %>
<%
	out.println("</div>");
	out.println("</button>");
%>
<%} %>

















</div>
