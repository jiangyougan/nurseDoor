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
	%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
<link rel="stylesheet" media="screen" href="zccss/zzsc.css" />
<link rel="stylesheet" href="zccss/bootstrap.min.css" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="css/selectstyle.css" />
</head>
<style>
	li{
		color: #000000 !important;
	}
	fieldset{
		font-family: "microsoft yahei";
	}
	input{
		font-family: "microsoft yahei";
	}
	body{zoom:100% !important}
</style>
<style>
#upload2{
	width: 100%;
	}
	#upload2 div{
	height:100px;
	width:33.33%;
	float: left;;
	}
	#upload3{
	width: 100%;
	}
	#upload3 div{
	height:100px;
	width:33.33%;
	float: left;;
	}
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
<body>
<div style="display:none;font-family: 'microsoft yahei';"></div>
<form id="msform" action="${pageContext.request.contextPath}/KefuHelpNurseInfoSubmit.action" method="post" enctype="multipart/form-data" >
	<!-- progressbar -->
	<ul id="progressbar">
		<li class="active" >注册账号</li>
		<li id='two' >基本信息</li>
		<li >专业信息</li>
	</ul>
	<!-- fieldsets -->
	<fieldset>
		<h2 class="fs-title">注册账号</h2>
		<div style="">
			<ul style="display: inline;font-family: 'microsoft yahei">
				<li style="display: inline"><span style="margin-left: -2%;">账号:&nbsp;</span></li>
				<li style="display: inline"><input type="text" name="account" id="account" placeholder="请输入手机号码" /></li>
			</ul>
		</div>	
		<div style="">
			<ul style="display: inline;font-family: 'microsoft yahei">
				<li style="display: inline"><span style="margin-left: -2%;">密码:&nbsp;</span></li>
				<li style="display: inline"><input type="password" name="pass1" id="pass1" placeholder="请输入密码" /></li>
			</ul>
		</div>	
		
		<div style="">
			<ul style="display: inline;font-family: 'microsoft yahei">
				<li style="display: inline"><span style="margin-left: -2%;">确认:&nbsp;</span></li>
				<li style="display: inline"><input type="password" name="pass2" id="pass2" placeholder="请确认密码"/></li>
			</ul>
		</div>	
		
		<div style="">
			<ul style="display: inline;font-family: 'microsoft yahei">
				<li style="display: inline"><span style="margin-left: -2%;">昵称:&nbsp;</span></li>
				<li style="display: inline"><input type="text" name="nick" placeholder="请输入昵称" /></li>
			</ul>
		</div>	
		<input type="button" name="next" class="next action-button" value="Next" />
	</fieldset>
	<fieldset id='towinfo'>
		<h2 class="fs-title">基本信息</h2>
		
			<div style="width: 100%">
			<ul>
			<li style="display: inline">
			<div class="">
			<div id='upload2'>
			<div>
			<a class='pro_img' id='a31' name='pic3'>
				<input type='file' id='file31'  accept='image/*' multiple='multiple' name='pics3' onchange='t3(1)'/>
				<img src='images/upload.png' id='img31' "></a>
				<img id='hidden31' style='display:none;' />
				 </div>
			</div>
		</div>
			</li>
			</ul>
		   <br>
		   <span>请上传个人工作照</span>
		</div>
		
		<div style="margin-top: 34%">
			<ul style="display: inline;font-family: 'microsoft yahei">
				<li style="display: inline"><span style="margin-left: -2%;">姓名:&nbsp;</span></li>
				<li style="display: inline"><input type="text" name="truename" placeholder="真实姓名" /></li>
			</ul>
		</div>
		
		<div style="">
			<ul style="display: inline;float: left;font-family: 'microsoft yahei';margin-left: 12.5%;">
				<span >性别:&nbsp;</span>
				<li style="display: inline"><input type="radio" id="radio1" name="sex" value="1"/><span style="font-size: 10px;">男</span></li>&nbsp;&nbsp;
				<li style="display: inline"><input type="radio" id="radio2" name="sex" value="2"/><span style="font-size: 10px;">女</span></li>
			</ul>
		</div><br />
		
		<div style="">
			<ul style="display: inline;font-family: 'microsoft yahei">
				<li style="display: inline"><span style="margin-left: -44%;">证号:&nbsp;</span></li>
				<li style="display: inline"><input type="text" name="card" id="card" placeholder="身份证号" /></li>
			</ul>
		</div>	
		
		<div style="">
			<ul style="display: inline;font-family: 'microsoft yahei">
				<li style="display: inline"><span style="margin-left: -2%;">电话:&nbsp;</span></li>
				<li style="display: inline"><input type="text" name="phone" placeholder="联系电话"></li>
			</ul>
		</div>	
		
		<div style="">
			<ul style="display: inline;font-family: 'microsoft yahei">
				<li style="display: inline"><span style="margin-left: -2%;">地址:&nbsp;</span></li>
				<li style="display: inline"><input type="text" name="adree" placeholder="地址"></li>
			</ul>
		</div>	
		
		<div style="">
			<ul style="display: inline;font-family: 'microsoft yahei">
				<li style="display: inline"><span style="margin-left: -2%;">语言:&nbsp;</span></li>
				<li style="display: inline"><input type="text" name="language" placeholder="英文逗号隔开,如:英语,德语"></li>
			</ul>
		</div>	
		
		<div style="">
			<ul style="display: inline;font-family: 'microsoft yahei">
				<li style="display: inline"><span style="margin-left: -2%;">邮箱:&nbsp;</span></li>
				<li style="display: inline"><input type="text" name="emile" placeholder="邮箱"></li>
			</ul>
		</div>	
		<div style="width: 100%">
			<ul>
			<li style="display: inline">
			<div class="">
			<div id='upload2'>
			<div>
			<a class='pro_img' id='a21' name='pic2'>
				<input type='file' id='file21'  accept='image/*' multiple='multiple' name='pics2' onchange='t2(1)'/>
				<img src='images/upload.png' id='img21' "></a>
				<img id='hidden21' style='display:none;' />
				 </div>
			</div>
		</div>
			</li>
			</ul>
		   <br>
		   <span>请上传身份证件照</span>
		</div><br><br><br>
		
		<input type="button" name="previous" class="previous action-button" value="Previous"  />
		<input type="button" name="next" class="next action-button" value="Next" />
	</fieldset>
	<fieldset>
		<h2 class="fs-title">专业信息</h2>
		<div style="">
			<ul style="display: inline;font-family: 'microsoft yahei">
				<li style="display: inline"><span style="margin-left: 4%;">单位:&nbsp;</span></li>
				<li style="display: inline">
					<select name="unit">
						<option selected="selected" value="">请选择工作单位</option>
						<c:forEach items="${hospitals }" var="s">
							<option  value="${s.hospitalId }">${s.hospitalName }</option>
						</c:forEach>
					</select>
				</li>
			</ul>
		</div>	
		<div style="">
			<ul style="display: inline;font-family: 'microsoft yahei">
				<li style="display: inline"><span style="margin-left: 4%;">科室:&nbsp;</span></li>
				<li style="display: inline">
					<select name="major">
						<option selected="selected" value="">请选择科室</option>
						<c:forEach items="${simpleMajors }" var="s">
							<option  value="${s.simpleMajorId }">${s.simpleMajorName }</option>
						</c:forEach>
					</select>
				</li>
			</ul>
		</div>	
		
		<div style="">
			<ul style="display: inline;font-family: 'microsoft yahei">
				<li style="display: inline"><span style="margin-left: 4%;">职称:&nbsp;</span></li>
				<li style="display: inline">
					<select name="nurseJob">
						<option selected="selected" value="初级护士">初级护士</option>
						<option  value="初级护师">初级护师</option>
						<option  value="中级主管护师">中级主管护师</option>
						<option  value="副主任护师">副主任护师</option>
						<option  value="主任护师">主任护师</option>
					</select>
				</li>
			</ul>
		</div>	
		
		
		<div style="">
			<ul style="display: inline;font-family: 'microsoft yahei">
				<li style="display: inline"><span style="margin-left: --2%;">证书:&nbsp;</span></li>
				<li style="display: inline"><input type="text" name="zuce" placeholder="护士注册号" /></li>
			</ul>
		</div>	
		
		<div style="">
			<ul style="display: inline;font-family: 'microsoft yahei">
				<li style="display: inline"><span style="margin-left: 14%;float: left;">服务:&nbsp;</span></li>
				<section class="main" style="margin-left: 40px">
					<div id="dd" class="wrapper-dropdown-4">选择服务
						<ul class="dropdown">
							<c:forEach items="${NursingContent }" var="s" varStatus="z">
						<li><input type="checkbox" id="el-${z.index+1 }" name="layout" value="${s.manageNursingContentId }"><label for="el-${z.index+1 }">${s.manageNursingContentName }</label></li>
						</c:forEach>
						</ul>
						
					</div>
			</section>
			</ul>
		</div>	
		
		
		<div style="">
			<ul style="display: inline;font-family: 'microsoft yahei">
				<li style="display: inline"><span style="margin-left: --2%;">优势:&nbsp;</span></li>
				<li style="display: inline"><textarea name="good" placeholder="个人优势"></textarea></textarea></li>
			</ul>
		</div>	
		
		<div style="width: 100%">
			<ul>
			<li style="display: inline">
			<div class="">
			<div id='upload'>
			<div>
			<a class='pro_img' id='a1'  name='pic'>
				<input type='file' id='file1'  accept='image/*' multiple='multiple' name='pics1' onchange='t1(1)'/>
				<img src='images/upload.png' id='img1' "></a>
				<img id='hidden1' style='display:none;' />
				 </div>
			</div>
		</div>
			</li>
			</ul>
		   <br>
		   <span>请上传相关照片</span>
		</div><br><br><br>
		<label>例:护士职业照,工作照,执业证书照片</label>
		<input type="button" name="previous" class="previous action-button" value="Previous" />
		<!-- <input type="submit" name="submit" class="submit action-button" value="Submit" onclick="formsubmit()" /> -->
		<input type="button" name="previouss" class="action-button" value="Submit"  onclick="formsubmit()"/>
	</fieldset>
	<input type="text" value="${Registerstate }" id="Registerstate">
