 package action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import bean.PaymentBean;

public class ViewSalaryAction extends EmpBaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<PaymentBean> salarys;
	public void setSalarys(List<PaymentBean> salarys){
		this.salarys=salarys;
	}
	public List<PaymentBean> getSalarys(){
		return this.salarys;
	}
	public String execute() throws Exception{
		ActionContext ctx=ActionContext.getContext();
		String user=(String )ctx.getSession().get(WebConstant.USER);
		List<PaymentBean> result=mgr.empSalary(user);
		setSalarys(result);
		return SUCCESS;
	}
	

}
