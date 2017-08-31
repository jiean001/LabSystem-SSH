<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>关于我们</title>
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
				<s:include value="parts.jsp?part=3"/>
				
			</div>
			<!-----left end------>
	
	
			<!---right begin--->
			<div id="right" class="right">
			
				<div class="bnt">
					<div class="bnt_oen">关于我们</div>
					<div class="bnt_four">您现在的位置：<a href="index.action">首页</a> &gt; <a href="about.action">关于我们</a></div>
					<div class="clear"></div>
				</div><br>
				
				<div class="fenlist">
					<table >
						<tr><th align="left">${company.name }</th></tr>
						<tr><td><pre>${company.intro }</pre></td></tr>
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