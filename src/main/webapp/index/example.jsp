<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>成功案例</title>
</head>

<jsp:include page="header.jsp"/>

<body>

<div id="bodybg">

	<div id="box">
	
		<!----main begin---->
		<div class="main">
	
			<!--left-->
			<div id="left" class="left">
				
				<!--成功案例-->
				<s:include value="parts.jsp?part=4"/>
						
				<!--联系我们-->
				<s:include value="parts.jsp?part=3"/>
				
			</div>
			<!-----left end------>
	
			<!---right begin--->
			<div id="right" class="right">
			
				<div class="bnt">
					<div class="bnt_oen">成功案例</div>
					<div class="bnt_four">您当前所在位置：<a href="index.action">首页</a> &gt; 
						<a href="example.action">案例中心</a></div>
				</div>
				
				<div class="honor">
					<ul>
						<!-- 获取首页展示的产品信息并展示 -->
						<s:iterator value="#request.examples">
							<li>
								<a href="examplemodel.action?id=<s:property value="id"/>">
									<img src="<s:property value="photo"/>" width="210" height="170" class="framed1"></a>
								<h3><a href="examplemodel.action?id=<s:property value="id"/>">
									<s:property value="name"/></a></h3>
							</li>
						</s:iterator>
					</ul>
	
					<br>
	
					<div class=pageNavi>
						<div class=wp-pagenavi>
							<span>页码:<font color=red>${page}</font>/${pages} 页</span>
							<a href="example.action<s:if test="type!=null">?type=${type}</s:if>">首页</a>
							<a href="example.action?page=${page-1<1 ? 1 : page-1}<s:if test="type!=null">&type=${type}</s:if>">上一页</a>
							<a href="example.action?page=${page+1>pages ? pages : page+1}<s:if test="type!=null">&type=${type}</s:if>">下一页</a>
							<a href="example.action?page=${pages}<s:if test="type!=null">&type=${type}</s:if>">尾页</a>
						</div>
					</div>
							  
				</div>
			
			</div>
			<!------right end------->
	
		</div>
		<!----main end---->
	
	
		<jsp:include page="footer.jsp"/>
	
	</div>
	
</div>
</body>
</html>
