package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.bean.Student;
import com.util.BaseConnection;

public class StudentDAO {
	public ArrayList<Student> getList()
	{
		ArrayList<Student> st=new ArrayList<Student>();
		Connection conn=BaseConnection.getConnection();
		//SQL执行器对象
		PreparedStatement ps=null;
		//SQL结果集对象
		ResultSet rs=null;
		String sql="select * from student";
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next())
			{
				Student s=new Student();
				s.setId(rs.getInt("id"));
				s.setAge(rs.getInt("age"));
				s.setName(rs.getString("name"));
				s.setGander(rs.getInt("gander"));
				st.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
				try {
					if(rs!=null)
						rs.close();
					if(ps!=null)
						ps.close();
					if(conn!=null)
						conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}
		return st;
	}
	
	public ArrayList<Student> getListAll()
	{
		ArrayList<Student> st=new ArrayList<Student>();
		Connection conn=BaseConnection.getConnection();
		//SQL执行器对象
		PreparedStatement ps=null;
		//SQL结果集对象
		ResultSet rs=null;
		String sql="select * from student,info where student.gander=info.id";
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next())
			{
				Student s=new Student();
				s.setId(rs.getInt("id"));
				s.setAge(rs.getInt("age"));
				s.setName(rs.getString("name"));
				s.setGander(rs.getInt("gander"));
				s.setType(rs.getString("type"));
				st.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseConnection.closeRes(rs, ps, conn);
		}
		return st;
	}
	
	public boolean insert(Student s){
		Connection conn=BaseConnection.getConnection();
		PreparedStatement ps=null;
		int n=0;
		String sql="insert into student(name,age,gander) values(?,?,?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, s.getName());
			ps.setInt(2, s.getAge());
			ps.setInt(3, s.getGander());
			n=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseConnection.closeRes(ps, conn);
		}
		if(n>0)
		{
			return true;
		}else{
			return false;
		}
	}
	
	public boolean update(Student s)
	{
		Connection conn=BaseConnection.getConnection();
		PreparedStatement ps=null;
		int n=0;
		String sql="update student set name=?,age=?,gander=? where id=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, s.getName());
			ps.setInt(2, s.getAge());
			ps.setInt(3,s.getGander());
			ps.setInt(4, 10);
			n=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseConnection.closeRes(ps, conn);
		}
		if(n>0){
			return true;
		}else{
			return false;
		}
	}
			
	public boolean delete(int id){
		Connection conn=BaseConnection.getConnection();
		PreparedStatement ps=null;
		int n=0;
		String sql="delete from student where id=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			n=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseConnection.closeRes(ps, conn);
		}
		if(n>0){
			return true;
		}else{
			return false;
		}
		
	}
	
	public static void main(String[] args)
	{	
//		Student st=new Student();
		StudentDAO sd=new StudentDAO();
//		st.setName("樊志魁");
//		st.setGander(1);
//		st.setAge(200);
//		if(sd.update(st))
//		{
//			System.out.println(312);
//		}
		if(sd.delete(10))
		{
			System.out.println(321321312);
		}
		ArrayList<Student> al=new StudentDAO().getListAll();
		for (Student s : al) {
			System.out.println(s.getId()+" "+s.getName()+" "+s.getType()+" "+s.getAge());
		}
	}
}
