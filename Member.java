package model;
import java.util.Date;

public abstract class Member {

	private String userID;
	private String userName;
	private String password;
	private Date birthday;
	private char gender;
	private String userPicPath;

	public Member(String id, String name, String password) {
		this.userID = id;
		this.userName = name;
		this.password = password;
	}

	public Member() {

	}

	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getUserPicPath() {
		return userPicPath;
	}
	public void setUserPicPath(String userPicPath) {
		this.userPicPath = userPicPath;
	}


}
