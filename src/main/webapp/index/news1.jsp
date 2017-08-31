<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>新闻中心</title>
</head>

<body>

<jsp:include page="header.jsp"/>

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
					<div class="bnt_oen">新闻中心</div>
					<div class="bnt_four">您现在的位置：<a href="index.action">首页</a> &gt; 
					<a href="news.action">新闻中心</a></div>
					<div class="clear"></div>
				</div><br>
				
				<div class="fenlist">
					<table><!-- 使用struts标签来获取数据 -->
						<tr><th align="center"><s:property value="#request.news.title"/></th></tr>
						<tr><td align="center"><s:date name="#request.news.time" format="yyyy-MM-dd hh:mm:ss"/></td></tr>
						<tr><td>&nbsp;</td></tr>
						<tr><td><s:property value="#request.news.intro"/></td></tr>
					</table>
				</div><br><br>
				
			</div>
			<!------right end------->
	
		</div>
		<!----main end---->
	
		<jsp:include page="footer.jsp"/>
		
	</div>
	
</div>
</body>
</html>
