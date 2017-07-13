package hqlSelect;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.type.StandardBasicTypes;

import assistant.HibernateUtil;
import extend.Person;

public class StandardSQL {
	public static void main(String args[]){
		StandardSQL m=new StandardSQL();
		m.entityQuery();
		HibernateUtil.sessionFactory.close();
		
	}
	
	//标量查询
	public void scalarQuery(){
		Session session=HibernateUtil.currentSession();
		Transaction tx=session.beginTransaction();
		
		String sqlString="select p.* from person_inf as p";
		
		@SuppressWarnings("rawtypes")
		List list=session.createSQLQuery(sqlString)
				.addScalar("name",StandardBasicTypes.STRING)
				.addScalar("id", StandardBasicTypes.INTEGER)
				.list();
		for(Object ele:list){
			//每个集合元素，都是一个数组，数组元素是name，id两列的值
			Object[] row =(Object[]) ele;
			System.out.println(row[0]+"\t"+row[1]);
			
			
		}
		tx.commit();
		HibernateUtil.closeSession();
	}
    
	//实体查询
	public void entityQuery(){
		Session session=HibernateUtil.currentSession();
		Transaction tx=session.beginTransaction();
		
		String sqlString="select * from person_inf where id>?1";
		
		@SuppressWarnings("rawtypes")
		List list=session.createSQLQuery(sqlString)
		.addEntity(Person.class)
		.setInteger("1", 3)
				.list();
		for(Object ele:list){
			//每个集合元素，都是一个数组，数组元素是name，id两列的值
			Person p=(Person) ele;
			System.out.println(p.getName()+"\t"+p.getId());
			
			
		}
		tx.commit();
		HibernateUtil.closeSession();
	}
	
}
