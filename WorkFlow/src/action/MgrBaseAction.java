package action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import service.MgrManager;

public class MgrBaseAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 48L;
	
	@Resource(name="mgrManager")
	protected MgrManager mgr;

	public void setMgrManager(MgrManager mgr)
	{
		this.mgr = mgr;
	}

}
