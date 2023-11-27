<html>
<head>
    <meta charset="UTF-8"/>
    <title>구구단</title>
</head>
<body>
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