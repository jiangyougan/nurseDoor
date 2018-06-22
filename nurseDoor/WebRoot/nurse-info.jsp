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
    
    String adminUserId = (String)session.getAttribute("adminUserId");
	Integer adminUsergrade = (Integer)session.getAttribute("adminUsergrade");
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
<!--IconFont图标  -->
<style type="text/css">
.iconfont{
    font-family:"iconfont" !important;
    font-size:16px;font-style:normal;
    -webkit-font-smoothing: antialiased;
    -webkit-text-stroke-width: 0.2px;
    -moz-osx-font-smoothing: grayscale;}
</style>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link></head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 用户中心 <span class="c-gray en">&gt;</span> 护士管理<!--  <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a> --></nav>
<div class="pd-20">
<form action="${pageContext.request.contextPath}/selectAllNurseInfoByKeyWord.action" method="POST">
	<div class="text-c"> 
	<!-- 日期范围：
		<input type="text" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}'})" id="datemin" class="input-text Wdate" style="width:120px;">
		-
		<input type="text" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d'})" id="datemax" class="input-text Wdate" style="width:120px;">
		 -->
		<input type="text" name="keyword" class="input-text" value="${keyword}" style="width:250px" placeholder="根据护士账号，昵称，真实姓名，手机号，邀请码,支付宝账号查找用户" id="" name="">
		<button type="submit" class="btn btn-success" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜护士</button>
	</div>
</form>	
	<div class="cl pd-5 bg-1 bk-gray mt-20"> 
	<span class="l">
	<!-- <a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a>  -->
	<c:if test="${setOrderState == 9 }">
	<a href="javascript:;" onclick="member_add()" class="btn btn-primary radius">
	<i class="Hui-iconfont">&#xe600;</i> </a>
	</c:if>
	</span> 
	<span class="r">共有数据：<strong>${count }</strong> 条</span> </div>
	<div class="mt-20">
	

  <table class="table table-border table-bordered table-bg table-hover table-sort">
    <thead>
      <tr class="text-c">
       <!--  <th width="25"><input type="checkbox" name="" value=""></th> -->
        <th width="100" nowrap="nowrap">护士头像</th>
        <th width="105">护士昵称</th>
        <th width="105">护士账号</th>
        <th width="100">工作单位</th>
       <!--  <th width="100">护士注册号</th> -->
        <!-- <th width="50">擅长语言</th> -->
        <th width="200" >擅长服务</th>
        <th width="80">工作年限</th>
        <th width="240">职业照片</th>
        <th width="100">个人优势</th>
        <th width="60">认证状态</th>
        <th width="60">可用状态</th>
        <!-- <th width="50" >积分</th> -->
        <th width="100">创建时间</th>
        <th width="80">是否沟通</th>
        <th width="50">订单数</th>
         <th width="50">总收入</th>
        <th width="100" >操作</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${list }" var="s" varStatus="z">
      <tr class="text-c">
       <!--  <td><input type="checkbox"  name=""></td> -->
        <th width="100">
        <img style="width: 100px;height: 100px" alt="" href="<%=webPath %>${s.nurseHeader }" src="<%=webPath %>${s.nurseHeader }"></th>
        <th nowrap="nowrap" width="105"><u style="cursor:pointer" class="text-primary" onclick="member_show('个人信息','nurse-info-show.jsp?nurseId=${s.nurseId}','360','400')">${s.nurseNick }</u></th>
        <th nowrap="nowrap" width="105">${s.nurseName }</th>
        <th nowrap="nowrap" width="100">${s.nurseWorkUnit }</th>
      <%--   <th nowrap="nowrap" width="100">${s.nurseNumber }</th>
        <th nowrap="nowrap" width="100">${s.nurseLanguage }</th> --%>
        <th >${s.nurseGoodservice }</th>
        <th nowrap="nowrap" width="80">${s.nurseYearsofservice }</th>
        
        <th nowrap="nowrap" width="290">
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
        
        <th nowrap="nowrap" width="80">
        	<c:if test="${s.nurseDistrict == 0 }">
						<span class="label label-success radius">已认证</span>
			</c:if>
			<c:if test="${s.nurseDistrict ==1}">
						<span class="label label-error radius">未认证</span>
			</c:if>
			<c:if test="${s.nurseDistrict ==2}">
						<span class="label label-default radius">认证中</span>
			</c:if>
        </th>
        
        <th nowrap="nowrap" width="80">
        <c:if test="${s.nurseUsestate == 0 }">
					<span class="label label-success radius">可用</span>
		</c:if>
		<c:if test="${s.nurseUsestate ==1}">
					<span class="label label-error radius">不可用</span>
		</c:if>
        </th>
        <%-- <th nowrap="nowrap" >${s.nurseMark }</th> --%>
        <th width="100">
        <fmt:formatDate value="${s.nurseCreatetime }" type="both"/></th>
        
        <td>
			<c:if test="${s.nurseCommunicate == 0 }">
				<a href="${pageContext.request.contextPath}/toUserCommunicate.action?nurseId=${s.nurseId}&identity=1&type=1" style="text-decoration:none;"><span class="label label-success radius">未沟通</span></a>
			</c:if>
			<c:if test="${s.nurseCommunicate == 1}">
				 <a href="${pageContext.request.contextPath}/toUserCommunicate.action?nurseId=${s.nurseId}&identity=1&type=1" style="text-decoration:none;"><span class="label label-error radius">已沟通</span></a>
			</c:if>
		</td>
        <td nowrap="nowrap">${s.orderCounts }</td>
         <td nowrap="nowrap">${s.nurseAllIncome }¥</td>
        <th nowrap="nowrap">
        <input type="hidden" value="${orderSendId }">
        	<c:if test="${setOrderState == 9 }">
				<a style="text-decoration:none" onClick="ChoiceWho(this,'${s.nurseId}','${orderSendId }')" href="javascript:;" title="选择该护士">
					<img style="width: 12px;height: 12px" alt="" src="img/tasks.png">
				</a> 
			</c:if>
			
			<c:if test="${setOrderState != 9 }">
				<c:if test="${s.nurseUsestate == 1 }">
					<a style="text-decoration:none" onClick="member_start(this,'${s.nurseId}')" href="javascript:;" title="启用">
						<i class="Hui-iconfont">&#xe615;</i>
					</a> 
				</c:if>
				<c:if test="${s.nurseUsestate == 0 }">
					<a style="text-decoration:none" onClick="member_stop(this,'${s.nurseId}')" href="javascript:;" title="停用">
						<i class="Hui-iconfont">&#xe631;</i>
					</a> 
				</c:if>
		       <!--  <a style="text-decoration:none" onclick="system_data_edit('角色编辑','system-data-edit.html','0001','400','310')" href="javascript:;" title="编辑">
		        <i class="Hui-iconfont">&#xe6df;</i>
		        </a>  -->
		         <!-- 修改密码 -->
				<a style="text-decoration:none" class="ml-5" onclick="member_show('修改密码','nurse-change-password.jsp?nurseId=${s.nurseId}','600','300')"  title="修改密码">
					<i class="Hui-iconfont">&#xe63f;</i>
				</a> 
		      <!--   <a title="删除" href="javascript:;" onclick="system_data_del(this,'10001')" class="ml-5" style="text-decoration:none">
		        <i class="Hui-iconfont">&#xe6e2;</i>
		        </a> -->
			</c:if>
			
			<c:if test="${adminUsergrade  == 0 }">
			<a style="text-decoration:none" class="ml-5" onClick="sendRedPackets('${s.nurseId}')" href="javascript:;" title="发红包">
							<img alt="" src="img/coupon_tag-y128.png" style="width: 15px;height:15px">
			</a>
			</c:if>
     		
        </th>
      </tr>
     </c:forEach> 
    </tbody>
  </table>
	
	 <div style="text-align: center;" class="bs-example" data-example-id="simple-pagination">
    <nav>
      <ul class="pagination">
       
        <c:if test="${pageNow > 1 }">
         <li style="float:left">
          <a href="${pageContext.request.contextPath}/selectAllNurseInfo.action?pageNow=${pageNow-1}" aria-label="Previous">
            <span aria-hidden="true">«</span>
          </a>
         </li>
        </c:if>
       <c:forEach begin="${start}" end="${end}" var="p">
	       <c:if test="${p == pageNow && p != 0}">
	         <li><a style="color: red;">${p}</a></li>
		   </c:if>
		   <c:if test="${p != pageNow && p != 0}">
	         <li><a href="${pageContext.request.contextPath}/selectAllNurseInfo.action?pageNow=${p}">${p}</a></li>
	       </c:if>
       </c:forEach> 
       <c:if test="${totalPage > pageNow && p != 0}">
        <li>
          <a href="${pageContext.request.contextPath}/selectAllNurseInfo.action?pageNow=${pageNow+1}" aria-label="Next">
            <span aria-hidden="true">»</span>
          </a>
        </li>
       </c:if> 
      </ul>
    </nav>
  </div>			
  <input value="${orderSendType }" id="orderSendType" type="hidden"/>
	
	
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

