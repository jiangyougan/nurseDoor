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
<title>精品推荐</title>
<style type="text/css">
.table>thead>tr>th, .table>tbody>tr>th, .table>tfoot>tr>th, .table>thead>tr>td, .table>tbody>tr>td, .table>tfoot>tr>td{
vertical-align:middle !important;
}
</style>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link></head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 用户中心 <span class="c-gray en">&gt;</span> 用户管理 <!-- <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a> --></nav>
<div class="pd-20">
<form action="${pageContext.request.contextPath}/selectAllUserInfoByKeyWord.action" method="POST">
	<div class="text-c"> 
	<!-- 日期范围：
		<input type="text" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}'})" id="datemin" class="input-text Wdate" style="width:120px;">
		-
		<input type="text" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d'})" id="datemax" class="input-text Wdate" style="width:120px;">
		 -->
		<input type="text" name="keyword" class="input-text" value="${keyword}" style="width:250px" placeholder="根据用户账号，昵称，真实姓名，手机号，邀请码,支付宝账号查找用户" id="" name="">
		<button type="submit" class="btn btn-success" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜用户</button>
	</div>
</form>	

	<%-- <div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a href="javascript:;" onclick="member_add('添加用户','member-add.html','','510')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加用户</a></span> <span class="r">共有数据：<strong>${count }</strong> 条</span> </div> --%>
	<div class="mt-20">
	<table class="table table-border table-bordered table-hover table-bg table-sort" style="vertical-align: inherit !improtant;">
		<thead>
			<tr class="text-c">
				<th nowrap="nowrap" width="25"><input type="checkbox" name="" value=""></th>
				<th nowrap="nowrap"  width="100">头像</th>
				<th nowrap="nowrap" width="40">昵称</th>
				<th nowrap="nowrap" width="90">账号</th>
				<th nowrap="nowrap" width="150">手机号</th>
				<th nowrap="nowrap" width="90">用户邀请码</th>
				<th nowrap="nowrap" width="100">性别</th>
				<th nowrap="nowrap" width="100">年龄</th>
				<!-- <th nowrap="nowrap" width="100">认证状态</th> -->
				<th nowrap="nowrap" width="100">可用状态</th>
				<th nowrap="nowrap" width="100">省份城市</th>
				<th nowrap="nowrap" width="100">创建时间</th>
				<th nowrap="nowrap" width="100">是否沟通</th>
				<th nowrap="nowrap" width="100">总订单</th>
				<th nowrap="nowrap" width="100">总支出</th>
				<th nowrap="nowrap" width="100">操作</th>
				
			</tr>
		</thead>
		<tbody>
		
			<c:forEach items="${list }" var="s" varStatus="z">
				<tr class="text-c">
					<td><input type="checkbox" value="1" name=""></td>
					<td nowrap="nowrap"  width="100">
						<img alt="" src="<%=webPath%>${s.userHeader }" style="width: 60px;height: 60px">
					</td>
					<td><u style="cursor:pointer" class="text-primary" onclick="member_show('个人信息','user-info-descripe.jsp?userId=${s.userId}','360','400')">${s.userNick }</u></td>
					<th nowrap="nowrap" width="90">${s.userName }</th>
					<th nowrap="nowrap" width="150">${s.userPhone }</th>
					<th nowrap="nowrap" width="90">${s.userInvitationcode }</th>
					<td>
						<c:if test="${s.userSex ==1}">
							男
						</c:if>
						<c:if test="${s.userSex ==2}">
							女
						</c:if>
					</td>
					<td>${s.userAge }</td>
					<%-- <td>
						<c:if test="${s.userIdenstate == 0 }">
							<span class="label label-success radius">已认证</span>
						</c:if>
						<c:if test="${s.userIdenstate ==1}">
							<span class="label label-error radius">未认证</span>
						</c:if>
					</td> --%>
					<td class="text-l" style="text-align: center !important;">
						<c:if test="${s.userUsestate == 0 }">
							<span class="label label-success radius">可用</span>
						</c:if>
						<c:if test="${s.userUsestate ==1}">
							<span class="label label-error radius">不可用</span>
						</c:if>
					</td>
					<td class="text-l">${s.userProvince }</td>
					<th nowrap="nowrap" width="100"><fmt:formatDate value="${s.userCreatetime }" type="both"/></th>
					
					<td>
						<c:if test="${s.userCommunicate == 0 }">
							<a href="${pageContext.request.contextPath}/toNurseUserCommunicate.action?userId=${s.userId}&identity=0" style="text-decoration:none;"><span class="label label-success radius">未沟通</span></a>
						</c:if>
						<c:if test="${s.userCommunicate == 1}">
							 <a href="${pageContext.request.contextPath}/toNurseUserCommunicate.action?userId=${s.userId}&identity=0" style="text-decoration:none;"><span class="label label-error radius">已沟通</span></a>
						</c:if>
					</td>
					
					<td>${s.orderCounts }</td>
					<td>${s.userAllExpenditure }</td>
					
					<td class="td-manage">
						<c:if test="${s.userUsestate == 1 }">
						<a style="text-decoration:none" onClick="member_start(this,'${s.userId}')" href="javascript:;" title="启用">
							<i class="Hui-iconfont">&#xe615;</i>
						</a> 
						</c:if>
						<c:if test="${s.userUsestate == 0 }">
						<a style="text-decoration:none" onClick="member_stop(this,'${s.userId}')" href="javascript:;" title="停用">
							<i class="Hui-iconfont">&#xe631;</i>
						</a> 
						</c:if>
						<a title="他的订单" href="javascript:;" onclick="user_order_info('${s.userId}')" class="ml-5" style="text-decoration:none">
                        <img alt="" src="images/search_database.png" style="width: 15px;height:15px">
                   		 </a>
						<!-- <a title="编辑" href="javascript:;" onclick="member_edit('编辑','member-add.html','4','','510')" class="ml-5" style="text-decoration:none">
							<i class="Hui-iconfont">&#xe6df;</i>
						</a> -->
							
						<a title="他的患者" href="javascript:;" onclick="user_personal_show('${s.userId}')" class="ml-5" style="text-decoration:none">
                        <img alt="" src="images/search-icon.png" style="width: 15px;height:15px">
                       </a>
                       <!-- 修改密码 -->
						<a style="text-decoration:none" class="ml-5"  onclick="member_show('修改密码','user-change-password.jsp?userId=${s.userId}','600','300')" title="修改密码">
							<i class="Hui-iconfont">&#xe63f;</i>
						</a> 
						
						<a style="text-decoration:none" class="ml-5" onClick="sendCoupon('${s.userId}')" href="javascript:;" title="发优惠券">
							<img alt="" src="img/coupon_tag-y128.png" style="width: 15px;height:15px">
						</a>
						
					<!-- 	<a title="删除" href="javascript:;" onclick="member_del(this,'1')" class="ml-5" style="text-decoration:none">
							<i class="Hui-iconfont">&#xe6e2;</i>
						</a> -->
						
						
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	 <div style="text-align: center;" class="bs-example" data-example-id="simple-pagination">
    <nav>
      <ul class="pagination">
       
        <c:if test="${pageNow > 1}">
         <li style="float:left">
          <a href="${pageContext.request.contextPath}/selectAllUserInfo.action?pageNow=${pageNow-1}" aria-label="Previous">
            <span aria-hidden="true">«</span>
          </a>
         </li>
        </c:if>
       <c:forEach begin="${start}" end="${end}" var="p">
	       <c:if test="${p == pageNow}">
	         <li><a style="color: red;">${p}</a></li>
		   </c:if>
		   <c:if test="${p != pageNow &&  p != 0}">
	         <li><a href="${pageContext.request.contextPath}/selectAllUserInfo.action?pageNow=${p}">${p}</a></li>
	       </c:if>
       </c:forEach> 
       <c:if test="${totalPage > pageNow}">
        <li>
          <a href="${pageContext.request.contextPath}/selectAllUserInfo.action?pageNow=${pageNow+1}" aria-label="Next">
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
 function addClick(){
  $('td > img').on('click',function(){
      $(document).on('click',function(){
          $('#bigimg').hide();
      })
      $('#bigimg').attr('src',this.src).show()
        event.stopPropagation();// 点击除自己以外任意元素不
  })
}addClick();

