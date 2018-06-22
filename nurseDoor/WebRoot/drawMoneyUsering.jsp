<!DOCTYPE>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=9"/>
<meta http-equiv="X-UA-Compatible" content="IE=10"/>
<meta name="apple-mobile-web-app-capable" content="yes" />
<meta name="apple-mobile-web-app-status-bar-style" content="black-translucent" />
<title>后台模板管理系统</title>
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>

<link href="css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="lib/Hui-iconfont/1.0.7/iconfont.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script> 
<script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script> 

<style type="text/css">
.table>tbody>tr>td, .table>tbody>tr>th, 
.table>tfoot>tr>td, .table>tfoot>tr>th, 
.table>thead>tr>td, .table>thead>tr>th{
vertical-align: middle;
}
.but:hover{
text-decoration:none;
color: #FFFFFF;
}
.but{
color: #FFFFFF;
}
</style>
</head>
<body >
<ul class="nav nav-tabs">
  <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/selectUserDrawMoneyNow.action">申请中</a></li>
  <li role="presentation"><a href="${pageContext.request.contextPath}/selectUserDrawMoneyNed.action">申请过</a></li>
</ul>	

  <div style="overflow: scroll;margin-left: 15px;margin-top: 30px" class="bs-example" data-example-id="panel-without-body-with-table">
  <div class="pd-20">
<form action="${pageContext.request.contextPath}/DrawMoneyActionKeWord.action" method="post">
<input value="0" name="identity" type="hidden"/>
<input value="0" name="drawState" type="hidden"/>
	<div class="text-c"> 
	日期范围：
		<input type="text" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}'})" id="datemin" name="logmin" value="${datemin }" class="input-text Wdate" style="width:120px;">
		-
		<input type="text" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d'})" id="datemax" name="logmax" value="${datemax }" class="input-text Wdate" style="width:120px;">
		<button type="submit" class="btn btn-success" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 快捷搜索</button>
	</div>
</form>	
</div>
  
    <div class="panel panel-default">
      <div class="panel-heading">此表显示正在申请提现的信息</div>
      <table class="table" >
        <thead>
          <tr>
            <th>#</th>
            <th>用户账号</th>
            <th>用户昵称</th>
            <th>申请金额</th>
            <th>支付宝账号</th>
            <th>申请时间</th>
            <th style="text-align: center;">操作</th>
          </tr>
        </thead>
        
        <tbody>
        
        <c:forEach items="${list}" var="s" varStatus="z">
          <tr>
            <th scope="row">${z.index+1}</th>
            <td>${s.userName}</td>
            <td>${s.userNick}</td>
            <td>${s.drawMoneySize}&nbsp;元</td>
            <td>${s.aliPayAccount}</td>
            <td><fmt:formatDate value="${s.drawMoneyCreatetime}" pattern="yyyy-MM-dd HH:mm"/></td>
            <td style="text-align: center;">
            	<div class="btn-group btn-group-lg" role="group" aria-label="Large button group">
				     <a class="but" style="text-decoration: n" href="${pageContext.request.contextPath}/delDrawMoneyById.action?drawMoneyId=${s.drawMoneyId}&drawMoneySize=${s.drawMoneySize}&userId=${s.drawMoneyUsersId}"> <button onclick="return confirm('是否驳回?')" type="button" class="btn btn-danger" >驳回</button></a>
				      <a class="but" href="${pageContext.request.contextPath}/giveMoney.action?drawMoneyId=${s.drawMoneyId}"><button onclick="return confirm('是否同意提现?')" type="button" class="btn btn-success">提现</button></a>
   	 			</div>
            </td>
          </tr>
         </c:forEach>
         
         
        </tbody>
      </table>
    </div>
  </div>
	
	 <div style="text-align: center;" class="bs-example" data-example-id="simple-pagination">
    <nav>
      <ul class="pagination">
       
        <c:if test="${pageNow > 1}">
         <li style="float:left">
          <a href="${pageContext.request.contextPath}/selectUserDrawMoneyNow.action?pageNow=${pageNow-1}" aria-label="Previous">
            <span aria-hidden="true">«</span>
          </a>
         </li>
        </c:if>
       <c:forEach begin="${start}" end="${end}" var="p">
	       <c:if test="${p == pageNow}">
	         <li><a style="color: red;">${p}</a></li>
		   </c:if>
		   <c:if test="${p != pageNow &&  p != 0}">
	         <li><a href="${pageContext.request.contextPath}/selectUserDrawMoneyNow.action?pageNow=${p}">${p}</a></li>
	       </c:if>
       </c:forEach> 
       <c:if test="${totalPage > pageNow}">
        <li>
          <a href="${pageContext.request.contextPath}/selectUserDrawMoneyNow?pageNow=${pageNow+1}" aria-label="Next">
            <span aria-hidden="true">»</span>
          </a>
        </li>
       </c:if> 
      </ul>
    </nav>
  </div>		
	
	
	
</body>
</html>
