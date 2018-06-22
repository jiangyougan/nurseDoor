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
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>新建投诉</title>
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script></head>
<body>
<div class="pd-20">
  <form action="" method="post" class="form form-horizontal" name="form1" id="form1" enctype="multipart/form-data" >
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>投诉人账号：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" value="" placeholder="" id="complaintAccount" name="complaintAccount" datatype="*2-16" nullmsg="用户或护士账号" maxlength='11'>
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>被投诉人账号：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" value="" placeholder="用户或护士账号" id="becomplaintAccount" name="becomplaintAccount"   maxlength='11'>
      </div>
      <div class="col-4"> </div>
    </div>
   
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>订单单号：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" placeholder="订单单号" name="orderNumber" id="orderNumber"  maxlength='13'>
      </div>
    </div>
     <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>反馈内容：</label>
      <div class="formControls col-5">
        <textarea id="content" name="content" cols="" rows="" class="textarea"  placeholder="反馈内容" datatype="*10-100" dragonfly="true" >${complaint.complaintContent }</textarea>
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>谈话内容：</label>
      <div class="formControls col-5">
       <textarea id="userSpeak" name="userSpeak" cols="" rows="" class="textarea"  placeholder="谈话内容" datatype="*10-100" dragonfly="true" >${complaint.complaintContentSpeak }</textarea>
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3">投诉类别：</label>
      <div class="formControls col-5"> <span class="select-box">
        <select class="select" size="1" id="brandclass" name="demo1" datatype="*" nullmsg="请选择处理方式！">
          <option value="0" selected>用户投诉平台</option>
          <option value="1">护士投诉平台</option>
          <option value="2">用户投诉护士</option>
          <option value="3">护士投诉用户</option>
          <option value="4">护士投诉订单</option>
        </select>
     </span> </div>
      <div class="col-4"> </div>
    </div> 
    <div class="row cl">
      <label class="form-label col-3">客服备注：</label>
      <div class="formControls col-5">
        <textarea name="note" id="note" cols="" rows="" class="textarea"  placeholder="客服备注" datatype="*10-100" dragonfly="true" ></textarea> <!-- onKeyUp="textarealength(this,100)" -->
        <p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <div class="col-9 col-offset-3">
        <!-- <input class="btn btn-primary radius" onclick="check()" type="button" value="&nbsp;&nbsp;提交&nbsp;&nbsp;"/> -->
        <input class="btn btn-primary radius" onclick="check()" type="button" value="&nbsp;&nbsp;提交&nbsp;&nbsp;"/>
      </div>
    </div>
    <input type="hidden" value="${state }" id="test"/>
  </form>
</div>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script>
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script> 
<script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script> 
<script type="text/javascript">
//面额输入框的限制条件
$("input[id*='complaintAccount']").keyup(function () { 
    var reg = $(this).val().match(/\d+\.?\d{0,2}/); 
    var txt = ''; 
    if (reg != null) { 
       txt = reg[0]; 
     } 
    $(this).val(txt); 
}).change(function () { 
    $(this).keypress(); 
    var v = $(this).val(); 
    if (/\.$/.test(v)){ 
        $(this).val(v.substr(0, v.length - 1)); 
    } 
}); 
//过期时间(整数)
$("input[id*='orderNumber']").keyup(function () { 
    var reg = $(this).val().match('^([0-9]*)$'); 
    var txt = ''; 
    if (reg != null) { 
       txt = reg[0]; 
     } 
    $(this).val(txt); 
}).change(function () { 
    $(this).keypress(); 
    var v = $(this).val(); 
    if (/\.$/.test(v)){ 
        $(this).val(v.substr(0, v.length - 1)); 
    } 
}); 

//表单提交
function check()
{
	layer.confirm('确认要提交吗？',function(index){
	//投诉人
	var complaintAccount = $("#complaintAccount").val();
	//被投诉人
	var becomplaintAccount = $("#becomplaintAccount").val();
	//单号
	var orderNumber = $("#orderNumber").val();
	//谈话内容
	var userSpeak = $("#userSpeak").val();
	//反馈内容
	var content = $("#content").val();
	//客服备注
	var note = $("#note").val();
	//得到投诉类别
	var demo1 = $("#brandclass").val();
	if(demo1 == 0 || demo1 == 1){//用户投诉平台//护士投诉平台
		if(becomplaintAccount != null && becomplaintAccount != ""){
			layer.msg('投诉平台请不要添加被投诉人账号!',{icon: 5,time:3000});
			return;
		}
		if(orderNumber != null && orderNumber != ""){
			layer.msg('投诉平台请不要添加订单单号!',{icon: 5,time:3000});
			return;
		}
	}
	if(demo1 == 2 || demo1 == 3){//用户投诉护士//护士投诉用户
		if(becomplaintAccount == null || becomplaintAccount == ""){
			layer.msg('投诉用户或护士被投诉人不能为空!',{icon: 5,time:3000});
			return;
		}
		if(orderNumber != null && orderNumber != ""){
			layer.msg('投诉用户或护士请不要添加订单单号!',{icon: 5,time:3000});
			return;
		}
	}
	if(demo1 == 4){//用户投诉护士//护士投诉用户
		if(becomplaintAccount != null && becomplaintAccount != ""){
			layer.msg('投诉订单请不要添加被投诉人账号!',{icon: 5,time:3000});
			return;
		}
		if(orderNumber == null || orderNumber == ""){
			layer.msg('投诉订单单号不能为空!',{icon: 5,time:3000});
			return;
		}
	}
		if(complaintAccount==null || complaintAccount==""){
			layer.msg('投诉人账号不能为空!',{icon: 5,time:3000});
		}else if(userSpeak==null || userSpeak==""){
			layer.msg('谈话内容不能为空!',{icon: 5,time:3000});
		}else{
			//$("#form1").submit();
			$.ajax({
						url: "${pageContext.request.contextPath}/complaintNewCustomerService.action",              //请求地址
				        type: "POST",                       //请求方式
				        data: { "complaintAccount": complaintAccount,"becomplaintAccount":becomplaintAccount,"orderNumber":orderNumber,
				        "userSpeak":userSpeak,"demo1":demo1,"content":content,"note":note},        //请求参数
				        dataType: "json",
				        success: function (str) {
					        if(str == 1){
								layer.msg('提交成功!',{icon: 6,time:2000});
								}
							if(str == 2){
								layer.msg('提交失败!',{icon: 5,time:2000});
							}
							if(str == 3){
								layer.msg('投诉人的用户账号不存在!',{icon: 5,time:2000});
							}
							if(str == 4){
								layer.msg('投诉人的护士账号不存在!',{icon: 5,time:2000});
							}
							if(str == 5){
								layer.msg('该订单不存在!',{icon: 5,time:2000});
							}
				        },
				  });
			
			
			
		}
	});
}

function test(){
var str = $("#test").val();
if(str == 1){
layer.msg('提交成功!',{icon: 6,time:2000});
}
if(str == 2){
layer.msg('提交失败!',{icon: 5,time:2000});
}
if(str == 3){
layer.msg('投诉人的用户账号不存在!',{icon: 5,time:2000});
}
if(str == 4){
layer.msg('投诉人的护士账号不存在!',{icon: 5,time:2000});
}
if(str == 5){
layer.msg('该订单不存在!',{icon: 5,time:2000});
}
}
test();

</script>
</body>
</html>