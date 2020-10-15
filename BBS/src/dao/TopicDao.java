package dao;

import java.util.List;

import entity.Topic;

public interface TopicDao {
	/**
	 * 根据主题id查找主题
	 * @return
	 */
	public Topic findTopic(int topicId);
	
	/**
	 * 返回某板块号的第page页的主题list
	 * @param page
	 * @param boardId
	 * @return
	 */
	public List<Topic> findListTopic(int page,int boardId);
	
	/**
	 * 添加主题
	 * @param topic
	 * @return
	 */
	public int addTopic(Topic topic); 
		
	/**
	 * 更新主题
	 * @param topic
	 * @return
	 */
	public int updateTopic(Topic topic);
	
	/**
	 * 删除主题
	 * @param topic
	 * @return
	 */
	public int deleteTopic(Topic topic);
}
