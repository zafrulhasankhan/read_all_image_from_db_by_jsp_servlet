/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.ImageDao;
import dto.ImageDto;
/**
 *
 * @author Zafrul Hasan Nasim
 */
@WebServlet(name = "ImageViewerController", urlPatterns = {"/ImageViewerController"})
public class ImageViewerController extends HttpServlet {
    
    
    
private static final long serialVersionUID = 1L;

    /**
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
   
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ImageDao imageDao = null;
		imageDao = new ImageDao();
                String name1=req.getParameter("name");
                System.out.println(name1);
                imageDao.find(name1);
		List<ImageDto> list =  imageDao.getData();
		req.setAttribute("list", list);
		RequestDispatcher dispatcher = req.getRequestDispatcher("pdf_reader.jsp");
		dispatcher.forward(req, resp);
	}

   
}


