<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
	+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
	String host = request.getScheme() + "://" + request.getServerName()
            + ":" + request.getServerPort() + "/";
            
    //一级学术圈Id
    String postOneLevelId = request.getParameter("postOneLevelId");
    System.out.println("学术圈="+postOneLevelId);        
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
<link href="lib/webuploader/0.1.5/webuploader.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>添加产品</title>
</head>
<body>
<div class="pd-20">
<input type="hidden" value="<%=postOneLevelId%>" id="postOneLevelId">
	<form action="" method="post" class="form form-horizontal" id="form-article-add"onsubmit="return validate(document.getElementById('contentName'));">
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>二级名称：</label>
			<div class="formControls col-10">
				<input type="text" style="width: 50%" class="input-text" value="" placeholder="" id="postTwoName" name="postTwoName"/>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>备注：</label>
			<div class="formControls col-10">
				<input type="text"  style="width: 50%" class="input-text" value="" placeholder="" id="postTwoNote" name="postTwoNote" />
			</div>
		</div>
		
		<!-- <div class="row cl">
			<label class="form-label col-2">是否必选：</label>
			<div class="formControls col-2 skin-minimal">
				<div class="check-box">
					<input type="checkbox" id="checkbox-1" name="required">
				</div>
			</div>
		</div> -->
			
		<div class="row cl">
			<div class="col-10 col-offset-2">
				<button onClick="article_save_submit();" class="btn btn-primary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 保存并提交</button>
				<button onClick="self.location=document.referrer;" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
			</div>
		</div>
	</form>
</div>
</div>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script> 
<script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="lib/Validform/5.3.2/Validform.min.js"></script> 
<script type="text/javascript" src="lib/webuploader/0.1.5/webuploader.min.js"></script> 
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script>
<script type="text/javascript">
    function article_save_submit(){
layer.confirm("确认要添加吗？",function(index){
var orderSendId = $("#orderSendId").val();
	//二级名称
	var postTwoName = $("#postTwoName").val();
	var postTwoNote = $("#postTwoNote").val();
	//一级学术圈Id
	var postOneLevelId = $("#postOneLevelId").val();
	//当前时间
		if(postTwoName==null || postTwoName==""){
			layer.msg('名称不能为空!',{icon: 5,time:2000});
		}else{
				/* $("#form-article-add").submit(); */
				$.ajax({
					url: "${pageContext.request.contextPath}/postTwoLevelAdd.action",              //请求地址
			        type: "POST",                       //请求方式
			        data: { postTwoName: postTwoName,postTwoNote: postTwoNote,postOneLevelId: postOneLevelId},        //请求参数
			        dataType: "json",
			        success: function (date) {
				        if(date==0){
				        layer.msg('添加成功!', {icon: 6, time: 1500});
				        //location.href = "${pageContext.request.contextPath}/OrderList.action?state=0";
				        }else {
				        layer.msg('添加失败!', {icon: 5, time: 1500});
				        }
			        },
			        fail: function (status) {
       				}
			  });
		}
	});
}
  </script>
</body>

</html>