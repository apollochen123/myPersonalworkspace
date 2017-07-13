package com.sitech.strategy.common.pojo.impl;

import java.io.Serializable;
import java.util.Map;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.IResultItemPojo;

/**
 * 查询结果对象
* @date: 2016-9-5 
* @author: sunliang 
* @title: ResultItemPojo 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ResultItemPojo extends BaseClass implements IResultItemPojo,Comparable<ResultItemPojo>,Serializable {
	
	/**
	 * 创建时间
	 */
	private String createTime;
	/**
	 * 操作工号
	 */
	private String loginNo;
	
	/**
	 * 查询结果
	 */
	private Map<String,Object> resultMap;
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: getCreateTime 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setCreateTime 
	* @param createTime 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: getLoginNo 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getLoginNo() {
		return loginNo;
	}

	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setLoginNo 
	* @param loginNo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setLoginNo(String loginNo) {
		this.loginNo = loginNo;
	}

	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: getResultMap 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getResultMap() {
		return resultMap;
	}

	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setResultMap 
	* @param resultMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setResultMap(Map<String, Object> resultMap) {
		this.resultMap = resultMap;
	}
	
	/**
	 * 
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: hashCode 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public int hashCode(){
		return 0;
	}
	
	/**
	 * 
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: equals 
	* @param obj
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public boolean equals(Object obj){
		return false;
	}
	
	/**
	 * 
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: compareTo 
	* @param o
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public int compareTo(ResultItemPojo o) {
		return 0;
	}
	
	/**
	 * 设置ResultItemPojo对象
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: setResultItemPojo 
	* @param resultMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static ResultItemPojo setResultItemPojo(Map<String,Object> resultMap){
		ResultItemPojo resultItemPojo = new ResultItemPojo();
		resultItemPojo.setCreateTime((String)resultMap.get("createTime"));
		resultItemPojo.setLoginNo((String)resultMap.get("loginNo"));
		resultItemPojo.setResultMap(resultMap);
		return resultItemPojo;
	}
}
