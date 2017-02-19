<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'AddUsers.jsp' starting page</title>
<style type="text/css">
input{
	margin-top: 30px;
}
</style>
  </head>
  
  <body>
	<form action="../UsersServlet" method="post">
	<div style="margin: 0 auto;">
	    账号：<input type="text" name="username"><br>
	    密码：<input type="password" name="password"><br>
	    邮箱：<input type="text" name="email"><br>
	    电话：<input type="text" name="tel"><br>
	    <input type="hidden" name="flag" value="add">
	    <input type="submit" style="margin-left: 40px">
	    <input type="reset" style="margin-left: 40px">
    </div>
    </form>
  </body>
</html>
