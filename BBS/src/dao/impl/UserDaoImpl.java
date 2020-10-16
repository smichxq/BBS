package dao.impl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.UserDao;

import dao.impl.BaseDao;
import entity.User;

public class UserDaoImpl implements UserDao {
	BaseDao bd = null;
	
	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
		bd = new BaseDao();
	}

	@Override
	public User findUser(String userName) {
		
		return null;
	}

	@Override
	public User findUser(int userId) {
		return null;
	}

	@Override
	public int addUser(User user) throws ClassNotFoundException, SQLException {
		String sqlString = "insert into " + "TBL_USER(" + "userId" + "," +"userName" + ","  + "userPass"
	+ "," + "head" + "," + "gender" + "," + "regTime" + ")"  + " values(" + '?' + "," +  '?' + ","  + '?' + "," + '?' + "," + '?' + "," + '?' + ")";
		
		PreparedStatement ps = bd.preStmt(sqlString);
		
		ps.setInt(1, user.getUserId());
		ps.setString(2, user.getUserName());
		ps.setString(3, user.getUserPass());
		ps.setString(4, user.getHead());
		ps.setInt(5, user.getGender());
		//user包的Date来自util包 而setDate来自sql包 
		ps.setDate(6, (Date) user.getRegTime());
		
		return bd.execQ(ps);
		
	}

	@Override
	public int updateUser(User user) {
		return 0;
	}

}
