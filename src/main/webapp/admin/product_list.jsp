<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<title>产品列表</title>
<meta charset="utf-8"/>
<link rel="stylesheet" href="admin/css/bootstrap.css"/> 
</head>
<body>
<div class="container">

	<%@include file="header.jsp" %>
	
	<br>
	
	<div>
		<form class="form-inline" method="post" action="">
			<a class="btn btn-warning" href="productAdd.action">添加产品</a>
		</form>
	</div>
	
	<br>

	<table class="table table-bordered table-hover">

	<tr>
		<th width="5%">ID</th>
		<th width="10%">类目</th>
		<th width="10%">名称</th>
		<th width="20%">介绍</th>
		<th width="10%">图片</th>
		<th width="10%">发布时间</th>
		<th width="10%">首页展示</th>
		<th width="10%">操作</th>
	</tr>
	
	<s:iterator value="productList">
         <tr>
         	<td><p><s:property value="id"/></p></td>
         	<td><p><s:property value="category.name"/></p></td>
         	<td><p><s:property value="name"/></p></td>
         	<td><p><s:property value="intro"/></p></td>
         	<td><p><img src="<s:property value="photo"/>" width="100px" height="100px"></p></td>
			<td><p><s:date name="time"/></p></td>
         	<td><p><s:if test="shown">是</s:if><s:else>否</s:else></p></td>
			<td>
				<p><a class="btn btn-success" href="productEdit.action?product.id=<s:property value="id"/>">修改</a></p>
				<p><a class="btn btn-danger" href="productDelete.action?product.id=<s:property value="id"/>">删除</a></p>
			</td>
       	</tr>
     </s:iterator>
     
</table>

<br>${pageTool}<br>
</div>
</body>
</html>