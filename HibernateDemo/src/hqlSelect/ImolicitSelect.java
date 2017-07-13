package hqlSelect;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import assistant.HibernateUtil;
import extend.Customer;


public class ImolicitSelect {
	public static void main(String args[]){
		Session session=HibernateUtil.currentSession();
		Transaction tx=session.beginTransaction();
		String sql="select c from Customer c where c.employee.name=:name";
		@SuppressWarnings("unchecked")
		List<Customer> a=session.createQuery(sql).setString("name", "qiujw").list();
		
		for(Object ele:a){
			Customer c=(Customer) ele;
			System.out.println(c.getName());
		}
		tx.commit();
		HibernateUtil.closeSession();
		HibernateUtil.sessionFactory.close();
		
	}
	

}
