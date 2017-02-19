package com.neusoft.service;

import java.util.List;

import com.neusoft.entity.Product;

public interface ProductI {
	
	public boolean addPro(Product pro);
	
	public boolean delPro(Product pro);
	
	public List<Product> getPro();

	public boolean updatePro(Product pro);
	
	public Product getProById(String id);

	public Product getProByName(String str);
}
