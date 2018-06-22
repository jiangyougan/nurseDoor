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
<link href="lib/icheck/icheck.css" rel="stylesheet" type="text/css" />
<link href="lib/Hui-iconfont/1.0.7/iconfont.css" rel="stylesheet" type="text/css" />
<link href="lib/webuploader/0.1.5/webuploader.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script> 
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script>
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script> 
<script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 

<!-- 时间控件 -->
	<link rel="stylesheet" type="text/css" href="src/DateTimePicker.css" />
		<script type="text/javascript" src="src/DateTimePicker.js"></script>
<title>详细信息</title>
<style type="text/css">
*{font-family:Microsoft YaHei,"微软雅黑",宋体,Courier New !important;color:black !important;}
</style>
</head>
<body >
<div class="pd-20">
	<form action="" method="post" class="form form-horizontal" id="form-article-add">
	<!-- 订单信息 -->
	<!--订单Id  -->
	<input type="hidden" value="${andOrderSend.orderSendId}" id="orderSendId">
	<div class="row cl">
				<label style="font-size: 20px" class="form-label col-5">订单信息</label>
	</div>
	<div class="row cl">
		<label class="form-label col-2"><span class="c-red">*</span>订单单号：</label>
		<div class="formControls col-6">
			<input type="text" class="input-text" value="${andOrderSend.orderSendNumbers}" placeholder="" id="orderSendNumbers" name="orderSendNumbers" style="cursor:not-allowed" disabled>
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-2">订单创建人：</label>
		<div class="formControls col-6">
			<input type="text" class="input-text" value="${andOrderSend.orderSendUserid}" placeholder="" id="orderSendUserid" name="orderSendUserid" style="cursor:not-allowed" disabled><u style="cursor:pointer" class="text-primary" onclick="member_show('个人信息','user-info-descripe.jsp?userId=${userId}','360','400')"><img alt="" src="images/search-icon.png" style="height: 30px;height: 30px;float: right;"> </u>
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-2"><span class="c-red">*</span>服务项目：</label>
		<div class="formControls col-2">
			<input type="text" class="input-text" value="${andOrderSend.orderSendServicecontent}" placeholder="" id="orderSendServicecontent" name="orderSendServicecontent" style="cursor:not-allowed" disabled >
		</div>
	</div>
		
	<div class="row cl">
		<label class="form-label col-2">受护人名字：</label>
		<div class="formControls col-2">
			<input type="text" class="input-text" value="${andOrderSend.orderSendUsername}" placeholder="" id="orderSendUsername" name="orderSendUsername" style="cursor:not-allowed" disabled>
		</div>
		<label class="form-label col-2">受护人身份证：</label>
		<div class="formControls col-2">
			<input type="text" class="input-text" value="${andOrderSend.orderSendCard}" placeholder="" id="orderSendCard" name="orderSendCard" style="cursor:not-allowed" disabled>
		</div>
	</div>
			
	<div class="row cl">
		<label class="form-label col-2">受护人性别：</label>
		<div class="formControls col-2">
		<c:if test="${andOrderSend.orderSendSex == 1}">
			<input type="text" class="input-text" value="男" placeholder="" id="orderSendSex" name="orderSendSex" style="cursor:not-allowed" disabled>
		</c:if>
		<c:if test="${andOrderSend.orderSendSex == 2}">
			<input type="text" class="input-text" value="女" placeholder="" id="orderSendSex" name="orderSendSex" style="cursor:not-allowed" disabled>
		</c:if>
		<c:if test="${andOrderSend.orderSendSex == null || andOrderSend.orderSendSex == 0}">
			<input type="text" class="input-text" value="未知" placeholder="" id="orderSendSex" name="orderSendSex" style="cursor:not-allowed" disabled>
		</c:if>
			
		</div>
		<label class="form-label col-2">受护人年龄：</label>
		<div class="formControls col-2">
			<input type="text" class="input-text" value="${andOrderSend.orderSendAge}" placeholder="" id="orderSendAge" name="orderSendAge" style="cursor:not-allowed" disabled>
		</div>
	</div>
		
	<div class="row cl">
		<label class="form-label col-2">订单对象图片：</label>
		<div class="formControls ">
			<img alt="" src="" style="width: 120px;height: 120px">
			<img alt="" src="" style="width: 120px;height: 120px">
			<img alt="" src="" style="width: 120px;height: 120px">
		</div>
	</div>
		
	<div class="row cl">
		<label class="form-label col-2">订单备注：</label>
			<div class="formControls col-6">
				<!-- <input type="text" class="input-text" value="0" placeholder="" id="" name="" style="cursor:not-allowed" disabled> -->
		<textarea name="orderSendNote" id="orderSendNote"  cols="" rows="" class="textarea"  placeholder="" >${andOrderSend.orderSendNote}</textarea>
		</div>
	</div>
		
	<div class="row c">
			<label class="form-label col-2">优惠券：</label>
			<div class="formControls col-2">
				<input type="text" class="input-text" value="${andOrderSend.orderSendCoupon}" placeholder="" id="orderSendCoupon" name="orderSendCoupon" style="cursor:not-allowed" disabled>
			</div>
	</div>
		
		<div class="row cl">
			<label class="form-label col-2">保险费：</label>
			<div class="formControls col-1">
				<input type="text" class="input-text" value="${andOrderSend.orderSendSavemoney}" placeholder="" id="orderSendSavemoney" name="orderSendSavemoney" style="cursor:not-allowed" disabled>
			</div>
			
			<label class="form-label col-0">交通费：</label>
			<div class="formControls col-1">
				<input type="text" class="input-text" value="${andOrderSend.orderSendTrafficmoney}" placeholder="" id="orderSendTrafficmoney" name="orderSendTrafficmoney" style="cursor:not-allowed" disabled>
			</div>
			
			<label class="form-label col-0">服务费：</label>
			<div class="formControls col-1">
				<input type="text" class="input-text" value="${andOrderSend.orderSendCostmoney}" placeholder="" id="orderSendCostmoney" name="orderSendCostmoney" style="cursor:not-allowed" disabled>
			</div>

			<label class="form-label col-0">总费用：</label>
			<div class="formControls col-1">
				<input type="text" class="input-text" value="${andOrderSend.orderSendTotalmoney}" placeholder="" id="orderSendTotalmoney" name="orderSendTotalmoney" style="cursor:not-allowed" disabled>
			</div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>开始时间：</label>
			<div class="formControls col-2">
			<%-- <fmt:formatDate value="${s.orderSendCreatetime}" type="both"/> --%>
				旧的<input formtarget="formatDate"  value="<fmt:formatDate value="${andOrderSend.orderSendBegintime}" type="both"/>"  type="text" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}'})" id="orderSendBegintime" name="orderSendBegintime" class="input-text Wdate"  style="cursor:not-allowed" disabled>
				新的<!-- <input type="text" id="datetime" name="datetime" placeholder="如果要修改请选择" class="ui_timepicker input-text" value=""> -->
					<input type="text" class="input-text" id="datetime" data-field="datetime" readonly>
					<div id="dtBox"></div>
			
			</div>
			<%-- <label class="form-label col-2"><span class="c-red">*</span>取消人：</label>
			<div class="formControls col-2">
				<input  formtarget="formatDate" value="<fmt:formatDate value="${andOrderSend.orderSendStoptime}" type="both"/>"  type="text" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'#F{$dp.$D(\'datemin\')}'})" id="orderSendStoptime" name="orderSendStoptime" class="input-text Wdate">
			</div> --%>
		</div>
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>接单时间：</label>
			<div class="formControls col-2">
				<input formtarget="formatDate" value="<fmt:formatDate value="${andOrderSend.orderSendGetOrderTime}" type="both"/>"  type="text" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}'})" id="orderSendGetOrderTime" name="orderSendGetOrderTime" class="input-text Wdate" style="cursor:not-allowed" disabled>
			</div>
			
			<label class="form-label col-2"><span class="c-red">*</span>完成时间：</label>
			<div class="formControls col-2">
			<input formtarget="formatDate" value="<fmt:formatDate value="${andOrderSend.orderSendFinishOrderTime}" type="both"/>"  type="text" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'#F{$dp.$D(\'datemin\')}'})" id="orderSendCreatetime" name="orderSendCreatetime" class="input-text Wdate" style="cursor:not-allowed" disabled>
			</div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>订单创建时间：</label>
			<div class="formControls col-2">
				<input formtarget="formatDate" value="<fmt:formatDate value="${andOrderSend.orderSendCreatetime}" type="both"/>"  type="text" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'#F{$dp.$D(\'datemin\')}'})" id="orderSendCreatetime" name="orderSendCreatetime" class="input-text Wdate" style="cursor:not-allowed" disabled>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>订单状态：</label>
			<div class="formControls col-2">
			<c:if test="${andOrderSend.orderSendState ==0}">
				<input type="text" class="input-text" value="发布中" placeholder="" id="orderSendCostmoney" name="orderSendCostmoney" style="cursor:not-allowed" disabled>
			</c:if>
			<c:if test="${andOrderSend.orderSendState ==1 || andOrderSend.orderSendState ==2}">
				<input type="text" class="input-text" value="进行中" placeholder="" id="orderSendCostmoney" name="orderSendCostmoney" style="cursor:not-allowed" disabled>
			</c:if>
			<c:if test="${andOrderSend.orderSendState ==3}">
				<input type="text" class="input-text" value="已完成" placeholder="" id="orderSendCostmoney" name="orderSendCostmoney" style="cursor:not-allowed" disabled>
			</c:if>
			<c:if test="${andOrderSend.orderSendState ==3}">
				<input type="text" class="input-text" value="已完成" placeholder="" id="orderSendCostmoney" name="orderSendCostmoney" style="cursor:not-allowed" disabled>
			</c:if>
			<c:if test="${andOrderSend.orderSendState ==4}">
				<input type="text" class="input-text" value="被取消" placeholder="" id="orderSendCostmoney" name="orderSendCostmoney" style="cursor:not-allowed" disabled>
			</c:if>
			<c:if test="${andOrderSend.orderSendState ==5}">
				<input type="text" class="input-text" value="待预约" placeholder="" id="orderSendCostmoney" name="orderSendCostmoney" style="cursor:not-allowed" disabled>
			</c:if>
			</div>
		</div>
		<div class="row cl">
			<c:if test="${andOrderSend.orderSendStoptime ==0}">
				<label class="form-label col-2"><span class="c-red">*</span>取消对象：</label>
				<div class="formControls col-2">
						<input type="text" class="input-text" value="用户" placeholder="" id="orderSendCostmoney" name="orderSendCostmoney" style="cursor:not-allowed" disabled>
				</div>
			</c:if>	
			<c:if test="${andOrderSend.orderSendStoptime ==1}">
				<label class="form-label col-2"><span class="c-red">*</span>取消对象：</label>
				<div class="formControls col-2">
						<input type="text" class="input-text" value="护士" placeholder="" id="orderSendCostmoney" name="orderSendCostmoney" style="cursor:not-allowed" disabled>
				</div>
			</c:if>	
		</div>
			<!-- 接单信息 -->
			<div class="row cl">
				<label style="font-size: 20px" class="form-label col-5">接单信息</label>
			</div>
			<div class="row cl">
				<label  class="form-label col-2">护士账号：</label>
				<div class="formControls col-2">
					<input type="text" class="input-text" value="${andOrderSend.nurseName}" placeholder="" id="NurseName" name="nurseNick" style="cursor:not-allowed" disabled>
				</div>
			</div>
			
			<div class="row cl">
				<label class="form-label col-2">护士昵称：</label>
				<div class="formControls col-2">
					<input type="text" class="input-text" value="${andOrderSend.nurseNick}" placeholder="" id="nurseNick" name="nurseNick" style="cursor:not-allowed" disabled>
				</div>
			</div>
		
		<div class="row cl">
			<div class="col-10 col-offset-2">
				<button onClick="article_save_submit();" class="btn btn-primary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 保存并提交审核</button>
				<button onclick="self.location=document.referrer;" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
				<c:if test="${state == '8' || state == '0'}">
					<button  onclick="zhidNurse('${andOrderSend.contentId}','${andOrderSend.orderSendId }','${andOrderSend.orderSendBegintime}','${andOrderSend.orderSendState }','${andOrderSend.orderSendType }')" href="javascript:;" class="btn btn-primary radius" type="button"><i class="Hui-iconfont">&#xe630;</i> 指定护士</button>
				</c:if>
			</div>
		</div>
	</form>