/*用户-添加*/
function member_add(){
	location.href = "${pageContext.request.contextPath}/OrderList.action?state=0";
}
/*用户-查看*/
function member_show(title,url,w,h){
	layer_show(title,url,w,h);
}
/*用户-停用*/
function member_stop(obj,id){
var state = "1";
	layer.confirm('确认要停用吗？',function(index){
		location.href = "${pageContext.request.contextPath}/nurseStateChange.action?nurseId="+id+"&state="+state;
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
		location.href = "${pageContext.request.contextPath}/nurseStateChange.action?nurseId="+id+"&state="+state;
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
		$(obj).remove();
		layer.msg('已启用!',{icon: 6,time:1000});
	});
}

/*选择该护士*/
function ChoiceWho(obj,id,orderSendId){
var orderSendType = $("#orderSendType").val();
layer.confirm('确认要选择该护士吗？',function(index){
				$.ajax({
						url: "${pageContext.request.contextPath}/ChoiceWhoOfNurseId.action",              //请求地址
				        type: "POST",                       //请求方式
				        data: { nurseId: id,orderSendId: orderSendId},      //请求参数
				        dataType: "json",
				        success: function (date) {
					           if(date==0){
						        layer.msg('发送成功!', {icon: 6, time: 1500});
						        if(orderSendType == '0' || orderSendType =='1'){
						        	location.href = "${pageContext.request.contextPath}/OrderList.action?state=0";
								}else{
									location.href = "${pageContext.request.contextPath}/OrderList.action?state=8";
								}
						        
						        }
						       else if(date==1){
						        layer.msg('订单不存在!', {icon: 5, time: 1500});
						        }else if(date==2){
						        layer.msg('该护士不存在!', {icon: 5, time: 1500});
						        }else if(date==3){
						        layer.msg('该护士未认证!', {icon: 5, time: 1500});
						        }else if(date==4){
						        layer.msg('该订单已被接取!', {icon: 5, time: 1500});
						        }
				        },
				        fail: function (status) {
        				}
				  });
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
	layer.confirm('确认要删除吗？',function(index){
		$(obj).parents("tr").remove();
		layer.msg('已删除!',{icon:1,time:1000});
	});
}

//发红包
 function sendRedPackets(id) {
      location.href = "${pageContext.request.contextPath}/puTredPacketsInfo.action?nurseId=" + id;
}

</script> 
</body>
</html>