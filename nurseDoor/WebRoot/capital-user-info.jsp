﻿<!DOCTYPE html>
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
    response.setHeader("Pragma","No-cache");
    response.setHeader("Cache-Control","no-cache");
    response.setDateHeader("Expires", -10);
            
	%>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />

<link href="css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="lib/Hui-iconfont/1.0.7/iconfont.css" rel="stylesheet" type="text/css" />

<title>订单列表</title>
	<style>
		.pages a,.pages span {
			display: inline-block;
			padding: 2px 5px;
			margin: 0 1px;
			border: 1px solid #f0f0f0;
			-webkit-border-radius: 3px;
			-moz-border-radius: 3px;
			border-radius: 3px;
		}

		.pages a,.pages li {
			display: inline-block;
			list-style: none;
			text-decoration: none;
			color: #58A0D3;
		}

		.pages a.first,.pages a.prev,.pages a.next,.pages a.end {
			margin: 0;
		}

		.pages a:hover {
			border-color: #50A8E6;
		}

		.pages span.current {
			background: #50A8E6;
			color: #FFF;
			font-weight: 700;
			border-color: #50A8E6;
		}


	</style>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link></head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 护理服务 <span class="c-gray en">&gt;</span> 护理服务项 <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
<form action="${pageContext.request.contextPath}/OrderKeyWordList.action" method="post">
	<%-- <div class="text-c"> 
		<input type="text" name="number" id="" value="${number}" placeholder="请输入订单的单号,发布人的账号" style="width:250px" class="input-text">
		<button name="" id="" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i>搜订单</button>
	</div> --%>
</form>	
<ul class="nav nav-pills" role="tablist">
  <li role="presentation" ><a href="${pageContext.request.contextPath}/capitalplatinfo.action">平台资金明细</a></li>
  <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/capitaluserinfo.action">用户资金明细</a></li>
  <li role="presentation" ><a href="${pageContext.request.contextPath}/capitalnurseinfo.action">护士资金明细</a></li>
</ul>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> 
		<!-- <a class="btn btn-primary radius" onclick="go_back('添加图片','SelectProjectAll.action')" href="javascript:;">
		<i class="Hui-iconfont">&#xe600;</i></a>
		<a class="btn btn-primary radius" onclick="picture_add('添加图片','note-add.jsp')" href="javascript:;">
		<i class="Hui-iconfont">&#xe600;</i> 
		添加备注
		</a>
		</span>  -->
	<span class="r">共有数据：
	<strong>${count}</strong> 
	条</span> </div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-bg table-hover table-sort">
			<thead>
				<tr class="text-c">
					<th width="40"><input name="" type="checkbox" value=""></th>
					<th width="30">收益/支出</th>
					<th width="50">资金大小</th>
					<th width="50">资金说明</th>
					<th width="80">操作时间</th>
					<th width="20">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="s">
					<tr class="text-c">
						<td><input name="" type="checkbox" value=""></td>
						
						<c:if test="${s.capitalUserPoolPeopleIdentity == 0}">
							<td class="td-status"><span class="label label-error radius">支出</span></td>
						</c:if>
						<c:if test="${s.capitalUserPoolPeopleIdentity == 1}">
							<td class="td-status"><span class="label label-success radius">收益</span></td>
						</c:if>
						
						<c:if test="${s.capitalUserPoolPeopleIdentity == 0}">
						<td class="text-c">-${s.capitalUserPoolMoney}￥</td>
						</c:if>
						<c:if test="${s.capitalUserPoolPeopleIdentity == 1}">
						<td class="text-c">+${s.capitalUserPoolMoney}￥</td>
						</c:if>
						
						
						<td class="text-c">${s.capitalUserPoolSpeak }</td>
						
						<td >
							<fmt:formatDate value="${s.capitalUserPoolCreatetime}" type="both"/>
						</td>
						
						<td class="td-manage">
						<!-- <a style="text-decoration:none" onClick="picture_stop(this,'10001')" href="javascript:;" title="下架">
							<i class="Hui-iconfont">&#xe6de;</i>
						</a>  -->
						<a style="text-decoration:none" class="ml-5" onClick="picture_edit('订单详情','OrderInfoByOrderId.action?orderSendId=${s.capitalUserPoolOrdersendid}','100001')" href="javascript:;" title="编辑">
							<img alt="" src="images/search-icon.png" style="width: 15px;height: 15px">
						</a>
						
						<a style="text-decoration:none" class="ml-5" onclick="member_show('个人信息','user-info-descripe.jsp?userId=${s.capitalUserPoolPeopleid}','10001','360','400')" href="javascript:;" title="编辑">
							<i class="Hui-iconfont">&#xe6df;</i>
						</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script> 
<script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script> 

