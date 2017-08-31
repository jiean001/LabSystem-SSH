<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<title>个人信息</title>
<meta charset="utf-8"/>
<link rel="stylesheet" href="admin/css/bootstrap.css"/> 
</head>
<body>
<div class="container">

	<%@include file="header.jsp"%>

	<br><br>
	
	<form class="form-horizontal" action="adminUpdate.action" method="post">
		<input type="hidden" name="admin.id" value="${admin.id}">
		<input type="hidden" name="admin.username" value="${admin.username}">
		<div class="form-group">
			<label for="input_name" class="col-sm-1 control-label">用户名</label>
			<div class="col-sm-5">${username}</div>
		</div>
		<div class="form-group">
			<label for="input_pass" class="col-sm-1 control-label">原密码</label>
			<div class="col-sm-5">
				<input type="text" class="form-control" id="input_pass" name="admin.password" required="required">
			</div>
		</div>
		<div class="form-group">
			<label for="input_pass_new" class="col-sm-1 control-label">新密码</label>
			<div class="col-sm-5">
				<input type="text" class="form-control" id="input_pass" name="admin.passwordNew" required="required">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-1 col-sm-10">
				<button type="submit" class="btn btn-success">提交修改</button>
			</div>
		</div>
	</form>
	
	<span style="color:red;">${msg}</span>
	
</div>	
</body>
</html>