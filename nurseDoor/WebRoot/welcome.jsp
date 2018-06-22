<!DOCTYPE HTML>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<!-- 分栏 -->
<link href="next/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<link href="next/css/bwizard.min.css" rel="stylesheet" />

<!-- <script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script> -->
<script src="next/js/jquery.min.js" type="text/javascript"></script>
<!--图表  -->
<script type="text/javascript" src="js/churtbootstrap.min.js"></script>
<script type="text/javascript" src="js/app.js"></script>
<script type="text/javascript" src="js/jquery.flot.js"></script>

<link href="css/Chartstyle.css" rel="stylesheet" />
<script src="next/js/bwizard.min.js" type="text/javascript"></script>
<style type="text/css">
td {
	height: 30px
}
.container{
	width: 98%
}
a {
	text-decoration: none !important;
}
</style>
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>我的桌面</title>

</head>
<body style="font-family: '微软雅黑';">
<%if(adminUserId == null || "".equals(adminUserId)){%>
	<%@ include file="loginCheck.jsp" %>
<%}else{
	adminUsergrade = (Integer)session.getAttribute("adminUsergrade");
}%>

<p style="margin-left: 2%" class="f-20 text-success">欢迎使用护士上门 <span class="f-14">v1.0</span>后台管理系统！</p>
<div style="margin-left: 2%">
<!--订单管理  -->
  <table class="table table-border table-bordered table-bg" style="width: 25%;float: left;">
    <thead>
      <tr style="margin-left: 5%">
        <th colspan="7" scope="col" style="font-size: 16px;"><img style="vertical-align: middle;" alt="" src="icon/04.png"> 订单管理<label style="float: right;"><a>查看详情></a></label> </th>
      </tr>
    </thead>
    <tbody>
      <tr class="text-c">
        <td>
        	<ul>
        		<li style="float: left;"><a onclick="waitOrder()">待处理订单</a></li>
        		<li style="float: right;list-style-type: none; ">
        			<input onfocus="this.blur()" style="width: 50px;text-align: right;border: none;"  type="text" id="grantOrder"/>&nbsp;&nbsp;单
        		</li>
        	</ul>
        </td>
      </tr>
      <tr class="text-c">
        <td>
        	<ul>
        		<li style="float: left;"><a onclick="waitPay()">待付款订单</a> </li>
        		<li style="float: right;list-style-type: none;">
        			<input onfocus="this.blur()" style="width: 50px;text-align: right;border: none;"  type="text" id="waitOrder"/>&nbsp;&nbsp;单 
        		</li>
        	</ul>
        </td>
      </tr>
      <tr class="text-c">
        <td>
        	<ul>
        		<li style="float: left;"><a onclick="cancelOrder()">取消的订单</a> </li>
        		<li style="float: right;list-style-type: none;">
        			<input onfocus="this.blur()" style="width: 50px;text-align: right;border: none;"  type="text" id="cancleOrder"/>&nbsp;&nbsp;单
        		</li>
        	</ul>
        </td>
      </tr>
      <tr class="text-c">
        <td>
        	<ul>
        		<li style="float: left;"><a onclick="successOrder()">完成的订单</a> </li>
        		<li style="float: right;list-style-type: none;">
        			<input onfocus="this.blur()" style="width: 50px;text-align: right;border: none;"  type="text" id="successOrder"/>&nbsp;&nbsp;单
        		</li>
        	</ul>
        </td>
      </tr>
    </tbody>
  </table>
  <!--用户管理  -->
  <table class="table table-border table-bordered table-bg" style="width: 25%;margin-top: 1%;margin-left: 28%">
    <thead>
      <tr style="margin-left: 5%">
        <th colspan="7" scope="col" style="font-size: 16px;"><img style="vertical-align: middle;" alt="" src="icon/07.png"> 用户管理<label style="float: right;"><a>查看详情></a></label> </th>
      </tr>
    </thead>
    <tbody>
      <tr class="text-c">
        <td>
        	<ul>
        		<li style="float: left;"><a onclick="userManage()">客户管理</a></li>
        		<li style="float: right;list-style-type: none;">
        			<input onfocus="this.blur()" style="width: 50px;text-align: right;border: none;"  type="text" id="userCount"/>&nbsp;&nbsp;人
        		</li>
        	</ul>
        </td>
      </tr>
      <tr class="text-c">
        <td>
        	<ul>
        		<li style="float: left;"><a onclick="nurseManage()">护士管理</a> </li>
        		<li style="float: right;list-style-type: none;">
					<input onfocus="this.blur()" style="width: 50px;text-align: right;border: none;"  type="text" id="nurseCount"/>&nbsp;&nbsp;人
				</li>
        	</ul>
        </td>
      </tr>
      <tr class="text-c">
        <td>
        	<ul>
        		<li style="float: left;"><a onclick="authenticationManage()">认证管理</a> </li>
        		<li style="float: right;list-style-type: none;">
        			<input onfocus="this.blur()" style="width: 50px;text-align: right;border: none;"  type="text" id="authenticationCount"/>&nbsp;&nbsp;人
				</li>
        	</ul>
        </td>
      </tr>
      <tr class="text-c">
        <td>
        	<ul>
        		<li style="float: left;"><a onclick="nurseregister()">护士注册</a> </li>
        	</ul>
        </td>
      </tr>
    </tbody>
  </table>
 <!--  <table class="table table-border table-bordered table-bg mt-20">
    <thead>
      <tr>
        <th colspan="2" scope="col">服务器信息</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <th width="200">服务器计算机名</th>
        <td><span id="lbServerName">http://127.0.0.1/</span></td>
      </tr>
      
    </tbody>
  </table> -->
  <div class="container" style="float: left;" id="container">
		<div id="wizard">
			<ol>
				<li><a onclick="usersuccess()">用户统计</a></li>
				<li><a onclick="ordersuccess()">订单统计(已完成)</a> </li>
				<li><a onclick="orderHaving()">订单统计(待完成)</a></li>
				<li><a onclick="orderCancle()">订单统计(取消)</a></li>
				<li><a onclick="orderMoney()">金额统计</a></li>
				<li><a onclick="orderevaluate()">评价统计</a></li>
				<li><a onclick="complaintStatistics()">投诉统计</a></li>
			</ol>
			<div>
					<div class="" style="width: 1500px;height: 500px !important">
					<a href="${pageContext.request.contextPath}/selectAllUserInfo.action?condition=month" data-title="用户管理" href="javascript:void(0)">查看详情</a>
					<div class="portlet box red" style="border-color: #007ACC;border-color: #007ACC" >
                        <div class="portlet-title">
                            <div class="caption"><i  style="background-color: #007ACC"></i>本月用户注册数: 
                            <input type="text" id="userNumberMonth" style="background-color:transparent;border-color: transparent;color: #FFFFFF"onfocus="this.blur()"/> 
                            </div>
                        </div>
                        <div class="portlet-body">
                             <div style="position: relative;z-index: 9999" id="chart_3" class="chart"></div>
                        </div>
                    </div>
				
				<a href="${pageContext.request.contextPath}/selectAllUserInfo.action?condition=year" data-title="用户管理" href="javascript:void(0)">查看详情</a>
					<div class="portlet box red" style="border-color: #007ACC;border-color: #007ACC" >
					
                        <div class="portlet-title">
                            <div class="caption"><i  style="background-color: #007ACC"></i>本年用户注册数: 
                            <input type="text" id="userNumberYear" style="background-color:transparent;border-color: transparent;color: #FFFFFF"onfocus="this.blur()"/> 
                            </div>
                        </div>
                        <div class="portlet-body">
                             <div style="position: relative;z-index: 9999" id="chart_4" class="chart"></div>
                        </div>
                    </div>
                    
                    <a href="${pageContext.request.contextPath}/selectAllNurseInfo.action?condition=month" data-title="用户管理" href="javascript:void(0)">查看详情</a>
                    <div class="portlet box red" style="border-color: #007ACC;border-color: #007ACC" >
                        <div class="portlet-title">
                            <div class="caption"><i  style="background-color: #007ACC"></i>本月护士注册数: 
                            <input type="text" id="nurseNumberMonth" style="background-color:transparent;border-color: transparent;color: #FFFFFF"onfocus="this.blur()"/> 
                            </div>
                        </div>
                        <div class="portlet-body">
                             <div style="position: relative;z-index: 9999" id="chart_5" class="chart"></div>
                        </div>
                    </div>
				
					<a href="${pageContext.request.contextPath}/selectAllNurseInfo.action?condition=year" data-title="用户管理" href="javascript:void(0)">查看详情</a>
					<div class="portlet box red" style="border-color: #007ACC;border-color: #007ACC" >
                        <div class="portlet-title">
                            <div class="caption"><i  style="background-color: #007ACC"></i>本年护士注册数: 
                            <input type="text" id="nurseNumberYear" style="background-color:transparent;border-color: transparent;color: #FFFFFF"onfocus="this.blur()"/> 
                            </div>
                        </div>
                        <div class="portlet-body">
                             <div style="position: relative;z-index: 9999" id="chart_6" class="chart"></div>
                        </div>
                    </div>
				</div>
			</div>
			<div>
				<div class="" style="width: 1500px;">
				<a href="${pageContext.request.contextPath}/OrderList.action?state=2" data-title="用户管理" href="javascript:void(0)">查看详情</a>
					<div class="portlet box red" style="border-color: #007ACC;border-color: #007ACC" >
                        <div class="portlet-title">
                            <div class="caption"><i  style="background-color: #007ACC"></i>本月订单数完成: 
                            <input type="text" id="successOrderMonth" style="background-color:transparent;border-color: transparent;color: #FFFFFF"onfocus="this.blur()"/> 
                            </div>
                        </div>
                        <div class="portlet-body">
                             <div style="position: relative;z-index: 9999" id="chart_1" class="chart"></div>
                        </div>
                    </div>
				
				<a href="${pageContext.request.contextPath}/OrderList.action?state=2" data-title="用户管理" href="javascript:void(0)">查看详情</a>
					<div class="portlet box red" style="border-color: #007ACC;border-color: #007ACC" >
                        <div class="portlet-title">
                            <div class="caption"><i  style="background-color: #007ACC"></i>本年订单数完成: 
                            <input type="text" id="successOrderYear" style="background-color:transparent;border-color: transparent;color: #FFFFFF"onfocus="this.blur()"/> 
                            </div>
                        </div>
                        <div class="portlet-body">
                             <div style="position: relative;z-index: 9999" id="chart_2" class="chart"></div>
                        </div>
                    </div>
				</div>
			</div>
			<div>
				<div class="" style="width: 1500px;">
				<a href="${pageContext.request.contextPath}/OrderList.action?state=1" data-title="订单管理" href="javascript:void(0)">查看详情</a>
					<div class="portlet box red" style="border-color: #007ACC;border-color: #007ACC" >
                        <div class="portlet-title">
                            <div class="caption"><i  style="background-color: #007ACC"></i>本月订单数待完成: 
                            <input type="text" id="havingOrderMonth" style="background-color:transparent;border-color: transparent;color: #FFFFFF"onfocus="this.blur()"/> 
                            </div>
                        </div>
                        <div class="portlet-body">
                             <div style="position: relative;z-index: 9999" id="chart_7" class="chart"></div>
                        </div>
                    </div>
                    
				<a href="${pageContext.request.contextPath}/OrderList.action?state=1" data-title="订单管理" href="javascript:void(0)">查看详情</a>
					<div class="portlet box red" style="border-color: #007ACC;border-color: #007ACC" >
                        <div class="portlet-title">
                            <div class="caption"><i  style="background-color: #007ACC"></i>本年订单数待完成: 
                            <input type="text" id="havingOrderYear" style="background-color:transparent;border-color: transparent;color: #FFFFFF"onfocus="this.blur()"/> 
                            </div>
                        </div>
                        <div class="portlet-body">
                             <div style="position: relative;z-index: 9999" id="chart_8" class="chart"></div>
                        </div>
                    </div>
				</div>
			</div>
			<div>
				<div class="" style="width: 1500px;">
				<a href="${pageContext.request.contextPath}/OrderList.action?state=8" data-title="订单管理" href="javascript:void(0)">查看详情</a>
					<div class="portlet box red" style="border-color: #007ACC;border-color: #007ACC" >
                        <div class="portlet-title">
                            <div class="caption"><i  style="background-color: #007ACC"></i>本月订单数取消: 
                            <input type="text" id="CancelOrderMonth" style="background-color:transparent;border-color: transparent;color: #FFFFFF"onfocus="this.blur()"/> 
                            </div>
                        </div>
                        <div class="portlet-body">
                             <div style="position: relative;z-index: 9999" id="chart_9" class="chart"></div>
                        </div>
                    </div>
				
				<a href="${pageContext.request.contextPath}/OrderList.action?state=8" data-title="订单管理" href="javascript:void(0)">查看详情</a>
					<div class="portlet box red" style="border-color: #007ACC;border-color: #007ACC" >
                        <div class="portlet-title">
                            <div class="caption"><i  style="background-color: #007ACC"></i>本年订单数取消: 
                            <input type="text" id="CancelOrderYear" style="background-color:transparent;border-color: transparent;color: #FFFFFF"onfocus="this.blur()"/> 
                            </div>
                        </div>
                        <div class="portlet-body">
                             <div style="position: relative;z-index: 9999" id="chart_10" class="chart"></div>
                        </div>
                    </div>
				</div>
			</div>
			<div>
				<div class="portlet box red" style="border-color: #007ACC;border-color: #007ACC" >
                        <div class="portlet-title">
                            <div class="caption"><i  style="background-color: #007ACC"></i>日交易额: 
                            <input type="text" id="finalMoney" style="background-color:transparent;border-color: transparent;color: #FFFFFF"onfocus="this.blur()"/> 
                            
                            <i  style="background-color: #007ACC"></i>平均客单价: 
                            <input type="text" id="orderAvgMoney" style="background-color:transparent;border-color: transparent;color: #FFFFFF"onfocus="this.blur()"/> 
                            </div>
                        </div>
                        <div class="portlet-body">
                             <div style="position: relative;z-index: 9999" id="chart_11" class="chart"></div>
                        </div>
                    </div>
			</div>
			<div>
			<a href="${pageContext.request.contextPath}/selectGoodEvaluateInfoOfKeyWord.action" data-title="评价详情" href="javascript:void(0)">查看详情</a>
				<div class="portlet box red" style="border-color: #007ACC;border-color: #007ACC" >
                        <div class="portlet-title">
                            <div class="caption"><i  style="background-color: #007ACC"></i>日好评: 
                            <input type="text" id="evaluateGoodNumber" style="background-color:transparent;border-color: transparent;color: #FFFFFF"onfocus="this.blur()"/> 
                            </div>
                        </div>
                        <div class="portlet-body">
                             <div style="position: relative;z-index: 9999" id="chart_12" class="chart"></div>
                        </div>
                </div>
                
                <a href="${pageContext.request.contextPath}/selectMiddleEvaluateInfoOfKeyWord.action" data-title="评价详情" href="javascript:void(0)">查看详情</a>
                <div class="portlet box red" style="border-color: #007ACC;border-color: #007ACC" >
                        <div class="portlet-title">
                            <div class="caption"><i  style="background-color: #007ACC"></i>日中评: 
                            <input type="text" id="evaluateMiddleNumber" style="background-color:transparent;border-color: transparent;color: #FFFFFF"onfocus="this.blur()"/> 
                            </div>
                        </div>
                        <div class="portlet-body">
                             <div style="position: relative;z-index: 9999" id="chart_13" class="chart"></div>
                        </div>
                </div>
                
                <a href="${pageContext.request.contextPath}/selectBadEvaluateInfoOfKeyWord.action" data-title="评价详情" href="javascript:void(0)">查看详情</a>
                <div class="portlet box red" style="border-color: #007ACC;border-color: #007ACC" >
                        <div class="portlet-title">
                            <div class="caption"><i  style="background-color: #007ACC"></i>日差评: 
                            <input type="text" id="evaluateBadNumber" style="background-color:transparent;border-color: transparent;color: #FFFFFF"onfocus="this.blur()"/> 
                            </div>
                        </div>
                        <div class="portlet-body">
                             <div style="position: relative;z-index: 9999" id="chart_14" class="chart"></div>
                        </div>
                </div>
			</div>
			<div>
			 <a href="${pageContext.request.contextPath}/complaintUserlook.action" data-title="投诉详情" href="javascript:void(0)">查看详情</a>
				  <div class="portlet box red" style="border-color: #007ACC;border-color: #007ACC" >
                        <div class="portlet-title">
                            <div class="caption"><i  style="background-color: #007ACC"></i>用户对平台: 
                            <input type="text" id="usertToNumber" style="background-color:transparent;border-color: transparent;color: #FFFFFF"onfocus="this.blur()"/> 
                            </div>
                        </div>
                        <div class="portlet-body">
                             <div style="position: relative;z-index: 9999" id="chart_15" class="chart"></div>
                        </div>
                </div>
                
                 <a href="${pageContext.request.contextPath}/complaintNurselook.action" data-title="投诉详情" href="javascript:void(0)">查看详情</a>
                	  <div class="portlet box red" style="border-color: #007ACC;border-color: #007ACC" >
                        <div class="portlet-title">
                            <div class="caption"><i  style="background-color: #007ACC"></i>护士对平台: 
                            <input type="text" id="nursetToNumber" style="background-color:transparent;border-color: transparent;color: #FFFFFF"onfocus="this.blur()"/> 
                            </div>
                        </div>
                        <div class="portlet-body">
                             <div style="position: relative;z-index: 9999" id="chart_16" class="chart"></div>
                        </div>
                </div>
                
                 <a href="${pageContext.request.contextPath}/complaintUserlookToNurse.action" data-title="投诉详情" href="javascript:void(0)">查看详情</a>
                	  <div class="portlet box red" style="border-color: #007ACC;border-color: #007ACC" >
                        <div class="portlet-title">
                            <div class="caption"><i  style="background-color: #007ACC"></i>用户对护士: 
                            <input type="text" id="usertToNurse" style="background-color:transparent;border-color: transparent;color: #FFFFFF"onfocus="this.blur()"/> 
                            </div>
                        </div>
                        <div class="portlet-body">
                             <div style="position: relative;z-index: 9999" id="chart_17" class="chart"></div>
                        </div>
                </div>
                
                 <a href="${pageContext.request.contextPath}/complaintNurselookToUser.action" data-title="投诉详情" href="javascript:void(0)">查看详情</a>
                	  <div class="portlet box red" style="border-color: #007ACC;border-color: #007ACC" >
                        <div class="portlet-title">
                            <div class="caption"><i  style="background-color: #007ACC"></i>护士对用户: 
                            <input type="text" id="nurseToUserNumber" style="background-color:transparent;border-color: transparent;color: #FFFFFF"onfocus="this.blur()"/> 
                            </div>
                        </div>
                        <div class="portlet-body">
                             <div style="position: relative;z-index: 9999" id="chart_18" class="chart"></div>
                        </div>
                </div>
                
                 <a href="${pageContext.request.contextPath}/selectComplaintByUserTo.action" data-title="投诉详情" href="javascript:void(0)">查看详情</a>
                	  <div class="portlet box red" style="border-color: #007ACC;border-color: #007ACC" >
                        <div class="portlet-title">
                            <div class="caption"><i  style="background-color: #007ACC"></i>护士对订单: 
                            <input type="text" id="nurseToOrderNumber" style="background-color:transparent;border-color: transparent;color: #FFFFFF"onfocus="this.blur()"/> 
                            </div>
                        </div>
                        <div class="portlet-body">
                             <div style="position: relative;z-index: 9999" id="chart_19" class="chart"></div>
                        </div>
                </div>
			</div>
		</div>
	</div>
