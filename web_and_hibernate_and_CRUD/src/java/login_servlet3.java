/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.teacher;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import operation.CommonOperation;

/**
 *
 * @author Zafrul Hasan Nasim
 */
@WebServlet(urlPatterns = {"/login_servlet3"})
public class login_servlet3 extends HttpServlet {

    
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        System.out.println(name);
        teacher user=new teacher();
        CommonOperation co=new CommonOperation();
        user.setTec_name(name);
        user.setTec_email(email);
        
        user=co.getLoginDetails(user);
        if(user.isValid()){
            HttpSession session=request.getSession();
            session.setAttribute("currentsession", user);
            response.sendRedirect("Success.jsp?id="+user.getTec_id()+"&uname="+user.getTec_name());
        }else{
            response.sendRedirect("login.jsp");           
        }
        
    }
}
