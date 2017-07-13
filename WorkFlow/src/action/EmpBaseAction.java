package action;
import javax.annotation.Resource;

import com.opensymphony.xwork2.*;
import service.EmpManager;
public class EmpBaseAction extends ActionSupport
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 依赖的业务逻辑组件
	@Resource(name="empManager")
	protected EmpManager mgr;
	// 依赖注入业务逻辑组件所必须的setter方法
	public void setEmpManager(EmpManager mgr)
	{
		this.mgr = mgr;
	}
}