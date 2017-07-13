package extend;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@DiscriminatorValue("员工")
public class Employee extends Person {
	//职位
	private String title;
	//工资
	private double salary;
	//两个构造函数
	public Employee(){}
	public Employee(String title,double salary){
		this.title=title;
		this.salary=salary;
	}
	//一个员工，对应n个客户
	//维护关联关系由客户负责，级联属性为CascadeType.All
	@OneToMany(targetEntity=Customer.class,mappedBy="employee",cascade=CascadeType.ALL)
	private Set<Customer> customer=new HashSet<Customer>();
	
	//多个员工，对应1个经理
	//维护关系的为员工端
	@ManyToOne(targetEntity=Manager.class,cascade=CascadeType.ALL)
	@JoinColumn(name="manager_id",nullable=true)
	private Manager manager;
	
	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return this.title;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public double getSalary(){
		return this.salary;
	}
	public Set<Customer> getCustomer(){
		return this.customer;
	}
	public void setCostomer(Set<Customer> customer){
		this.customer=customer;
	}
	
	public void setManager(Manager manager){
		this.manager=manager;
	}
	public Manager getManager(){
		return this.manager;
	}
	
	

}
