package com.sitech.strategy.manage.entity.impl;

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
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IShortMessage;
import com.sitech.strategy.core.pojo.impl.ResultList;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.IShortMessageManageEntity;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;


/**
 * 短信实体
* @date: 2016-9-5 
* @author: sunliang
* @title: ShortMessageManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ShortMessageManageEntity extends BaseManageEntity implements
		IShortMessageManageEntity {

	/**
	 * 公共查询对象
	 */
	protected IDataSelector.ICommonSelector commonSelector;
	/**
     * 查询列表对象
     */
	protected ResultList resultList;
	/**
	 * 短信对象
	 */
	protected IShortMessage shortMessage;
	/**
	 * 短信接入码查询对象
	 */
	protected IDataSelector.IShortMessageSelector shortMessageSelector;
	/**
	 * 短信接入码插入对象
	 */
	protected IDataInsertor.IShortMessageInsertor shortMessageInsertor;
	/**
	 * 短信接入码删除对象
	 */
	protected IDataDeleter.IShortMessageDeleter shortMessageDeleter;

	/**
	 * 
	* @date: 2016-9-5 
	* @author: fangyuan_crmpd
	* @title: setCommonSelector 
	* @param commonSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCommonSelector(IDataSelector.ICommonSelector commonSelector) {
		this.commonSelector = commonSelector;
	}

	/** 
	 * @date: 2016-10-28 
	 * @author: xiongxq
	 * @Title: setShortMessageInsertor 
	 * @param shortMessageInsertor the shortMessageInsertor to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setShortMessageInsertor(
			IDataInsertor.IShortMessageInsertor shortMessageInsertor) {
		this.shortMessageInsertor = shortMessageInsertor;
	}

	/** 
	 * @date: 2016-10-28 
	 * @author: xiongxq
	 * @Title: setShortMessageDeleter 
	 * @param shortMessageDeleter the shortMessageDeleter to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setShortMessageDeleter(
			IDataDeleter.IShortMessageDeleter shortMessageDeleter) {
		this.shortMessageDeleter = shortMessageDeleter;
	}

	/** 
	 * @date: 2016-10-28 
	 * @author: xiongxq
	 * @Title: setShortMessageSelector 
	 * @param shortMessageSelector the shortMessageSelector to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setShortMessageSelector(
			IDataSelector.IShortMessageSelector shortMessageSelector) {
		this.shortMessageSelector = shortMessageSelector;
	}

	/**
	 * 
	* @date: 2016-10-10 
	* @author: fangyuan_crmpd
	* @title: setResultList 
	* @param resultList 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setResultList(ResultList resultList) {
		this.resultList = resultList;
	}	
	
	/**
	 * 
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: setShortMessage 
	* @param shortMessage 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setShortMessage(IShortMessage shortMessage) {
		this.shortMessage = shortMessage;
	}

	/**
	 * 根据工号查询接入码列表 
	* @date: 2016-10-27 
	* @author: xiongxq
	* @Title: queryAccessCodeListByLoginNo 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryAccessCodeListByLoginNo(
			Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter =this.settleAccessCodeListByLoginNoFilter(inParam);
		List<Map<String,Object>> accessCodeList = shortMessageSelector.selectAccessCodeListByLoginNo(inParam, queryFilter);
		List<Map<String,Object>> accessCodeNotList = shortMessageSelector.selectNotHasAccessCodeListByLoginNo(inParam, queryFilter);
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("accessCodeList", accessCodeList);
		outMap.put("accessCodeNotList", accessCodeNotList);
		return outMap;
	}

	/**
	 * 查询短信接入码 
	* @date: 2016-10-13 
	* @author: xiongxq
	* @Title: queryAccessCodeList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryShortMessageAccessCodeList(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		IPagingDevice pagingDevice = new PagingDevice();
		ISortParamer sortParamer = new SortParamer();
		IPagingDevice pagingDeviceTmp = resultList.queryResultList(inParam, queryFilter,sortParamer,pagingDevice.getInstance(inParam));
		Map<String,Object> outParam = this.getShortMessageAccessCodeListByPagingDevice(pagingDeviceTmp);
		return outParam;
	}
	
	/**
	 * 根据日期查询短信推送流量
	* @date: 2016-10-30 
	* @author: fangyuan_crmpd
	* @title: queryShortMsgMoveTrafficByDate 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryShortMsgMoveTrafficByDate(
			Map<String, Object> inParam) throws StrategyError {
		
		return null;
	}
	
	/**
	 * 根据营销案ID查询短信推送流量
	* @date: 2016-10-30 
	* @author: fangyuan_crmpd
	* @title: queryShortMsgMoveTrafficByMarketCaseId 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryShortMsgMoveTrafficByMarketCaseId(
			Map<String, Object> inParam) throws StrategyError {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 根据工号删除接入码 
	* @date: 2016-10-28 
	* @author: xiongxq
	* @Title: removeAccessCodeByLoginNo 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void removeAccessCodeByLoginNo(Map<String, Object> inParam)
			throws StrategyError {
		shortMessageDeleter.deleteAccessCodeByLoginNo(inParam);
		}

	/**
	 * 移除短信接入码
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: removeShortMessageAccessCode 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> removeShortMessageAccessCode(
			Map<String, Object> inParam) throws StrategyError {
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		shortMessage.removeShortMessageAccessCode(inParam, tempInParam);
		return null;
	}
	
	/**
	 * 给某个工号添加接入码 
	* @date: 2016-10-28 
	* @author: xiongxq
	* @Title: saveAccessCodeForLoginNo 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void saveAccessCodeForLoginNo(Map<String, Object> inParam)
			throws StrategyError {
		List<Map<String,Object>> outList = (List<Map<String,Object>>)inParam.get("outList");
		if(!CommonUtils.objectIsNull(outList)){
			shortMessageInsertor.insertBatchAccessCode(inParam);
		}else{
			shortMessageInsertor.insertAccessCode(inParam);
		}
	}

	/**
	 * 保存短信接入码
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: saveShortMessageAccessCode 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveShortMessageAccessCode(
			Map<String, Object> inParam) throws StrategyError {
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		shortMessage.addShortMessageAccessCode(inParam, tempInParam);
		return null;
	}

	/**
	 * 短信模拟发送
	* @date: 2017-1-9 
	* @author: tangaq
	* @title: sendShortMessageSimulation 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> sendShortMessageSimulation(Map<String, Object> inParam) throws StrategyError {
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		Map<String,Object> outMap = shortMessage.sendShortMessageSimulation(inParam,tempInParam);
		return outMap;
	}

	/**
	 * 更新短信接入码
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: updateShortMessageAccessCode 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> updateShortMessageAccessCode(
			Map<String, Object> inParam) throws StrategyError {
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		shortMessage.updateShortMessageAccessCode(inParam, tempInParam);
		return null;
	}
	
	/**
	 * 将对象PagingDevice中数据放到Map中
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: getShortMessageAccessCodeListByPagingDevice 
	* @param pagingDeviceTmp
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getShortMessageAccessCodeListByPagingDevice(IPagingDevice pagingDeviceTmp){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("currentPageCode", pagingDeviceTmp.getCurrentPageCode());
		outMap.put("perRecordCount", pagingDeviceTmp.getPerRecordCount());
		outMap.put("totalRecordCount", pagingDeviceTmp.getTotalRecordCount());
		outMap.put("accessCodeList", pagingDeviceTmp.getPerPageInfo());
		outMap.put("queryId", pagingDeviceTmp.getQueryId());
		return outMap;
	}

	/**
	 *生成 IQueryFilter对象
	* @date: 2016-10-28 
	* @author: xiongxq
	* @Title: settleAccessCodeListByLoginNoFilter 
	* @param inParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleAccessCodeListByLoginNoFilter(Map<String,Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setLoginNo((String)inParam.get("loginNo"));
		queryFilter.setSerType((String)inParam.get("serType"));
		return queryFilter;
	}
	
	/**
	 * 将Map参数放到queryFilter中
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: settleShortMessageAccessCodeList 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void setShortMessageAccessCodeMapToFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter=new QueryFilter();
	}
}
