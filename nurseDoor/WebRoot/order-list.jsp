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
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>订单列表</title>
	<style>
	body{
	margin:0;
	padding:0 
}
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
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link></head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 订单管理 <span class="c-gray en">&gt;</span> 订单列表 <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
<form action="${pageContext.request.contextPath}/OrderKeyWordList.action" method="post">
	<div class="text-c">日期范围：
		<input type="text"   value="${datemin }" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'logmax\')||\'%y-%M-%d\'}'})" id="logmin" name="logmin" class="input-text Wdate" style="width:120px;">
		-
		<input type="text"  value="${datemax }" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'logmin\')}',maxDate:'%y-%M-%d'})" id="logmax" name="logmax" class="input-text Wdate" style="width:120px;">
		 
		<input type="text" name="number" id="" value="${number}" placeholder="请输入订单的单号,发布人的账号" style="width:250px" class="input-text">
		<button name="" id="" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i>搜订单</button>
		<span class="select-box" style="width:150px">
			<select class="select" id="brandclass" name="brandclass" size="1" onchange="orderState(this.options[this.options.selectedIndex].value)">
				<option value="9" selected>所有订单</option>
				<option value="0">发布中</option>
				<!-- <option value="1">正在进行中</option> -->
				<option value="2">已完成</option>
				<option value="1">进行中</option>
				<option value="4">待预约</option>
				<option value="5">被取消(待退款)</option>
				<option value="8">被取消(待协商)</option>
				<option value="10">被取消(已退款)</option>
				<option value="6">未评价</option>
				<option value="7">未返利</option>
				<input type="hidden" id="selectVal" name="selectVal" value="${state}">
			</select>
		</span>
		<c:if test="${state == 0}">
			<div style="float: left: ;margin-top: 20px;overflow: hidden;">
				<ul>
					<li style="float: left;"><img style="width: 20px;height: 20px;" alt="" src="img/veryteshu.png"><span>正接单被取消的专属单</span></li>
					<li style="float: left;"><img style="width: 20px;height: 20px;" alt="" src="img/teshu.png"><span>正在发布的专属单</span></li>
					<li style="float: left;"><img style="width: 20px;height: 20px;" alt="" src="img/putong.png"><span>正在发布的普通单</span></li>
				</ul>
			</div>
		</c:if>
	</div>
	
