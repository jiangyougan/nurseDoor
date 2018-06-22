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
<title>添加优惠券</title>
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script></head>
<body>
<div class="pd-20">
  <form action="${pageContext.request.contextPath}/addcouponInfoadd.action" method="post" class="form form-horizontal" name="form1" id="form1" enctype="multipart/form-data" >
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>面额：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" value="" placeholder="" id="money" name="money" datatype="*2-16" nullmsg="面额不能为空" maxlength='3'>
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>满多少用：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" value="" placeholder="为空则不限制条件" id="money" name="fullgive"   maxlength='3'>
      </div>
      <div class="col-4"> </div>
    </div>
   
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>过期时间：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" placeholder="为空则不限制条件" name="expirationtime" id="time"  maxlength='3'>
      </div>
    </div>
    
   <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>说明：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" placeholder="双12到了,送您一张优惠券" name="speak" id="speak" maxlength="12" >
      </div>
      <div class="col-4"> </div>
    </div> 
    
    <div class="row cl">
      <label class="form-label col-3">图片：</label>
      <div class="formControls col-5"> <span class="btn-upload form-group">
        <input class="input-text upload-url" type="text" name="uploadfile-2" id="uploadfile-2" readonly   style="width:200px">
        <a href="javascript:void();" class="btn btn-primary radius upload-btn"><i class="Hui-iconfont">&#xe642;</i> 浏览文件</a>
        <input type="file" multiple name="filepic" class="input-file">
        </span> </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3">优惠券类别：</label>
      <div class="formControls col-5"> <span class="select-box">
        <select class="select" size="1" name="demo1" datatype="*" nullmsg="请选择优惠券类别！">
          <option value="" selected>请选择类别(不选则默认普通优惠券)</option>
          <option value="0">普通优惠券</option>
          <option value="1">注册优惠券</option>
          <option value="2">推荐优惠券</option>
          <option value="3">活动优惠券</option>
        </select>
     </span> </div>
      <div class="col-4"> </div>
    </div> 
    <div class="row cl">
      <label class="form-label col-3">备注：</label>
      <div class="formControls col-5">
        <textarea name="note" cols="" rows="" class="textarea"  placeholder="备注" datatype="*10-100" dragonfly="true" ></textarea> <!-- onKeyUp="textarealength(this,100)" -->
        <p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <div class="col-9 col-offset-3">
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
	var money = $("#money").val();
	var speak = $("#speak").val();
		if(money==null || money==""){
			layer.msg('面额不能为空!',{icon: 5,time:2000});
		}else if(speak==null || speak==""){
			layer.msg('说明不能为空!',{icon: 5,time:2000});
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

</script>
</body>
</html>