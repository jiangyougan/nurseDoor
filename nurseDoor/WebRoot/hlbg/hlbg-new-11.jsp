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
		<!--造口护理  -->
		<div class="list1" >
			<div class="demo">
			
				<div class="col">
		          <h4>类型:</h4>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout3" id="c1" value="肠造口">
						<label for="c1">肠造口</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout3" id="c2" value="尿路造口">
						<label for="c2">尿路造口</label>
					</span>
			</div>
			  <div class="col">
					<h4>其他:</h4>
					<span class="opt" >
					<!-- <input type="text" value="" id="jilv" name="jilv"> -->
					<textarea style="width: 100%" rows="5" cols="6" value="" id="other" name="other"></textarea>
					</span>
		        </div>      
		        
		         <div class="">
					<h4>造口大小:</h4>
					<span class="opt" >
					<input type="text" class="number" value="" id="small" name="small" style="width: 20%"/>&nbsp;&nbsp;*&nbsp;&nbsp;<input type="text" class="number" value="" id="big" name="big" style="width: 20%"/>CM
					</span>
		        </div>     
			
			   <div class="col">
					<h4>造口缝线:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio" id="r1" value="已拆">
						<label for="r1">已拆</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio" id="r2" value="未拆除">
						<label for="r2">未拆除</label>
					</span>
		        </div>
		        <div class="col">
					<h4>造口形状:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio11" id="r31" value="圆形">
						<label for="r31">圆形</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio11" id="r41" value="椭圆形">
						<label for="r41">椭圆形</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio11" id="r42" value="不规则">
						<label for="r42">不规则</label>
					</span>
		        </div>
		        
				<div class="col">
					<h4>高度:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio1" id="r3" value="平坦">
						<label for="r3">平坦</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio1" id="r4" value="回缩">
						<label for="r4">回缩</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio1" id="rg41" value="突出">
						<label for="rg41">突出</label>
					</span>
		        </div>
		        
		        <div class="col">
					<h4>支架管:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio2" id="r5" value="有">
						<label for="r5">有</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio2" id="r6" value="无">
						<label for="r6">无</label>
					</span>
		        </div>
			
			<div class="col">
					<h4>颜色:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio3" id="r7" value="正常">
						<label for="r7">正常</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio3" id="r8" value="苍白">
						<label for="r8">苍白</label>
					</span>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio3" id="r9" value="暗红色">
						<label for="r9">暗红色</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio3" id="r10" value="淡紫色">
						<label for="r10">淡紫色</label>
					</span><span class="opt" >
						<input class="magic-radio" type="radio" name="radio3" id="r11" value="黑色">
						<label for="r11">黑色</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio3" id="r12" value="其他">
						<label for="r12">其他</label>
					</span>
		        </div>
			
			
				<div class="col">
		          <h4>并发症:</h4>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout" id="cb1" value="无">
						<label for="cb1">无</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="cb2" value="粪水性皮炎">
						<label for="cb2">粪水性皮炎</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout" id="cb3" value="水肿">
						<label for="cb3">水肿</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c4" value="缺血坏死">
						<label for="c4">缺血坏死</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout" id="c5" value="皮肤黏膜分离">
						<label for="c5">皮肤黏膜分离</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c6" value="出血回缩">
						<label for="c6">出血回缩</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout" id="c7" value="狭窄">
						<label for="c7">狭窄</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c8" value="脱垂">
						<label for="c8">脱垂</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout" id="c9" value="更换连接器">
						<label for="c9">更换连接器</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c10" value="尿酸结晶">
						<label for="c10">尿酸结晶</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c11" value="过敏性皮炎">
						<label for="c11">过敏性皮炎</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c12" value="过敏性皮炎">
						<label for="c12">机械性损伤</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c13" value="造口旁疝">
						<label for="c13">造口旁疝</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c14" value="切口愈合不良">
						<label for="c14">切口愈合不良</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c15" value="肉芽肿">
						<label for="c15">肉芽肿</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout" id="c16" value="其他">
						<label for="c16">其他</label>
					</span>
			</div>
			<div class="col">
		          <h4>处理:</h4>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout1" id="c111" value="肠造口">
						<label for="c111">更换造口袋</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout1" id="c211" value="尿路造口">
						<label for="c211">造口护肤粉</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout1" id="c311" value="肠造口">
						<label for="c311">皮肤保护膜</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout1" id="c411" value="尿路造口">
						<label for="c411">防漏膏</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout1" id="c5111" value="肠造口">
						<label for="c5111">其他</label>
					</span>
			</div>
			
			  <div class="col">
		          <h4>资料来源:</h4>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout2" id="c1311" value="本人">
						<label for="c1311">本人</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout2" id="c1411" value="家属">
						<label for="c1411">家属</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout2" id="c1511" value="其他">
						<label for="c1511">其他</label>
					</span>
			</div>
		        
			</div>
		</div>
</body>
</html>