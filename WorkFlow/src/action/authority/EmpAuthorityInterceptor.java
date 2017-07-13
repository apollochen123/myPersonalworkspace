package action.authority;

import com.opensymphony.xwork2.*;

import com.opensymphony.xwork2.interceptor.*;

import action.WebConstant;
import com.opensymphony.xwork2.ActionInvocation;


public class EmpAuthorityInterceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
	   ActionContext ctx=ActionContext.getContext();
	   String level=(String)ctx.getSession().get(WebConstant.LEVEL);
		// 如果level不为null，且level为emp或mgr
		if (level != null && (level.equals(WebConstant.EMP_LEVEL)
			|| level.equals(WebConstant.MGR_LEVEL)))
		{
			return invocation.invoke();
		}
		return Action.LOGIN;
	}
	

}
