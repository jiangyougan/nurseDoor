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

<link href="css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="lib/Hui-iconfont/1.0.7/iconfont.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link>

<title>护理报告列表</title>
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
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 护理报告 <span class="c-gray en">&gt;</span> 护理报告列表 <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
<form action="${pageContext.request.contextPath}/selectAllNursingReport.action" method="GET">
	<div class="text-c"> 
	日期范围：
		<input type="text" value="${datemin }" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}'})" id="datemin" name="logmin" class="input-text Wdate" style="width:120px;">
		-
		<input type="text" value="${datemax }" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d'})" id="datemax" name="logmax" class="input-text Wdate" style="width:120px;">
		 
		<input type="text" name="keyword" class="input-text" value="${keyword}" style="width:250px" placeholder="输入用户账号、护士账号、订单单号、" >
		<button type="submit" class="btn btn-success" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜护理报告</button>
	</div>
</form>	
	<div class="mt-20"> 
	<!-- <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a href="javascript:;" onclick="admin_add('添加管理员','admin-add.jsp')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加管理员</a></span> --> <span class="r">共有数据：
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
				<th scope="col" colspan="9">护理报告列表</th>
			</tr>
			<tr class="text-c">
				<!-- <th width="25"><input type="checkbox" name="" value=""></th> -->
				<th width="30">用户头像</th>
				<th width="60">用户昵称</th>
				<th width="60">护士昵称</th>
				<th width="130">订单单号</th>
				<th width="130">创建时间</th>
				<th width="20">操作</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list}" var="s" varStatus="z">
			<tr class="text-c">
				<!-- <td><input type="checkbox" value="1" name=""></td> -->
				
				
				<td>
				<img alt="" src="<%=webPath %>${s.userHeader }">
				</td>
				
				<td><u style="cursor:pointer" class="text-primary" onclick="member_show('个人信息','user-info-descripe.jsp?userId=${s.userId}','360','400')">${s.userNick }</u></td>
				
				<td><u style="cursor:pointer" class="text-primary" onclick="member_show('个人信息','nurse-info-show.jsp?nurseId=${s.nurseId}','360','400')">${s.nurseNick }</u></td>
			
				<td><a href="OrderInfoByOrderId.action?orderSendId=${s.orderSendId}">${s.orderSendNumbers }</a></td>
			
				<td>
					<fmt:formatDate value="${s.nursingReportCreatetime }" type="both"/>
				</td>
				
				<td class="td-manage">
					
					<a title="查看详情" href="javascript:;" onclick="selectAdmin('${s.orderSendId}','${s.orderSendUsername}');" class="ml-5" style="text-decoration:none">
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
	
	<div style="text-align: center;" class="bs-example" data-example-id="simple-pagination">
    <nav>
      <ul class="pagination">
       
        <c:if test="${pageNow > 1}">
         <li style="float:left">
          <a href="${pageContext.request.contextPath}/selectAllNursingReport.action?pageNow=${pageNow-1}&state=${state}" aria-label="Previous">
            <span aria-hidden="true">«</span>
          </a>
         </li>
        </c:if>
       <c:forEach begin="${start}" end="${end}" var="p">
	       <c:if test="${p == pageNow && p != 0 }">
	         <li><a style="color: red;">${p}</a></li>
		   </c:if>
		   <c:if test="${p != pageNow && p != 0 }">
	         <li><a href="${pageContext.request.contextPath}/selectAllNursingReport.action?pageNow=${p}&state=${state}">${p}</a></li>
	       </c:if>
       </c:forEach> 
       <c:if test="${totalPage > pageNow}">
        <li>
          <a href="${pageContext.request.contextPath}/selectAllNursingReport.action?pageNow=${pageNow+1}&state=${state}" aria-label="Next">
            <span aria-hidden="true">»</span>
          </a>
        </li>
       </c:if> 
      </ul>
    </nav>
  </div>	
	
</div>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script> 
<script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script> 

<script type="text/javascript">
/*用户-查看*/
function member_show(title,url,w,h){
	layer_show(title,url,w,h);
}

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
/* $('.table-sort').dataTable({
	"aaSorting": [[ 1, "desc" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	"aoColumnDefs": [
	  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
	  {"orderable":false,"aTargets":[0,0]}// 制定列不参与排序
	]
}); */

//根据ID查询管理
function selectAdmin(orderSendId,orderSendUsername){
location.href = "${pageContext.request.contextPath}/selectReportdetails.action?orderSendId="+orderSendId+"&protectedPersonId="+orderSendUsername+"&repotrState=1";
}
</script>
</body>
</html>