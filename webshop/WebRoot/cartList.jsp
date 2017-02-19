<%@ page language="java" import="java.util.*,com.neusoft.entity.Product,com.neusoft.entity.Users" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>购物车</title>
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
  </head>
  
  <body>
    <% 
    	Product pro=(Product)request.getAttribute("pro");
    	Users users=(Users)request.getAttribute("users");
    	String num=(String)request.getAttribute("num");
    %>
    <table border="1px">
		<tr>
			<td>商品编号</td>
			<td>关键词</td>
			<td>缩略图</td>
			<td>商品名称</td>
			<td>商品价格</td>
			<td>商品数量</td>
			<td>商品库存</td>
			<td>商品总价</td>
			<td>操作</td>
		</tr>
		<tr>
			<td><%=pro.getId()%></td>
			<td><%=pro.getKeys()%></td>
			<td><img src=<%="http://127.0.0.1:8888/neusoftwebshop"+pro.getLogo() %> class="picture"></td>
			<td><%=pro.getName()%></td>
			<td><%=pro.getPrice()%></td>
			<td><%=num%></td>
			<td><%=pro.getStock()%></td>
			<td><%=pro.getPrice()%>*<%=num %></td>
			<td><a href="ProductServlet?id=<%=pro.getId()%>&flag=del">删除</a>
			</td>
		</tr>
	</table>
  </body>
</html>
