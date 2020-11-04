package biz.impl;

import java.sql.SQLException;
import java.util.List;

import biz.TopicBiz;
import dao.TopicDao;
import dao.impl.TopicDaoImpl;
import entity.Topic;

public class TopicBizImpl extends TopicDaoImpl implements TopicBiz {
	
	
	public Topic findTopic(int topicId) throws ClassNotFoundException, SQLException{
		
		return super.findTopic(topicId);
		
	}
	public List<Topic> findListTopic(int page,int boardId) throws ClassNotFoundException, SQLException{
		return null;
		
	}
	public int addTopic(Topic topic) throws ClassNotFoundException, SQLException{
		return 0;
		
	}
	
	public int updateTopic(Topic topic) throws ClassNotFoundException, SQLException{
		return 0;
		
	}


	public int deleteTopic(Topic topic) throws ClassNotFoundException, SQLException{
		return 0;
		
	}


}
