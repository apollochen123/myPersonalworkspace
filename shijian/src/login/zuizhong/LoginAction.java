package login.zuizhong;


import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import login.zuizhong.HibernateUtil;


public class LoginAction implements Action
{
	private String user;
	private String pass;

	//user的get和set方法
	public void setUser(String user)
	{
		this.user = user;
	}
	public String getUser()
	{
		return this.user;
	}

	//pass的get和set方法
	public void setPass(String pass)
	{
		this.pass = pass;
	}
	public String getPass()
	{
		return this.pass;
	}
	public boolean check(){
	    Object[] o=null;
		Session sess=HibernateUtil.currentSession();
		Transaction tx=sess.beginTransaction();
		// 以HQL语句创建Query对象.
				List pl = sess.createQuery("select distinct p.user , p.pass "
					+ "from Person p where user=:eventUser and pass=:eventPass")
						.setString("eventUser", getUser())
						.setString("eventPass", getPass())
					// Query调用list()方法访问查询得到的全部属性
					.list();
				for(Object ele:pl){
					Object[] objs=(Object[])ele;
					o=objs;
					
				}
				// 遍历查询的全部结果
				if(o!=null){
					
					
					tx.commit();
					HibernateUtil.closeSession();
					
					return true;
				}
				else{
					tx.commit();
					HibernateUtil.closeSession();
					return false;
				}
			
	}


	public String execute()
	{
		
		boolean check=check();
		if (check==true){
			ActionContext ctx = ActionContext.getContext();
			Map<String,Object> session = ctx.getSession();
			session.put("user" , getUser());
			
			
		return SUCCESS;
		}
		else{
		ActionContext ctx = ActionContext.getContext();
		ctx.put("tip","用户名或者密码错误或者不存在，重新登录或者注册");
	   return LOGIN;
		}
		
		
}
	
}