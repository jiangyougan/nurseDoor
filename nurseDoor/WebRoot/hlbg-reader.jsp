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
     String webPath = basePath.substring(0, basePath.length()-10);
	%>
<html id="html">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<link rel="stylesheet" type="text/css" href="css/magic-check.css">
	<title>护理报告</title>
	<style type="text/css">
.demo{width:100%;padding:8px;background:#FFFFFF}
.demo h3{font-size:1.5em;line-height:1.9em}

.col h4{height:28px;line-height:28px;margin:0;}
.opt{height:30px;line-height:24px}
</style>
	<style>
	.html
	{
	    /*font-family: sans-serif;*/
	    width: 50%;
	    margin-left: 25%
	}

	body
	{
	    margin: 0;
	}


	[hidden],
	template
	{
	    display: none;
	}

	a
	{
	    background: transparent;
	}

	a:active,
	a:hover
	{
	    outline: 0;
	}

	b,
	strong
	{
	    font-weight: bold;
	}

	img
	{
	    border: 0;
	}

	button,
	input,
	optgroup,
	select,
	textarea
	{
	    font: inherit;

	    margin: 0;

	    color: inherit;
	    
	}

	button
	{
	    overflow: visible;
	}

	button,
	select
	{
	    text-transform: none;
	    appearance:none;
	  -moz-appearance:none;
	  -webkit-appearance:none;
	  border:none;
	}

	button,
	html input[type='button'],
	input[type='reset'],
	input[type='submit']
	{
	    cursor: pointer;

	    -webkit-appearance: button;
	}

	button[disabled],
	html input[disabled]
	{
	    cursor: default;
	}

	input
	{
	    line-height: normal;
	}

	input[type='checkbox'],
	input[type='radio']
	{
	    box-sizing: border-box;
	    padding: 0;
	}

	input[type='number']::-webkit-inner-spin-button,
	input[type='number']::-webkit-outer-spin-button
	{
	    height: auto;
	}

	input[type='search']
	{
	    -webkit-box-sizing: content-box;
	            box-sizing: content-box;

	    -webkit-appearance: textfield;
	}

	input[type='search']::-webkit-search-cancel-button,
	input[type='search']::-webkit-search-decoration
	{
	    -webkit-appearance: none;
	}



	textarea
	{
	    overflow: auto;
	}



	*
	{
	    -webkit-box-sizing: border-box;
	            box-sizing: border-box;

	    -webkit-user-select: none;

	    outline: none;

	    -webkit-tap-highlight-color: transparent;
	    -webkit-tap-highlight-color: transparent;
	}

	body
	{
	    font-family: "microsoft yahei",sans-serif;
	    font-size: 17px;
	    line-height: 21px;
	    color: #000;
	    background-color: #efeff4;
	    -webkit-overflow-scrolling: touch;
	    padding-bottom: 44px;
	}
	ul{
		list-style: none;
		margin:0;
		padding: 0;
	}
	.list{
		margin-bottom: 10px;
	}
	.list .item{
		border-bottom: 1px solid #ddd;
		padding: 10px;
		background: #fff;
	}
	.list .item label{

	}
	.list .item input{
		border:none;
		padding: 0;
		line-height: 22px;
		font-family: "microsoft yahei",sans-serif;
	}
	.title{
		padding: 10px 10px;
		background: #af589c;
		color: #fff;
	}
	h5{
		margin:0;
		font-weight: normal;
		font-size: 17px;
		border-left: 3px solid #fff;
		padding-left: 10px;
	}
	.imgList{
		overflow: hidden;
	}
	.imgList li{
		float: left;
		/* width: 32%; */
		margin-right: 5px;
		margin-bottom: 5px;
	}
	.imgList li:nth-child(3n){
		margin-right: 0;
	}
	.imgList li img{
		/* width: 100%;
		height: 100%; */
		display: block;
	}
	.list1{
		margin-bottom: 10px;

	}
	.list1 .item1{
		border-bottom: 1px solid #ddd;
		padding: 10px;
		background: #fff;
		overflow: hidden;
	}
	.list1 .item1 .item-1{
		width: 50%;
		float: left;
		position: relative;
		padding-left: 45px;
	}
	.list1 .item1 .item-1 label{
		position: absolute;
		left: 0;top: 1px;
	}
	.list1 .item1 .item-1 input{
		border:none;
		display: block;
		width: 100%;
		line-height: 21px;
	}
	.radio_box{ display:inline-block; position:relative;margin-right: 10px;}
	.radio_box label{ width:15px; height:15px; position:absolute; top:3px; left:0; border:2px solid #af589c; border-radius:50%; background:#fff; cursor:pointer;}
	.radio_box input:checked + label:after{ content:''; width:9px; height:9px; position:absolute; top:1px; left:1px; background:#af589c; border-radius:50%;}
	.radio_box em{ margin:0 0 0 5px;font-style: normal;}

	.btn{
		border:2px solid #af589c;
		background: none;
		color: #000;
		border-radius: 6px;
		padding: 4px 10px;
		font-size: 14px;
	}
	.btn.selected{
		background: url(images/1.png) no-repeat right bottom;
	}
	footer{
		height: 44px;
		background: #af589c;
		line-height: 44px;
		color: #fff;
		text-align: center;
		position: fixed;
		bottom: 0;
		width: 100%;
	}
	</style>
<script type="text/javascript" src="js/jquery.min.js"></script></head>
<body >
	<div class="list">
		<div class="item">
			<label for="">受护人姓名：&nbsp;</label><input type="text" readonly="readonly" value="${protectedPerson.protectedPersonName }">
		</div>
		<div class="item">
			<label for="">受护人年龄：&nbsp;</label><input type="text" readonly="readonly" value="${protectedPerson.protectedPersonAge }">
		</div>
		<c:if test="${protectedPerson.protectedPersonSex==1 }">
		<div class="item">
			<label for="">受护人性别：&nbsp;</label><input readonly="readonly" type="text" value="男">
		</div>
		</c:if>
		<c:if test="${protectedPerson.protectedPersonSex==2 }">
		<div class="item">
			<label for="">受护人性别：&nbsp;</label><input readonly="readonly" type="text" value="女">
		</div>
		</c:if>
		<c:if test="${protectedPerson.protectedPersonSex==0}">
		<div class="item">
			<label for="">受护人性别：&nbsp;</label><input readonly="readonly" type="text" value="未知">
		</div>
		</c:if>
		<%-- <div class="item">
			<label for="">身份证号：&nbsp;</label><input readonly="readonly" type="text" value="${protectedPerson.protectedPersonCard }">
		</div> --%>
	</div>
	<div class="title">
		<h5>服务信息</h5>
	</div>
	<div class="list">
		<div class="item">
			<label for="">护理项目：&nbsp;</label>${orderSend.orderSendServicecontent }
		</div>
		<div class="item">
			<label for="">服务开始时间：&nbsp;</label><fmt:formatDate value="${orderSend.orderSendBegintime }" type="both"/>
		</div>
		<div class="item">
			<label for="">服务结束时间：&nbsp;</label><fmt:formatDate value="${orderSend.orderSendFinishOrderTime }" type="both"/>
		</div>
		<div class="item">
			<label for="">护士姓名：&nbsp;</label><input readonly="readonly" type="text" value="${nurseTrueName}${nurseJob}">
		</div>
		<div class="item">
			<label for="">单号：&nbsp;</label><input readonly="readonly" type="text" value="${orderSend.orderSendNumbers }">
		</div>
		<div class="item">
			<label for="">备注：&nbsp;</label><input readonly="readonly" type="text" value="${orderSend.orderSendNote }">
		</div>
		<div class="item">
			<div style="margin-bottom: 10px;">图片资料</div>
				<c:set var="imgsp1" value="${orderSend.orderSendUserpic}" />
				<c:set var="result1" value="${fn:split(imgsp1, ',')}" />
					<ul class="imgList">
					<c:if test="${empty orderSend.orderSendUserpic}">
					<li ><img alt="" src="images/nopic.png" width="150px" height="150px"></li>
					</c:if>
					<c:if test="${!empty orderSend.orderSendUserpic}">
						<c:forEach items="${result1}" var="primg1">
							<a href="<%=host %>${primg1}">
								<li ><img alt="没有图片" src="<%=host %>${primg1}" width="150px" height="150px"></li>
							</a>
						</c:forEach>
					</c:if>
					</ul>
		</div>
		</div>
		<div class="title">
			<h5>护理报告</h5>
		</div>
		<div class="list1">
		<c:forEach items="${list }" var="s" varStatus="z">
			<div class="item1">
					<label style="font-size: 20px" >${s.nursingNurseid }:</label><br>
					<c:set var="imgsphlbg" value="${s.nursingTestingId }" />
					<c:set var="resulthlbg" value="${fn:split(imgsphlbg, '/')}" />
					
					<c:forEach items="${resulthlbg}" var="primghlbg">
						<span class="opt">
							<input class="magic-checkbox" type="checkbox" name="layout1" id="a12" value="" checked="checked" disabled="true">
							<label for="a12" style="color: #000000">${primghlbg}</label>&nbsp;&nbsp;
						</span>
					</c:forEach>
					
			</div>
		</c:forEach>	

		<div class="title">
			<h5>补充记录</h5>
		</div>
		<div class="list" style="margin-bottom: 0;">
			<div class="item" style="border:none;">
				<label for="" style="font-size: 20px">补充记录：&nbsp;</label><textarea  style="border-style: none;width: 100%;word-break:break-all" cols="45" rows="6" readonly="readonly" type="text" value="">${nursingReport.nursingReportAddrecords }</textarea>
			</div>
			<div class="item" style="text-align: right;" id="options">
				<%-- <button class="btn selected">${nursingReport.nursingReportLable }</button> --%>
				<c:if test="${nursingReport.nursingReportLable !=null }">
				<c:set var="imgsp3" value="${nursingReport.nursingReportLable }" />
				<c:set var="result3" value="${fn:split(imgsp3, ',')}" />
				<c:forEach items="${result3}" var="primg3">
						<button class="btn">${primg3}</button>
				</c:forEach>
				</c:if>
		</div>
			</div>
			<div class="item" style="margin-top: 2%">
				<div style="margin-bottom: 10px;">图片<span style="color: #ccc;font-size: 14px;float: right;">可上传医嘱，处方单，注射单等照片...</span></div>
				<c:set var="imgsp" value="${nursingReport.nursingReportServicepic}" />
				<c:set var="result" value="${fn:split(imgsp, ',')}" />
				<div>
					<ul class="imgList">
					<c:if test="${empty nursingReport.nursingReportServicepic}">
					<li ><img alt="" src="images/nopic.png" width="150px" height="150px"></li>
					</c:if>
					<c:if test="${!empty nursingReport.nursingReportServicepic}">
					<c:forEach items="${result}" var="primg">
							<a href="<%=webPath %>${primg}">
								<li ><img alt="没有图片" src="<%=webPath %>${primg}" width="150px" height="150px"></li>
							</a>
					</c:forEach>
					</c:if>
						
					</ul>
				</div>
			</div>
		</div>
		<div class="time" style="padding: 5px 15px;font-size: 14px;color: #ccc;text-align:center ;">
			更新于<span>
			<fmt:formatDate value="${nursingReport.nursingReportCreatetime }" type="both"/>
			</span>
		</div>
		<!-- <footer>
			保存提交
		</footer> -->
		<input type="hidden" value="${repotrState }" name="repotrState" id="repotrState"/>
</body>
<script src="https://cdn.bootcss.com/jquery/2.2.3/jquery.min.js"></script>
<!-- <script>
	$('#options .btn').on('click',function(){
		$(this).addClass('selected').siblings().removeClass('selected')
	})
</script> -->
<script>
   var flag = true,//状态true为正常的状态,false为放大的状态
           imgH,//图片的高度
           imgW,//图片的宽度
           img = document.getElementsByTagName('img')[0];//图片元素
  img.onclick =  function(){
  alert("111");
      //图片点击事件
       imgH = img.height; //获取图片的高度
       imgW = img.width; //获取图片的宽度
       if(flag){
           //图片为正常状态,设置图片宽高为现在宽高的2倍
           flag = false;//把状态设为放大状态
           img.height = imgH*2;
           img.width = imgW*2;
       }else{
           //图片为放大状态,设置图片宽高为现在宽高的二分之一
           flag = true;//把状态设为正常状态
           img.height = imgH/2;
           img.width = imgW/2;
       }
 
   }
   
   //得到屏幕的宽度
function test(){
var repotrState = $("#repotrState").val();
	if(repotrState == '1'){
	var div = document.getElementById('html');
	div.className = 'html';
	}
}
test();
 
 
</script>
</html>