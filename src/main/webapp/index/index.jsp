<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>${company.name} - 首页</title>
</head>

<jsp:include page="header.jsp"/>

<body>

<div id="bodybg">

	<div id="box">
	
		<!----main begin---->
		<div class="main">
	
			<!--left begin-->
			<div id="left" class="left">
			
				<!--关于我们-->
				<s:include value="parts.jsp?part=1"/>
							
				<!--产品分类-->
				<s:include value="parts.jsp?part=2"/>
			
				<!--联系我们-->
				<s:include value="parts.jsp?part=3"/><br>
				
			</div>
			<!-----left end------>
	
	
			<!---right begin--->
			<div id="right" class="right">
			
				<!--最新动态-->
				<div class="bnt">
					<div class="bnt_oen">
						<a href="news.action">最新动态</a></div>
					<div class="bnt_two"></div>
					<div class="bnt_three">
						<a href="news.action" ><img src="index/image/more02.gif" width="33" height="5" /></a>
					</div>
				</div>
				
				<div class="news">
					<ul>
						<s:iterator value="newses">
						<li>
							<span><s:date name="time" format="yyyy-MM-dd hh:mm:ss"/></span>
							<a href="newsmodel.action?id=<s:property value="id"/>"><s:property value="title"/></a>
						</li>
						</s:iterator>
					</ul><br/>
				</div>
			
			
				<!--产品展示-->
				<div class="bnt">
					<div class="bnt_oen"><a href="product.action">产品展示</a></div><div class="bnt_two"></div>
					<div class="bnt_three"><a href="product.action"><img src="index/image/more02.gif" width="33" height="5" /></a></div>
				</div>
				<div class="honor">
					<ul>
						<!-- 获取首页展示的产品信息并展示 -->
						<s:iterator value="products">
							<li>
								<a href="productmodel?id=<s:property value="id"/>">
									<img src="<s:property value="photo"/>" width="210" height="170" class="framed1"></a>
								<h3><a href="productmodel?id=<s:property value="id"/>">
									<s:property value="name"/></a></h3>
							</li>
						</s:iterator>
					</ul>
				</div><br>
			
			</div>
			<!------right end------->
	
		</div>
		<!----main end---->
	
		<jsp:include page="footer.jsp"/>
	
	</div>
</div>
</body>
</html>
