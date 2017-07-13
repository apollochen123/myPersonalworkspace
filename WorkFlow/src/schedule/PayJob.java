package schedule;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import service.EmpManager;


public class PayJob extends QuartzJobBean
{
	// 判断作业是否执行的旗标
	private boolean isRunning = false;
	// 该作业类所依赖的业务逻辑组件
    private EmpManager empMgr;
    @Autowired() @Qualifier("empManager")   
	public void setEmpManager(EmpManager empMgr){
		this.empMgr=empMgr;
	}

	// 定义任务执行体
	public void executeInternal(JobExecutionContext ctx)
		throws JobExecutionException
	{
		if (!isRunning)
		{
			System.out.println("开始调度自动结算工资");
			isRunning = true;
			// 调用业务逻辑方法
			empMgr.autoPay();
			isRunning = false;
		}
	}
}