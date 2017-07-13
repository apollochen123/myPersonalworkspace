package service.Impl;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

import bean.AppBean;
import bean.EmpBean;
import bean.SalaryBean;
import dao.*;
import domain.Application;
import domain.Attend;
import domain.CheckBack;
import domain.Employee;
import domain.Manager;
import domain.Payment;
import exception.HrException;
import service.MgrManager;

public class MgrManagerImpl  implements MgrManager {

	private ApplicationDao appDao;
	private AttendDao attendDao;
	private CheckBackDao checkDao;
	private EmployeeDao empDao;
	private ManagerDao mgrDao;
	private PaymentDao payDao;
	@SuppressWarnings("unused")
	private AttendTypeDao typeDao;
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
		this.typeDao=typeDao;
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

	/**
	 * 新增员工
	 * @param emp 新增的员工
	 * @param mgr 员工所属的经理
	 */
	@Override
	public void addEmp(Employee emp, String mgr) throws HrException {
		Manager m=mgrDao.findByName(mgr);
		if(m==null){
			throw new HrException("你不是经理，还是没有登录");
			
		}
		emp.setManager(m);
		empDao.save(emp);
		
		
	}

	/**
	 * 根据经理返回所有的部门上个月工资
	 * @param mgr 新增的员工名
	 * @return 部门上个月工资
	 */
	@Override
	public List<SalaryBean> getSalaryByMgr(String mgr) throws HrException{
		// TODO Auto-generated method stub
		Manager m=mgrDao.findByName(mgr);
		Set<Employee> emps=m.getEmployees();
		if(emps==null||emps.size()<=0){
			throw  new HrException("你的部门员工为0");
		}
		//得到日期实例
		Calendar c=Calendar.getInstance();
		//得到上个月的实例
		c.add(Calendar.MONTH, -1);
		java.util.Date date=c.getTime();
		//格式化上个月实例为yyyy-MM
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM");
		s.format(date);
		List<SalaryBean> result=new ArrayList<SalaryBean>();
		for(Employee e:emps){
			Payment pay=payDao.findByMonthAndEmp(s.toString(), e);
			if(pay!=null){
			result.add(new SalaryBean(e.getName(),pay.getAmount()));
			}
		}
		return result;
	}

	/**
	 * 根据经理返回该部门的全部员工
	 * @param mgr 经理名
	 * @return 经理的全部下属
	 */
	@Override
	public List<EmpBean> getEmpsByMgr(String mgr) throws HrException{
		Manager m=mgrDao.findByName(mgr);
		if(m==null){
			throw new HrException("你是否是一名经理还是没有登录");
		}
		Set<Employee> emps=m.getEmployees();
		if(emps.size()<=0||emps==null){
			throw new HrException("你没有员工");
		}
		List<EmpBean> result=new ArrayList<EmpBean>();
		for(Employee e:emps){
			result.add(new EmpBean(e.getName(),e.getPass(),e.getSalary()));
		}
		return result;
	}

	/**
	 * 根据经理返回该部门的没有批复的申请
	 * @param mgr 经理名
	 * @return 该部门的全部申请
	 */
	@Override
	public List<AppBean> getAppsByMgr(String mgr) throws HrException{
		Manager m=mgrDao.findByName(mgr);
		if(m==null){
			throw new HrException("你还不是经理或者没有登录");
		}
		Set<Employee> emps=m.getEmployees();
		if(emps==null||emps.size()<=0){
			throw new HrException("你没有员工");
		}
		List<AppBean> result=new ArrayList<AppBean>();
		for(Employee e:emps){
			List<Application> apps=appDao.findByEmp(e);
			if(apps==null||apps.size()<=0){
				throw new HrException("你的员工没有申请");
			}
			for(Application a:apps){
				if(a.getResult() == false){
				result.add(new AppBean(a.getId(),
						e.getName(),
						a.getAttend().getType().getName(),
						a.getType().getName(),
						a.getReason()));
				}
				
			}
		}
		
		return result;
	}
	/**
	 * 处理申请
	 * @param appid 申请ID
	 * @param mgrName 经理名字
	 * @param result 是否通过
	 */
	@Override
	public void check(int appid, String mgrName, boolean result) throws HrException{
		//根据Id得到需要处理的申请
		Application app=appDao.get(Application.class,appid);
		//得到一个批复对象
		CheckBack check=new CheckBack();
		check.setApp(app);
		//得到经理
		Manager mgr=mgrDao.findByName(mgrName);
		if(mgr==null){
			throw new HrException("你是否没有登录或者不是经理");
		}
		check.setManager(mgr);
		//同意申请
		if(result==true){
			//通过申请
			check.setResult(true);
			//设置申请已经被批复
			app.setResult(true);
			appDao.update(app);
			//批复同意，需要修改申请对应出勤的类别
			Attend attend=app.getAttend();
			attend.setType(app.getType());
			attendDao.update(attend);
		}
		else{
			check.setResult(false);
			app.setResult(true);
			appDao.update(app);
		}
		//保存批复
		checkDao.save(check);
		
		
	}
	

}
