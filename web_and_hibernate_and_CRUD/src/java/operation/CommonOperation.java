package operation;

import dao.teacher;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author Aravind Sankaran Nair
 */
public class CommonOperation {
    Session session=null;
    SessionFactory sessionFactory=sessionFactory=new Configuration().configure().buildSessionFactory(); 
     public teacher getLoginDetails(teacher user){
         session=sessionFactory.openSession();
         session.beginTransaction();
         String name=user.getTec_name();
         String email=user.getTec_email();
         
         String SQL_QUERY = "FROM teacher us WHERE us.tec_name = '"+name+"' AND us.tec_email= '"+email+"'";         
         Query query = (Query) session.createQuery(SQL_QUERY);        
            for(Iterator it=query.iterate();it.hasNext();)  
            {  
            teacher u = (teacher)it.next();  
            user.setTec_id(u.getTec_id());
            user.setTec_name(u.getTec_name());
            user.setTec_email(u.getTec_email()); 
            user.setValid(true);
            }  
         session.getTransaction().commit();     
         session.close();  
    return user;   
    }
    
}
