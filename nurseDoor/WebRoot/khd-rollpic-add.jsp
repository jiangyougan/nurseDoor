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
<meta charset="utf-8">
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->

<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>添加用户</title>
<style>
.pro_img{ margin-left:10px;margin-top:10px;width:300px;height: 300px;background-color: white; --border-radius:999em;  overflow:hidden;float:left; margin:2% ;position: relative;}
.pro_img img{ position: absolute;left: 50%;top:50%;   transform: translate(-50%,-50%);width: 100%
}
.pro_img {position:relative}
.pro_img input{position: absolute;width: 100%;height: 100%;margin:0;opacity:0;z-index: 100;}

</style>
</head>
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
		}
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

</script>
<body style="overflow-x: hidden;">
<div class="pd-20">
  <form action="roolPicUpdload.action" method="post"  enctype="multipart/form-data" >
   
	  
   
  <div id="main" style="text-align: center !important;">
  <div id="left" style="float:left;text-align: center !important;">
   <div id="l1">
 		<label>建议上传499px X 309px的图片</label>
		<div id='upload'>
		<div>
			<a class='pro_img' id='a1' >
			<input type='file' id='file1'  accept='image/*' multiple='multiple' name='pics' onchange='t1(1)'/>
			<img src='images/upload.png' id='img1' "></a>
			<img id='hidden1' style='display:none;' />
	    </div>
		</div>
	</div>
   <div id="l2" style="text-align: center;">
 			<select class="select" id="brandclass" name="brandclass" size="1" >
				<option value="" selected>所有服务</option>
				<c:forEach items="${list }" var="s" varStatus="z">
				<option value="${s.manageNursingContentId }">${s.manageNursingContentName }</option>
				</c:forEach>
			</select>
	</div>
	 <div id="l3" style="text-align: center;margin-top: 10%;margin-bottom: 10%;">
		<input type="text" name="hrefUrl" id="" value="" placeholder="链接" style="width:250px" class="input-text">
	</div>
	
	 <div class="row cl" style="text-align: center;">
      <div class="col-9 col-offset-3" style="text-align: center;">
        <input class="btn btn-primary radius"  type="button" onclick="submit()" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
      </div>
    </div>
  </div>
   
  </form>
</div>
</div>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 

<script type="text/javascript">
</script>
</body>
</html>