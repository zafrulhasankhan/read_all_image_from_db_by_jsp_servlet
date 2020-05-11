/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.DbConnection;
/**
 *
 * @author Zafrul Hasan Nasim
 */
@WebServlet(name = "ImageUpload", urlPatterns = {"/ImageUpload"})
public class ImageUpload extends HttpServlet {
private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String image=request.getParameter("image");// we get path of the image
		// now we take image file from the given path thats why we use file input stream
		FileInputStream fis=new FileInputStream(new File(image));
		// fis contains bits and binaries of the image
		// now we store these data into data base.
		Connection con=DbConnection.getConnection();
		try {
		PreparedStatement ps=con.prepareStatement("insert into imageupload(id,name,image)values(?,?,?)");
		ps.setString(1, id);
		ps.setString(2, name);
		ps.setBinaryStream(3, fis);
		int n=ps.executeUpdate();
		if(n>0) {
			response.getWriter().println("Successfully uploaded");
                        
                        
		}
		}catch(Exception e) {System.out.println(e);}
	}

}