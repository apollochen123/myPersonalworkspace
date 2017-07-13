package com.sitech.strategy.common.pojo.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.IPagingDevice;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;

/**
 * 分页器对象
* @date: 2016-9-5 
* @author: sunliang 
* @title: PagingDevice 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class PagingDevice extends BaseClass implements IPagingDevice{
	
	/**
	 * 当前页码
	 */
	protected int currentPageCode;
	/**
	 * 每页记录数
	 */
	protected int perRecordCount;
	/**
	 * 总记录数
	 */
	protected int totalRecordCount;
	/**
	 * 总页数
	 */
	protected int totalPage;
	/**
	 * 前一页
	 */
	protected int perviousPage;
	/**
	 * 后一页
	 */
	protected int nextPage;
	
	/**
	 * 开始记录数
	 */
	protected int startPage;
	/**
	 * 结束记录数
	 */
	protected int endPage;
	
	/**
	 * 查询Id(序列)
	 */
	protected String queryId;
	
	/**
	 * 每页的信息
	 */
	protected List<Map<String, Object>> perPageInfo = new ArrayList<Map<String, Object>>();
	
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setCurrentPageCode 
	* @param currentPageCode 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCurrentPageCode(int currentPageCode) {
		this.currentPageCode = currentPageCode;
	}
	
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
	public void setTotalRecordCount(int totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

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
	public List<Map<String, Object>> getPerPageInfo() {
		return perPageInfo;
	}

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
	public void setPerPageInfo(List<Map<String, Object>> perPageInfo) {
		this.perPageInfo = perPageInfo;
	}
	
	

	/**
	 * 构造方法，默认当前页为1，每页记录数为10
	* @date: 2016-9-13 
	* @author: sunliang  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public PagingDevice(){
		this.currentPageCode = 1;
		this.perRecordCount = 10;
	}
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: getCurrentPageCode 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public int getCurrentPageCode() {
		return currentPageCode;
	}
	
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
	@Override
	public int getEndNum() {
		return currentPageCode*perRecordCount;
	}
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: getPerRecordCount 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public int getPerRecordCount() {
		return perRecordCount;
	}
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setPerRecordCount 
	* @param perRecordCount 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPerRecordCount(int perRecordCount) {
		this.perRecordCount = perRecordCount;
	}
	
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
	public int getTotalRecordCount() {
		return totalRecordCount;
	}
	
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
	@Override
	public int getTotalPage() {
		if(this.totalRecordCount%this.perRecordCount==0){
			this.totalPage=this.totalRecordCount/this.perRecordCount;
		}else{
			this.totalPage=this.totalRecordCount/this.perRecordCount+1;
		}
		return totalPage;
	}
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
	@Override
	public int getPerviousPage() {
		
		if(this.currentPageCode-1>0){
			this.perviousPage=this.currentPageCode-1;
		}else{
			this.perviousPage=this.currentPageCode;
		}
		
		return perviousPage;
	}
	
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
	@Override
	public int getNextPage() {
		if(this.currentPageCode+1>totalPage){
			this.nextPage=this.currentPageCode;
		}else{
			this.nextPage=this.currentPageCode+1;
		}
		return nextPage;
	}
	
	/**
	 * 获取后一页页面
	* @date: 2016-12-15 
	* @author: zhangjj_crmpd
	* @title: getStartNum 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public int getStartNum() {
		return (currentPageCode-1)*perRecordCount;
	}
	
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
	@Override
	public int getStartRecord(){
		return (currentPageCode-1)*perRecordCount;
	}
	
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
	@Override
	public int getEndRecord(){
		return currentPageCode*perRecordCount-1;
	}

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
	@Override
	public String getQueryId() {
		return queryId;
	}

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
	@Override
	public void setQueryId(String queryId) {
		this.queryId = queryId;
	}
	
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
	@Override
	public PagingDevice getInstance(Map<String,Object> inParam){
		PagingDevice pagingDevice = new PagingDevice();
		String currentPageCode = (String)inParam.get("currentPageCode");
		String perRecordCount = (String)inParam.get("perRecordCount");
		String totalRecordCount = (String)inParam.get("totalRecordCount");
		pagingDevice.setQueryId((String)inParam.get("queryId"));
		if(CommonUtils.objectIsNull(currentPageCode) == false){
			pagingDevice.setCurrentPageCode(Integer.parseInt(currentPageCode));
		}else{
			pagingDevice.setCurrentPageCode(Const.DEFAULT_CURRENT_PAGE);
		}
		if(CommonUtils.objectIsNull(perRecordCount) == false){
			pagingDevice.setPerRecordCount(Integer.parseInt(perRecordCount));
		}else{
			pagingDevice.setPerRecordCount(Const.DEFAULT_PER_RECORD_COUNT);
		}
		if(CommonUtils.objectIsNull(totalRecordCount) == false){
			pagingDevice.setTotalRecordCount(Integer.parseInt(totalRecordCount));
		}else{
			pagingDevice.setTotalRecordCount(Const.DEFAULT_TOTAL_RECORD_COUNT);
		}
		return pagingDevice;
	}

}