</div>
</body>
<script type="text/javascript">
function article_save_submit(){
layer.confirm("确认要修改吗？",function(index){
//订单Id
var orderSendId = $("#orderSendId").val();
	//选择的时间
	var choseTime = $("#datetime").val();
	//alert("选择的时间="+choseTime)
	var datetime =new Date(choseTime);
	//当前时间
	var newDate = new Date();
		if(choseTime==null || choseTime==""){
			layer.msg('开始时间不能为空!',{icon: 5,time:2000});
		}else{
			if(datetime<newDate){
					layer.msg('开始时间不能小于当前时间!',{icon: 5,time:2000});
				}else{
					/* $("#form-article-add").submit(); */
					$.ajax({
						url: "${pageContext.request.contextPath}/updateOrderSendInfoBuKefu.action",              //请求地址
				        type: "POST",                       //请求方式
				        data: { orderSendId: orderSendId,choseTime: choseTime},        //请求参数
				        dataType: "json",
				        success: function (date) {
					        if(date==0){
					        layer.msg('修改成功!', {icon: 6, time: 1500});
					        //location.href = "${pageContext.request.contextPath}/OrderList.action?state=0";
					        }else {
					        layer.msg('修改失败!', {icon: 5, time: 1500});
					        }
				        },
				        fail: function (status) {
        				}
				  });
			  }	
		}
	});
}


