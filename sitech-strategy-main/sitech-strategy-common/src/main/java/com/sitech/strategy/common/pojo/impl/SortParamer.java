package com.sitech.strategy.common.pojo.impl;

import java.util.Map;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.ISortParamer;

/**
 * 排序参数器
* @date: 2016-9-5 
* @author: sunliang 
* @title: SortParamer 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class SortParamer extends BaseClass implements ISortParamer{
	
	/**
	 * 第一排序
	 */
	private static final String SORT_PRIORITY_FRIST = "first";
	/**
	 * 第二排序
	 */
	private static final String SORT_PRIORITY_SECOND = "second";
	/**
	 * 第三排序
	 */
	private static final String SORT_PRIORITY_THIRD = "third";
	/**
	 * 第四排序
	 */
	private static final String SORT_PRIORITY_FOURTH = "fourth";
	/**
	 * 第五排序
	 */
	private static final String SORT_PRIORITY_FIFTH = "fifth";
	
	/**
	 * 存放排序字段
	 */
	private Map<String,String> sortMap;

	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: getSortMap 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, String> getSortMap() {
		return sortMap;
	}

	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setSortMap 
	* @param sortMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSortMap(Map<String, String> sortMap) {
		this.sortMap = sortMap;
	}
	
}
