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
	<form action="AllContentServiceCheckk.action" method="post" id="form" class="form form-horizontal" id="form-article-add">
	<div class="mt-20">
	<table class="table table-border table-bordered table-hover table-bg table-sort">
		<thead>
			<tr class="text-c">
				<th nowrap="nowrap" width="25"><input type="checkbox" name="" value=""></th>
				<th nowrap="nowrap" width="80">ID</th>
				<th nowrap="nowrap"  width="100">服务名</th>
				<th nowrap="nowrap" width="40">服务内容</th>
				<th nowrap="nowrap" width="150">图片</th>
				<th nowrap="nowrap" width="90">创建时间</th>
				<!-- <th nowrap="nowrap" width="100">操作</th> -->
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list }" var="s" varStatus="z">
		
			<tr class="text-c">
				
				<td><input type="checkbox" id="checkbox-id" value="${s.manageNursingContentId}" name="checkbox"></td>
				<td>${z.index+1 }</td>
				<!-- <td><u style="cursor:pointer" class="text-primary" onclick="member_show('张三','member-show.html','10001','360','400')">张三</u></td> -->
				<td>${s.manageNursingContentName }</td>
				<td style="height: 20px">${s.manageNursingContentContent }</td>
				<td>
					<c:set var="imgsp" value="${s.contentImgurl }" />
					<c:set var="result" value="${fn:split(imgsp, ',')}" />
					<c:forEach items="${result}" var="primg">
					<img style="width: 120px;height: 120px" alt="" src="<%=webPath%>${primg}">
					</c:forEach>
				</td>
				<td class="text-l" style="text-align: center !important;"><fmt:formatDate value="${s.manageNursingContentCreatetime }" type="both"/></td>
				<!-- <td class="td-manage"><a style="text-decoration:none" onClick="member_stop(this,'10001')" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a> <a title="编辑" href="javascript:;" onclick="member_edit('编辑','member-add.html','4','','510')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="change_password('修改密码','change-password.html','10001','600','270')" href="javascript:;" title="修改密码"><i class="Hui-iconfont">&#xe63f;</i></a> <a title="删除" href="javascript:;" onclick="member_del(this,'1')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td> -->
			</tr>
		</c:forEach>	
		</tbody>
	</table>
	</div>
</div>
		
		
		<div class="row cl">
			<div class="col-10 col-offset-2">
				<button onClick="article_save_submit();" class="btn btn-primary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 提交</button>
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

function article_save_submit(){
if($('#checkbox-id').is(':checked')) {
}else{
alert("至少选择一个");
return true;
}
alert("提交");
$("#form").submit();
}
</script>  
</body>
</html>