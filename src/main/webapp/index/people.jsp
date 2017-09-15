<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link type="text/css" rel="stylesheet" href="index/css/people.css"/>
<title>教师简介</title>
</head>
<body>
<div id="all" class="fontcolor">
  <div id="box">
      <div id="left"><img src="../images/${teacherView.teacherPic }.jpg"></div>
      <div id="right">
         <div><a>姓名:${teacherView.teacherName}</a> </div>
           <hr style="height:3px; border:none;border-top:1px double #7c7c7c;" />
           <a>邮箱:${teacherView.teacherEmail}</a></br></br>
           <a>电话:${teacherView.teacherPhone}</a>
       </div>
  </div>
  <hr style="height:3px; border:none;border-top:1px double #7c7c7c;"/>
  <div id="box">介绍：${teacherView.teacherIntro }</div>
  <hr style="height:3px; border:none;border-top:1px double #7c7c7c;"/>
  <div id="box">项目：（调用项目）</div>
  <hr style="height:3px; border:none;border-top:1px double #7c7c7c;"/>
  <div id="box">发表：（调用发表文章项目）</div>
</div >
</body>
</html>