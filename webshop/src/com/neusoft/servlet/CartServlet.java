package com.neusoft.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Cart;
import com.neusoft.entity.Product;
import com.neusoft.entity.Users;
import com.neusoft.service.CartI;
import com.neusoft.service.CartImpl;
import com.neusoft.service.ProductI;
import com.neusoft.service.ProductImpl;
import com.neusoft.service.UserI;
import com.neusoft.service.UserImpl;

@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	public CartServlet() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String flag=request.getParameter("flag");
		String userid=request.getParameter("userid");
		
		CartI carti=new CartImpl();
		List<Cart> list=carti.findCart(userid);
		if(flag.equals("select")){
			request.setAttribute("list", list);
			request.getRequestDispatcher("cartList.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId=request.getParameter("userid");
		String proId=request.getParameter("proid");
		String proStock=request.getParameter("prostock");
		
		Cart cart=new Cart();
		cart.setProductId(proId);
		cart.setProductNum(proStock);
		cart.setUserId(userId);
		
		UserI useri=new UserImpl();
		ProductI proi=new ProductImpl();
		
		Users users=useri.getUsersById(userId);
		Product pro=proi.getProById(proId);
		
		CartI carti=new CartImpl();
		carti.addCartI(cart);
		
		request.setAttribute("users", users);
		request.setAttribute("pro", pro);
		request.setAttribute("num", proStock);
		request.getRequestDispatcher("Shopping.jsp").forward(request, response);
	}

}
