package dao.impl;

import java.sql.SQLException;
import java.util.*;

import org.apache.naming.java.javaURLContextFactory;
import org.omg.CORBA.PUBLIC_MEMBER;

import dao.UserDao;
import entity.Topic;
import entity.User;

public class Test {

	public static void main(String[] args) {
//		Date now = new Date();
//		java.sql.Date sDate = new java.sql.Date(now.getTime());
//		
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
		List<Topic> l = null;
		TopicDaoImpl topicDaoImpl = new TopicDaoImpl();
		try {
			l = topicDaoImpl.findListTopic(1, 1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Topic topic : l) {
			System.out.println(topic.toString());
		}
		
//		while (it.hasNext()) {
//			System.out.println("1");
//			//System.out.println(it.next().getBoardId() + it.next().getTitle() + it.next().getContent() + it.next().getTopicId() + it.next().getUserId() + it.next().getModifyTime() + it.next().getPublishTime());
//		}
		

		
		
	

	}

}
