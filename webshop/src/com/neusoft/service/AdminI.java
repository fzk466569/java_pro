package com.neusoft.service;

import com.neusoft.entity.Admin;

public interface AdminI {

	public boolean login(Admin admin);

	public boolean update(Admin admin);

	public Admin findAdmin();
}
