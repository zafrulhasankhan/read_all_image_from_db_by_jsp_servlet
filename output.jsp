<%-- 
    Document   : output
    Created on : May 14, 2020, 2:41:09 AM
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
            String name = session.getAttribute("name").toString();
              session.setAttribute("name", name);
           
            %>
            
            <h1>${name}</h1>
    </body>
</html>
