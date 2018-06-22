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
<title>护士信息</title>
<style type="text/css">
.table>thead>tr>th, .table>tbody>tr>th, .table>tfoot>tr>th, .table>thead>tr>td, .table>tbody>tr>td, .table>tfoot>tr>td{
vertical-align:middle !important;
}
</style>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link></head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 用户中心 <span class="c-gray en">&gt;</span> 用户管理 <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
	<div class="cl pd-5 bg-1 bk-gray mt-20"> 
	<!-- <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a href="javascript:;" onclick="member_add('添加用户','member-add.html','','510')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加用户</a></span> --> 
	<span class="r">共有数据：<strong>${count }</strong> 条</span> </div>
	<div class="mt-20">
	

  <table class="table table-border table-bordered table-bg table-hover table-sort">
    <thead>
      <tr class="text-c">
       <!--  <th width="25"><input type="checkbox" name="" value=""></th> -->
        <th width="100">护士头像</th>
        <th width="50">护士昵称</th>
        <th width="80">护士账号</th>
        <th width="100">工作单位</th>
        <!-- <th width="100">护士注册号</th>
        <th width="100">擅长语言</th> -->
        <th width="100">擅长服务</th>
        <th width="100">工作年限</th>
        <th width="100">职业照片</th>
        <th width="100">个人优势</th>
        <th width="80">是否沟通</th>
        <th width="100">创建时间</th>
        <th width="100">操作</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${list }" var="s" varStatus="z">
      <tr class="text-c">
      <%--   <td><input type="checkbox" value="${z.index+1 }" name=""></td> --%>
        <th width="100">
        <img style="width: 100px;height: 100px" alt="" src="<%=webPath %>${s.nurseHeader }"></th>
        <th nowrap="nowrap" width="50"><u style="cursor:pointer" class="text-primary" onclick="member_show('个人信息','nurse-info-show.jsp?nurseId=${s.nurseId}','10001','360','400')">${s.nurseNick }</u></th>
        <th nowrap="nowrap" width="80">${s.nurseName }</th>
        <th nowrap="nowrap" width="100">${s.nurseWorkUnit }</th>
        <%-- <th nowrap="nowrap" width="100">${s.nurseNumber }</th>
        <th nowrap="nowrap" width="100">${s.nurseLanguage }</th> --%>
        <th nowrap="nowrap" width="100">${s.nurseGoodservice }</th>
        <th nowrap="nowrap" width="100">${s.nurseYearsofservice }</th>
        
        <th nowrap="nowrap" width="200">
        <c:if test="${s.nurseNurseLicensepic != null}">
        	<c:set var="imgsp" value="${s.nurseNurseLicensepic}" />
			<c:set var="result" value="${fn:split(imgsp, ',')}" />
        	<c:forEach items="${result}" var="primg">
					<a href="<%=host %>${primg}">
						<img alt="没有图片" src="<%=host %>${primg}" width="90px" height="90px">
					</a>
			</c:forEach>
        </c:if>
        </th>
        <th nowrap="nowrap" width="100">${s.nurseNote }</th>
        
         <td>
			<c:if test="${s.nurseCommunicate == 0 }">
				<a href="${pageContext.request.contextPath}/toUserCommunicate.action?nurseId=${s.nurseId}&identity=1&type=0" style="text-decoration:none;"><span class="label label-success radius">未沟通</span></a>
			</c:if>
			<c:if test="${s.nurseCommunicate == 1}">
				 <a href="${pageContext.request.contextPath}/toUserCommunicate.action?nurseId=${s.nurseId}&identity=1&type=0" style="text-decoration:none;"><span class="label label-error radius">已沟通</span></a>
			</c:if>
		</td>
        
        <th width="100">
        <fmt:formatDate value="${s.nurseCreatetime }" type="both"/></th>
        <td class="f-14">
        <a style="text-decoration:none" onclick="member_del(this,'${s.nurseId}')" href="javascript:;" title="不通过">
        <i class="Hui-iconfont"><img src="images/icon_error_s.png"/></i>
        </a> <a title="通过" href="javascript:;" onclick="member_add(this,'${s.nurseId}')" class="ml-5" style="text-decoration:none">
        <i class="Hui-iconfont"><img src="images/icon_right_s.png"/></i></a></td>
      </tr>
     </c:forEach> 
    </tbody>
  </table>
	
	 <div style="text-align: center;" class="bs-example" data-example-id="simple-pagination">
    <nav>
      <ul class="pagination">
        <c:if test="${pageNow > 1}">
         <li style="float:left">
          <a href="${pageContext.request.contextPath}/selectAllNurseInfo.action?pageNow=${pageNow-1}" aria-label="Previous">
            <span aria-hidden="true">«</span>
          </a>
         </li>
        </c:if>
       <c:forEach begin="${start}" end="${end}" var="p">
	       <c:if test="${p == pageNow}">
	         <li><a style="color: red;">${p}</a></li>
		   </c:if>
		   <c:if test="${p != pageNow}">
	         <li><a href="${pageContext.request.contextPath}/selectAllNurseInfo.action?pageNow=${p}">${p}</a></li>
	       </c:if>
       </c:forEach> 
       <c:if test="${totalPage > pageNow}">
        <li>
          <a href="${pageContext.request.contextPath}/selectAllNurseInfo.action?pageNow=${pageNow+1}" aria-label="Next">
            <span aria-hidden="true">»</span>
          </a>
        </li>
       </c:if> 
      </ul>
    </nav>
  </div>			
	
	
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
// 选项卡事件
function nuserState(state){
	location.href = "${pageContext.request.contextPath}/nurseIdentity.action?state="+state;
}
//记录选中的选项卡
function nuserState(){
 var value_s=$('#selectVal').val();
 //alert(value_s);
 var osel1=document.getElementById("brandclass"); 
    var opts1=osel1.getElementsByTagName("option");
		var i;	for(i=0;i<osel1.length;i++){
			if(opts1[i].value==value_s){
				//alert(opts[i].value);
				opts1[i].selected=true;	
	}
		}	 		  
}
nuserState();
</script>
<script type="text/javascript">
/* $(function(){
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
}); */
/*用户-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*用户-查看*/
function member_show(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*用户-停用*/
function member_stop(obj,id){
	layer.confirm('确认要停用吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="Hui-iconfont">&#xe6e1;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
		$(obj).remove();
		layer.msg('已停用!',{icon: 5,time:1000});
	});
}

/*用户-启用*/
function member_start(obj,id){
	layer.confirm('确认要启用吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
		$(obj).remove();
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
/*不通过*/
function member_del(obj,id){
	layer.confirm('确认要取消通过吗？',function(index){
	//此处请求后台程序，下方是成功后的前台处理……
            location.href = "${pageContext.request.contextPath}/NurseInfodistrictCheck.action?nurseId=" + id+"&state="+1;
		$(obj).parents("tr").remove();
		layer.msg('已取消!',{icon:1,time:1000});
	});
}
/*通过*/
function member_add(obj,id){
	layer.confirm('确认要通过吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
        location.href = "${pageContext.request.contextPath}/NurseInfodistrictCheck.action?nurseId=" + id+"&state="+0;
		$(obj).parents("tr").remove();
		layer.msg('已通过!',{icon:1,time:1000});
	});
}
</script> 
</body>
</html>