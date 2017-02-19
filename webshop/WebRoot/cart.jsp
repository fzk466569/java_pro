<%@ page language="java" import="java.util.*,com.neusoft.entity.Product" pageEncoding="UTF-8"%>

<%
	Product pro=(Product)request.getAttribute("pro");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>我的购物车</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link type="text/css" rel="stylesheet" href="style/style.css" />
  </head>
  
  <body>
    <div class="bgimg"></div>

		<a href="admin.php?mod=order" class="sel">全部订单（0）</a>
		<a href="admin.php?mod=order&state=notpay" >等待买家付款（0）</a>
		<a href="admin.php?mod=order&state=paid" >等待发货（0）</a>
		<a href="admin.php?mod=order&state=send" >已发货（0）</a>
		<a href="admin.php?mod=order&state=success" >交易成功（0）</a>
		<a href="admin.php?mod=order&state=close" >交易关闭（0）</a>
		<div class="clear"></div>

	<div class="search">
		<form method="get">
			<input type="hidden" name="mod" value="order" />
			<input type="hidden" name="state" value="" />
			订单编号：<input type="text" name="id" value="" class="inputtext input100 mar10" />
			姓名：<input type="text" name="user_tname" value="" class="inputtext input60 mar10" />
			电话：<input type="text" name="user_phone" value="" class="inputtext input80 mar10" />
			帐号：<input type="text" name="user_name" value="" class="inputtext input80 mar10" />
			下单时间：<input type="text" name="date1" value="" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate inputtext" style="width:90px;height:20px;" />	
			至 <input type="text" name="date2" value="" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate inputtext" style="width:90px;height:20px;" />			
			<input type="submit" value="搜索" class="input2" />
		</form>
	</div>
	<table width="100%" border="0" cellspacing="0" cellpadding="0" class="list">
	<tr>
		<th class="bgtt" style="border-bottom:0;" width="600">商品详情</th>
		<th class="bgtt" style="border-bottom:0;" width="100">实付款(元)</th>
		<th class="bgtt" style="border-bottom:0;" width="290">收货信息</th>
		<th class="bgtt" style="border-bottom:0;" width="70">支付状态</th>
		<th class="bgtt" style="border-bottom:0;" width="70">配送状态</th>
		<th class="bgtt" style="border-bottom:0;" width="118">交易操作</th>
	</tr>
	</table>
	<div>
	<table border="2" width="100%" >
  <tr>
    <th>Month</th>
    <th>Savings</th>
     <th>Month</th>
    <th>Savings</th>
     <th>Month</th>
    <th>Savings</th>
  </tr>
  <tr>
    <td style="width:600px">January</td>
    <td style="width:100px">$100</td>
    <td style="width:290px">January</td>
    <td style="width:70px">$100</td>
    <td style="width:70px">January</td>
    <td style="width:118px">$100</td>
   
  </tr>
   <tr>
    <td>January</td>
    <td>$100</td>
    <td>January</td>
    <td>$100</td>
    <td>January</td>
    <td>$100</td>
   
  </tr>
   <tr>
    <td>January</td>
    <td>$100</td>
    <td>January</td>
    <td>$100</td>
    <td>January</td>
    <td>$100</td>
   
  </tr>
</table></div>
		<div class="hy_pay"><div class="fenye"></div></div>
</div>
<script type="text/javascript" src="http://10.25.134.98/include/plugin/my97/WdatePicker.js"></script>
<script charset="utf-8" src="http://10.25.134.98/include/plugin/artdialog/jquery.artDialog.js?skin=chrome"></script>
<script charset="utf-8" src="http://10.25.134.98/include/plugin/artdialog/plugins/iframeTools.js"></script>
		<div class="clear"></div>
	</div>
	<!--<div class="foot">Copyright <span class="num">©</span> 2008-2014 <a target="_blank" href="http://www.phpshe.com">灵宝简好网络科技有限公司</a> 版权所有</div>-->
</div>
<script type="text/javascript">
function win_init() {
	$(".left").add(".right").css("height", $(window).height() - 50);
}
$(function(){
	win_init();
	$(window).resize(function() {
		win_init();
	});
	$(".list").find("td").hover(
		function(){
			if ($(this).hasClass("bgtt") || $(this).is("[nosel=1]")) return;
			$(this).parent("tr").children("td[nosel!=1]").css("background-color", "#FFFFE0");
		},
		function(){
			if ($(this).hasClass("bgtt") || $(this).is("[nosel=1]")) return;
			$(this).parent("tr").children("td[nosel!=1]").css("background-color", "#fff");
		}
	)
})
pe_loadscript("http://10.25.134.98/index.php?mod=notice");
</script>
  </body>
</html>
