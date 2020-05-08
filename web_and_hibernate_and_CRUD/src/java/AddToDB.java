import dao.teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration;
 
public class AddToDB {
    //int i = 0;

public static void main(String[] args) { 
    //new StoreData().i = 5;
//creating configuration object 
Configuration cfg=new Configuration(); 
cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file
//creating seession factory object 
SessionFactory factory=cfg.buildSessionFactory(); 
//creating session object
Session session=factory.openSession(); 
//creating transaction object
Transaction t=session.beginTransaction();
teacher te = new teacher();
te.setTec_name("nasim");
te.setTec_email("nasim@gmail.com2020");
te.setPass("123");
//persisting the objec
t.commit();
//transaction is commited
session.close(); 
System.out.println("successfully saved"); } }