/*用户-查看*/
function member_show(title,url,w,h){
	layer_show(title,url,w,h);
}



/*指定护士*/
function zhidNurse(id,orderSendId,createtime,orderSendState,orderSendType){
//获取当前的时间
//获取用户订单的开始时间
/* var createtime = $("#createtime").val(); */
var createtimes = new Date(createtime).getTime();
var mytime=new Date().getTime();
var orderSendOvertwo = $("#orderSendOvertwo").val();
var handleMode = $("#handleMode").val();
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
</script>
<script type="text/javascript">
		
			$(document).ready(function()
			{
				$("#dtBox").DateTimePicker(
				{
					dateFormat: "yyyy-MM-dd",
					dateTimeFormat: "yyyy-MM-dd HH:mm:ss",
					timeFormat: "HH:mm",
					shortDayNames: ["日", "一", "二", "三", "四", "五", "六"],
					fullDayNames: ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"],
					shortMonthNames: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
					fullMonthNames:  ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],			
					titleContentDate: "设置日期",
					titleContentTime: "设置时间",
					titleContentDateTime: "设置日期和时间",					
					buttonsToDisplay: ["HeaderCloseButton", "SetButton", "ClearButton"],
					setButtonContent: "确定",
					clearButtonContent: "取消"
				});
			});
		
		</script>
</html>