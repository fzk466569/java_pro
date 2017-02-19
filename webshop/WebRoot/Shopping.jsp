<%@ page language="java" import="java.util.*,com.neusoft.entity.Product,com.neusoft.entity.Users" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
    <title>支付页面</title>
<link type="text/css" rel="stylesheet" href="style/style1.css" />
  </head>
  
  <body>
  
	<% 
    	Product pro=(Product)request.getAttribute("pro");
    	Users users=(Users)request.getAttribute("users");
    	String num=(String)request.getAttribute("num");
    %>
    
<div class="quick_menu">
<span class="fl"><img src="images/LOGO2.png"/ ></span>
	<div class="width980">
		
		<div class="fr top_r">
						<a href="login.html" title="登录">登录</a>
			<a href="reg.html" title="注册">免费注册</a>
				
			<a href="#" title="我的订单" class="scj">我的订单</a>
			<a href="#" title="帮助中心">帮助中心</a>
				
		</div>
		<div class="clear"></div>
	</div>
</div>


<div class="clear"></div>
<div class="nav">
	<ul>
	<li class="sel" style="width:240px; position:relative;z-index:999" id="menu_nav">
		<h3 class="all"><a>全部商品分类</a></h3>
		<div class="fl_index" id="menu_html" style="display:none">
									<div class="fenlei_li">
				<div class="fenlei_h3"><a href="http://10.25.134.98/product/list-1" title="tsadf" class="i1">tsadf</a></div>
				<div class="js_right" style="display:none">
					<p class="strong">选择分类：</p>
									</div>
			</div>
					</div>
	</li>
	<li><h3><a href="http://10.25.134.98/" title="首页">首页</a></h3></li>
		
		<li><h3><a href="#" title="网站公告" >网站公告</a></h3></li>
		
		</ul>
</div>
<div class="clear"></div><div class="content">
	<div class="liucheng">我的购物车</div>
	<div class="mat10">
		<form method="post" id="form" action="jiaoQianServlet">
		<div class="gouwuche">
			<table width="100%" border="0" cellspacing="0" cellpadding="0" class="gwc_tb">
			<tr>
				<th width="200" style="padding-left:30px">关键词</th>
				<th width="200">商品编号</th>
				<th width="200">商品名称</th>
				<th width="200">缩略图</th>
				<th width="200">商品价格</th>
				<th width="200">商品数量</th>
				<th width="200">商品总价</th>
			</tr>
			<tr align="center">
				<td><%=pro.getKeys() %></td>
				<td><%=pro.getId() %></td>
				<td><%=pro.getName() %></td>
				<td><img src=<%="http://127.0.0.1:8888/neusoftwebshop"+pro.getLogo() %> class="picture"></td>
				<td><%=pro.getPrice() %></td>
				<td><%=num %></td>
				<td><%=pro.getPrice() %>*<%=num %></td>
			</tr>
	</table>
	
		</div>
		<div class="fukuan">
			
			<div class="fk_tb">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				
			</table>
			</div>
			<div class="clear"></div>			
		</div>
		<div style="border:1px #ddd solid; padding:10px 20px; margin-top:10px;">
			<h3 class="shxx_tt">付款方式</h3>
			<table width="50%" border="0" cellspacing="0" cellpadding="0" class="shxx mat10">
												<tr>
				<td width="60" align="right"><input type="radio" name="order_payway" id="alipay" value="alipay" checked="checked" /></td>
				<td width="90"><label for="alipay">支付宝</label></td>
				
			</tr>
												<tr>
				<td width="60" align="right"><input type="radio" name="order_payway" id="bank" value="bank"  /></td>
				<td width="190"><label for="bank">线下转账/汇款</label></td>
				
			</tr>
												<tr>
				<td width="60" align="right"><input type="radio" name="order_payway" id="cod" value="cod"  /></td>
				<td width="190"><label for="cod">货到付款</label></td>
				
			</tr>
			<tr>
				<td width="60" align="right"><input type="radio" name="order_payway" id="ebank" value="ebank"  /></td>
				<td width="190"><label for="ebank">&nbsp;网银在线</label></td>
				
			</tr>
						</table>
			<h3 class="shxx_tt mat10">收货信息</h3>
			<div class="shxx mat10">
				<table width="80%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td width="120" style="text-align:right;"><span class="cred1">*</span> 配送区域：</td>
					<td style="text-align:left;">
						<select name="info[category_id]" class="inputselect" style="width:60px">
							<option value="0">山西</option>
							<option value="0">天津</option>
						<select name="city" id="city" class="inputselect"></select>
							<select name="info[category_id]" class="inputselect" style="width:60px">
								<option value="0">太原</option>
								<option value="0">天津</option>
						<span id="province_show"></span> <span id="city_show"></span>
					</td>
				</tr>
				<tr>
					<td style="text-align:right;"><span class="cred1">*</span> 收货地址： </td>
					<td style="text-align:left;"><input type="text" name="user_address" value="" class="inputall input400"> <span id="user_address_show"></span></td>
				</tr>
				<tr>
					<td style="text-align:right;"><span class="cred1">*</span> 收货姓名： </td>
					<td style="text-align:left;"><input type="text" name="user_tname" value="" class="inputall input150"> <span id="user_tname_show"></span></td>
				</tr>
				<tr>
					<td style="text-align:right;"><span class="cred1">*</span> 联系电话： </td>
					<td style="text-align:left;"><input type="text" name="user_phone" value="" class="inputall input150"> <span id="user_phone_show"></span></td>
				</tr>
				<tr>
					<td style="text-align:right;">用户留言： </td>
					<td style="text-align:left;"><textarea class="inputtext" name="order_text" style="width:400px;height:80px"></textarea></td>
				</tr>
				<tr>
					<td style="text-align:right;"></td>
					<td style="text-align:left;"><input type="hidden" name="pesubmit" />
				<input type="submit" value="提交订单" style="width:15%;height:30px; margin-left:60%;margin-bottom:30px;margin-top:30px"></td>
				</tr>
				</table>
			</div>
		</div>
		</form>
	</div>
