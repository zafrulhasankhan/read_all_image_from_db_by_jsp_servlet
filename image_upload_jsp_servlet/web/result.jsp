<%-- 
    Document   : result
    Created on : May 9, 2020, 1:38:43 AM
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
        <h1>Hello World!</h1>
        <%
String message = request.getParameter("message");
if(message != null){
	out.print(message);
}
%>
    </body>
</html>
