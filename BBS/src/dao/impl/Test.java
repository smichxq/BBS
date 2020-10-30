package dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import dao.TopicDao;
import entity.Topic;
import entity.User;

public class Test {

	public static void main(String[] args) {
		
		TopicDao topicDao  = new TopicDaoImpl();
		
//		Date utilDate = new Date();
////		System.out.println(dateFormat.format(utilDate));
//		
//		TopicDao topicDaoImpl = new TopicDaoImpl();
//		Topic topic = new Topic();
//     	topic.setBoardId(1);
//		topic.setContent("测试");
//		topic.setModifyTime(utilDate);
//		topic.setPublishTime(utilDate);
//		topic.setTitle("测试");
//		topic.setTopicId(3);
//		topic.setUserId(1);
//		try {
//			System.out.println(topicDaoImpl.addTopic(topic));
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
		
		
		
		
		
//		String sql = "update TBL_TOPIC set title = ? , content = ? , modifyTime = ? where topicId = ?";
//		BaseDao bd = new BaseDao();
//		DateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
//		PreparedStatement ps = null;
//		try {
//			ps = bd.preStmt(sql);
//			ps.setString(1, "DEMO");
//			ps.setString(2, "TITLE");
//			ps.setString(3, dateFormat.format(new Date()));
//			ps.setInt(4, 1);
//			
//			System.out.println(ps.executeUpdate());
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Topic topic = null;
//		
//		TopicDao topicDaoImpl = new TopicDaoImpl();
//		
//
//		try {
//			topic = topicDaoImpl.findTopic(3);
//			
//			topicDaoImpl.deleteTopic(topic);
//			System.out.println("更改前 "  +topic.toString());
//			
//			topic.setModifyTime(new Date());
//			topic.setContent("Yep!");
//			topic.setTitle("test2");
//			
//			System.out.println("更改后 "  +topic.toString());
//			
//			System.out.println(topicDaoImpl.updateTopic(topic));
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}


		


		
		

		
		
//		topicDaoImpl.addTopic(topic)
		
		
		
//		BoardDaoImpl bd = new BoardDaoImpl();
//		Map<List, List> map = bd.findBoard();
//		List<Board> fBoardslList = null;
//		List<Board> cBoardslList = null;
//		
//		
//		for (List<Board> fBoard : map.keySet()) {
//			fBoardslList = fBoard;
//			cBoardslList = map.get(fBoard);
//		}
//		
//		for (int i = 0; i < fBoardslList.size(); i++) {
//			System.out.println("夫版块   " + fBoardslList.get(i).toString());
//			for (int j = 0; j < cBoardslList.size(); j++) {
//				if (fBoardslList.get(i).getBoardId() == cBoardslList.get(j).getParentId()) {
//					System.out.println(cBoardslList.get(j).toString());
//				}
//			}
//		}
//
//		
//		Map<Board, Board> map = bd.findBoard();
//		for (Board board : map.keySet()) {
//			if (map.get(board)!=null) {
//				System.out.println("父板块： " +  map.get(board).toString() +  " 子板块  : " + board.toString());
//				
//			}
//			
//
//		}
		


		
//		BaseDao bdBaseDao = new BaseDao();
//		Connection connection = bdBaseDao.getConnection();
//		try {
//			connection.createStatement();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//
//		User u1 = new User();
//		
//		u1.setGender(UserDao.FEMALE);
//		u1.setHead("01xaa");
//		u1.setUserId(1234);
//		u1.setUserName("s1mithxq");
//		u1.setUserPass("p1asswd");
//		System.out.println(dateFormat.format(u1.getRegTime()));
//		
//		UserDaoImpl userDaoImpl = new UserDaoImpl();
//		
//		try {
//			
//			System.out.println(userDaoImpl.updateUser(u1));
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		User user = userDaoImpl.findUser(1234);
//		
		
//		try {
//			System.out.println(userDaoImpl.addUser(u1));
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
		
		
//		Topic t1 = new Topic();
//		t1.setTopicId(1);
//		t1.setTitle("Test");
//		t1.setContent("Test!");
//		t1.setPublishTime(sDate);
//		t1.setModifyTime(sDate);
//		t1.setUserId(1);
//		t1.setBoardId(1);
//		
//		Topic t2 = new Topic();
//		t2.setTopicId(2);
//		t2.setTitle("Test");
//		t2.setContent("Test!");
//		t2.setPublishTime(sDate);
//		t2.setModifyTime(sDate);
//		t2.setUserId(2);
//		t2.setBoardId(1);
//		
//		TopicDaoImpl tdi = new TopicDaoImpl();
//		try {
//			System.out.println(tdi.addTopic(t1));
//			System.out.println(tdi.addTopic(t2));
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		List<Topic> l = null;
//		TopicDaoImpl topicDaoImpl = new TopicDaoImpl();
//		try {
//			l = topicDaoImpl.findListTopic(1, 1);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		for (Topic topic : l) {
//			System.out.println(topic.toString());
//		}
		
//		while (it.hasNext()) {
//			System.out.println("1");
//			//System.out.println(it.next().getBoardId() + it.next().getTitle() + it.next().getContent() + it.next().getTopicId() + it.next().getUserId() + it.next().getModifyTime() + it.next().getPublishTime());
//		}
		

		
		
	

	}

}
