<%@ page language="java" import="java.util.*,com.neusoft.entity.Users" pageEncoding="UTF-8"%>

<html>
  <head>
    
    <title>My JSP 'userChange.jsp' starting page</title>
  </head>
  
  <body>
    <%
		Users users = (Users) request.getAttribute("users");
	%>
	<form action="UserChangePassServlet" method="post">
		<input type="hidden" name="userid" value=<%=users.getUserId() %>><br>
		<input type="hidden" name="username" value=<%=users.getUserName() %>><br>
	密码：<input type="text" name="password" value="" ><br>
	确认密码：<input type="text" name="confirm" value="" ><br>
	<input type="submit" value="提交">
	</form>
  </body>
</html>
