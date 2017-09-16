<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link type="text/css" rel="stylesheet" href="index/css/people.css"/>
<title>教师简介</title>
</head>
<body>
<div id="all" class="fontcolor">
  <div class="box" id="box">
      <div id="left"><img src="../images/${teacherView.teacherPic }.jpg"></div>
      <div id="right">
         <div class="name"><a>${teacherView.teacherName}</a> </div>
         <div class="info">
           <a>E-mail:${teacherView.teacherEmail}</a></br></br>
           <a>Tel:${teacherView.teacherPhone}</a>
         </div>
       </div>
  </div>
  <div class="box" id="box1">Introduce：${teacherView.teacherIntro }</div>
  <div class="box" id="box2">Project:
    <br />
    <ul>
	    <c:forEach items="${projectSimpleViews }" var="p">
	    <li>
	        <p>${p.proName }:${p.proIntro }</p>
	    </li>
	    </c:forEach>
    </ul>
  </div>
  <div class="box" id="box3">Publication：
    <br />
    <ul>
        <c:forEach items="${paperSimpleViews }" var="p">
        <li>
            <a href="${p.paperLink }"><p>${p.paperName }</p></a>
        </li>
        </c:forEach>
    </ul>
  </div>
</div >
</body>
</html>