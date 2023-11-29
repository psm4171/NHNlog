<%--
  Created by IntelliJ IDEA.
  User: parkseungmin
  Date: 11/28/23
  Time: 4:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>학생 - 등록</title>
</head>

<body>
    <c:choose>
        <c:when test="${empty student}">
            <c:set var="action" value="/register" />
        </c:when>
        <c:otherwise>
            <c:set var="action" value="/update" />
        </c:otherwise>
    </c:choose>

    <form method="post" action="${action}">
    <table>
        <tbody>

            <tr>
                <td><label for="id">ID: </label></td>
                <td><input type="text" id="id" name="id" /></td>
            </tr>

            <tr>
                <td><label for="name">이름: </label></td>
                <td><input type="text" id="name" name="name" /></td>
            </tr>

        <tr>
            <td><label>성별: </label></td>
            <td>
                <input type="radio" name="gender" value="Male" />남자
                <input type="radio" name="gender" value="Female" />여자
            </td>
        </tr>

        <tr>
            <td><label for="age">나이: </label></td>
            <td><input type="text" id="age" name="age" /></td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="등록" />
            </td>
        </tr>

        </tbody>
    </table>
    </form>
</body>
</html>
