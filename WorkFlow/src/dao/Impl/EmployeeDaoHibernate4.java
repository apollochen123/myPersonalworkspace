package dao.Impl;

import java.util.List;



import dao.EmployeeDao;
import domain.Employee;

public class EmployeeDaoHibernate4 extends BaseDaoHibernate4<Employee> implements EmployeeDao{

	
	@Override
	public List<Employee> findByNameAndPass(Employee employee) {
		// TODO Auto-generated method stub
		List<Employee> list=find("select p from Employee as p where p.name=?0 and p.pass=?1"
				,employee.getName(),employee.getPass());
		if(list!=null&&list.size()>0){
			return list;
			}
		return null;
	}

	@Override
	public Employee findByName(String name) {
		// TODO Auto-generated method stub
		List<Employee> list=find("select p from Employee as p where p.name=?0",name);
		if(list!=null&&list.size()>0){
			return list.get(0);
			}
		
		return null;
	}

}
