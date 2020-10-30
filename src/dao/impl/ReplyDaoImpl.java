package dao.impl;

import java.util.List;

import dao.ReplyDao;
import entity.Reply;
import entity.Topic;

public class ReplyDaoImpl extends BaseDao implements ReplyDao {

	@Override
	public Reply findReply(int ReplyId) {
		return null;
	}

	@Override
	public int addReply(Reply reply) {
		return 0;
	}

	@Override
	public int updateReply(Reply reply) {
		return 0;
	}

	@Override
	public int deleteReply(Reply reply) {
		return 0;
	}

	@Override
	public List<Topic> findListReply(int page, Topic topicId) {
		return null;
	}

	@Override
	public int findCountReply(int topicId) {
		return 0;
	}

}
