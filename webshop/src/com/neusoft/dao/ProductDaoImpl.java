package com.neusoft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neusoft.common.DBUtil;
import com.neusoft.entity.Product;

public class ProductDaoImpl implements ProductDaoI {

	@Override
	public boolean addProduct(Product pro) {
		Connection conn=DBUtil.getConn();
		PreparedStatement ps=null;
		String sql="insert into fzk_product(product_name,product_text,product_keys,product_price,product_stock,product_logo)"+
				"values(?,?,?,?,?,?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, pro.getName());
			ps.setString(2, pro.getText());
			ps.setString(3, pro.getKeys());
			ps.setString(4, pro.getPrice());
			ps.setString(5, pro.getStock());
			ps.setString(6, pro.getLogo());
			
			int a=ps.executeUpdate();//此方法用于改变数据库数据，返回影响的行数
			if(a>0)
			{
				return true;
			}else{
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeRes(ps, conn);
		}
		return false;
	}

	@Override
	public List<Product> findProduct(String string) {
		List<Product> list=new ArrayList<Product>();
		Connection conn=DBUtil.getConn();
		//SQL执行器对象
		PreparedStatement ps=null;
		//结果集对象
		ResultSet rs=null;
		
		try {
			String sql = "select * from fzk_product where 1=1"+string;
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next())
			{
				Product pro=new Product();
				pro.setId(rs.getString("product_id"));
				pro.setKeys(rs.getString("product_keys"));
				pro.setName(rs.getString("product_name"));
				pro.setPrice(rs.getString("product_price"));
				pro.setStock(rs.getString("product_stock"));
				pro.setText(rs.getString("product_text"));
				pro.setLogo(rs.getString("product_logo"));
				list.add(pro);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeRes(rs, ps, conn);
		}
		return list;
	}

	@Override
	public boolean findOnePro(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product findOnePro(String id) {
		Connection conn=DBUtil.getConn();
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="select * from fzk_product where product_id=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next())
			{
				Product pro=new Product();
				pro.setId(rs.getString("product_id"));
				pro.setKeys(rs.getString("product_keys"));
				pro.setName(rs.getString("product_name"));
				pro.setPrice(rs.getString("product_price"));
				pro.setStock(rs.getString("product_stock"));
				pro.setText(rs.getString("product_text"));
				pro.setLogo(rs.getString("product_logo"));
				return pro;
			}else{
				return null;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeRes(ps, conn);
		}
		
		return null;
	}

	@Override
	public boolean update(Product product) {
		boolean b=false;
		Connection conn=DBUtil.getConn();
		PreparedStatement ps=null;
		
		String sql="update fzk_product set product_name=?,product_text=?,product_keys=?,"+
				"product_logo=?,product_price=?,product_stock=? where product_id=?";
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, product.getName());
			ps.setString(2, product.getText());
			ps.setString(3, product.getKeys());
			ps.setString(4, product.getLogo());
			ps.setString(5, product.getPrice());
			ps.setString(6, product.getStock());
			ps.setString(7, product.getId());

			int a=ps.executeUpdate();
			if(a>0)
			{
				b=true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeRes(ps, conn);
		}
		return b;
	}

	@Override
	public boolean insert(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProduct(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProduct(Product product) {
		boolean b=false;
		Connection conn=DBUtil.getConn();
		PreparedStatement ps=null;
		String sql="delete from fzk_product where product_id=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, product.getId());
			int a=ps.executeUpdate();
			if(a>0)
			{
				b=true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeRes(ps, conn);
		}
		return b;
	}

	@Override
	public Product findOneProByName(String name) {
		Connection conn=DBUtil.getConn();
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="select * from fzk_product where product_name=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			rs = ps.executeQuery();
			if(rs.next())
			{
				Product pro=new Product();
				pro.setId(rs.getString("product_id"));
				pro.setKeys(rs.getString("product_keys"));
				pro.setName(rs.getString("product_name"));
				pro.setPrice(rs.getString("product_price"));
				pro.setStock(rs.getString("product_stock"));
				pro.setText(rs.getString("product_text"));
				pro.setLogo(rs.getString("product_logo"));
				return pro;
			}else{
				return null;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeRes(ps, conn);
		}
		return null;
	}

}
