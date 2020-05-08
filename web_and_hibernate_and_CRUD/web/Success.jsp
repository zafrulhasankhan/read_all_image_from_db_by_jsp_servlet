<%-- 
    Document   : Success
    Created on : May 7, 2020, 4:30:45 PM
    Author     : Zafrul Hasan Nasim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String id=request.getParameter("id");
String un=request.getParameter("uname");
%>
        <h1>successfuly done</h1>
        <h1>${name}</h1>
        <h1>${email}</h1>
        <h1>Welcome <%=un%></h1>
        <h1>Your ID is <%=id%></h1>
        <a href="test">userlist here</a>
    </body>
</html>
