<%--
  Created by IntelliJ IDEA.
  User: parkseungmin
  Date: 11/29/23
  Time: 7:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>학생 - 수정</title>
</head>

<body>
<c:choose>
    <c:when test="{empty student}">
        <c:set var="action" value="/register?id=${student.id}" />
    </c:when>
    <c:otherwise>
        <c:set var="action" value="/update?id=${student.id}" />
    </c:otherwise>
</c:choose>

<form method="post" action="${action}">
    <table>
        <tbody>
        <%--    <form method="post" action="/register">--%>
        <tr>
<%--            <td><label for="id">ID: </label></td>--%>
            <th>ID</th>
            <td><input type= "text" id="id" value="${student.id}" required></td>
        </tr>

        <tr>
            <td><label for="name">이름: </label></td>
            <td><input type= "text" id="name" value="${student.name}" required></td>
        </tr>

        <tr>
<%--            <td><label for="gender">성별: </label></td>--%>
            <th>성별</th>
            <td>
                <input type="radio" name="gender" value="Male" ${student.gender eq 'Male' ? 'checked' : '' } />남
                <input type="radio" name="gender" value="Male" ${student.gender eq 'Female' ? 'checked' : '' } />여
            </td>
        </tr>

        <tr>
            <td><label for="age">나이: </label></td>
            <td><input type="text" id="age" name="age" value="${student.age}" required/></td>
        </tr>

        <tr>
            <td colspan="2">
                <button type="submit">
                    <c:choose>
                        <c:when test="${empty student}">
                            등록
                        </c:when>
                        <c:otherwise>
                            수정
                        </c:otherwise>
                    </c:choose>
                </button>
            </td>
        </tr>

<%--        <input type="submit" value="등록" /> </br>--%>

        </tbody>
    </table>
</form>
</body>
</html>
