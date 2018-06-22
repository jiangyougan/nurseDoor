<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
	<meta charset="utf-8">
	<title>添加客服电话</title>
	<link rel="stylesheet" media="screen" href="css/poststyles.css" >
	
	
	
	<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script> 
<script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="lib/Validform/5.3.2/Validform.min.js"></script> 
<script type="text/javascript" src="lib/webuploader/0.1.5/webuploader.min.js"></script> 
<script type="text/javascript" charset="utf-8" src="ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="ueditor.all.min.js"> </script>
<script type="text/javascript" src="lang/zh-cn/zh-cn.js"></script>
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script> 
    <style>
    .contact_form{padding-top:40px;}
	.title {background-color:rgba(0,0,0,0.56); text-align:center; width:100%; position:fixed; top:0; left:0; padding:5px 0;}
.title a {color:#FFF; text-decoration:none; font-size:16px; font-weight:bolder; line-height:24px;}
    </style>
</head>
<body>
<div align="center">
<table border="1" width="47%" height="250" style="border-width: 0px">
	<!-- MSTableType="layout" -->
	<tr>
		<td style="border-style: none; border-width: medium">　
		<form class="contact_form" action="addCustomerServicePhone.action" method="post" name="contact_form" enctype="multipart/form-data">
    <ul>
        <li>
             <h2>添加客服电话</h2>
             <span class="required_notification">* 表示必填项(联系客服只能是默认电话)</span>
        </li>
        <li>
            <label for="name">客服电话:</label>
            <input type="text" name="phone"  placeholder="888-8888-8888" required />
        </li>
        <li>
         <label for="name">备注:</label>
        <textarea name="note" cols="40" rows="6"  required ></textarea>
        </li>
       <%--  <li>
            <label for="email">选择帖子关联:</label>
            <select name="postTwoName">
            	<option selected="selected" value="">请选择所属内容</option>
            	<c:forEach items="${list }" var="s">
            	<option value="${s.postTwoLevelId }">${s.postTwoLevelName }</option>
            	</c:forEach>
            </select>
        </li> --%>
         <li>
            <label for="website1">是否默认(为空不默认):</label>
            <input type="radio" value="1" style="box-shadow:0px 0px 0px #FFFFFF, 0 0px 0px #FFFFFF inset;width: 50px"  name="isdefault" id="j1"/>是
            <input type="radio" value="0" style="box-shadow:0px 0px 0px #FFFFFF, 0 0px 0px #FFFFFF inset;width: 50px"  name="isdefault" id="j2"/>否
        </li>
         <li>
            <label for="website">是否启用(为空启用):</label>
            <input type="radio" value="0" style="box-shadow:0px 0px 0px #FFFFFF, 0 0px 0px #FFFFFF inset;width: 50px"  name="isuse" id="i1"/>是
            <input type="radio" value="1" style="box-shadow:0px 0px 0px #FFFFFF, 0 0px 0px #FFFFFF inset;width: 50px"  name="isuse" id="i2"/>否
        </li>
        <li>
        	<button class="submit" type="submit">Submit Form</button>
        </li>
    </ul>
</form></td>
	</tr>
</table>
<input type="hidden" value="${customerServiceState }" id="poststate">
</div>
<div style="text-align:center;clear:both">
</div>
</body>
<script type="text/javascript">
function check(){
	var poststate = $("#poststate").val();
	if(poststate == 1){
	self.location=document.referrer;
	alert("默认电话只能添加一个");
	}else if(poststate == 2){
	self.location=document.referrer;
	alert("添加成功");
	}else if(poststate == 3){
	self.location=document.referrer;
	alert("添加失败");
	}
}
check();
</script>
</html>