package dao;



import java.util.List;

import entity.Reply;
import entity.Topic;

public interface ReplyDao {

	/**
	 * 根据Id查找回复
	 * @param ReplyId
	 * @return
	 */
	public Reply findReply(int ReplyId);
	
	/**
	 * 添加回复
	 * @param reply
	 * @return
	 */
	public int addReply(Reply reply);
	
	/**
	 * 更新回复
	 * @param reply
	 * @return
	 */
	public int updateReply(Reply reply);
	
	/**
	 * 删除回复
	 * @param reply
	 * @return
	 */
	public int deleteReply(Reply reply);
	
	/**
	 * 返回主题第page页的回复list
	 * @param page
	 * @param topic
	 * @return
	 */
	public List<Topic> findListReply(int page,Topic topicId);
	
	/**
	 * 根据主题Id返回回复数量
	 * @param topicId
	 * @return
	 */
	public int findCountReply(int topicId);
}