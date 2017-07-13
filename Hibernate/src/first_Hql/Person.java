package first_Hql;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="person_password")
public class Person
{
	// 消息类的标识属性
	@Id
	// 定义主键生成器

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	// 用户名
	private String user;
	// 密码
	private String pass;
	
	private int age;
	
	@Temporal(TemporalType.DATE)
	private Date birth;
	
	

	// user的setter和getter方法
	public void setUser(String user)
	{
		this.user = user;
	}
	public String getUser()
	{
		return this.user;
	}
	
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}
	
	public void setPass(String pass)
	{
		this.pass = pass;
	}
	public String getPass()
	{
		return this.pass;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}
	
	public void setBirth(Date birth)
	{
		this.birth = birth;
	}
	public Date getBirth()
	{
		return this.birth;
	}
}