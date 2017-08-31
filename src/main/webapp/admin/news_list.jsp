<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<title>新闻列表</title>
<meta charset="utf-8"/>
<link rel="stylesheet" href="admin/css/bootstrap.css"/> 
</head>
<body>
<div class="container">

	<%@include file="header.jsp" %>
	
	<br>
	
	<div>
		<form class="form-inline" method="post" action="">
			<a class="btn btn-warning" href="newsAdd.action">添加新闻</a>
		</form>
	</div>
	
	<br>

	<table class="table table-bordered table-hover">

	<tr>
		<th width="5%">ID</th>
		<th width="15%">标题</th>
		<th width="60%">内容</th>
		<th width="10%">时间</th>
		<th width="10%">操作</th>
	</tr>
	
	<s:iterator value="newsList">
         <tr>
         	<td><p><s:property value="id"/></p></td>
         	<td><p><s:property value="title"/></p></td>
         	<td><p><s:property value="intro"/></p></td>
			<td><p><s:date name="time"/></p></td>
			<td>
				<p><a class="btn btn-success" href="newsEdit.action?news.id=<s:property value="id"/>">修改</a></p>
				<p><a class="btn btn-danger" href="newsDelete.action?news.id=<s:property value="id"/>">删除</a></p>
			</td>
       	</tr>
     </s:iterator>
     
</table>

<br>${pageTool}<br>
</div>
</body>
</html>