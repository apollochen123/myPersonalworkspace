package duplexNoJointable1toN;

import org.hibernate.Session;
import org.hibernate.Transaction;

import assistant.HibernateUtil;

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
	// 创建一个瞬态的Person对象
	Person p = new Person();
	// 设置Person的name为crazyit.org字符串
	p.setName("chenhao");
	p.setAge(29);
	// 持久化Person对象(对应于插入主表记录)
	session.save(p);
	// 创建一个瞬态的Address对象
	Address a = new Address();
	a.setAddress_Detail("四川成都");
	// 先设置Person和Address之间的关联关系
	a.setPerson(p);
	// 再持久化Address对象(对应于插入从表记录)
	session.persist(a);
	// 创建一个瞬态的Address对象
	Address a2 = new Address();
	a2.setAddress_Detail("四川成都");
	// 先设置Person和Address之间的关联关系
	a2.setPerson(p);
	// 再持久化Address对象(对应于插入从表记录)
	session.persist(a2);
	tx.commit();
	HibernateUtil.closeSession();
}

}
