<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
	+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
	String host = request.getScheme() + "://" + request.getServerName()
            + ":" + request.getServerPort() + "/";
            //路径
    String webPath = basePath.substring(0, basePath.length()-10);
    
    String userId = request.getParameter("userId");
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
<link href="css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="lib/Hui-iconfont/1.0.7/iconfont.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]--><title>用户查看</title>
</head>
<body  onload="onload()">
<div class="cl pd-20" style=" background-color:#5bacb6">
<input type="hidden" value="<%=userId%>" name="userId" id="userId">
<input type="hidden" value="${checkstate }" name="checkstate" id="checkstate">
  <img class="avatar size-XL l" src="<%=webPath%>${user.userHeader }">
  <dl style="margin-left:80px; color:#fff">
    <dt><span class="f-18">${user.userNick }</span></dt>
  </dl>
</div>
<div class="pd-20">
  <table class="table">
    <tbody>
      <tr>
      <tr>
        <th class="text-r" width="80">账号：</th>
        <td>${user.userName }</td>
      </tr>
        <th class="text-r" width="80">性别：</th>
        <c:if test="${user.userSex == 1}">
          <td>男</td>
        </c:if>
       <c:if test="${user.userSex == 2}">
          <td>女</td>
        </c:if>
      </tr>
      <tr>
        <th class="text-r" width="80">年龄：</th>
        <td>${user.userAge }</td>
      </tr>
      <tr>
        <th class="text-r" width="80">邀请码：</th>
        <td>${user.userInvitationcode }</td>
      </tr>
      <tr>
        <th class="text-r" width="80">真实姓名：</th>
        <td>${user.userTruename }</td>
      </tr>
       <tr>
        <th class="text-r" width="80">身份证号码：</th>
        <td>${user.userCard }</td>
      </tr>
      <tr>
        <th class="text-r">手机：</th>
        <td>${user.userPhone }</td>
      </tr>
       <tr>
      <%--   <th class="text-r">身份证照片：</th>
        <td> <img alt="" src="<%=webPath%>${user.userCardpic }"> </td> --%>
      </tr>
      <tr>
        <th class="text-r">省份城市：</th>
        <td>${user.userProvince }</td>
      </tr>
       <tr>
        <th class="text-r">支付宝账号：</th>
        <td>${user.userProvince }</td>
      </tr>
      <tr>
        <th class="text-r">邮箱：</th>
        <td>${user.userEmail }</td>
      </tr>
      <tr>
        <th class="text-r">地址：</th>
        <td>${user.userAddress }</td>
      </tr>
      <tr>
        <th class="text-r">注册时间：</th>
        <td><fmt:formatDate value="${user.userCreatetime }" type="both"></fmt:formatDate></td>
      </tr>
       <tr>
        <th class="text-r">余额：</th>
        <td>${user.userBalance }元</td>
      </tr>
      
       <tr>
        <th class="text-r">优惠券：</th>
        <td>${userCouponCount }张</td>
      </tr>
      
      <tr>
        <th class="text-r">积分：</th>
        <td>${user.userMark }</td>
      </tr>
    </tbody>
  </table>
</div>
<script type="text/javascript" src="js/jquery.min.js"></script> 
<script type="text/javascript" src="js/H-ui.js"></script>
<script type="text/javascript" src="js/H-ui.admin.js"></script>
</body>
<script type="text/javascript">
function onload(){
var state = true;
var userId = $("#userId").val();
var checkstate = $("#checkstate").val();
if(checkstate == ""){
location.href = "${pageContext.request.contextPath}/selectAllUserInfoByUserId.action?userId=" + userId;
}
}
</script>
</html>