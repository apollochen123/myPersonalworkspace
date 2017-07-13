package action;

import com.opensymphony.xwork2.ActionContext;


public class ProcessPunchAction extends EmpBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String come() throws Exception{
		return process(true);
	}

	public String leave() throws Exception{
		return process(false);
	}
	
	private String process(boolean isCome) throws Exception {
		ActionContext ctx=ActionContext.getContext();
		String user=(String) ctx.getSession().get(WebConstant.USER);
		System.out.println("-----打卡----" + user);
		String date=new java.sql.Date(System.currentTimeMillis()).toString();
		int result=mgr.punch(user, date, isCome);
		switch(result){
		case 0:
			addActionMessage("打卡失败");
			break;
		case 1:
			addActionMessage("你已经打过卡了");
			break;
		case 2:
			addActionMessage("打卡成功");
			break;
	   
	   }
		return SUCCESS;
	}
}
