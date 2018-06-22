<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.net.URLEncoder" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta content="utf-8">
    <base href="<%=basePath%>">
    
    <title>套餐</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=0.5, maximum-scale=2.0, user-scalable=yes" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
img {
	 width: 100% !important;
	height:auto;
	overflow:hidden;

}
</style>
  <script type="text/javascript" src="js/jquery-1.9.1.min.js"></script></head>
  
  <body style="style="overflow-x:hidden"">
	  <c:if test="${empty packageDescribe}">
	  	<div>暂无内容</div>
	  </c:if>
	  <c:if test="${!empty packageDescribe}">
	  	<div>${packageDescribe}</div>
	  </c:if>
  </body>

</html>
