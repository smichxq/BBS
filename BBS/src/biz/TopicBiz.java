package biz;
import java.sql.SQLException;
import java.util.List;

import entity.Topic;

public interface TopicBiz {
	/**
	 * 根据主题id查找主题
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public Topic findTopic(int topicId) throws ClassNotFoundException, SQLException;
	
	/**
	 * 返回某板块号的第page页的主题list
	 * @param page
	 * @param boardId
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public List<Topic> findListTopic(int page,int boardId) throws ClassNotFoundException, SQLException;
	
	/**
	 * 添加主题
	 * @param topic
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public int addTopic(Topic topic) throws ClassNotFoundException, SQLException; 
		
	/**
	 * 更新主题
	 * @param topic
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public int updateTopic(Topic topic) throws ClassNotFoundException, SQLException;
	
	/**
	 * 删除主题
	 * @param topic
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public int deleteTopic(Topic topic) throws ClassNotFoundException, SQLException;
}


