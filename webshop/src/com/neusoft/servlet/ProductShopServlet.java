package com.neusoft.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Product;
import com.neusoft.entity.Users;
import com.neusoft.service.ProductI;
import com.neusoft.service.ProductImpl;
import com.neusoft.service.UserI;
import com.neusoft.service.UserImpl;

@WebServlet("/ProductShopServlet")
public class ProductShopServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public ProductShopServlet() {
		super();
	}

	public void destroy() {
		super.destroy();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String proId=request.getParameter("proid");
		String userId=request.getParameter("userid");
		
		UserI useri=new UserImpl();
		ProductI proi=new ProductImpl();
		
		Users users=useri.getUsersById(userId);
		Product pro=proi.getProById(proId);
		
		request.setAttribute("pro", pro);
		request.setAttribute("users", users);
		request.getRequestDispatcher("detail.jsp").forward(request, response);
		
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	public void init() throws ServletException {
		// Put your code here
	}

}
