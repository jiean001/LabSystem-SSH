<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<title>产品编辑</title>
<meta charset="utf-8" />
<link rel="stylesheet" href="admin/css/bootstrap.css" />
</head>
<body>
<div class="container">
	<%@include file="header.jsp"%>

	<br><br>
	<form class="form-horizontal" action="productUpdate.action" method="post" enctype="multipart/form-data">
		<input type="hidden" name="product.id" value="${product.id}"/>
		<input type="hidden" name="product.photo" value="${product.photo}"/>
		<div class="form-group">
			<label for="input_name" class="col-sm-1 control-label">名称</label>
			<div class="col-sm-6">
				<input type="text" class="form-control" id="input_name" name="product.name" value="${product.name}" required="required">
			</div>
		</div>
		<div class="form-group">
			<label for="input_name" class="col-sm-1 control-label">介绍</label>
			<div class="col-sm-6">
				<input type="text" class="form-control" id="input_name" name="product.intro" value="${product.intro}">
			</div>
		</div>
		<div class="form-group">
			<label for="input_file" class="col-sm-1 control-label">图片</label> 
			<div class="col-sm-6"><img src="${product.photo}" width="100" height="100"/>
				<input type="file" name="upload"  id="input_file" required="required">
			</div>
		</div>
		<div class="form-group">
			<label for="select_topic" class="col-sm-1 control-label">类目</label>
			<div class="col-sm-2">
				<select class="form-control" id="select_topic" name="product.category.id">
					<s:iterator value="categoryList">
						<option value="<s:property value="id"/>" <s:if test="product.category.id==id">selected="selected"</s:if>>
							<s:property value="name"/>
						</option>
					</s:iterator>
				</select>
			</div>
		</div>
		<div class="form-group">
			<label for="select_topic" class="col-sm-1 control-label">推荐</label>
			<div class="col-sm-2">
				<select class="form-control" id="select_topic" name="product.shown">
					<option value="false" <s:if test="!product.shown">selected="selected"</s:if>>否</option>
					<option value="true" <s:if test="product.shown">selected="selected"</s:if>>是</option>
				</select>
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-1 col-sm-10">
				<button type="submit" class="btn btn-success">提交修改</button>
			</div>
		</div>
	</form>
</div>
</body>
</html>