<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
</head>
<body>

	<br><br>

	<ul role="tablist" class="nav nav-tabs">
        <li <%if(request.getRequestURI().contains("admin_")){out.print("class='active'");}%> role="presentation"><a href="adminEdit.action">个人信息</a></li>
        <li <%if(request.getRequestURI().contains("company_")){out.print("class='active'");}%> role="presentation"><a href="companyEdit.action">公司信息</a></li>
        <li <%if(request.getRequestURI().contains("news_")){out.print("class='active'");}%> role="presentation"><a href="newsList.action">新闻管理</a></li>
        <li <%if(request.getRequestURI().contains("category_")){out.print("class='active'");}%> role="presentation"><a href="categoryList.action">类目管理</a></li>
        <li <%if(request.getRequestURI().contains("product_")){out.print("class='active'");}%> role="presentation"><a href="productList.action">产品管理</a></li>
        <li <%if(request.getRequestURI().contains("example_")){out.print("class='active'");}%> role="presentation"><a href="exampleList.action">案例管理</a></li>
        <li <%if(request.getRequestURI().contains("gbook_")){out.print("class='active'");}%> role="presentation"><a href="gbookList.action">留言管理</a></li>
        <li role="presentation"><a href="admin.action">注销</a></li>
    </ul>

</body>
</html>