package com.neusoft.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.neusoft.entity.Users;
import com.neusoft.common.DBUtil;
public class UserDaoImpl implements UserDaoI {
	
	public List<Users> findUsers(String string)
	{

		List<Users> list=new ArrayList<Users>();
		Connection conn=DBUtil.getConn();
		//SQL执行器对象
		PreparedStatement ps=null;
		//结果集对象
		ResultSet rs=null;
		
		try {
			String sql = "select * from users where 1=1"+string;
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next())
			{
				Users users=new Users();
				users.setUserName(rs.getString("username"));
				users.setPassword(rs.getString("password"));
				users.setCreateDate(rs.getFloat("createdate"));
				users.setUserId(rs.getString("userid"));
				users.setEmail(rs.getString("email"));
				users.setTel(rs.getString("tel"));
				list.add(users);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeRes(rs, ps, conn);
		}
		return list;
}
	
	public boolean findOneUser(Users users)
	{
		Connection conn=DBUtil.getConn();
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="select * from users where username=? and password=?";

		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, users.getUserName());
			ps.setString(2, users.getPassword());
			rs = ps.executeQuery();
			if(rs.next())
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
	
	public Users findOneUser(String id){
		Connection conn=DBUtil.getConn();
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="select * from users where userid=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next())
			{
				Users users=new Users();
				users.setUserId(rs.getString("userid"));
				users.setUserName(rs.getString("username"));
				users.setPassword(rs.getString("password"));
				users.setEmail(rs.getString("email"));
				users.setTel(rs.getString("tel"));
				return users;
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

	public void insert(Users users)
	{
		Connection conn=DBUtil.getConn();
		PreparedStatement ps=null;
		String sql="insert into Users(username,password)"+
				"values(?,?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, users.getUserName());
			ps.setString(2, users.getPassword());
			int a=ps.executeUpdate();//此方法用于改变数据库数据，返回影响的行数
			if(a>0)
			{
				System.out.println("添加成功");
			}else{
				System.out.println("添加失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeRes(ps, conn);
		}
			
	}

	//占位符
	public boolean insert1(Users users)
	{
		boolean b=false;
		Connection conn=DBUtil.getConn();
		PreparedStatement ps=null;
		String sql="insert into Users(username,password)"+
				"values("+users.getUserName()+","+users.getPassword()+")";
		try {
			ps=conn.prepareStatement(sql);
			int a=ps.executeUpdate();//此方法用于改变数据库数据，返回影响的行数
			if(a>0)
			{
				b=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeRes(ps, conn);
		}
			return b;
	}

	public boolean update(Users users)
	{
		boolean b=false;
		Connection conn=DBUtil.getConn();
		PreparedStatement ps=null;
		String sql="update users set password=? where userid=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, users.getPassword());
			ps.setString(2, users.getUserId());
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

	public boolean deleteUsers(String id){
		boolean b=false;
		Connection conn=DBUtil.getConn();
		PreparedStatement ps=null;
		String sql="delete from users where userid=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, id);
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
	public boolean addUsers(Users users){
		boolean b=false;
		Connection conn=DBUtil.getConn();
		PreparedStatement ps=null;
		String sql="insert into Users(username,password,createdate,tel,email) values(?,?,?,?,?)";

		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, users.getUserName());
			ps.setString(2, users.getPassword());
			ps.setLong(3, new Date().getTime());
			ps.setString(4, users.getTel());
			ps.setString(5, users.getEmail());

			int a=ps.executeUpdate();
			if(a>0)
			{
				b=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeRes(ps, conn);
		}
			return b;
	}

	@Override
	public Users getOneUser(String name) {
		Connection conn=DBUtil.getConn();
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="select * from users where username=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			rs = ps.executeQuery();
			if(rs.next())
			{
				Users users=new Users();
				users.setUserId(rs.getString("userid"));
				users.setUserName(rs.getString("username"));
				users.setPassword(rs.getString("password"));
				users.setEmail(rs.getString("email"));
				users.setTel(rs.getString("tel"));
				return users;
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