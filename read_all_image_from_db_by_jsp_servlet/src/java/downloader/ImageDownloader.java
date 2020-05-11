/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package downloader;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.ImageDao;

/**
 *
 * @author Zafrul Hasan Nasim
 */
@WebServlet(name = "ImageDownloader", urlPatterns = {"/ImageDownloader"})
public class ImageDownloader extends HttpServlet {
private static final long serialVersionUID = 1L;
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ImageDao dao = null;
	ServletOutputStream outputStream = null;
	String id = req.getParameter("id");
	dao = new ImageDao();
	byte[] image = dao.getImage(id);
	outputStream = resp.getOutputStream();
	outputStream.write(image);
	outputStream.close();
}
}