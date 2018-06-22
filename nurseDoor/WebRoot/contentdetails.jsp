<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>详情</title>
    <meta content="utf-8">
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
 p {
	 margin: 5px;
	 padding: 0px
} 
</style>
  </head>
  
  <body>
  <div>
	  <!--  <h2 style="color: #666666;font-size: 19px" >护理内容</h2> -->
	   <c:if test="${empty packageDescribe}">
		  	<!-- <div>暂无内容</div> -->
		  </c:if>
		  <c:if test="${!empty packageDescribe}">
		  	<div>${packageDescribe}</div>
		  </c:if>
		  
		   <!-- <h2 style="color: #666666;font-size: 19px">适用人群</h2> -->
    <c:if test="${empty contentforpeople}">
	  	<!-- <div>暂无内容</div> -->
	  </c:if>
	  <c:if test="${!empty contentforpeople}">
	  	<div style="margin-top: -2%">${contentforpeople }</div>
	  </c:if>
	  
	   <!-- <h2 style="color: #666666;font-size: 19px">注意事项</h2> -->
     <c:if test="${empty contentlook}">
	  <!-- 	<div>暂无内容</div> -->
	  </c:if>
	  <c:if test="${!empty contentlook}">
	  	<div style="margin-top: -2%"> ${contentlook }</div>
	  </c:if>
  </div>
  
  </body>
</html>
