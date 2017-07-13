package action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import bean.AttendBean;

public class ViewUnAttendAction extends EmpBaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<AttendBean> unAttend;
	public List<AttendBean> getUnAttend(){
		return this.unAttend;
	}
	public void setUnAttend(List<AttendBean> unAttend){
		this.unAttend=unAttend;
	}
	public String execute() throws Exception{
		ActionContext ctx=ActionContext.getContext();
		String user=(String)ctx.getSession().get(WebConstant.USER);
		List<AttendBean> result=mgr.unAttend(user);
		setUnAttend(result);
		return SUCCESS;
	}

}
