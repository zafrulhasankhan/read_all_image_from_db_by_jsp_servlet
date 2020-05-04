/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate_testing;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Student;

/**
 *
 * @author Zafrul Hasan Nasim 
 */
public class retrieve_student_data {
    public static void main(String[] args) {
        
    
   Session s = connection.controller.getSessionFactory().openSession();
   try{
   Transaction tr = s.beginTransaction();
   List list = (List) s.createQuery("from Student").list();
   Iterator itr = list.iterator();
   while(itr.hasNext()){
       Student stu = (Student) itr.next();
       String name = stu.getName();
       String email = stu.getEmail();
       System.out.println(name);
       System.out.println(email);
       
       
       
       
   }
   
   
}catch(Exception e) {
            System.out.println("");
} 
}
}