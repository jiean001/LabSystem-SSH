<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>在线留言</title>
</head>

<jsp:include page="header.jsp"/>

<body>

<div id="bodybg">
<div id="box">

	<!----main begin---->
	<div class="main">

		<!--left-->
		<div id="left" class="left">
		
			<!--关于我们-->
			<s:include value="parts.jsp?part=1"/>
					
			<!--联系我们-->
			<s:include value="parts.jsp?part=3"/><br/>
			
		</div>
		<!-----left end------>

		<!---right begin--->
		<div id="right" class="right">
		
			<div class="bnt">
				<div class="bnt_oen">在线留言</div>
				<div class="bnt_four">您现在的位置：<a href="index.action">首页</a> &gt; 
					<a href="gbook.action">在线留言</a></div>
				<div class="clear"></div>
			</div>
			
			<div align="center" class="company">
				<form id="myform">
					<table>
						<tr><th>在线留言</th></tr>
						<tr><td><span style="color:red;">*</span>姓名：<input type="text" name="gbook.name" size="40" id="input_name"/></td></tr>
						<tr><td><span style="color:red;">*</span>电话：<input type="text" name="gbook.phone" size="40" id="input_phone"/></td></tr>
						<tr><td>邮箱：<input type="text" name="gbook.email" size="40"/></td></tr>
						<tr><td>标题：<input type="text" name="gbook.title" size="40"/></td></tr>
						<tr><td>内容：<textarea name="gbook.intro" rows="2" cols="30"></textarea></td></tr>
						<tr><td><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<input type="button" value="提交" id="button_submit"/>&nbsp;
									<input type="reset" value=" 重置 "/>
									<font color="red">${msg }</font>
									</td></tr>
					</table>
				</form>
			</div>
		
		</div>

		<!------right end------->

	</div>
	<!----main end---->

	<jsp:include page="footer.jsp"/>

</div>
</div>
</body>
<script type="text/javascript">
$("#button_submit").on("click", function(){
	if($("#input_name").val()==""){
		alert("姓名不能为空!");return;
	}
	if($("#input_phone").val()==""){
		alert("电话不能为空!");return;
	}
	$.post("gbookAdd.action", $("#myform").serialize(), function(data){
		if(data=="true"){
			$("#myform")[0].reset();
			alert("保存成功!");
		}else{
			alert("请求失败!");
		}
	},"text");
});
</script>
</html>
