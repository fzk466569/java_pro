package com.neusoft.dao;

import com.neusoft.entity.Admin;

public interface AdminDaoI {
	public boolean findOneAdmin(Admin admin);

	public boolean update(Admin admin);

	public Admin findOneAdmin();
}
