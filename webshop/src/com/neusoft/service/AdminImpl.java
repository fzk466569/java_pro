package com.neusoft.service;

import com.neusoft.dao.AdminDaoI;
import com.neusoft.dao.AdminDaoImpl;
import com.neusoft.entity.Admin;

public class AdminImpl implements AdminI {
	
	AdminDaoI admindao=new AdminDaoImpl();
	@Override
	public boolean login(Admin admin) {
		if(admindao.findOneAdmin(admin)){
			return true;
		}
		return false;
	}

	@Override
	public boolean update(Admin admin) {
		if(admindao.update(admin)){
			return true;
		}
		return false;
	}

	@Override
	public Admin findAdmin() {
		// TODO Auto-generated method stub
		if(admindao.findOneAdmin() != null){
			return admindao.findOneAdmin();
		}
		return null;
	}

}
