package com.sitech.strategy.process.entity.param.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.regioncode.IRegionCodePojo;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.process.base.BaseProcessEntity;
import com.sitech.strategy.process.entity.param.inter.ILoadCacheProcessParam;

/**
 * 加载缓存参数处理
* @date: 2016-12-28 
* @author: sunliang 
* @title: LoadCacheProcessParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class LoadCacheProcessParam extends BaseProcessEntity implements
		ILoadCacheProcessParam {
	
	/**
	 * 公共数据查询操作接口
	 */
	protected IDataSelector.ICommonSelector commonSelector;
	/**
	 * regionCode接口
	 */
	protected IRegionCodePojo regionCodePojo;
	
	/**
	 * 
	* @date: 2016-12-28 
	* @author: sunliang 
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

	
	public void setRegionCodePojo(IRegionCodePojo regionCodePojo) {
		this.regionCodePojo = regionCodePojo;
	}

	/**
	 * 加载外呼任务营销案到缓存入参处理
	* @date: 2017-3-17 
	* @author: yuanchun
	* @title: loadWaitCreateCallTaskMarketCaseToCacheInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> loadWaitCreateCallTaskMarketCaseToCacheInParam() {
		Map<String,Object> inParam = new HashMap<String,Object>();
		String dataBaseTime = commonSelector.selectDataBaseSysTime();
		
		inParam.put("marketCaseStatusCode", "04");
		inParam.put("marketCaseValidDate", Const.TRUE_LOWER);
		inParam.put("sysDate", dataBaseTime);
		
		return inParam;
	}
	
	/**
	 * 加载渠道任务营销案到缓存入参处理
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: loadWaitCreateChannelTaskMarketCaseToCacheInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> loadWaitCreateChannelTaskMarketCaseToCacheInParam() {
		Map<String,Object> inParam = new HashMap<String,Object>();
		String dataBaseTime = commonSelector.selectDataBaseSysTime();
		
		inParam.put("marketCaseStatusCode", "04");
		inParam.put("marketCaseValidDate", Const.TRUE_LOWER);
		inParam.put("sysDate", dataBaseTime);
		
		return inParam;
	}

	/**
	 * 加载渠道触发营销案到缓存入参处理
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: loadChannelTriggerMarketCaseToCacheInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> loadChannelTriggerMarketCaseToCacheInParam() {
		
		Map<String,Object> inParam = new HashMap<String,Object>();
		String dataBaseTime = commonSelector.selectDataBaseSysTime();
		String[] regionCodeArray = regionCodePojo.getRegionCode();
		String provinceCode = regionCodePojo.getProvinceCode();
		
		inParam.put("marketCaseStatusCode", "04");
		inParam.put("marketCaseValidDate", Const.TRUE_LOWER);
		inParam.put("sysDate", dataBaseTime);
		inParam.put("regionCode", regionCodeArray);
		inParam.put("provinceCode", provinceCode);
		
		return inParam;
	}
	
	/**
	 * 加载关闭规则到缓存入参处理
	* @date: 2017-4-3 
	* @author: sunyuan
	* @title: loadCloseRuleToCacheInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> loadCloseRuleToCacheInParam(){
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("ruleDetailType", Const.RULE_TYPE_CLOSE);
		inParam.put("ruleParCode", "offerProductId");
		return inParam;
	}
	
	/**
	 * 加载评估规则到缓存入参处理
	* @date: 2017-4-6 
	* @author: sunyuan
	* @title: loadEvaluateRuleToCacheInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> loadEvaluateRuleToCacheInParam(){
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("ruleDetailType", Const.RULE_TYPE_EVALUATE);
		inParam.put("ruleParCode", "offerProductId");
		return inParam;
	}
	
	/**
	 * 加载事件触发营销案到缓存入参处理
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: loadEventTriggerMarketCaseToCacheInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> loadEventTriggerMarketCaseToCacheInParam() {
		Map<String, Object> inParam = new HashMap<String, Object>();
		String dataBaseTime = commonSelector.selectDataBaseSysTime();

		inParam.put("dataBaseTime", dataBaseTime);
		return inParam;
	}
	
	/**
	 * 加载费用事件到缓存入参处理
	* @date: 2017-2-12 
	* @author: sunyuan
	* @title: loadPayFeeAndEventRelToCacheInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> loadPayFeeAndEventRelToCacheInParam(){
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("eventType", Const.EVENT_CLASS_FEE_PAY);
		return inParam;
	}
	
	/**
	 * 加载营销案详细信息到缓存入参处理
	* @date: 2016-12-30 
	* @author: sunliang 
	* @title: loadMarketCaseToCacheInParam 
	* @param marketCaseLoadInterval
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> loadMarketCaseToCacheInParam(String marketCaseLoadInterval) {
		
		Map<String, Object> inParam = new HashMap<String, Object>();
		String dataBaseTime = commonSelector.selectDataBaseSysTime();
		Date currDate = DateUtil.StringToDate(dataBaseTime, DateUtil.TIME_FROMAT_SIMPLE3);
		Date queryDate = DateUtil.addMinutes(currDate, -Integer.parseInt(marketCaseLoadInterval));

		inParam.put("dataBaseTime", dataBaseTime);
		inParam.put("queryDate", DateUtil.DateToString(queryDate, DateUtil.TIME_FROMAT_SIMPLE3));
		return inParam;
	}
	
	/**
	 * 加载产品和事件数据到缓存入参处理
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: loadProductAndEventRelToCacheInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> loadProductAndEventRelToCacheInParam() {
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("eventDetailType", Const.RULE_TYPE_EVENT_PRODUCT);
		inParam.put("eventParCode", Const.RULE_CODE_EVENT_PRODUCTID);
		
		return inParam;
	}
	
	/**
	 * 加载待生成批量push营销案到缓存入参处理
	* @date: 2017-1-5 
	* @author: sunliang 
	* @title: loadWaitCreateBatchPushMarketCaseToCacheInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> loadWaitCreateBatchPushMarketCaseToCacheInParam() {
		
		Map<String,Object> inParam = new HashMap<String,Object>();
		String dataBaseTime = commonSelector.selectDataBaseSysTime();
		inParam.put("marketCaseStatusCode", "04");
		inParam.put("marketCaseValidDate", Const.TRUE_LOWER);
		inParam.put("sysDate", dataBaseTime);
		inParam.put("pushType", "02");
		
		return inParam;
	}
	
	/**
	 * 加载待发送批量push营销案到缓存入参处理
	* @date: 2017-1-5 
	* @author: sunliang 
	* @title: loadWaitCreateBatchPushMarketCaseToCacheInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> loadWaitSendBatchPushMarketCaseToCacheInParam() {
		
		Map<String,Object> inParam = new HashMap<String,Object>();
		String dataBaseTime = commonSelector.selectDataBaseSysTime();
		
		inParam.put("marketCaseStatusCode", "04");
		inParam.put("marketCaseValidDate", Const.TRUE_LOWER);
		inParam.put("triggerMode", "01");
		inParam.put("sysDate", dataBaseTime);
		
		return inParam;
	}

}
