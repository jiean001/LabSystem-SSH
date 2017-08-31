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
	
	<div>
		<form class="form-inline" method="post" action="categorySave.action">
			<input type="text" class="form-control" id="input_name" name="category.name" placeholder="输入类目名称" required="required" style="width: 300px">
			<input type="submit" class="btn btn-warning" value="添加类目"/>
		</form>
	</div>
	
	<br>

	<table class="table table-bordered table-hover">

	<tr>
		<th width="5%">ID</th>
		<th width="15%">名称</th>
		<th width="10%">操作</th>
	</tr>
	
	<s:iterator value="categoryList">
         <tr>
         	<td><p><s:property value="id"/></p></td>
         	<td><p><s:property value="name"/></p></td>
			<td>
				<p><a class="btn btn-danger" href="categoryDelete.action?category.id=<s:property value="id"/>">删除</a></p>
			</td>
       	</tr>
     </s:iterator>
     
</table>

</div>
</body>
</html>