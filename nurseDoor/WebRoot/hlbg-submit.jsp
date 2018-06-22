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
	%>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<!-- 不让页面读取缓存数据 -->
<link rel="stylesheet" type="text/css" href="css/magic-check.css">
<link rel="stylesheet" type="text/css" href="src/DateTimePicker.css" />
<style type="text/css">
.demo{width:100%;padding:8px;background:#FFFFFF}
.demo h3{font-size:1.5em;line-height:1.9em}

.col h4{height:28px;line-height:28px;margin:0;}
.opt{height:30px;line-height:24px}

/* 加载 */
.layui-layer-content{
text-align: center;
position:fixed;
margin: auto;
left: 0;
right: 0;
top: 0;
bottom: 0;
z-index: 0;
}

input {
	
}
</style>
	<title>护理报告</title>
	<style>
	html
	{
	    /*font-family: sans-serif;*/	

	    -webkit-text-size-adjust: 100%;
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

	   /*  -webkit-user-select: none; */

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
	.submit{
		height: 44px;
		background: #af589c;
		line-height: 44px;
		color: #fff;
		text-align: center;
		/* position: fixed; */
		bottom: 0;
		width: 100%;
	}
	.delbutton
	{
		background: #af589c;
		color: #fff;
	}
	</style>
	<style>
	#upload{
	width: 100%;
	}
	#upload div{
	height:100px;
	width:33.33%;
	float: left;;
	}
.pro_img{display:block;width:100px;height: 100px;background-color: white;   overflow:hidden; position: relative;
	margin:0 auto;
}
.pro_img img{ margin:auto; width: 100%;
}
.pro_img input{margin:0 auto;position: absolute;width: 100%;height: 100%;margin:0;opacity:0;z-index: 100;}
	</style>
	 <style>
.option-input { 
-webkit-appearance: none; 
-moz-appearance: none; 
-ms-appearance: none; 
-o-appearance: none; 
appearance: none; 
width: 20px; 
height: 20px; 
-webkit-transition: all 0.15s ease-out 0; 
-moz-transition: all 0.15s ease-out 0; 
background: #cbd1d8; 
border: none; 
color: #fff; 
} 
.option-input:hover { 
-webkit-appearance: none; 
-moz-appearance: none; 
-ms-appearance: none; 
-o-appearance: none; 
appearance: none; 
width: 20px; 
height: 20px; 
-webkit-transition: all 0.15s ease-out 0; 
-moz-transition: all 0.15s ease-out 0; 
background: #cbd1d8; 
border: none; 
color: #fff; 
background: #9faab7; 
} 
.option-input:checked { 
background: #AF589C; 
} 
.option-input:checked::before { 
width: 20px; 
height: 20px; 
content: '\2713'; 
display: inline-block; 
text-align: center; 
line-height: 20px; 
} 
.option-input:checked::after { 
-webkit-animation: click-wave 0.65s; 
-moz-animation: click-wave 0.65s; 
background: #AF589C; 
content: ''; 
display: block; 
z-index: 100; 
} 
.option-input.radio { 
border-radius: 50%; 
} 
.option-input.radio::after { 
border-radius: 50%; 
} 
   </style>
   <!-- 遮罩蒙版 -->
    <style> 
        .black_overlay{ 
         	display: none;
            position: fixed; 
            top: 0; 
            left: 0; 
            width: 100%; 
           /*  height: 100%;  */
            background-color: rgba(0,0,0,0.5); 
            z-index:1001; 
            -moz-opacity: 0.8; 
            opacity:.80; 
            filter: alpha(opacity=88); 
        } 
        .white_content { 
            display: none; 
            position: absolute; 
            width: 95%; 
            height: 80%; 
            padding: 20px; 
            background-color: white; 
            z-index:1002; 
            overflow: auto; 
             bottom:0; 
             POSITION:absolute; 
        } 
        
        .imgGif{
        position:fixed;
top:50%;
bottom:0;
left:0;
right:0;
margin:auto;
        }
    </style>
   
	<script>
