package com.neusoft.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Admin;
import com.neusoft.service.AdminI;
import com.neusoft.service.AdminImpl;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public AdminServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String flag=request.getParameter("flag");
		AdminI admini = new AdminImpl();
		if(flag.equals("update")){
			showAdmin(request, response, admini);
		}else{
			showAdmin(request, response, admini);
		}
	}

	private void showAdmin(HttpServletRequest request, HttpServletResponse response, AdminI admini)
			throws ServletException, IOException {
		
		Admin admin = admini.findAdmin();
		
		request.setAttribute("admin", admin);

		request.getRequestDispatcher("admin/adminList.jsp").forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	public void init() throws ServletException {
		// Put your code here
	}
}
