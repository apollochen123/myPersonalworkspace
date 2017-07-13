package list;
import org.hibernate.Transaction;
import org.hibernate.Session;
import list.Person;
import list.HibernateUtil;

public class PersonManager {
	public static void main(String[] args){
		PersonManager mgr=new PersonManager();
		mgr.createAndStorePerson();
		HibernateUtil.sessionFactory.close();
	}
	//创建并保存Person对象
	public void createAndStorePerson(){
		
		//打开安全的session对象
		Session session=HibernateUtil.currentSession();
		//打开事物
		Transaction tx=session.beginTransaction();
		//创建person对象
		Person person=new Person();
		//为person对象设置属性
		person.setAge(20);
		person.setName("chenhao");
		//向person的school属性添加元素
		person.getSchools().add("小学1");
		person.getSchools().add("大学1");
		session.save(person);
		tx.commit();
		HibernateUtil.closeSession();
	}

}
