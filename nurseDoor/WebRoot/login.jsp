<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String host = request.getScheme() + "://" + request.getServerName()
			+ ":" + request.getServerPort() + "/";
%>

<html>

<head>

<title>护士上门后台管理系统</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="login/css/reset.css">
<link rel="stylesheet" href="login/css/style.css" media="screen"
	type="text/css" />
<script type="text/javascript" src="login/js/three.min.js"></script>
<link rel="stylesheet" href="login/css/bodycss.css" media="screen"
	type="text/css" />
<script type="text/javascript" src="login/css/jquery-2.1.1.min.js.js"></script>
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<LINK rel="Bookmark" href="img/ic_launcher_user.png">
<LINK rel="Shortcut Icon" href="img/ic_launcher_user.png" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<!-- <link href="css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="css/H-ui.login.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="lib/Hui-iconfont/1.0.7/iconfont.css" rel="stylesheet" type="text/css" /> -->
</head>
<body
	style="background-image: url(login/img/02.png); font-family: '微软雅黑'; overflow: hidden;">
	<div class=""
		style="background-color: #FFFFFF; width: 100%; height: 8%; position: fixed; display: inline;">
		<div
			style="color: #666666; margin-top: 1.2%; margin-left: 5%; float: left;">
			<img alt="" src="login/img/01.png">
		</div>
		<div
			style="color: #666666; margin-top: 1.5%; margin-left: 1%; float: left;">
			<img alt="" src="login/img/04.png">
		</div>
		<div
			style="color: #666666; margin-top: 1.2%; margin-left: 1%; float: left;">
			<span
				style="color: #666666; font-family: sans-serif; font-size: 30px; font-family: '微软雅黑';">护士上门V1.0后台管理系统</span>
		</div>
	</div>
	<ul class="bg-bubbles"
		style="position: absolute; z-index: -1; margin-bottom: -100%">
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
	</ul>

	<div id="window">
		<div class="page page-front" id="image">
			<div class="page-content">
				<div class="input-row ">
					<label class="label fadeIn">用户名&nbsp;:</label> <input id="username"
						name="user_acc" id="username" type="text"
						class="input fadeIn delay1" />
					<!-- <!--data-fyll="pineapple"-->
				</div>
				<div class="input-row">
					<label class="label fadeIn delay2">密码&nbsp;:</label> <input
						id="password" name="user_pwq" type="text" placeholder="请输入密码"
						autocomplete="off" onfocus="this.type='password'"
						onKeyUp="if(event.keyCode == 13){f1();}"
						class="input fadeIn delay3" />
					<!--data-fyll="hackmeplease"-->
				</div>
				<div class="input-row perspective">
					<button id="submit" onclick="f1()"
						onKeyUp="if(event.keyCode == 13){f1();}"
						class="button load-btn fadeIn delay4">
						<span class="default"><i class="ion-arrow-right-b"></i>登录</span>
						<div class="load-state">
							<div class="ball"></div>
							<div class="ball"></div>
							<div class="ball"></div>
						</div>
					</button>
				</div>
				<div id="title" class="input-row"
					style="margin-top: -9%; display: none;">
					<span class="button" id='sp1'
						style="background: rgba(0, 0, 0, 0.0) !important;"></span>
				</div>
			</div>
		</div>

	</div>

	<script type="text/javascript" src='login/js/jquery.js'></script>
	<script type="text/javascript" src="login/js/index.js"></script>
	<div style="text-align: center;"></div>
	<script type="text/javascript">
		//监听回车事件
		document.onkeydown = function() {

			if (event.keyCode == 13) {
				//这里提交你的表单
				document.getElementById("login-button").click();
			}
		}

		var xmlhttp;
		function f1() {
			var nm = $("#username").val();
			var pwd = $("#password").val();
			xmlhttp = null;
			if (window.XMLHttpRequest) {// code for all new browsers
				xmlhttp = new XMLHttpRequest();
			} else if (window.ActiveXObject) {// code for IE5 and IE6
				xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
			}
			if (xmlhttp != null) {
				xmlhttp.onreadystatechange = jiantingguocheng;
				xmlhttp.open("POST", "${pageContext.request.contextPath}/dologin.action?useracc=" + nm + "&userpwd=" + pwd, true);
				xmlhttp.send();
			} else {
				alert("浏览器不支持");
			}
		}
		function jiantingguocheng() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
				var result = xmlhttp.responseText;
				if (result == "1") {
					$("#title").show();
					document.getElementById("sp1").innerHTML = "<font color= red>账号或密码错误！</font>";
				} else {
					$("#title").show();
					document.getElementById("sp1").innerHTML = "<font color= green>恭喜您，登录成功！</font>";
					window.location.href = "index.jsp";
					/* location.href = "${pageContext.request.contextPath}/selectOrderStatisticsDataQuantity.action"; */

				}
			} else {
				$("#title").show();
				document.getElementById("sp1").innerHTML = "<font color = blue>验证中...请稍后</font>";
			}
		}
	</script>
</body>

</html>