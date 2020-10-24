package biz.impl;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import biz.BoardBiz;
import biz.UserBiz;
import dao.UserDao;
import entity.Board;
import entity.User;

public class Test {
public static void main(String[] args) {
	BoardBiz bdBiz = new BoardBizImpl();
	BoardBiz bdBiz2 = new BoardBizImpl();
	Map<Board, Board> map1 = bdBiz.findBoard();
	Map<Board, Board> map2 = bdBiz2.findBoard();
	String style = "font-family: Consolas, 'Andale Mono', 'Lucida Console', 'Lucida Sans Typewriter', Monaco, 'Courier New', monospace; font-style: normal;";

	
	for(Board keyBoard1 : map1.keySet()){ 
//	<!-- 如果是父板块 -->
	if(map1.get(keyBoard1)==null){ 
		System.out.println("<button class='d2-head1'>"+ keyBoard1.getBoardName());
		System.out.println("<div class=\"drop-content\">");
//	<!-- 再次遍历 -->
	for(Board keyBoard2 : map2.keySet()) {
//	<!-- 如果内层遍历的父板块等于外层的父板块 且 不是专用与存放父板块的map -->
	if(map2.get(keyBoard2)!=null  && map2.get(keyBoard2).getBoardId()==keyBoard1.getBoardId() ) { 
//	<!-- 就输出主板块名字 -->
		System.out.println("<a href='JAVA.jsp' " + " style=" + style + ">" + keyBoard2.getBoardName() + "</a>");
//	<!-- 如果内层遍历的父板块不等于外层的父板块-->
	}
	}
	System.out.println("</div>");
	System.out.println("</button>");
	}
	}


//		UserBiz userBiz = new UserBizImpl();
//		Date utilDate = new Date();
//		
//		DateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
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




