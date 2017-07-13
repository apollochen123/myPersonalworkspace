package com.sitech.strategy.manage.entity.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.PagingDevice;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.impl.SortParamer;
import com.sitech.strategy.common.pojo.inter.IPagingDevice;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IUser;
import com.sitech.strategy.core.pojo.inter.IResultList;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.IUserManageEntity;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter.IUserDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor.IUserInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater.IUserUpdater;

/**
 * 用户实体
* @date: 2016-9-5 
* @author: tangaq
* @title: UserManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class UserManageEntity extends BaseManageEntity implements IUserManageEntity {
	
	/**
	 * 用户删除对象
	 */
	protected IUserDeleter userDeleter;
	/**
	 * 用户更新对象
	 */
	protected IUserUpdater userUpdater;
	/**
	 * 用户插入对象
	 */
	protected IUserInsertor userInsertor;
	/**
	 * 用户查询对象
	 */
	protected IDataSelector.IUserSelector userSelector;
	/**
	 * 用户对象
	 */
	protected IUser user;
	/**
	 * 查询灰名单列表对象
	 */
	protected IResultList resultList;
	
	/** 
	 * @date: 2016-10-15 
	 * @author: xiongxq
	 * @Title: setResultList 
	 * @param resultList the resultList to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setResultList(IResultList resultList) {
		this.resultList = resultList;
	}

	/**
	 * 
	* @date: 2016-10-24 
	* @author: fangyuan_crmpd
	* @title: setUserInsertor 
	* @param userInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setUserInsertor(IUserInsertor userInsertor) {
		this.userInsertor = userInsertor;
	}

	/** 
	 * @date: 2016-10-16 
	 * @author: xiongxq
	 * @Title: setUser 
	 * @param user the user to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setUser(IUser user) {
		this.user = user;
	}
	
	/**
	 * 
	* @date: 2016-10-27 
	* @author: fangyuan_crmpd
	* @title: setUserDeleter 
	* @param userDeleter 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setUserDeleter(IUserDeleter userDeleter) {
		this.userDeleter = userDeleter;
	}
	
	/**
	 * 
	* @date: 2016-10-27 
	* @author: fangyuan_crmpd
	* @title: setUserUpdater 
	* @param userUpdater 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setUserUpdater(IUserUpdater userUpdater) {
		this.userUpdater = userUpdater;
	}
	
	/**
	 * 
	* @date: 2016-11-26 
	* @author: fangyuan_crmpd
	* @title: setUserSelector 
	* @param userSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setUserSelector(IDataSelector.IUserSelector userSelector) {
		this.userSelector = userSelector;
	}

	/**
	 *  查询异网号码池列表 
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: queryDifferentNetPhonePoolList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryDifferentNetPhonePoolList(
			Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter =this.settleDifferentNetPhonePoolListFilter(inParam);
		IPagingDevice pagingDevice = new PagingDevice();
		ISortParamer sortParamer = new SortParamer();
		IPagingDevice pagingDeviceTmp = resultList.queryResultList(inParam, queryFilter,sortParamer,pagingDevice.getInstance(inParam));
		Map<String,Object> outParam = this.getDifferentNetPhonePoolListByPagingDevice(pagingDeviceTmp);
		return outParam;
	}
	
	/**
	 * 分页查询灰名单列表 
	* @date: 2017-3-14
	* @author: chenhao
	* @Title: queryGreyList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryGreyList(Map<String, Object> inParam)
			throws StrategyError {		
		Map<String,Object> outMap = userSelector.selectGreyListForPage(inParam);
		return outMap;
	}
	
	/**
	 * 查询用户回单记录
	* @date: 2017-3-12 
	* @author: wuJiaFu
	* @title: queryReceiptRecordList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryReceiptRecordList(
			Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter = this.settleReceiptRecordListFilter(inParam);
		int start = Integer.valueOf(inParam.get("currentPageCode")==null?"1":(String)inParam.get("currentPageCode"));
		int	limit = Integer.valueOf(inParam.get("perRecordCount")==null?"10":(String)inParam.get("perRecordCount"));
		Map<String,Object> outParam =userSelector.selectUserReceiptRecordList(inParam, queryFilter, start, limit);
		System.out.println("queryRecommendRecordList outParam"+outParam);
		List<Map<String, Object>> recormendRecordOutList =outParam.get("result") == null?new ArrayList<Map<String,Object>>():(List<Map<String,Object>>)outParam.get("result");
		outParam.put("receiptRecordOutList", recormendRecordOutList);
		int totalRecordCount =recormendRecordOutList.size();
		outParam.put("totalRecordCount", totalRecordCount);
		outParam.put("currentPageCode", start);
		outParam.put("perRecordCount", limit);
		return outParam;
	}

	

	/**
	 * 查询用户推荐记录信息
	* @date: 2017-2-13 
	* @author: wuJiaFu
	* @title: queryRecommendRecordList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryRecommendRecordList(Map<String, Object> inParam) 
			throws StrategyError {
		List<Map<String, Object>> userList=user.queryUserIdNoByServiceNbr(inParam);
		Map<String,Object> outParams = new HashMap<String, Object>();
	    if(CommonUtils.objectIsNull(userList)){
			return outParams;
		}
		String idNo = (String) userList.get(0).get("idNo");
		inParam.put("idNo", idNo);//idNo
		IQueryFilter queryFilter = this.settleRecommendRecordListFilter(inParam);
		int start = Integer.valueOf(inParam.get("currentPageCode")==null?"1":(String)inParam.get("currentPageCode"));
		int	limit = Integer.valueOf(inParam.get("perRecordCount")==null?"10":(String)inParam.get("perRecordCount"));
		List<Map<String,Object>> greyListOutList =userSelector.selectGreyList(inParam, queryFilter);
		Map<String,Object> outParam =userSelector.selectUserTouchViewList(inParam, queryFilter, start, limit);
		List<Map<String, Object>> recormendRecordOutList =outParam.get("result") == null?new ArrayList<Map<String,Object>>():(List<Map<String,Object>>)outParam.get("result");
		outParam.put("greyListOutList", greyListOutList);
		outParam.put("recommendRecordOutList", recormendRecordOutList);
		int totalRecordCount =recormendRecordOutList.size();
		outParam.put("totalRecordCount", totalRecordCount);
		outParam.put("currentPageCode", start);
		outParam.put("perRecordCount", limit);
		return outParam;
	}

	/**
	 * 查询用户资料列表
	* @date: 2016-11-7 
	* @author: fangyuan_crmpd
	* @title: queryUserDataList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryUserDataList(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter =this.settleUserDataListFilter(inParam);
		int start = Integer.valueOf(inParam.get("currentPageCode")==null?"1":(String)inParam.get("currentPageCode"));
		int	limit = Integer.valueOf(inParam.get("perRecordCount")==null?"10":(String)inParam.get("perRecordCount"));
		Map<String,Object> resMap = userSelector.selectUserDataList(inParam, queryFilter, start, limit);
		if (resMap == null) {
			resMap = new HashMap<String,Object>();
		}
		Map<String,Object> outMap = new HashMap<String, Object>();
		String sum = resMap.get("sum") == null?"0":resMap.get("sum")+"";
		List<Map<String,Object>> outList = resMap.get("result") == null?new ArrayList<Map<String,Object>>():(List<Map<String,Object>>)resMap.get("result");
		outMap.put("sum", sum);
		outMap.put("currentPageCode", start+"");
		outMap.put("perRecordCount", limit+"");
		outMap.put("result", outList);
		Map<String,Object> outParam = this.getUserDataListByPagingDevice(outMap);
		return outParam;
		
	}
	
	/**
	 * 查询用户标签列表
	* @date: 2016-10-19 
	* @author: tangaq
	* @title: queryUserLabelList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryUserLabelList(Map<String,Object> inParam) throws StrategyError{
		Map<String,Object> queryUserLabelList=userSelector.selectUserLabelForPage(inParam);
		return queryUserLabelList;
	}

	/**
	 * 删除灰名单 
	* @date: 2016-10-16 
	* @author: xiongxq
	* @Title: removeGrey 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void removeGrey(Map<String, Object> inParam) throws StrategyError {
		user.removeGrey(inParam);
	}
	
	/**
	 * 删除异网号码池 
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: removeDifferentNetPhonePool 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void removeDifferentNetPhonePool(Map<String, Object> inParam)
			throws StrategyError {
		userDeleter.deleteDifferentNetPhonePool(inParam);
	}

	/**
	 * 删除用户标签
	* @date: 2016-10-27 
	* @author: fangyuan_crmpd
	* @title: removeUserLabel 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeUserLabel(Map<String, Object> inParam)
			throws StrategyError {
		userDeleter.deleteUserLabel(inParam);
		
	}

	/**
	 * 批量保存灰名单 
	* @date: 2016-10-18 
	* @author: xiongxq
	* @Title: saveBatchGrey 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void saveBatchGrey(Map<String, Object> inParam) throws StrategyError {
		user.addBatchGrey(inParam);
	}

	/**
	 * 保存异网号码池 
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: saveDifferentNetPhonePool 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void saveDifferentNetPhonePool(Map<String, Object> inParam)
			throws StrategyError {
		userInsertor.insertDifferentNetPhonePool(inParam);
	}
	
	/**
	 * 保存单个灰名单 
	* @date: 2016-10-18 
	* @author: xiongxq
	* @Title: saveSingleGrey 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void saveSingleGrey(Map<String, Object> inParam)
			throws StrategyError {
		user.addSingleGrey(inParam);
	}
	
	/**
	 * 新增用户标签
	* @date: 2016-10-24 
	* @author: fangyuan_crmpd
	* @title: saveUserLabel 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveUserLabel(Map<String, Object> inParam)
			throws StrategyError {
		Map<String, Object> tempInParam = this.settleSaveUserLabelTemp(inParam);
		userInsertor.insertUserLabel(inParam, tempInParam);	
	}
	
	/** 
	 * 修改灰名单
	* @date: 2016-10-16 
	* @author: xiongxq
	* @Title: updateGrey 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void updateGrey(Map<String, Object> inParam) throws StrategyError {
		user.updateGrey(inParam);
	}

	/**
	 * 修改异网号码池  
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: updateDifferentNetPhonePool 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> updateDifferentNetPhonePool(
			Map<String, Object> inParam) throws StrategyError {
		userUpdater.updateDifferentNetPhonePool(inParam);
		return null;
	}
	
	/**
	 * 更新用户标签
	* @date: 2016-10-27 
	* @author: fangyuan_crmpd
	* @title: updateUserLabel 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateUserLabel(Map<String, Object> inParam)
			throws StrategyError {
		userUpdater.updateUserLabel(inParam);
		
	}

	/**
	 * 将IPagingDevice中数据取出放在Map里
	* @date: 2016-10-15 
	* @author: xiongxq
	* @Title: getGreyListByPagingDevice 
	* @param pagingDeviceTmp
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getGreyListByPagingDevice(IPagingDevice pagingDeviceTmp){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("currentPageCode", pagingDeviceTmp.getCurrentPageCode());
		outMap.put("perRecordCount", pagingDeviceTmp.getPerRecordCount());
		outMap.put("totalRecordCount", pagingDeviceTmp.getTotalRecordCount());
		outMap.put("queryId", pagingDeviceTmp.getQueryId());
		outMap.put("greyList", pagingDeviceTmp.getPerPageInfo());
		return outMap;
	}
	
	/**
	 * 将对象PagingDevice中数据放到Map中
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: getDifferentNetPhonePoolListByPagingDevice 
	* @param pagingDeviceTmp
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getDifferentNetPhonePoolListByPagingDevice(IPagingDevice pagingDeviceTmp){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("currentPageCode", pagingDeviceTmp.getCurrentPageCode());
		outMap.put("perRecordCount", pagingDeviceTmp.getPerRecordCount());
		outMap.put("totalRecordCount", pagingDeviceTmp.getTotalRecordCount());
		outMap.put("differentNetPhonePoolList", pagingDeviceTmp.getPerPageInfo());
		outMap.put("queryId", pagingDeviceTmp.getQueryId());
		return outMap;
	}
	
	/**
	 * 将对象PagingDevice中数据放到Map中
	* @date: 2017-2-13 
	* @author: wuJiaFu
	* @title: getRecommendRecordListByPagingDevice 
	* @param pagingDeviceTmp
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getRecommendRecordListByPagingDevice(IPagingDevice pagingDeviceTmp){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("currentPageCode", pagingDeviceTmp.getCurrentPageCode());
		outMap.put("perRecordCount", pagingDeviceTmp.getPerRecordCount());
		outMap.put("totalRecordCount", pagingDeviceTmp.getTotalRecordCount());
		outMap.put("queryId", pagingDeviceTmp.getQueryId());
		outMap.put("recommendRecordListList", pagingDeviceTmp.getPerPageInfo());
		return outMap;
	}
	
	/**
	 * 查询用户资料列表出参转换为 Map<String,Object>
	* @date: 2016-11-11 
	* @author: fangyuan_crmpd
	* @title: getUserDataListByPagingDevice 
	* @param pagingDeviceTmp
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getUserDataListByPagingDevice(Map<String,Object> out){
		Map<String,Object> outParam = new HashMap<String, Object>();
		outParam.put("currentPageCode", out.get("currentPageCode"));
		outParam.put("perRecordCount", out.get("perRecordCount"));
		outParam.put("totalRecordCount", out.get("sum"));
		outParam.put("queryId", "");
		outParam.put("queryUserDataList", out.get("result"));
	    return outParam;
	}

	/**
	 * 得到用户标签列表并放入Map中
	* @date: 2016-10-19 
	* @author: tangaq
	* @title: getUserLabelListByPagingDevice 
	* @param pagingDeviceTmp
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getUserLabelListByPagingDevice(IPagingDevice pagingDeviceTmp){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("currentPageCode", pagingDeviceTmp.getCurrentPageCode());
		outMap.put("perRecordCount", pagingDeviceTmp.getPerRecordCount());
		outMap.put("totalRecordCount", pagingDeviceTmp.getTotalRecordCount());
		outMap.put("tempLableList", pagingDeviceTmp.getPerPageInfo());
		outMap.put("queryId", pagingDeviceTmp.getQueryId());
		return outMap;
	}
	
	/**
	 * 生成IQueryFilter对象
	* @date: 2016-10-15 
	* @author: xiongxq
	* @Title: settleGreyListFilter 
	* @param inParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleGreyListFilter(Map<String,Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setChannelId((String) inParam.get("channelId"));
		queryFilter.setPhoneNo((String) inParam.get("phoneNo"));
		queryFilter.setRegionCode((String) inParam.get("regionCode"));
		return queryFilter;
	}
	
	/**
	 * 生成IPagingDevice对象
	* @date: 2016-10-15 
	* @author: xiongxq
	* @Title: settleGreyListPagingDevice 
	* @param inParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IPagingDevice settleGreyListPagingDevice(Map<String, Object> inParam){
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

	/**
	 * 生成ISortParamer对象
	* @date: 2016-10-15 
	* @author: xiongxq
	* @Title: settleGreyListSort 
	* @param inParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected  ISortParamer settleGreyListSort(Map<String, Object> inParam){
		ISortParamer sortParamer = new SortParamer();
		Map<String,String> sortMap = new HashMap<String, String>();
		sortMap.put("sortFlag", (String)inParam.get("sortFlag"));
		sortMap.put("sortField", (String)inParam.get("sortField"));
		sortParamer.setSortMap(sortMap);
		return sortParamer;
	}
	
	
	
	/**
	 *生成 IQueryFilter对象
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: settleDifferentNetPhonePoolListFilter 
	* @param inParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleDifferentNetPhonePoolListFilter(Map<String,Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setPhoneNo((String)inParam.get("phoneNo"));
		return queryFilter;
	}
	
	/**
	 * 生成IQueryFilter对象
	* @date: 2017-3-12 
	* @author: wuJiaFu
	* @title: settleRecommendRecordListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleReceiptRecordListFilter(Map<String,Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setServiceNbr((String)inParam.get("serviceNbr"));
		queryFilter.setChannelId((String)inParam.get("CHANNEL_ID"));
		queryFilter.setRecommonedStartTime((String)inParam.get("RECOMMONED_START_TIME"));
		queryFilter.setRecommonedEndTime((String)inParam.get("RECOMMONED_END_TIME"));
		return queryFilter;
	}
	
	/**
	 * 生成 IQueryFilter对象
	* @date: 2017-2-13 
	* @author: wuJiaFu
	* @title: settleRecommendRecordListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleRecommendRecordListFilter(Map<String,Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setIdNo((String)inParam.get("idNo"));
		queryFilter.setChannelId((String)inParam.get("CHANNEL_ID"));
		queryFilter.setRecommonedStartTime((String)inParam.get("RECOMMONED_START_TIME"));
		queryFilter.setRecommonedEndTime((String)inParam.get("RECOMMONED_END_TIME"));
		return queryFilter;
	}
	
	/**
	 * 新增用户标签入参转换为 Map<String,Object>
	* @date: 2016-10-24 
	* @author: fangyuan_crmpd
	* @title: settleSaveUserLabelTemp 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> settleSaveUserLabelTemp(Map<String, Object> inParam){
		Map<String, Object> tempInParam = inParam;
		return tempInParam ;
	}
	
	/**
	 * 查询用户资料列表入参转换为 IQueryFilter
	* @date: 2016-11-11 
	* @author: fangyuan_crmpd
	* @title: settleUserDataListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleUserDataListFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setCustNameOrServiceNbr((String) inParam.get("custNameOrServiceNbr"));
		return queryFilter;
	}

	/**
	 * 查询用户标签列表入参转换成IQueryFilter
	* @date: 2016-10-19 
	* @author: tangaq
	* @title: settleUserLabelListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleUserLabelListFilter (Map<String,Object> inParam){
		 IQueryFilter queryFilter = new QueryFilter();
		 queryFilter.setUserLabelCode((String)inParam.get("userLabelCode"));
		 queryFilter.setUserLabelName((String)inParam.get("userLabelName"));
		 queryFilter.setCustGroupId((String)inParam.get("custGroupId"));
		 return queryFilter;
	}

	/**
	 * 查询用户标签列表入参转换成IPagingDevice
	* @date: 2016-10-19 
	* @author: tangaq
	* @title: settleUserLabelListPagingDevice 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IPagingDevice settleUserLabelListPagingDevice (Map<String,Object> inParam){
		IPagingDevice pagingDevice = new PagingDevice();
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

	/**
	 * 查询用户标签列表入参转换成ISortParamer
	* @date: 2016-10-19 
	* @author: tangaq
	* @title: settleUserLabelListSort 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected ISortParamer settleUserLabelListSort (Map<String,Object> inParam){
		ISortParamer sortParamer = new SortParamer();
		Map<String,String> sortMap = new HashMap<String, String>();
		
		sortMap.put("sortFlag", (String)inParam.get("sortFlag"));
		sortMap.put("sortField", (String)inParam.get("sortField"));
		sortParamer.setSortMap(sortMap);
		
		return sortParamer;
	}

}
