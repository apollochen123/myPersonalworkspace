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
	// ����4����Ա������װ�������
	private String user;
	private String pass;
	private int age;
	private Date birth;

	// name��setter��getter����
	public void setUser(String user)
	{
		this.user = user;
	}
	public String getUser()
	{
		return this.user;
	}

	// pass��setter��getter����
	public void setPass(String pass)
	{
		this.pass = pass;
	}
	public String getPass()
	{
		return this.pass;
	}

	// age��setter��getter����
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}

	// birth��setter��getter����
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
		String user=getUser();//��jspҳ���ȡuser,password,Birth,Age
		String pass=getPass();
	    Date birth=getBirth();
	    int age=getAge();
		
	   
	    Configuration conf=new Configuration().configure();//Ӧ�������ļ�
	    
	    //����sessionFactory
	    ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
		
	    SessionFactory sf=conf.buildSessionFactory(serviceRegistry);
	    
	    //����session
	    Session sess=sf.openSession();
		
	    //�����¼�
	    Transaction tx=sess.beginTransaction();
	    
	    //ʵ����person����
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