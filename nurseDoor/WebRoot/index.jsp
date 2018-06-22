<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
	+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
	String host = request.getScheme() + "://" + request.getServerName()
            + ":" + request.getServerPort() + "/";
	
	String userNick = (String)session.getAttribute("userNick");
	String adminUserId = (String)session.getAttribute("adminUserId");
	Integer adminUsergrade = 100;
	%>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<LINK rel="Bookmark" href="img/ic_launcher_user.png" >
<LINK rel="Shortcut Icon" href="img/ic_launcher_user.png" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link href="css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="lib/Hui-iconfont/1.0.7/iconfont.css" rel="stylesheet" type="text/css" />
<link href="skin/default/skin.css" rel="stylesheet" type="text/css" id="skin" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>护士上门后台管理系统 v1.0</title>
<meta name="keywords" content="">
<meta name="description" content="">
</head>
<body style="font-family: '微软雅黑';">
<%if(adminUserId == null || "".equals(adminUserId)){%>
	<%@ include file="loginCheck.jsp" %>
<%}else{
	adminUsergrade = (Integer)session.getAttribute("adminUsergrade");
}%>
<%@ include file="loginCheck.jsp" %>
<header class="Hui-header cl"> <a class="Hui-logo l" title="H-ui.admin v1.0" href="/">护士上门后台</a> <a class="Hui-logo-m l" href="/" title="H-ui.admin"></a> <span class="Hui-subtitle l">V1.0</span>
	<nav class="mainnav cl" id="Hui-nav">
		<!-- <ul>
			<li class="dropDown dropDown_click"><a href="javascript:;" aria-expanded="true" aria-haspopup="true" data-toggle="dropdown" class="dropDown_A"><i class="Hui-iconfont">&#xe600;</i> 新增 <i class="Hui-iconfont">&#xe6d5;</i></a>
				<ul class="dropDown-menu radius box-shadow">
					<li><a href="javascript:;" onclick="article_add('添加资讯','article-add.html')"><i class="Hui-iconfont">&#xe616;</i> 资讯</a></li>
					<li><a href="javascript:;" onclick="picture_add('添加资讯','picture-add.html')"><i class="Hui-iconfont">&#xe613;</i> 图片</a></li>
					<li><a href="javascript:;" onclick="product_add('添加资讯','product-add.html')"><i class="Hui-iconfont">&#xe620;</i> 产品</a></li>
					<li><a href="javascript:;" onclick="member_add('添加用户','member-add.html','','510')"><i class="Hui-iconfont">&#xe60d;</i> 用户</a></li>
				</ul>
			</li>
		</ul> -->
	</nav>
	<ul class="Hui-userbar">
	<%if(adminUsergrade == 0 ){ %>
	<li>超级管理员</li>
	<%} %>
	<%if(adminUsergrade == 1 ){ %>
	<li>管理员</li>
	<%} %>
	<%if(adminUsergrade == 2 ){ %>
	<li>内容编辑员</li>
	<%} %>
	<%if(adminUsergrade == 9 ){ %>
	<li>客服</li>
	<%} %>
		
		<li class="dropDown dropDown_hover"><a href="#" class="dropDown_A"><%=userNick %> <i class="Hui-iconfont">&#xe6d5;</i></a>
			<ul class="dropDown-menu radius box-shadow">
				<li><a href="#">个人信息</a></li>
				<li><a href="execute.action">切换账户</a></li>
				<li><a href="execute.action">退出</a></li>
			</ul>
		</li>
		<%--<li id="Hui-msg"> <a href="#" title="消息"><span class="badge badge-danger">1</span><i class="Hui-iconfont" style="font-size:18px">&#xe68a;</i></a> </li>
		--%><li id="Hui-skin" class="dropDown right dropDown_hover"><a href="javascript:;" title="换肤"><i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i></a>
			<ul class="dropDown-menu radius box-shadow">
				<li><a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
				<li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
				<li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
				<li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
				<li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
				<li><a href="javascript:;" data-val="orange" title="绿色">橙色</a></li>
			</ul>
		</li>
	</ul>
	<a href="javascript:;" class="Hui-nav-toggle Hui-iconfont" aria-hidden="false">&#xe667;</a> </header>
