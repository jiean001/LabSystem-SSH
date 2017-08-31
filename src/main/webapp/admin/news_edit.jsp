<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<title>新闻编辑</title>
<meta charset="utf-8" />
<link rel="stylesheet" href="admin/css/bootstrap.css" />
</head>
<body>
<div class="container">

	<%@include file="header.jsp"%>

	<br><br>
	<form class="form-horizontal" action="newsUupdate.action" method="post">
		<input type="hidden" name="news.id" value="${news.id}">
		<div class="form-group">
			<label for="input_name" class="col-sm-2 control-label">标题</label>
			<div class="col-sm-6">
				<input type="text" class="form-control" id="input_name" name="news.title" value="${news.title}" required="required">
			</div>
		</div>
		<div class="form-group">
			<label for="input_content" class="col-sm-2 control-label">内容</label>
			<div class="col-sm-6">
				<textarea class="form-control" rows="3" name="news.intro">${news.intro}</textarea>
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-success">提交</button>
			</div>
		</div>
	</form>
</div>	
</body>
</html>