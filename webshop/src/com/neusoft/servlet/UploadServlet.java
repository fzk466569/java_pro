package com.neusoft.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;


@WebServlet("/UploadServlet")
@MultipartConfig(maxFileSize = 1024 * 1024 * 10)
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UploadServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		Part part=request.getPart("photo");
		//定义一个上传路径
		String path=request.getServletContext().getRealPath("/upload");
		System.out.println(path);
		String file=part.getHeader("content-disposition");
		//filename="a.jpg"
		System.out.println(file);
		String fileSuffix=FilenameUtils.getExtension(StringUtils.substringBetween(file, "filename=\"", "\""));
		System.out.println(fileSuffix);
		//构建一个文件名 日期时间 UUID.randomUUID().toString()
		Date date=new Date();
		String filename=date.getTime()+"."+fileSuffix;
		
		part.write(path+"/"+filename);
		System.out.println(path+"/"+filename);
	}
}
