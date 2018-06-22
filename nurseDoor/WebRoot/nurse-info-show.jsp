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
    
    String nurseId = request.getParameter("nurseId");
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
<![endif]--><title>护士查看</title>
</head>
<body onload="onload()">
<div class="cl pd-20" style=" background-color:#5bacb6">
<input type="hidden" value="<%=nurseId%>" name="nurseId" id="nurseId">
<input type="hidden" value="${checkstate }" name="checkstate" id="checkstate">
  <img class="avatar size-XL l" src="<%=webPath %>${nurse.nurseHeader }">
  <dl style="margin-left:80px; color:#fff">
    <dt><span class="f-18">${nurse.nurseNick }</span></dt>
    <dd class="pt-10 f-12" style="margin-left:0">${nurse.nurseNote }</dd>
  </dl>
</div>
<div class="pd-20">
  <table class="table">
    <tbody>
      <tr>
      <tr>
        <th class="text-r" width="80">护士账号：</th>
        <td>${nurse.nurseName }</td>
      </tr>
     
      <tr>
       <th class="text-r" width="80">真实姓名：</th>
        <td>${nurse.nurseTruename }</td>
      </tr>
      
        <tr>
       <th class="text-r" width="80">身份证号码：</th>
        <td>${nurse.nurseCard }</td>
      </tr>
      
       <tr>
        <th class="text-r">身份证照片：</th>
        <td>
        <c:if test="${nurse.nurseCardpic != null}">
        	<c:set var="imgsp" value="${nurse.nurseCardpic}" />
			<c:set var="result" value="${fn:split(imgsp, ',')}" />
        	<c:forEach items="${result}" var="primg">
					<a href="<%=host %>${primg}">
						<img alt="没有图片" src="<%=host %>${primg}" width="90px" height="90px">
					</a>
			</c:forEach>
        </c:if>
        </td>
      </tr>
     
      <tr>
        <th class="text-r" width="80">性别：</th>
        
        <c:if test="${nurse.nurseSex == 1 }">
          <td>男</td>
        </c:if>
       <c:if test="${nurse.nurseSex == 2 }">
          <td>女</td>
        </c:if>
        
      </tr>
     
       <tr>
        <th class="text-r" width="80">年龄：</th>
        <td>${nurse.nurseAge }</td>
      </tr>
      
       <tr>
        <th class="text-r" width="80">工作单位：</th>
        <td>${nurse.nurseWorkUnit }</td>
      </tr>
      
      <tr>
        <th class="text-r" width="80">科室：</th>
        <td>${nurse.nurseOffice }</td>
      </tr>
      
      <tr>
        <th class="text-r" width="80">职称：</th>
        <td>${nurse.nurseJob }</td>
      </tr>
      
      <tr>
        <th class="text-r" width="80">执业年限：</th>
        <td>${nurse.nurseYearsofservice }</td>
      </tr>
      
      <tr>
        <th class="text-r" width="80">可提供服务：</th>
        <td>
         <c:if test="${nurse.nurseGoodservice != null}">
        	<c:set var="imgsp1" value="${nurse.nurseGoodservice}" />
			<c:set var="result1" value="${fn:split(imgsp1, ',')}" />
        	<c:forEach items="${result1}" var="primg1">
					<label>${primg1}</label><br>
			</c:forEach>
        </c:if>
        
        </td>
      </tr>
      
      <tr>
   		<th class="text-r" width="80">护士注册号：</th>
        <td>${nurse.nurseNumber }</td>
      </tr>
      
      <tr>
   		<th class="text-r" width="80">相关证书：</th>
        <td>
        <c:if test="${nurse.nurseNurseLicensepic != null}">
        	<c:set var="imgsp2" value="${nurse.nurseNurseLicensepic}" />
			<c:set var="result2" value="${fn:split(imgsp2, ',')}" />
        	<c:forEach items="${result2}" var="primg2">
					<a href="<%=host %>${primg2}">
						<img alt="没有图片" src="<%=host %>${primg2}" width="90px" height="90px">
					</a>
			</c:forEach>
        </c:if>
        
        
        </td>
      </tr>
      
      <tr>
        <th class="text-r">手机：</th>
        <td>${nurse.nursePhone }</td>
      </tr>
      
      <tr>
        <th class="text-r">地址：</th>
        <td>${nurse.nurseEmail }</td>
      </tr>
      <%--  <tr>
        <th class="text-r">职业照片：</th>
        <td><img alt="" src="<%=webPath%>${nurse.nurseNurseLicensepic }"></td>
      </tr> --%>
     
      <tr>
        <th class="text-r">接单状态：</th>
        <td>
        <c:if test="${nurse.nurseCity == '0'}">
      	  接单
        </c:if>
        <c:if test="${nurse.nurseCity == '10'}">
      	  不接单
        </c:if>
        </td>
      </tr>
      <tr>
        <th class="text-r">邀请码：</th>
        <td>${nurse.nurseInvitationcode }</td>
      </tr>
      <tr>
        <th class="text-r">注册时间：</th>
        <td> <fmt:formatDate value="${nurse.nurseCreatetime }" type="both"/>  </td>
      </tr>
      <tr>
        <th class="text-r">余额：</th>
        <td>${nurse.nurseBalance }</td>
      </tr>
      
       <tr>
        <th class="text-r">红包：</th>
        <td>${nurseRedPacketsCount}个</td>
      </tr>
      
      <tr>
        <th class="text-r">积分：</th>
        <td>${nurse.nurseMark }</td>
      </tr>
    </tbody>
  </table>
</div>
<script type="text/javascript" src="js/jquery.min.js"></script> 
<script type="text/javascript" src="js/H-ui.js"></script>
<script type="text/javascript" src="js/H-ui.admin.js"></script>
</body>
<script type="text/javascript">
function onload(){
var state = true;
var nurseId = $("#nurseId").val();
var checkstate = $("#checkstate").val();
if(checkstate == ""){
location.href = "${pageContext.request.contextPath}/selectAllNurseInfoByNurseId.action?nurseId=" + nurseId;
}
}
</script>
</html>