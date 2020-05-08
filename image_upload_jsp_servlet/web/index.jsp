<%-- 
    Document   : index
    Created on : May 9, 2020, 1:28:59 AM
    Author     : Zafrul Hasan Nasim
--%>

<html>
    <head>
        <title>Upload Image</title>
    </head>
    
    <body>
    
        <b>Upload | <a href="view.jsp">View</a></b><br/><br/>
        
        <form action="uploadImage" method="post" enctype="multipart/form-data">
            <input type="file" name="image" required="required"/><br/><br/>
            <input type="submit"/>
        </form>
    </body>
</html>
