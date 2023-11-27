<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>

<%
  for(int i = 2; i <= 9; i++){
%>
<h1><%=i%>단></h1>
<%
  for(int j = 1; j <= 9; j++){
%>
<p>
  <%=i%> * <%=j%> = <%=i * j%>
</p>
<%
    }
  }
%>
</body>
</html>