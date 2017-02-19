package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.Users;

public interface UserDaoI {
	
	public boolean addUsers(Users users);
	public List<Users> findUsers(String sql);
	public boolean findOneUser(Users users);
	public Users findOneUser(String id);
	public boolean update(Users users);
	public boolean deleteUsers(String id);
	public Users getOneUser(String name);
}
