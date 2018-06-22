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
            
     String userNick = (String)session.getAttribute("userNick");
	String adminUserId = (String)session.getAttribute("adminUserId");
	Integer adminUsergrade = 100;
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
<%if(adminUserId == null || "".equals(adminUserId)){%>
	<%@ include file="loginCheck.jsp" %>
<%}else{
	adminUsergrade = (Integer)session.getAttribute("adminUsergrade");
}%>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 护理服务 <span class="c-gray en">&gt;</span> 护理服务项 <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
<%-- <form action="${pageContext.request.contextPath}/OrderKeyWordList.action" method="post">
	<div class="text-c"> 
		<input type="text" name="number" id="" value="${number}" placeholder="请输入订单的单号,发布人的账号" style="width:250px" class="input-text">
		<button name="" id="" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i>搜订单</button>
	</div>
</form>	 --%>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> 
	
		<a class="btn btn-primary radius" <%-- onclick="picture_add('添加产品','selectcontentall.action?id=${projectid}')" --%>onclick="self.location=document.referrer;" href="javascript:;">
		<i class="Hui-iconfont">&#xe600;</i>返回上一级 </a>
		 <%if(adminUsergrade <=1){%>
		<a class="btn btn-primary radius" onclick="picture_add('添加产品','GoodGotoInfo.action?contentid=${goodsContent}')" href="javascript:;">
		<i class="Hui-iconfont">&#xe600;</i> 
		添加产品
		</a>
		<%} %>
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
	<input type="hidden"value="${goodsContent}"/>
		<table class="table table-border table-bordered table-bg table-hover table-sort">
			<thead>
				<tr class="text-c">
					<th width="25"><input type="checkbox" name="" value=""></th>
            		<th style="text-align: center;">产品名称</th>
            		<th style="text-align: center;">产品费用</th>
            		<th style="text-align: center;">是否必选</th>
            		<th style="text-align: center;">修改时间</th>
            		<th style="text-align: center;">上架/下架</th>
            		<th style="text-align: center;">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="s" varStatus="z">
				<tr style="text-align: center;">
				
			 		<td style="text-align: center;"><input type="checkbox" value="1" name=""></td>
                	<td style="text-align: center;">${s.goodsName }</td>
					<td style="text-align: center;">${s.goodsMoney }</td>
					<c:if test="${s.goodsIsdefault == 0}">
					<td class="td-status" style="text-align: center;"><span class="label label-success radius">必选</span></td>
					</c:if>
					<c:if test="${s.goodsIsdefault == 1}">
					<td class="td-status" style="text-align: center;"><span class="label label-error radius">非必选</span></td>
					</c:if>
                	<td style="text-align: center;">
                    	<fmt:formatDate value="${s.goodsUpdatime }" type="both"/>
               		 </td>
               		 <td style="text-align: center;">
               		
						<c:if test="${s.goodsNote == '0'}">
						<span class="label label-success radius">上架</span>
						</c:if>
						<c:if test="${s.goodsNote == '1'}">
						<span class="label label-error radius">下架</span>
						</c:if>
               		 </td>
                <td style="text-align: center;">
                	 	<%--   <a title="添加" href="javascript:;" onclick="admin_edit('管理员编辑','selectreportbygoodsId.action?goodsId=${s.goodsId}','1')"
                       class="ml-5" style="text-decoration:none">
                        <img class="Hui-iconfont" alt="" style="width: 20px;height: 20px" src="images/icon_plus-box.png">
                   		 </a>  --%>
                   	 <%if(adminUsergrade <=1){%>	 
                	 <c:if test="${s.goodsNote == '1' }">
						<a style="text-decoration:none" onClick="member_start(this,'${s.goodsId}','${s.goodsContent}')" href="javascript:;" title="上架">
							<i class="Hui-iconfont">&#xe615;</i>
						</a> 
						</c:if>
						<c:if test="${s.goodsNote == '0' }">
						<a style="text-decoration:none" onClick="member_stop(this,'${s.goodsId}','${s.goodsContent}')" href="javascript:;" title="下架">
							<i class="Hui-iconfont">&#xe631;</i>
						</a> 
					</c:if>	
                	 <%} %>
                	  <%if(adminUsergrade <=1){%>
                    <a title="编辑" href="javascript:;" onclick="picture_show('产品修改','UpdGoodEdit.action?goodsId=${s.goodsId}&goodsContent=${goodsContent}','1','800','500')"
                       class="ml-5" style="text-decoration:none">
                        <i class="Hui-iconfont">&#xe6df;</i>
                    </a>
                    <%} %>
                    <!-- <a title="查看" href="javascript:;" onclick="admin_seach('详细','','800','800')"
                       class="ml-5" style="text-decoration:none">
                        <img class="Hui-iconfont" alt="" style="width: 13px;height: 13px" src="images/search-icon.png">
                    </a> -->
                    <%-- <a title="删除" href="javascript:;" onclick="project_del(this,'${s.goodsId}','${s.goodsContent }')"
                       class="ml-5" style="text-decoration:none">
                        <i class="Hui-iconfont">&#xe6e2;</i>
                    </a> --%>
                     <c:if test="${z.index >0 }">
	                     <a title="向上移动" href="javascript:;" onclick="content_upwardone('${goodsContent}','${s.goodsOrder }','${s.goodsId }','${projectid }')"
	                       class="ml-5" style="text-decoration:none">
	                        <img class="Hui-iconfont" alt="" style="width: 20px;height: 20px" src="images/sort26.png">
	                    </a>
                    </c:if>
                    <%--  <a title="向下移动" href="javascript:;" onclick="content_downone('${goodsContent}','${s.goodsOrder }','${s.goodsId}', '${projectid }')"
                       class="ml-5" style="text-decoration:none">
                        <img class="Hui-iconfont" alt="" style="width: 20px;height: 20px" src="images/sort21.png">
                    </a>  --%>
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