<script type="text/javascript">
/*
	参数解释：
	title	标题
	url		请求的url
	id		需要操作的数据id
	w		弹出层宽度（缺省调默认值）
	h		弹出层高度（缺省调默认值）
*/
/*管理员-增加*/
function admin_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*管理员-删除*/
function admin_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
		location.href = "${pageContext.request.contextPath}/AdminDelete.action?id="+id;
		$(obj).parents("tr").remove();
		layer.msg('已删除!',{icon:1,time:1000});
	});
}
/*管理员-编辑*/
function admin_edit(title,url,id){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*管理员-查看详细*/
function admin_seach(title,url,id,w,h){
	layer_show(title,url,1500,1000);
}
/*用户-查看*/
function member_show(title,url,id,w,h){
	layer_show(title,url,w,h);
}

/*管理员-停用*/
function admin_stop(obj,id){
var state="0";
	layer.confirm('确认要停用吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
		location.href = "${pageContext.request.contextPath}/AdminState.action?id="+id+"&state="+state;
		
		/* $(obj).parents("tr").find(".td-manage").prepend('<a onClick="admin_start(this,id)" href="javascript:;" title="启用" style="text-decoration:none"><i class="Hui-iconfont">&#xe615;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">已禁用</span>');
		$(obj).remove(); */
		layer.msg('已停用!',{icon: 5,time:1000});
	});
}

/*管理员-启用*/
function admin_start(obj,id){
var state="1";
	layer.confirm('确认要启用吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
		location.href = "${pageContext.request.contextPath}/AdminState.action?id="+id+"&state="+state;
		/* 
	    $(obj).parents("tr").find(".td-manage").prepend('<a onClick="admin_stop(this,id)" href="javascript:;" title="停用" style="text-decoration:none"><i class="Hui-iconfont">&#xe631;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
		$(obj).remove(); */
		layer.msg('已启用!', {icon: 6,time:1000});
	});
}
</script>

<script type="text/javascript">
/*
     参数解释：
     title	标题
     url		请求的url
     id		需要操作的数据id
     w		弹出层宽度（缺省调默认值）
     h		弹出层高度（缺省调默认值）
     */
    /*管理员-增加*/
    function project_add(title, url, w, h) {
        layer_show(title, url, w, h);
    }
    /*管理员-删除*/
    function project_del(obj, id) {
    	
        layer.confirm('确认要删除吗？', function (index) {
            //此处请求后台程序，下方是成功后的前台处理……
            location.href = "${pageContext.request.contextPath}/delNoteById.action?noteId=" + id;
            $(obj).parents("tr").remove();
            layer.msg('已删除!', {icon: 1, time: 1000});
        });
    }
    
     /*服务添加 */
    function content_add(id) {
          location.href = "${pageContext.request.contextPath}/selectcontentall.action?id=" + id;
    }
    
</script>
<script type="text/javascript">
$('.table-sort').dataTable({
	"aaSorting": [[ 1, "desc" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	"aoColumnDefs": [
	  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
	  {"orderable":false,"aTargets":[0,0]}// 制定列不参与排序
	]
});

/**/
function go_back(title,url){
var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}

/*图片-添加*/
function picture_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*图片-查看*/
function picture_show(title,url,id){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*图片-审核*/
function picture_shenhe(obj,id){
	layer.confirm('审核文章？', {
		btn: ['通过','不通过'], 
		shade: false
	},
	function(){
		$(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="picture_start(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
		$(obj).remove();
		layer.msg('已发布', {icon:6,time:1000});
	},
	function(){
		$(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="picture_shenqing(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-danger radius">未通过</span>');
		$(obj).remove();
    	layer.msg('未通过', {icon:5,time:1000});
	});	
}
/*图片-下架*/
function picture_stop(obj,id){
	layer.confirm('确认要下架吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="picture_start(this,id)" href="javascript:;" title="发布"><i class="Hui-iconfont">&#xe603;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已下架</span>');
		$(obj).remove();
		layer.msg('已下架!',{icon: 5,time:1000});
	});
}

/*图片-发布*/
function picture_start(obj,id){
	layer.confirm('确认要发布吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="picture_stop(this,id)" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
		$(obj).remove();
		layer.msg('已发布!',{icon: 6,time:1000});
	});
}
/*图片-申请上线*/
function picture_shenqing(obj,id){
	$(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">待审核</span>');
	$(obj).parents("tr").find(".td-manage").html("");
	layer.msg('已提交申请，耐心等待审核!', {icon: 1,time:2000});
}
/*图片-编辑*/
function picture_edit(title,url,id){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*图片-删除*/
function picture_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$(obj).parents("tr").remove();
		layer.msg('已删除!',{icon:1,time:1000});
	});
}
</script>
</body>
</html>