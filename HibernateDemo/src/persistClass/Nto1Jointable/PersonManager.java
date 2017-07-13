package persistClass.Nto1Jointable;
import assistant.HibernateUtil;
import org.hibernate.Transaction;
import org.hibernate.Session;




public class PersonManager
{
	public static void main(String[] args)
	{
		PersonManager mgr = new PersonManager();
		mgr.testCascase();
		HibernateUtil.sessionFactory.close();
	}

private void testCascase()
{
	Session session = HibernateUtil.currentSession();
	Transaction tx = session.beginTransaction();
	// 创建一个Person对象
	Person p = new Person();
	// 创建一个瞬态的Address对象
	Address a = new Address("广州天河");          // ①
	session.persist(a);
	// 设置Person的name为crazyit.org字符串
	p.setName("chenhao");
	p.setAge(21);
	// 设置Person和Address之间的关联关系
	p.setAddress(a);
	// 持久化Person对象
	session.persist(p);
	// 创建一个瞬态的Address对象
	Address a2 = new Address("上海虹口");         // ②
	session.persist(a2);
	// 修改持久化状态的Person对象
	p.setAddress(a2);                             // ③
	tx.commit();
	HibernateUtil.closeSession();
}
}


