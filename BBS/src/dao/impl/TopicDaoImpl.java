package dao.impl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;import com.sun.org.apache.regexp.internal.recompile;

import dao.TopicDao;
import entity.Topic;

public class TopicDaoImpl extends BaseDao implements TopicDao{

	
	public TopicDaoImpl() {
		// TODO Auto-generated constructor stub

	}

	@Override
	public Topic findTopic(int topicId) throws ClassNotFoundException, SQLException {
		String sql = "select * from TBL_TOPIC";
		Topic topic = null;
		PreparedStatement ps = this.preStmt(sql);
		ResultSet rs = ps.executeQuery();
		java.util.Date date = null;
		java.util.Date date1 = null;
		
		
		
		while (rs.next()) {
			if (rs.getInt("topicId") == topicId) {
				//date = rs.getDate("publishTime");
				//date1 = rs.getDate("modifyTime");
				
				topic = new Topic();
				topic.setTopicId((rs.getInt("topicId")));
				topic.setTitle(rs.getString("title"));
				topic.setContent(rs.getString("content"));
				topic.setPublishTime(rs.getTimestamp("publishTime"));
				topic.setModifyTime(rs.getTimestamp("publishTime"));
				topic.setUserId(rs.getInt("userId"));
				topic.setBoardId(rs.getInt("boardId"));
				
				return topic;
			}
		}
		
		
		return null;
	}

	@Override
	public List<Topic> findListTopic(int page, int boardId) throws ClassNotFoundException, SQLException {
		String sql = "select * from TBL_TOPIC";
		List<Topic> lt = new ArrayList<Topic>();
		PreparedStatement ps = this.preStmt(sql);
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
		
		DateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		
		PreparedStatement ps = this.preStmt(sql);
		ps.setInt(1, topic.getTopicId());
		ps.setString(2, topic.getTitle());
		ps.setString(3, topic.getContent());
		ps.setString(4, dateFormat.format(topic.getModifyTime()));
		ps.setString(5, dateFormat.format(topic.getPublishTime()));
		ps.setInt(6, topic.getUserId());
		ps.setInt(7, topic.getBoardId());
		
		return this.execUpd(ps);
	}

	@Override
	public int updateTopic(Topic topic) throws ClassNotFoundException, SQLException {
		String sql = "update TBL_TOPIC set title = ? ,content = ? ,modifyTime = ? where topicId = ?";
		
		DateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
//		java.util.Date date = new java.util.Date();
		
		PreparedStatement ps = this.preStmt(sql);
		
		
		ps.setString(1, topic.getTitle());
		ps.setString(2, topic.getContent());
		ps.setString(3, dateFormat.format(topic.getModifyTime()));
//		ps.setInt(4, topic.getUserId());
		ps.setInt(4, topic.getTopicId());

		return this.execUpd(ps);
	}

	@Override
	public int deleteTopic(Topic topic) throws ClassNotFoundException, SQLException {
		String sql = "delete from TBL_TOPIC where topicId = ?";
		PreparedStatement ps = this.preStmt(sql);
		ps.setInt(1, topic.getTopicId());
		return this.execUpd(ps);
	}

}
