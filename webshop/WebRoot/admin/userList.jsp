<%@ page language="java" import="com.neusoft.entity.*,java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
td{
width:10%;
height: 30px;
text-align: center;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Users> list = (List<Users>) request.getAttribute("list");
	%>

	<table border="1">
		<tr>
			<td>用户编号</td>
			<td>用户</td>
			<td>密码</td>
			<td>电话</td>
			<td>邮箱</td>
			<td>操作</td>
		</tr>
		<%
			for (Users users : list) {
		%>
		<tr>
			<td><%=users.getUserId()%></td>
			<td><%=users.getUserName()%></td>
			<td><%=users.getPassword()%></td>
			<td><%=users.getTel()%></td>
			<td><%=users.getEmail()%></td>
			<td><a href="UsersServlet?id=<%=users.getUserId()%>&flag=del">删除</a>
				<a href="UsersServlet?id=<%=users.getUserId()%>&flag=update">修改</a>
			</td>
		</tr>
		<%
			}
		%>
	</table>
	<form action="admin/AddUsers.jsp">
				<input type="hidden" name="flag" value="add">
				<button type="submit" style="width: 80px;height:30px;margin-top: 20px;margin-left: 80px;">添加用户</button>
			</form>
</body>
</html>