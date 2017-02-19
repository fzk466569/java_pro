package com.neusoft.entity;

public class Users {
	private String userId;
	private String userName;
	private String password;
	private float createDate;
	public float getCreateDate() {
		return createDate;
	}
	public void setCreateDate(float createDate) {
		this.createDate = createDate;
	}
	private String tel;
	private String email;
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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

}
