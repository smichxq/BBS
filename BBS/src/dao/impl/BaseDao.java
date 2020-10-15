
package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author qiang
 *
 */

public class BaseDao {
	static Connection connection = null;
	
	static PreparedStatement preStmt= null;
	
	static String mySQLDriverName = "com.mysql.cj.jdbc.Driver";
	
	static String urlMySQL = "jdbc:mysql://localhost:3306/";
	
	static String dataBase = "BBS";
	
	static String userName = "root";
	
	static String passWd = "123";
	
	/**
	 * @return Connection
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * 
	 */
	public BaseDao() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName(mySQLDriverName);
			connection = DriverManager.getConnection(urlMySQL + dataBase , userName, passWd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	
	/**
	 * @param sql
	 * 统计字符串" ？" 个数
	 * 返回个数
	 */
	private int sqlCount(String sql) {
		int count=0;
		for (int i = 0; i < sql.length(); i++) {
			if (sql.charAt(i)=='?') {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * 返回一个Statment
	 * @param sql
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public PreparedStatement preStmt(String sql) throws ClassNotFoundException, SQLException {
		return connection.prepareStatement(sql);
	}
	
	public int execQ(PreparedStatement pstmt) throws SQLException {
		return pstmt.executeUpdate();
	}
	

	
	
}
