<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
<title>详细信息</title>
</head>
<body>
<div class="cl pd-5 bg-1 bk-gray mt-20"> 
		<span class="l">
		<a class="btn btn-primary radius" onclick="picture_add('产品列表','GoodsListInfo.action?goodsContent=${goodsContent}')" href="javascript:;">
		<i class="Hui-iconfont">&#xe600;</i> 
		
		</a>
		</span> 
	</div>
<div class="pd-20">
	<form action="" method="post" class="form form-horizontal" id="form-article-add">
		<div class="row cl">
		<input type="hidden" value="${goodsIsdefault }" id="state"/>
		<input type="hidden" value="${goodsId }" id="goodId"/>
		<input type="hidden" value="${errorcode }" id="errorcode"/>
		<input type="hidden"value="${goodsContent}" id="goodsContent"/>
			<label class="form-label col-2"><span class="c-red">*</span>产品名称：</label>
			<div class="formControls col-10">
				<input type="text" style="width: 50%" class="input-text" value="${goosdName }" placeholder="" id="goodsname" name="goodsname"/>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>产品费用：</label>
			<div class="formControls col-10">
				<input type="text" name="JinE" style="width: 50%" class="input-text" value="${goodsMoney }" placeholder="" id="JinE" />
			</div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-2">是否必选：</label>
			<div class="formControls col-2 skin-minimal">
				<div class="check-box">
					<input type="checkbox" id="checkbox-1" name="required">
				</div>
			</div>
		</div>
			
		<div class="row cl">
			<div class="col-10 col-offset-2">
				<button onClick="article_save_submit();" class="btn btn-primary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 保存并提交</button>
				<button onclick="self.location=document.referrer;" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
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
//利率输入框的限制条件
$("input[name*='JinE']").keyup(function () { 
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
</script> 
<script type="text/javascript">
//
function picture_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}


function article_save_submit(){
$.ajaxSetup({ cache: false }) ; 
//获取产品名称

var goodsname = $("#goodsname").val();
var cost = $("#JinE").val();
var goodId = $("#goodId").val();
var goodsContent = $("#goodsContent").val();
var goodsIsdefault = null;
if(document.getElementById("checkbox-1").checked){//被选中
    goodsIsdefault=0;
}else{//未选中
	goodsIsdefault=1;
}
	if(goodsname==null || goodsname==""){
		alert("请填写产品名称");
		return false;
	}
	if(cost==null || cost==""){
		alert("请填写产品费用");
		return false;
	}else{
		$.ajax({
				type : "POST",
				url : "UpdGoodInfo.action",
				data:{"goodsname" : goodsname,"cost" : cost,
				"goodsIsdefault" : goodsIsdefault,"goodId" : goodId,"goodsContent" : goodsContent}, 
				dataType : "json",
				success: function (date) {
					        layer.msg('修改成功!', {icon: 6, time: 1500});
					        //location.href = "${pageContext.request.contextPath}/OrderList.action?state=0";
				        },
			}
			);
	}
/* 	function errorcode(){
	var errorcode = $("#errorcode").val();
	alert("errorcode="+errorcode);
	if(errorcode==200){
	alert("修改成功")
	}else{
	alert("修改失败")
	}
} */

}
</script>
<script type="text/javascript">
function test(){
var state = $("#state").val();
if(state==0){
document.getElementById("checkbox-1").checked =true;
}
}

test();

</script>
</body>
</html>