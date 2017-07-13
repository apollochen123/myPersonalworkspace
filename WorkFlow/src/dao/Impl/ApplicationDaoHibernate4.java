package dao.Impl;

import java.util.List;

import dao.ApplicationDao;
import domain.Application;
import domain.Employee;

public class ApplicationDaoHibernate4 extends BaseDaoHibernate4<Application> implements ApplicationDao  {

	@Override
	public List<Application> findByEmp(Employee employee) {
		//根据员工查询未处理的异动申请
		//param emp 需要查询的员工
		//return对应的异动申请
		return find("select a from Application as a where "+
		"a.attend.employee=?0",employee);
	}

}