</div>

<div class="clear"></div>
<div class="width980">
<p class='mat5'><a href='#' target='_blank'><img src="images/xuanchuan.png" style="width:100%;"/></a></p></div>
<div class="foot">
		<div class="bottom_link mat10">
		<div class="border_link">
												<div class="item_1 fl">
				<h3>购物指南</h3>
				<ul>
										<li><a href="#" title="用户注册">用户注册</a></li>
										<li><a href="#" title="购物流程">购物流程</a></li>
										<li><a href="#" title="常见问题">常见问题</a></li>
									</ul>
			</div>
												<div class="item_1 fl">
				<h3>配送方式</h3>
				<ul>
										<li><a href="#" title="配送时间及运费">配送时间及运费</a></li>
										<li><a href="#" title="验货与签收">验货与签收</a></li>
										<li><a href="#" title="订单查询">订单查询</a></li>
									</ul>
			</div>
												<div class="item_1 fl">
				<h3>支付方式</h3>
				<ul>
										<li><a href=# title="在线支付">在线支付</a></li>
										<li><a href="#" title="货到付款">货到付款</a></li>
										<li><a href="#" title="转账汇款">转账汇款</a></li>
									</ul>
			</div>
												<div class="item_1 fl">
				<h3>售后服务</h3>
				<ul>
										<li><a href="#" title="售后政策">售后政策</a></li>
										<li><a href="#" title="退货说明">退货说明</a></li>
										<li><a href="#" title="取消订单">取消订单</a></li>
									</ul>
			</div>
												<div class="item_1 fl">
				<h3>关于我们</h3>
				<ul>
										<li><a href="#" title="公司简介">公司简介</a></li>
										<li><a href="#" title="联系我们">联系我们</a></li>
										<li><a href="#" title="诚聘英才">诚聘英才</a></li>
									</ul>
			</div>
						<div class="clear"></div>
		</div>
	</div>
	
	<div class="subnav">
			<p>咨询热线：18468888888　咨询QQ：88888888　</p>
		<p>Powered by <a href="http://www.phpshe.com" target="_blank" title="魁魁儿家具商城系统" class="cgreen">魁魁儿家具</a></p>
	</div>
</div>

  </body>
</html>
