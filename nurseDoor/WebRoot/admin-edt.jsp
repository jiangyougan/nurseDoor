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
    String adminuser = (String)session.getAttribute("adminUserId");
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
<title>添加管理员</title>

<body style="width: 100% !important;height: 100% !important">
<div class="pd-20">
<input type="hidden" value="${adminstate }" id="adminstate" /> 

	<form action="${pageContext.request.contextPath}/updateAdmin.action" method="post" class="form form-horizontal" id="form-admin-add" name="addadmin">
	<input type="hidden" value="<%=adminuser%>" id="adminUserId" name="adminUserId" />
	<input type="hidden" value="${administration.administrationId }" name="administrationId" /> 
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>账号：</label>
			<div class="formControls col-5">
				<input type="text" onfocus="this.blur()" class="input-text" value="${administration.administrationName }" placeholder="" id="username" name="username" datatype="*2-16" nullmsg="账号不能为空">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>初始密码：</label>
			<div class="formControls col-5">
				<input type="password" placeholder="密码" autocomplete="off" value="${administration.administrationPwd }" class="input-text" datatype="*6-20" nullmsg="密码不能为空" id="newpassword" name="newpassword">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>确认密码：</label>
			<div class="formControls col-5">
				<input type="password" placeholder="确认新密码" value="${administration.administrationPwd }" autocomplete="off" class="input-text Validform_error" errormsg="您两次输入的新密码不一致！" datatype="*" nullmsg="请再输入一次新密码！" recheck="newpassword" id="newpassword2" name="newpassword2">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>昵称：</label>
			<div class="formControls col-5">
				<input type="text" placeholder="请输入昵称" value="${administration.administrationNick }"  class="input-text"  datatype="*"   id="nick" name="nick">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl" style="display: none;">
			<label class="form-label col-3"><span class="c-red">*</span>真实姓名：</label>
			<div class="formControls col-5">
				<input type="text" placeholder="请输入真实姓名"   class="input-text"  datatype="*"   id="trueName" name="trueName">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>性别：</label>
			<div class="formControls col-5 skin-minimal">
				<c:if test="${administration.administrationSex == 1 }">
					<div class="radio-box">
						<input type="radio" id="sex-1"  name="sex" datatype="*" checked="checked" nullmsg="请选择性别！">
						<label for="sex-1">男</label>
					</div>
					<div class="radio-box">
						<input type="radio" id="sex-2" name="sex">
						<label for="sex-2">女</label>
					</div>
				</c:if>
				<c:if test="${administration.administrationSex == 2 }">
					<div class="radio-box">
						<input type="radio" id="sex-1"  name="sex" datatype="*"  nullmsg="请选择性别！">
						<label for="sex-1">男</label>
					</div>
					<div class="radio-box">
						<input type="radio" id="sex-2" name="sex" checked="checked">
						<label for="sex-2">女</label>
					</div>
				</c:if>
			</div>
			<div class="col-4"> </div>
		</div>
		<!-- <div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>手机：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" value="" placeholder="" id="user-tel" name="usertel"  datatype="m" nullmsg="手机不能为空">
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3"><span class="c-red">*</span>邮箱：</label>
			<div class="formControls col-5">
				<input type="text" class="input-text" placeholder="@" name="email" id="email" datatype="e" nullmsg="请输入邮箱！">
			</div>
			<div class="col-4"> </div>
		</div> -->
		<div class="row cl">
			<label class="form-label col-3">角色：</label>
			<div class="formControls col-5"> <span class="select-box" style="width:150px;">
				<select class="select" name="admingrade" size="1">
					<c:if test="${administration.administrationGrade == 0 }">
						<option value="1">管理员</option>
						<option value="2" selected="selected">编辑</option>
						<option value="9">客服</option>
					</c:if>
					<c:if test="${administration.administrationGrade == 1 }">
						<option value="2" selected="selected">编辑</option>
						<option value="9">客服</option>
					</c:if>
				</select>
				</span> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-3">备注：</label>
			<div class="formControls col-5">
				<textarea name="note" cols="" rows="" class="textarea"  placeholder="说点什么...100个字符以内" dragonfly="true" onKeyUp="textarealength(this,100)">${administration.administrationAddress }</textarea>
				<p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
			</div>
			<div class="col-4"> </div>
		</div>
		<div class="row cl">
			<div class="col-9 col-offset-3">
				<button class="btn btn-primary " style="border-radius:5px" id="butsumit" onclick="butsumit2()">提交</button>
				<a class="layui-layer-ico layui-layer-max" onclick="self.location=document.referrer;"><button class="btn btn-primary" style="border-radius:5px">返回</button></a>
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
function butsumit2(){
//账号
var username = $("#username").val();
//第一次密码
var newpassword = $("#newpassword").val();
//确认密码
var newpassword2 = $("#newpassword2").val();
//昵称
var nick = $("#nick").val();
//真实姓名
/* var trueName = $("#trueName").val(); */
if(username == ""){
layer.msg('账号不能为空!',{icon: 6,time:1000});
}else if(newpassword == ""){
layer.msg('密码不能为空!',{icon: 6,time:1000});
}else if(newpassword != newpassword2){
layer.msg('2次密码不一致!',{icon: 6,time:1000});
}else if(nick == ""){
layer.msg('昵称不能为空!',{icon: 6,time:1000});
}else{
layer.confirm('确认要提交吗？',function(index){
		document.getElementById("form-admin-add").submit();
	});
}

}

function checkstate(){
	var adminstate = $("#adminstate").val();
if(adminstate == "0"){
	layer.msg('出现了不可预知的错误!',{icon: 5,time:5000});
}else if(adminstate == "1"){
	layer.msg('修改成功!',{icon: 6,time:5000});
}
}
checkstate();


function winopen(){

}
winopen();
</script>
</html>