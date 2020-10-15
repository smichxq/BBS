package dao.impl;

import java.sql.SQLException;
import java.util.*;

import org.apache.naming.java.javaURLContextFactory;
import org.omg.CORBA.PUBLIC_MEMBER;

import dao.UserDao;
import entity.User;

public class Test {

	public static void main(String[] args) {
		User u1 = new User();
		Date now = new Date();
		java.sql.Date sDate = new java.sql.Date(now.getTime());
		u1.setUserId(19877);
		u1.setUserName("smith");
		u1.setUserPass("011404");
		u1.setGender(UserDao.FEMALE);
		u1.setHead("0x111");
		u1.setRegTime(sDate);
		
		UserDaoImpl udi = new UserDaoImpl();
		
		try {
			System.out.println(udi.addUser(u1));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
