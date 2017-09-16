<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<title>${labInfoView.laboratoryName}-首页</title>
	<link type="text/css" rel="stylesheet" href="index/css/css.css" />

	<script type="text/javascript" src="index/js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="index/js/bootstrap-select.js"></script>
	<link rel="stylesheet" type="text/css" href="index/css/bootstrap-select.css">

	<link href="index/css/bootstrap.min.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="index/js/bootstrap.min.js"></script>

	<script type="text/javascript" src="index/js/randomcolor.js"></script>

</head>

<body>
	<div class="both">
		<div class="all">
			<div class="changeL">
				<button type="submit" id="changeL" class="btn btn-default" />
					<img src="image/china.png" />
					<p>Chinese</p>
				</button>
			</div>
			<div class="left">
				<ul>
				    <c:forEach items="${researchFieldViews }" var="re">
					<li>
						<div class="leftbutton">
							<a href="research.action?reschfdID=${re.researchFieldId }"><p>${re.researchFieldName }</p></a>
						</div>
					</li>
					</c:forEach>
				</ul>
			</div>
			<div class="right">
				<div class="title">
					<p>${labInfoView.laboratoryTitle}</p>
				</div>
				<div class="teacher">
					<p>Faculty</p>
					<ul>
					   <c:forEach items="${teacherSimpleViews }" var="t">
						<li>
							<a href="people.action?teacherID=${t.teacherId}"><p>${t.teacherName }&nbsp;&nbsp;&nbsp;(${t.profsnTitle })</p></a>
						</li>
						</c:forEach>
					</ul>
				</div>
				<div class="newslist">
					<p>Latest News</p>
					<ul>
					   <c:forEach items="${newsViews }" var="n">
						<li>
							<p>${n.newsTitle }:${n.newsContent }</p>
						</li>
                        </c:forEach>
					</ul>
				</div>
				<div class="member">
					<div class="top">
						<p>Lab member</p>
						<select class="year" id="year" data-live-search="false">
						<s:iterator value="${allYears }" id="y">
							<option>
							 <s:if test="%{#y!=null}">
                                <s:property />
                             </s:if>
							</option>
						</s:iterator>
					</select>
					</div>
					<div class="result">
						<div class="pro">
							<p class="heng">Professor</p>
							<ul>
								<li>
									<div class="list">
										<img src="img/1.jpg" />
										<p>name</p>
									</div>
								</li>
							</ul>
						</div>
						<div class="pro">
							<p class="heng">Master</p>
							<ul>
								<li>
									<div class="list">
										<img src="img/1.jpg" />
										<p>name</p>
									</div>
								</li>
								<li>
									<div class="list">
										<img src="img/1.jpg" />
										<p>name</p>
									</div>
								</li>
								<li>
									<div class="list">
										<img src="img/1.jpg" />
										<p>name</p>
									</div>
								</li>
								<li>
									<div class="list">
										<img src="img/1.jpg" />
										<p>name</p>
									</div>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="footer">
			<div class="information">
				<p>Contact Information</p>
			</div>
			<div class="detailinfo">
				<p>Address&nbsp;&nbsp;:&nbsp;&nbsp;${labInfoView.laboratoryAdd }<br /> Tel&nbsp;&nbsp;:&nbsp;&nbsp;${labInfoView.laboratoryEmail }
				</p>
			</div>
		</div>
	</div>
</body>

</html>