</div>
<!--分栏  -->
<!-- 分栏 -->



<script type="text/javascript">
	   $("#wizard").bwizard();
	</script>
	<script type="text/javascript">
	function checkOn(){
	var adminUsergrade= ${adminUsergrade};
	if(adminUsergrade >1){
		$("#container").hide();
	}
	}
	checkOn();
	</script>
	
	<script src="next/js/classie.js"></script>
		<script>
			(function() {
				// trim polyfill : https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/Trim
				if (!String.prototype.trim) {
					(function() {
						// Make sure we trim BOM and NBSP
						var rtrim = /^[\s\uFEFF\xA0]+|[\s\uFEFF\xA0]+$/g;
						String.prototype.trim = function() {
							return this.replace(rtrim, '');
						};
					})();
				}

				[].slice.call( document.querySelectorAll( 'input.input__field' ) ).forEach( function( inputEl ) {
					// in case the input is already filled..
					if( inputEl.value.trim() !== '' ) {
						classie.add( inputEl.parentNode, 'input--filled' );
					}

					// events:
					inputEl.addEventListener( 'focus', onInputFocus );
					inputEl.addEventListener( 'blur', onInputBlur );
				} );

				function onInputFocus( ev ) {
					classie.add( ev.target.parentNode, 'input--filled' );
				}

				function onInputBlur( ev ) {
					if( ev.target.value.trim() === '' ) {
						classie.remove( ev.target.parentNode, 'input--filled' );
					}
				}
			})();
		</script>
		<!-- 订单管理链接 -->
		
		<script type="text/javascript">
		//待处理订单
		function waitOrder(){
	 	location.href = "${pageContext.request.contextPath}/OrderList.action?state=0";
		}
		//待付款
		function waitPay(){
		location.href = "${pageContext.request.contextPath}/OrderList.action?state=4";
		}
		//取消的订单
		function cancelOrder(){
		location.href = "${pageContext.request.contextPath}/OrderList.action?state=8";
		}
		//完成的订单
		function successOrder(){
		location.href = "${pageContext.request.contextPath}/OrderList.action?state=2";
		}
		//------------------------------------------
		//用户管理
		//客户管理
		function userManage(){
	 	location.href = "${pageContext.request.contextPath}/selectAllUserInfo.action";
		}
		//护士管理
		function nurseManage(){
	 	location.href = "${pageContext.request.contextPath}/selectAllNurseInfo.action";
		}
		//认证管理
		function authenticationManage(){
	 	location.href = "${pageContext.request.contextPath}/selectAllNurseInfodistrict.action";
		}
		//护士注册
		function nurseregister(){
	 	location.href = "${pageContext.request.contextPath}/selectHospitalAndMajor.action";
		}
		
		function automaticRequest(){
		 $.ajax({
            type: "POST",
            url: "selectOrderStatisticsDataQuantity.action",
            success: function (data) {
            //alert(data);
            var datas = eval('(' + data + ')');
           	//alert(datas[0].waitOrder);
           	//待处理
           	$("#grantOrder").val(datas[0].grantOrder);
           	//待付款
           	$("#waitOrder").val(datas[0].waitOrder);
           	
           	//取消
           	$("#cancleOrder").val(datas[0].cancleOrder);
           	//完成
           	$("#successOrder").val(datas[0].successOrder);
           	
           	//总用户
           	$("#userCount").val(datas[0].userCount);
           	//总护士
           	$("#nurseCount").val(datas[0].nurseCount);
           	////护士总认证数
           	$("#authenticationCount").val(datas[0].authenticationCount); 
           	
		    //用户统计
		    $("#userNumberMonth").val(datas[0].userNumberMonth);
		    $("#userNumberYear").val(datas[0].userNumberYear);
		    $("#nurseNumberMonth").val(datas[0].nurseNumberMonth);
		    $("#nurseNumberYear").val(datas[0].nurseNumberYear);
		    
           	//本月完成订单
           	$("#successOrderMonth").val(datas[0].successOrderMonth);
           	//本年完成订单
           	$("#successOrderYear").val(datas[0].successOrderYear);
           	
		 	$("#havingOrderMonth").val(datas[0].havingOrderMonth);
		 	$("#havingOrderYear").val(datas[0].havingOrderYear);
		 	$("#CancelOrderMonth").val(datas[0].CancelOrderMonth);
		 	$("#CancelOrderYear").val(datas[0].CancelOrderYear);
		 	
		 	//评价
			$("#evaluateGoodNumber").val(datas[0].evaluateGoodNumber);
			$("#evaluateMiddleNumber").val(datas[0].evaluateMiddleNumber);
			$("#evaluateBadNumber").val(datas[0].evaluateBadNumber); 	
			
			//投诉
			 $("#usertToNumber").val(datas[0].usertToNumber); 	
			 $("#nursetToNumber").val(datas[0].nursetToNumber); 	
			 $("#usertToNurse").val(datas[0].usertToNurse); 	
			 $("#nurseToUserNumber").val(datas[0].nurseToUserNumber); 	
			 $("#nurseToOrderNumber").val(datas[0].nurseToOrderNumber); 	
			 
			 //平均客单价
			  $("#orderAvgMoney").val(datas[0].orderAvgMoney); 	
			  $("#finalMoney").val(datas[0].finalMoney); 
           	}
            });
		}
		automaticRequest();
		</script>
		<!-- 用户和护士统计 -->
		<script type="text/javascript">
		function usersuccess(){
			App.init();
		   $.ajax({
            type: "POST",
            url: "userStatisticsLine.action",
            success: function (data) {
            var datas = eval('(' + data + ')');
                function chart1() {
                    var d=new Date();
                    var year= d.getFullYear(),
                            month= d.getMonth();
                    var day=new Date(year,month,0);
                    var daycount=day.getDate();
                    var pageviews=[],i;
                     for(i=1;i<=daycount;i++){
                        pageviews.push([i,datas[i]])
                    } 
                   /*  pageviews = [[1,2],[2,3]] */
                    var plot = $.plot($("#chart_3"), [{
                        data: pageviews,
                        label: "用户"
                    }
                    ], {
                        series: {
                            lines: {
                                show: true,
                                lineWidth: 2,
                                fill: true,
                                fillColor: {
                                    colors: [{
                                        opacity: 0.05
                                    }, {
                                        opacity: 0.01
                                    }
                                    ]
                                }
                            },
                            points: {
                                show: true
                            },
                            shadowSize: 2
                        },
                        grid: {
                            hoverable: true,
                            clickable: true,
                            tickColor: "#eee",
                            borderWidth: 0
                        },
                        colors: ["#d12610", "#37b7f3", "#52e136"],
                        xaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        },
                        yaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        }
                    });

                    function showTooltip(x, y, contents) {
                        $('<div id="tooltip">' + contents + '</div>').css({
                            position: 'absolute',
                            display: 'none',
                            top: y + 5,
                            left: x + 15,
                            border: '1px solid #333',
                            padding: '4px',
                            color: '#fff',
                            'border-radius': '3px',
                            'background-color': '#333',
                            opacity: 0.80
                        }).appendTo("body").fadeIn(200);
                    }

                    var previousPoint = null;
                    $("#chart_3").bind("plothover", function (event, pos, item) {
                        $("#x").text(pos.x.toFixed(0));
                        $("#y").text(pos.y.toFixed(0));

                        if (item) {
                            if (previousPoint != item.dataIndex) {
                                previousPoint = item.dataIndex;

                                $("#tooltip").remove();
                                var x = item.datapoint[0].toFixed(0),
                                        y = item.datapoint[1].toFixed(0);
                                showTooltip(item.pageX, item.pageY, x + "日:" + y + "人");
                            }
                        } else {
                            $("#tooltip").remove();
                            previousPoint = null;
                        }
                    });
                }
                chart1();
            }
        });
        
         $.ajax({
            type: "POST",
            url: "userStatisticsLineYear.action",
            success: function (data) {
            var datas = eval('(' + data + ')');
                function chart1() {
                    var d=new Date();
                    var year= d.getFullYear(),
                            month= d.getMonth();
                    var day=new Date(year,month,0);
                    var daycount=day.getDate();
                    var pageviews=[],i;
                     for(i=1;i<=daycount;i++){
                        pageviews.push([i,datas[i]])
                    } 
                   /*  pageviews = [[1,2],[2,3]] */
                    var plot = $.plot($("#chart_4"), [{
                        data: pageviews,
                        label: "用户"
                    }
                    ], {
                        series: {
                            lines: {
                                show: true,
                                lineWidth: 2,
                                fill: true,
                                fillColor: {
                                    colors: [{
                                        opacity: 0.05
                                    }, {
                                        opacity: 0.01
                                    }
                                    ]
                                }
                            },
                            points: {
                                show: true
                            },
                            shadowSize: 2
                        },
                        grid: {
                            hoverable: true,
                            clickable: true,
                            tickColor: "#eee",
                            borderWidth: 0
                        },
                        colors: ["#d12610", "#37b7f3", "#52e136"],
                        xaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        },
                        yaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        }
                    });

                    function showTooltip(x, y, contents) {
                        $('<div id="tooltip">' + contents + '</div>').css({
                            position: 'absolute',
                            display: 'none',
                            top: y + 5,
                            left: x + 15,
                            border: '1px solid #333',
                            padding: '4px',
                            color: '#fff',
                            'border-radius': '3px',
                            'background-color': '#333',
                            opacity: 0.80
                        }).appendTo("body").fadeIn(200);
                    }

                    var previousPoint = null;
                    $("#chart_4").bind("plothover", function (event, pos, item) {
                        $("#x").text(pos.x.toFixed(0));
                        $("#y").text(pos.y.toFixed(0));

                        if (item) {
                            if (previousPoint != item.dataIndex) {
                                previousPoint = item.dataIndex;

                                $("#tooltip").remove();
                                var x = item.datapoint[0].toFixed(0),
                                        y = item.datapoint[1].toFixed(0);
                                showTooltip(item.pageX, item.pageY, x + "月:" + y + "人");
                            }
                        } else {
                            $("#tooltip").remove();
                            previousPoint = null;
                        }
                    });
                }
                chart1();
            }
        });
        
         $.ajax({
            type: "POST",
            url: "nurseStatisticsLine.action",
            success: function (data) {
            var datas = eval('(' + data + ')');
                function chart1() {
                    var d=new Date();
                    var year= d.getFullYear(),
                            month= d.getMonth();
                    var day=new Date(year,month,0);
                    var daycount=day.getDate();
                    var pageviews=[],i;
                     for(i=1;i<=daycount;i++){
                        pageviews.push([i,datas[i]])
                    } 
                   /*  pageviews = [[1,2],[2,3]] */
                    var plot = $.plot($("#chart_5"), [{
                        data: pageviews,
                        label: "护士"
                    }
                    ], {
                        series: {
                            lines: {
                                show: true,
                                lineWidth: 2,
                                fill: true,
                                fillColor: {
                                    colors: [{
                                        opacity: 0.05
                                    }, {
                                        opacity: 0.01
                                    }
                                    ]
                                }
                            },
                            points: {
                                show: true
                            },
                            shadowSize: 2
                        },
                        grid: {
                            hoverable: true,
                            clickable: true,
                            tickColor: "#eee",
                            borderWidth: 0
                        },
                        colors: ["#d12610", "#37b7f3", "#52e136"],
                        xaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        },
                        yaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        }
                    });

                    function showTooltip(x, y, contents) {
                        $('<div id="tooltip">' + contents + '</div>').css({
                            position: 'absolute',
                            display: 'none',
                            top: y + 5,
                            left: x + 15,
                            border: '1px solid #333',
                            padding: '4px',
                            color: '#fff',
                            'border-radius': '3px',
                            'background-color': '#333',
                            opacity: 0.80
                        }).appendTo("body").fadeIn(200);
                    }

                    var previousPoint = null;
                    $("#chart_5").bind("plothover", function (event, pos, item) {
                        $("#x").text(pos.x.toFixed(0));
                        $("#y").text(pos.y.toFixed(0));

                        if (item) {
                            if (previousPoint != item.dataIndex) {
                                previousPoint = item.dataIndex;

                                $("#tooltip").remove();
                                var x = item.datapoint[0].toFixed(0),
                                        y = item.datapoint[1].toFixed(0);
                                showTooltip(item.pageX, item.pageY, x + "日:" + y + "人");
                            }
                        } else {
                            $("#tooltip").remove();
                            previousPoint = null;
                        }
                    });
                }
                chart1();
            }
        });
        
         $.ajax({
            type: "POST",
            url: "nurseStatisticsLineYear.action",
            success: function (data) {
            var datas = eval('(' + data + ')');
                function chart1() {
                    var d=new Date();
                    var year= d.getFullYear(),
                            month= d.getMonth();
                    var day=new Date(year,month,0);
                    var daycount=day.getDate();
                    var pageviews=[],i;
                     for(i=1;i<=daycount;i++){
                        pageviews.push([i,datas[i]])
                    } 
                   /*  pageviews = [[1,2],[2,3]] */
                    var plot = $.plot($("#chart_6"), [{
                        data: pageviews,
                        label: "护士"
                    }
                    ], {
                        series: {
                            lines: {
                                show: true,
                                lineWidth: 2,
                                fill: true,
                                fillColor: {
                                    colors: [{
                                        opacity: 0.05
                                    }, {
                                        opacity: 0.01
                                    }
                                    ]
                                }
                            },
                            points: {
                                show: true
                            },
                            shadowSize: 2
                        },
                        grid: {
                            hoverable: true,
                            clickable: true,
                            tickColor: "#eee",
                            borderWidth: 0
                        },
                        colors: ["#d12610", "#37b7f3", "#52e136"],
                        xaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        },
                        yaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        }
                    });

                    function showTooltip(x, y, contents) {
                        $('<div id="tooltip">' + contents + '</div>').css({
                            position: 'absolute',
                            display: 'none',
                            top: y + 5,
                            left: x + 15,
                            border: '1px solid #333',
                            padding: '4px',
                            color: '#fff',
                            'border-radius': '3px',
                            'background-color': '#333',
                            opacity: 0.80
                        }).appendTo("body").fadeIn(200);
                    }

                    var previousPoint = null;
                    $("#chart_6").bind("plothover", function (event, pos, item) {
                        $("#x").text(pos.x.toFixed(0));
                        $("#y").text(pos.y.toFixed(0));

                        if (item) {
                            if (previousPoint != item.dataIndex) {
                                previousPoint = item.dataIndex;

                                $("#tooltip").remove();
                                var x = item.datapoint[0].toFixed(0),
                                        y = item.datapoint[1].toFixed(0);
                                showTooltip(item.pageX, item.pageY, x + "月:" + y + "人");
                            }
                        } else {
                            $("#tooltip").remove();
                            previousPoint = null;
                        }
                    });
                }
                chart1();
            }
        });
		}
		usersuccess();
		</script>
		
		<!-- 订单统计已完成 -->
		<script type="text/javascript">
		function ordersuccess(){
			App.init();
		   $.ajax({
            type: "POST",
            url: "orderStatisticsLineSuccess1.action",
            success: function (data) {
            var datas = eval('(' + data + ')');
                function chart1() {
                    var d=new Date();
                    var year= d.getFullYear(),
                            month= d.getMonth();
                    var day=new Date(year,month,0);
                    var daycount=day.getDate();
                    var pageviews=[],i;
                     for(i=1;i<=daycount;i++){
                        pageviews.push([i,datas[i]])
                    } 
                   /*  pageviews = [[1,2],[2,3]] */
                    var plot = $.plot($("#chart_1"), [{
                        data: pageviews,
                        label: "订单"
                    }
                    ], {
                        series: {
                            lines: {
                                show: true,
                                lineWidth: 2,
                                fill: true,
                                fillColor: {
                                    colors: [{
                                        opacity: 0.05
                                    }, {
                                        opacity: 0.01
                                    }
                                    ]
                                }
                            },
                            points: {
                                show: true
                            },
                            shadowSize: 2
                        },
                        grid: {
                            hoverable: true,
                            clickable: true,
                            tickColor: "#eee",
                            borderWidth: 0
                        },
                        colors: ["#d12610", "#37b7f3", "#52e136"],
                        xaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        },
                        yaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        }
                    });

                    function showTooltip(x, y, contents) {
                        $('<div id="tooltip">' + contents + '</div>').css({
                            position: 'absolute',
                            display: 'none',
                            top: y + 5,
                            left: x + 15,
                            border: '1px solid #333',
                            padding: '4px',
                            color: '#fff',
                            'border-radius': '3px',
                            'background-color': '#333',
                            opacity: 0.80
                        }).appendTo("body").fadeIn(200);
                    }

                    var previousPoint = null;
                    $("#chart_1").bind("plothover", function (event, pos, item) {
                        $("#x").text(pos.x.toFixed(0));
                        $("#y").text(pos.y.toFixed(0));

                        if (item) {
                            if (previousPoint != item.dataIndex) {
                                previousPoint = item.dataIndex;

                                $("#tooltip").remove();
                                var x = item.datapoint[0].toFixed(0),
                                        y = item.datapoint[1].toFixed(0);
                                showTooltip(item.pageX, item.pageY, x + "日:" + y + "份");
                            }
                        } else {
                            $("#tooltip").remove();
                            previousPoint = null;
                        }
                    });
                }
                chart1();
            }
        });
        
         $.ajax({
            type: "POST",
            url: "orderStatisticsLineSuccessYear.action",
            success: function (data) {
            var datas = eval('(' + data + ')');
                function chart1() {
                    var d=new Date();
                    var year= d.getFullYear(),
                            month= d.getMonth();
                    var day=new Date(year,month,0);
                    var daycount=day.getDate();
                    var pageviews=[],i;
                     for(i=1;i<=daycount;i++){
                        pageviews.push([i,datas[i]])
                    } 
                   /*  pageviews = [[1,2],[2,3]] */
                    var plot = $.plot($("#chart_2"), [{
                        data: pageviews,
                        label: "订单"
                    }
                    ], {
                        series: {
                            lines: {
                                show: true,
                                lineWidth: 2,
                                fill: true,
                                fillColor: {
                                    colors: [{
                                        opacity: 0.05
                                    }, {
                                        opacity: 0.01
                                    }
                                    ]
                                }
                            },
                            points: {
                                show: true
                            },
                            shadowSize: 2
                        },
                        grid: {
                            hoverable: true,
                            clickable: true,
                            tickColor: "#eee",
                            borderWidth: 0
                        },
                        colors: ["#d12610", "#37b7f3", "#52e136"],
                        xaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        },
                        yaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        }
                    });

                    function showTooltip(x, y, contents) {
                        $('<div id="tooltip">' + contents + '</div>').css({
                            position: 'absolute',
                            display: 'none',
                            top: y + 5,
                            left: x + 15,
                            border: '1px solid #333',
                            padding: '4px',
                            color: '#fff',
                            'border-radius': '3px',
                            'background-color': '#333',
                            opacity: 0.80
                        }).appendTo("body").fadeIn(200);
                    }

                    var previousPoint = null;
                    $("#chart_2").bind("plothover", function (event, pos, item) {
                        $("#x").text(pos.x.toFixed(0));
                        $("#y").text(pos.y.toFixed(0));

                        if (item) {
                            if (previousPoint != item.dataIndex) {
                                previousPoint = item.dataIndex;

                                $("#tooltip").remove();
                                var x = item.datapoint[0].toFixed(0),
                                        y = item.datapoint[1].toFixed(0);
                                showTooltip(item.pageX, item.pageY, x + "月:" + y + "份");
                            }
                        } else {
                            $("#tooltip").remove();
                            previousPoint = null;
                        }
                    });
                }
                chart1();
            }
        });
        }
        ordersuccess();
		</script>

		<!-- 订单统计未完成 -->
		<script type="text/javascript">
		function orderHaving(){
			App.init();
		   $.ajax({
            type: "POST",
            url: "orderStatisticsLineHavingMonth.action",
            success: function (data) {
            var datas = eval('(' + data + ')');
                function chart1() {
                    var d=new Date();
                    var year= d.getFullYear(),
                            month= d.getMonth();
                    var day=new Date(year,month,0);
                    var daycount=day.getDate();
                    var pageviews=[],i;
                     for(i=1;i<=daycount;i++){
                        pageviews.push([i,datas[i]])
                    } 
                   /*  pageviews = [[1,2],[2,3]] */
                    var plot = $.plot($("#chart_7"), [{
                        data: pageviews,
                        label: "订单"
                    }
                    ], {
                        series: {
                            lines: {
                                show: true,
                                lineWidth: 2,
                                fill: true,
                                fillColor: {
                                    colors: [{
                                        opacity: 0.05
                                    }, {
                                        opacity: 0.01
                                    }
                                    ]
                                }
                            },
                            points: {
                                show: true
                            },
                            shadowSize: 2
                        },
                        grid: {
                            hoverable: true,
                            clickable: true,
                            tickColor: "#eee",
                            borderWidth: 0
                        },
                        colors: ["#d12610", "#37b7f3", "#52e136"],
                        xaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        },
                        yaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        }
                    });

                    function showTooltip(x, y, contents) {
                        $('<div id="tooltip">' + contents + '</div>').css({
                            position: 'absolute',
                            display: 'none',
                            top: y + 5,
                            left: x + 15,
                            border: '1px solid #333',
                            padding: '4px',
                            color: '#fff',
                            'border-radius': '3px',
                            'background-color': '#333',
                            opacity: 0.80
                        }).appendTo("body").fadeIn(200);
                    }

                    var previousPoint = null;
                    $("#chart_7").bind("plothover", function (event, pos, item) {
                        $("#x").text(pos.x.toFixed(0));
                        $("#y").text(pos.y.toFixed(0));

                        if (item) {
                            if (previousPoint != item.dataIndex) {
                                previousPoint = item.dataIndex;

                                $("#tooltip").remove();
                                var x = item.datapoint[0].toFixed(0),
                                        y = item.datapoint[1].toFixed(0);
                                showTooltip(item.pageX, item.pageY, x + "日:" + y + "份");
                            }
                        } else {
                            $("#tooltip").remove();
                            previousPoint = null;
                        }
                    });
                }
                chart1();
            }
        });
        
         $.ajax({
            type: "POST",
            url: "orderStatisticsLineHavingYear.action",
            success: function (data) {
            var datas = eval('(' + data + ')');
                function chart1() {
                    var d=new Date();
                    var year= d.getFullYear(),
                            month= d.getMonth();
                    var day=new Date(year,month,0);
                    var daycount=day.getDate();
                    var pageviews=[],i;
                     for(i=1;i<=daycount;i++){
                        pageviews.push([i,datas[i]])
                    } 
                   /*  pageviews = [[1,2],[2,3]] */
                    var plot = $.plot($("#chart_8"), [{
                        data: pageviews,
                        label: "订单"
                    }
                    ], {
                        series: {
                            lines: {
                                show: true,
                                lineWidth: 2,
                                fill: true,
                                fillColor: {
                                    colors: [{
                                        opacity: 0.05
                                    }, {
                                        opacity: 0.01
                                    }
                                    ]
                                }
                            },
                            points: {
                                show: true
                            },
                            shadowSize: 2
                        },
                        grid: {
                            hoverable: true,
                            clickable: true,
                            tickColor: "#eee",
                            borderWidth: 0
                        },
                        colors: ["#d12610", "#37b7f3", "#52e136"],
                        xaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        },
                        yaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        }
                    });

                    function showTooltip(x, y, contents) {
                        $('<div id="tooltip">' + contents + '</div>').css({
                            position: 'absolute',
                            display: 'none',
                            top: y + 5,
                            left: x + 15,
                            border: '1px solid #333',
                            padding: '4px',
                            color: '#fff',
                            'border-radius': '3px',
                            'background-color': '#333',
                            opacity: 0.80
                        }).appendTo("body").fadeIn(200);
                    }

                    var previousPoint = null;
                    $("#chart_8").bind("plothover", function (event, pos, item) {
                        $("#x").text(pos.x.toFixed(0));
                        $("#y").text(pos.y.toFixed(0));

                        if (item) {
                            if (previousPoint != item.dataIndex) {
                                previousPoint = item.dataIndex;

                                $("#tooltip").remove();
                                var x = item.datapoint[0].toFixed(0),
                                        y = item.datapoint[1].toFixed(0);
                                showTooltip(item.pageX, item.pageY, x + "月:" + y + "份");
                            }
                        } else {
                            $("#tooltip").remove();
                            previousPoint = null;
                        }
                    });
                }
                chart1();
            }
        });
        }
        orderHaving();
		</script>

		<!-- 订单被取消 -->
		<script type="text/javascript">
		function orderCancle(){
			App.init();
		   $.ajax({
            type: "POST",
            url: "orderStatisticsLineCancleMonth.action",
            success: function (data) {
            var datas = eval('(' + data + ')');
                function chart1() {
                    var d=new Date();
                    var year= d.getFullYear(),
                            month= d.getMonth();
                    var day=new Date(year,month,0);
                    var daycount=day.getDate();
                    var pageviews=[],i;
                     for(i=1;i<=daycount;i++){
                        pageviews.push([i,datas[i]])
                    } 
                   /*  pageviews = [[1,2],[2,3]] */
                    var plot = $.plot($("#chart_9"), [{
                        data: pageviews,
                        label: "订单"
                    }
                    ], {
                        series: {
                            lines: {
                                show: true,
                                lineWidth: 2,
                                fill: true,
                                fillColor: {
                                    colors: [{
                                        opacity: 0.05
                                    }, {
                                        opacity: 0.01
                                    }
                                    ]
                                }
                            },
                            points: {
                                show: true
                            },
                            shadowSize: 2
                        },
                        grid: {
                            hoverable: true,
                            clickable: true,
                            tickColor: "#eee",
                            borderWidth: 0
                        },
                        colors: ["#d12610", "#37b7f3", "#52e136"],
                        xaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        },
                        yaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        }
                    });

                    function showTooltip(x, y, contents) {
                        $('<div id="tooltip">' + contents + '</div>').css({
                            position: 'absolute',
                            display: 'none',
                            top: y + 5,
                            left: x + 15,
                            border: '1px solid #333',
                            padding: '4px',
                            color: '#fff',
                            'border-radius': '3px',
                            'background-color': '#333',
                            opacity: 0.80
                        }).appendTo("body").fadeIn(200);
                    }

                    var previousPoint = null;
                    $("#chart_9").bind("plothover", function (event, pos, item) {
                        $("#x").text(pos.x.toFixed(0));
                        $("#y").text(pos.y.toFixed(0));

                        if (item) {
                            if (previousPoint != item.dataIndex) {
                                previousPoint = item.dataIndex;

                                $("#tooltip").remove();
                                var x = item.datapoint[0].toFixed(0),
                                        y = item.datapoint[1].toFixed(0);
                                showTooltip(item.pageX, item.pageY, x + "日:" + y + "份");
                            }
                        } else {
                            $("#tooltip").remove();
                            previousPoint = null;
                        }
                    });
                }
                chart1();
            }
        });
        
         $.ajax({
            type: "POST",
            url: "orderStatisticsLineCancleYear.action",
            success: function (data) {
            var datas = eval('(' + data + ')');
                function chart1() {
                    var d=new Date();
                    var year= d.getFullYear(),
                            month= d.getMonth();
                    var day=new Date(year,month,0);
                    var daycount=day.getDate();
                    var pageviews=[],i;
                     for(i=1;i<=daycount;i++){
                        pageviews.push([i,datas[i]])
                    } 
                   /*  pageviews = [[1,2],[2,3]] */
                    var plot = $.plot($("#chart_10"), [{
                        data: pageviews,
                        label: "订单"
                    }
                    ], {
                        series: {
                            lines: {
                                show: true,
                                lineWidth: 2,
                                fill: true,
                                fillColor: {
                                    colors: [{
                                        opacity: 0.05
                                    }, {
                                        opacity: 0.01
                                    }
                                    ]
                                }
                            },
                            points: {
                                show: true
                            },
                            shadowSize: 2
                        },
                        grid: {
                            hoverable: true,
                            clickable: true,
                            tickColor: "#eee",
                            borderWidth: 0
                        },
                        colors: ["#d12610", "#37b7f3", "#52e136"],
                        xaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        },
                        yaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        }
                    });

                    function showTooltip(x, y, contents) {
                        $('<div id="tooltip">' + contents + '</div>').css({
                            position: 'absolute',
                            display: 'none',
                            top: y + 5,
                            left: x + 15,
                            border: '1px solid #333',
                            padding: '4px',
                            color: '#fff',
                            'border-radius': '3px',
                            'background-color': '#333',
                            opacity: 0.80
                        }).appendTo("body").fadeIn(200);
                    }

                    var previousPoint = null;
                    $("#chart_10").bind("plothover", function (event, pos, item) {
                        $("#x").text(pos.x.toFixed(0));
                        $("#y").text(pos.y.toFixed(0));

                        if (item) {
                            if (previousPoint != item.dataIndex) {
                                previousPoint = item.dataIndex;

                                $("#tooltip").remove();
                                var x = item.datapoint[0].toFixed(0),
                                        y = item.datapoint[1].toFixed(0);
                                showTooltip(item.pageX, item.pageY, x + "月:" + y + "份");
                            }
                        } else {
                            $("#tooltip").remove();
                            previousPoint = null;
                        }
                    });
                }
                chart1();
            }
        });
        }
        orderCancle();
		</script>

		<!-- 日交易额统计 -->
		<script type="text/javascript">
		function orderMoney(){
			App.init();
		   $.ajax({
            type: "POST",
            url: "moneyStatisticsMonth.action",
            success: function (data) {
            var datas = eval('(' + data + ')');
                function chart1() {
                    var d=new Date();
                    var year= d.getFullYear(),
                            month= d.getMonth();
                    var day=new Date(year,month,0);
                    var daycount=day.getDate();
                    var pageviews=[],i;
                     for(i=1;i<=daycount;i++){
                        pageviews.push([i,datas[i]])
                    } 
                   /*  pageviews = [[1,2],[2,3]] */
                    var plot = $.plot($("#chart_11"), [{
                        data: pageviews,
                        label: "日交易额"
                    }
                    ], {
                        series: {
                            lines: {
                                show: true,
                                lineWidth: 2,
                                fill: true,
                                fillColor: {
                                    colors: [{
                                        opacity: 0.05
                                    }, {
                                        opacity: 0.01
                                    }
                                    ]
                                }
                            },
                            points: {
                                show: true
                            },
                            shadowSize: 2
                        },
                        grid: {
                            hoverable: true,
                            clickable: true,
                            tickColor: "#eee",
                            borderWidth: 0
                        },
                        colors: ["#d12610", "#37b7f3", "#52e136"],
                        xaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        },
                        yaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        }
                    });

                    function showTooltip(x, y, contents) {
                        $('<div id="tooltip">' + contents + '</div>').css({
                            position: 'absolute',
                            display: 'none',
                            top: y + 5,
                            left: x + 15,
                            border: '1px solid #333',
                            padding: '4px',
                            color: '#fff',
                            'border-radius': '3px',
                            'background-color': '#333',
                            opacity: 0.80
                        }).appendTo("body").fadeIn(200);
                    }

                    var previousPoint = null;
                    $("#chart_11").bind("plothover", function (event, pos, item) {
                        $("#x").text(pos.x.toFixed(0));
                        $("#y").text(pos.y.toFixed(0));

                        if (item) {
                            if (previousPoint != item.dataIndex) {
                                previousPoint = item.dataIndex;

                                $("#tooltip").remove();
                                var x = item.datapoint[0].toFixed(0),
                                 y = item.datapoint[1].toFixed(2);
                                showTooltip(item.pageX, item.pageY, x + "日:" + y + "元");
                            }
                        } else {
                            $("#tooltip").remove();
                            previousPoint = null;
                        }
                    });
                }
                chart1();
            }
        });
        }
        orderMoney();
		</script>
		<!-- 评价统计 -->
		<script type="text/javascript">
		function orderevaluate(){
			App.init();
		   $.ajax({
            type: "POST",
            data:{"type":"1"},
            url: "evaluateStatisticsLineMonth.action",
            success: function (data) {
            var datas = eval('(' + data + ')');
                function chart1() {
                    var d=new Date();
                    var year= d.getFullYear(),
                            month= d.getMonth();
                    var day=new Date(year,month,0);
                    var daycount=day.getDate();
                    var pageviews=[],i;
                     for(i=1;i<=daycount;i++){
                        pageviews.push([i,datas[i]])
                    } 
                   /*  pageviews = [[1,2],[2,3]] */
                    var plot = $.plot($("#chart_12"), [{
                        data: pageviews,
                        label: "评价"
                    }
                    ], {
                        series: {
                            lines: {
                                show: true,
                                lineWidth: 2,
                                fill: true,
                                fillColor: {
                                    colors: [{
                                        opacity: 0.05
                                    }, {
                                        opacity: 0.01
                                    }
                                    ]
                                }
                            },
                            points: {
                                show: true
                            },
                            shadowSize: 2
                        },
                        grid: {
                            hoverable: true,
                            clickable: true,
                            tickColor: "#eee",
                            borderWidth: 0
                        },
                        colors: ["#d12610", "#37b7f3", "#52e136"],
                        xaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        },
                        yaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        }
                    });

                    function showTooltip(x, y, contents) {
                        $('<div id="tooltip">' + contents + '</div>').css({
                            position: 'absolute',
                            display: 'none',
                            top: y + 5,
                            left: x + 15,
                            border: '1px solid #333',
                            padding: '4px',
                            color: '#fff',
                            'border-radius': '3px',
                            'background-color': '#333',
                            opacity: 0.80
                        }).appendTo("body").fadeIn(200);
                    }

                    var previousPoint = null;
                    $("#chart_12").bind("plothover", function (event, pos, item) {
                        $("#x").text(pos.x.toFixed(0));
                        $("#y").text(pos.y.toFixed(0));

                        if (item) {
                            if (previousPoint != item.dataIndex) {
                                previousPoint = item.dataIndex;

                                $("#tooltip").remove();
                                var x = item.datapoint[0].toFixed(0),
                                        y = item.datapoint[1].toFixed(0);
                                showTooltip(item.pageX, item.pageY, x + "日:" + y + "份");
                            }
                        } else {
                            $("#tooltip").remove();
                            previousPoint = null;
                        }
                    });
                }
                chart1();
            }
        });
        
         $.ajax({
            type: "POST",
            data:{"type":"2"},
            url: "evaluateStatisticsLineMonth.action",
            success: function (data) {
            var datas = eval('(' + data + ')');
                function chart1() {
                    var d=new Date();
                    var year= d.getFullYear(),
                            month= d.getMonth();
                    var day=new Date(year,month,0);
                    var daycount=day.getDate();
                    var pageviews=[],i;
                     for(i=1;i<=daycount;i++){
                        pageviews.push([i,datas[i]])
                    } 
                   /*  pageviews = [[1,2],[2,3]] */
                    var plot = $.plot($("#chart_13"), [{
                        data: pageviews,
                        label: "评价"
                    }
                    ], {
                        series: {
                            lines: {
                                show: true,
                                lineWidth: 2,
                                fill: true,
                                fillColor: {
                                    colors: [{
                                        opacity: 0.05
                                    }, {
                                        opacity: 0.01
                                    }
                                    ]
                                }
                            },
                            points: {
                                show: true
                            },
                            shadowSize: 2
                        },
                        grid: {
                            hoverable: true,
                            clickable: true,
                            tickColor: "#eee",
                            borderWidth: 0
                        },
                        colors: ["#d12610", "#37b7f3", "#52e136"],
                        xaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        },
                        yaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        }
                    });

                    function showTooltip(x, y, contents) {
                        $('<div id="tooltip">' + contents + '</div>').css({
                            position: 'absolute',
                            display: 'none',
                            top: y + 5,
                            left: x + 15,
                            border: '1px solid #333',
                            padding: '4px',
                            color: '#fff',
                            'border-radius': '3px',
                            'background-color': '#333',
                            opacity: 0.80
                        }).appendTo("body").fadeIn(200);
                    }

                    var previousPoint = null;
                    $("#chart_13").bind("plothover", function (event, pos, item) {
                        $("#x").text(pos.x.toFixed(0));
                        $("#y").text(pos.y.toFixed(0));

                        if (item) {
                            if (previousPoint != item.dataIndex) {
                                previousPoint = item.dataIndex;

                                $("#tooltip").remove();
                                var x = item.datapoint[0].toFixed(0),
                                        y = item.datapoint[1].toFixed(0);
                                showTooltip(item.pageX, item.pageY, x + "日:" + y + "份");
                            }
                        } else {
                            $("#tooltip").remove();
                            previousPoint = null;
                        }
                    });
                }
                chart1();
            }
        });
        
         $.ajax({
            type: "POST",
            data:{"type":"3"},
            url: "evaluateStatisticsLineMonth.action",
            success: function (data) {
            var datas = eval('(' + data + ')');
                function chart1() {
                    var d=new Date();
                    var year= d.getFullYear(),
                            month= d.getMonth();
                    var day=new Date(year,month,0);
                    var daycount=day.getDate();
                    var pageviews=[],i;
                     for(i=1;i<=daycount;i++){
                        pageviews.push([i,datas[i]])
                    } 
                   /*  pageviews = [[1,2],[2,3]] */
                    var plot = $.plot($("#chart_14"), [{
                        data: pageviews,
                        label: "评价"
                    }
                    ], {
                        series: {
                            lines: {
                                show: true,
                                lineWidth: 2,
                                fill: true,
                                fillColor: {
                                    colors: [{
                                        opacity: 0.05
                                    }, {
                                        opacity: 0.01
                                    }
                                    ]
                                }
                            },
                            points: {
                                show: true
                            },
                            shadowSize: 2
                        },
                        grid: {
                            hoverable: true,
                            clickable: true,
                            tickColor: "#eee",
                            borderWidth: 0
                        },
                        colors: ["#d12610", "#37b7f3", "#52e136"],
                        xaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        },
                        yaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        }
                    });

                    function showTooltip(x, y, contents) {
                        $('<div id="tooltip">' + contents + '</div>').css({
                            position: 'absolute',
                            display: 'none',
                            top: y + 5,
                            left: x + 15,
                            border: '1px solid #333',
                            padding: '4px',
                            color: '#fff',
                            'border-radius': '3px',
                            'background-color': '#333',
                            opacity: 0.80
                        }).appendTo("body").fadeIn(200);
                    }

                    var previousPoint = null;
                    $("#chart_14").bind("plothover", function (event, pos, item) {
                        $("#x").text(pos.x.toFixed(0));
                        $("#y").text(pos.y.toFixed(0));

                        if (item) {
                            if (previousPoint != item.dataIndex) {
                                previousPoint = item.dataIndex;

                                $("#tooltip").remove();
                                var x = item.datapoint[0].toFixed(0),
                                        y = item.datapoint[1].toFixed(0);
                                showTooltip(item.pageX, item.pageY, x + "日:" + y + "份");
                            }
                        } else {
                            $("#tooltip").remove();
                            previousPoint = null;
                        }
                    });
                }
                chart1();
            }
        });
		}
		orderevaluate();
		</script>

		<!-- 投诉统计 -->
		<script type="text/javascript">
		function complaintStatistics(){
		/*用户投诉平台  */
		App.init();
		   $.ajax({
            type: "POST",
            data:{"type":"0"},
            url: "complaintStatisticsLineMonth.action",
            success: function (data) {
            var datas = eval('(' + data + ')');
                function chart1() {
                    var d=new Date();
                    var year= d.getFullYear(),
                            month= d.getMonth();
                    var day=new Date(year,month,0);
                    var daycount=day.getDate();
                    var pageviews=[],i;
                     for(i=1;i<=daycount;i++){
                        pageviews.push([i,datas[i]])
                    } 
                   /*  pageviews = [[1,2],[2,3]] */
                    var plot = $.plot($("#chart_15"), [{
                        data: pageviews,
                        label: "评价"
                    }
                    ], {
                        series: {
                            lines: {
                                show: true,
                                lineWidth: 2,
                                fill: true,
                                fillColor: {
                                    colors: [{
                                        opacity: 0.05
                                    }, {
                                        opacity: 0.01
                                    }
                                    ]
                                }
                            },
                            points: {
                                show: true
                            },
                            shadowSize: 2
                        },
                        grid: {
                            hoverable: true,
                            clickable: true,
                            tickColor: "#eee",
                            borderWidth: 0
                        },
                        colors: ["#d12610", "#37b7f3", "#52e136"],
                        xaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        },
                        yaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        }
                    });

                    function showTooltip(x, y, contents) {
                        $('<div id="tooltip">' + contents + '</div>').css({
                            position: 'absolute',
                            display: 'none',
                            top: y + 5,
                            left: x + 15,
                            border: '1px solid #333',
                            padding: '4px',
                            color: '#fff',
                            'border-radius': '3px',
                            'background-color': '#333',
                            opacity: 0.80
                        }).appendTo("body").fadeIn(200);
                    }

                    var previousPoint = null;
                    $("#chart_15").bind("plothover", function (event, pos, item) {
                        $("#x").text(pos.x.toFixed(0));
                        $("#y").text(pos.y.toFixed(0));

                        if (item) {
                            if (previousPoint != item.dataIndex) {
                                previousPoint = item.dataIndex;

                                $("#tooltip").remove();
                                var x = item.datapoint[0].toFixed(0),
                                        y = item.datapoint[1].toFixed(0);
                                showTooltip(item.pageX, item.pageY, x + "日:" + y + "份");
                            }
                        } else {
                            $("#tooltip").remove();
                            previousPoint = null;
                        }
                    });
                }
                chart1();
            }
        });
        /*护士投诉平台  */
		App.init();
		   $.ajax({
            type: "POST",
            data:{"type":"1"},
            url: "complaintStatisticsLineMonth.action",
            success: function (data) {
            var datas = eval('(' + data + ')');
                function chart1() {
                    var d=new Date();
                    var year= d.getFullYear(),
                            month= d.getMonth();
                    var day=new Date(year,month,0);
                    var daycount=day.getDate();
                    var pageviews=[],i;
                     for(i=1;i<=daycount;i++){
                        pageviews.push([i,datas[i]])
                    } 
                   /*  pageviews = [[1,2],[2,3]] */
                    var plot = $.plot($("#chart_16"), [{
                        data: pageviews,
                        label: "评价"
                    }
                    ], {
                        series: {
                            lines: {
                                show: true,
                                lineWidth: 2,
                                fill: true,
                                fillColor: {
                                    colors: [{
                                        opacity: 0.05
                                    }, {
                                        opacity: 0.01
                                    }
                                    ]
                                }
                            },
                            points: {
                                show: true
                            },
                            shadowSize: 2
                        },
                        grid: {
                            hoverable: true,
                            clickable: true,
                            tickColor: "#eee",
                            borderWidth: 0
                        },
                        colors: ["#d12610", "#37b7f3", "#52e136"],
                        xaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        },
                        yaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        }
                    });

                    function showTooltip(x, y, contents) {
                        $('<div id="tooltip">' + contents + '</div>').css({
                            position: 'absolute',
                            display: 'none',
                            top: y + 5,
                            left: x + 15,
                            border: '1px solid #333',
                            padding: '4px',
                            color: '#fff',
                            'border-radius': '3px',
                            'background-color': '#333',
                            opacity: 0.80
                        }).appendTo("body").fadeIn(200);
                    }

                    var previousPoint = null;
                    $("#chart_16").bind("plothover", function (event, pos, item) {
                        $("#x").text(pos.x.toFixed(0));
                        $("#y").text(pos.y.toFixed(0));

                        if (item) {
                            if (previousPoint != item.dataIndex) {
                                previousPoint = item.dataIndex;

                                $("#tooltip").remove();
                                var x = item.datapoint[0].toFixed(0),
                                        y = item.datapoint[1].toFixed(0);
                                showTooltip(item.pageX, item.pageY, x + "日:" + y + "份");
                            }
                        } else {
                            $("#tooltip").remove();
                            previousPoint = null;
                        }
                    });
                }
                chart1();
            }
        });
          /*用户投诉护士  */
		App.init();
		   $.ajax({
            type: "POST",
            data:{"type":"2"},
            url: "complaintStatisticsLineMonth.action",
            success: function (data) {
            var datas = eval('(' + data + ')');
                function chart1() {
                    var d=new Date();
                    var year= d.getFullYear(),
                            month= d.getMonth();
                    var day=new Date(year,month,0);
                    var daycount=day.getDate();
                    var pageviews=[],i;
                     for(i=1;i<=daycount;i++){
                        pageviews.push([i,datas[i]])
                    } 
                   /*  pageviews = [[1,2],[2,3]] */
                    var plot = $.plot($("#chart_17"), [{
                        data: pageviews,
                        label: "评价"
                    }
                    ], {
                        series: {
                            lines: {
                                show: true,
                                lineWidth: 2,
                                fill: true,
                                fillColor: {
                                    colors: [{
                                        opacity: 0.05
                                    }, {
                                        opacity: 0.01
                                    }
                                    ]
                                }
                            },
                            points: {
                                show: true
                            },
                            shadowSize: 2
                        },
                        grid: {
                            hoverable: true,
                            clickable: true,
                            tickColor: "#eee",
                            borderWidth: 0
                        },
                        colors: ["#d12610", "#37b7f3", "#52e136"],
                        xaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        },
                        yaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        }
                    });

                    function showTooltip(x, y, contents) {
                        $('<div id="tooltip">' + contents + '</div>').css({
                            position: 'absolute',
                            display: 'none',
                            top: y + 5,
                            left: x + 15,
                            border: '1px solid #333',
                            padding: '4px',
                            color: '#fff',
                            'border-radius': '3px',
                            'background-color': '#333',
                            opacity: 0.80
                        }).appendTo("body").fadeIn(200);
                    }

                    var previousPoint = null;
                    $("#chart_17").bind("plothover", function (event, pos, item) {
                        $("#x").text(pos.x.toFixed(0));
                        $("#y").text(pos.y.toFixed(0));

                        if (item) {
                            if (previousPoint != item.dataIndex) {
                                previousPoint = item.dataIndex;

                                $("#tooltip").remove();
                                var x = item.datapoint[0].toFixed(0),
                                        y = item.datapoint[1].toFixed(0);
                                showTooltip(item.pageX, item.pageY, x + "日:" + y + "份");
                            }
                        } else {
                            $("#tooltip").remove();
                            previousPoint = null;
                        }
                    });
                }
                chart1();
            }
        });
        
         /*护士投诉用户  */
		App.init();
		   $.ajax({
            type: "POST",
            data:{"type":"3"},
            url: "complaintStatisticsLineMonth.action",
            success: function (data) {
            var datas = eval('(' + data + ')');
                function chart1() {
                    var d=new Date();
                    var year= d.getFullYear(),
                            month= d.getMonth();
                    var day=new Date(year,month,0);
                    var daycount=day.getDate();
                    var pageviews=[],i;
                     for(i=1;i<=daycount;i++){
                        pageviews.push([i,datas[i]])
                    } 
                   /*  pageviews = [[1,2],[2,3]] */
                    var plot = $.plot($("#chart_18"), [{
                        data: pageviews,
                        label: "评价"
                    }
                    ], {
                        series: {
                            lines: {
                                show: true,
                                lineWidth: 2,
                                fill: true,
                                fillColor: {
                                    colors: [{
                                        opacity: 0.05
                                    }, {
                                        opacity: 0.01
                                    }
                                    ]
                                }
                            },
                            points: {
                                show: true
                            },
                            shadowSize: 2
                        },
                        grid: {
                            hoverable: true,
                            clickable: true,
                            tickColor: "#eee",
                            borderWidth: 0
                        },
                        colors: ["#d12610", "#37b7f3", "#52e136"],
                        xaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        },
                        yaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        }
                    });

                    function showTooltip(x, y, contents) {
                        $('<div id="tooltip">' + contents + '</div>').css({
                            position: 'absolute',
                            display: 'none',
                            top: y + 5,
                            left: x + 15,
                            border: '1px solid #333',
                            padding: '4px',
                            color: '#fff',
                            'border-radius': '3px',
                            'background-color': '#333',
                            opacity: 0.80
                        }).appendTo("body").fadeIn(200);
                    }

                    var previousPoint = null;
                    $("#chart_18").bind("plothover", function (event, pos, item) {
                        $("#x").text(pos.x.toFixed(0));
                        $("#y").text(pos.y.toFixed(0));

                        if (item) {
                            if (previousPoint != item.dataIndex) {
                                previousPoint = item.dataIndex;

                                $("#tooltip").remove();
                                var x = item.datapoint[0].toFixed(0),
                                        y = item.datapoint[1].toFixed(0);
                                showTooltip(item.pageX, item.pageY, x + "日:" + y + "份");
                            }
                        } else {
                            $("#tooltip").remove();
                            previousPoint = null;
                        }
                    });
                }
                chart1();
            }
        });
        
         /*护士投诉订单  */
		App.init();
		   $.ajax({
            type: "POST",
            data:{"type":"4"},
            url: "complaintStatisticsLineMonth.action",
            success: function (data) {
            var datas = eval('(' + data + ')');
                function chart1() {
                    var d=new Date();
                    var year= d.getFullYear(),
                            month= d.getMonth();
                    var day=new Date(year,month,0);
                    var daycount=day.getDate();
                    var pageviews=[],i;
                     for(i=1;i<=daycount;i++){
                        pageviews.push([i,datas[i]])
                    } 
                   /*  pageviews = [[1,2],[2,3]] */
                    var plot = $.plot($("#chart_19"), [{
                        data: pageviews,
                        label: "评价"
                    }
                    ], {
                        series: {
                            lines: {
                                show: true,
                                lineWidth: 2,
                                fill: true,
                                fillColor: {
                                    colors: [{
                                        opacity: 0.05
                                    }, {
                                        opacity: 0.01
                                    }
                                    ]
                                }
                            },
                            points: {
                                show: true
                            },
                            shadowSize: 2
                        },
                        grid: {
                            hoverable: true,
                            clickable: true,
                            tickColor: "#eee",
                            borderWidth: 0
                        },
                        colors: ["#d12610", "#37b7f3", "#52e136"],
                        xaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        },
                        yaxis: {
                            ticks: 11,
                            tickDecimals: 0
                        }
                    });

                    function showTooltip(x, y, contents) {
                        $('<div id="tooltip">' + contents + '</div>').css({
                            position: 'absolute',
                            display: 'none',
                            top: y + 5,
                            left: x + 15,
                            border: '1px solid #333',
                            padding: '4px',
                            color: '#fff',
                            'border-radius': '3px',
                            'background-color': '#333',
                            opacity: 0.80
                        }).appendTo("body").fadeIn(200);
                    }

                    var previousPoint = null;
                    $("#chart_19").bind("plothover", function (event, pos, item) {
                        $("#x").text(pos.x.toFixed(0));
                        $("#y").text(pos.y.toFixed(0));

                        if (item) {
                            if (previousPoint != item.dataIndex) {
                                previousPoint = item.dataIndex;

                                $("#tooltip").remove();
                                var x = item.datapoint[0].toFixed(0),
                                        y = item.datapoint[1].toFixed(0);
                                showTooltip(item.pageX, item.pageY, x + "日:" + y + "份");
                            }
                        } else {
                            $("#tooltip").remove();
                            previousPoint = null;
                        }
                    });
                }
                chart1();
            }
        });
		}
		complaintStatistics();
		</script>
</body>
</html>