name_pic=1;
function t1(o){
//alert(name_pic);
	if(o==1 || name_pic!=1){
	var file="file"+o;
	var img="img"+o;
	var hid="hidden"+o;
	var aa="a"+o;
	}else{

	var file="file"+name_pic;
	var img="img"+name_pic;
	var hid="hidden"+name_pic;
	var aa="a"+name_pic;
	}
	var docObj = document.getElementById(file);
	var imgObjPreview = document.getElementById(img);
	var hidden=document.getElementById(hid);
	// alert(hidden);
	if (docObj.files && docObj.files[0]) {
		hidden.src=window.URL.createObjectURL(docObj.files[0]); //鑾峰彇file鏂囦欢鐨勮矾寰�
		hidden.onload=function(){
			var width=hidden.width;
			var height=hidden.height;
			var a=document.getElementById(aa);
				if(width>height){
				imgObjPreview.style.cssText='width:100%';	//閲嶅啓css鏍峰紡
				}else{
				imgObjPreview.style.cssText='height:100%;width:auto;';					
				}
		imgObjPreview.src = window.URL.createObjectURL(docObj.files[0]);
		imgObjPreview.style.display = 'block';
		};
	}else{
		return false;
	}
	if(o==name_pic){
		var count=$('.pro_img').length;
		if(count<6){//上传图片的个数
		name_pic++;
	var pic_div="<div><a class='pro_img' id='a"+name_pic+"' ><input type='file' id='file"+name_pic+"'  accept='image/*' multiple='multiple' name='pics' onchange='t1("+name_pic+")'/><img src='images/upload.png' id='img"+name_pic+"'></a><img  id='hidden"+name_pic+"' style='display:none;'></div>";
	$('#upload').append(pic_div); 
	}		
}
}

