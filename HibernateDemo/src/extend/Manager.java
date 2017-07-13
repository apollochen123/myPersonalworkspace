package extend;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@DiscriminatorValue("经理")
public class Manager extends Employee{
	
	private String department;
	public Manager(){};
	public Manager(String department){
		this.department=department;
	}
	//映射关系，1对多，关系维护由多端控制
	@OneToMany(targetEntity=Employee.class,mappedBy="manager",cascade=CascadeType.ALL)
	private Set<Employee> employee=new HashSet<Employee>();

	
	public void setDepartment(String department){
		this.department=department;
	}
	public String getDepartment(){
		return this.department;
	}
	public Set<Employee> getEmployee(){
		return this.employee;
	}
	public void setEmployee(Set<Employee> employee){
		this.employee=employee;
	}
	
	
}
