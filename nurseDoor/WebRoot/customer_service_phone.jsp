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
<link href="lib/Hui-iconfont/1.0.7/iconfont.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>客服电话</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 用户中心 <span class="c-gray en">&gt;</span> 用户管理 <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a href="javascript:;" onclick="member_add('添加客服电话','customer_service_phone_add.jsp')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加客服电话</a></span> <span class="r">共有数据：<strong>88</strong> 条</span> </div>
	<div class="mt-20">
	<table class="table table-border table-bordered table-hover table-bg table-sort">
		<thead>
			<tr class="text-c">
				<th nowrap="nowrap" width="25"><input type="checkbox" name="" value=""></th>
				<th nowrap="nowrap" width="80">ID</th>
				<th nowrap="nowrap"  width="100">电话号码</th>
				<th nowrap="nowrap" width="40">是否默认</th>
				<th nowrap="nowrap" width="150">是否启用</th>
				<th nowrap="nowrap" width="90">备注</th>
				<th nowrap="nowrap" width="100">说明</th>
				<th nowrap="nowrap" width="100">创建时间</th>
				<th nowrap="nowrap" width="100">操作</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list }" var="s" varStatus="z">
			<tr class="text-c">
				<td><input type="checkbox" value="1" name=""></td>
				<td>${z.index+1 }</td>
				<!-- <td><u style="cursor:pointer" class="text-primary" onclick="member_show('张三','member-show.html','10001','360','400')">张三</u></td> -->
				<td>${s.customerServicePhone }</td>
				
				<c:if test="${s.customerServicePhoneDefault == 1}">
							<td class="td-status"><span class="label label-success radius">默认</span></td>
				</c:if>
				<c:if test="${s.customerServicePhoneDefault == 0}">
							<td class="td-status"><a title="设为默认" href="javascript:;" onclick="setDefault('${s.customerServicePhoneId}')"><span class="label label-error radius">非默认</span></a></td>
				</c:if>
				
				<c:if test="${s.customerServicePhoneIsuse == 0}">
							<td class="td-status"><span class="label label-success radius">启用</span></td>
				</c:if>
				<c:if test="${s.customerServicePhoneIsuse == 1}">
							<td class="td-status"><span class="label label-error radius">停用</span></td>
				</c:if>
				
				<td>${s.customerServicePhoneNote }</td>
				<td>${s.customerServicePhoneSepak }</td>
				<td class="text-l" style="text-align: center !important;"><fmt:formatDate value="${s.customerServicePhoneCreatetime }" type="both"/></td>
				<td class="td-manage">
				<c:if test="${s.customerServicePhoneIsuse == 1 }">
						<a style="text-decoration:none" onClick="member_start(this,'${s.customerServicePhoneId}','0')" href="javascript:;" title="启用">
							<i class="Hui-iconfont">&#xe615;</i>
						</a> 
						</c:if>
						<c:if test="${s.customerServicePhoneIsuse == 0 }">
						<a style="text-decoration:none" onClick="member_stop(this,'${s.customerServicePhoneId}','1')" href="javascript:;" title="停用">
							<i class="Hui-iconfont">&#xe631;</i>
						</a> 
						</c:if>
				
				<a title="编辑" href="javascript:;" onclick="member_edit('编辑','khd-goodservice-picadd.jsp?goodId=${s.customerServicePhoneId}','4','','510')" class="ml-5" style="text-decoration:none">
				<i class="Hui-iconfont">&#xe6df;</i></a> 
				<a title="删除" href="javascript:;" onclick="member_del(this,'${s.customerServicePhoneId}')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i>
				</a>
				<%-- <c:if test="${(z.index) != 0 }">
                     <a title="向上移动" href="javascript:;" onclick="content_upwardone('${s.goodServiceRecommendId}','${s.goodServiceRecommendSpeak}','${z.index}')"
                       class="ml-5" style="text-decoration:none">
                        <img class="Hui-iconfont" alt="" style="width: 16px;height: 16px" src="images/sort26.png">
                    </a>
                    </c:if> --%>
				</td>
			</tr>
		</c:forEach>	
		</tbody>
	</table>
	</div>
</div>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script>
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script> 
<script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script> 
<script type="text/javascript">
$(function(){
	$('.table-sort').dataTable({
		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,0,0]}// 制定列不参与排序
		]
	});
	$('.table-sort tbody').on( 'click', 'tr', function () {
		if ( $(this).hasClass('selected') ) {
			$(this).removeClass('selected');
		}
		else {
			table.$('tr.selected').removeClass('selected');
			$(this).addClass('selected');
		}
	});
});
/*用户-添加*/
function member_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*用户-查看*/
function member_show(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*用户-停用*/
function member_stop(obj,id,isuse){
	layer.confirm('确认要停用吗？',function(index){
		location.href = "${pageContext.request.contextPath}/EnableOrDisableServicePhone.action?customerservicephoneid="+id+"&isuse="+isuse;
		layer.msg('已停用!',{icon: 5,time:1000});
	});
}

/*用户-启用*/
function member_start(obj,id,isuse){
	layer.confirm('确认要启用吗？',function(index){
	location.href = "${pageContext.request.contextPath}/EnableOrDisableServicePhone.action?customerservicephoneid="+id+"&isuse="+isuse;
	layer.msg('已启用!',{icon: 6,time:1000});
	});
}
/*用户-编辑*/
function member_edit(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*密码-修改*/
function change_password(title,url,id,w,h){
	layer_show(title,url,w,h);	
}
/*用户-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？', function (index) {
            //此处请求后台程序，下方是成功后的前台处理……
            location.href = "${pageContext.request.contextPath}/delServicePhone.action?customerservicephoneid=" + id;
            $(obj).parents("tr").remove();
            layer.msg('已删除!', {icon: 1, time: 1000});
        });
}

//设为默认
 function setDefault(id) {
 		layer.confirm('确认要设为默认吗？',function(index){
	          location.href = "${pageContext.request.contextPath}/setDefault.action?customerservicephoneid="+id;
	          layer.msg('设置成功!',{icon: 6,time:1000});
          });
    }
</script> 
</body>
</html>