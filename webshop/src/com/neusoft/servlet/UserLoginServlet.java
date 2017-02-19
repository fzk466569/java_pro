package com.neusoft.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neusoft.entity.Users;
import com.neusoft.service.UserImpl;


@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		
		System.out.println("111111111111111");
		
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		
		System.out.println(userName);
		
		session.setAttribute("username", userName);
		session.setAttribute("password", password);
		System.out.println("22222222222222");
		
		Users users=new Users();
		
		users.setUserName(userName);
		users.setPassword(password);
		
		if(new UserImpl().login(users)){
			users=new UserImpl().getUsersByName(userName);
			request.setAttribute("users",users);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else{
			response.sendRedirect("login.html");
		}
	}
}
