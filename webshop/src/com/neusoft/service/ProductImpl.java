package com.neusoft.service;

import java.util.List;

import com.neusoft.dao.ProductDaoI;
import com.neusoft.dao.ProductDaoImpl;
import com.neusoft.entity.Product;

public class ProductImpl implements ProductI {
	
	ProductDaoI proDao=new ProductDaoImpl();
	@Override
	public boolean addPro(Product pro) {
		if (proDao.addProduct(pro)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delPro(Product pro) {
		// TODO Auto-generated method stub
		if(proDao.deleteProduct(pro)){
			return true;
		}
		return false;
	}

	@Override
	public Product getProById(String id) {
		if(proDao.findOnePro(id)!=null){
			return proDao.findOnePro(id);
		}
		return null;
	}

	@Override
	public List<Product> getPro() {
		String sql="";
		List<Product> list = proDao.findProduct(sql);
		return list;
	}

	@Override
	public boolean updatePro(Product pro) {
		// TODO Auto-generated method stub
		if(proDao.update(pro)){
			return true;
		}
		return false;
	}

	@Override
	public Product getProByName(String str) {
		if(proDao.findOnePro(str)!=null){
			return proDao.findOneProByName(str);
		}
		return null;
	}

}
