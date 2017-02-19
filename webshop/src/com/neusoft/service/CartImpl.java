package com.neusoft.service;

import java.util.List;

import com.neusoft.dao.CartDaoI;
import com.neusoft.dao.CartDaoImpl;
import com.neusoft.entity.Cart;
import com.neusoft.entity.Users;

public class CartImpl implements CartI{

	CartDaoI cartdao=new CartDaoImpl();
	@Override
	public boolean addCartI(Cart cart) {
		if (cartdao.addCart(cart)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean updateCart(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Cart> findCart(String userid) {
		String sql="and user_id="+userid;
		List<Cart> list = cartdao.findCarts(sql);
		return list;
	}

	@Override
	public boolean delCart(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}

}
