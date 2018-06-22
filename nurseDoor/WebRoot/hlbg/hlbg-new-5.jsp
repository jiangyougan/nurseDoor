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
		<!--静脉输液  -->
		<div class="list1" >
			<div class="demo">
		       <div class="col">
					<h4>心理评估:</h4>
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
					<h4>过敏药物及表现:</h4>
					<span class="opt" >
					<!-- <input type="text" value="" id="jilv" name="jilv"> -->
					<textarea style="width: 100%" rows="5" cols="6" value="" id="guominyaowu" name="guominyaowu"></textarea>
					</span>
		        </div>      
		         <div class="col">
					<h4>过敏食物及表现:</h4>
					<span class="opt" >
					<!-- <input type="text" value="" id="jilv" name="jilv"> -->
					<textarea style="width: 100%" rows="5" cols="6" value="" id="guominfood" name="guominfood"></textarea>
					</span>
		        </div>      
		         <div class="col">
					<h4>其他过敏及表现:</h4>
					<span class="opt" >
					<!-- <input type="text" value="" id="jilv" name="jilv"> -->
					<textarea style="width: 100%" rows="5" cols="6" value="" id="guominother" name="guominother"></textarea>
					</span>
		        </div>      
		        
		         <div class="col">
					<h4>用药目的:</h4>
					<span class="opt" >
					<!-- <input type="text" value="" id="jilv" name="jilv"> -->
					<textarea style="width: 100%" rows="5" cols="6" value="" id="mudi" name="mudi"></textarea>
					</span>
		        </div>      
		        
		         <div class="col">
					<h4>药物名称:</h4>
					<span class="opt" >
					<!-- <input type="text" value="" id="jilv" name="jilv"> -->
					<textarea style="width: 100%" rows="5" cols="6" value="" id="mingcheng" name="mingcheng"></textarea>
					</span>
		        </div>      
		        <div class="col">
					<h4>注射部位:</h4>
					<span class="opt" >
					<input type="text" value="" id="buwei" name="buwei">
					</span>
		        </div>   
		        
		              
		        <div class="col">
		          <h4>用药评估:</h4>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout1" id="c6" value="无明显不适">
						<label for="c6">无明显不适</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout1" id="c7" value="批疹">
						<label for="c7">批疹</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout1" id="c8" value="恶心呕吐">
						<label for="c8">恶心呕吐</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout1" id="c9" value="腹痛腹泻">
						<label for="c9">腹痛腹泻</label>
					</span>
					<span class="opt">
						<input class="magic-checkbox" type="checkbox" name="layout1" id="c10" value="头疼头晕">
						<label for="c10">头疼头晕</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout1" id="c11" value="心慌胸闷">
						<label for="c11">心慌胸闷</label>
					</span>
					<span class="opt" >
						<input class="magic-checkbox" type="checkbox" name="layout1" id="c12" value="其他">
						<label for="c12">其他</label>
					</span>
			</div>
		        
		          <div class="col">
					<h4>输液后观察:</h4>
					<span class="opt" >
					<!-- <input type="text" value="" id="guancha" name="guancha"> -->
					<textarea style="width: 100%" rows="5" cols="6" value="" id="guancha" name="guancha"></textarea>
					</span>
		        </div>   
		        
		          <div class="col">
		          <h4>照顾人员:</h4>
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
						<label for="c15">其他</label>
					</span>
			</div>
			</div>
		</div>
</body>
</html>