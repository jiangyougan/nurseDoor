<!DOCTYPE html>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.File"%>
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
    
    String invitationcode = request.getParameter("invitationcode");
    
	%>
<html>
<head>
    <title>护士上门</title>
        <meta charset="utf-8" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black-translucent">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no minimal-ui">
    <!-- CSS Global Compulsory-->
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <link rel="stylesheet" href="https://static.pgyer.com/static-20161125/assets/css/style.css" />

    <!-- CSS Implementing Plugins -->
    <link rel="stylesheet" href="css/font-awesome.min.css">

    <!-- CSS Theme -->

</head>	

<body>

<!-- wechat share icon -->
<div style="display:none;">
    <img src="img/ic_launcher.png"  />
</div>
<!--=== Breadcrumbs ===-->
<div class="row-fluid breadcrumbs margin-bottom-20">
    <div class="container">
        <h1 class="pull-left">护士上门N</h1>
       <!--  <ul class="pull-right breadcrumb">
                    <li>版本：1.0.39 (build 7)</li>
            <li>大小：27.4M</li>
                    <li>2016-12-13</li>
        </ul> -->
    </div><!--/container-->
</div><!--/breadcrumbs-->
<div class="container content"> 	
<% if(invitationcode != null && !"".equals(invitationcode)){%>
<h1 style="text-align: center;">邀请码:<%=invitationcode %></h1>
<% } %>

    <div>
    <!-- android -->
	    <div class="view row">
	                <div class="span12" style="text-align:center;">
	                         <a href="javascript:void(0);" ><img src="img/ic_launcher.png" class="appicon"  /></a>
	        		</div>
	    </div>
	
	    <div id="" class="view row" style="margin-top:30px;">    
	
	        
	             <div class="span12 margin-bottom-20" style="text-align:center;">
	                       <div class="spinner">
	                        	<a href="http://imtt.dd.qq.com/16891/07D44A8DB245FFAA984E868A3CAACC4F.apk?fsname=com.chance.homecarenurse_1.0.41_41.apk&csr=4d5s"  id="down_load"  class="btn-u btn-u-lg"><i class="fa fa-download"></i> 点击下载</a>
	                        	<a href="http://118.178.186.59:8080/nurseDoor/apk/HomeCareNurse.apk"  id="down_load"  class="btn-u btn-u-lg"> 点击下载&nbsp;<i class="fa fa-download" style="content: "\f019";"></i></a>
	                       </div>
	                </div>
	        	<div class="span12" style="text-align:center;">
	                            <span class="label label-success" >适用于安卓设备</span>
	                             <span class="label label-success" style="width: 120.59px">适用于苹果设备</span>
	                           </div>
	    </div>
       </div>     
         
             
             
             
    <hr class="devider devider-dotted">


        <div id="" class="view row margin-bottom-30">    
        <div class="span12" style="text-align:center;">
            或者用手机扫描下面的二维码安装            <br />
            <br />
            <img src="img/nurse.png" style="width:156px; height:156px;" />
        </div>
    </div>
    
    </div>
    
    
        <div class="row">
        <div class="col-md-8 col-md-offset-2" style="word-break:break-all;">
            <div class="tag-box tag-box-v6">
                <h2>应用介绍</h2>
               1、	为病人
					为居家病人提供上门护理服务；
					为患者提供专业护理商品销售；
					通对医院外面的病人的持续护理跟踪，积累医疗数据；
<br>
			   2、	为护士
					提供利用业余时间赚钱的平台；
					提供继续教育及论文发表的平台；
					提供相互交流的社交平台；
            </div>
        </div>
    </div>
    
        
</div><!--/container-->	 	
<!--=== End Content Part ===-->


<!--=== Copyright ===-->
<div class="copyright">
    <div class="container">
        <div class="row">
            <div class="col-lg-8  col-xs-12 col-md-6 col-sm-6 text-left">
                                    <a href="#">护士上门</a>                    ｜
                                <a href="<%=webPath %>nurseDoor/agreement/nurseExemptionAgreement.html" target="_blank">免责声明</a>
                &nbsp;&nbsp;&nbsp;<!-- <a data-toggle="modal" id="reportClick" data-target="#reportApp" class="btn btn-danger btn-xs" style="color:#fff !important; background:#56bc94 !important; border:0px !important; margin-top:-3px">举报该应用</a> -->
            </div>

                    </div><!--/row-fluid-->
    </div><!--/container-->
</div>



</body>
</html>
