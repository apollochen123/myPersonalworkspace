package com.sitech.strategy.common.pojo.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.PagingDevice;

/**
 * 分页器对象接口
* @date: 2016-9-5 
* @author: sunliang 
* @title: IPagingDevice 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IPagingDevice {
	
	
	/**
	 * 
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: getCurrentPageCode 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public int getCurrentPageCode();
	
	/**
	 * 
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: setCurrentPageCode 
	* @param currentPageCode 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCurrentPageCode(int currentPageCode);
	
	/**
	 * 
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: getPerRecordCount 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public int getPerRecordCount();
	
	/**
	 * 
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: setPerRecordCount 
	* @param perRecordCount 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPerRecordCount(int perRecordCount);
	
	/**
	 * 
	* @date: 2016-9-22 
	* @author: yangwl
	* @title: getTotalRecordCount 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public int getTotalRecordCount();

	/**
	 * 
	* @date: 2016-9-22 
	* @author: yangwl
	* @title: setTotalRecordCount 
	* @param totalRecordCount 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTotalRecordCount(int totalRecordCount);

	/**
	 * 
	* @date: 2016-9-22 
	* @author: yangwl
	* @title: getPerPageInfo 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, Object>> getPerPageInfo();

	/**
	 * 
	* @date: 2016-9-22 
	* @author: yangwl
	* @title: setPerPageInfo 
	* @param perPageInfo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPerPageInfo(List<Map<String, Object>> perPageInfo);

	/**
	 * 获取结束记录数
	* @date: 2016-12-15 
	* @author: zhangjj_crmpd
	* @title: getEndNum 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public int getEndNum();
	
	/**
	 * 获取后一页页面
	* @date: 2016-10-5 
	* @author: zhangjj_crmpd
	* @title: getNextPage 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public int getNextPage();

	/**
	 * 获取前一页页面
	* @date: 2016-10-5 
	* @author: zhangjj_crmpd
	* @title: getPerviousPage 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public int getPerviousPage();

	/**
	 * 获取总页数
	* @date: 2016-10-5 
	* @author: zhangjj_crmpd
	* @title: getTotalPage 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public int getTotalPage();
	
	/**
	 * 获取开始记录数
	* @date: 2016-12-15 
	* @author: zhangjj_crmpd
	* @title: getStartNum 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public int getStartNum();

	/**
	 * 获取开始记录数
	* @date: 2016-10-5 
	* @author: zhangjj_crmpd
	* @title: getStartRecord 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public int getStartRecord();

	/**
	 * 获取结束记录数
	* @date: 2016-10-5 
	* @author: zhangjj_crmpd
	* @title: getEndRecord 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public int getEndRecord();

	/**
	 * 
	* @date: 2016-10-10 
	* @author: zhangjj_crmpd
	* @title: getQueryId 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getQueryId();

	/**
	 * 
	* @date: 2016-10-10 
	* @author: zhangjj_crmpd
	* @title: setQueryId 
	* @param queryId 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setQueryId(String queryId);
	
	/**
	 * 获得分页对象
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: getInstance 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public PagingDevice getInstance(Map<String,Object> inParam);

}
