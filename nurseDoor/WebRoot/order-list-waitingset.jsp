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
	<style>
.btn-switch label{
	position: absolute;
	width: 150px;
	height: 44px;
	line-height: 44px;
	border-radius: 20px;
	background: darkGray;
	
	box-shadow: inset 0 3px 8px 1px rgba(0,0,0,.4),
		0 1px 0 0 rgba(255,255,255,.5);
	cursor: pointer;
}
.btn-switch span::before{
	content: " ";
	position:absolute;
	width: 90px;
	height: 46px;
	background:linear-gradient( #F7F2F6, #B2AC9E );
	box-shadow: 0 0 8px rgba(0, 0, 0, 0.3), 
		0 5px 5px rgba(0, 0, 0, 0.2);
	border-radius: 24px;
	left: -2px;
	top: -1px;
}
.btn-switch span::after{
	content: " ";
	position: absolute;
	width: 66px;
	height: 24px;
	left: 10px;
	top: 10px;
	border-radius: 12px;
	background: linear-gradient( #CBC7BC, #D2CBC3 );
}
.btn-switch label::before{
	font-family: Helvetica, Arial, sans-serif;
	font-size: 22px;
	font-weight: bold;
	text-transform: uppercase;
	text-shadow: 0 -1px 0 rgba(0,0,0,.7),
		0 1px 0 rgba(255,255,255,.8);
	position: absolute;
	content: 'off';
	color: dimgrey;
	left: auto;
	right: 10%;
}
.btn-switch input:checked+label{
	background: rgba(144,238,144,.8);
}
.btn-switch input:checked~label span::before{
	right: -2px;
	left: auto;
}
.btn-switch input:checked~label span::after{
	right: 10px;
	left: auto;
}
.btn-switch input:checked~label::before{
	content: 'on';
	color: rgba(46,139,87,.8);
	right: auto;
	left: 10%;
}


.btn-shiny::before,
.btn-shiny:hover::after,
</style>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link></head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 订单管理 <span class="c-gray en">&gt;</span> 订单列表 <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
<form action="${pageContext.request.contextPath}/OrderKeyWordList.action" method="post">
	
	<div class="text-c"> <!--日期范围：
		 <input type="text" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'logmax\')||\'%y-%M-%d\'}'})" id="logmin" name="logmin" class="input-text Wdate" style="width:120px;">
		-
		<input type="text" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'logmin\')}',maxDate:'%y-%M-%d'})" id="logmax" name="logmax" class="input-text Wdate" style="width:120px;">
		 -->
		<input type="text" name="number" id="" value="${number}" placeholder="请输入订单的单号,发布人的账号" style="width:250px" class="input-text">
		<button name="" id="" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i>搜订单</button>
		
	</div>
