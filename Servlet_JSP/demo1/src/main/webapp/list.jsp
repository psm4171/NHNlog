
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.nhnacademy.student.Student" %>
<%@ page import="com.nhnacademy.student.StudentRepository" %>
<%@ page import="com.nhnacademy.student.MapStudentRepository" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Student - List</title>
    <link rel="stylesheet" href="/style.css">
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
<h1>학생 리스트</h1>
<p><a href="/register">학생(등록)</a></p>
<table>
    <thead>
    <tr>
        <th style="width: 25%">아이디</th>
        <th style="width: 25%">이름</th>
        <th style="width: 20%">성별</th>
        <th style="width: 20%">나이</th>
        <th style="width: 20%">cmd</th>
    </tr>
    </thead>
    <tbody>
<%--    <%--%>
<%--        List<Student> studentList = ((StudentRepository) application.getAttribute("studentRepository")).getStudents();--%>
<%--    %>--%>

    <c:forEach var="student" items="${studentList}">
        <tr>
            <td style="text-align: center">${student.id}</td>
            <td style="text-align: center">${student.name}</td>
            <td style="text-align: center">${student.gender}</td>
            <td style="text-align: center">${student.age}</td>
            <td style="text-align: center"><a href="/edit?id=${student.id}">수정</a> | <a href="/delete?id=${student.id}">삭제</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>