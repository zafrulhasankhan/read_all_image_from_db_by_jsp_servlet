<%-- 
    Document   : registration
    Created on : May 7, 2020, 3:01:39 PM
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
        <form action="regis_servlet2" method="post">
            Name:
            <input type="text" name="name"><br><br>
            Email:
            <input type="text" name="email"><br><br>
           
            <input type="submit" name="register">
        </form>
        <a href="test">list</a>
    </body>
</html>
