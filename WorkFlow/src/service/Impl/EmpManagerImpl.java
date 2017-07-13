package service.Impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;



import bean.AttendBean;
import bean.PaymentBean;
import dao.ApplicationDao;
import dao.AttendDao;
import dao.AttendTypeDao;
import dao.CheckBackDao;
import dao.EmployeeDao;
import dao.ManagerDao;
import dao.PaymentDao;
import domain.Application;
import domain.Attend;
import domain.AttendType;
import domain.Employee;
import domain.Manager;
import domain.Payment;
import service.EmpManager;

public class EmpManagerImpl implements EmpManager {

	private ApplicationDao appDao;
	private AttendDao attendDao;
	private AttendTypeDao typeDao;
	@SuppressWarnings("unused")
	private CheckBackDao checkDao;
	private ManagerDao mgrDao;
	private EmployeeDao empDao;
	private PaymentDao payDao;

	public void setAppDao(ApplicationDao appDao)
	{
		this.appDao = appDao;
	}

	public void setAttendDao(AttendDao attendDao)
	{
		this.attendDao = attendDao;
	}

	public void setTypeDao(AttendTypeDao typeDao)
	{
		this.typeDao = typeDao;
	}

	public void setCheckDao(CheckBackDao checkDao)
	{
		this.checkDao = checkDao;
	}

	public void setEmpDao(EmployeeDao empDao)
	{
		this.empDao = empDao;
	}

	public void setMgrDao(ManagerDao mgrDao)
	{
		this.mgrDao = mgrDao;
	}

	public void setPayDao(PaymentDao payDao)
	{
		this.payDao = payDao;
	}

	@Override
	public int validLogin(Manager mgr) {
		if(mgrDao.findByNameAndPass(mgr).size()>0){
			return LOGIN_MGR;
		}
		if(empDao.findByNameAndPass(mgr)!=null&&empDao.findByNameAndPass(mgr).size()>0){
			return LOGIN_EMP;
		}
		return LOGIN_FAIL;
	}

