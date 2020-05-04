/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate_testing;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Zafrul Hasan Nasim
 */
public class employee_test {
    public static void main(String[] args) {
        Session s=connection.controller.getSessionFactory().openSession();
        Transaction tr = s.beginTransaction();
        pojos.Employee st =new pojos.Employee();
        st.setFirstName("tanvir al");
        st.setLastName("sadi");
        st.setSalary(1000000);
        s.save(st);
        // employee data insert
        
        pojos.Student st2 =new pojos.Student();
        st2.setName("nafis khan");
        st2.setEmail("nafiskhan18009@gmail.com");
        s.save(st2);
        
        // update data process
        pojos.Student stu1 =(pojos.Student)s.load(pojos.Student.class, 5);
        stu1.setName("masud");
        stu1.setEmail("masudkhan@gmail.com");
        s.update(stu1);
        
        // delete process 
        pojos.Employee em1 = (pojos.Employee)s.load(pojos.Employee.class,1);
        s.delete(em1);
        
        
        tr.commit();
        System.out.println("successfully done");
        s.close();
        tr =null;
        
    }
}
