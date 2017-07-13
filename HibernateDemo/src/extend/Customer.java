package extend;

import javax.persistence.*;


@Entity
@DiscriminatorValue("顾客")
public class Customer extends Person {
	
	private String customer_detail;
	@ManyToOne(cascade=CascadeType.ALL,targetEntity=Employee.class)
	@JoinColumn(name="employee_id",nullable=true)
	private Employee employee;
	
	//构造函数
	public Customer(){}
	public Customer(String customer_detail){
		this.customer_detail=customer_detail;
	}
	public void setCustomer_detail(String customer_detail){
		this.customer_detail=customer_detail;
	}
	public String getCustomer_detail(){
		return this.customer_detail;
	}
	public void setEmployee(Employee employee){
		this.employee=employee;
	}
	public Employee getEmployee(){
		return this.employee;
	}
	 
	
	

}