	//自动插入旷工纪录
	@Override
	public void autoPunch() {
		System.out.println("自动打卡插入旷工纪录");
		List<Employee> emps=empDao.findAll(Employee.class);
		Attend a=null;
		AttendType atype=typeDao.get(AttendType.class, 6);
		String dutyDay=new java.sql.Date(System.currentTimeMillis()).toString();
		for(Employee e:emps){
			a=new Attend();
			a.setDutyDay(dutyDay);
			a.setEmployee(e);
			a.setType(atype);
			if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)<AM_LIMIT){
				a.setIsCome(true);
			}
			else{
				a.setIsCome(false);
			}
			attendDao.save(a);
		}
		
	}

	/**员工本月工资自动结算
	 * 员工工资，等于出勤对应款钱相加
	 * */
	@Override
	public void autoPay() {
		System.out.println("自动开始结算工资");
		List<Employee> emps=empDao.findAll(Employee.class);
		//获取当前日期
		Calendar c=Calendar.getInstance();
		c.add(Calendar.MONTH,-1);
		java.util.Date date=c.getTime();
		SimpleDateFormat b=new SimpleDateFormat("yyyy-MM");
		String payMouth=b.format(date);//上月时间
		
		for(Employee e:emps){
		
		double amount=e.getSalary();
		List<Attend> a=attendDao.findByEmpAndMonth(e, payMouth);
		//获取当前员工工资  
		for(Attend attend:a){
			amount=+attend.getType().getAmerce();
		   }
		Payment pay=new Payment();
		pay.setEmployee(e);
        pay.setAmount(amount);
        pay.setPayMonth(payMouth);
        payDao.save(pay);
		}
		
		
	}

	/**验证是否可以打卡
	 * @param String empName
	 * @param dutyDay 日期
	 * @return 打卡类别
	 */
	@Override
	public int validPunch(String empName, String dutyDay) {
		// TODO Auto-generated method stub
		
		Employee emp=empDao.findByName(empName);
		if(emp==null){
			return NO_PUNCH;
		}
		List<Attend> attends=attendDao.findByEmpAndDutyDay(emp, dutyDay);
		if(attends.size()<=0||attends==null){
			return NO_PUNCH;
		}
		else if(attends.size()==1){
			//上班的标识isCome=1，正常上班打卡
			if((attends.get(0).getIsCome()==true)&&(attends.get(0).getPunchTime()==null)){
				return COME_PUNCH;
			}
			//服务器并未在7点开机，12点之前开机，第一次打卡为为下班输入旷工，isCome=false,时间空
			else if((attends.get(0).getIsCome()==false)&&
					(attends.get(0).getPunchTime()==null)){
				return LEAVE_PUNCH;
			}
			else return NO_PUNCH;
		}
		//正常情况两次旷工已经自动输入
		else if(attends.size()==2){
			//此人12点之后才来上班
			if((attends.get(0).getIsCome()==true)&&
					(attends.get(0).getPunchTime()==null)&&
					(attends.get(1).getPunchTime()==null)){
				return BOTH_PUNCH;
	       }
			else if(attends.get(1).getPunchTime()==null){
				return LEAVE_PUNCH;
			}
			else return NO_PUNCH;
		}
		return NO_PUNCH;
	}

	/**打卡
	 * @param String empName
	 * @param dutyDay 日期
	 * 是否是上班打卡boolean isCome
	 * @return 打卡结果
	 */
	@Override
	public int punch(String empName, String dutyDay, boolean isCome) {
		// TODO Auto-generated method stub
		Employee emp=empDao.findByName(empName);
		if(emp==null){
			return PUNCH_FAIL;
		}
		
		Attend attend=attendDao.findByEmpAndDutyDayAndCome(emp, dutyDay, isCome);
		if(attend==null){
			return PUNCH_FAIL;
		}
		if(attend.getPunchTime()!=null){
			return PUNCHED;
		}
		System.out.println(empName+"打卡纪录");
		//获取当前时间
		int PunchHour=Calendar.getInstance().get(Calendar.HOUR);
		attend.setPunchTime(new Date());
		//上班打卡
		if(isCome){
			//9点前到，AttendType=1.正常
			if(PunchHour<=COME_LIMIT){
				attend.setType(typeDao.get(AttendType.class,1));
			}
			else if(PunchHour>COME_LIMIT&&PunchHour<=LATE_LIMIT){
				attend.setType(typeDao.get(AttendType.class,4));
			}
		}
		//下班打卡
		else{
			if(PunchHour>=LEAVE_LIMIT){
				attend.setType(typeDao.get(AttendType.class,1));
			}
			else if(PunchHour>=EARLY_LIMIT){
				attend.setType(typeDao.get(AttendType.class,5));
			}
		}
		attendDao.update(attend);
		return PUNCH_SUCC;
	}

	/**
	 * 根据员工浏览自己的工资
	 * @param empName 员工名
	 * @return 该员工的工资列表
	 */
	@Override
	public List<PaymentBean> empSalary(String empName) {
		// TODO Auto-generated method stub
		List<PaymentBean> result=new ArrayList<PaymentBean>();
		Employee emp=empDao.findByName(empName);
		if(emp!=null){
			List<Payment> pays=payDao.findByEmp(emp);
			
			for(Payment p:pays){
				result.add(new PaymentBean(p.getPayMonth(),p.getAmount()));
			}
			return result;
		}
		return result;
	}

	/**
 	 * 员工查看自己的最近三天非正常打卡
	 * @param empName 员工名
	 * @return 该员工的最近三天的非正常打卡
	 */
	@Override
	public List<AttendBean> unAttend(String empName) {
		Employee emp=empDao.findByName(empName);
		List<AttendBean> result=new ArrayList<AttendBean>();
		if(emp!=null){
			AttendType type=typeDao.get(AttendType.class,1);
			List<Attend> attends=attendDao.findByEmpUnAttend(emp, type);
			for(Attend a:attends){
				result.add(new AttendBean(
						a.getId(),
						a.getDutyDay(),
						a.getType().getName(),
						a.getPunchTime()));
			}
			return result;
			}
		return result;
	}

	/**
	 * 返回全部的出勤类别
	 * @return 全部的出勤类别
	 */
	@Override
	public List<AttendType> getAllType() {
		// TODO Auto-generated method stub
		return typeDao.findAll(AttendType.class);
	}

	/**
	 * 添加申请
	 * @param attId 申请的出勤ID
	 * @param typeId 申请的类型ID
	 * @param reason 申请的理由
	 * @return 添加的结果
	 */
	@Override
	public boolean addApplication(int attId, int typeId, String reason) {
		// TODO Auto-generated method stub
		Application app=new Application();
		//得到需要申请的出勤，通过id去寻找
		Attend attend=attendDao.get(Attend.class, attId);
	    AttendType type=typeDao.get(AttendType.class, typeId);
	    app.setAttend(attend);
	    app.setType(type);
	    if(reason!=null){
	    	app.setReason(reason);
	    }
	    appDao.save(app);
		return true;
     }
}