</form>	
	<div class="cl pd-5 bg-1 bk-gray mt-20"> 
		<!-- <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius">
		<i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> 
		<a class="btn btn-primary radius" onclick="picture_add('添加图片','picture-add.html')" href="javascript:;">
		<i class="Hui-iconfont">&#xe600;</i> 
		添加图片
		</a>
		</span>  -->
	<span class="r">共有数据：
	<strong>${count}</strong> 
	条</span> </div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-bg table-hover table-sort">
			<thead>
				<tr class="text-c">
					<th width="40"><input name="" type="checkbox" value=""></th>
					<th width="100">单号</th>
					<th width="80">发布人账号</th>
					<th width="80">发布人昵称</th>
					<!-- <th width="100">服务项目</th> -->
					<th width="120">服务项目</th>
					<th width="50">受护人</th>
					<th width="50">服务对象性别</th>
					<th width="50">服务对象年龄</th>
					<th width="50">护士账号</th>
					<th width="150">服务地址</th>
					<th width="60">支付状态</th>
					<th width="60">发布状态</th>
					<c:if test="${state == 4}">
					 <th width="60">是否沟通</th>
					</c:if>
					<c:if test="${state == 8 || state == 2 || state == 5}">
					 <th width="60">处理</th>
					</c:if>
					<th width="80">发布时间</th>
					<th width="100">操作</th>
				</tr>
			</thead>
			<tbody>
			<jsp:useBean id="nowDates" class = "java.util.Date" />
				<c:forEach items="${list}" var="s">
					<tr class="text-c">
						<td><input name="" type="checkbox" value=""></td>
						
						<td nowrap="nowrap">
							<div class="div" style="vertical-align:middle;">
							<c:set var="interval" value="${nowDates.time - s.orderSendCreatetime.time}"/>
							<!-- 隐藏的时间域(订单开始时间) -->
							<%-- <c:if test="${state == 0}">
								<c:if test="${interval>0}">
									<img alt="" src="img/guoqi.png" style="width: 50px;height: 50px;position: relative;">
								</c:if>
							</c:if> --%>
	    						${s.orderSendNumbers}
								<c:if test="${state == 0}">
									<c:if test="${s.orderSendType == 1 && s.orderSendState == 4 }"><!--正接单被取消的专属单  -->
									<img style="width: 20px;height: 20px;float: right;margin-top: -10px;margin-right: -10px" alt="" src="img/veryteshu.png">
									</c:if>
									<c:if test="${s.orderSendType == 1 && s.orderSendState == 0 }"><!--正在发布的专属单  -->
									<img style="width: 20px;height: 20px;float: right;margin-top: -10px;margin-right: -10px" alt="" src="img/teshu.png">
									</c:if>
									<c:if test="${s.orderSendType == 0 && s.orderSendState == 0 }"><!--正在发布的普通单  -->
									<img style="width: 20px;height: 20px;float: right;margin-top: -10px;margin-right: -10px" alt="" src="img/putong.png">
									</c:if>
								</c:if>
							</div>
						</td>
						<td>${s.userName}</td>
						
						<td>${s.userNick}</td>
						
						<td style="text-align: left;">${s.orderSendServicecontent}</td>
						
						<td class="text-c">${s.orderSendUsername}</td>
						
						<c:if test="${s.orderSendSex == 1}">
							<td class="text-c">男</td>
						</c:if>
						<c:if test="${s.orderSendSex == 2}">
							<td class="text-c">女</td>
						</c:if>
						<c:if test="${s.orderSendSex == 0 || s.orderSendSex== null}">
							<td class="text-c">未知</td>
						</c:if>
						
						<td class="text-c">${s.orderSendAge}</td>
						
						<c:if test="${empty s.nurseName}">
							<td class="text-c">待接取</td>
						</c:if>
						<c:if test="${!empty s.nurseName}">
							<td class="text-c">${s.nurseName} </td>
						</c:if>
						
						<td class="text-c">${s.orderSendAddree}</td>
						
						<c:if test="${s.orderSendIspayment == 1}">
							<td class="td-status"><span class="label label-success radius">已支付</span></td>
						</c:if>
						<c:if test="${s.orderSendIspayment == 0}">
							<td class="td-status"><span class="label label-error radius">未支付</span></td>
						</c:if>
						
						<c:if test="${empty  s.orderSendState}">
							<td class="td-status"><span class="label label-error radius">待预约</span></td>
						</c:if> 
						<c:if test="${s.orderSendState == '0'}">
							<td class="td-status"><span class="label label-success radius">发布中</span></td>
						</c:if>
						<c:if test="${s.orderSendState == '1'}">
							<td class="td-status"><span class="label label-success radius">进行中</span></td>
						</c:if>
						<c:if test="${s.orderSendState == '2'}">
							<td class="td-status"><span class="label label-success radius">进行中</span></td>
						</c:if>
						
						<c:if test="${s.orderSendState == '3'}">
							<td class="td-status"><span class="label label-success radius">已完成</span></td>
						</c:if>
						<c:if test="${s.orderSendState == '8'}">
							<td class="td-status"><span class="label label-success radius">等待发放</span></td>
						</c:if>
						
						<!--待付款的订单  客服根据“服务内容”+“地址”+“时间”，与客户沟通（标准话术），做沟通记录，沟通后颜色背景标识-->
						 <c:if test="${state == 4 && s.orderSendOverone == '0'}">
							<td class="td-status"><a href="order-communicate-add.jsp?orderSendId=${s.orderSendId }&userId=${s.orderSendUserid}"><span class="label label-success radius">未沟通</span></a></td>
						</c:if>
						<c:if test="${state == 4 && s.orderSendOverone == '1'}">
							<td class="td-status"><a href="paymentCommunication.action?orderSendId=${s.orderSendId }&checkstate=1"><span class="label label-warning radius">修改沟通</span></a></td>
						</c:if> 
						
						
					<%-- 	<c:choose>
							<c:when test="${state == 4 && s.orderSendOverone == '0'}">
						        <td class="td-status"><a href="order-communicate-add.jsp?orderSendId=${s.orderSendId }&userId=${s.orderSendUserid}"><span class="label label-success radius">未沟通</span></a></td>
						       </c:when>
						       <c:when test="${state == 4 && s.orderSendOverone == '1'}">
						             <td class="td-status"><a href="paymentCommunication.action?orderSendId=${s.orderSendId }&checkstate=1"><span class="label label-warning radius">修改沟通</span></a></td>
						       </c:when>
						       <c:otherwise>
						             	<td>待用户确认或取消</td>
						       </c:otherwise>
						</c:choose> --%>
						
						<c:if test="${s.orderSendState == '4'}">
							<td nowrap="nowrap" class="td-status"><span class="label label-success radius">被取消</span>
							<c:if test="${s.cancelBeforeState == '0' }">
							(已接单被取消)
							</c:if>
							<c:if test="${s.cancelBeforeState == '1' }">
							(已沟通被取消)
							</c:if>
							<c:if test="${s.cancelBeforeState == '2' }">
							(已出发被取消)
							</c:if>
							<c:if test="${s.cancelBeforeState == '3' }">
							(开始服务被取消)
							</c:if>
							<c:if test="${s.cancelBeforeState == '4' }">
							(完成服务被取消)
							</c:if>
							<c:if test="${s.cancelBeforeState == '5' }">
							(发布中被取消)
							</c:if>
							</br>
							<c:if test="${state == 8 && s.orderCancalUserAgree== null }">
								待用户同意或取消
							</c:if>
							</td>
						</c:if>
						
						<c:if test="${state == 8 && s.orderCancalUserAgree== null }">
							<td class="td-status">待用户确认</td>
						</c:if> 
						
						<!--取消的订单：
							适用情况：客户取消订单
							护士申请取消，客户同意
							护士申请取消，客户未同意
						 -->
						<c:if test="${(state == 8 && s.complaintContentOver == '0') || (state == 5 && s.complaintContentOver == '0')}">
					 		<td class="td-status"><a href="TocancelOrdenComplaint.action?orderSendId=${s.orderSendId }&complaintSparetwo=0&state=${state}"><span class="label label-success radius">去处理</span></a></td>
						</c:if>
						<c:if test="${(state == 8 && s.complaintContentOver == '1') || (state == 5 && s.complaintContentOver == '1')}">
					 		<td class="td-status"><a href="TocancelOrdenComplaint.action?orderSendId=${s.orderSendId }&complaintSparetwo=0&state=${state}"><span class="label label-warning radius">修改处理</span></a></td>
						</c:if>
						<c:if test="${(state == 8 && s.complaintContentOver == '2') || (state == 5 && s.complaintContentOver == '2')}">
					 		<td class="td-status"><span class="label label-default radius">已处理</span></td>
						</c:if>
						
						<!--完成的订单：
						 -->
						<c:if test="${state == 2 && s.orderSendOvertwo == '0'}">
					 		<td class="td-status"><a href="TocancelOrdenComplaint.action?orderSendId=${s.orderSendId }&complaintSparetwo=1"><span class="label label-success radius">去处理</span></a></td>
						</c:if>
						<c:if test="${state == 2 && s.orderSendOvertwo == '1'}">
					 		<td class="td-status"><a href="TocancelOrdenComplaint.action?orderSendId=${s.orderSendId }&complaintSparetwo=1"><span class="label label-warning radius">修改处理</span></a></td>
						</c:if>
						<c:if test="${state == 2 && s.orderSendOvertwo == '2'}">
					 		<td class="td-status"><span class="label label-default radius">已处理</span></td>
						</c:if>
						
						
						
						<!-- 隐藏的时间域(订单开始时间) -->
						<input value="${s.orderSendBegintime}" id="createtime" type="hidden">
						<!-- 当前时间 -->
						<jsp:useBean id= "nowDate" class = "java.util.Date" />
						<c:set var="interval" value="${nowDate.time - s.orderSendCreatetime.time}"/>
						
						<c:if test="${state == 0 && (interval/1000/60)> Timing}">
						<td style="background-color: red;color: #FFFFFF">
							<%-- <input value="${interval/1000/60}" type="text"> --%>
							<fmt:formatDate  value="${s.orderSendCreatetime}" type="both"/><br>
							
							<a style="color: #FFFFFF;text-decoration: none;">距离现在<fmt:formatNumber value="${interval/1000/60}"    pattern="#0.0"/>分钟</a>
							
						</td>
						</c:if>
						<c:if test="${state == 0 && (interval/1000/60)< Timing}">
						<td>
							<%-- <input value="${interval/1000/60}" type="text"> --%>
							<fmt:formatDate  value="${s.orderSendCreatetime}" type="both"/><br>
						</td>
						</c:if>
						
						<c:if test="${state != 0 }">
						<td >
							<fmt:formatDate  value="${s.orderSendCreatetime}" type="both"/>
						</td>
						</c:if>
						
						<td class="td-manage">
						<c:if test="${state == 0}">
						</a> 
							<a style="text-decoration:none" class="ml-5" onclick="zhidNurse('${s.contentId}','${s.orderSendId }','${s.orderSendBegintime}','${s.orderSendState }','${s.orderSendType }')" href="javascript:;" title="指定护士">
							<img style="width: 12px;height: 12px" alt="" src="img/font-508.png">
						</a>
						</c:if>
						
						<a style="text-decoration:none" class="ml-5" onClick="picture_edit('订单详情','OrderInfoByOrderId.action?orderSendId=${s.orderSendId}&state=${state }','100001')" href="javascript:;" title="编辑">
							<i class="Hui-iconfont">&#xe6df;</i>
						</a> 
						<c:if test="${state ==6}">
						</a> 
							<a style="text-decoration:none" class="ml-5" onclick="member_add('去评价','order-evaluate-go.jsp?ordersendId=${s.orderSendId}&nurseId=${s.nurseId }&userId=${s.userId }','','510')" href="javascript:;" title="去评价">
							<img style="width: 12px;height: 12px" alt="" src="images/navigate-right.png">
						</a>
						</c:if>
						<c:if test="${state ==7}">
						</a> 
							<a style="text-decoration:none" class="ml-5" onclick="RebateSend(this,'${s.orderSendId}')" href="javascript:;" title="返利红包">
							<img style="width: 12px;height: 12px" alt="" src="images/red-packets.png">
						</a>
						</c:if>
						<c:if test="${state == 5 }">
						</a> 
							<a style="text-decoration:none" class="ml-5" onclick="RefundMoney(this,'${s.orderSendId}')" href="javascript:;" title="退款">
							<img style="width: 12px;height: 12px" alt="" src="img/refund.png">
						</a>
						</c:if>
						<c:if test="${state == 8 }">
							</a> 
								<a style="text-decoration:none" class="ml-5" onclick="RefundMoney(this,'${s.orderSendId}')" href="javascript:;" title="退款">
								<img style="width: 12px;height: 12px" alt="" src="img/refund.png">
							</a>
							</a> 
							<a style="text-decoration:none" class="ml-5" onclick="zhidNurse('${s.contentId}','${s.orderSendId }')" href="javascript:;" title="指定护士">
								<img style="width: 12px;height: 12px" alt="" src="img/font-508.png">
							</a>
							<a style="text-decoration:none" class="ml-5" onclick="huanyuan(this,'${s.orderSendId }')" href="javascript:;" title="还原订单取消前状态">
								<img style="width: 12px;height: 12px" alt="" src="img/redo.png">
							</a>
						</c:if>
						
						</td>
					</tr>
					<input value="${s.handleMode }" type="hidden" id="handleMode${s.orderSendId }"/>
					<input value="${s.orderSendOvertwo }" type="hidden" id="orderSendOvertwo${s.orderSendId }"/>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<div style="text-align: center;" class="bs-example" data-example-id="simple-pagination">
    <nav>
      <ul class="pagination">
       
        <c:if test="${pageNow > 1}">
         <li style="float:left">
          <a href="${pageContext.request.contextPath}/OrderList.action?pageNow=${pageNow-1}&state=${state}" aria-label="Previous">
            <span aria-hidden="true">«</span>
          </a>
         </li>
        </c:if>
       <c:forEach begin="${start}" end="${end}" var="p">
	       <c:if test="${p == pageNow && p != 0 }">
	         <li><a style="color: red;">${p}</a></li>
		   </c:if>
		   <c:if test="${p != pageNow && p != 0 }">
	         <li><a href="${pageContext.request.contextPath}/OrderList.action?pageNow=${p}&state=${state}">${p}</a></li>
	       </c:if>
       </c:forEach> 
       <c:if test="${totalPage > pageNow}">
        <li>
          <a href="${pageContext.request.contextPath}/OrderList.action?pageNow=${pageNow+1}&state=${state}" aria-label="Next">
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
/* $("#minute").blur(function(){
  alert("失去了焦点");
});
 */
