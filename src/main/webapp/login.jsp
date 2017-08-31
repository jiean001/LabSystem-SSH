<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<s:property value='basePath'/>"/>
<title>login</title>
</head>
<body>

<form action="user!login.action" method="post">
	username:<input type="text" name="username"/><br>
	password:<input type="text" name="password"/>
				<input type="submit" value="login">
</form>

<s:actionmessage/>
<s:debug/>

</body>
</html>