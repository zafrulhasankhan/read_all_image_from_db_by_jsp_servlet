package com;
 import db.DBConnection;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
 
@WebServlet("/uploadImage")
@MultipartConfig(
        fileSizeThreshold   = 1024 * 1024 * 1,  // 1 MB
        maxFileSize         = 1024 * 1024 * 10, // 10 MB
        maxRequestSize      = 1024 * 1024 * 15,
           location            = "Uploads")// 15 MB
public class UploadImage extends HttpServlet{
 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
 
		int result = 0;
		
		Part part = req.getPart("image");
 
		if(part != null){
			try{
				
                            
                            
			    
			    
			    PreparedStatement ps = DBConnection.getConnection().prepareStatement("insert into data(image) values(?)");
			    InputStream is = part.getInputStream();
			    ps.setBlob(1, is);
			    result = ps.executeUpdate();
			}
			catch(Exception e){
				e.printStackTrace();
			}	
			
		}
		
		if(result > 0){
	    	resp.sendRedirect("result.jsp?message=Image+Uploaded");
	    }
		else{
			resp.sendRedirect("result.jsp?message=Some+Error+Occurred");
		}
	}
}