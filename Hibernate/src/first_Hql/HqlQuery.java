package first_Hql;
import org.hibernate.Transaction;
import org.hibernate.Session;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.*;



public class HqlQuery
{
	public static void main(String[] args)
		throws Exception
	{
		HqlQuery mgr = new HqlQuery();
		// 调用查询方法
		
		mgr.findPersonProperty();
	}
	
	// 第三个查询方法：查询属性
	private void findPersonProperty()
	{
		// 获得Hibernate Session
		Session sess = HibernateUtil.currentSession();
		// 开始事务
		Transaction tx = sess.beginTransaction();
		// 以HQL语句创建Query对象.
		List pl = sess.createQuery("select distinct p.id,  p.user , p.age "
			+ "from Person p where user=:eventUser").setString("eventUser", "chenhao")
			// Query调用list()方法访问查询得到的全部属性
			.list();
		// 遍历查询的全部结果
		for (Object ele : pl)
		{
			Object[] objs = (Object[])ele;
			Integer Aid=(Integer) objs[0];
			System.out.println(Aid);
		}
		// 提交事务
		tx.commit();
		HibernateUtil.closeSession();
	}
}