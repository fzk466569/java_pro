package com.neusoft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.neusoft.common.DBUtil;
import com.neusoft.entity.Admin;

public class AdminDaoImpl implements AdminDaoI {

	@Override
	public boolean findOneAdmin(Admin admin) {
		Connection conn=DBUtil.getConn();
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="select * from fzk_admin where username=? and password=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, admin.getUserName());
			ps.setString(2, admin.getPassword());
			rs = ps.executeQuery();
			if(rs.first())
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
	public boolean update(Admin admin) {
		boolean b=false;
		Connection conn=DBUtil.getConn();
		PreparedStatement ps=null;
		String sql="update fzk_admin set username=?,password=? where id=1";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, admin.getUserName());
			ps.setString(2, admin.getPassword());
			int a=ps.executeUpdate();
			if(a>0)
			{
				b=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeRes(ps, conn);
		}
		return b;
	}


	@Override
	public Admin findOneAdmin() {
		Connection conn=DBUtil.getConn();
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="select * from fzk_admin where id=1";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next())
			{
				Admin admin=new Admin();
				admin.setId(rs.getString("id"));
				admin.setUserName(rs.getString("username"));
				admin.setPassword(rs.getString("password"));

				return admin;
			}else{
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeRes(ps, conn);
		}
		return null;
	}
}
