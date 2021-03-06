package persistClass.OnetoNNoJointable;
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
//程序先插入一个值为null的addressId，再update，所以性能较低。因为
//address并不知道关联的person对象
//解决思路，在address石头内，通过address.setPerson()方式，建立关联关系，变成双向1-n关系
private void testCascase()
{
	Session session = HibernateUtil.currentSession();
	Transaction tx = session.beginTransaction();
	// 创建一个Person对象
	Person p = new Person();
	// 创建一个瞬态的Address对象
	Address a = new Address("广州天河");          // ①
	Address a2=new Address("四川成都");
    session.persist(a);
    session.persist(a2);
	// 设置Person的name为crazyit.org字符串
	p.setName("chenhao");
	p.setAge(22);
	// 设置Person和Address之间的关联关系
	p.getAddress().add(a);
	p.getAddress().add(a2);
	// 持久化Person对象
	session.persist(p);
//错误示范	
//	Person p2 = new Person();
//    // 设置Person的name为crazyit.org字符串
//	p2.setName("chenhao3");
//	p2.setAge(23);
//	// 设置Person和Address之间的关联关系
//	p2.setAddress(a);
//	// 持久化Person对象
//	session.persist(p2);
	// 创建一个瞬态的Address对象
//	Address a2 = new Address("上海虹口");         // ②
//	session.persist(a2);
//	// 修改持久化状态的Person对象
//	p.setAddress(a2);                             // ③
	tx.commit();
	HibernateUtil.closeSession();
}
}


