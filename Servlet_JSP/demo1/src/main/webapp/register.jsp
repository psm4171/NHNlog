<%--
  Created by IntelliJ IDEA.
  User: kang-geon
  Date: 11/28/23
  Time: 10:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/style.css"/>
</head>
<body>
<h1>학생 등록</h1>
<form method="post" action="/register">
    <table>
        <tr>
            <th>ID</th>
            <td><input type="text" name="id" required/></td>
        </tr>
        <tr>
            <th>이름</th>
            <td><input type="text" name="name" required/></td>
        </tr>
        <tr>
            <th>성별</th>
            <td>
                <label>
                    <input type="radio" name="gender" value="M" required> 남
                </label>
                <label>
                    <input type="radio" name="gender" value="F" required> 여
                </label>
            </td>
        </tr>
        <tr>
            <th>나이</th>
            <td><input type="text" name="age" required/></td>
        </tr>
    </table>
    <input type="submit" value="등록"/>
</form>
</body>
</html>
