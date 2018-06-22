<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<!--尿管护理  -->
		<div class="list1" >
			<div class="demo">
		      <div class="col">
					<h4>一般健康状况:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio2" id="r5" value="良好">
						<label for="r5">良好</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio2" id="r6" value="一般">
						<label for="r6">一般</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio2" id="r7" value="较差">
						<label for="r7">较差</label>
					</span>
		        </div>
		        
			<div class="col">
					<h4>一般精神状况:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio21" id="r51" value="良好">
						<label for="r51">良好</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio21" id="r61" value="一般">
						<label for="r61">一般</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio21" id="r612" value="较差">
						<label for="r612">较差</label>
					</span>
		        </div>
		     <div class="col">
					<h4>护理记录:</h4>
					<span class="opt" >
					<!-- <input type="text" value="" id="jilv" name="jilv"> -->
					<textarea style="width: 100%" rows="5" cols="6" value="" id="jilv" name="jilv"></textarea>
					</span>
		        </div>   
		     
			</div>
		</div>
</body>
</html>