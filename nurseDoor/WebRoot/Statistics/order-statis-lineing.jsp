<!DOCTYPE HTML>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link href="css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="lib/Hui-iconfont/1.0.7/iconfont.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>

<title>统计管理</title>
<script type="text/javascript">
	
	$(function(){
		var type = "${orderType}";
		if("orderCount" == type){
			$(".btn-group").children().eq(0).attr("class", "btn btn-primary radius");	
		}
		if("orderPrice" == type){
			$(".btn-group").children().eq(1).attr("class", "btn btn-primary radius");	
		}
	})
	
	function toCol(select){
		var value = $(select).val();
		if(value==2){
			window.location.href="${pageContext.request.contextPath}/orderStatisticsCol.action?orderType=${orderType}";
		}
	}
	
	function selYear(sel){
		var year = $(sel).val();
		window.location.href="${pageContext.request.contextPath}/orderStatisticsLine.action?orderType=${orderType}&year="+year;
	}
</script>
</head>
<body>
<%--<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 统计管理 <span class="c-gray en">&gt;</span> 订单统计 <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
--%><div class="pd-20" style="text-align: center;">
	<div class="btn-group">
	  <span class="btn btn-default radius" onclick="Javascript:window.location.href='${pageContext.request.contextPath}/orderStatisticsLine.action?orderType=orderCount&year=${year}'">订单数量</span>
	  <span class="btn btn-default radius" onclick="Javascript:window.location.href='${pageContext.request.contextPath}/orderStatisticsLine.action?orderType=orderPrice&year=${year}'">订单金额</span>
	</div>
	
	<select name="year" onchange="selYear(this)">
		<c:forEach items="${years}" var="y">
			<c:if test="${year eq y }">
				<option value="${y}" selected="selected">${y}</option>
			</c:if>
			<c:if test="${year ne y }">
				<option value="${y}">${y}</option>
			</c:if>
		</c:forEach>
	</select>
	
	<%--<select onchange="toCol(this)">
		<option selected="selected" value="1">折线图</option>
		<option value="2">柱状图</option>
	</select>
	--%><div id="container" style="width:77%;height:400px;text-align: center;margin-left: -100%"></div>
</div>

<script src="http://cdn.hcharts.cn/highcharts/highcharts.js"></script>
<script src="http://cdn.hcharts.cn/highcharts/modules/data.js"></script>
<script src="http://cdn.hcharts.cn/highcharts/modules/drilldown.js"></script>

	<script type="text/javascript">
	$(function () {
	    Highcharts.chart('container', {
	        title: {
	            text: '${data.title}',
	            x: -20 //center
	        },
	        xAxis: {
	            categories: [${data.categories}]
	        },
	        yAxis: {
	            title: {
	                text: ''
	            },
	            plotLines: [{
	                value: 0,
	                width: 1,
	                color: '#808080'
	            }]
	        },
	        tooltip: {
	            valueSuffix: '${data.valueSuffix}'
	        },
	        legend: {
	            layout: 'vertical',
	            align: 'right',
	            verticalAlign: 'middle',
	            borderWidth: 0
	        },
	        series: [{
	            name: '${data.name}',
	            data: [${data.value}]
	        }]
	    });
	});
	</script>

</body>
</html>