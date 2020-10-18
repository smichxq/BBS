package biz.impl;

import java.sql.SQLException;

import biz.UserBiz;
import dao.impl.UserDaoImpl;
import entity.User;

/**
 * @author qiang
 * 实现了增,删,改,查
 *
 */
public class UserBizImpl extends UserDaoImpl implements UserBiz {

	@Override
	public User findUser(String userName) {
		return super.findUser(userName);
	}

	@Override
	public User findUser(int userId){
		return null;

		
	}

	@Override
	public int addUser(User user) throws ClassNotFoundException, SQLException {
		return super.addUser(user);
	}

	@Override
	public int updateUser(User user) throws ClassNotFoundException, SQLException {
		return super.updateUser(user);
	}

	@Override
	public int deleteUser(User user) throws ClassNotFoundException, SQLException {
		return super.deleteUser(user);
	}

}
