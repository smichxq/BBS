package dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import dao.UserDao;

import entity.User;

public class UserDaoImpl extends BaseDao implements UserDao {

	
	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public User findUser(String userName){
		String sql = "select * from TBL_USER";
		ResultSet rs = null;
		PreparedStatement ps = null;
		//子类继承父类所有方法,使用this来使用
		//如果是子类方法与父类方法重名（方法重写）使用super来调同名父类方法
		try {
			ps = this.preStmt(sql);
			rs = ps.executeQuery();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		User user = null;
		try {
			while (rs.next()) {
				if(rs.getString("userName").equals(userName)) {
					user = new User();
					user.setGender(rs.getInt("gender"));
					user.setHead(rs.getString("head"));
					Timestamp stmp = rs.getTimestamp("regTime");
					user.setRegTime(stmp);
					user.setUserId(rs.getInt("userId"));
					user.setUserName(rs.getString("userName"));
					user.setUserPass(rs.getString("userPass"));
					return user;
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User findUser(int userId) throws ClassNotFoundException, SQLException {
		String sql = "select * from TBL_USER";
		PreparedStatement ps = this.preStmt(sql);
		ResultSet rs = ps.executeQuery();
		User user = null;
		while (rs.next()) {
			if(rs.getInt("userId")==userId) {
				user = new User();
				user.setGender(rs.getInt("gender"));
				user.setHead(rs.getString("head"));
				Timestamp stmp = rs.getTimestamp("regTime");
				user.setRegTime(stmp);
				user.setUserId(rs.getInt("userId"));
				user.setUserName(rs.getString("userName"));
				user.setUserPass(rs.getString("userPass"));
				return user;
			}
			
		}
		return null;
	}

	@Override
	public int addUser(User user) throws ClassNotFoundException, SQLException {
		
		String sqlString = "insert into " + "TBL_USER(" + "userId" + "," +"userName" + ","  + "userPass"
	+ "," + "head" + "," + "gender" + "," + "regTime" + ")"  + " values(" + '?' + "," +  '?' + ","  + '?' + "," + '?' + "," + '?' + "," + '?' + ")";
		
		PreparedStatement ps = this.preStmt(sqlString);
		DateFormat df = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		
		ps.setInt(1, user.getUserId());
		ps.setString(2, user.getUserName());
		ps.setString(3, user.getUserPass());
		ps.setString(4, user.getHead());
		ps.setInt(5, user.getGender());
		//user包的Date来自util包 而setDate来自sql包 
		ps.setString(6,df.format(user.getRegTime()) );
		return this.execUpd(ps);
		
	}

	@Override
	public int updateUser(User user) throws ClassNotFoundException, SQLException {
		/*当sql语句列值出现关键字时会出现错误：check the manual that corresponds to your MySQL server version for the right
			将关键字加上单引号解决
		*/
		String sql = "update TBL_USER set userName = ? ,userPass = ? ,head = ? ,gender = ? where userId = ? ";
		
		PreparedStatement ps = this.preStmt(sql);
		
		ps.setString(1, user.getUserName());
		ps.setString(2, user.getUserPass());
		ps.setString(3, user.getHead());
		ps.setInt(4, user.getGender());
		ps.setInt(5, user.getUserId());
		
		return this.execUpd(ps);
	
	}
	
	public int deleteUser(User user) throws ClassNotFoundException, SQLException {
		String sql = "delete from TBL_USER where userId = ?";
		PreparedStatement ps = this.preStmt(sql);
		ps.setInt(1, user.getUserId());
		return this.execUpd(ps);
	}

}
