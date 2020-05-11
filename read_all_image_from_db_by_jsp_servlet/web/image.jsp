<%-- 
    Document   : index
    Created on : May 11, 2020, 11:28:54 PM
    Author     : Zafrul Hasan Nasim
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="dto.ImageDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Image</title>
</head>
<body>
<center>
<%
List<ImageDto> list = (ArrayList<ImageDto>)request.getAttribute("list");
%>

<table border="10px">
<thead>
<tr><td>ID</td><td>NAME</td><td>IMAGE</td></tr>
</thead>
<%
for(int i=0;i<list.size();i++){
ImageDto dto = list.get(i);
String id = dto.getId();
String name = dto.getName();
%>
<tr><td><%=id%></td><td><%=name %></td><td><img src="./ImageDownloader?id=<%=id%>" height="550" width="500"/></td></tr>
<%}
%>

</table>
</center>
</body>
</html>