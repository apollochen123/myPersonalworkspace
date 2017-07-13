package action;

public class ProcessAppAction extends EmpBaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int attId;//希望改变的出勤id
	private int typeId;//希望改变的类型
	private String reason;//理由
	
	public void setAttId(int attId)
	{
		this.attId = attId;
	}
	public int getAttId()
	{
		return this.attId;
	}

	// typeId的setter和getter方法
	public void setTypeId(int typeId)
	{
		this.typeId = typeId;
	}
	public int getTypeId()
	{
		return this.typeId;
	}

	// reason的setter和getter方法
	public void setReason(String reason)
	{
		this.reason = reason;
	}
	public String getReason()
	{
		return this.reason;
	}
	
	public String execute() throws Exception{
		boolean result=mgr.addApplication(attId, typeId, reason);
		if(result){
			addActionMessage("你已经提交申请，等待审阅");
		}
		else{
			addActionMessage("申请失败，请注意不要重复申请");
		}
		return SUCCESS;
	}

	

}
