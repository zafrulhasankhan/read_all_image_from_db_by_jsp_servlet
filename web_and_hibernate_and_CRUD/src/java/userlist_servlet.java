/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.teacher;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Zafrul Hasan Nasim
 */
@WebServlet(urlPatterns = {"/test"})
public class userlist_servlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         HttpSession session = request.getSession();
          ArrayList<teacher> userlist = new ArrayList<teacher>();
          Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory(); 
//creating session object
Session sess=factory.openSession();
       
Transaction tx = null; 
try 
{ 
tx = sess.beginTransaction(); 
List list = sess.createQuery("from teacher").list(); 
Iterator itr = list.iterator(); 
    System.out.println("hello");
while(itr.hasNext()) 
{ 
teacher user = (teacher)itr.next(); 
teacher te = new teacher();
 te.setTec_name( user.getTec_name());
 te.setTec_email(user.getTec_email());
    
    System.out.println(te);   
   userlist.add(te);
                
                request.setAttribute("userlist",userlist);
      
           
} 
} 
catch(Exception e) 
{ 
System.out.println(e); 
} 
request.getRequestDispatcher("userlist.jsp").forward(request, response);
sess.close();
    }
}


