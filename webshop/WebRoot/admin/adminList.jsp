<%@ page language="java" import="java.util.*,com.neusoft.entity.Admin" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    <title>管理列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
  <% 
  	Admin admin=(Admin)request.getAttribute("admin");
  %>
	<p>账号:<%=admin.getUserName() %><br>
	<p>密码:<%=admin.getPassword() %><br>
	<p>
	<form action="UserChangePassServlet" method="post">
	账号：<input type="text" name="password" value=<%=admin.getUserName() %> ><br>
	密码：<input type="password" name="password" value=<%=admin.getPassword() %> ><br>
	确认密码：<input type="password" name="confirm" value="" ><br>
	<input type="submit" value="提交">
	</form>
  </body>
</html>
