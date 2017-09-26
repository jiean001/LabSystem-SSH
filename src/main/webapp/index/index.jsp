<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.Product.*"%>
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
    
    <script type="text/javascript">
    
	    window.onload = function()
	    {
	        
	        var but = document.getElementById("changeL");
	        
	        var bool = but.value;
	        
	        var imag = but.getElementsByTagName("img");
	        
	        var content = but.getElementsByTagName("p");
	        
	        if(bool == "false")
	        {
	            content[0].innerHTML = "English";
	            imag[0].setAttribute("src","image/english.png");
	        }
	        else {
	            content[0].innerHTML = "Chinese";
	            imag[0].setAttribute("src","image/china.png");
	        }
	            
	    }
    
    </script>

</head>

<body>
    <div class="both">
        <div class="all">
            <div class="changeL">
            <form action="index.action" method="get">
                <button value="${language}" type="submit" id="changeL" class="btn btn-default" />
                    <img src="image/china.png" />
                    <p>Chinese</p>
                </button>
            </form>
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
                        <select class="easyui-year" id="year" data-live-search="false">
                            <c:forEach items="${allYears }" var="y">
                                <option value="${y }">
                                ${y }
                            </option>
                            </c:forEach>>
                    </select>
                    </div>
                    <div class="result">
                        <div class="pro">
                            <p class="heng">Student</p>
                            <ul>
                             <c:forEach items="${studentSimplyViews }" var="s">
                                <li>
                                    <div class="list">
                                        <img src="image/${s.stupic }.jpg" />
                                        <p>${s.studentname }</p>
                                    </div>
                                </li>
                             </c:forEach>
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