package hqlSelect;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
//import org.hibernate.criterion.Projection;
//import org.hibernate.criterion.Projections;
//import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

import assistant.HibernateUtil;

import extend.Person;

public class CriteriaTest {
	public static void main(String args[]){
		CriteriaTest a=new CriteriaTest();
		a.test();
		HibernateUtil.sessionFactory.close();
		
	}
	
	public void  test(){
		Session session=HibernateUtil.currentSession();
		Transaction tx=session.beginTransaction();
		//createCriteria()方法确定查找类
		@SuppressWarnings("unchecked")
		List<Person> list=session.createCriteria(Person.class)
				.setMaxResults(10)//设置查询的最大个数，setFirstResult(int firstResult)设置返回的第一行纪录
				.add(Restrictions.gt("name", "chenhao"))//设置相等，eq，ne，gt，ge，lt，le相等，不相等，大于，大于等于，小于，小于等于
				.add(Restrictions.between("id", 3, 5))//设置在id在3-5区间
				.add(Restrictions.like("gender",'男'))//ilike()为不区分大小写，判断是否匹配某个字符串
				//.add(Restrictions.in(propertyName, Collection values))区分实付在某个集合内
				//.add(Restrictions.isEmpty(propertyName)属性值是否为空isNotEmpty为是否不为空，isNotNull，isNull为是否非空和空
//********************************************************************//				
				//关于关联和动态关联
//				.createCriteria("关联属性名")
//				.add(Restrictions.allEq(Map properyNameValues))//....所有方法可用
				//方式二，实例化关联类
				//.createAlias("关联属性名", "别名")
				//.add(Restrictions.gt("别名.属性",2))
				//createAlias()方法并不创建一个新的Criteria实例,他只是给关联实体起一个别名，让后面的过滤条件根据该关联实体进行筛选
				
				
				//关于延时加载fatch  依次为1。使用配置文件指定延迟加载策略处理实体，2。使用外连接，预初始化关联实体，和
				//3.启用延迟加载，系统将使用单独的select语句初始化关联属性
				//.setFetchMode("属性名"，FetchMode.DEFAULT/JOIN/SELECT)//分别为使用
				
				
				//投影，投影运算时一种基于列的运算，类似于select子句的作用
//	           List cats=session.createCriteria(Cat.class)
//	           .setProjection(Projections.projectionList()
//	        		   .add(Projections.rowCount())//计数
//	        		   .add(Projections.avg("weight"))//max/min
//	        		   .add(Projections.groupProperty("color"))分组
//	        		   .addOrder(Order.asc("id"))//排序
//				       .add(Projections.alias(Projections.rowCount(),"c")))//统计纪录条数，并指定别名
//	        		   .list()
				
//**************************************************************************				
//				//使用projections选出指定列的对象
//				List list=session.createCriteria(Enrolment.class)
//				 .createAlias("stuent", "s")
//				 .setProjection(Projections.projectionList()
//				 .add(Property.forName("course"))
//				 .add(Property.forName("s.name"))
//				 .add((Projection) Property.forName("s.name").eq("chenhao"))//
//				 .list();
//               选择Enrolment的course属性，	和student关联类的name属性，并且name要等于chenhao	
//*******************************************************************//				
				.addOrder(Order.asc("id"))
				.list();
		System.out.println("========关联实体查获的学生纪录=============");
		for(Object ele:list){
			Person p=(Person) ele;
			System.out.println(p.getName());
			
			
	}
		tx.commit();
		HibernateUtil.closeSession();
		
		
		
		
	}

}
