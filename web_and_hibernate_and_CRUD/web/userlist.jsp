<%-- 
    Document   : userlist
    Created on : May 7, 2020, 11:08:04 PM
    Author     : Zafrul Hasan Nasim
--%>

<%@page import="dao.teacher"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table class="table ">
                                <thead>
                                    <tr>
                                        <th style="min-width:50px;">Name </th>
                                        <th style="min-width:70px;">Email</th>
                                        
                                        
                                    </tr>
                                </thead>
                                <tbody>
        <%
                ArrayList<teacher> userlist =(ArrayList) request.getAttribute("userlist");
                
                int i = 0;
                for(teacher te : userlist){
                    i++;
                
        %>
      <tr>
        <td><%= te.getTec_name()%></td>
        <td><%= te.getTec_email()%></td>
        
        
        
      </tr>  
      <%
      }
      %>
      
    </tbody>
                            
    </table>
      <a href="registration.jsp">reguster here</a>
    </body>
</html>
