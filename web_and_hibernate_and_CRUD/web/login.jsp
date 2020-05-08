<%-- 
    Document   : login
    Created on : May 8, 2020, 1:14:44 AM
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
        <form action="login_servlet3" method="post">
           
            name:
            <input type="text" name="name"><br><br>
            Email:
            <input type="text" name="email"><br><br>
            <input type="submit" name="login">
        </form>
    </body>
</html>
