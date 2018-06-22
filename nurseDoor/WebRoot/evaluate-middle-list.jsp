<!DOCTYPE HTML>
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
<title>意见反馈</title>
<style type="text/css">
   ul{
           list-style-type: none;
        }
  .star_ul li{
      float:left;
  }
</style>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link></head>
<body>

<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 评论管理 <span class="c-gray en">&gt;</span> 意见反馈 <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>

<div class="pd-20">
	<!-- <div class="text-c"> 日期范围：
		<input type="text" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}'})" id="datemin" class="input-text Wdate" style="width:120px;">
		-
		<input type="text" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d'})" id="datemax" class="input-text Wdate" style="width:120px;">
		<input type="text" class="input-text" style="width:250px" placeholder="输入关键词" id="" name="">
		<button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜意见</button>
	</div> -->
	<ul class="nav nav-tabs" role="tablist">
  		<li role="presentation" ><a href="${pageContext.request.contextPath}/selectGoodEvaluateInfoOfKeyWord.action">好评</a></li>
  		<li role="presentation" class="active"><a href="${pageContext.request.contextPath}/selectMiddleEvaluateInfoOfKeyWord.action">中评</a></li>
  		<li role="presentation"><a href="${pageContext.request.contextPath}/selectBadEvaluateInfoOfKeyWord.action">差评</a></li>
	</ul>
	<div class="cl pd-5 bg-1 bk-gray mt-20">
	<form action="${pageContext.request.contextPath}/selectMiddleEvaluateInfoOfKeyWordMiddle.action" method="post">
			<div class="text-c">日期范围：
				<input type="text"   value="${datemin }" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'logmax\')||\'%y-%M-%d\'}'})" id="logmin" name="logmin" class="input-text Wdate" style="width:120px;">
				-
				<input type="text"  value="${datemax }" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'logmin\')}',maxDate:'%y-%M-%d'})" id="logmax" name="logmax" class="input-text Wdate" style="width:120px;">
				 
				<input type="text" name="number" id="" value="${number}" placeholder="请输入用户账号,护士账号,评价内容" style="width:250px" class="input-text">
				<button name="" id="" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i>搜评价</button>
			</div>
		</form>	
	</div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-hover table-bg table-sort">
			<thead>
				<tr class="text-c">
					<!-- <th nowrap="nowrap" width="25"><input type="checkbox" name="" value=""></th> -->
					<th nowrap="nowrap" width="10">用户头像</th>
					<th nowrap="nowrap" width="30">用户昵称</th>
					<th nowrap="nowrap" width="30">护士昵称</th>
					<th nowrap="nowrap" width="30">订单单号</th>
					<th nowrap="nowrap" width="200">评价内容</th>
					<th nowrap="nowrap" width="200">评价分数</th>
					<th nowrap="nowrap" width="60">评价时间时间</th>
					<th nowrap="nowrap" width="40">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list }" var="s" varStatus="z">
					<tr class="text-c">
						<!-- <td><input type="checkbox" value="1" name=""></td> -->
						<td><a href="javascript:;" ><i class="avatar size-L radius"><img alt="" src="<%=webPath %>${s.userHeader }"></i></a></td>
						
						<td><u style="cursor:pointer" class="text-primary" onclick="member_show('个人信息','user-info-descripe.jsp?userId=${s.userId}','360','400')">${s.userNick }</u></td>
						
						<td class="text-l" style="text-align: center !important;"><div class="c-999 f-12">
								<u style="cursor:pointer" class="text-primary" onclick="member_show('个人信息','nurse-info-show.jsp?nurseId=${s.nurseId}','360','400')">${s.nurseNick }</u> </div></td>
						
						<th width="30"><a href="OrderInfoByOrderId.action?orderSendId=${s.evaluateOrderSendId}">${s.orderSendNumbers }</a></th>
						
						<th width="60">${s.evaluateContent }</th>
						
						<th width="60">
						<c:if test="${s.evaluateMark == 2}">
							<ul class="star_ul">
						        <li num="1"><img src="images/star_full.png" class="xing_hui"/></li>
						        <li num="2"><img src="images/star_full.png"  class="xing_hui"/></li>
						    </ul>
						</c:if>
						<c:if test="${s.evaluateMark == 3}">
							<ul class="star_ul">
						        <li num="1"><img src="images/star_full.png" class="xing_hui"/></li>
						        <li num="2"><img src="images/star_full.png"  class="xing_hui"/></li>
						        <li num="3"><img src="images/star_full.png"  class="xing_hui"/></li>
						    </ul>
						</c:if>
						</th>
						
						<th width="60"><fmt:formatDate value="${s.evaluateCreatetime }" type="both"/></th>
						
						
						<td class="td-manage">
						<%if(adminUsergrade == 9 || adminUsergrade <=1){%>
						<a style="text-decoration:none" class="ml-5" onclick="member_add('修改评价','evaluate-update.jsp?evaluateId=${s.evaluateId}&evaluateContent=${s.evaluateContent }','','510')" href="javascript:;" title="去评价">
							<img style="width: 12px;height: 12px" alt="" src="images/navigate-right.png">
						</a>
						<%} %>
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
          <a href="${pageContext.request.contextPath}/complaintUserlookToNurse.action?pageNow=${pageNow-1}" aria-label="Previous">
            <span aria-hidden="true">«</span>
          </a>
         </li>
        </c:if>
       <c:forEach begin="${start}" end="${end}" var="p">
	       <c:if test="${p == pageNow}">
	         <li><a style="color: red;">${p}</a></li>
		   </c:if>
		   <c:if test="${p != pageNow &&  p != 0}">
	         <li><a href="${pageContext.request.contextPath}/complaintUserlookToNurse.action?pageNow=${p}">${p}</a></li>
	       </c:if>
       </c:forEach> 
       <c:if test="${totalPage > pageNow}">
        <li>
          <a href="${pageContext.request.contextPath}/complaintUserlookToNurse.action?pageNow=${pageNow+1}" aria-label="Next">
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
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script> 
<script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script> 
<script type="text/javascript">
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
/*用户-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$(obj).parents("tr").remove();
		layer.msg('已删除!',{icon:1,time:1000});
	});
}

function handleComplait(obj,id){
var complaintId = id;
	layer.confirm('确认已处理吗？',function(index){
				$.ajax({
						url: "${pageContext.request.contextPath}/HandleComplaintOrder.action",              //请求地址
				        type: "POST",                       //请求方式
				        data: { complaintId: complaintId},        //请求参数
				        dataType: "json",
				        success: function (date) {
					        if(date==0){
					        $(obj).parents("tr").remove();
					        layer.msg('已处理!',{icon:1,time:1000});
					        //location.href = "${pageContext.request.contextPath}/OrderList.action?state=0";
					        }else {
					        layer.msg('修改失败!', {icon: 5, time: 1500});
					        }
				        },
				        fail: function (status) {
        				}
				  });
	});
}
</script>
</body>
</html>