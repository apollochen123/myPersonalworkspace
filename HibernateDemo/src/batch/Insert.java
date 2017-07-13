package batch;

import org.hibernate.Session;
import org.hibernate.Transaction;

import assistant.HibernateUtil;
import extend.Person;

//此类基于手动刷新写入数据，并清空session，注意关闭二级缓存
public class Insert {
	public static void  main(String args[]){
		Person p=new Person();
		Session session=HibernateUtil.currentSession();
		Transaction tx=session.beginTransaction();
		for(int i=0;i<=10000;i++){
		p.setName("chenhao"+i);
		p.setGender('男');
		session.save(p);
		
		//写入
		if (i%20==0) {
			session.flush();
			session.clear();
		}
		}
		tx.commit();
		HibernateUtil.closeSession();
	}
	
	

}