/*管理员-停用*/
function admin_stop(obj,id,goodsContent){
alert("id="+id+",goodsContent="+goodsContent);
var state="0";
	/* layer.confirm('确认要停用吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
		location.href = "${pageContext.request.contextPath}/AdminState.action?id="+id+"&state="+state+"&goodsContent="+goodsContent;
		
		/* $(obj).parents("tr").find(".td-manage").prepend('<a onClick="admin_start(this,id)" href="javascript:;" title="启用" style="text-decoration:none"><i class="Hui-iconfont">&#xe615;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">已禁用</span>');
		$(obj).remove(); */
		layer.msg('已停用!',{icon: 5,time:1000});
	}); */
}

/*管理员-启用*/
function admin_start(obj,id,goodsContent){
alert("id="+id+",goodsContent="+goodsContent);
var state="1";
	/* layer.confirm('确认要启用吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
		location.href = "${pageContext.request.contextPath}/AdminState.action?id="+id+"&state="+state+"&goodsContent="+goodsContent;
		/* 
	    $(obj).parents("tr").find(".td-manage").prepend('<a onClick="admin_stop(this,id)" href="javascript:;" title="停用" style="text-decoration:none"><i class="Hui-iconfont">&#xe631;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
		$(obj).remove(); */
		layer.msg('已启用!', {icon: 6,time:1000});
	}); */
}
</script>

<script type="text/javascript">

 function content_upwardone(projectId,order,goodsId,projectid) {
          location.href = "${pageContext.request.contextPath}/goodsupwardone.action?contentid=" + projectId+"&order="+order+"&goodsId="+goodsId+"&projectid="+projectid;
  }
    
 function content_downone(projectId,order,goodsId,projectid) {
 
          location.href = "${pageContext.request.contextPath}/goodsdownone.action?contentid=" + projectId+"&order="+order+"&goodsId="+goodsId+"&projectid="+projectid;
  }

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
    function project_del(obj, id,contentId) {
        layer.confirm('确认要删除吗？', function (index) {
            //此处请求后台程序，下方是成功后的前台处理……
            $.ajax({
				type : "POST",
				url : "delNursingGoodsListInfo.action",
				data:{"goodsId" : id,"contentId":contentId}, 
				dataType : "json",
				success:function(data){
					if(data==0){
						$(obj).parents("tr").remove();
			            layer.msg('已删除!', {icon: 1, time: 1000});
					}else{
						layer.msg('删除失败请从试!', {icon: 1, time: 1000});
					}
			}
			}
			);
        });
    }
    
     /*服务添加 */
    function content_add(id) {
          location.href = "${pageContext.request.contextPath}/selectcontentall.action?id=" + id;
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
/*用户-下架*/
function member_stop(obj,id,goodsContent){
var state = "1";
	layer.confirm('确认要下架吗？',function(index){
		location.href = "${pageContext.request.contextPath}/goodsUpAndDown.action?goodsId="+id+"&state="+state+"&goodsContent="+goodsContent;
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_start(this,id)" href="javascript:;" title="上架"><i class="Hui-iconfont">&#xe6e1;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已下架</span>');
		$(obj).remove();
		layer.msg('已停用!',{icon: 5,time:1000});
	});
}

/*用户-上架*/
function member_start(obj,id,goodsContent){
var state = "0";
	layer.confirm('确认要上架吗？',function(index){
		location.href = "${pageContext.request.contextPath}/goodsUpAndDown.action?goodsId="+id+"&state="+state+"&goodsContent="+goodsContent;
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_stop(this,id)" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe631;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已上架</span>');
		$(obj).remove();
		layer.msg('已启用!',{icon: 6,time:1000});
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