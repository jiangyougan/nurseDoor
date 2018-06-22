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
<title>护士沟通</title>
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script></head>
<body>
<div class="pd-20">
  <form action="${pageContext.request.contextPath}/saveUserCommunicate.action" method="post" class="form form-horizontal" name="form1" id="form1" enctype="multipart/form-data" >
  <input type="hidden" value="${nurseId }" id="nurseId" name="nurseId"/>
  <input type="hidden" value="${type }" id="type" name="type"/>
  <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>反馈内容：</label>
      <div class="formControls col-5">
        <textarea id="content" name="content" cols="" rows="" class="textarea"  placeholder="反馈内容" datatype="*10-100" dragonfly="true" >${complaint.complaintContent }</textarea>
      </div>
      <div class="col-4"></div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>谈话内容：</label>
      <div class="formControls col-5">
       <textarea id="userSpeak" name="userSpeak" cols="" rows="" class="textarea"  placeholder="谈话内容" datatype="*10-100" dragonfly="true" >${complaint.complaintContentSpeak }</textarea>
      </div>
      <div class="col-4"></div>
    </div>
     <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>客服备注：</label>
      <div class="formControls col-5">
       <textarea id="note" name="note" cols="" rows="" class="textarea"  placeholder="谈话内容" datatype="*10-100" dragonfly="true" >${complaint.complaintContentRecord }</textarea>
      </div>
      <div class="col-4"></div>
    </div>
    <div class="row cl">
      <div class="col-9 col-offset-3">
        <input class="btn btn-primary radius" onclick="check()" type="button" value="&nbsp;&nbsp;提交&nbsp;&nbsp;"/>
        <input class="btn btn-primary radius" onclick="onreturn()" type="button" value="&nbsp;&nbsp;返回&nbsp;&nbsp;"/>
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
$("input[id*='money']").keyup(function () { 
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
$("input[id*='time']").keyup(function () { 
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
	var userSpeak = $("#userSpeak").val();
	var content = $("#content").val();
		if(userSpeak==null || userSpeak==""){
			layer.msg('谈话内容不能为空!',{icon: 5,time:2000});
		}else if(content==null || content==""){
			layer.msg('反馈内容不能为空!',{icon: 5,time:2000});
		}else{
			$("#form1").submit();
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
layer.msg('请勿重复添加注册类型的优惠券!',{icon: 6,time:2000});
}
if(str == 4){
layer.msg('请勿重复添加推荐类型的优惠券!',{icon: 6,time:2000});
}
}
test();


function test1(){
 var value_s=$('#selectVal').val();
 var osel1=document.getElementById("brandclass"); 
    var opts1=osel1.getElementsByTagName("option");
		var i;	for(i=0;i<osel1.length;i++){
			if(opts1[i].value==value_s){
				opts1[i].selected=true;	
	}
		}	 		  
}
test1();

function onreturn(){
var returnValue = $("#type").val();
if(returnValue == 0){
location.href = "${pageContext.request.contextPath}/selectAllNurseInfodistrict.action";
}else{
location.href = "${pageContext.request.contextPath}/selectAllNurseInfo.action";
}

}
</script>
</body>
</html>