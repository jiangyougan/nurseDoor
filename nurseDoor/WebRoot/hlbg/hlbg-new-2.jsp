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
	<!--产妇护理套餐  -->
		<div class="list1" >
			<div class="demo">
			<div class="col">
					<h4>婴儿出生体重:</h4>
					<span class="opt" >
					<input type="text" value="" id="tineishendu" class="number" name="tizhong" maxlength="5">KG
					</span>
		        </div>
			   <div class="col">
					<h4>出生方式:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio" id="r1" value="顺产">
						<label for="r1">顺产</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio" id="r2" value="顺产">
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
					<h4>血压:</h4>
					<span class="opt" >
					<input type="text" value="" class="number" id="xueya" name="xueya" maxlength="6">mmHg
					</span>
		        </div>   
		      <div class="col">
					<h4>体温:</h4>
					<span class="opt" >
					<input type="text" value="" class="number" id="tiwen" name="tiwen" maxlength="4">℃
					</span>
		        </div>   
		        <div class="col">
					<h4>脉搏:</h4>
					<span class="opt" >
					<input type="text" value="" class="number" id="number" name="number" maxlength="3">次/分钟
					</span>
		        </div>    
			
			<div class="col">
					<h4>乳汁:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio4" id="r13" value="多">
						<label for="r13">多</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio4" id="r14" value="少">
						<label for="r14">少</label>
					</span>
		        </div>
			
		     <div class="col">
					<h4>乳房:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio5" id="r16" value="未见异常">
						<label for="r16">未见异常</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio5" id="r17" value="异常">
						<label for="r17">异常</label>
					</span>
		        </div>
			<div class="col">
					<h4>乳胀:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio6" id="r166" value="有">
						<label for="r166">有</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio6" id="r176" value="无">
						<label for="r176">无</label>
					</span>
		        </div>
			 <div class="col">
					<h4>恶露:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio7" id="r167" value="未见异常">
						<label for="r167">未见异常</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio7" id="r177" value="异常">
						<label for="r177">异常</label>
					</span>
		        </div>
			<div class="col">
					<h4>伤口:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio8" id="r168" value="未见异常">
						<label for="r168">未见异常</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio8" id="r178" value="异常">
						<label for="r178">异常</label>
					</span>
		        </div>
		        <div class="col">
					<h4>大便:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio9" id="r169" value="正常">
						<label for="r169">正常</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio9" id="r179" value="便秘">
						<label for="r179">便秘</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio9" id="r189" value="腹泻">
						<label for="r189">腹泻</label>
					</span>
		        </div>
		      <div class="col">
					<h4>其他分类:</h4>
					<span class="opt" >
						<input class="magic-radio" type="radio" name="radio10" id="r1610" value="未见异常">
						<label for="r1610">未见异常</label>
					</span>
					<span class="opt">
						<input class="magic-radio" type="radio" name="radio10" id="r1710" value="异常">
						<label for="r1710">异常</label>
					</span>
		        </div>  
		        
			</div>
		</div>
</body>
</html>