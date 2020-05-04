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
import pojos.Employee;

/**
 *
 * @author Zafrul Hasan Nasim
 */
public class retrieve_data {
    
    public static void main(String[] args) {
        Session sess = connection.controller.getSessionFactory().openSession(); 
Transaction tx = null; 
try 
{ 
tx = sess.beginTransaction(); 
List list = sess.createQuery("from Employee").list(); 
Iterator itr = list.iterator(); 
while(itr.hasNext()) 
{ 
Employee user = (Employee)itr.next(); 
 int s = user.getSalary();
 String name = user.getFirstName();
    System.out.println(s);
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
