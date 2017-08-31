<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<title>公司信息</title>
<meta charset="utf-8"/>
<link rel="stylesheet" href="admin/css/bootstrap.css"/> 
</head>
<body>
<div class="container">

	<%@include file="header.jsp"%>

	<br><br>
	
	<form class="form-horizontal" action="companyUpdate.action" method="post">
		<input type="hidden" name="company.id" value="${company.id}">
		<div class="form-group">
			<label for="input_pass" class="col-sm-1 control-label">公司名称</label>
			<div class="col-sm-5">
				<input type="text" class="form-control" name="company.name" value="${company.name}" required="required">
			</div>
		</div>
		<div class="form-group">
			<label for="input_pass" class="col-sm-1 control-label">公司简介</label>
			<div class="col-sm-5">
				<input type="text" class="form-control" name="company.title" value="${company.title}" required="required">
			</div>
		</div>
		<div class="form-group">
			<label for="input_pass" class="col-sm-1 control-label">详细介绍</label>
			<div class="col-sm-5">
				<textarea class="form-control" rows="6" name="company.intro">${company.intro}</textarea>
			</div>
		</div>
		<div class="form-group">
			<label for="input_pass" class="col-sm-1 control-label">联系电话</label>
			<div class="col-sm-5">
				<input type="text" class="form-control" name="company.phone" value="${company.phone}">
			</div>
		</div>
		<div class="form-group">
			<label for="input_pass" class="col-sm-1 control-label">联系手机</label>
			<div class="col-sm-5">
				<input type="text" class="form-control" name="company.mobile" value="${company.mobile}">
			</div>
		</div>
		<div class="form-group">
			<label for="input_pass" class="col-sm-1 control-label">联系地址</label>
			<div class="col-sm-5">
				<input type="text" class="form-control" name="company.address" value="${company.address}">
			</div>
		</div>
		<div class="form-group">
			<label for="input_pass" class="col-sm-1 control-label">网址</label>
			<div class="col-sm-5">
				<input type="text" class="form-control" name="company.url" value="${company.url}">
			</div>
		</div>
		<div class="form-group">
			<label for="input_pass_new" class="col-sm-1 control-label">邮箱</label>
			<div class="col-sm-5">
				<input type="text" class="form-control" name="company.email" value="${company.email}">
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