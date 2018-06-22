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
    //管理员ID       
    String orderSendId = request.getParameter("orderSendId");
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
<link href="lib/icheck/icheck.css" rel="stylesheet" type="text/css" />
<link href="lib/Hui-iconfont/1.0.7/iconfont.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script></head>
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>沟通客户</title>

<body style="width: 100% !important;height: 100% !important">
<a class="layui-layer-ico layui-layer-max" href="${pageContext.request.contextPath}/OrderList.action?state=4"><button class="btn btn-primary" style="border-radius:5px">返回</button></a>
<div class="pd-20">
<input type="hidden" value="${state }" id="state" />
	<form action="${pageContext.request.contextPath}/paymentCommunication.action" method="GET" class="form form-horizontal" id="form-admin-add" >
	<input type="hidden" value="<%=orderSendId%>" id="orderSendId" name="orderSendId" />
	<input type="hidden" value="<%=userId%>" id="userId" name="userId" />
		<div class="row cl">
			<label class="form-label col-3">客户话术：</label>
			<div class="formControls col-5">
				<textarea name=content id="content"  cols="" rows="" class="textarea"  placeholder="说点什么...100个字符以内"  onKeyUp="textarealength(this,100)">${complaint.complaintContent }</textarea>
				<p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3">备注：</label>
			<div class="formControls col-5">
				<textarea name="userSpeak" cols="" rows="" class="textarea"  placeholder="说点什么...100个字符以内"  onKeyUp="textarealength(this,100)">${complaint.complaintContentSpeak }</textarea>
				<p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<div class="col-9 col-offset-3">
				<input class="btn btn-primary" type="submit" onclick="javascript:return confirm('您确认要提交数据吗？');" value="提交"/>
			</div>
		</div>
	</form>
</div>
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script> 
<script type="text/javascript" src="lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="lib/Validform/5.3.2/Validform.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script> 
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script> 
<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#form-admin-add").Validform({
		tiptype:2,
		callback:function(form){
			form[0].submit();
			var index = parent.layer.getFrameIndex(window.name);
			parent.$('.btn-refresh').click();
			parent.layer.close(index);
		}
	});
});
</script>

</body>
<script type="text/javascript">
/* function butsumit111(){
//账号
var userSpeak = $("#userSpeak").val();
layer.confirm('确认要提交吗？',function(index){
		document.getElementById("form-admin-add").submit();
	});
} */

function checkstate(){
	var state = $("#state").val();
if(state == "0"){
	layer.msg('提交成功!',{icon: 6,time:5000});
}else if(state == "1"){
	layer.msg('提交失败!',{icon: 5,time:5000});
}else if(state == "3"){
	layer.msg('客户话术不能为空!',{icon: 6,time:5000});
}
}
checkstate();
</script>
</html>