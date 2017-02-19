package com.neusoft.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Users;
import com.neusoft.service.UserI;
import com.neusoft.service.UserImpl;

@WebServlet("/UsersServlet")
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UsersServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String flag = request.getParameter("flag");
		UserI useri = new UserImpl();
		String id = request.getParameter("Id");
		
		if ("del".equals(flag)) {
			if (useri.deleteUsers(id)) {
				showUser(request, response, useri);
			}
		} else if ("update".equals(flag)) {
			Users users = useri.getUsersById(id);
			request.setAttribute("users", users);
			request.getRequestDispatcher("admin/userChange.jsp").forward(request, response);
		} else if("select".equals(flag)){
			Users users = useri.getUsersById(id);
			request.setAttribute("users", users);
			request.getRequestDispatcher("privateInfo.jsp").forward(request, response);
			
		} else {
			showUser(request, response, useri);
		}
	}

	private void showUser(HttpServletRequest request, HttpServletResponse response, UserI useri)
			throws ServletException, IOException {
		
		List<Users> list = useri.findUsers();
		
		request.setAttribute("list", list);

		request.getRequestDispatcher("admin/userList.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String flag = request.getParameter("flag");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		Users users = new Users();

		users.setUserName(username);
		users.setPassword(password);
		users.setEmail(email);
		users.setTel(tel);
		UserI useri = new UserImpl();
		
		
		if ("update".equals(flag)) {
			String userid = request.getParameter("userid");
			users.setUserId(userid);
			if (useri.update(users)) {
				System.out.println(flag);
				showUser(request, response, useri);
			}
		} else {
			if (useri.regUser(users)) {
				showUser(request, response, useri);
			}
			if("add".equals(flag)){
				useri.regUser(users);
				response.sendRedirect("UsersServlet");
			}
		}
	}
}
