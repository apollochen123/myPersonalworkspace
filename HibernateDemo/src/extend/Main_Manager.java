package extend;

import org.hibernate.Session;
import org.hibernate.Transaction;

import assistant.HibernateUtil;

public class Main_Manager {
	public static void main(String args[]){
		Main_Manager mar=new Main_Manager();
		mar.start();
		HibernateUtil.sessionFactory.close();
		
	}
	public void start(){
		Session session=HibernateUtil.currentSession();
		Transaction tx=session.beginTransaction();
		//初始化一个经理
		Manager chen=new Manager("研发部");
		chen.setName("chenhao");
		chen.setGender('男');
		chen.setTitle("项目经理");
		chen.setSalary(300000);
		chen.setAddress(new Address("成都","621000","中国"));
		//持久化处理
		session.persist(chen);
		
		//初始化两个员工
		Employee qiu=new Employee("经理秘书",12000);
		qiu.setName("qiujw");
		qiu.setGender('女');
		qiu.setAddress(new Address("成都","621000","中国"));
		qiu.setManager(chen);
		session.persist(qiu);
		
		Employee zhang=new Employee("研发人员",9999);
		zhang.setName("zhangsan");
		zhang.setGender('男');
		zhang.setAddress(new Address("北京","600000","中国"));
		zhang.setManager(chen);
		session.persist(zhang);
		
		//初始化3个顾客
		Customer li=new Customer("喜欢购物");
		li.setName("lisi");
		li.setGender('女');
		li.setAddress(new Address("北京","600000","中国"));
		li.setEmployee(zhang);
		session.persist(li);
		
		Customer wang=new Customer("不喜欢购物");
		wang.setName("王尼玛");
		wang.setGender('男');
		wang.setAddress(new Address("北京","600000","中国"));
		wang.setEmployee(zhang);
		session.persist(wang);
		
		Customer deng=new Customer("喜欢购物");
		deng.setName("dengpeng");
		deng.setGender('男');
		deng.setAddress(new Address("北京","600000","中国"));
		deng.setEmployee(qiu);
		session.persist(deng);
		
		//初始化一个普通人
		Person person=new Person();
		person.setAddress(new Address("北京","600000","中国"));
		person.setGender('男');
		person.setName("sdad");
		
		session.persist(person);
		
		tx.commit();
		HibernateUtil.closeSession();
		
	}
	

}
