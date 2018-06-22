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
	<%
	String orderSendId = request.getParameter("ordersendId");
	String nurseId = request.getParameter("nurseId");
	String userId = request.getParameter("userId");
	System.out.println("orderSendId="+orderSendId);
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
<title>去评价</title>
<style type="text/css">
        ul{
           list-style-type: none;
        }
        .star_ul li{
            float:left;
        }
    </style>
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script><script type="text/javascript" src="js/jquery-1.9.1.min.js"></script></head>
<body>
<div class="pd-20">
  <form action="${pageContext.request.contextPath}/submitEevaluate.action" method="post" class="form form-horizontal" name="form1" id="form1" enctype="multipart/form-data" >
  <input type="hidden" value="<%=orderSendId %>" name="sendId">
  <input type="hidden" value="<%=nurseId %>" name="nurseId">
   <input type="hidden" value="<%=userId %>" name="userId">
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>评价分数：</label>
      <div class="formControls col-5">
        <!-- <input type="text" class="input-text" value="" placeholder="" id="money" name="money" datatype="*2-16" nullmsg="面额不能为空" maxlength='3'> -->
       <div id="mydiv1" currentIndex="0">
    <ul class="star_ul">
        <li num="1"><img src="images/star_empty.png" class="xing_hui"/></li>
        <li num="2"><img src="images/star_empty.png"  class="xing_hui"/></li>
        <li num="3"><img src="images/star_empty.png"  class="xing_hui"/></li>
        <li num="4"><img src="images/star_empty.png"  class="xing_hui"/></li>
        <li num="5"><img src="images/star_empty.png"  class="xing_hui"/></li>
    </ul>
    <input type="hidden" value="" id="ipt" name="mark">
</div>
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>评价内容：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" value="" placeholder="为空则不限制条件" id="content" name="content" minlength='5' >
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <div class="col-9 col-offset-3">
        <input class="btn btn-primary radius" onclick="check()" type="button" value="&nbsp;&nbsp;提交&nbsp;&nbsp;"/>
      </div>
    </div>
    <input type="hidden" value="${state }" id="test"/>
  </form>
</div>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script>
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script> 
<script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script> 
<script type="text/javascript">


//表单提交
function check()
{
	layer.confirm('确认要提交吗？',function(index){
	var ipt = $("#ipt").val();
	var content = $("#content").val();
		if(ipt==null || ipt==""){
			layer.msg('评分不能为空!',{icon: 5,time:2000});
		}else if(content==null || content==""){
			layer.msg('评价内容不能为空!',{icon: 5,time:2000});
		}else{
			layer.msg('提交成功!',{icon: 6,time:2000});
			$("#form1").submit();
		}
	});
}

function test(){
var str = $("#test").val();
if(str == 1){
layer.msg('评价过了!',{icon: 6,time:2000});
}
if(str == 2){
layer.msg('该订单不存在!',{icon: 5,time:2000});
}
if(str == 3){
layer.msg('评价失败,请重新评价',{icon: 6,time:2000});
}
if(str == 4){
layer.msg('评价成功',{icon: 6,time:2000});
}
}
test();

</script>
    <script type="text/javascript">
        var isclick = false;
        function change(mydivid,num) {
            if (!isclick) {
                var tds = $("#"+mydivid+" ul li");
                for (var i = 0; i < num; i++) {
                    var td = tds[i];
                    $(td).find("img").attr("src","images\/star_full.png");
                }
                var tindex = parseInt($("#"+mydivid).attr("currentIndex"));
  
                tindex = tindex==0?0:tindex+1;
                console.log(tindex)
                for (var j = num; j < tindex; j++) {
                    var td = tds[j];
                    $(td).find("img").attr("src","images\/star_empty.png");
                }
                $("#"+mydivid).attr("currentIndex",num);
                
            }
        }
        function repeal(mydivid,num) {
            if (!isclick) {
                var tds = $("#"+mydivid+" ul li");
                var tindex = $("#"+mydivid).attr("currentIndex");
                tindex = tindex==0?0:tindex+1;
                for (var i = tindex; i < num; i++) {
                    var td = tds[i];
                    $(td).find("img").attr("src","images\/star_empty.png");
                }
                $("#"+mydivid).attr("currentIndex",num);
            }
        }
        function change1(mydivid,num) {
            if (!isclick) {
                change(mydivid,num);

            }
            else {
                alert("Sorry,You had clicked me!");
            }
        }
        $(function(){
            initEvent('mydiv1');
        });
        function initEvent(mydivid) {
            //var tableWjx =$("#tableWjx ul li");
            // var items= tableWjx.getElementsByTagName("ul");

            var tds = $("#"+mydivid+" ul li");
            for (var i = 0; i < tds.length; i++) {
                var td = tds[i];
                // $(td).live('mouseover',function(){var num = $(this).attr("num");change(mydivid,num);});
                //$(td).live('mouseout',function(){var num = $(this).attr("num");repeal(mydivid,num);});
                $(td).on('click',function(){
                    var num = $(this).attr("num");
                    $('#ipt').val(1*num);
                    change1(mydivid,num);
                });
                    
            }
        }
    </script>
</body>
</html>