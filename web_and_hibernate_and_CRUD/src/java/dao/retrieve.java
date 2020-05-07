/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Zafrul Hasan Nasim
 */
public class retrieve {
    public static void main(String[] args) {
        Session sess = controller.getSessionFactory().openSession(); 
Transaction tx = null; 
try 
{ 
tx = sess.beginTransaction(); 
List list = sess.createQuery("from teacher").list(); 
Iterator itr = list.iterator(); 
while(itr.hasNext()) 
{ 
teacher user = (teacher)itr.next(); 
 String name = user.getTec_name();
 String email = user.getTec_email();
    System.out.println(email);
    System.out.println(name);
} 
} 
catch(Exception e) 
{ 
System.out.println(e); 
} 
finally 
{ 
sess.close(); 
} 
    }
    
}