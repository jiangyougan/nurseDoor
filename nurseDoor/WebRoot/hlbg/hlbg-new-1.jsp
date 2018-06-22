<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 时间控件 -->
	

		
</head>
<body>
	<!--新生儿护理套餐  -->
		<div class="list1" >
			<div class="demo">
			<div class="col">
					<h4>出生体重:</h4>
					<span class="opt" >
					<input type="text" class="number" value="" id="tizhong" name="tizhong" maxlength="3">KG
					</span>
		        </div>
	        <div class="col">
				<h4>出生日期:</h4>
				<span class="opt" ><!-- id="date" -->
				<input type="text" value="" id="date" name="date" data-field="datetime" class="input-text" readonly >
				<div id="dtBox"></div>
				</span>
	        </div>
	         <div class="col">
				<h4>体温:</h4>
				<span class="opt" >
				<input type="text" class="number" value=""  id="tiwen" name="tiwen" maxlength="4">℃
				</span>
	        </div>
			   <div class="col">
					<h4>出生方式:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio" id="r1" value="顺产">
						<label for="r1">顺产</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio" id="r2" value="剖产">
						<label for="r2">剖产</label>
					</span>
		        </div>
			  
			
				<div class="col">
					<h4>出生状态:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio1" id="r3" value="足月">
						<label for="r3">足月</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio1" id="r4" value="早产">
						<label for="r4">早产</label>
					</span>
		        </div>
		        <div class="col">
					<h4>精神状态:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio2" id="r5" value="良好">
						<label for="r5">良好</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio2" id="r6" value="一般">
						<label for="r6">一般</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio2" id="r61" value="差">
						<label for="r61">较差</label>
					</span>
		        </div>
		        
			
			<div class="col">
					<h4>外观检查:</h4>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout" id="c1" value="颈部">
						<label for="c1">颈部</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c2" value="胸部">
						<label for="c2">胸部</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout" id="c3" value="腹部">
						<label for="c3">腹部</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c4" value="四肢">
						<label for="c4">四肢</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout" id="c5" value="生殖器">
						<label for="c5">生殖器</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c6" value="肛门">
						<label for="c6">肛门</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout" id="c7" value="头血肿">
						<label for="c7">头血肿</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c8" value="皮肤损伤">
						<label for="c8">皮肤损伤</label>
					</span>
		        </div>
			<div class="col">
					<h4>喂养:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio4" id="r13" value="母乳">
						<label for="r13">母乳</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio4" id="r14" value="混合">
						<label for="r14">混合</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio4" id="r15" value="人工">
						<label for="r15">人工</label>
					</span>
		        </div>
			
		     <div class="col">
					<h4>皮肤:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio5" id="r16" value="黄疸">
						<label for="r16">黄疸</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio5" id="r17" value="湿疹">
						<label for="r17">湿疹</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio5" id="r18" value="红臀">
						<label for="r18">红臀</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio5" id="r181" value="感染">
						<label for="r181">感染</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio5" id="r182" value="正常">
						<label for="r182">正常</label>
					</span>
		        </div>
			
			 <div class="col">
					<h4>脐部:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio6" id="r162" value="出血">
						<label for="r162">出血</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio6" id="r172" value="发炎">
						<label for="r172">发炎</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio6" id="r183" value="正常">
						<label for="r183">正常</label>
					</span>
		        </div>
			
			<div class="col">
					<h4>眼:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio7" id="ryan1" value="红肿">
						<label for="ryan1">红肿</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio7" id="ryan2" value="分泌物多">
						<label for="ryan2">分泌物多</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio7" id="ryan3" value="正常">
						<label for="ryan3">正常</label>
					</span>
		        </div>
		        
		        <div class="col">
					<h4>鹅口疮:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio8" id="re1" value="有">
						<label for="re1">有</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio8" id="re2" value="无">
						<label for="re2">无</label>
					</span>
		        </div>
		        
		    <div class="col">
				<h4>大便次数:</h4>
				<span class="opt" >
				<input type="text" class="number" value="" id="dabiannumber" name="dabiannumber" maxlength="3">
				</span>
	        </div>
		     <div class="col">
				<h4>大便颜色:</h4>
				<span class="opt" >
				<input type="text" value="" id="dabiancolor" name="dabiancolor">
				</span>
	        </div>
	        <div class="col">
				<h4>大便形状:</h4>
				<span class="opt" >
				<input type="text" value="" id="dabianshape" name="dabianshape	">
				</span>
	        </div>
	        <div class="col">
				<h4>哭声:</h4>
				<span class="opt" >
				<input type="text" value="" id="dabianCry" name="dabianCry">
				</span>
	        </div>
	        
			</div>
		</div>
</body>
</html>