package main;
import org.hibernate.Transaction;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import assistant.HibernateUtil;
import persistClass.Name;
import persistClass.Person;

public class PersonManager
{
	public static void main(String[] args)
	{
		PersonManager mgr = new PersonManager();
		mgr.createAndStorePerson();
		HibernateUtil.sessionFactory.close();
	}

	private void createAndStorePerson()
	{
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		// 创建Person对象
		Person person = new Person();
		person.setAge(29);
	
		Map<String, Integer> n=new HashMap<String, Integer>();
		n.put("运气" , 96);
		n.put("智慧" , 98);
		person.setName(new Name("chen","hao",n));
		session.save(person);
		tx.commit();
		HibernateUtil.closeSession();
	}
}