<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
table{border-collapse:collapse;border-spacing:0;border-left:1px solid #888;border-top:1px solid #888;background:#efefef;}
th,td{border-right:1px solid #888;border-bottom:1px solid #888;padding:5px 15px;}
th{font-weight:bold;background:#ccc;}
</style>
</head>
<body>
		<!--压疮护理  -->
		<div class="list1" >
			<div class="demo">
			   <div class="col" style="margin-top: 2%">
		        
			<div class="col">
					<h4>部位:</h4>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="radio6" id="r18" value="尾骶部">
						<label for="r18">尾骶部</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="radio6" id="r19" value="外踝">
						<label for="r19">外踝</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="radio6" id="r20" value="髋部">
						<label for="r20">髋部</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="radio6" id="r21" value="足跟">
						<label for="r21">足跟</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="radio6" id="r22" value="其他">
						<label for="r22">其他</label>
					</span>
		        </div>
		        
		        <div class="col">
					<h4>其他:</h4>
					<span class="opt" >
					<!-- <input type="text" value="" id="jilv" name="jilv"> -->
					<textarea style="width: 100%" rows="5" cols="6" value="" id="other" name="other"></textarea>
					</span>
		        </div>    
		          <div class="col">
					<h4>周围组织:</h4>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout3" id="c15" value="正常">
						<label for="c15">正常</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout3" id="c16" value="红肿">
						<label for="c16">红肿</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout3" id="c17" value="硬肿">
						<label for="c17">硬肿</label>
					</span>
		        </div>
		         <div class="col">
					<h4>渗液:</h4>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout4" id="c18" value="无">
						<label for="c18">无</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout4" id="c19" value="血性">
						<label for="c19">血性</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout4" id="c20" value="脓性">
						<label for="c20">脓性</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout4" id="c21" value="其他">
						<label for="c21">其他</label>
					</span>
		        </div>
		        
		        
		        <div class="col">
					<h4>异味:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio7" id="r27" value="无">
						<label for="r27">无</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio7" id="r28" value="有">
						<label for="r28">有</label>
					</span>
		        </div>
		        
		        <div class="col">
					<h4>皮肤护理:</h4>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="aradio1" id="a1" value="使用中性温和的清洁剂清洁身体皮肤">
						<label for="a1">使用中性温和的清洁剂清洁身体皮肤</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="aradio1" id="a2" value="使用乳液维持皮肤滋润">
						<label for="a2">使用乳液维持皮肤滋润</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="aradio1" id="a3" value="使用皮肤保护膜及保护粉">
						<label for="a3">使用皮肤保护膜及保护粉</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="aradio1" id="a4" value="保持床单位、衣物的清洁、平整">
						<label for="a4">保持床单位、衣物的清洁、平整</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="aradio1" id="a5" value="使用吸收垫或干燥垫控制潮湿、及时更换">
						<label for="a5">使用吸收垫或干燥垫控制潮湿、及时更换</label>
					</span>
		        </div>
		        
		        <div class="col">
					<h4>体位与活动:</h4>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout" id="c1" value="定期翻身或更换体位(至少q2h)">
						<label for="c1">定期翻身或更换体位(至少q2h)</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c2" value="建立翻身卡">
						<label for="c2">建立翻身卡</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout" id="c3" value="侧卧位<30°C">
						<label for="c3">侧卧位<30°C</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c4" value="床头抬高<30°C">
						<label for="c4">床头抬高<30°C</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout" id="c5" value="坐轮椅至少一次每15-30分钟抬臂">
						<label for="c5">坐轮椅至少一次每15-30分钟抬臂</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c6" value="指导执行肢体主动被动运动">
						<label for="c6">指导执行肢体主动被动运动</label>
					</span>
		        </div>
		        <div class="col">
					<h4>用辅助用品:</h4>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout1" id="c7" value="骨突部位予保护">
						<label for="c7">骨突部位予保护</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout1" id="c8" value="足部避免受压">
						<label for="c8">足部避免受压</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout1" id="c9" value="使用软枕、翻身垫及其他辅助物支托">
						<label for="c9">使用软枕、翻身垫及其他辅助物支托</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout1" id="c10" value="使用特殊床垫(如气垫床、悬浮床、翻身床)">
						<label for="c10">使用特殊床垫(如气垫床、悬浮床、翻身床)</label>
					</span>
		        </div>
		        
		         <div class="col">
					<h4>敷料使用:</h4>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout2" id="c12" value="使用水胶体敷料如溃疡贴、安普贴等">
						<label for="c12">使用水胶体敷料如溃疡贴、安普贴等</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout2" id="c13" value="使用泡沫类敷料">
						<label for="c13">使用泡沫类敷料</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout2" id="c14" value="其他敷料或产品">
						<label for="c14">其他敷料或产品</label>
					</span>
		        </div>
		      
		          <div class="col">
		          <h4>照顾人员:</h4>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout5" id="c151" value="本人">
						<label for="c151">本人</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout5" id="c161" value="家属">
						<label for="c161">家属</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout5" id="c171" value="其他">
						<label for="c171">其他</label>
					</span>
			</div>
			</div>
		</div>
</body>
</html>