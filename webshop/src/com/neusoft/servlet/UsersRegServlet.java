package com.neusoft.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Users;
import com.neusoft.service.UserI;
import com.neusoft.service.UserImpl;

@WebServlet("/UsersRegServlet")
public class UsersRegServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public UsersRegServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); 
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String UserName = request.getParameter("username");
		String PassWord = request.getParameter("password");
		String Confirm = request.getParameter("confirm");
		String Tel = request.getParameter("tel");
		String Email = request.getParameter("email");
		
		
		Users users=new Users();
		users.setUserName(UserName);
		users.setPassword(PassWord);
		users.setEmail(Email);
		users.setTel(Tel);
		
		UserI useri=new UserImpl();
		
		if(useri.regUser(users) && Confirm.equals(PassWord)){
			response.sendRedirect("login.html");
		}else{
			response.sendRedirect("reg.html");
		}
	}
}
