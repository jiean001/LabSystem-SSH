<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<title>${company.name} - 首页</title>
		<link type="text/css" rel="stylesheet" href="index/css/css.css"/>
	</head>

	<body>
    <div id="all">
	<div id="left">
	     <p id="leftbutton1"><a href="research.jsp">机器学习</a></p>
	     <p id="leftbutton2">图像处理</p>
	     <p id="leftbutton3">电脑视觉</p>
	     <p id="leftbutton4">。。</p>
	     <p id="leftbutton5">。。</p>
	</div>
	<div id=right> 
	     <div>实验室</div>
	     <hr />
	     <div id="body">老师介绍</div>
	          <div></div> 
	     <hr />
	     <div id="body">最新消息</div>
	     <hr />
	     <div id="body">实验室成员</div>
	     <hr />
	</div>
	<hr />
	</div>
	<div id="footer" style="float:center;">联系我们</div>
	</body>
</html>