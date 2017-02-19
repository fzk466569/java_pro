<%@ page language="java" import="java.util.*,com.neusoft.entity.Product" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    <title>添加商品</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  
	<%
		Product	pro = (Product) request.getAttribute("pro");
	%>
	<div class="bgimg"></div>
<div class="pagetop">
	<div class="head">
	
		<div class="clear"></div>
	</div>
</div>
<div class="content">
	<div class="main">
		
					</div><div class="right">
	
	<form method="post" enctype="multipart/form-data" action="ProductServlet">
	
	<table width="100%" border="0" cellspacing="0" cellpadding="0" class="wenzhang mat20 menu_table">
	<tr>
		<td align="right">商品名称：</td>
		<td colspan="3"><input type="text" name="product_name" value="111" class="inputall input600" maxlength="36" /></td>
		<td rowspan="5" valign="top" style="text-align:left;">
			<img src="" width="160" height="160" style="border:1px solid #e4e4e4;margin-left:30px; display:block;" />
			<p class="mat5"><input type="file" name="product_logo" size="12" style="width:150px;margin-left: 30px;" /></p>
		</td>
	</tr>
	<tr>
		<td align="right">所属分类：</td>
		<td>
			<select name="info[category_id]" class="inputselect" style="width:240px">
			<option value="0">==========请选择分类=========</option>
						<option value="1" >简约</option>
						<option value="1" >美式</option>
						<option value="1" >中式</option>
						<option value="1" >欧式</option>
						<option value="1" >地中海</option>
						<option value="1" >北欧</option>
						<option value="1" >韩式</option>
						<option value="1" >复古</option>
						<option value="1" >意式</option>
						<option value="1" >设计师</option>
						</select>
		</td>
		
	</tr>
	<tr>
		<td width="140" align="right">本店价格：</td>
		<td width="240"><input type="text" name="product_smoney" value=<%=pro.getPrice()%> class="inputall input100"/> <span class="c888">元</span></td>
		
	</tr>
	<tr>
		<td align="right">关键词：</td>
		<td><input type="text" name="product_key" value=<%=pro.getKeys()%> class="inputall input100" /> <span class="c888">件</span></td>
	</tr>
	<tr>
		<td align="right">剩余库存：</td>
		<td><input type="text" name="product_num" value=<%=pro.getStock()%> class="inputall input100" /> <span class="c888">件</span></td>
	</tr>
		<tr>
		<td align="right">商品详情：</td>
		<td colspan="5" style="padding:10px">
			<textarea name="product_text" id="editortext" style="width:400px;height:250px"></textarea>		
		</td>
	</tr>
	</table>
	<table width="100%" border="0" cellspacing="0" cellpadding="0" class="wenzhang mat20 menu_table" style="display:none">
	<tr>
		</tr>
	<tr>
		<td align="right">页面描述：</td>
		<td><textarea name="info[product_desc]" style="width:500px;height:100px;"></textarea> <span class="c888">（SEO选项）</span></td>
	</tr>
	</table>
	<div class="mat10 mab10">
		<input type="hidden" name="proid" value=<%=pro.getId() %> />
		<input type="hidden" name="flag" value="update" />
		<input type="submit" value="提 交" style="margin-left:325px" />
	</div>
	</form>
</div>
<style type="text/css">
#rule_html th{padding:3px 5px; border:1px #e5e5e5 solid; border-right:0; border-left:0; font-weight:normal;}
#rule_html td{padding:5px}
</style>
<script type="text/javascript" charset="utf-8">
var editor;
KindEditor.ready(function(K) {
	editor = K.create('#editortext', {
		allowFlashUpload :false,
		afterBlur: function(){
			this.sync();
		}
	});
});
$(function(){
	$(":button").click(function(){
		var kong_num = rule_num = 0;
		if ($(":input[name='prorule_key[]']").length > 0) {
			$("#rule_html").find(":input").each(function(){
				if ($(this).attr("disabled") == "disabled" || $(this).is(":hidden")) return true;
				if ($(this).val() == '') kong_num++;
			})
			if (kong_num > 0) {
				alert('规格属性尚未填写完全');
				return;
			}
		}
		$("form").submit();
	})
	$(".now a").click(function(){
		var _index = $(this).index();
		$(".now a").removeClass("sel");	
		$(this).addClass("sel");
		$(".menu_table").hide().eq(_index).show();
	})
	$("#product_rule").click(function(){
		url = "admin.php?mod=product&act=rule";
		if ($(":input[name='prorule_key[]']").length > 0) {
			var prorule_key = new Array();
			$(":input[name='prorule_key[]']").each(function(){
				prorule_key.push($(this).val());
			})
			prorule_key = prorule_key.join(',');
			url += "&prorule_key="+ prorule_key;
		}
		art.dialog.open(url, {title:'选择规格', width: 720, height: 400, id: 'product_rule'});
	})	
	$(".rule_del").live("click", function(){
		if ($("#rule_html tr").length <= 2) {
			$("#rule_html tr").remove();
		}
		else {
			$(this).parent().parent("tr").remove();
		}
	})
})
function move_left(obj) {
    var current = $(obj).parent();
    var prev = current.prevAll(":visible").first();
	var current_other = $(":input[name='"+current.attr("id")+"[]']").parent();
   	var prev_other;
	if (current.index()>0) {
		current.insertBefore(prev);
		current_other.each(function(){
			prev_other = $(this).prevAll(":visible").first();
			$(this).insertBefore(prev_other);
		})
	}
}  
function move_right(obj) {
    var current = $(obj).parent();
    var next = current.nextAll(":visible").first();
	var current_other = $(":input[name='"+current.attr("id")+"[]']").parent();
    var prev_other;
	var num = $(obj).parent().parent().find("td").length;
    if (current.index()<num-4) {
		current.insertAfter(next);
		current_other.each(function(){
			prev_other = $(this).nextAll(":visible").first();
			$(this).insertAfter(prev_other);
		})
	}
}
</script>
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
</script>
  </body>
</html>
