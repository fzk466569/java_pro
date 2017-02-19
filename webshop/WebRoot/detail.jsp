<%@ page language="java" import="java.util.*,com.neusoft.entity.Product,com.neusoft.entity.Users" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="UTF-8">
<title>魁魁儿家居城</title>
</head>
<style type="text/css">
.nav{
	width: 100%;
	height: 33px;
	clear: left;
	background-color:#FAFAD2;
	background-repeat: no-repeat;
    background-size: 100%;
}
.a{
    margin:0 0;
    width:100%;
    background-color:white;
    background-repeat: no-repeat;
    background-size: 100%;
    height:400px;
}
.b{
    margin:0 50px;
    width:50%;
    background-color:white;
    height:250px;
    padding:50px 100px 50px 30px;
    float:right; 
}
.z{
	width: 100%;
	height: 1500px;
	clear: left;
	background-color:white;
	background-repeat: no-repeat;
    background-size: 100%;
}
.right{
font-size:26px;margin-left:20px;font-family:'SimHei'
}
.left1{
font-size:24px;margin-left:20px;font-family:'SimHei'
}
</style>
<body>

    <% 
    	Product pro=(Product)request.getAttribute("pro");
    	Users users=(Users)request.getAttribute("users");
    %>

<div class="logo"><img alt="" src="images/LogoBig.png"></div>
<div class="nav"></div>
<div class="a"><br>
<p>
<img src="http://127.0.0.1:8888/neusoftwebshop<%=pro.getLogo() %>" width="300" height="300" style="position:absolute;left:150px;"/>
</p>
<form action="CartServlet" method="post">
	<div class="b">
	<label class="left1">商品描述：</label><label class="right"><%=pro.getText() %></label><br>
	<label class="left1">参考价格：</label><label class="right" style="color: red;"><%=pro.getPrice() %></label><label>元</label><br>
	<label class="left1">产品颜色：</label><label class="right">红色      蓝色     黄色</label><br>
	<label class="left1">产品品牌：</label><label class="right">魁魁儿</label><br>
	<label class="left1">产品材质：</label><label class="right">*******</label><br>
	<label class="left1">人气推荐：</label><label class="right" style="color: red;">☆☆☆☆☆</label><br>
	<label class="left1">商品库存：</label><label class="right" style="color: red;"><%=pro.getStock() %></label>件<br>
	<label class="left1">购买数量：</label><input name="prostock" placeholder="1" type="text" style="width: 50px;"></label><lable>件</lable><br>
	 <input type="hidden" name="proid" value=<%=pro.getId() %>>
	 <input type="hidden" name="userid" value=<%=users.getUserId() %>>
	 <input value="提交订单" style="width:15%;margin-top: 25px;margin-left: 160px;" type="submit"></div>
 </form>
</div>

<div class="nav">
<table style="position:absolute;margin-left:0px;margin-top:8px;background:#F0E68C;width:80%;position:absolute;left:140px">
			<tr>
			<td><a href="" style="text-decoration:none;">图文详情</a></td>
			<td><a href="" style="text-decoration:none;">产品参数</a></td>
			<td><a href="" style="text-decoration:none;">商品评价</a></td>
			<td><a href="" style="text-decoration:none;">相似推荐</a></td>
			</tr>
		</table>
</div>
<div class="z">
<p>

<img src="images/yizi4.png"   style="position:absolute;left:300px"/>
</p>
</div>


</body>
</html>
