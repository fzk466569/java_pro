package com.neusoft.service;

import java.util.List;

import com.neusoft.entity.Users;


public interface UserI {
	
	public boolean regUser(Users users);
	
	public boolean login(Users users);
	
	public List<Users> findUsers();
	
	public boolean deleteUsers(String id);
	
	public boolean update(Users users);
	
	public Users getUsersById(String id);
	
	public Users getUsersByName(String id);
}
