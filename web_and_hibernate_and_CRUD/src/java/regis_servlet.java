/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.teacher;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(urlPatterns = {"/regis_servlet"})
public class regis_servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name =request.getParameter("name");
        String email =request.getParameter("email");
        System.out.println(name);
        System.out.println(email);
        HttpSession session1 = request.getSession();
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory(); 
//creating session object
Session sess=factory.openSession(); 
//creating transaction object
Transaction t=sess.beginTransaction();
teacher stu=new teacher(); 

stu.setTec_name(name);
stu.setTec_email(email);

sess.save(stu);
HttpSession session = request.getSession();
try 
{ 

List list = sess.createQuery("from Employee").list(); 
Iterator itr = list.iterator(); 
while(itr.hasNext()) 
{ 
teacher user = (teacher)itr.next(); 
 
 String name1 = user.getTec_name();
 String email1=user.getTec_email();
    
    session.setAttribute("name", name1);
            session.setAttribute("email", email1);
}


} 
catch(Exception e) 
{ 
System.out.println(e); 
} 

//persisting the objec
t.commit();
//transaction is commited
sess.close(); 
System.out.println("successfully saved"); 
       request.getRequestDispatcher("Success.jsp").forward(request, response);
    }
}
