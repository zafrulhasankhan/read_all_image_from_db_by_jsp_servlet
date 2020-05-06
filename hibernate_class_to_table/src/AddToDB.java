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
Student stu=new Student(); 
stu.setId(10);
stu.setName("nasim");
stu.setEmail("nasim khan");
stu.setGender("male");
stu.setDept("ict");
session.save(stu);
//persisting the object
t.commit();
//transaction is commited
session.close(); 
System.out.println("successfully saved"); } }

