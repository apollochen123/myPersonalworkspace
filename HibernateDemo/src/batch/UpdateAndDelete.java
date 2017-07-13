package batch;

import org.hibernate.Session;
import org.hibernate.Transaction;

import assistant.HibernateUtil;

//基于DML风格的更新和删去
//此处不使用游标方式，因为scroll()的游标方式效率不高
public class UpdateAndDelete  {
	public static void main(String args[]) throws Exception{
		UpdateAndDelete a=new UpdateAndDelete();
		a.UpdateUsers();
		
		HibernateUtil.sessionFactory.close();
	}
	private void UpdateUsers()throws Exception{
		Session session=HibernateUtil.currentSession();
		Transaction tx=session.beginTransaction();
		String Hql="update User u set name=:name";
		//返回更新的条目个数
		int updatedEntities=session.createQuery(Hql).setString("name", "chenhao").executeUpdate();
		System.out.println("更新了"+updatedEntities+"条数据");
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	

}