</form>
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script> 
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script>
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script> 
<script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script src="http://thecodeplayer.com/uploads/js/jquery-1.9.1.min.js" type="text/javascript"></script>
<script src="http://thecodeplayer.com/uploads/js/jquery.easing.min.js" type="text/javascript"></script>
<script src="js/zzsc.js" type="text/javascript"></script>
</body>
<script type="text/javascript">
function checkstate(){
var Registerstate = $("#Registerstate").val();
//alert(Registerstate);
if(Registerstate == 1){
layer.msg('已存在该账号!',{icon: 5,time:2000});
}else if(Registerstate == 2){
layer.msg('注册成功!',{icon: 1,time:2000});
}else if(Registerstate == 3){
layer.msg('注册失败!',{icon: 5,time:2000});
}
}
checkstate();
</script>
<script type="text/javascript">
//表单提交
function formsubmit(){
//判断身份证
var shenfen = $("#card").val();
var reg = shenfen.match('^\\d{15}$|^\\d{17}[0-9Xx]$');
 if (reg == null) { 
       layer.msg('请输入正确的身份证号!',{icon: 5,time:2000});
       return;
     } 

layer.confirm('确认要提交吗？',function(index){
	var account = $("#account").val();
	//第一次密码
	var pass1 = $("#pass1").val();
	//第二次密码
	var pass2 = $("#pass2").val();
		if(account==null || account==""){
			layer.msg('账号不能为空!',{icon: 5,time:2000});
		}else if(pass1==null || pass1==""){
			layer.msg('说明不能为空!',{icon: 5,time:2000});
		}else if(pass1!=pass2 ){
			layer.msg('两次输入的密码不一致!',{icon: 5,time:2000});
		}
		else{
			$("#msform").submit();
		}
	});
}
</script>
	<script>
