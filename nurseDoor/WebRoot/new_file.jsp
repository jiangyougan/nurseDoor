<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
		<title></title>
	</head>
	<body>
		<form action="${pageContext.request.contextPath}/testNewFile.action" method="POST">
			<div name='divname0' id='div1'>
				<input type='text' name='input0'/>	
			</div>
			<input type="button" value='+' id='btn' />
			<button type="submit" value="提交">提交</button>
		</form>
	</body>
	
	<script type="text/javascript" src="js/jquery-1.9.1.min.js" ></script>
	<script>
	name=0;
			$('#btn').click(function(event){
			name++;
			name1='input';
			div='divname'
			
			inputname = name1+name;
			divname = div+name;
			alert(inputname);
			var i=$("input[name='input']");
			var d=$("div[name='divname']");
			$("#div1").append("<div name='' ><input name="+"'"+inputname+"'"+" /><img class='img'  src='images/icon_error_s.png'/> </div>"); 
			c1();
		})
		function c1(){
		$('img').unbind("click").click(function(event){
			alert(111);
			$(this).parent().remove();
			//alert(111);
		});
		}
	</script>

</html>
