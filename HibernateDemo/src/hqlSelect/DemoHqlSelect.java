package hqlSelect;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import assistant.HibernateUtil;
import extend.Customer;
@SuppressWarnings("unused")
public class DemoHqlSelect {
	public static void main(String args[]){
		Session session=HibernateUtil.currentSession();
		Transaction tx=session.beginTransaction();
		//常见的select对象表达，select一个类对象
		String sql="select c from Customer c join c.employee e where e.title=:title";
		//select类属性
		
		
		String sql2="select c.address.address_detail form Customer c inner join c.employee e where e.name=:name";
		//select属性可以为复数
	
		String sql3="select c.address.address_detail,c.name form Customer c inner join c.employee e where e.name=:name";
		//select 可以将选出的属性存入一个List
		String sql4="select new list(p.name,p.address) form Person p";
		//select可以构成一个类
		String sql5="select new TestClass(p.name,p.address) form Person p";
		//select 的like
		String sql6="select  p form Person p where p.name like 'ABC'";
		//select的in 和between
		String sql7="select p form Person p where p.id between 'A' and 'B'";
		String sql8="select p form Person p where p.id in('1','2','3')";
		//select 测试是否为空值
		String sql9="select p form Person p where p.id is (not) null";
		//select order by,asc升序，desc降序
		String sql10="select p form Person p order by p.name asc,p.age desc";
		//select group by 可以用having过滤
		String sql11="select p form Person p group by p.color having p.color in('黑','白')";
		
		
		
		//select 聚集函数
		String sql12="select count(*) from Person";
		String sql13="select max/avg/min/sum(p.age) from Person p";
		
		
		//子查询,子查询语句只可以出现在select子句或者where子句中
		String sql14="select p form Person p where p.weight>(select avg(p.weight) from p)";
		
		
		List<?> a=session.createQuery(sql).setString("title","经理秘书").list();
        for(Object ele:a){
        	Customer c=(Customer) ele;
        	System.out.println(c.getName());
        	
        }
		tx.commit();
		HibernateUtil.closeSession();
		HibernateUtil.sessionFactory.close();
		
	}
	

}