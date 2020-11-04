package biz.impl;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import biz.BoardBiz;
import biz.UserBiz;
import dao.UserDao;
import entity.Board;
import entity.User;

public class Test {
public static void main(String[] args) {
	Date utilDate = new Date();
	
	DateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
	
	UserBiz uBiz = new UserBizImpl();
	User user = new User();
	user.setGender(1);
	user.setHead("xxxx");
	user.setRegTime(utilDate);
	user.setUserId(98766);
	user.setUserName("xxxxx");
	user.setUserPass("123");
	try {
		System.out.println(uBiz.addUser(user));
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
//	BoardBiz bdBiz = new BoardBizImpl();
//	Map<List, List> map = bdBiz.findBoard();
//	List<Board> fBoardslList = null;
//	List<Board> cBoardslList = null;
//	int a = 0;
//	int b = 0 ;
//	String style = "font-family: Consolas, 'Andale Mono', 'Lucida Console', 'Lucida Sans Typewriter', Monaco, 'Courier New', monospace; font-style: normal;";
//	System.out.println("<div id=\"d1-head\">");
//	System.out.println("<h1 id=\"d1-title\">BBS</h1>");
//	System.out.println("</div>");
//	System.out.println("<div class=\"d3-navigate\">");
//	for(List fBoard:map.keySet()) {
//		fBoardslList = fBoard;
//		cBoardslList = map.get(fBoard);
//		
//	}
//	for (int i = 0; i < fBoardslList.size(); i++) {
//		Board fBoard = fBoardslList.get(i);
//		System.out.println("<button class='d2-head1'>" + fBoard.getBoardName());
//		System.out.println("<div class=\"drop-content\">");
//		for (int j = 0; j < cBoardslList.size(); j++) {
//			//a++;
//			Board cBoard = cBoardslList.get(j);
//			if (fBoard.getBoardId() == cBoard.getParentId()) {
//				System.out.println("<a href='JAVA.jsp' " + " style=" + style + ">" +cBoard.getBoardName() + "</a>");
//				//b++;
//			}
//		}
//		System.out.println("</div>");
//		System.out.println("</button>");
//	}
//
//	
	
	
//	BoardBiz bdBiz = new BoardBizImpl();
//	BoardBiz bdBiz2 = new BoardBizImpl();
//	Map<Board, Board> map1 = bdBiz.findBoard();
//	Map<Board, Board> map2 = bdBiz2.findBoard();
//	String style = "font-family: Consolas, 'Andale Mono', 'Lucida Console', 'Lucida Sans Typewriter', Monaco, 'Courier New', monospace; font-style: normal;";
//
//	
//	for(Board keyBoard1 : map1.keySet()){ 
////	<!-- 如果是父板块 -->
//	if(map1.get(keyBoard1)==null){ 
//		System.out.println("<button class='d2-head1'>"+ keyBoard1.getBoardName());
//		System.out.println("<div class=\"drop-content\">");
////	<!-- 再次遍历 -->
//	for(Board keyBoard2 : map2.keySet()) {
////	<!-- 如果内层遍历的父板块等于外层的父板块 且 不是专用与存放父板块的map -->
//	if(map2.get(keyBoard2)!=null  && map2.get(keyBoard2).getBoardId()==keyBoard1.getBoardId() ) { 
////	<!-- 就输出主板块名字 -->
//		System.out.println("<a href='JAVA.jsp' " + " style=" + style + ">" + keyBoard2.getBoardName() + "</a>");
////	<!-- 如果内层遍历的父板块不等于外层的父板块-->
//	}
//	}
//	System.out.println("</div>");
//	System.out.println("</button>");
//	}
//	}


//		UserBiz userBiz = new UserBizImpl();

//		User user = userBiz.findUser("My");
//		if (user.getUserName().equalsIgnoreCase("My")) {
//			System.out.println(user.getUserName());
//		}
//		else {
//			System.out.println("wrong!");
//		}
//		
//		
		
		
}
}




