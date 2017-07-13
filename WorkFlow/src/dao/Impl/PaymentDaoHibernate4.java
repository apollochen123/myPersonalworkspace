package dao.Impl;

import java.util.List;

import dao.PaymentDao;
import domain.Employee;
import domain.Payment;

public class PaymentDaoHibernate4 extends BaseDaoHibernate4<Payment> implements PaymentDao {

	@Override
	public List<Payment> findByEmp(Employee employee) {
		// TODO Auto-generated method stub
		return find("select p from Payment as p where p.employee=?0" , employee);
	}
	

	@Override
	public Payment findByMonthAndEmp(String payMonth, Employee employee) {
		// TODO Auto-generated method stub
		List<Payment> pays = find("select p from Payment as p where"
				+ " p.employee=?0 and p.payMonth=?1" , employee , payMonth);
			if (pays != null && pays.size() > 0)
			{
				return pays.get(0);
			}
			return null;
	}

}
