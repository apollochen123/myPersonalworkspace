package schedule;

import javax.annotation.Resource;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;


import service.EmpManager;

public class PunchJob extends QuartzJobBean {
	private boolean isRunning =false;//旗标
	//依赖注入
	private EmpManager empMgr;
	@Resource(name="empManager")
	public void setEmpManager(EmpManager empMgr){
		this.empMgr=empMgr;
	}

	

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		if(!isRunning){
			System.out.println("开始调度自动打卡");
			isRunning=true;
			empMgr.autoPunch();
			isRunning=false;
		}
	}

}
