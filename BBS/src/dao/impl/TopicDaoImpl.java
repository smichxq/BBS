package dao.impl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;import com.sun.org.apache.regexp.internal.recompile;

import dao.TopicDao;
import entity.Topic;

public class TopicDaoImpl extends BaseDao implements TopicDao{
//	BaseDao bd = null;
	
	public TopicDaoImpl() {
		// TODO Auto-generated constructor stub
//		bd = new BaseDao();
	}

	@Override
	public Topic findTopic(int topicId) {
		return null;
	}

	@Override
	public List<Topic> findListTopic(int page, int boardId) throws ClassNotFoundException, SQLException {
		String sql = "select * from TBL_TOPIC";
		List<Topic> lt = new ArrayList<Topic>();
		PreparedStatement ps = this.preStmt(sql);
		//bd.execQ(ps);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Topic topic = new Topic();
			topic.setBoardId(rs.getInt("topicId"));
			topic.setTitle(rs.getString("title"));
			topic.setContent(rs.getString("content"));
			topic.setPublishTime(rs.getDate("publishTime"));
			topic.setModifyTime(rs.getDate("modifyTime"));
			topic.setUserId(rs.getInt("userId"));
			topic.setBoardId(rs.getInt("boardId"));
			lt.add(topic);
//			System.out.println("addList");
		}
		return lt;
	}

	@Override
	public int addTopic(Topic topic) throws ClassNotFoundException, SQLException {
		String sql = "insert into " + "TBL_TOPIC(" + "topicId" + "," +"title" + ","  + "content"
				+ "," + "publishTime" + "," + "modifyTime" + "," + "userId" + "," + "boardId" + ")"  + 
				" values(" + '?' + "," +  '?' + ","  + '?' + "," + '?' + "," + '?' + "," + '?' + "," + "?" + ")";
		
		PreparedStatement ps = this.preStmt(sql);
		ps.setInt(1, topic.getTopicId());
		ps.setString(2, topic.getTitle());
		ps.setString(3, topic.getContent());
		ps.setDate(4, (Date) topic.getPublishTime());
		ps.setDate(5, (Date) topic.getModifyTime());
		ps.setInt(6, topic.getUserId());
		ps.setInt(7, topic.getBoardId());
		
		return this.execQ(ps);
	}

	@Override
	public int updateTopic(Topic topic) {
		return 0;
	}

	@Override
	public int deleteTopic(Topic topic) {
		return 0;
	}

}
