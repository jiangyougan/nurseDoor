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
  <form action="${pageContext.request.contextPath}/updateredpackets.action" method="post" class="form form-horizontal" name="form1" id="form1" enctype="multipart/form-data">
    <div class="row cl">
    <input type="hidden" value="${RedPackets.redPackets }" name="redPacketsId"/>
      <label class="form-label col-3"><span class="c-red">*</span>面额：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" value="${RedPackets.redPacketsMoney }" placeholder="" id="money" name="redPacketsmoney" datatype="*2-16" nullmsg="面额不能为空" maxlength='3'>
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>说明：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" placeholder="双12到了,送您一张优惠券" name="redPacketsspeak" id="speak" value="${RedPackets.redPacketsSpeak }">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3">图片：</label>
      <div class="formControls col-5"> <span class="btn-upload form-group">
      原图片:<img alt="" src="<%=webPath%>${RedPackets.redPacketsPic }" style="width: 30px;height: 30px">
        <input class="input-text upload-url" type="text" name="uploadfile-2" id="uploadfile-2" readonly   style="width:200px">
        <a href="javascript:void();" class="btn btn-primary radius upload-btn"><i class="Hui-iconfont">&#xe642;</i> 浏览文件</a>(为空不修改)
        <input type="file" multiple name="filepic" class="input-file" placeholder="为空不修改">
        </span> </div>
      <div class="col-4"> </div>
    </div>
   <!--  <div class="row cl">
      <label class="form-label col-3">所在城市：</label>
      <div class="formControls col-5"> <span class="select-box">
        <select class="select" size="1" name="demo1" datatype="*" nullmsg="请选择所在城市！">
          <option value="" selected>请选择城市</option>
          <option value="1">北京</option>
          <option value="2">上海</option>
          <option value="3">广州</option>
        </select>
        </span> </div>
      <div class="col-4"> </div>
    </div> -->
   <%--  <div class="row cl">
      <label class="form-label col-3">备注：</label>
      <div class="formControls col-5">
        <textarea name="redPacketsnote" cols="" rows="" class="textarea"  placeholder="${RedPackets.redPacketsNote }" datatype="*10-100" dragonfly="true" ></textarea> <!-- onKeyUp="textarealength(this,100)" -->
        <p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
      </div>
      <div class="col-4"> </div>
    </div> --%>
    <div class="row cl">
      <div class="col-9 col-offset-3">
        <input class="btn btn-primary radius" onclick="check()" type="button" value="&nbsp;&nbsp;提交&nbsp;&nbsp;"/>
        <button onClick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
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



function check()
{
layer.confirm('确认要修改吗？',function(index){
$("#form1").submit();
});
}
/* function test(){
var str = $("#test").val();
if(str == 1){
layer.msg('修改成功!',{icon: 6,time:3000});
location.href = "${pageContext.request.contextPath}/couponAllInfo.action";
}
if(str == 2){
layer.msg('修改失败!',{icon: 5,time:3000});
location.href = "${pageContext.request.contextPath}/couponAllInfo.action";
}
}
test(); */
function layer_close(){
location.href = "${pageContext.request.contextPath}/redPacketsInfo.action";
}
</script>
</body>
</html>