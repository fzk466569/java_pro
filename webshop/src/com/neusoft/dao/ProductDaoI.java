package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.Product;

public interface ProductDaoI {
	public boolean addProduct(Product product);
	public List<Product> findProduct(String string);
	public boolean findOnePro(Product product);
	public Product findOnePro(String id);
	public boolean update(Product product);
	public boolean insert(Product product);
	public boolean deleteProduct(String id);
	public boolean deleteProduct(Product product);
	public Product findOneProByName(String str);
}
