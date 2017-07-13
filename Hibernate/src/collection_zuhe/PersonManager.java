package collection_zuhe;
import org.hibernate.Transaction;

import org.hibernate.Session;

import map.HibernateUtil;

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
		//为Person对象设置属性
		person.setAge(29);
		//创建一个Map集合
		
		// 向List集合里放入Name对象
		person.getNicks().add(new Name("Wawa1" , "Wawa"));
		person.getNicks().add(new Name("Yeeku2" , "Lee"));
		// 向List集合里放入Score对象
		person.getScore().put("语文" , new Score("良好" , 85));
		person.getScore().put("数学" , new Score("优秀" , 92));
		session.save(person);
		tx.commit();
		HibernateUtil.closeSession();
	}
}