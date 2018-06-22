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
<style type="text/css">
*{font-family:Microsoft YaHei,"微软雅黑",宋体,Courier New !important;color:black !important;}
</style>
</head>
<body >
<div class="pd-20">
	<form action="addhospital.action" method="post" class="form form-horizontal" id="form-article-add">
	<!-- 订单信息 -->
	<div class="row cl">
				<label style="font-size: 20px" class="form-label col-5">添加医院</label>
			</div>
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>医院名称：</label>
			<div class="formControls col-6">
				<input type="text" class="input-text" value="" placeholder="" id="orderSendNumbers" name="hospitalName" >
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-2">所在省份：</label>
			<div class="formControls col-6">
				<input type="text" class="input-text" value="${andOrderSend.orderSendUserid}" placeholder="" id="orderSendUserid" name="hospitalProvince" >
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>所在城市：</label>
			<div class="formControls col-2">
				<input type="text" class="input-text" value="${andOrderSend.orderSendServicecontent}" placeholder="" id="orderSendServicecontent" name="hospitalCity"  >
			</div>
			<label class="form-label col-2">所在区县：</label>
			<div class="formControls col-2">
				<input type="text" class="input-text" value="${andOrderSend.orderSendUsername}" placeholder="" id="orderSendUsername" name="hospitalDistrict" >
			</div>
		</div>
		
		<div class="row cl">
			
			<label class="form-label col-2">医院详细地址：</label>
			<div class="formControls col-2">
				<input type="text" class="input-text" value="${andOrderSend.orderSendCard}" placeholder="" id="orderSendCard" name="hospitalAddress" >
			</div>
			<label class="form-label col-2">医院电话：</label>
			<div class="formControls col-2">
				<input type="text" class="input-text" value="${andOrderSend.orderSendAge}" placeholder="" id="orderSendAge" name="hospitalPhone" >
			</div>
		</div>
		<div hidden="30px"></div>
		<div class="row cl">
			<label class="form-label col-2">选择专业：</label>
			<div hidden="30px"></div>
			<table class="table table-border table-bordered table-bg table-hover table-sort" style="margin-left: 200px;width: 2000px">
			<thead>
				<tr class="text-c">
					<th width="25"><input type="checkbox" name="alls" id="allSelect" class="allSelect" value=""></th>
            		<th style="text-align: center;">专业名称</th>
            		<th style="text-align: center;">专业备注</th>
            		<th style="text-align: center;">创建时间</th>
            		<th style="text-align: center;">修改时间</th>
            	
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${simpleMajorList}" var="s">
				<tr style="text-align: center;">
				
			 		<td style="text-align: center;"><input type="checkbox" value="${s.simpleMajorId }" name="ifAll" id="ifAll" onClick="checkAll(this)"></td>
                	<td style="text-align: center;">${s.simpleMajorName }</td>
					<td style="text-align: center;">${s.simpleMajorNote }</td>
					
					
                	<td style="text-align: center;">
                    	<fmt:formatDate value="${s.simpleMajorCreatetime }" type="both"/>
               		 </td>
               		 <td style="text-align: center;">
                    	<fmt:formatDate value="${s.simpleMajorUpdatetime }" type="both"/>
               		 </td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
		
		
		<div class="row cl">
			<div class="col-10 col-offset-2">
				<button onClick="article_save_submit();" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保存并提交审核</button>
				<button onClick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
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

<script language="JavaScript" type="text/JavaScript">   
function checkAll($obj) {
var elms = document.getElementsByName("selectFlag");
for (var i = 0; i < elms.length; i++) {
elms[i].checked = $obj.checked;
}
} 
</script>  
</body>
</html>