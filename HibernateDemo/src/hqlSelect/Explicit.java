package hqlSelect;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import assistant.HibernateUtil;
import extend.Customer;


public class Explicit {
	public static void main(String args[]){
		Session session=HibernateUtil.currentSession();
		Transaction tx=session.beginTransaction();
		String sql="select c from Customer c join c.employee e where e.title=:title";
		@SuppressWarnings("unchecked")
		List<Customer>a=session.createQuery(sql).setString("title","经理秘书").list();
        for(Object ele:a){
        	Customer c=(Customer) ele;
        	System.out.println(c.getName());
        	
        }
		tx.commit();
		HibernateUtil.closeSession();
		HibernateUtil.sessionFactory.close();
		
	}
	

}