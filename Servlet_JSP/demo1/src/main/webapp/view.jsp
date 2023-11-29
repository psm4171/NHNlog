<%@ taglib prefix="cfmd" uri="http://nhnacademy.com/cfmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: parkseungmin
  Date: 11/28/23
  Time: 7:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>학생 - 조회</title>
        <style>
        table {
            width: 1000px;
            border-collapse: collapse;
            border: 1px #ccc solid;
        }

        table tr>td, th {
            padding: 10px;
            border: 1px #ccc solid;
        }
    </style>

</head>

<body>


<form method="post" action="${action}">
<table>
    <tbody>
    <div class="student-info-container">

        <h1>학생-조회</h1>
        <table>
            <tr>
                <th>ID</th>
                <td>${student.id}</td>
            </tr>
            <tr>
                <th>이름</th>
                <td>${student.name}</td>
            </tr>
            <tr>
                <th>성별</th>
                <td>${student.gender}</td>
            </tr>
            <tr>
                <th>나이</th>
                <td>${student.age}</td>
            </tr>
<%--            <tr>--%>
<%--                <th>등록일</th>--%>
<%--                <td>${cfmd:formatDate(student.createdAt, 'yyyy-MM-dd HH:mm:ss')}</td>--%>
<%--            </tr>--%>
        </table>

    </div>
    </tbody>
</table>
    <ul>
       <td><a href="/list.jsp">리스트</a></td>

        <li>
            <c:url var="update_link" value="/register">
                <c:param name="id" value="${student.id}" />
            </c:url>
            <a href="/update.jsp">수정</a>
        </li>

        <li>
            <form method="post" action="/delete">
                <input type="hidden" name="id" value="${student.id}">
                <input type="submit" value="삭제">
            </form>
        </li>

    </ul>
</form>
</body>
</html>