<aside class="Hui-aside">
	<input runat="server" id="divScrollValue" type="hidden" value="" />
	<div class="menu_dropdown bk_2">
	
	<%if(adminUsergrade <=1 || "9".equals(adminUsergrade)){ %>
	<dl id="menu-order">
			<dt><i class="Hui-iconfont">&#xe63a;</i>认证管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
						<li><a _href="${pageContext.request.contextPath}/selectAllNurseInfodistrict.action" data-title="护士管理" href="javascript:void(0)">护士认证</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-article">
			<dt><i class="Hui-iconfont">&#xe616;</i>用户管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a _href="${pageContext.request.contextPath}/selectAllNurseInfo.action" data-title="护士管理" href="javascript:void(0)">护士管理</a></li>
					<li><a _href="${pageContext.request.contextPath}/selectAllUserInfo.action" data-title="用户管理" href="javascript:void(0)">用户管理</a></li>
					<li><a _href="${pageContext.request.contextPath}/selectHospitalAndMajor.action" data-title="人工注册" href="javascript:void(0)">人工注册</a></li>
				</ul>
			</dd>
		</dl>
		<%} %>
		<%if(adminUsergrade != 2 && !"2".equals(adminUsergrade)){ %>
		<dl id="menu-picture">
			<dt><i class="Hui-iconfont">&#xe613;</i> 订单管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a _href="${pageContext.request.contextPath}/OrderList.action?state=9" data-title="订单管理" href="javascript:void(0)">订单管理</a></li>
					<li><a _href="${pageContext.request.contextPath}/OrderListWaitSet.action" data-title="等待发放的订单" href="javascript:void(0)">等待发放的订单</a></li>
				</ul>
			</dd>
		</dl>
		<%} %>
		
		<%if(adminUsergrade < 9){ %>
		 <dl id="menu-product">
			<dt><i class="Hui-iconfont">&#xe627;</i> 产品管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<!-- <li><a _href="product-brand.html" data-title="品牌管理" href="javascript:void(0)">品牌管理</a></li>
					<li><a _href="product-category.html" data-title="分类管理" href="javascript:void(0)">分类管理</a></li> -->
					<!-- <li><a _href="selectcontentall.action" data-title="服务管理" href="javascript:void(0)">服务管理</a></li> -->
					<li><a _href="SelectProjectAll.action" data-title="护理服务" href="javascript:void(0)">护理服务</a></li>
					<li><a _href="WebselectNoteAll.action" data-title="备注管理" href="javascript:void(0)">备注管理</a></li>

				</ul>
			</dd>
		</dl> 
		<%} %>
		 <%if(adminUsergrade <= 2){ %>
		 <dl id="menu-product">
			<dt><i class="Hui-iconfont">&#xe620;</i> 医院和专业管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<!-- <li><a _href="product-brand.html" data-title="品牌管理" href="javascript:void(0)">品牌管理</a></li>
					<li><a _href="product-category.html" data-title="分类管理" href="javascript:void(0)">分类管理</a></li> -->
					<li><a _href="selecthospitalallweb.action" data-title="医院管理" href="javascript:void(0)">医院管理</a></li> 
					<li><a _href="selectsimplemajorall.action" data-title="专业管理" href="javascript:void(0)">专业管理</a></li>
					<!-- <li><a _href="WebselectNoteAll.action" data-title="备注管理" href="javascript:void(0)">备注管理</a></li> -->

				</ul>
			</dd>
		</dl> 
		<%} %>
		<%if(adminUsergrade < 2){ %>
		<dl id="menu-page">
			<dt><i class="Hui-iconfont">&#xe626;</i> 客户端管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
				<li><a _href="roolPicLook.action" data-title="首页轮播" href="javascript:void(0)">首页轮播</a></li> 
				<li><a _href="goodServiceRecommendLook.action" data-title="精品推荐" href="javascript:void(0)">精品推荐</a></li>
				<li><a _href="${pageContext.request.contextPath}/selectcostTraffic.action" data-title="交通费" href="javascript:void(0)">费用管理</a></li>
				<li><a _href="${pageContext.request.contextPath}/selectCustomerServicePhone.action" data-title="客服电话管理" href="javascript:void(0)">客服电话管理</a></li>
				<li><a _href="${pageContext.request.contextPath}/selectTimingControl.action" data-title="待处理订单时间控制" href="javascript:void(0)">待处理订单时间控制</a></li>
				</ul>
			</dd>
		</dl>
		<%} %>
		
		<%if(adminUsergrade < 9){ %>
		
		<dl id="menu-picture">
			<dt><i class="Hui-iconfont">&#xe618;</i>学术圈管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a _href="PostroolPicLook.action" data-title="首页轮播" href="javascript:void(0)">学术圈首页轮播</a></li> 
					<li><a _href="${pageContext.request.contextPath}/selectOnePostInfo.action" data-title="学术圈管理" href="javascript:void(0)">学术圈管理</a></li>
					<li><a _href="${pageContext.request.contextPath}/goToPostInfoList.action" data-title="帖子管理" href="javascript:void(0)">帖子管理</a></li>
					<li><a _href="${pageContext.request.contextPath}/gotosendPostInfo.action" data-title="发帖" href="javascript:void(0)">发帖</a></li>
				</ul>
			</dd>
		</dl>
		<%} %>
		
		<%if(adminUsergrade <= 1 || adminUsergrade == 9){ %>
		<dl id="menu-comments">
			<dt><i class="Hui-iconfont">&#xe622;</i> 投诉管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a _href="${pageContext.request.contextPath}/complaintNurselook.action" data-title="意见反馈" href="javascript:void(0)">投诉反馈</a></li>
					<li><a _href="complaint-new-customer-service.jsp" data-title="新建投诉" href="javascript:;">新建投诉</a></li>
				</ul>
			</dd>
		</dl> 
		<%} %>
	<%if(adminUsergrade <= 1){ %>
		<dl id="menu-member">
			<dt><i class="Hui-iconfont">&#xe60d;</i> 优惠券管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a _href="${pageContext.request.contextPath}/couponAllInfo.action" data-title="优惠券管理" href="javascript:;">优惠券管理</a></li>
					<li><a _href="${pageContext.request.contextPath}/redPacketsInfo.action" data-title="浏览记录" href="javascript:void(0)">红包管理</a></li>
					<%--<li><a _href="member-record-download.html" data-title="下载记录" href="javascript:void(0)">下载记录</a></li>
					<li><a _href="member-record-share.html" data-title="分享记录" href="javascript:void(0)">分享记录</a></li>
				--%></ul>
			</dd>
		</dl> 
	<%} %>	
	
		<%if(adminUsergrade <=1){%>
		<dl id="menu-admin">
			<dt><i class="Hui-iconfont">&#xe62d;</i> 管理员管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<%--<li><a _href="admin-role.html" data-title="角色管理" href="javascript:void(0)">角色管理</a></li>
					<li><a _href="admin-permission.html" data-title="权限管理" href="javascript:void(0)">权限管理</a></li>
					--%><li><a _href="${pageContext.request.contextPath}/AdminList.action" data-title="管理员列表" href="javascript:void(0)">管理员列表</a></li>
				</ul>
			</dd>
		</dl>
		<%} %>
		
		<%if(adminUsergrade <= 1){ %>
		<dl id="menu-tongji">
			<dt><i class="Hui-iconfont">&#xe61a;</i> 统计管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a _href="${pageContext.request.contextPath}/userStatistics.action?type=1" data-title="用户统计" href="javascript:void(0)">用户统计</a></li>
					<%--<li><a _href="${pageContext.request.contextPath}/orderStatisticsLine.action?orderType=orderCount" data-title="订单统计" href="javascript:void(0)">订单统计</a></li>
					--%><li><a _href="${pageContext.request.contextPath}/capitalStatistics.action" data-title="平台资金统计" href="javascript:void(0)">平台资金统计</a></li>
					<li><a _href="${pageContext.request.contextPath}/capitalplatinfo.action" data-title="角色管理" href="javascript:void(0)">资金明细</a></li>
				</ul>
			</dd>
		</dl>
		<%} %>
		
		<%if(adminUsergrade != 2){ %>
		
		
		<dl id="menu-system">
			<dt><i class="Hui-iconfont">&#xe62e;</i> 提现管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a _href="${pageContext.request.contextPath}/selectUserDrawMoneyNow.action" data-title="用户提现" href="javascript:void(0)">用户提现</a></li>
					<li><a _href="${pageContext.request.contextPath}/selectNurseDrawMoneyNow.action" data-title="护士提现" href="javascript:void(0)">护士提现</a></li>
				</ul>
			</dd>
		</dl> 
		<%} %>
		
		<%if(adminUsergrade <= 1){ %>
		<dl id="menu-system">
			<dt><i class="Hui-iconfont">&#xe62e;</i><a _href="push.jsp" data-title="全局推送" href="javascript:void(0)" style="text-decoration: none;">全局推送</a> <i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
		</dl> 
		<%} %>
		<%if(adminUsergrade <=1 || "9".equals(adminUsergrade)){ %>
		<dl id="menu-system">
			<dt><i class="Hui-iconfont">&#xe62e;</i><a _href="${pageContext.request.contextPath}/selectAllNursingReport.action" data-title="护理报告" href="javascript:void(0)" style="text-decoration: none;">护理报告</a> <i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
		</dl> 
		
		<dl id="menu-system">
			<dt><i class="Hui-iconfont">&#xe62e;</i><a _href="${pageContext.request.contextPath}/selectGoodEvaluateInfoOfKeyWord.action" data-title="评价管理" href="javascript:void(0)" style="text-decoration: none;">评价管理</a> <i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
		</dl> 
		<%} %>
	</div>
</aside>
<div class="dislpayArrow"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
<section class="Hui-article-box">
	<div id="Hui-tabNav" class="Hui-tabNav">
		<div class="Hui-tabNav-wp">
			<ul id="min_title_list" class="acrossTab cl">
				<li class="active"><span title="我的桌面" data-href="welcome.html">我的桌面</span><em></em></li>
			</ul>
		</div>
		<div class="Hui-tabNav-more btn-group"><a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a></div>
	</div>
	<div id="iframe_box" class="Hui-article">
		<div class="show_iframe">
			<div style="display:none" class="loading"></div>
			<iframe scrolling="yes" frameborder="0" src="welcome.jsp"></iframe>
		</div>
	</div>
</section>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script> 
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script> 
<script type="text/javascript">
/*资讯-添加*/
function article_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*图片-添加*/
function picture_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*产品-添加*/
function product_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*用户-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}
</script> 
<%--<script type="text/javascript">
var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "//hm.baidu.com/hm.js?080836300300be57b7f34f4b3e97d911";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s)})();
var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3F080836300300be57b7f34f4b3e97d911' type='text/javascript'%3E%3C/script%3E"));
</script>
--%></body>
</html>