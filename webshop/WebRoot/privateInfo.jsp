<%@ page language="java" import="java.util.*,com.neusoft.entity.Users" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>个人信息</title>
<link type="text/css" rel="stylesheet" href="style/privateInfo.css" />
<style type="text/css">
.tijiao{
    background: url(images/btn.gif) no-repeat;
    width: 70px;
    height: 30px;
    text-align: center;
    line-height: 30px;
    color: #fff;
    border: 0;
    font-size: 14px;
    font-weight: bold;
    cursor: pointer;
}
</style>
  </head>
  <body>
  <%
  	Users user=(Users)request.getAttribute("users");
  %>
    <div class="quick_menu">
	<div class="width980">
		<span class="fl">欢迎来到魁魁儿家具商城！</span>
		<div class="fr top_r">
						您好：<a href="login.html" style="color:#DF002F;padding-left:0"><%=user.getUserName() %></a>
				
			<a href="CartServlet?flag=select&userid=<%=user.getUserId()%>">购物车</a>
			<a href="#">帮助中心</a>
						<a href="">退出</a>
		</div>
		<div class="clear"></div>
	</div>
</div>
<div class="width980">
	<div class="header">
		
		<div class="sear fr">
			<form method="post" action="">
			</form>
		</div>
	</div><div class="hy_table">
		<form method="post" id="form">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td style="text-align:right;" width="150">用 户 名：</td>
			<td><%=user.getUserName() %></td>
		</tr>
		
		<tr>
			<td style="text-align:right;"> 密 码 ：</td>
			<td><input type="text" name="user_tname" value="<%=user.getPassword() %>" class="inputall input200" /></td>
		</tr>
		<tr>
			<td style="text-align:right;">联系电话：</td>
			<td><input type="text" name="user_phone" class="inputall input200" value=<%=user.getTel() %>/> <span id="user_phone_show"></span></td>
		</tr>
		
		<tr>
			<td style="text-align:right;">常用邮箱：</td>
			<td><input type="text" name="user_email" class="inputall input200"  value=<%=user.getEmail() %> /> <span id="user_email_show"></span></td>
		</tr>
		<tr>
			<td style="text-align:right;">注册日期：</td>
			<td><%=user.getCreateDate()%></td>
		</tr>
		<tr>
			<td></td>
			<td>
				<input type="sumbit" value="提交" class="tijiao" />
			</td>
		</tr>
		</table>
		</form>
		</div>
	</div>

  </body>
</html>
