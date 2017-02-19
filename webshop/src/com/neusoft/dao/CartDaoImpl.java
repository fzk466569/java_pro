package com.neusoft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neusoft.common.DBUtil;
import com.neusoft.entity.Cart;

public class CartDaoImpl implements CartDaoI {

	@Override
	public boolean addCart(Cart cart) {
		Connection conn=DBUtil.getConn();
		PreparedStatement ps=null;
		String sql="insert into fzk_cart(product_id,product_num,user_id) values(?,?,?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, cart.getProductId());
			ps.setString(2, cart.getProductNum());
			ps.setString(3, cart.getUserId());
			
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
	public boolean delCart(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCart(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Cart> findCarts(String string) {
		List<Cart> list=new ArrayList<Cart>();
		Connection conn=DBUtil.getConn();
		//SQL执行器对象
		PreparedStatement ps=null;
		//结果集对象
		ResultSet rs=null;
		
		try {
			String sql = "select * from fzk_cart where 1=1 "+string;
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next())
			{
				Cart cart=new Cart();
				cart.setCartId(rs.getString("cart_id"));
				cart.setProductId(rs.getString("product_id"));
				cart.setProductNum(rs.getString("product_num"));
				cart.setUserId(rs.getString("user_id"));
				list.add(cart);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeRes(rs, ps, conn);
		}
		return list;
	}

}
