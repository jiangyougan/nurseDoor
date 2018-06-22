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
<![endif]-->
<title>精品推荐</title>
<style type="text/css">
.table>thead>tr>th, .table>tbody>tr>th, .table>tfoot>tr>th, .table>thead>tr>td, .table>tbody>tr>td, .table>tfoot>tr>td{
vertical-align:middle !important;
}
</style>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"></link></head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 用户中心 <span class="c-gray en">&gt;</span> 用户管理 <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
<form action="${pageContext.request.contextPath}/postThreeInfoByKeyWord.action" method="POST">
	<div class="text-c"> 
	<!-- 日期范围：
		<input type="text" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}'})" id="datemin" class="input-text Wdate" style="width:120px;">
		-
		<input type="text" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d'})" id="datemax" class="input-text Wdate" style="width:120px;">
		 -->
		<input type="text" name="keyword" class="input-text" value="" style="width:250px" placeholder="帖子说明内容模糊查询" id="" name="">
		<button type="submit" class="btn btn-success" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜帖子</button>
		<span class="select-box" style="width:150px">
			<select class="select" id="brandclass" name="brandclass" size="1" onchange="orderState(this.options[this.options.selectedIndex].value)">
				<option value="9" selected>所有帖子</option>
				<option value="0">精华帖</option>
				<!-- <option value="1">正在进行中</option> -->
				<c:forEach items="${PostTwolist }" var="s">
				<option value="${s.postTwoLevelId }">${s.postTwoLevelName }</option>
				</c:forEach>
				
			</select>
			<input type="hidden"  name="postTwoLevelId" value="${postTwoLevelId}" id="selectVal">
		</span>
	</div>
</form>	

	<%-- <div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a href="javascript:;" onclick="member_add('添加用户','member-add.html','','510')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加用户</a></span> <span class="r">共有数据：<strong>${count }</strong> 条</span> </div> --%>
	<div class="mt-20">
	<table class="table table-border table-bordered table-hover table-bg table-sort" style="vertical-align: inherit !improtant;">
		<thead>
			<tr class="text-c">
				<th nowrap="nowrap" width="25"><input type="checkbox" name="" value=""></th>
				<th nowrap="nowrap"  width="100">帖子详情标题</th>
				<th nowrap="nowrap" width="200">说明</th>
				<th nowrap="nowrap" width="20">点赞次数</th>
				<th nowrap="nowrap" width="20">评论次数</th>
				<th nowrap="nowrap" width="50">发帖时间</th>
				<th nowrap="nowrap" width="50">操作</th>
				
			</tr>
		</thead>
		<tbody >
		
			<c:forEach items="${list }" var="s" varStatus="z">
				<tr class="text-c" >
					<td><input type="checkbox" value="1" name=""></td>
					<td style="height: 100px">
						${s.postThreeLevelDetailsTitle }
					</td>
					<td>
					${s.postThreeLevelDetailsSpeak }
					</td>
					<th nowrap="nowrap" width="90">
					${s.postThreeLevelDetailsThingNumber }
					</th>
					<th nowrap="nowrap" width="150">
					${s.postThreeLevelDetailsCommentNumber }
					</th>
					<th nowrap="nowrap" width="100"><fmt:formatDate value="${s.postThreeLevelDetailsCreatetime }" type="both"/></th>
					
					
					<td class="td-manage">
						<a title="编辑" href="javascript:;" onclick="postThreeInfoUpdate('${s.postThreeLevelDetailsId}')" class="ml-5" style="text-decoration:none">
							<i class="Hui-iconfont">&#xe6df;</i>
							</a>
						
						<a title="删除" href="javascript:;" onclick="postThreeDel('${s.postThreeLevelDetailsId}')" class="ml-5" style="text-decoration:none">
							<i class="Hui-iconfont">&#xe6e2;</i>
						</a>
						
						
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	 <div style="text-align: center;" class="bs-example" data-example-id="simple-pagination">
    <nav>
      <ul class="pagination">
       
        <c:if test="${pageNow > 1}">
         <li style="float:left">
          <a href="${pageContext.request.contextPath}/selectPostInfoListByPostTwoId.action?pageNow=${pageNow-1}&postTwoLevelId=${postTwoLevelId}" aria-label="Previous">
            <span aria-hidden="true">«</span>
          </a>
         </li>
        </c:if>
       <c:forEach begin="${start}" end="${end}" var="p">
	       <c:if test="${p == pageNow}">
	         <li><a style="color: red;">${p}</a></li>
		   </c:if>
		   <c:if test="${p != pageNow &&  p != 0}">
	         <li><a href="${pageContext.request.contextPath}/selectPostInfoListByPostTwoId.action?pageNow=${p}&postTwoLevelId=${postTwoLevelId}">${p}</a></li>
	       </c:if>
       </c:forEach> 
       <c:if test="${totalPage > pageNow}">
        <li>
          <a href="${pageContext.request.contextPath}/selectPostInfoListByPostTwoId.action?pageNow=${pageNow+1}&postTwoLevelId=${postTwoLevelId}" aria-label="Next">
            <span aria-hidden="true">»</span>
          </a>
        </li>
       </c:if> 
      </ul>
    </nav>
  </div>			
	
	
	</div>
</div>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script>
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script> 
<script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script> 
<script type="text/javascript">
 function addClick(){
  $('td > img').on('click',function(){
      $(document).on('click',function(){
          $('#bigimg').hide();
      })
      $('#bigimg').attr('src',this.src).show()
        event.stopPropagation();// 点击除自己以外任意元素不
  })
}addClick();

//删除帖子
function postThreeDel(id){
var brandclass = $("#brandclass").val();
	layer.confirm('确认要删除帖子吗？',function(index){
		location.href = "${pageContext.request.contextPath}/postThreeDel.action?postThreeLevelDetailsId="+id+"&postTwoLevelId="+brandclass;
		$(obj).remove();
		layer.msg('已删除!',{icon: 5,time:1000});
	});
}



/*用户-停用*/
function member_stop(obj,id){
var state = "1";
	layer.confirm('确认要停用吗？',function(index){
		location.href = "${pageContext.request.contextPath}/userStateChange.action?userId="+id+"&state="+state;
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="Hui-iconfont">&#xe6e1;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
		$(obj).remove();
		layer.msg('已停用!',{icon: 5,time:1000});
	});
}


/*用户-启用*/
function member_start(obj,id){
var state = "0";
	layer.confirm('确认要启用吗？',function(index){
		location.href = "${pageContext.request.contextPath}/userStateChange.action?userId="+id+"&state="+state;
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
		$(obj).remove();
		layer.msg('已启用!',{icon: 6,time:1000});
	});
}

function orderState(state){
location.href = "${pageContext.request.contextPath}/selectPostInfoListByPostTwoId.action?postTwoLevelId=" + state;
}
//去修改页面
function postThreeInfoUpdate(id){
location.href = "${pageContext.request.contextPath}/gotoPostThreeUpdateInfo.action?postThreeLevelDetailsId=" + id;
}


function test1(){
 var value_s=$('#selectVal').val();
 var osel1=document.getElementById("brandclass"); 
    var opts1=osel1.getElementsByTagName("option");
		var i;	for(i=0;i<osel1.length;i++){
			if(opts1[i].value==value_s){
				//alert(opts[i].value);
				opts1[i].selected=true;	
	}
		}	 		  
}
test1();

</script> 
</body>
</html>