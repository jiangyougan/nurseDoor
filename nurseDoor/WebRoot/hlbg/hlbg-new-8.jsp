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
		<!--胃管护理  -->
		<div class="list1" >
			<div class="demo">
		      <div class="col">
					<h4>精神评估:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio2" id="r5" value="配合治疗">
						<label for="r5">配合治疗</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio2" id="r6" value="抵触情绪">
						<label for="r6">抵触情绪</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio2" id="r7" value="怪异行为">
						<label for="r7">怪异行为</label>
					</span>
		        </div>
		     <div class="col">
					<h4>胃管深度:</h4>
					<span class="opt" >
					<input type="text" value="" class="number" id="tineishendu" name="tineishendu" maxlength="4">cm
					</span>
		      </div>    
		     	<div class="col">
					<h4>固定:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio1" id="r3" value="妥">
						<label for="r3">妥</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio1" id="r4" value="不妥">
						<label for="r4">不妥</label>
					</span>
		        </div>   
		        
		     <div class="col">
					<h4>置管原因:</h4>
					<span class="opt" >
					<!-- <input type="text" value="" id="jilv" name="jilv"> -->
					<textarea style="width: 100%" rows="5" cols="6" value="" id="zhiguan" name="zhiguan"></textarea>
					</span>
		        </div>   
		     
		     <div class="col">
					<h4>通畅:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio3" id="r8" value="是">
						<label for="r8">是</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio3" id="r9" value="否">
						<label for="r9">否</label>
					</span>
		        </div>   
		     
		      <div class="col">
					<h4>状态:</h4>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="radio4" id="r10" value="置负压瓶">
						<label for="r10">置负压瓶</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="radio4" id="r11" value="接引流袋">
						<label for="r11">接引流袋</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="radio4" id="r12" value="鼻饲">
						<label for="r12">鼻饲</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="radio4" id="r13" value="其他">
						<label for="r13">其他</label>
					</span>
		       </div>   
		       
		      <div class="col">
		          <h4>处置:</h4>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout" id="c1" value="鼻饲">
						<label for="c1">鼻饲</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c2" value="拔管">
						<label for="c2">拔管</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout" id="c3" value="更换负压瓶">
						<label for="c3">更换负压瓶</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c4" value="更换引流袋">
						<label for="c4">更换引流袋</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout" id="c5" value="更换固定胶布">
						<label for="c5">更换固定胶布</label>
					</span>
			</div>
			
			 <div class="col">
					<h4>鼻饲物及量:</h4>
					<span class="opt" >
					<textarea style="width: 100%" rows="5" cols="6" value="" id="bishiwu" name="bishiwu"></textarea>
					</span>
		        </div>   
		     
		      <div class="col">
		          <h4>照顾人员:</h4>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout1" id="c6" value="本人">
						<label for="c6">本人</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout1" id="c7" value="家属">
						<label for="c7">家属</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout1" id="c8" value="其他">
						<label for="c8">其他</label>
					</span>
			</div>
		     
		     
			</div>
		</div>
</body>
</html>