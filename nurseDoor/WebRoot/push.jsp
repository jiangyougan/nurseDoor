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
      <label class="form-label col-3"><span class="c-red">*</span>推送内容：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" value="" placeholder="" id="pushContent" name="pushContent" datatype="*2-16" nullmsg="用户或护士账号" maxlength='11'>
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3">推送分类：</label>
      <div class="formControls col-5"> <span class="select-box">
        <select class="select" size="1" id="brandclass" name="demo1" datatype="*" nullmsg="请选择推送分类！">
          <option value="2">推送给用户和护士</option>
          <option value="0" selected>推送给用户</option>
          <option value="1">推送给护士</option>
        </select>
     </span> </div>
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

//表单提交
function check()
{
	layer.confirm('确认要提交吗？',function(index){
	//推送内容
	var pushContent = $("#pushContent").val();
	var sel = $("#brandclass").val();
		if(pushContent==null || pushContent==""){
			layer.msg('推送内容不能为空!',{icon: 5,time:3000});
		}else{
			$.ajax({
						url: "${pageContext.request.contextPath}/globalPush.action",              //请求地址
				        type: "POST",                       //请求方式
				        data: { "pushContent": pushContent,"sel":sel},        //请求参数
				        dataType: "json",
				        success: function (str) {
					        if(str == 1){
								layer.msg('推送成功!',{icon: 6,time:2000});
								}
							if(str == 2){
								layer.msg('推送失败!',{icon: 5,time:2000});
							}
				        },
				  });
			
			
			
		}
	});
}
</script>
</body>
</html>