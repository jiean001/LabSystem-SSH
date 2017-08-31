<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!--关于我们-->
<% if(request.getParameter("part").equals("1")) { %>
	<h1 class="IE6png">
		<span><a href="about.action"><img src="index/image/more01.png" width="36" height="18"/></a></span>
		<a href="about.action">关于我们</a>
	</h1>
	<div class="company">
		<font size="2">&nbsp;&nbsp;&nbsp; ${company.title}</font>
	</div>
<% } %>

<!--产品分类-->
<% if(request.getParameter("part").equals("2")) { %>
	<h1 class="IE6png">
		<span><a href="product.action"><img src="index/image/more01.png" width="36" height="18"/></a>
		</span><a href="product.action">产品分类</a>
	</h1>
	<s:iterator var="category" value="categories">
		<h3 class='IE6png'>
			<a href="product.action?type=${category.id}">${category.name}</a>
		</h3>
	</s:iterator>
<% } %>

<!--联系我们-->
<% if(request.getParameter("part").equals("3")) { %>
	<h1 class="IE6png">
		<span><a href="about.action"><img src="index/image/more01.png" width="36" height="18" /></a>
		</span><a href="about.action">联系我们</a>
	</h1>
	<div class="about">
		<font size=2>
			电话：${company.phone}<br/>
			手机：${company.mobile}<br/>
			地址：${company.address}<br/>
			邮箱：<a href="mailto:${company.email}">${company.email}</a><br/>
			网址：<a href="http://${company.url}"  target="_blank">${company.url}</a><br/>
		</font>
	</div>
<% } %>

<!--案例分类-->
<% if(request.getParameter("part").equals("4")) { %>
	<h1 class="IE6png">
		<span><a href="example.action"><img src="index/image/more01.png" width="36" height="18"/></a>
		</span><a href="example.action">案例分类</a>
	</h1>
	<s:iterator var="category" value="categories">
		<h3 class='IE6png'>
			<a href="product.action?type=${category.id}">${category.name}</a>
		</h3>
	</s:iterator>
<% } %>

<!--业务范围-->
<% if(request.getParameter("part").equals("5")) { %>
	<h1 class="IE6png">
		<span><a href="scope.action"><img src="index/image/more01.png" width="36" height="18"/></a>
		</span><a href="scope.action">业务范围</a>
	</h1>
	<h3 class='IE6png'><a href="scope.action">业务范围</a></h3>
<% } %>
