/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
import dao.teacher;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpSession;
 
public class UserDAO {
 
    public void addUserDetails(String name,String email) {
        try {
            // 1. configuring hibernate
            Configuration configuration = new Configuration().configure();
 
            // 2. create sessionfactory
            SessionFactory sessionFactory = configuration.buildSessionFactory();
 
            // 3. Get Session object
            Session session = sessionFactory.openSession();
 
            // 4. Starting Transaction
            Transaction transaction = session.beginTransaction();
           
            //retrieve data
            List list = (List) session.createQuery(" from teacher").list();
   Iterator itr = list.iterator();
   while(itr.hasNext()){
       teacher stu = (teacher) itr.next();
       String name1 = stu.getTec_name();
       String email1 = stu.getTec_email();
         
   }
            teacher user = new teacher();
            user.setTec_name(name);
            user.setTec_email(email);
            
            session.save(user);
            transaction.commit();
            System.out.println("\n\n Details Added \n");
 
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            System.out.println("error");
        }
 
    }
 
}
