package com.sitech.strategy.core.objectville.impl;

import java.util.Map;

import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.ILogin;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;

/**
 * 登录对象
* @date: 2016年9月5日 
* @author: wangth
* @Title: Login 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public class Login extends BaseClass implements ILogin {
	protected IDataSelector.ILoginSelector loginSelector;

	/** 
	 * @date: 2016-11-1 
	 * @author: xiongxq
	 * @Title: setLoginSelector 
	 * @param loginSelector the loginSelector to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setLoginSelector(IDataSelector.ILoginSelector loginSelector) {
		this.loginSelector = loginSelector;
	}

	/** 获取登录信息
	* @date: 2016-10-27 
	* @author: wangpei
	* @title: getLoginMsg 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> getLoginMsg(Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setLoginNo((String) inParam.get("loginNo"));
		return loginSelector.selectLoginNo(inParam, queryFilter);
	}

}