/* $("#minute").onkeyup(function(){
  alert("失去了焦点");
}); */
//即时获取事件
$('#minute').bind('input propertychange', function() {
//获取输入框的值
var minute = $("#minute").val();
alert(minute);  
}); 
</script>
<script type="text/javascript">
// 选项卡事件
function orderState(state){
//alert(state);
	location.href = "${pageContext.request.contextPath}/OrderList.action?state="+state;
/* 	var osel1=document.getElementById("selected"); 
    var opts1=osel1.getElementsByTagName("option");
		var i;	for(i=0;i<osel1.length;i++){
			if(opts1[i].value==state){
				//alert(opts[i].value);
				opts1[i].selected=true;	
	}
	} */
}
function test1(){
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
test1();


function checkstate(){
var selectVal = $('#selectVal').val();
if(selectVal == 666){
layer.msg('退款成功!',{icon: 6,time:1000});
}
if(selectVal == 555){
layer.msg('请对订单记录之后再做操作!',{icon: 6,time:1000});
}
if(selectVal == 444){
layer.msg('发生了不可预知的错误,请联系后台管理员!',{icon: 6,time:1000});
}
if(selectVal == 888){
layer.msg('您的记录与操作不符,请修改正确再操作!',{icon: 6,time:1000});
}
}
checkstate();
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
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">发布中</span>');
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
/*图片-下架*/
function picture_stop(obj,id){
	layer.confirm('确认要下架吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="picture_start(this,id)" href="javascript:;" title="发布"><i class="Hui-iconfont">&#xe603;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已下架</span>');
		$(obj).remove();
		layer.msg('已下架!',{icon: 5,time:1000});
	});
}
/*去评价*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}

/*指定护士*/
function zhidNurse(id,orderSendId,createtime,orderSendState,orderSendType){
//获取当前的时间
//获取用户订单的开始时间
/* var createtime = $("#createtime").val(); */
var createtimes = new Date(createtime).getTime();
var mytime=new Date().getTime();

var aa = "#handleMode"+orderSendId;
var bb = "#orderSendOvertwo"+orderSendId; 
var handleMode = $(aa).val();
var orderSendOvertwo = $(bb).val();
//判断订单的状态
if(orderSendState == '0' || (orderSendState=='4' && orderSendType == '1')){
}else{
if(orderSendOvertwo == 0){
layer.msg('请对订单记录之后再做操作!',{icon: 5,time:1000});
return;
}
if(handleMode !=1){
layer.msg('您的记录与操作不符,请修改正确再操作!',{icon: 5,time:1000});
return;
}
}

//alert("订单开始时间="+createtime);
//alert("当前时间="+mytime);
var cuo = mytime - createtimes;
if((mytime - createtimes) > 0){
	alert("请修改订单的开始时间再分配护士")
}else{
	location.href = "${pageContext.request.contextPath}/selectNurseInfoByGoodId.action?newcontentid=" + id+"&orderSendId="+orderSendId+"&orderSendType="+orderSendType;
}

	
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


/*给护士发返利红包*/
function RebateSend(obj,id){
	layer.confirm('确认要发送返利红包吗？', function (index) {
            //此处请求后台程序，下方是成功后的前台处理……
            location.href = "${pageContext.request.contextPath}/RebateSendl.action?orderSendId=" + id;
            $(obj).parents("tr").remove();
            layer.msg('发放成功!', {icon: 1, time: 1000});
        });
}

function RefundMoney(obj,id){
var aa = "#handleMode"+id;
var bb = "#orderSendOvertwo"+id; 
var handleMode = $(aa).val();
var orderSendOvertwo = $(bb).val();


/* var orderSendOvertwo = $("#orderSendOvertwo").val(); 
var handleMode = $("#handleMode").val();
*/
var selectVal = $("#selectVal").val();


if(orderSendOvertwo == 0){
		layer.msg('请对订单记录之后再做操作!',{icon: 5,time:1000});
		return;
		}
		if(handleMode !=0){
		layer.msg('您的记录与操作不符,请修改正确再操作!',{icon: 5,time:1000});
		return;
	}

	layer.confirm('确认要退款该订单？', function (index) {
	
	
            //此处请求后台程序，下方是成功后的前台处理……
             $.ajax({
					url: "${pageContext.request.contextPath}/RefundMoney.action",              //请求地址
			        type: "GET",                       //请求方式
			        data: { "orderSendId": id},        //请求参数
			        dataType: "json",
			        success: function (date) {
				        if(date==888){
				        layer.msg('您的记录与操作不符,请修改正确再操作!', {icon: 5, time: 1500});
				        //location.href = "${pageContext.request.contextPath}/OrderList.action?state=0";
				        }else if(date==555){
				         layer.msg('请对订单记录之后再做操作!', {icon: 5, time: 1500});
				        }else if(date==444){
				         layer.msg('发生了不可预知的错误,请联系后台管理员!', {icon: 5, time: 1500});
				        }else if(date==666){
				         layer.msg('退款成功!', {icon: 5, time: 1500});
				         $(obj).parents("tr").remove();
				        }else{
				        	layer.msg('发生了不可预知的错误,请联系后台管理员!', {icon: 5, time: 1500});
				        }
			        },
			        fail: function (status) {
       				}
				  });
        });
}

function huanyuan(obj,id){
/* var orderSendOvertwo = $("#orderSendOvertwo").val();
var handleMode = $("#handleMode").val(); */
var aa = "#handleMode"+id;
var bb = "#orderSendOvertwo"+id; 
var handleMode = $(aa).val();
var orderSendOvertwo = $(bb).val();

if(orderSendOvertwo == 0){
layer.msg('请对订单记录之后再做操作!',{icon: 5,time:1000});
return;
}
if(handleMode !=2){
layer.msg('您的记录与操作不符,请修改正确再操作!',{icon: 5,time:1000});
return;
}
	layer.confirm('确认要还原成取消前的订单？', function (index) {
           $.ajax({
					url: "${pageContext.request.contextPath}/huanyuanOrderSend.action",              //请求地址
			        type: "POST",                       //请求方式
			        data: { "orderSendId": id},        //请求参数
			        dataType: "json",
			        success: function (date) {
				        if(date==0){
				        layer.msg('还原成功!', {icon: 6, time: 1500});
				        //location.href = "${pageContext.request.contextPath}/OrderList.action?state=0";
				         $(obj).parents("tr").remove();
				        }else {
				        layer.msg('还原失败!', {icon: 5, time: 1500});
				        }
			        },
			        fail: function (status) {
       				}
				  });
        });
}
//判断是不是已过期
</script>
</body>
</html>