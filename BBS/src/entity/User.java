package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

public class User {
	private int userId;
	private String userName;
	private String userPass;
	private int gender;
	private String head;
	private Date regTime;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public Date getRegTime() {
		return regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.head +" "+ this.userId  +" "+this.userName+" " + this.userPass +" "+ this.gender+" " 
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.regTime);
	}

}