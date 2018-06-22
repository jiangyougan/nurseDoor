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
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link>
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>添加产品</title>
</head>
<body>

<div class="pd-20" >
<ul class="nav nav-pills" role="tablist">
<li role="presentation" ><a href="${pageContext.request.contextPath}/selectcostTraffic.action">交通费</a></li>
  <li role="presentation" ><a href="${pageContext.request.contextPath}/seletecostSace.action">保险费</a></li>
  <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/selectinterest.action">利率</a></li>
</ul>
<form  method="post" class="form form-horizontal" id="form-article-add"onsubmit="return validate(document.getElementById('contentName'));">
			<div class="row cl">
				<label class="form-label col-2"><span class="c-red">*</span>利率大小：</label>
				<div class="formControls col-4">
					<input type="text" style="width: 50%" class="input-text" value="${costInterest }" placeholder="" id="costInterest" name="costInterest"/>%
				</div>
			</div>
			<div class="row cl">
				<div class="col-10 col-offset-2">
					<button onClick="article_save_submit();" class="btn btn-primary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 保存并提交</button>
					<!-- <button onClick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button> -->
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
$("input[name*='cost']").keyup(function () { 
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
    function article_save_submit(){
     var costInterest = $("#costInterest").val();
     if(costInterest == null){
     alert("为空默认为0元");
     return;
     }
     		$.ajax({
						url: "${pageContext.request.contextPath}/updateinterest.action",              //请求地址
				        type: "POST",                       //请求方式
				        data: { costInterest: costInterest},        //请求参数
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
     
     }
  </script>
<!-- <script type="text/javascript">
function article_save_submit(){
$.ajaxSetup({ cache: false }) ; 
//获取产品名称
var contentid = $("#contentid").val();
alert(contentid);
var goodsname = $("#goodsname").val();
var cost = $("#JinE").val();
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
				url : "InsertGoodInfo.action",
				data:{"goodsname" : goodsname,"cost" : cost,
				"goodsIsdefault" : goodsIsdefault,
				"contentid" : contentid}, 
				dataType : "json",
				success:function(data){
				alert("修改成功");
			}
			}
			);
	}

}
</script> -->
</body>
<script type="text/javascript">
function check(){
var error = $("#errorcode").val();
var goodsContent = $("#goodsContent").val();
if(error == "1"){
$("body").hide;
confirm("success");
location.href="GoodsListInfo.action?goodsContent="+goodsContent;
}
}
check();
</script>
</html>