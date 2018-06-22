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
<link href="lib/icheck/icheck.css" rel="stylesheet" type="text/css" />
<link href="lib/Hui-iconfont/1.0.7/iconfont.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>添加用户</title>
<%
String goodId = request.getParameter("goodId");
 %>
<style type="text/css">
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
</head>
<body>
<div class="pd-20">
  <form action="updateGoodServicePic.action" method="post" class="form form-horizontal" id="form-member-add" enctype="multipart/form-data">
    <div class="row cl">
    <input type="hidden" value="${state }" id="state">
    <input type="hidden" value="<%=goodId%>" name="goodId"/>
      <label class="form-label col-3"><span class="c-red">*</span>修改图片：</label>
      <div class="formControls col-5">
       <div id='upload'>
			<div>
				<a class='pro_img' id='a1' >
				<input type='file' id='file1'  accept='image/*' multiple='multiple' name='pics' onchange='t1(1)'/>
				<img src='images/upload.png' id='img1' "></a>
				<img id='hidden1' style='display:none;' />
		    </div>
			</div>
      </div>
    </div>
     <div class="row cl">
      <div class="col-9 col-offset-3">
        <input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
      </div>
    </div>
  </form>
</div>
</div>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="lib/Validform/5.3.2/Validform.min.js"></script>
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script>
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script>

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
		if(count<1){//上传图片的个数
		name_pic++;
	var pic_div="<div><a class='pro_img' id='a"+name_pic+"' ><input type='file' id='file"+name_pic+"'  accept='image/*' multiple='multiple' name='pics' onchange='t1("+name_pic+")'/><img src='images/upload.png' id='img"+name_pic+"'></a><img  id='hidden"+name_pic+"' style='display:none;'></div>";
	$('#upload').append(pic_div); 
	}		
}
}

function state(){
var state = $("#state").val();
if(state == 1){
layer.msg('添加成功请刷新页面!',{icon: 5,time:1000});
}
}
state();

</script>
</body>
</html>