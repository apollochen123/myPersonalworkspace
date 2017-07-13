package dao.Impl;



import java.util.List;

//import java.util.List;

import javax.annotation.Resource;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import dao.EmployeeDao;
import domain.Employee;

//import domain.Employee;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml","classpath:daoContext.xml"})
public class EmployeeDaoTest extends AbstractTransactionalJUnit4SpringContextTests{
	@Resource(name="employeeDao")
	private EmployeeDao employeeDao;
	Employee  employee;
	
	@Test
    
	public void findByNameAndPassTest() {
		List<Employee> list=employeeDao.findAll(Employee.class);
		for(Employee e:list){
			System.out.println(e.getName()+"  "+e.getPass()+"   "+e.getSalary());
		}
	}
	
}
//	Employee employee=new Employee();
//	String a=employee.getClass().getName();


//	employee.setName("tomcat");
//	employee.setPass("tomcat");
//	
//	
//	List<Employee> list=employeeDao.findByNameAndPass(employee);
//	if(list.size()>0){
//		System.out.println(list.get(0).getId());
//	}
//		}
		
		
//	}

