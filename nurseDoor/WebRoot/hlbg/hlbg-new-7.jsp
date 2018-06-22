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
		<!--输液港护理  -->
		<div class="list1" >
			<div class="demo">
			   <div class="col">
					<h4>部位:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio" id="r1" value="左锁骨下">
						<label for="r1">左锁骨下</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio" id="r2" value="右锁骨下">
						<label for="r2">右锁骨下</label>
					</span>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio" id="r111" value="左颈内">
						<label for="r111">左颈内</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio" id="r211" value="右颈内">
						<label for="r211">右颈内</label>
					</span>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio" id="r121" value="左腹股沟">
						<label for="r121">左腹股沟</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio" id="r221" value="右腹股沟">
						<label for="r221">右腹股沟</label>
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
						<input class="magic-checkbox" type="checkbox" name="layout" id="c12" value="请专科护士会诊">
						<label for="c12">请专科护士会诊</label>
					</span>
			</div>
		        
			</div>
		</div>
</body>
</html>