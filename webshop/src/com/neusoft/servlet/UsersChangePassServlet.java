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

@WebServlet("/UsersChangePassServlet")
public class UsersChangePassServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public UsersChangePassServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String UserId = request.getParameter("userid");
		String UserName=request.getParameter("username");
		String PassWord = request.getParameter("password");
		String Confirm = request.getParameter("confirm");
		
		Users users=new Users();
		users.setUserId(UserId);
		users.setPassword(PassWord);
		users.setUserName(UserName);
		
		UserI useri=new UserImpl();
		if(Confirm.equals(PassWord)){
			useri.update(users);
			response.sendRedirect("UsersServlet");
		}else{
			request.setAttribute("users", users);
			request.getRequestDispatcher("admin/userChange.jsp").forward(request, response);
		}
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
