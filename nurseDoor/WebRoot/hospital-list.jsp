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

<title>产品列表</title>
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
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 护理服务 <span class="c-gray en">&gt;</span> 护理服务项 <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
<form action="${pageContext.request.contextPath}/selecthospitalbynameweb.action" method="post">
	<div class="text-c"> 
		<input type="text" name="hospitalName" id="" value="" placeholder="请输入医院名" style="width:250px" class="input-text">
		<button name="" id="" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i>搜医院</button>
	</div>
</form>	 
	<div class="cl pd-5 bg-1 bk-gray mt-20"> 
	
		
		<a class="btn btn-primary radius" onclick="picture_add('添加医院','addhospitalbefomajor.action')" href="javascript:;">
		<i class="Hui-iconfont">&#xe600;</i> 
		添加医院
		</a>
		</span> 
	<span class="r">共有数据：
	<c:if test="${empty count}">
	<strong>12</strong> 
	</c:if>
	<c:if test="${!empty count}">
	<strong>${count}</strong> 
	</c:if>
	条</span> </div>
	<div class="mt-20">
	
		<table class="table table-border table-bordered table-bg table-hover table-sort">
			<thead>
				<tr class="text-c">
					<th width="25"><input type="checkbox" name="" value=""></th>
            		<th style="text-align: center;">医院名称</th>
            		<th style="text-align: center;">所在省份</th>
            		<th style="text-align: center;">所在城市</th>
            		<th style="text-align: center;">所在区县</th>
            		<th style="text-align: center;">详细地址</th>
            		<th style="text-align: center;">医院电话</th>
            		<th style="text-align: center;">创建时间</th>
            		<th style="text-align: center;">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="s">
				<tr style="text-align: center;">
				
			 		<td style="text-align: center;"><input type="checkbox" value="1" name=""></td>
                	<td style="text-align: center;">${s.hospitalName }</td>
					<td style="text-align: center;">${s.hospitalProvince }</td>
					<td style="text-align: center;">${s.hospitalCity }</td>
					<td style="text-align: center;">${s.hospitalDistrict }</td>
					<td style="text-align: center;">${s.hospitalAddress }</td>
					<td style="text-align: center;">${s.hospitalPhone }</td>
                	<td style="text-align: center;">
                    	<fmt:formatDate value="${s.hospitalCreatetime }" type="both"/>
               		 </td>
                
                <td style="text-align: center;">
                	 	 <!--  <a title="添加" href="javascript:;" onclick="admin_edit('管理员编辑','selectreportbygoodsId.action?goodsId=$','1')"
                       class="ml-5" style="text-decoration:none">
                        <img class="Hui-iconfont" alt="" style="width: 20px;height: 20px" src="images/icon_plus-box.png">
                   		 </a>  -->
                	
                  <a title="编辑" href="javascript:;" onclick="picture_show('管理员编辑','selecthospitalmodifybyidtest.action?hospitalId=${s.hospitalId}','1','800','500')"
                       class="ml-5" style="text-decoration:none">
                        <i class="Hui-iconfont">&#xe6df;</i>
                    </a>
                     <a title="查看" href="javascript:;" onclick="admin_seach('详细','slecthospitalinfobyid.action?hospitalId=${s.hospitalId}','800','800')"
                       class="ml-5" style="text-decoration:none">
                        <img class="Hui-iconfont" alt="" style="width: 13px;height: 13px" src="images/search-icon.png">
                    </a> 
                   <%--  <a title="删除" href="javascript:;" onclick="project_del(this,'${s.hospitalId}')"
                       class="ml-5" style="text-decoration:none">
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
   /*  function project_add(title, url, w, h) {
        layer_show(title, url, w, h);
    } */
    /*管理员-删除*/
     function project_del(obj, id) {
        layer.confirm('确认要删除吗？', function (index) {
            //此处请求后台程序，下方是成功后的前台处理……
            location.href = "${pageContext.request.contextPath}/delecthospitalbyid.action?hospitalId=" + id;
            $(obj).parents("tr").remove();
            layer.msg('已删除!', {icon: 1, time: 1000});
        });
    } 
    
     /*服务添加 */
    function content_add(id) {
    		alert("id="+id);
          location.href = "${pageContext.request.contextPath}/selecthospitalmodifybyid.action?hospitalId=" + id;
    }
    
</script>
<script type="text/javascript">
/* $('.table-sort').dataTable({
	"aaSorting": [[ 1, "desc" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	"aoColumnDefs": [
	  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
	  {"orderable":false,"aTargets":[0,8]}// 制定列不参与排序
	]
}); */
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