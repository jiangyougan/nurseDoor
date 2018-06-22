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
	function clickSelected(span,type){
		window.location.href="${pageContext.request.contextPath}/userStatistics.action?type="+type;
	}
	
	$(function(){
		var type = ${type};
		$(".btn-group").children().eq(type-1).attr("class", "btn btn-primary radius");
	})
</script>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 统计管理 <span class="c-gray en">&gt;</span> 用户统计 <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20" style="text-align: center;">
	<div class="btn-group">
	  <span class="btn btn-default radius" onclick="clickSelected(this,1)">用户数量</span><%--
	  <span class="btn btn-default radius" onclick="clickSelected(this,2)">用户签到</span>
	  --%><span class="btn btn-default radius" onclick="clickSelected(this,3)">护士数量</span>
	  <%--<span class="btn btn-default radius" onclick="clickSelected(this,4)">护士签到</span>
	--%></div>
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
            text: '${data.xTitle}'
        },
        subtitle: {
            text: '${data.subTitle}'
        },
        xAxis: {
            type: 'category'
        },
        yAxis: {
            title: {
                text: '${data.ytitle}'
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
                    format: '{point.y:.0f}'
                }
            }
        },

        series: ${data.series}
    });
});
</script>
</body>
</html>