<!DOCTYPE HTML>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
	if(value==1){
		window.location.href="${pageContext.request.contextPath}/orderStatisticsLine.action?orderType=${orderType}";
	}
}

function selYear(sel){
	var year = $(sel).val();
	window.location.href="${pageContext.request.contextPath}/orderStatisticsCol.action?orderType=${orderType}&year="+year;
}
</script>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 统计管理 <span class="c-gray en">&gt;</span> 订单统计 <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20" style="text-align: center;">
	<div class="btn-group">
	  <span class="btn btn-default radius" onclick="Javascript:window.location.href='${pageContext.request.contextPath}/orderStatisticsCol.action?orderType=orderCount&year=${year}'">订单数量</span>
	  <span class="btn btn-default radius" onclick="Javascript:window.location.href='${pageContext.request.contextPath}/orderStatisticsCol.action?orderType=orderPrice&year=${year}'">订单金额</span>
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
	
	<select onchange="toCol(this)">
		<option value="1">折线图</option>
		<option selected="selected" value="2"><a>柱状图</a></option>
	</select>
	
	<div id="container" style="min-width:700px;height:400px"></div>
</div>

<script src="http://cdn.hcharts.cn/highcharts/highcharts.js"></script>
<script src="http://cdn.hcharts.cn/highcharts/modules/data.js"></script>
<script src="http://cdn.hcharts.cn/highcharts/modules/drilldown.js"></script>

	<script type="text/javascript">
	$(function () {
	    // Create the chart
	    Highcharts.chart('container', {
	        chart: {
	            type: 'column'
	        },
	        title: {
	            text: '${title_text_1}'
	        },
	        subtitle: {
	            text: '点击图表可查看每月详细'
	        },
	        xAxis: {
	            type: 'category'
	        },
	        yAxis: {
	            title: {
	                text: '${title_text_2}'
	            }
	
	        },
	        legend: {
	            enabled: false
	        },
	        plotOptions: {
	            series: {
	                borderWidth: 0,
	                dataLabels: {
	                    enabled: true,
	                    format: '{point.y:.${decimalPoint}f}'
	                }
	            }
	        },
	
	        tooltip: {
	            headerFormat: '',
	            pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b>{point.y:.${decimalPoint}f}</b>${unit}<br/>'
	        },
	
	        series: [${series}],
	        drilldown: {
	            series: ${drilldown_series_arr}
	        }
	    });
	});
	</script>
</body>
</html>