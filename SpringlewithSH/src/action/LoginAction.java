package action;

import com.opensymphony.xwork2.ActionSupport;

import logic.MyCheckForLogin;

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	
	private MyCheckForLogin me;
	
	public void setMe(MyCheckForLogin me){
		this.me=me;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getUsername()
	{
		return this.username;
	}
	// password的setter和getter方法
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getPassword()
	{
		return this.password;
	}
	public String execute() throws Exception{
		if(me.check(username, password)>0){
			addActionMessage("success");
			return SUCCESS;
		}
		return ERROR;
	}
	
	

}
