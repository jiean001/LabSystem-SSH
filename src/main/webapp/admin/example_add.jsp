<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<title>案例添加</title>
<meta charset="utf-8" />
<link rel="stylesheet" href="admin/css/bootstrap.css" />
</head>
<body>
<div class="container">
	<%@include file="header.jsp"%>

	<br><br>
	<form class="form-horizontal" action="exampleSave.action" method="post" enctype="multipart/form-data">
		<div class="form-group">
			<label for="input_name" class="col-sm-1 control-label">名称</label>
			<div class="col-sm-6">
				<input type="text" class="form-control" id="input_name" name="example.name"  required="required">
			</div>
		</div>
		<div class="form-group">
			<label for="input_name" class="col-sm-1 control-label">介绍</label>
			<div class="col-sm-6">
				<input type="text" class="form-control" id="input_name" name="example.intro" value="">
			</div>
		</div>
		<div class="form-group">
			<label for="input_file" class="col-sm-1 control-label">图片</label> 
			<div class="col-sm-6">
				<input type="file" name="upload"  id="input_file" required="required">
			</div>
		</div>
		<div class="form-group">
			<label for="select_topic" class="col-sm-1 control-label">类目</label>
			<div class="col-sm-2">
				<select class="form-control" id="select_topic" name="example.category.id">
					<s:iterator value="categoryList">
						<option value="<s:property value="id"/>">
							<s:property value="name"/>
						</option>
					</s:iterator>
				</select>
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-1 col-sm-10">
				<button type="submit" class="btn btn-success">提交保存</button>
			</div>
		</div>
	</form>
</div>
</body>
</html>