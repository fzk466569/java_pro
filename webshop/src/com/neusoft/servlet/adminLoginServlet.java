package com.neusoft.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Admin;
import com.neusoft.service.AdminImpl;

@WebServlet("/adminLoginServlet")
public class adminLoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String UserName=request.getParameter("username");
			String Password=request.getParameter("password");
			Admin admin=new Admin();
			admin.setUserName(UserName);
			admin.setPassword(Password);
						
			if(new AdminImpl().login(admin)){
				response.sendRedirect("admin/main.html");
			}else{
				response.sendRedirect("admin/login.html");
			}
	}
}
