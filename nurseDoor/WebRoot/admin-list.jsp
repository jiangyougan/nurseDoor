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

<title>管理员列表</title>
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
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 管理员管理 <span class="c-gray en">&gt;</span> 管理员列表 <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
<form action="${pageContext.request.contextPath}/AdminListKeyWordFrom.action" method="post">
	<div class="text-c"> 
	<!-- 日期范围：
		<input type="text" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}'})" id="datemin" class="input-text Wdate" style="width:120px;">
		-
		<input type="text" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d'})" id="datemax" class="input-text Wdate" style="width:120px;">
		 -->
		<input type="text" name="keyword" class="input-text" value="${keyword}" style="width:250px" placeholder="输入管理员姓名、账号" id="" name="">
		<button type="submit" class="btn btn-success" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜管理</button>
	</div>
</form>	
	<div class="mt-20"> <span class="l"> <a href="javascript:;" onclick="admin_add('添加管理员','admin-add.jsp')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加管理员</a></span> <span class="r">共有数据：
	<c:if test="${empty count}">
	<strong>0</strong> 
	</c:if>
	<c:if test="${!empty count}">
	<strong>${count}</strong> 
	</c:if>
	条</span> </div>
	<input type="hidden" id="handle" value="${handle}"/><br>
	<div class="mt-20">
		<table class="table table-border table-bordered table-bg table-hover table-sort">
			<thead>
			<tr>
				<th scope="col" colspan="9">管理列表</th>
			</tr>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="150">登录名</th>
				<th width="150">昵称</th>
				<th width="130">性别</th>
				<th width="130">职位</th>
				<th width="130">创建时间</th>
				<th width="100">是否已启用</th>
				<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list}" var="s" varStatus="z">
			<tr class="text-c">
				<td><input type="checkbox" value="1" name=""></td>
				
				<%-- <td>${z.index+1 }</td> --%>
				
				<td>${s.administrationName }</td>
				
				<td>${s.administrationNick }</td>
				
				
				<c:choose>
				<c:when test="${s.administrationSex == 1}">
					<td>男</td>
				</c:when>
				<c:when test="${s.administrationSex == 2}">
					<td>女</td>
				</c:when>
				<c:otherwise>
					<td>未知</td>
				</c:otherwise>
				</c:choose>
				
				<c:choose>
				<c:when test="${s.administrationGrade == 0}">
					<td><span class="label label-warning radius">超管</span></td>
				</c:when>
				<c:when test="${s.administrationGrade == 1}">
					<td><span class="label label-success radius">客服</span></td>
				</c:when>
				<c:otherwise>
					<td><span class="label label-error radius">编辑</span></td>
				</c:otherwise>
				</c:choose>
				
				<td>
					<fmt:formatDate value="${s.administrationCreatetime }" type="both"/>
				</td>
				
				<c:if test="${s.administrationState == 0 }">
					<td class="td-status"><span class="label label-error radius">已停用</span></td>
				</c:if>
				<c:if test="${s.administrationState == 1 }">
					<td class="td-status"><span class="label label-success radius">已启用</span></td>
				</c:if>
				
				<td class="td-manage">
				   
				    <c:if test="${s.administrationState == 0 }">
						<a style="text-decoration:none" onClick="admin_start(this,'${s.administrationId}')" href="javascript:;" title="启用">
							<i class="Hui-iconfont">&#xe615;</i>
						</a> 
					</c:if>
					<c:if test="${s.administrationState == 1 }">
						<a style="text-decoration:none" onClick="admin_stop(this,'${s.administrationId}')" href="javascript:;" title="停用">
							<i class="Hui-iconfont">&#xe631;</i>
					</a> 
					</c:if>
					
					
					<a title="编辑" href="javascript:;" onclick="selectAdmin('${s.administrationId}');" class="ml-5" style="text-decoration:none">
						<i class="Hui-iconfont">&#xe6df;</i>
					</a> 
					<!-- <a title="查看" href="javascript:;" onclick="admin_seach('管理员详细','admin-role-add.jsp','1')" class="ml-5" style="text-decoration:none">
						<img class="Hui-iconfont" alt="" style="width: 13px;height: 13px" src="images/search-icon.png">
					</a>  -->
					<%-- <a title="删除" href="javascript:;" onclick="admin_del(this,'${s.administrationId}')" class="ml-5" style="text-decoration:none">
					<i class="Hui-iconfont">&#xe6e2;</i>
					</a> --%>
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

/*管理员-增加*/
function admin_add(title,url){
	/* layer_show(title,url); */
	location.href = "admin-add.jsp";
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
	layer_show(title,url);
}
/*管理员-查看详细*/
function admin_seach(title,url,id,w,h){
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
$('.table-sort').dataTable({
	"aaSorting": [[ 1, "desc" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	"aoColumnDefs": [
	  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
	  {"orderable":false,"aTargets":[0,0]}// 制定列不参与排序
	]
});

//根据ID查询管理
function selectAdmin(id){
location.href = "${pageContext.request.contextPath}/selectAdminuserInfo.action?administrationId="+id;
}
</script>
</body>
</html>