name_pic=1;
name_pic1=1;
name_pic2=1;
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
		var count=$("a[name='pic']").length;
		if(count<3){//上传图片的个数
		name_pic++;
	var pic_div="<div><a class='pro_img' name='pic' id='a"+name_pic+"' ><input type='file' id='file"+name_pic+"'  accept='image/*' multiple='multiple' name='pics' onchange='t1("+name_pic+")'/><img src='images/upload.png' id='img"+name_pic+"'></a><img  id='hidden"+name_pic+"' style='display:none;'></div>";
	$('#upload').append(pic_div); 
	}		
}
} 
//图二 
function t2(o){
	if(o==1 || name_pic1!=1){
	var file="file2"+o;
	var img="img2"+o;
	var hid="hidden2"+o;
	var aa="a2"+o;
	}else{
	var file="file2"+name_pic1;
	var img="img2"+name_pic1;
	var hid="hidden2"+name_pic1;
	var aa="a2"+name_pic1;
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
	if(o==name_pic1){
		var count=$("a[name='pic2']").length;
		if(count<1){//上传图片的个数
		name_pic1++;
	var pic_div="<div><a class='pro_img'  name='pic2' id='a2"+name_pic1+"' ><input type='file' id='file2"+name_pic1+"'  accept='image/*' multiple='multiple' name='pics2' onchange='t2("+name_pic1+")'/><img src='images/upload.png' id='img2"+name_pic1+"'></a><img  id='hidden2"+name_pic1+"' style='display:none;'></div>";
	$('#upload2').append(pic_div); 
	}		
}
}
//图片3
function t3(o){
//alert(name_pic);
	if(o==1 || name_pic2!=1){
	var file="file3"+o;
	var img="img3"+o;
	var hid="hidden3"+o;
	var aa="a3"+o;
	}else{

	var file="file3"+name_pic2;
	var img="img3"+name_pic2;
	var hid="hidden3"+name_pic2;
	var aa="a3"+name_pic2;
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
	if(o==name_pic2){
		var count=$("a[name='pic3']").length;
		if(count<1){//上传图片的个数
		name_pic2++;
	var pic_div="<div><a class='pro_img' name='pic3' id='a3"+name_pic2+"' ><input type='file' id='file3"+name_pic2+"'  accept='image/*' multiple='multiple' name='pics3' onchange='t3("+name_pic2+")'/><img src='images/upload.png' id='img3"+name_pic2+"'></a><img  id='hidden3"+name_pic2+"' style='display:none;'></div>";
	$('#upload3').append(pic_div); 
	}
}
}

</script>
<!-- jQuery if needed -->
		<script type="text/javascript">
			
			function DropDown(el) {
				this.dd = el;
				this.opts = this.dd.find('ul.dropdown > li');
				this.val = [];
				this.index = [];
				this.initEvents();
			}
			DropDown.prototype = {
				initEvents : function() {
					var obj = this;

					obj.dd.on('click', function(event){
						$(this).toggleClass('active');
						event.stopPropagation();
					});

					obj.opts.children('label').on('click',function(event){
						var opt = $(this).parent(),
							chbox = opt.children('input'),
							val = chbox.val(),
							idx = opt.index();

						($.inArray(val, obj.val) !== -1) ? obj.val.splice( $.inArray(val, obj.val), 1 ) : obj.val.push( val );
						($.inArray(idx, obj.index) !== -1) ? obj.index.splice( $.inArray(idx, obj.index), 1 ) : obj.index.push( idx );
					});
				},
				getValue : function() {
					return this.val;
				},
				getIndex : function() {
					return this.index;
				}
			}

			$(function() {

				var dd = new DropDown( $('#dd') );

				$(document).click(function() {
					// all dropdowns
					$('.wrapper-dropdown-4').removeClass('active');
				});

			});

		</script>
</html>