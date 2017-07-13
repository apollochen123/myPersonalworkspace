package duplexJoinableNtoN;


import org.hibernate.Transaction;

import assistant.HibernateUtil;

import org.hibernate.Session;


public class PersonManager
{
	public static void main(String[] args)
	{
		PersonManager mgr = new PersonManager();
		mgr.testPerson();
		HibernateUtil.sessionFactory.close();
	}

	private void testPerson()
	{
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		// 创建一个Person对象
		Person p = new Person();
		// 设置Person的name为crazyit
		p.setName("chenhao");
		p.setAge(20);
		// 持久化Person对象(对应于插入主表记录)
		session.save(p);
		// 创建一个瞬态的Address对象
		Address a = new Address("四川绵阳");
		// 先设置Person和Address之间的关联关系
		a.getPerson().add(p);
		// 再持久化Address对象
		session.persist(a);
		// 创建一个瞬态的Address对象
		Address a2 = new Address("上海虹口");
		// 先设置Person和Address之间的关联关系
		a2.getPerson().add(p);
		// 再持久化Address对象(对应于插入从表记录)
		session.persist(a2);

		Person p2 = new Person();
		p2.setName("chnehao2");
		p2.setAge(29);
		p2.getAddress().add(a2);
		p2.getAddress().add(a);
		session.save(p2);

		tx.commit();
		HibernateUtil.closeSession();
	}
}