package action;

import java.util.List;

import domain.AttendType;

public class AppChangerAction extends EmpBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<AttendType> types;
	public List<AttendType> getTypes(){
		return this.types;
	}
	public void setTypes(List<AttendType> types){
		this.types=types;
	}
	
	
	public String execute()throws Exception{
		setTypes(mgr.getAllType());
		return SUCCESS;
	}
	

}