/*用户-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*用户-查看*/
function member_show(title,url,w,h){
	layer_show(title,url,w,h);
}
/*用户-停用*/
function member_stop(obj,id){
var state = "1";
	layer.confirm('确认要停用吗？',function(index){
		location.href = "${pageContext.request.contextPath}/userStateChange.action?userId="+id+"&state="+state;
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="Hui-iconfont">&#xe6e1;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
		$(obj).remove();
		layer.msg('已停用!',{icon: 5,time:1000});
	});
}

/*用户-启用*/
function member_start(obj,id){
var state = "0";
	layer.confirm('确认要启用吗？',function(index){
		location.href = "${pageContext.request.contextPath}/userStateChange.action?userId="+id+"&state="+state;
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

/*我的患者*/
    function user_personal_show(id) {
          location.href = "${pageContext.request.contextPath}/selectuserForPersonalInfo.action?userId=" + id;
    }
//我的订单
 function user_order_info(id) {
      location.href = "${pageContext.request.contextPath}/selectUserorderInfoNo.action?userId=" + id+"&orderState=0";
}

//发优惠券
 function sendCoupon(id) {
      location.href = "${pageContext.request.contextPath}/sendCouponForUser.action?userId=" + id;
}

/*密码-修改*/
function change_password(title,url,id,w,h){
	layer_show(title,url,w,h);	
}
/*用户-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$(obj).parents("tr").remove();
		layer.msg('已删除!',{icon:1,time:1000});
	});
}
</script> 
</body>
</html>