package biz;

import java.sql.SQLException;

import entity.User;

public interface UserBiz {
	/**
	 * 根据用户名查找User对象
	 * @param UserName
	 * @return
	 */
	public User findUser(String userName)throws ClassNotFoundException, SQLException;
	/**
	 * 根据用户id查找User对象
	 * @param UserId
	 * @return
	 */
	public User findUser(int userId)throws ClassNotFoundException, SQLException;
	/**
	 * 增加一个用户
	 * @param user
	 * @return
	 */
	public int addUser(User user) throws ClassNotFoundException, SQLException;
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	public int updateUser(User user) throws ClassNotFoundException, SQLException;
	/**
	 * 删除用户
	 * @param user
	 * @return
	 */
	public int deleteUser(User user) throws ClassNotFoundException, SQLException;

}
