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
public class Hibernate_testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Session s=connection.controller.getSessionFactory().openSession();
        Transaction tr = s.beginTransaction();
        pojos.Student st =new pojos.Student();
        pojos.Student st2 =new pojos.Student();
        st.setName("nasim khan");
        st.setEmail("nasimkhan180033@gmail.com");
        st2.setName("nadim khan");
        st2.setEmail("nadimkhan180033@gmail.com");
        s.save(st);
        s.save(st2);
        tr.commit();
        System.out.println("successfully saved");
        s.close();
        tr =null;
        
    }
    
}
