package dao.Impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import dao.AttendDao;
import domain.Attend;
import domain.AttendType;
import domain.Employee;

public class AttendDaoHibernate4 extends BaseDaoHibernate4<Attend> implements AttendDao{
   
	@Override
	public List<Attend> findByEmpAndMonth(Employee employee, String month) {
		/*根据员工，月份来查询该员工的出勤纪录
		 * param emp 员工
		 * param month 月份，形如2012-02
		 * return 该员工该月份的全部出勤纪录
		 * */
		return find("select a from Attend as a where a.employee=?0 "+
		 "and subString(a.dutyDay,0,7)=?1",employee,month);
	}

	@Override
	public List<Attend> findByEmpAndDutyDay(Employee emp, String DutyDay) {
		// TODO Auto-generated method stub
		return find("select a from Attend as a where a.employee=?0 "+
		"and a.dutyDay=?1",emp,DutyDay);
	}

	@SuppressWarnings("null")
	@Override
	public Attend findByEmpAndDutyDayAndCome(Employee emp, String DutyDay, boolean isCome) {
		// TODO Auto-generated method stub
		List<Attend> list=findByEmpAndDutyDay(emp,DutyDay);
		if(list!=null||list.size()>0){
			for(Attend attend:list){
				if(attend.getIsCome()==isCome){
					return attend;
				}
			}
		}
		return null;
	}

	@Override
	public List<Attend> findByEmpUnAttend(Employee employee,AttendType type) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		String end = sdf.format(c.getTime());
		c.add(Calendar.DAY_OF_MONTH, -3);
		String start = sdf.format(c.getTime());
		return find("from Attend as a where a.employee=?0 and "
			+ "a.type != ?1 and a.dutyDay between ?2 and ?3" ,
			employee , type , start , end);
	}

}