</script>
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script></head>
<body style="" >
	<div class="list">
	<div id="fade" class="black_overlay" style="height:200%;z-index: 9999"><!-- <img  class="imgGif" style="width: 100px;height: 80px" alt="" src="img/gongGif.gif"> --></div> 
		<div class="item">
			<label for="">受护人姓名：&nbsp;</label><input type="search" readonly="readonly" value="${protectedPerson.protectedPersonName }">
		</div>
		<div class="item">
			<label for="">受护人年龄：&nbsp;</label><input type="search" readonly="readonly" value="${protectedPerson.protectedPersonAge }">
		</div>
		<c:if test="${protectedPerson.protectedPersonSex==1 }">
		<div class="item">
			<label for="">受护人性别：&nbsp;</label><input readonly="readonly" type="search" value="男">
		</div>
		</c:if>
		<c:if test="${protectedPerson.protectedPersonSex==2 }">
		<div class="item">
			<label for="">受护人性别：&nbsp;</label><input readonly="readonly" type="search" value="女">
		</div>
		</c:if>
		<c:if test="${protectedPerson.protectedPersonSex==0}">
		<div class="item">
			<label for="">受护人性别：&nbsp;</label><input readonly="readonly" type="search" value="未知">
		</div>
		</c:if>
		<%-- <div class="item">
			<label for="">身份证号：&nbsp;</label><input readonly="readonly" type="search" value="${protectedPerson.protectedPersonCard }">
		</div> --%>
	</div>
	<div class="title">
		<h5>服务信息</h5>
	</div>
	<div class="list">
		<div class="item">
			<label for="">护理项目：&nbsp;</label><input readonly="readonly" type="text" style="" value="${orderSend.orderSendServicecontent }">
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
			<label for="">备注：&nbsp;</label><input readonly="readonly" type="search" value="${orderSend.orderSendNote }">
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
								<li ><img alt="没有图片" src="<%=host %>${primg1}" width="10%" height="10%"></li>
							</a>
						</c:forEach>
					</c:if>
					</ul>
		</div>
		</div>
		<form action="selectReportdetailsSubmit.action" id="form" enctype="multipart/form-data" method="post" autocomplete="off">
		<input type="hidden" name="orderSendId" value="${orderSendId }"/>
		<input type="hidden" name="nurseId" value="${nurseId }"/>
		<input type="hidden" name="orderSendServicecontent" value="${orderSendServicecontent }"/>
		<input type="hidden" name="contentId" value="${contentId }">
		<div class="title">
			<h5>护理报告</h5>
		</div>
		<!-- 二级产品id ${contentId} -->
		<!-- 1、新生儿护理 -->
		<c:if test="${contentId == '2a64345c6f4e48358d198f7d01cf0b97'}">
	 	<%@ include file="hlbg/hlbg-new-1.jsp" %> 
	 	 </c:if>
	 	
	 	<!-- 2、产妇护理套餐 -->
	 	<c:if test="${contentId == '0aa97632a3494c0b86e3fbf137a82bbb'}">
	 	<%@ include file="hlbg/hlbg-new-2.jsp" %> 
	 	</c:if>
	 	
	 	<!-- 3、催乳通乳护理. -->
	 	<c:if test="${contentId == '100a0c4d00264dfc816828ae54f4608e'}">
	 	<%@ include file="hlbg/hlbg-new-3.jsp" %> 
	 	</c:if>
	 	
	 	<!-- 4、肌肉注射-->
		<c:if test="${contentId == '714cb9b62d1d49048195824529396917'}">
	 	<%@ include file="hlbg/hlbg-new-4.jsp" %> 
	 	  </c:if>
	 	
	 	<!-- 5、静脉输液-->
	 	<c:if test="${contentId == 'd27bdc451f4c43f7bd1d11a32211f775'}">
	 	<%@ include file="hlbg/hlbg-new-5.jsp" %>  
	 	</c:if>
	 	
	 	<!-- 6、留置PICC管道护理 -->
	 	<c:if test="${contentId == '88d32bffff9e4704bcb89558b93a3381'}">
	  	<%@ include file="hlbg/hlbg-new-6.jsp" %>
	 	</c:if>
	 	
	 	<!-- 7、输液港护理 -->
		<c:if test="${contentId == '10c8cf04196549d5bd614e13e6c32cc5'}">
	  	<%@ include file="hlbg/hlbg-new-7.jsp" %>
	 	</c:if>
	 	
	 	<!-- 8、胃管护理 -->
	  	<c:if test="${contentId == '3f425fb5ee5c4fd490732516f79398c5'}">
	  	<%@ include file="hlbg/hlbg-new-8.jsp" %>
		</c:if> 
	 	
	 	<!-- 9、尿管护理 -->
	 	<c:if test="${contentId == '7001bdf1ebbb4535b8eb0bfd18f3fb70'}">
	  	<%@ include file="hlbg/hlbg-new-9.jsp" %>
	 	</c:if>
	 	
	 	<!-- 10、压疮护理 -->
	 	<c:if test="${contentId == 'fa5a9f33891b4590b58bd51d9d1cd890'}">
	  	<%@ include file="hlbg/hlbg-new-10.jsp" %>
	 	</c:if>
	 	
	 	<!-- 11、造口护理. -->
	   <c:if test="${contentId == 'fc3270db699f40639520aff19300fdd3'}">
	  	<%@ include file="hlbg/hlbg-new-11.jsp" %>
	</c:if>
		
			<div class="title">
				<h5>补充记录</h5>
			</div>
			<div class="list" style="margin-bottom: 0;">
				<div class="item" style="border:none;">
					<label for="">补充记录：&nbsp;</label><textarea name="reportaddrecords" id="weibo" cols="45" rows="6" type="text" style="width: 100%;height: 100px" placeholder="特殊说明" value=""></textarea>剩余输入<span id="word">140</span>个字
				</div>
				<div class="item" style="text-align: right;" id="options">
					<%-- <button class="btn selected">${nursingReport.nursingReportLable }</button> --%>
					
					<c:forEach items="${listlable}" var="s">
							<button style="outline:none;" id="buttonClass" type="button" class="btn">${s.caseLableName}</button>
					</c:forEach>
					<input type="hidden" value="" name="lableinfo" id="lableinfo"/>
			</div>
				</div>
				<div class="item">
					<div style="margin-bottom: 10px;">图片<span style="color: #ccc;font-size: 14px;float: right;">可上传医嘱，处方单，注射单等照片...(点击已选中的图片可修改)</span></div>
						<div id='upload'>
						<div>
							<a class='pro_img' id='a1' >
							<input type='file' id='file1'  accept='image/*' multiple='multiple' name='pics' onchange='t1(1)'/>
							<img src='images/upload.png' id='img1' "></a>
							<img id='hidden1' style='display:none;' />
					    </div>
						</div>
				</div>
				 <div style="margin-top: inherit;margin-bottom: -15%"> 
			<button  class="submit" style="" type="button" onclick="submitFrom()">
				保存提交
			</button>
			</div> 
			<!--  <button onclick="textss()" type="button" style="width: 100%;margin-top: 5%">测试</button> -->
		</form>
		 
</body>
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script>
<script type="text/javascript">

//输入框限制
//过期时间(整数)
$("input[class*='number']").keyup(function () { 
var reg = $(this).val().match(/\d+\.?\d{0,2}/); //有2位小数 
   /*  var reg = $(this).val().match('^([0-9]*)$');  */
    var txt = ''; 
    if (reg != null) { 
       txt = reg[0]; 
     } 
    $(this).val(txt); 
}).change(function () { 
    $(this).keypress(); 
    var v = $(this).val(); 
    if (/\.$/.test(v)){ 
        $(this).val(v.substr(0, v.length - 1)); 
    } 
}); 
</script>
<script>
	var flag=true; 
	$('#options .btn').on('click',function(){
	var val = $("#options").val();
		if(flag){
			$(this).removeClass('selected');
			$(this).addClass('selected');
		}
		else{
			$(this).addClass('selected');
			$(this).removeClass('selected');
		}
		flag=!flag;
	});
	var width=$('.weui_uploader_input_wrp').width()+1;
	$('.weui_uploader_input_wrp').height(width);
