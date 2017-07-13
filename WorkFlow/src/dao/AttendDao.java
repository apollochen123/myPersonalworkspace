package dao;

import java.util.List;

import domain.Attend;
import domain.AttendType;
import domain.Employee;

public interface AttendDao extends BaseDao<Attend>{
	/*根据员工，月份来查询该员工的出勤纪录
	 * param emp 员工
	 * param month 月份，形如2012-02
	 * return 该员工该月份的全部出勤纪录
	 * */
	List<Attend> findByEmpAndMonth(Employee employee,String month);

	/*根据员工，日期查询员工打卡纪录集合
	 * param emp员工
	 * param dutyDay 日期
	 * return 该员工某天的打开纪录
	 * */
	List<Attend> findByEmpAndDutyDay(Employee employee,String DutyDay);
	/*
	 * 根据员工，日期，上班还是下班的打卡纪录
	 * param emp员工
	 * param dutyDay 日期
	 * param isCome 是否上班
	 * return 该员工某天上班还是下班的打卡纪录的
	 * */
	Attend findByEmpAndDutyDayAndCome(Employee employee,String DutyDay,boolean isCome);
	/*查看员工前三天非正常打卡
	 * param emp 员工
	 * return 该员工前三天非正常打卡纪录
	 * 
	 * */
	List<Attend> findByEmpUnAttend(Employee employee,AttendType type);
}
