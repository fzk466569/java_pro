package com.neusoft.service;

import java.util.List;

import com.neusoft.entity.Cart;
import com.neusoft.entity.Users;


public interface CartI {

	public boolean addCartI(Cart cart);

	public boolean updateCart(Cart cart);

	public List<Cart> findCart(String userid);
	
	public boolean delCart(Cart cart);
	
}
