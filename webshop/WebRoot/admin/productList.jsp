<%@ page language="java" import="java.util.*,com.neusoft.entity.Product" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>商品列表</title>
    <link type="text/css" rel="stylesheet" href="../style/style.css" />
  </head>
  
  <body>
	<%
		List<Product> list = (List<Product>) request.getAttribute("list");
	%>
	<div class="bgimg"></div>
<div class="pagetop" style="margin-left: 100px">
	<img src="images/LOGOsmall.png" style="height: 100%"/>
					</div><div class="right">
	<div class="now">
		<a href="#" class="sel">商品列表</a>
		<div class="clear"></div>
	</div>
	<div class="search">
		<form method="get">
		<input type="hidden" name="mod" value="product" />
		<input type="hidden" name="filter" value="" />
		商品名称：<input type="text" name="name" value="" class="inputtext input200" />

		
		<input type="submit" value="搜索" class="input2" />
		</form>
	</div>
	<form method="post" id="form">
	<table border="0" cellspacing="0" cellpadding="0" class="list">
	<tr>
		<th class="bgtt" width="10"><input type="checkbox" name="checkall" onclick="pe_checkall(this, 'product_id')" /></th>
		<th class="bgtt" width="50">ID号</th>
		<th class="bgtt" width="40"></th>
		<th class="bgtt" width="50">商品名称</th>
		<th class="bgtt" width="90">商品分类</th>
		<th class="bgtt" width="80">品牌名称</th>
		<th class="bgtt" width="60">单价</th>
		<th class="bgtt" width="50">数量</th>
		<th class="bgtt" width="50">金额</th>
		<th class="bgtt" width="90">操作</th>
	</tr>
		<tr>
		<td><input type="checkbox" name="product_id[]" value="2" /></td>
		<td>2</td>
		<td style="padding:5px 7px"><img src="http://10.25.134.98/data/cache/thumb/2016-10/thumb_40x40_nopic.gif" width="40" height="40" class="imgbg" /></td>	
		<td class="aleft" style="padding-left:0"><a class="cblue" href="http://10.25.134.98/product/2" target="_blank"></a></td>
		<td class="font13"></td>
		<td class="font13"></td>
		<td><span class="num corg">1</span></td>
		<td class="num"><span class="cred strong">1</span></td>
		<!--<td class="num">0</td>-->
		<td>

					</td>
		<td style="padding-left:50px">
		</td>
		<td>
		<a href="" class="admin_edit mar5">修改</a>
		<a href="" class="admin_del">删除</a>
		</td>
	</tr>
		<tr>	

		<td><input type="checkbox" name="product_id[]" value="1" /></td>
		<td>1</td>
		<td style="padding:5px 7px"></td>	
		<td class="aleft" style="padding-left:0"><a class="cblue" href="http://10.25.134.98/product/1" target="_blank"></a></td>
		<td class="font13"></td>
		<td class="font13"></td>
		<td><span class="num corg">1</span></td>
		<td class="num"><span >1</span></td>
		<!--<td class="num">0</td>-->

		<td style="padding-left:50px">
		<a href="" class="admin_edit mar5">修改</a>
		<a href="" class="admin_del">删除</a>
		</td>
	</tr>
	</table>
	</form>
</div>
  </body>
</html>
