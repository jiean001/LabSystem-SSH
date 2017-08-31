<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<title>类目列表</title>
<meta charset="utf-8"/>
<link rel="stylesheet" href="admin/css/bootstrap.css"/> 
</head>
<body>
<div class="container">

	<%@include file="header.jsp" %>
	
	<br>

	<table class="table table-bordered table-hover">

	<tr>
		<th width="5%">ID</th>
		<th width="10%">姓名</th>
		<th width="10%">电话</th>
		<th width="10%">邮箱</th>
		<th width="20%">标题</th>
		<th width="20%">内容</th>
		<th width="10%">操作</th>
	</tr>
	
	<s:iterator value="gbookList">
         <tr>
         	<td><p><s:property value="id"/></p></td>
         	<td><p><s:property value="name"/></p></td>
         	<td><p><s:property value="phone"/></p></td>
         	<td><p><s:property value="email"/></p></td>
         	<td><p><s:property value="title"/></p></td>
         	<td><p><s:property value="intro"/></p></td>
			<td>
				<p><a class="btn btn-danger" href="gbookDelete.action?gbook.id=<s:property value="id"/>">删除</a></p>
			</td>
       	</tr>
     </s:iterator>
     
</table>

</div>
</body>
</html>