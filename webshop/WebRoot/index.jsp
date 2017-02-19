<%@ page language="java" import="java.util.*,com.neusoft.entity.Users" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>欢迎光临魁魁儿家居商城</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="style/index.css" />
  </head>
  <body>

<%
	Users user=(Users)request.getAttribute("users");
%>
		<div id="top">
			<div id="top_nav" class="kuan">
				<ul>
					<li>
						<a href="#">简约</a>
					</li>
					<li>|</li>
					<li>
						<a href="#">美式</a>
					</li>
					<li>|</li>
					<li>
						<a href="#">中式</a>
					</li>
					<li>|</li>
					<li>
						<a href="#">地中海</a>
					</li>
					<li>|</li>
					<li>
						<a href="#">欧式</a>
					</li>
					<li>|</li>
					<li>
						<a href="#">北欧</a>
					</li>
					<li>|</li>
					<li>
						<a href="#">韩式</a>
					</li>
					<li>|</li>
					<li>
						<a href="#">复古</a>
					</li>
					<li>|</li>
					<li>
						<a href="#">意式</a>
					</li>
					<li>|</li>
					<li>
						<a href="#">设计师</a>
					</li>
				</ul>
				<div id="gouwuche">购物车（0）</div>
				<div id="top_you">
					<ul>
						<li>
							<a href="UsersServlet?flag=select&Id=<%=user.getUserId()%>">个人信息</a>
						</li>
						<li>
							<a href="login.html">登录</a>
							<% out.print(session.getAttribute("username"));%>
						</li>
						<li>|</li>
						<li>
							<a href="reg.html">注册</a>
						</li>
						<li>|</li>
						<li>
							<a href="#">消息通知</a>
						</li>
						<li>|</li>
						<li>
							<a href="liuyan.html">留言</a>
						</li>
					</ul>
				</div>

			</div>
		</div>
		<div class="kuan">
			<div class="logo"></div>
			<div id="head_nav">
				<ul>
					<li>桌子</li>
					<li>沙发</li>
					<li>衣柜</li>
					<li>床垫</li>
					<li></li>
					<li>椅子</li>
					<li>货架</li>
					<li>茶几</li>
					<li>其他</li>
				</ul>
			</div>
			<form id="search">
				<input id="search_kuang" /><input id="search_button" type="button" />
				<div>
					<a>家具特惠</a>
					<a>双11直降100 </a>
				</div>
			</form>
		</div>
		<div id="main" class="kuan">
			<ul>
				<li>客厅  </li>
				<li> 餐厅 </li>
				<li>卧房</li>
				<li>书房</li>
				<li>办公家具</li>
				<li>儿童家具</li>
				<li>家居百货</li>
				<li>家居日用</li>
				<li>精品家纺</li>
				<li>家居饰品</li>
			</ul>
			<div id="jiantou"></div>
			<div id="jiantou2"></div>
		</div>
		<div class="kuan" id="disanhang">
			<div id="heikuang">
				<div class="kuangneirong" id="kuangneirong1"><span>个人购买</span></div>
				<div class="kuangneirong" id="kuangneirong2"><span>企业团购</span></div>
				<div class="kuangneirong" id="kuangneirong3"><span>送货入门</span></div>
				<div class="kuangneirong" id="kuangneirong4"><span>免费安装</span></div>
				<div class="kuangneirong" id="kuangneirong5"><span>以旧换新</span></div>
				<div class="kuangneirong" id="kuangneirong6"><span>售后保障</span></div>
			</div>
			<div id="kuang_right">
				<ul>
					<li id="kuang_right_1"></li>
					<li id="kuang_right_2"></li>
					<li id="kuang_right_3"></li>
				</ul>
			</div>
		</div>
		<div id="xiaomistar" class="kuan">
			
		<div id="shangpingzhanshi" class="kuan">
			<div class="zhinengyingjian">
				<p class="zhinengyingjianp1">小型家具</p>
				<div></div>
				<p class="zhinengyingjianp2">查看全部</p>
			</div>
			<div class="shangpinglan">
				<div class="shangpinglanleft">
					<div>
						<img src="./images/ba.png" />
					</div>
				</div>
				<div class="shangpinglanright">
					<ul>
						<li>
							<a href="ProductShopServlet?proid=34&userid=<%= user.getUserId() %>"><img src="./images/chair.jpg"/></a>
							<a href="index.html">椅子</a>
							<p class="desc"></p>
							<p class="price">149元</p>
							<div class="flag1">免邮费</div>
						</li>
						<li>
							<a href="ProductShopServlet?proid=35&userid=<%= user.getUserId() %>">
							<img src="./images/dengzi.png"/></a>
							<a href="index.html">凳子</a>
							<p class="desc">折叠便携设计</p>
							<p class="price">29元</p>
							<div class="flag2">新品</div>
						</li>
						<li>
							<img src="./images/liangyijia.jpg">
							<a href="index.html">晾衣架</a>
							<p class="desc">包邮</p>
							<p class="price">19元</p>
						</li>
						<li>
							<img src="./images/xiegui.jpg">
							<a href="index.html">鞋柜</a>
							<p class="desc">包邮</p>
							<p class="price">199元</p>
						</li>
					</ul>
					<ul>
						<li>
							<img src="./images/yimaojia.png">
							<a href="index.html">衣帽架</a>
							<p class="desc">包邮</p>
							<p class="price">199元</p>
							<div class="flag2">新品</div>
						</li>
						<li>
							<img src="./images/zhiwujia.png">
							<a href="index.html">置物架</a>
							<p class="desc">包邮</p>
							<p class="price">199元</p>
							<div class="flag1">免邮费</div>
						</li>
						<li>
							<img src="./images/jiugui.jpg">
							<a href="index.html">酒柜</a>
							<p class="desc">包邮</p>
							<p class="price">499元</p>
							<div class="flag1">免邮费</div>
						</li>
						<li>
							<img src="./images/canbiangui.jpg">
							<a href="index.html">餐边柜</a>
							<p class="desc">包邮</p>
							<p class="price">169元</p>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<div id="dapei" class="kuan">
			<div class="biaoti">
				<p class="biaoti1">搭配</p>
				<div class="biaoti2">
					<ul>
						<li>鞋帽</li>
						<li>衣物</li>
						<li>床垫</li>
						<li>书柜</li>
					</ul>
				</div>
			</div>
			
					</div>
				</div>
				<div id="site">
				<div class="sitetop">
					<ul>
						<li class="bbb1"><img src="./images/yuyueweixiu.png">预约维修服务</li>
						<li class="bbb1"><img src="./images/7tiantui.jpg">7天无理由退货</li>
						<li class="bbb1"><img src="./images/mianfeitui.png">15天免费换货</li>
						<li class="bbb1"><img src="./images/150.jpg">满150元包邮</li>
						<li class="bbb2"><img src="./images/LOGO2.png">520余家售后网点</li>
					</ul>
				</div>
				<div class="sitebottom">
					<div class="sitebottomleft">
						<dl>
							<dt>帮助中心</dt>
							<dd>账户管理</dd>
							<dd>购物指南</dd>
							<dd>订单操作</dd>
						</dl>
						<dl>
							<dt>服务支持</dt>
							<dd>售后政策</dd>
							<dd>自助服务</dd>
							<dd>相关下载</dd>
						</dl>
						<dl>
							<dt>线下门店</dt>
							<dd>魁儿之家</dd>
							<dd>零售网点</dd>
							<dd>服务网点</dd>
						</dl>
						<dl>
							<dt>关于小魁</dt>
							<dd>了解小魁</dd>
							<dd>加入小魁</dd>
							<dd>联系我们</dd>
						</dl>
						<dl>
							<dt>关注我们</dt>
							<dd>新浪微博</dd>
							<dd>小魁部落</dd>
							<dd>官方微信</dd>
						</dl>
						<dl>
							<dt>特色服务</dt>
							<dd>F码通道</dd>
							<dd>小魁连锁</dd>
							<dd>防伪查询</dd>
						</dl>
					</div>
					<div class="sitebottomright">
						<p class="phone">400-100-5678</p>
						<p class="ccc">
							周一至周日 8:00-18:00<br>
							（仅收市话费）
						</p>
						<div>24小时在线客服</div>
					</div>
				</div>
			</div>
			<div class="ddd kuan">
					<div class="logo2"></div>
					<div class="dddp1">
						<a>魁魁商城</a><span class="sep2">|</span>
						<a>KK</a><span class="sep2">|</span>
						<a>魁聊</a><span class="sep2">|</span>
						<a>多功能</a><span class="sep2">|</span>
						<a>魁魁家具</a><span class="sep2">|</span>
						<a>视频电话</a><span class="sep2">|</span>
						<a>小魁后院</a><span class="sep2">|</span>
						<a>小魁天猫店</a><span class="sep2">|</span>
						<a>小魁淘宝直营店</a><span class="sep2">|</span>
						<a>小魁网盟</a><span class="sep2">|</span>
						<a>问题反馈</a><span class="sep2">|</span>
						<a>SelectRegion</a>
						<p>
							kui.com 京ICP证110507号 京ICP备10046444号京公网安备11010802020134号 京网文[2014]0059-0009号<br>
							 违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试
						</p>
					</div>
					<img src="images/LOGO2.png">
					<img src="images/LOGO2.png">
					<img src="images/LOGO2.png">
					<img src="images/LOGO2.png">
					<div class="dddp2">探索家具之家，小魁为你选择</div>
				</div>
  </body>
</html>
