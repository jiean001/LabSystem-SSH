<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>新闻中心</title>
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
					<div class="bnt_oen">新闻中心</div>
					<div class="bnt_four">您现在的位置：<a href="index.action">首页</a> &gt; 
						<a href="news.action">新闻中心</a></div>
					<div class="clear"></div>
				</div>
				
				<div class="fenlist">
	
					<ul>
						<!-- 用struts的iterator标签遍历news集合, 并去处每一个name显示 -->
						<s:iterator value="#request.newses">
						<li>
							<a href="newsmodel.action?id=<s:property value="id"/>">
								<span><s:date name="time" format="yyyy-MM-dd hh:mm:ss"/></span>
								<s:property value="title"/></a>
						</li>
						</s:iterator>
					</ul>
	
					<br>
					
					<div class=pageNavi>
						<div class=wp-pagenavi>
							<span>页码:<font color=red>${page}</font>/${pages} 页</span>
							<a href="news.action">首页</a>
							<a href="news.action?page=${page-1<1 ? 1 : page-1}">上一页</a>
							<a href="news.action?page=${page+1>pages ? pages : page+1}">下一页</a>
							<a href="news.action?page=${pages}">尾页</a>
						</div>
					</div>
	
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
