package com.neusoft.service;

import java.util.List;

import com.neusoft.dao.UserDaoI;
import com.neusoft.dao.UserDaoImpl;
import com.neusoft.entity.Users;

public class UserImpl implements UserI {
	UserDaoI userDao = new UserDaoImpl();

	@Override
	public boolean regUser(Users users) {
		if (userDao.addUsers(users)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean login(Users users) {
		if(userDao.findOneUser(users)){
			return true;
		}
		return false;
	}

	@Override
	public List<Users> findUsers() {
		String sql="";
		List<Users> list = userDao.findUsers(sql);
		return list;
	}

	@Override
	public boolean deleteUsers(String id) {
		if(userDao.deleteUsers(id)){
			return true;
		}
		return false;
	}

	@Override
	public Users getUsersById(String id) {
		if(userDao.findOneUser(id)!=null){
			return userDao.findOneUser(id);
		}
		return null;
	}

	@Override
	public boolean update(Users users) {
		if(userDao.update(users)){
			return true;
		}
		return false;
	}
	
	@Override
	public Users getUsersByName(String userName) {
		if(userDao.getOneUser(userName)!=null){
			return userDao.getOneUser(userName);
		}
		return null;
		
	}
}
