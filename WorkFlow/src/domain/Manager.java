package domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity
@DiscriminatorValue("2")
@Cache(usage =CacheConcurrencyStrategy.READ_WRITE)
public class Manager extends Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 48L;
	//管理的部门
	@Column(name="dept_name",length=50)
	private String department;
	//经理管理的员工
	@OneToMany(targetEntity=Employee.class,mappedBy="manager")
	private Set<Employee> employees=new HashSet<Employee>();
	//经理批复 的申请
	@OneToMany(targetEntity=CheckBack.class,mappedBy="manager")
	private Set<CheckBack> checks=new HashSet<CheckBack>();
	//构造函数
	public Manager(){
		
	}
	public Manager(String department,Set<Employee> employees,Set<CheckBack> checks){
		this.department=department;
		this.employees=employees;
		this.checks=checks;
	}
	// dept的setter和getter方法
		public void setDepartment(String department)
		{
			this.department = department;
		}
		public String getDepartment()
		{
			return this.department;
		}

		// employees的setter和getter方法
		public void setEmployees(Set<Employee> employees)
		{
			this.employees = employees;
		}
		public Set<Employee> getEmployees()
		{
			return this.employees;
		}

		// checks的setter和getter方法
		public void setChecks(Set<CheckBack> checks)
		{
			this.checks = checks;
		}
		public Set<CheckBack> getChecks()
		{
			return this.checks;
		}
}