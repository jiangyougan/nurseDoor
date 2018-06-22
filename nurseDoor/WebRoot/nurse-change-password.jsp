<!DOCTYPE HTML>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<%
String nurseId = request.getParameter("nurseId");
System.out.println("nurseId="+nurseId);
 %>
<title>修改密码</title>
</head>
<body>
<div class="pd-20">
	<form action="/" method="post" class="form form-horizontal" id="form-change-password">
		<div class="row cl">
			<label class="form-label col-4"><span class="c-red">*</span>新密码：</label>
			<div class="formControls col-4">
				<input type="password" class="input-text" autocomplete="off" placeholder="不修改请留空" name="new-password" id="new-password" datatype="*6-18" ignore="ignore" >
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-4"><span class="c-red">*</span>确认密码：</label>
			<div class="formControls col-4">
				<input type="password" class="input-text" autocomplete="off" placeholder="不修改请留空" name="new-password2" id="new-password2" recheck="new-password" datatype="*6-18" errormsg="您两次输入的密码不一致！" ignore="ignore" >
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<div class="col-8 col-offset-4">
				<input class="btn btn-primary radius" onclick="submitFrom('<%=nurseId %>')" type="button" value="&nbsp;&nbsp;保存&nbsp;&nbsp;">
			</div>
		</div>
	</form>
</div>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/Validform/5.3.2/Validform.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script>
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script>
<script>
function submitFrom(id){
//第一个密码
var pwd1 = $("#new-password").val();
//第二个密码
var pwd2 = $("#new-password2").val();
if(pwd1 == '' || pwd2 == ''){
layer.msg('如要修改请输入新密码!',{icon: 6,time:1000});
return;
}
if(pwd1 != pwd2 ){
layer.msg('两次密码输入不一致!',{icon: 6,time:1000});
return;
}
layer.confirm('确认要修改吗？',function(index){
			$.ajax({
						url: "${pageContext.request.contextPath}/updateNursePwd.action",              //请求地址
				        type: "POST",                       //请求方式
				        data: { "nurseId": id,"pwd":pwd1},        //请求参数
				        dataType: "json",
				        success: function (date) {
					        if(date==0){
					        layer.msg('修改成功!', {icon: 6, time: 1500});
					        //location.href = "${pageContext.request.contextPath}/OrderList.action?state=0";
					        }else {
					        layer.msg('修改失败!', {icon: 5, time: 1500});
					        }
				        },
				        fail: function (status) {
        				}
				  });
	});
}

</script>
</body>
</html>