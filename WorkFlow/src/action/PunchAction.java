package action;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.ActionContext;

public class PunchAction extends EmpBaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//打卡结果返回
	private int punchIsValid;
	public void setPunchIsValid(int punchIsValid){
		this.punchIsValid=punchIsValid;
	}
	public int getPunchIsValid(){
		return this.punchIsValid;
	}
	public String execute() throws Exception{
		ActionContext ctx=ActionContext.getContext();
		String user=(String) ctx.getSession().get(WebConstant.USER);
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM--dd");
		String duty=s.format(new Date());
		int result=mgr.validPunch(user, duty);//返回是否可以打卡
		setPunchIsValid(result);
		return SUCCESS;
	}

}
