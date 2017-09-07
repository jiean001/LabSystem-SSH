<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>${labInfoView.laboratoryName}-首页</title>
<link type="text/css" rel="stylesheet" href="index/css/css.css" />

</head>

<body>
	<div id="all">
		<div id="left">
			<s:iterator value="researchFieldViews" status="li">
				<div id="leftbutton1">
					<s:property value="researchFieldName" />
				</div>
				<p></p>
			</s:iterator>

		</div>
		<div id=right>
			<div>${labInfoView.laboratoryTitle}</div>
            <hr />
            <div id="body">老师介绍
                <div>
                   <s:iterator value="teacherSimpleViews" status="li">
                     <a href="people.action?teacherID=${teacherId}" }>
                     <div>
                        <s:property value="teacherName" />
                        <s:property value="profsnTitle" />
                     </div></a>
                   </s:iterator>
            </div>
            </div>
            <hr />
			<hr />
			<div id="body">最新消息</div>
			<div>
				<s:iterator value="newsViews" status="li">
					<div id="leftbutton1">
						<s:property value="newsTitle" />
						<s:property value="newsTime" />
					</div>
					<p></p>
				</s:iterator>
			</div>
			<hr />
			<div id="body">实验室成员</div>
			<hr />
		</div>
		<hr />
	</div>
	<div id="footer" style="float: center;">联系我们</div>
</body>
</html>