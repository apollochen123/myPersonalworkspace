package login.zuizhong;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.opensymphony.xwork2.Action;


import login.message.Person;

public class RegistAction implements Action
{
	// 定义4个成员变量封装请求参数
	private String user;
	private String pass;
	private int age;
	private Date birth;

	// name的setter和getter方法
	public void setUser(String user)
	{
		this.user = user;
	}
	public String getUser()
	{
		return this.user;
	}

	// pass的setter和getter方法
	public void setPass(String pass)
	{
		this.pass = pass;
	}
	public String getPass()
	{
		return this.pass;
	}

	// age的setter和getter方法
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}

	// birth的setter和getter方法
	public void setBirth(Date birth)
	{
		this.birth = birth;
	}
	public Date getBirth()
	{
		return this.birth;
	}
	
	public String execute() 
	{
		String user=getUser();//从jsp页面获取user,password,Birth,Age
		String pass=getPass();
	    Date birth=getBirth();
	    int age=getAge();
		
	   
	    Configuration conf=new Configuration().configure();//应用配置文件
	    
	    //创建sessionFactory
	    ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
		
	    SessionFactory sf=conf.buildSessionFactory(serviceRegistry);
	    
	    //创建session
	    Session sess=sf.openSession();
		
	    //创建事件
	    Transaction tx=sess.beginTransaction();
	    
	    //实例化person对象
	    Person person=new Person();
	    
	    person.setUser(user);
	    person.setPass(pass);
	    person.setAge(age);
	    person.setBirth(birth);
   
	    sess.save(person);
	    tx.commit();
	    sess.close();
	    sf.close();
	    
	    return SUCCESS;
}
}