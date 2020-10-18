package dao;
import java.sql.SQLException;

import entity.User;


/**
 * @author smith hunk
 *
 */
public interface UserDao {
	public static final int MALE = 2;
	public static final int FEMALE = 1;
	
	
	
	/**
	 * 根据用户名查找用户
	 * 返回User对象
	 * @param userName
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public User findUser(String userName) throws ClassNotFoundException, SQLException;
	
	
	
	
	/**
	 * 根据用户Id查找用户
	 * @param userId
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public User findUser(int userId) throws ClassNotFoundException, SQLException;
	
	
	
	
	/**
	 * 添加用户，返回添加用户个数
	 * @param user
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public int addUser(User user) throws ClassNotFoundException, SQLException;
	
	
	
	
	/**
	 *修改用户信息，返回修改个数
	 * @param user
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public int updateUser(User user) throws ClassNotFoundException, SQLException;
	/**
	 * 删除用户
	 * @param user
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public int deleteUser(User user) throws ClassNotFoundException, SQLException;

}