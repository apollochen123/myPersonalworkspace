package domain;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="Employee_inf")
//配置二级缓存
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//设置同一继承关键放同一张表
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//设置辨别者列名字为emp_type，类型为String
@DiscriminatorColumn(name="emp_type",discriminatorType=DiscriminatorType.INTEGER)
@DiscriminatorValue(value = "1")
public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 48L;
	//员工的id
	@Id @Column(name="emp_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
	@Column(name="emp_name")
	private String name;
	@Column(name="emp_pass")
	private String pass;
	@Column(name="emp_salary")
	private double salary;
	//员工对应的经理
	@ManyToOne(targetEntity=Manager.class)
	@JoinColumn(name="mgr_id")
	private Manager manager;
	//设置1-n关系，1端不维护关联关系
	//员工的工资支付纪录
	@OneToMany(targetEntity=Payment.class,mappedBy="employee")
	private Set<Payment> payments=new HashSet<Payment>();
	//员工的出勤纪录
	@OneToMany(targetEntity=Attend.class,mappedBy="employee")
	private Set<Attend> attends=new HashSet<Attend>();
	//两个构造函数
	public Employee(){
		
	}
	public Employee(Integer id,String name,String pass,double salary,Manager manager,
			Set<Attend> attends,Set<Payment> payments){
		this.id=id;
		this.name=name;
		this.pass=pass;
		this.salary=salary;
		this.payments=payments;
		this.attends=attends;
		this.manager=manager;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	// name的setter和getter方法
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
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

	// salary的setter和getter方法
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public double getSalary()
	{
		return this.salary;
	}

	// manager的setter和getter方法
	public void setManager(Manager manager)
	{
		this.manager = manager;
	}
	public Manager getManager()
	{
		return this.manager;
	}

	// attends的setter和getter方法
	public void setAttends(Set<Attend> attends)
	{
		this.attends = attends;
	}
	public Set<Attend> getAttends()
	{
		return this.attends;
	}

	// payments的setter和getter方法
	public void setPayments(Set<Payment> payments)
	{
		this.payments = payments;
	}
	public Set<Payment> getPayments()
	{
		return this.payments;
	}
	
	//重写hashCode
	@Override
	public int hashCode(){
		final int prime=31;
		int result=1;
		result=prime*result+((name==null)?0:name.hashCode());
		result=prime*result+((pass==null)?0:pass.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj){
		if(this==obj) return true;
		if(obj==null) return false;
	    if(this.getClass()!=obj.getClass()) return false;
		
	    Employee other=(Employee)obj;
		if(name==null){
			if(other.name!=null) return false;
		}else if(!(this.name.equals(other.name))){
			return false;
		}
		
		if(pass==null){
			if(other.pass!=null) return false;
		}
		else if(!(this.pass.equals(other.pass))){
			return false;
		}
		return true;
		
		
	}
	
}
