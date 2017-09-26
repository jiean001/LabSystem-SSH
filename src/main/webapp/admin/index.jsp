<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Teacher page</title>
    <link type="text/css" rel="stylesheet" href="index/css/research.css"/>
  </head>

  <body>
  <div class="all">
    <div class="title">
      <p>${t.teacherName}</p>
    </div>
    <div class="statement">
      <ul>
        <div>
        <li>
          <div class="subtitle">
            <p>基本信息</p>
               <form>
                                   姓名：<input typr="text" name="teachername"></br>
                                   职称：<input type="" name="" value="">讲师  <input type="" name="" value="">副教授</br>
                                   研究方向:<input type="checbox" name="" value="ResearchFild">
                    <ul>
                       <c:forEach items="${teacherSimpleViews }" var="t">
                        <li>
                            <a href="people.action?teacherID=${t.teacherId}"><p>(${t.profsnTitle })</p></a>
                        </li>
                        </c:forEach>
                    </ul></br>
                  photo：
                  TEL：<input typr="text" name="telephone"></br>
                  E-mail:<input typr="text" name="E-mail"></br>                     
               </form>
          </div>
          <div class="content">
              self-introduction:
              </div>
              <div class="paper">
                <ul>
                    <c:forEach items="${r.researchPapers }" var="pa" varStatus="i">
                      <li>
                        <div class="paperlist">
                          <a href="${pa.paperLink }"><p>[&bull;&nbsp;${pa.paperName }]</p></a>
                        </div>
                      </li>
                </div>
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
