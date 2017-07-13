package map;
import map.Person;
import map.HibernateUtil;


import org.hibernate.Session;
import org.hibernate.Transaction;




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
		// 打开线程安全的Session对象
		Session session = HibernateUtil.currentSession();
		// 打开事务
		Transaction tx = session.beginTransaction();
		// 创建Person对象
		Person person = new Person();
		person.setAge(19);
		person.setName("chenhao");
		// 向person的Map集合属性中添加key-value对
		person.getScores().put("语文" , 67f);
		person.getScores().put("英文" , 45f);
		session.save(person);
		tx.commit();
		HibernateUtil.closeSession();
	}
}