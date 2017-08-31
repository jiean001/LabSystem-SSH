<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>成功案例</title>
</head>

<body>

<jsp:include page="header.jsp"/>

<div id="bodybg">

	<div id="box">
	
		<!----main begin---->
		<div class="main">
	
			<!--left-->
			<div id="left" class="left">
				
				<!--成功案例-->
				<s:include value="parts.jsp?part=4"/>
						
				<!--联系我们-->
				<s:include value="parts.jsp?part=3"/>
				
			</div>
			<!-----left end------>
			
	
			<!---right begin--->
			<div id="right" class="right">
			
				<div class="bnt">
					<div class="bnt_oen">成功案例</div>
					<div class="bnt_four">您当前所在位置：<a href="index.action">首页</a> &gt; 
						<a href="example.action">案例中心</a></div>
				</div><br>
				
				<div class="fenlist">
						<table>
							<tr><th align="center"><img src="${example.photo}" width="640px" height="480px"></th></tr>
							<tr><th align="center">${example.category.name } &raquo; ${example.name }</th></tr>
							<tr><td align="center">发布时间：<s:date name="#request.example.time" format="yyyy-MM-dd hh:mm:ss"/></td></tr>
							<tr><td>&nbsp;</td></tr>
							<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;${example.intro }</td></tr>
						</table>
				</div>
			
			</div>
			<!------right end------->
	
		</div>
		<!----main end---->
	
	
		<jsp:include page="footer.jsp"/>
	
	
	</div>
	
</div>
</body>
</html>
