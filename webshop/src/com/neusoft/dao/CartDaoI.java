package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.Cart;

public interface CartDaoI {
	public boolean addCart(Cart cart);
	
	public boolean delCart(Cart cart);
	
	public boolean updateCart(Cart cart);
	
	public List<Cart> findCarts(String str);
}
