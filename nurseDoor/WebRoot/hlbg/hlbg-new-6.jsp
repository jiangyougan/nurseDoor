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
		<!--留置PICC管道护理  -->
		<div class="list1" >
			<div class="demo">
			 <div class="col">
				<h4>上次护理时间:</h4>
				<span class="opt" ><!-- id="date" -->
				<input type="text" value="" id="date" name="date" data-field="datetime" class="input-text" readonly >
				<div id="dtBox"></div>
				</span>
	        </div>
			  <div class="col">
		          <h4>信息来源:</h4>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout2" id="c13" value="本人">
						<label for="c13">本人</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout2" id="c14" value="家属">
						<label for="c14">家属</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout2" id="c15" value="其他">
						<label for="c15">知情者</label>
					</span>
			</div>
			
			   <div class="col">
					<h4>部位:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio" id="r1" value="左臂">
						<label for="r1">左臂</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio" id="r2" value="右臂">
						<label for="r2">右臂</label>
					</span>
		        </div>
			  <div class="col">
					<h4>体内深度:</h4>
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
					<h4>通畅:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio2" id="r5" value="是">
						<label for="r5">是</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio2" id="r6" value="否">
						<label for="r6">否</label>
					</span>
		        </div>
			
			<div class="col">
					<h4>局部:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio3" id="r7" value="无异常">
						<label for="r7">无异常</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio3" id="r8" value="发红">
						<label for="r8">发红</label>
					</span>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio3" id="r9" value="肿胀">
						<label for="r9">肿胀</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio3" id="r10" value="疼痛">
						<label for="r10">疼痛</label>
					</span><span class="opt" >
						<input class="magic-radio" type="radio" name="radio3" id="r11" value="渗血">
						<label for="r11">渗血</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio3" id="r12" value="渗液">
						<label for="r12">渗液</label>
					</span>
		        </div>
			<div class="col">
					<h4>导管相关性血液感染:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio4" id="r13" value="可疑">
						<label for="r13">可疑</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio4" id="r14" value="确诊">
						<label for="r14">确诊</label>
					</span>
		        </div>
			
				<div class="col">
		          <h4>处理:</h4>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout" id="c1" value="外用喜疗妥软膏">
						<label for="c1">外用喜疗妥软膏</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c2" value="抬高患肢">
						<label for="c2">抬高患肢</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout" id="c3" value="硫酸镁外敷">
						<label for="c3">硫酸镁外敷</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c4" value="洗必泰敷料">
						<label for="c4">洗必泰敷料</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout" id="c5" value="热敷">
						<label for="c5">热敷</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c6" value="纱布压迫止血">
						<label for="c6">纱布压迫止血</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout" id="c7" value="明胶海绵止血">
						<label for="c7">明胶海绵止血</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c8" value="更换薄膜">
						<label for="c8">更换薄膜</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout" id="c9" value="更换连接器">
						<label for="c9">更换连接器</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c10" value="尿酸酶封管">
						<label for="c10">尿酸酶封管</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c11" value="稀释肝素液封管">
						<label for="c11">稀释肝素液封管</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c12" value="稀释肝素液封管">
						<label for="c12">其他处理</label>
					</span>
			</div>
		
			<div class="col">
		          <h4>拔管:</h4>
		          <span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout1" id="a13" value="时限到">
						<label for="a13">未拔管</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout1" id="a1" value="时限到">
						<label for="a1">时限到</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout1" id="a2" value="治疗结束">
						<label for="a2">治疗结束</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout1" id="a3" value="发热">
						<label for="a3">发热</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout1" id="a4" value="局部感染">
						<label for="a4">局部感染</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout1" id="a5" value="堵管">
						<label for="a5">堵管</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout1" id="a6" value="血栓">
						<label for="a6">血栓</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout1" id="a7" value="部分脱出">
						<label for="a7">部分脱出</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout1" id="a8" value="导管完全脱出">
						<label for="a8">导管完全脱出</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout1" id="a9" value="渗血"> 
						<label for="a9">渗血</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout1" id="a10" value="渗液">
						<label for="a10">渗液</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout1" id="a11" value="导管漏液">
						<label for="a11">导管漏液</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout1" id="a12" value="其他拔管原因">
						<label for="a12">其他拔管原因</label>
					</span>
			</div>
		        
			</div>
		</div>
</body>
</html>