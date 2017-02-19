<%@ page language="java" import="java.util.*,com.neusoft.entity.Product" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
<style type="text/css">
td{
width:10%;
height: 30px;
text-align: center;
}
.picture{
width: 50px;
height: 30px;
}
</style>
    <title>My JSP 'ProManage.jsp' starting page</title>
  </head>
  
  <body>
	<%
		List<Product> list = (List<Product>) request.getAttribute("list");
	%>
	<table border="1px">
		<tr>
			<td>商品编号</td>
			<td>关键词</td>
			<td>缩略图</td>
			<td>缩略图路径</td>
			<td>商品名称</td>
			<td>商品价格</td>
			<td>商品库存</td>
			<td>商品描述</td>
			<td>操作</td>
		</tr>
		<%
			for (Product pro : list) {
		%>
		<tr>
			<td><%=pro.getId()%></td>
			<td><%=pro.getKeys()%></td>
			<td><img src=<%="http://127.0.0.1:8888/neusoftwebshop"+pro.getLogo() %> class="picture"></td>
			<td><%=pro.getLogo()%></td>
			<td><%=pro.getName()%></td>
			<td><%=pro.getPrice()%></td>
			<td><%=pro.getStock()%></td>
			<td><%=pro.getText()%></td>
			<td><a href="ProductServlet?id=<%=pro.getId()%>&flag=del">删除</a>
				<a href="ProductServlet?id=<%=pro.getId()%>&flag=update">修改</a>
			</td>
		</tr>
		<%
			}
		%>
	</table>
			<form action="admin/AddProduct.jsp">
				<input type="hidden" name="flag" value="add">
				<button type="submit" style="width: 80px;height:30px;margin-top: 20px;margin-left: 80px;">添加商品</button>
			</form>
	    
  </body>
</html>
