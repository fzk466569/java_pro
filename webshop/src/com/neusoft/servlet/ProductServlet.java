package com.neusoft.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;

import com.neusoft.entity.Product;
import com.neusoft.service.ProductI;
import com.neusoft.service.ProductImpl;

@WebServlet("/ProductServlet")
@MultipartConfig(maxFileSize = 1024 * 1024 * 10)
    public class ProductServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public ProductServlet() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//商品修改，删除，添加
		String flag=request.getParameter("flag");
		String id=request.getParameter("id");
		ProductI proI= new ProductImpl();
		Product pro = proI.getProById(id);
		request.setAttribute("pro", pro);
		if("del".equals(flag)){
			proI.delPro(pro);
			showProduct(request, response, proI);
		}else if("update".equals(flag)){
			
			request.getRequestDispatcher("admin/ChangeProduct.jsp").forward(request, response);

		}else{
			showProduct(request, response, proI);
		}
	}
	
	private void showProduct(HttpServletRequest request, HttpServletResponse response, ProductI proI)
			throws ServletException, IOException {
		
		List<Product> list = proI.getPro();
		request.setAttribute("list", list);
		request.getRequestDispatcher("admin/ProList.jsp").forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Part part=request.getPart("product_logo");
		String path=request.getServletContext().getRealPath("/upload");
		String file=part.getHeader("content-disposition");
		String fileSuffix=FilenameUtils.getExtension(StringUtils.substringBetween(file, "filename=\"", "\""));
		Date date=new Date();
		String filename=date.getTime()+"."+fileSuffix;
		part.write(path+"/"+filename);
		
		String flag=request.getParameter("flag");
		String proId=request.getParameter("proid");
		String proName=request.getParameter("product_name");
		String proPrice=request.getParameter("product_smoney");
		String proStock=request.getParameter("product_num");
		String proText=request.getParameter("product_text");
		String proKey=request.getParameter("product_key");
		String proLogo="/upload/"+filename;

		Product pro=new Product();
		pro.setId(proId);
		pro.setKeys(proKey);
		pro.setName(proName);
		pro.setPrice(proPrice);
		pro.setStock(proStock);
		pro.setText(proText);
		pro.setLogo(proLogo);
		
		ProductI proI=new ProductImpl();
		if(flag != null)
		{
			proI.updatePro(pro);
			showProduct(request, response, proI);
		}else{
			proI.addPro(pro);
			System.out.println("图片地址"+pro.getLogo());
			System.out.println("上传。。。");
			showProduct(request, response, proI);
		}
	}
}
