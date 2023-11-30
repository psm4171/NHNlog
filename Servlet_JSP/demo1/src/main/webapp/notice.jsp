
<%--
  Created by IntelliJ IDEA.
  User: parkseungmin
  Date: 11/28/23
  Time: 9:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="cfmt" uri="http://nhnacademy.com/cfmt" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>공지사항 게시판</title>
    <style>
        table{
            width: 1000px;
            border-collapse: collapse;
            border: 1px #ccc solid;
        }
        table tr>td, th{
            padding: 10px;
            border: 1px #ccc solid;
        }
    </style>
</head>
<body>
    <h1>공지사항 게시판</h1>
    <table>
        <thead>
        <tr>
            <th style = "width: 30%" >제목</th>
            <th style = "width: 20%" >작성자</th>
            <th style = "width: 25%" >조회수</th>
            <th style = "width: 25%" >작성일</th>
        </tr>
        </thead>

    <tbody>
    <c:forEach var="item" items ="${noticeList}">
        <tr>
            <td>${item.subject}</td>
            <td style="text-align: center">${item.name}</td>
            <td style="text-align: center">${item.counter}</td>
            <td style="text-align: center">
                <fmt:formatDate value="${item.createdAt}" pattern="yyyy-MM-dd HH:mm:ss" />
<%--                    ${cfmt:formatDate(item.createdAt, 'yyyy-MM-dd HH:mm:ss')}--%>
            </td>
        </tr>
    </c:forEach>
    </tbody>
    </table>
</body>
</html>
