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
            
                    //路径
    String webPath = basePath.substring(0, basePath.length()-10);
            
	%>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<link rel="stylesheet" href="css/postcss.css" />
	<title>学术圈</title>
	<style type="text/css">
	* {
		-webkit-box-sizing: border-box;
		-moz-box-sizing: border-box;
		box-sizing: border-box;
		-webkit-tap-highlight-color: transparent;
		outline: none;
		}
	*:not(input,textarea) { 
	-webkit-touch-callout: none; 
	  -webkit-user-select: none; 
	}
	input {
	border-left:0px;border-top:0px;border-right:0px;border-bottom:1px;
	width: 20px;
	background-color: #FFFFFF;
}

.pop{height: 160px;}
#content{border: 1px solid #878585;margin-left: 5%;margin-right: 5%;width: 90%;padding: 3px;}
.operateBtn{width: 100%;height: 35px;border-top:1px solid #ddd;}
.operateBtn div{text-align: center;line-height: 35px;color: #af589c;font-size: 15px;}
	</style>
</head>
<body style="background-color: #FFFFFF">
	<header>
		<span>来自:</span>
		小护健康
		<!-- <button>
			+关注
		</button> -->
	</header>
	<article>
	<h3 style="margin-left: 3%">${details.postThreeLevelDetailsTitle }</h3>
		<div class="img" style="width: 94%;text-align: center;margin-left: 3%">
			${details.postThreeLevelDetailsContent }
		</div>
		<div class="comment" style="width: 100%;height: auto;overflow: hidden;" >
			<span>来自${detailInfo }</span><br> 发布于:<fmt:formatDate value="${details.postThreeLevelDetailsCreatetime }" type="date"/>
			<i class="like"  style="position: relative;float: right;top:-7px;font-style: normal;"><lable style="width: 50px" id="ThingNumber">${details.postThreeLevelDetailsThingNumber }</lable><!-- <input style="width: 50px" id="ThingNumber"  value="120" type="text" disabled="disabled"/> --></i>
			<i class="com" style="position: relative;float: right;margin-right: 20px;top:-7px;font-style: normal;"><lable style="width: 50px">${details.postThreeLevelDetailsCommentNumber }</lable><!-- <input style="width: 50px"  value="120" type="text" disabled="disabled"/> --></i>
		</div>
		<!-- 回复 -->
		<div class="reply">
			<h5 class="title">全部回复</h5>
			<div class="list">
				<c:forEach items="${list }" var="s">
					 <div class="list-item">
					 
					 		<div class="head">
					 		
					 		<c:if test="${s.postReplyBeReplyToPeople == ''  || s.postReplyBeReplyToPeople == null}">
					 			<img class="avatar" class="avatar" src="<%=webPath %>${s.nurseHeader}" alt=""  onerror="this.src='img/defalut_icon.png'">
					 			<span>${s.nurseNick }</span>
					 		</c:if>	
					 		
					 		<c:if test="${s.postReplyBeReplyToPeople != '' && s.postReplyBeReplyToPeople != null}">
					 			<c:if test="${s.postReplySpeak == '1'}">
					 				<%-- <img class="avatar" class="avatar" src="<%=webPath %>${s.nurseHeader}" alt=""> --%>
					 				<span style="margin-left: 14%">${s.nurseNick }</span><span>回复</span>
					 			</c:if>
					 			<c:if test="${s.postReplySpeak == '2' }">
					 				<span style="margin-left: 13%">【小护健康】回复</span>
					 				<%-- <span>${s.nurseNick }</span> --%>
					 			</c:if>
					 		</c:if>	
					 		</div>
					 		<div class="con">
					 			<div class="text" >
					 				${s.postReplyContent }
					 			</div>
					 			
					 			<div class="bot" style="font-size:10px ">
						 			<fmt:formatDate value="${s.postReplyCreatetime }" type="both"/>
						 			<i class="com">&nbsp;</i>
									<i class="like">&nbsp;</i>
						 		</div>
					 		</div>
					 </div>
				</c:forEach>
			</div>
		</div> 
	</article>
	<footer>
		  <div class="" style="float: left;">
		  <!-- 	<a style="display: inline-block;margin:0 20px;text-align: center;margin-top: 4px;">
		  		<img src="img/zan.png" alt="" style="display: block;height: 20px;margin:auto;">
		  		<span style="display: block;height: 20px;font-size: 14px;line-height: 20px;">点赞</span>
		  	</a> -->
		  <!-- 	<a style="display: inline-block;margin:0 20px;text-align: center;margin-top: 4px;">
		  		<img src="img/shoucang.png" alt="" style="display: block;height: 20px;margin:auto;">
		  		<span style="display: block;height: 20px;font-size: 14px;line-height: 20px;">收藏</span>
		  	</a> -->
		  </div>
		  <div class="" style="width: 100px;background: #af589c;color: #fff;text-align: center;float: right;" id="huifu">回复客服</div>
	</footer>
	<div class="bg"></div>
	
	
<!-- 	<div class="pop">
		<textarea id="content" rows="5" cols="20" ></textarea>
		<div style="float: left: ;">
			<button onclick="closetest()">关闭</button>
			
		<div style="float: right;margin-top: -0.05%" >
			<button onclick="submitSure()">确定</button>
		</div>
		</div>
		
</textarea>	
	</div> -->
	
	<div class="pop">
	<div style="width: 100%;height: 35px;line-height: 35px;text-align: center;font-size: 15px;">内容编辑</div>
	<textarea id="content" type="text" rows="2"></textarea>
	<!-- <textarea id="content" rows="5" cols="20" ></textarea> -->
	<div class="operateBtn">
		<div style="float: left;border-right: 1px solid #ddd;width: 49%" onclick="closetest()">取消</div>	
		<div style="float: right;width: 50%;" onclick="submitSure()">确定</div>
	</div>
</div>
	
	
	
	
	<input value="${nurseId }" id="nurseId" type="hidden">
	<input value="${postThreeLevelDetailsId }" id="postThreeLevelDetailsId" type="hidden">
</body>
<script src="https://cdn.bootcss.com/jquery/2.2.3/jquery.min.js"></script>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script> 
<script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 

<script>
var url = 'http://118.178.186.59:8080/nurseDoor/'
	$(".like").on('click',function(){
		//护士ID
		var nurseId = $("#nurseId").val();
		if(nurseId == ''){
		 window.location.href = url+"fenxiang.jsp";
		}else{
		var postThreeLevelDetailsId = $("#postThreeLevelDetailsId").val();
		$.ajax({
					url: "${pageContext.request.contextPath}/PostGiveFabulous.action",              //请求地址
			        type: "POST",                       //请求方式
			        data: { nurseId: nurseId,postThreeLevelDetailsId: postThreeLevelDetailsId},        //请求参数
			        dataType: "json",
			        success: function (date) {
			        if(date == 1){
			        	layer.msg('您已经点过赞了!',{icon: 6,time:1000});
			        }else{
			        	//var ThingNumber = $("#ThingNumber").val(date);
			        	$("#ThingNumber").html(date); 
				        layer.msg('点赞+1!',{icon: 6,time:1000});
			        }
			        },
			        fail: function (status) {
       				}
			  });
		}
		
	})
	$("#huifu").on('click',function(){
	//护士ID
		var nurseId = $("#nurseId").val();
		if(nurseId == ''){
		window.location.href = url+"fenxiang.jsp";
		}else{
		$('.bg').show();
		$('.pop').show();
		}
		
	})
</script>
<script type="text/javascript">
function closetest(){
	$('.pop').hide();
	$('.bg').hide();
}
function submitSure(){
	//护士ID
	var nurseId = $("#nurseId").val();
	if(nurseId == ''){
	alert("111");
	}else{
	$('.pop').hide();
	$('.bg').hide();
	var postThreeLevelDetailsId = $("#postThreeLevelDetailsId").val();
	//回复的内容
	var content = $("#content").val().trim();;
	if(content == null || content == '' || content.length ==0){
		layer.msg('请输入您要回复的内容!',{icon: 6,time:1000});
		return false;
	}else{
		$.ajax({
					url: "${pageContext.request.contextPath}/ReplyToCustomerService.action",              //请求地址
			        type: "POST",                       //请求方式
			        data: { nurseId: nurseId,postThreeLevelDetailsId: postThreeLevelDetailsId,content:content},        //请求参数
			        dataType: "json",
			        success: function (date) {
				        if(date==0){
				          layer.msg('回复成功!', {icon: 6, time: 1500});
				          location.reload();	  
				        }else if(date==3){
				        layer.msg('请勿重复回复!', {icon: 5, time: 1500});
				        }else {
				        layer.msg('添加失败!', {icon: 5, time: 1500});
				        }
			        },
			        fail: function (status) {
       				}
			  });
	}
		
	}
	
}
</script>
</html>