</script>
<script type="text/javascript">
function getByClass(sClass){
    var aResult=[];
    var aEle=document.getElementsByTagName('*');
    /*正则模式*/
    var re=new RegExp("\\b" + sClass + "\\b","g");
    for(var i=0;i<aEle.length;i++){
        /*字符串search方法判断是否存在匹配*/
        if(aEle[i].className.search(re) != -1){
            aResult.push(aEle[i]);
        }
    }
    return aResult;
};
function submitFrom(){
//获取补充记录的值
 var reportaddrecords = $("#weibo").val();
 if(reportaddrecords == null || reportaddrecords==''){
 //alert("补充记录不能为空");
 layer.msg('补充记录不能为空!',{icon: 5,time:1000});
 return false;
}

  //获取form标签元素
  var form=document.getElementById('form');
  //获取form下元素下所有input标签
  //var inputArray=form.getElementsByTagName("input");
  var inputArray=$("input[type='text']");
  
 //1
 var val1aIs = $('input:radio[name="radio"]').val();
 if(val1aIs != null){
 var val1a=$('input:radio[name="radio"]:checked').val();
            if(val1a==null){
                layer.msg('请认真填写每一项!',{icon: 5,time:1000});
                return false;
            }
 }
 
 
 //1
 var val1Is = $('input:radio[name="radio1"]').val();
 if(val1Is != null){
 var val1=$('input:radio[name="radio1"]:checked').val();
            if(val1==null){
                layer.msg('请认真填写每一项!',{icon: 5,time:1000});
                return false;
            }
 }
 
  //1
 var val2Is = $('input:radio[name="radio2"]').val();
 if(val2Is != null){
 var va21=$('input:radio[name="radio2"]:checked').val();
            if(va21==null){
               layer.msg('请认真填写每一项!',{icon: 5,time:1000});
                return false;
            }
 }
 
 //1
 var val4Is = $('input:radio[name="radio4"]').val();
 if(val4Is != null){
 var va41=$('input:radio[name="radio4"]:checked').val();
            if(va41==null){
               layer.msg('请认真填写每一项!',{icon: 5,time:1000});
                return false;
            }
 }
 
  //1
 var val5Is = $('input:radio[name="radio5"]').val();
 if(val5Is != null){
 var va51=$('input:radio[name="radio5"]:checked').val();
            if(va51==null){
               layer.msg('请认真填写每一项!',{icon: 5,time:1000});
                return false;
            }
 }
 
  //1
 var val6Is = $('input:radio[name="radio6"]').val();
 if(val6Is != null){
 var va61=$('input:radio[name="radio6"]:checked').val();
            if(va61==null){
               layer.msg('请认真填写每一项!',{icon: 5,time:1000});
                return false;
            }
 }
 
 //1
 var val7Is = $('input:radio[name="radio7"]').val();
 if(val7Is != null){
 var va71=$('input:radio[name="radio7"]:checked').val();
            if(va71==null){
               layer.msg('请认真填写每一项!',{icon: 5,time:1000});
                return false;
            }
 }
 
 //1
 var val8Is = $('input:radio[name="radio8"]').val();
 if(val8Is != null){
 var va81=$('input:radio[name="radio8"]:checked').val();
            if(va81==null){
               layer.msg('请认真填写每一项!',{icon: 5,time:1000});
                return false;
            }
 }
 
 //2
 var val9Is = $('input:radio[name="radio9"]').val();
 if(val9Is != null){
 var va91=$('input:radio[name="radio9"]:checked').val();
            if(va91==null){
               layer.msg('请认真填写每一项!',{icon: 5,time:1000});
                return false;
            }
 }
 
  //2
 var val10Is = $('input:radio[name="radio10"]').val();
 if(val10Is != null){
 var va101=$('input:radio[name="radio10"]:checked').val();
            if(va101==null){
               layer.msg('请认真填写每一项!',{icon: 5,time:1000});
                return false;
            }
 }
 
   //11
 var val11Is = $('input:radio[name="radio11"]').val();
 if(val11Is != null){
 var va111=$('input:radio[name="radio11"]:checked').val();
            if(va111==null){
               layer.msg('请认真填写每一项!',{icon: 5,time:1000});
                return false;
            }
 }
 
  //2
 var val21Is = $('input:radio[name="radio21"]').val();
 if(val21Is != null){
 var va211=$('input:radio[name="radio21"]:checked').val();
            if(va211==null){
               layer.msg('请认真填写每一项!',{icon: 5,time:1000});
                return false;
            }
 }
 
 
   //10
 var aradio1Is = $('input:radio[name="aradio1"]').val();
 if(aradio1Is != null){
 var varadio1=$('input:radio[name="aradio1"]:checked').val();
            if(varadio1==null){
               layer.msg('请认真填写每一项!',{icon: 5,time:1000});
                return false;
            }
 }
 
 
 
 
 //L1
 var lvalIs = $('input:checkbox[name="layout"]').val();
 if(lvalIs != null){
  		var lvalIs=$('input:checkbox[name="layout"]:checked').val();
            if(lvalIs==null){
                layer.msg('请认真填写每一项!',{icon: 5,time:1000});
                return false;
            }
 }
 //L4
 var lval1Is = $('input:checkbox[name="layout1"]').val();
 if(lval1Is != null){
  		var lval1Is=$('input:checkbox[name="layout1"]:checked').val();
            if(lval1Is==null){
                layer.msg('请认真填写每一项!',{icon: 5,time:1000});
                return false;
            }
 }
 
  //L5
 var lval2Is = $('input:checkbox[name="layout2"]').val();
 if(lval2Is != null){
  		var lval2Is=$('input:checkbox[name="layout2"]:checked').val();
            if(lval2Is==null){
                layer.msg('请认真填写每一项!',{icon: 5,time:1000});
                return false;
            }
 }
 
   //L10
 var lval3Is = $('input:checkbox[name="layout3"]').val();
 if(lval3Is != null){
  		var lval3Is=$('input:checkbox[name="layout3"]:checked').val();
            if(lval3Is==null){
                layer.msg('请认真填写每一项!',{icon: 5,time:1000});
                return false;
            }
 }
 
    //L10
 var lval4Is = $('input:checkbox[name="layout4"]').val();
 if(lval4Is != null){
  		var lval4Is=$('input:checkbox[name="layout4"]:checked').val();
            if(lval4Is==null){
                layer.msg('请认真填写每一项!',{icon: 5,time:1000});
                return false;
            }
 }
 
     //L10
 var lval5Is = $('input:checkbox[name="layout5"]').val();
 if(lval5Is != null){
  		var lval5Is=$('input:checkbox[name="layout5"]:checked').val();
            if(lval5Is==null){
                layer.msg('请认真填写每一项!',{icon: 5,time:1000});
                return false;
            }
 }

  
  var inputArrayLength=inputArray.length;
  //循环input元素数组
  for(var int=0;int<inputArrayLength;int++){
      //判断每个input元素的值是否为空
      if( inputArray[int].value==null || inputArray[int].value==''){
          //alert('第'+(int+1)+'个input的值为空.');
         // alert("请认真填写每一项");
         layer.msg('请认真填写每一项!',{icon: 5,time:1000});
          return false;
      }
  } 
var aBox=getByClass("btn selected");
var lable="";
    for(var i=0;i<aBox.length;i++){
       //alert(aBox[i].innerHTML);
       lable+= aBox[i].innerHTML+",";
    }
     //alert("lable="+lable);
 $("#lableinfo").val(lable);
 var lables = $("#lableinfo").val();
$("#form").submit();
$("#fade").show();
document.documentElement.style.overflow = "hidden";

var index = layer.load(1, {
  shade: [0.1,'#fff'] //0.1透明度的白色背景
 /*  (".layui-layer-content").hide(); */
});

textss();
document.documentElement.style.overflow = "hidden";
$("#fade").show();
var event_f = function(e){e.preventDefault();}  
document.body.addEventListener('touchmove', event_f, false);  
}
 
 

function textss(){
$("#fade").show();
var index = layer.load(1, {
  shade: [0.1,'#fff'] //0.1透明度的白色背景
});
var event_f = function(e){e.preventDefault();}  
document.body.addEventListener('touchmove', event_f, false);  
}  


</script>
<script type="text/javascript">
function test(){
var s = "";
s += " 网页正文全文高："+ document.body.scrollHeight;
//alert(s);
}
test();

 $(function(){
  $("#weibo").keyup(function(){
   var len = $(this).val().length;
   if(len > 139){
    $(this).val($(this).val().substring(0,140));
   }
   var num = 140 - len;
   if(num<0){
   num = 0;
   }
   
   $("#word").text(num);
  });
 });
</script>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.js"></script> 
<script type="text/javascript" src="src/DateTimePicker.js"></script>

<script type="text/javascript">
		$(function(){
		
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
		
		})

		</script>
</html>