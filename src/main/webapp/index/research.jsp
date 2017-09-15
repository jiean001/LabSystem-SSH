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
        <c:forEach items="${researchDetailsViews }" var="r">
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
                  <li>
                    <div class="paperlist">
                      <p>	&bull;&nbsp;文章列表1</p>
                    </div>
                  </li>
                  <li>
                    <div class="paperlist">
                      <p>	&bull;&nbsp;文章列表2</p>
                    </div>
                  </li>
                  <li>
                    <div class="paperlist">
                      <p>	&bull;&nbsp;文章列表3</p>
                    </div>
                  </li>
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
