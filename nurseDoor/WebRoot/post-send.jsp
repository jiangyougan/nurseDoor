<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
	<meta charset="utf-8">
	<title>html5客户端表单验证 -</title>
	<link rel="stylesheet" media="screen" href="css/poststyles.css" >
	
	
	
	<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.1/layer.js"></script> 
<script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="lib/Validform/5.3.2/Validform.min.js"></script> 
<script type="text/javascript" src="lib/webuploader/0.1.5/webuploader.min.js"></script> 
<script type="text/javascript" charset="utf-8" src="ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="ueditor.all.min.js"> </script>
<script type="text/javascript" src="lang/zh-cn/zh-cn.js"></script>
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script> 
    <style>
    .contact_form{padding-top:40px;}
	.title {background-color:rgba(0,0,0,0.56); text-align:center; width:100%; position:fixed; top:0; left:0; padding:5px 0;}
.title a {color:#FFF; text-decoration:none; font-size:16px; font-weight:bolder; line-height:24px;}
    </style>
</head>
<body>
<div align="center">
<table border="1" width="47%" height="250" style="border-width: 0px">
	<!-- MSTableType="layout" -->
	<tr>
		<td style="border-style: none; border-width: medium">　
		<form class="contact_form" action="sendPostInfo.action" method="post" name="contact_form" enctype="multipart/form-data">
    <ul>
        <li>
             <h2>发帖</h2>
             <span class="required_notification">* 表示必填项</span>
        </li>
        <li>
            <label for="name">帖子标题:</label>
            <input type="text" name="title"  placeholder="Chinaz" required />
        </li>
        <li>
         <label for="name">帖子描述:</label>
        <textarea name="message" cols="40" rows="6"  required ></textarea>
        </li>
        <li>
            <label for="email">选择帖子关联:</label>
            <select name="postTwoName">
            	<option selected="selected" value="">请选择所属内容</option>
            	<c:forEach items="${list }" var="s">
            	<option value="${s.postTwoLevelId }">${s.postTwoLevelName }</option>
            	</c:forEach>
            </select>
        </li>
         <li>
            <label for="website">是否加精:</label>
            <input type="radio" value="1" style="box-shadow:0px 0px 0px #FFFFFF, 0 0px 0px #FFFFFF inset;width: 50px"  name="jiajin" id="j1"/>是
            <input type="radio" value="0" style="box-shadow:0px 0px 0px #FFFFFF, 0 0px 0px #FFFFFF inset;width: 50px"  name="jiajin" id="j2"/>否
        </li>
        <li>
	        <div class="row cl">
	        <label class="form-label col-3">添加附件：</label>
	        <div class="formControls col-5"> <span class="btn-upload form-group">
	        <input type="file"  name="filepic">
	        </span> </div>
	      <div class="col-4"> </div>
	    </div>
        </li>
        <li style="text-align: center;">
           <label for="message">帖子内容:</label>
           <div style="margin-top: 5%;text-align: center;">
           	 	<script id="editor" type="text/plain" style="width:400px;height:500px;" name="ueditor">
				</script>
           </div>
          
        </li>
        <li>
        	<button class="submit" type="submit">Submit Form</button>
        </li>
    </ul>
</form></td>
	</tr>
</table>
<input type="hidden" value="${poststate }" id="poststate">
</div>
<div style="text-align:center;clear:both">
</div>
</body>
<script type="text/javascript">
function check(){
	var poststate = $("#poststate").val();
	if(poststate == 1){
	self.location=document.referrer;
	alert("关联与加精只能选择一个");
	}else if(poststate == 2){
	self.location=document.referrer;
	alert("添加成功");
	}else if(poststate == 3){
	self.location=document.referrer;
	alert("添加失败");
	}else if(poststate == 4){
	self.location=document.referrer;
	alert("至少选择加精或者关联其中一个");
	}
}
check();
</script>
<script type="text/javascript">
//实例化编辑器
    //建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
    var ue = UE.getEditor('editor');


    function isFocus(e){
        alert(UE.getEditor('editor').isFocus());
        UE.dom.domUtils.preventDefault(e)
    }
    function setblur(e){
        UE.getEditor('editor').blur();
        UE.dom.domUtils.preventDefault(e)
    }
    function insertHtml() {
        var value = prompt('插入html代码', '');
        UE.getEditor('editor').execCommand('insertHtml', value)
    }
    function createEditor() {
        enableBtn();
        UE.getEditor('editor');
    }
    function getAllHtml() {
        alert(UE.getEditor('editor').getAllHtml())
    }
    function getContent() {
        var arr = [];
        arr.push("使用editor.getContent()方法可以获得编辑器的内容");
        arr.push("内容为：");
        arr.push(UE.getEditor('editor').getContent());
        alert(arr.join("\n"));
    }
    function getPlainTxt() {
        var arr = [];
        arr.push("使用editor.getPlainTxt()方法可以获得编辑器的带格式的纯文本内容");
        arr.push("内容为：");
        arr.push(UE.getEditor('editor').getPlainTxt());
        alert(arr.join('\n'))
    }
    function setContent(isAppendTo) {
        var arr = [];
        arr.push("使用editor.setContent('欢迎使用ueditor')方法可以设置编辑器的内容");
        UE.getEditor('editor').setContent('欢迎使用ueditor', isAppendTo);
        alert(arr.join("\n"));
    }
    function setDisabled() {
        UE.getEditor('editor').setDisabled('fullscreen');
        disableBtn("enable");
    }

    function setEnabled() {
        UE.getEditor('editor').setEnabled();
        enableBtn();
    }

    function getText() {
        //当你点击按钮时编辑区域已经失去了焦点，如果直接用getText将不会得到内容，所以要在选回来，然后取得内容
        var range = UE.getEditor('editor').selection.getRange();
        range.select();
        var txt = UE.getEditor('editor').selection.getText();
        alert(txt)
    }

    function getContentTxt() {
        var arr = [];
        arr.push("使用editor.getContentTxt()方法可以获得编辑器的纯文本内容");
        arr.push("编辑器的纯文本内容为：");
        arr.push(UE.getEditor('editor').getContentTxt());
        alert(arr.join("\n"));
    }
    function hasContent() {
        var arr = [];
        arr.push("使用editor.hasContents()方法判断编辑器里是否有内容");
        arr.push("判断结果为：");
        arr.push(UE.getEditor('editor').hasContents());
        alert(arr.join("\n"));
    }
    function setFocus() {
        UE.getEditor('editor').focus();
    }
    function deleteEditor() {
        disableBtn();
        UE.getEditor('editor').destroy();
    }
    function disableBtn(str) {
        var div = document.getElementById('btns');
        var btns = UE.dom.domUtils.getElementsByTagName(div, "button");
        for (var i = 0, btn; btn = btns[i++];) {
            if (btn.id == str) {
                UE.dom.domUtils.removeAttributes(btn, ["disabled"]);
            } else {
                btn.setAttribute("disabled", "true");
            }
        }
    }
    function enableBtn() {
        var div = document.getElementById('btns');
        var btns = UE.dom.domUtils.getElementsByTagName(div, "button");
        for (var i = 0, btn; btn = btns[i++];) {
            UE.dom.domUtils.removeAttributes(btn, ["disabled"]);
        }
    }

    function getLocalData () {
        alert(UE.getEditor('editor').execCommand( "getlocaldata" ));
    }

    function clearLocalData () {
        UE.getEditor('editor').execCommand( "clearlocaldata" );
        alert("已清空草稿箱")
    }
</script>
</html>