package model;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class TestClass {

	static SessionFactory sf;
	public static void main(String[] args) {
		
		try{
			
			sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				
		}catch (HibernateException e) {
			e.printStackTrace();
		}
		
		TestClass tc=new TestClass();
		tc.insert("Sujay","Hassan");
		tc.insert("Manjunath","Mysore");
		

	}
	private void insert(String name,String address) 
	{
		Session s=sf.openSession();
		Transaction tx=null;
		try{
			tx=s.beginTransaction();
			Employee em=new Employee();
			em.setName(name);
			em.setAddress(address);
			
			s.save(em);
			tx.commit();
			
		}catch (HibernateException e) {
			if(tx!=null)
				tx.rollback();
			e.printStackTrace();
		}
		
	}

}
