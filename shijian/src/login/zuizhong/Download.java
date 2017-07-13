package login.zuizhong;

import java.io.InputStream;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;


public class Download implements Action {
	private String inputPath;
	
	public void setInputPath(String s){
		this.inputPath=s;
	}
	public String getInputPath(){
		return inputPath;
	}
	public InputStream getTargetFile() throws Exception{
		return ServletActionContext.getServletContext().getResourceAsStream(inputPath);
		}
	public String execute() throws Exception{
		ActionContext ctx=ActionContext.getContext();
		Map session = ctx.getSession();
		String user=(String)session.get("user");
		if(user!=null){
			return SUCCESS;
		}
		ctx.put("tip", "请登录才能下载");
		return LOGIN;
	}

}