</form>	
<input type="hidden" id="openstate" value="${switchstate }"/>
		<div class='row' style="float: right;margin-right: 20%;margin-top: -2.5%">
			<div class='btn-switch'>
				<input type='checkbox' id='switch' name ="checkbox" style="display: none">
				<label for='switch' onclick="switchinp()"><span></span></label>
			</div> 
		</div>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> 
		<span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius">
		<i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> 
		<!-- <a class="btn btn-primary radius" onclick="picture_add('添加图片','picture-add.html')" href="javascript:;">
		<i class="Hui-iconfont">&#xe600;</i> 
		添加图片
		</a> -->
		</span> 
	<span class="r">共有数据：
	<c:if test="${empty count}">
	<strong>0</strong> 
	</c:if>
	<c:if test="${!empty count}">
	<strong>${count}</strong> 
	</c:if>
	条</span> </div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-bg table-hover table-sort">
			<thead>
				<tr class="text-c">
					<th width="40"><input name="" type="checkbox" value=""></th>
					<th width="80">单号</th>
					<th width="80">发布人账号</th>
					<th width="80">发布人昵称</th>
					<!-- <th width="100">服务项目</th> -->
					<th width="120">服务项目</th>
					<th width="50">受护人</th>
					<th width="50">服务对象性别</th>
					<th width="50">服务对象年龄</th>
					<th width="50">护士账号</th>
					<th width="50">服务地址</th>
					<th width="60">支付状态</th>
					<th width="60">发布状态</th>
					<th width="80">发布时间</th>
					<th width="100">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="s">
					<tr class="text-c">
						<td><input name="" type="checkbox" value=""></td>
						
						<td>${s.orderSendNumbers}</td>
						
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
						
						<td class="td-status"><span class="label label-error radius">等待发放</span></td>
						
						
						<td >
							<fmt:formatDate value="${s.orderSendCreatetime}" type="both"/>
						</td>
						
						<td class="td-manage">
						<a style="text-decoration:none" class="ml-5" onclick="OrderListWaitAgree(this,'${s.orderSendId}','${pageNow }')" href="javascript:;" title="发放订单">
							<img style="width: 12px;height: 12px" alt="" src="img/accept.png">
						</a>
						<a style="text-decoration:none" class="ml-5" onClick="picture_edit('订单详情','OrderInfoByOrderId.action?orderSendId=${s.orderSendId}','100001')" href="javascript:;" title="编辑">
							<i class="Hui-iconfont">&#xe6df;</i>
						</a> 
							<a style="text-decoration:none" class="ml-5" onClick="picture_del(this,'10001')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i>
						</a>
							
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
          <a href="${pageContext.request.contextPath}/OrderListWaitSet.action?pageNow=${pageNow-1}&state=${state}" aria-label="Previous">
            <span aria-hidden="true">«</span>
          </a>
         </li>
        </c:if>
       <c:forEach begin="${start}" end="${end}" var="p">
	       <c:if test="${p == pageNow}">
	         <li><a style="color: red;">${p}</a></li>
		   </c:if>
		   <c:if test="${p != pageNow}">
	         <li><a href="${pageContext.request.contextPath}/OrderListWaitSet.action?pageNow=${p}&state=${state}">${p}</a></li>
	       </c:if>
       </c:forEach> 
       <c:if test="${totalPage > pageNow}">
        <li>
          <a href="${pageContext.request.contextPath}/OrderListWaitSet.action?pageNow=${pageNow+1}&state=${state}" aria-label="Next">
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

<!-- <script type="text/javascript">
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
</script> -->
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


/*发出订单*/
function OrderListWaitAgree(obj,id,pageNow){
	layer.confirm('确认要发出该订单？', function (index) {
            //此处请求后台程序，下方是成功后的前台处理……
            location.href = "${pageContext.request.contextPath}/OrderListWaitAgree.action?orderSendId=" + id+"&pageNow="+pageNow;
            $(obj).parents("tr").remove();
            layer.msg('已发放!', {icon: 1, time: 1000});
        });
}

function RefundMoney(obj,id){
	layer.confirm('确认要发送返利红包吗？', function (index) {
            //此处请求后台程序，下方是成功后的前台处理……
            location.href = "${pageContext.request.contextPath}/RefundMoney.action?orderSendId=" + id;
            $(obj).parents("tr").remove();
            layer.msg('已退款!', {icon: 1, time: 1000});
        });
}
//开关
function switchinp(){
var swt = "";
if(document.getElementById("switch").checked){
   swt = 1;
}else{
	swt = 0
}
//alert(swt);
//location.href = "${pageContext.request.contextPath}/updateSwitchOpen.action?openState="+swt;
$.ajax({
		url: "${pageContext.request.contextPath}/updateSwitchOpen.action",              //请求地址
        type: "POST",                       //请求方式
        data: { openState: swt},        //请求参数
        dataType: "json",
        success: function (date) {
        if(date==0){
        layer.msg('机器人小护开始工作了!', {icon: 6, time: 1500});
        }else{
        layer.msg('机器人小护开始休息了!', {icon: 5, time: 1500});
        }
        },
        fail: function (status) {
        }

});
}

function open(){
var openstate = $("#openstate").val();
var boxes = document.getElementById("switch");
if(openstate==0){
boxes.checked = true;
}else{
boxes.checked = false;
}
}
open();
</script>
</body>
</html>