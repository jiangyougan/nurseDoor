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
<!-- <LINK rel="Bookmark" href="/favicon.ico" >
<LINK rel="Shortcut Icon" href="/favicon.ico" /> -->
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link href="css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="lib/Hui-iconfont/1.0.7/iconfont.css" rel="stylesheet" type="text/css" />

<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>患者列表</title>
<style type="text/css">
</style>
</head>

<body>

<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 患者管理 <span class="c-gray en">&gt;</span> 患者列表 <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
<form action="${pageContext.request.contextPath}/AdminListKeyWordFrom.action" method="POST">
	<div class="text-c"> 
	<!-- 日期范围：
		<input type="text" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}'})" id="datemin" class="input-text Wdate" style="width:120px;">
		-
		<input type="text" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d'})" id="datemax" class="input-text Wdate" style="width:120px;">
		 -->
		<%-- <input type="text" name="keyword" class="input-text" value="${keyword}" style="width:250px" placeholder="输入管理员名称、账号、部门" id="" name="">
		<button type="submit" class="btn btn-success" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜患者</button> --%>
	</div>
</form>	
	<!-- <div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a href="javascript:;" onclick="admin_add('添加管理员','admin-add.jsp','800','500')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加管理员</a></span>  -->
	<span class="r">共有数据：
		<strong>${count}</strong> 
	条</span> </div>
	<input type="hidden" id="handle" value="${handle}"/>
		<table class="table table-border table-bordered table-bg table-hover table-sort">
		<thead>
			<tr>
				<th scope="col" colspan="9">管理列表</th>
			</tr>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="150">患者名字</th>
				<th width="150">性别</th>
				<th width="90">身份证号码</th>
				<th width="150">年龄</th>
				<th width="150">手机号</th>
				<th width="130">关系</th>
				<th width="130">详细地址</th>
				<th width="100">病史</th>
				<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list}" var="s" varStatus="z">
			<tr class="text-c">
				<td><input type="checkbox" value="1" name=""></td>
				
				<%-- <td>${z.index+1 }</td> --%>
				
				<td>${s.protectedPersonName }</td>
				
				<c:if test="${s.protectedPersonSex == '1' }">
				<td>男</td>
				</c:if>
				<c:if test="${s.protectedPersonSex == '2' }">
				<td>女</td>
				</c:if>
				
				<td>${s.protectedPersonCard }</td>
				
				<td>${s.protectedPersonAge }</td>
				
				<td>${s.protectedPersonPhone }</td>
				
				<td>
					${s.protectedPersonNexus }
				</td>
				<td>
					${s.protectedAddress }
				</td>
				<td>
					${s.protectedPersonNote }
				</td>
				
				<td class="td-manage">
					
					<!-- <a title="编辑" href="javascript:;" onclick="admin_edit('管理员编辑','admin-edt.jsp','1','800','500')" class="ml-5" style="text-decoration:none">
						<i class="Hui-iconfont">&#xe6df;</i>
					</a> 
					<a title="查看" href="javascript:;" onclick="admin_seach('管理员详细','admin-role-add.jsp','1')" class="ml-5" style="text-decoration:none">
						<img class="Hui-iconfont" alt="" style="width: 13px;height: 13px" src="images/search-icon.png">
					</a>  -->
					<a title="删除" href="javascript:;" <%-- onclick="admin_del(this,'${s.protectedPersonId}')" --%> class="ml-5" style="text-decoration:none">
					<i class="Hui-iconfont">&#xe6e2;</i>
					</a>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div id="dialogSuccess"  class="content" style="position: relative;display: none">
		<label style="margin-top: 500px;margin-left: 50%">操作成功
	</label>
	</div>
	<div id="dialogError"  class="content" style="position: relative;display: none">
		<label style="margin-top: 500px;margin-left: 50%">操作失败
		</label>
	</div>
</div>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>  
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script> 
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script> 
<script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script> 
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
//判断是否操作成功
/* function setTimout(){
	var handle = $("#handle").val();
	if(handle == 200){
		setTimeout(function(){
			$("#dialogSuccess").show();
		},5000);
	}else{
		setTimeout(function(){
			$("#dialogError").show();
		},5000);
	}
}
setTimout(); */
</script>
</body>
</html>