<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>研究介绍</title>
    <link type="text/css" rel="stylesheet" href="index/css/research.css"/>
  </head>

  <body>
  <div class="all">
    <div class="title">
      <p>${researchField.researchfieldnameC }</p>
    </div>
    <div class="statement">
      <ul>
        <c:forEach items="${researchDetailsViews }" var="r" varStatus="i">
        <li>
          <div class="subtitle">
            <p>${r.researchName }</p>
          </div>
          <div class="content">
            <div class="left">
              <img src="images/${r.researchIntroPic }.jpg" />
            </div>
            <div class="right">
              <div class="introduce">
                  <p>${r.researchIntro }</p>
              </div>
              <div class="paper">
                <ul>
                    <c:forEach items="${r.researchPapers }" var="pa" varStatus="i">
	                  <li>
	                    <div class="paperlist">
	                      <a href="${pa.paperLink }"><p>[&bull;&nbsp;${pa.paperName }]</p></a>
	                    </div>
	                  </li>
                  </c:forEach>
                </ul>
              </div>
            </div>
          </div>
        </li>
        </c:forEach>
      </ul>
    </div>
  </div>
  </body>
</html>
