package com.sitech.strategy.persist.capacity.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.pojo.impl.ResultItemPojo;
import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.persist.base.BaseRedisDB;

/**
 * redis数据操控类
* @date: 2016-9-12 
* @author: zhaoyue
* @title: ProceCacheDMLByRedis 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ProceCacheDMLByRedis extends BaseRedisDB implements ICacheDML,Serializable {
	
	/**
	 * 客户群标签表达式缓存
	* @date: 2017-1-10 
	* @author: sunliang 
	* @title: CustGroupLableFormulaCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class CustGroupLableFormulaCache extends ICustGroupLabelFormulaCache implements Serializable{
		
		/**
		 * 增加
		* @date: 2016-9-30 
		* @author: yangwl
		* @title: add 
		* @param custGroupLable 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void add(Map<String, Object> tempInParam){
			cache.putAll((Map<Object, Object>)tempInParam.get(Const.CACHE_VALUE));
		}
		
		/**
		 * 查询
		* @date: 2016-10-1 
		* @author: yangwl
		* @title: get 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		String get(Map<String, Object> tempInParam){
			return (String)cache.get((String)tempInParam.get(Const.CACHE_KEY));
		}
		
		/**
		 * 加载
		* @date: 2017-3-15 
		* @author: yuanchun
		* @title: addList 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void addList(Map<String, Object> tempInParam) {
			cache.add((String)tempInParam.get(Const.CACHE_KEY),
					(List<String>)tempInParam.get(Const.CACHE_VALUE),
					Const.CACHE_RESTORE_TYPE_LIST,
					(String)tempInParam.get(Const.CACHE_DIRECTION));
		}
	}
	
	/**
	 * 静态标签客户群缓存
	* @date: 2017-3-14 
	* @author: liuqi
	* @title: StaticLabelCustGroupCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class StaticLabelCustGroupCache extends IStaticLabelCustGroupCache implements Serializable{
			
  	    /**
		 * 获取和删除
		* @date: 2017-3-15 
		* @author: liuqi
		* @title: getAndRemove 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@SuppressWarnings("unchecked")
		@Override
		String getAndRemove(Map<String, Object> tempInParam) {
			return (String) cache.remove(
					(String)tempInParam.get(Const.CACHE_KEY),
					Const.CACHE_RESTORE_TYPE_LIST,
					(String)tempInParam.get(Const.CACHE_DIRECTION));
		}
	}
	
	/**
	 * 渠道展示数量缓存
	* @date: 2017-1-10 
	* @author: sunliang 
	* @title: ChannelShowNumCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ChannelShowNumCache extends IChannelShowNumCache implements Serializable{

		/**
		 * 增加
		* @date: 2016-11-28 
		* @author: yangwl
		* @title: add 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void add(Map<String, Object> tempInParam) {
			cache.add((String)tempInParam.get(Const.CACHE_KEY),
					tempInParam.get(Const.CACHE_VALUE));
		}

		/**
		 * 查询
		* @date: 2016-11-28 
		* @author: yangwl
		* @title: get 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> get(Map<String, Object> tempInParam) {
			List<Map<String, Object>> list = (List<Map<String, Object>>)cache.get((String)tempInParam.get(Const.CACHE_KEY));
			if(CommonUtils.objectIsNull(list)){
				list = new ArrayList<Map<String, Object>>();
			}
			return list;
		}
		
	}
	
	/**
	 * 渠道触发营销案缓存
	* @date: 2017-1-10 
	* @author: sunliang 
	* @title: ChannelTriggerMarketCaseCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ChannelTriggerMarketCaseCache extends IChannelTriggerMarketCaseCache implements Serializable{
		
		/**
		 * 增加
		* @date: 2017-1-16 
		* @author: sunliang 
		* @title: add 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void add(Map<String, Object> tempInParam){
			cache.putAll((String)tempInParam.get(Const.CACHE_KEY),
					(List<Map<Object, Object>>) tempInParam.get(Const.CACHE_VALUE));
		}
		
		/**
		 * 查询
		* @date: 2016-10-1 
		* @author: yangwl
		* @title: get 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<String> get(Map<String, Object> tempInParam){
			List<String> list = cache.getAll((String) tempInParam.get(Const.CACHE_KEY), 
							Long.parseLong((String) tempInParam.get(Const.CACHE_START)), 
							Long.parseLong((String) tempInParam.get(Const.CACHE_END)),
							Const.CACHE_RESTORE_TYPE_ZSET);
			if(CommonUtils.objectIsNull(list)){
				list = new ArrayList<String>();
			}
			return list;
		}
	}
	
	/** 
	 * 事件触发营销案缓存
	* @date: 2016-11-23 
	* @author: songxj
	* @title: EventTriggerMarketCaseCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note: 
	*/
	public class EventTriggerMarketCaseCache extends IEventTriggerMarketCaseCache implements Serializable{

		/** 
		 * 加载
		* @date: 2016-11-23 
		* @author: songxj
		* @title: add 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void putAll(Map<String, Object> tempInParam) {
			cache.putAll((String)tempInParam.get(Const.CACHE_KEY),
					(List<Map<Object, Object>>)tempInParam.get(Const.CACHE_VALUE));
		}

		/** 
		 * 查询
		* @date: 2016-11-23 
		* @author: songxj
		* @title: get 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		List<String> get(Map<String, Object> tempInParam) {
			return cache.getAll((String)tempInParam.get(Const.CACHE_KEY), 
							Long.parseLong((String)tempInParam.get(Const.CACHE_START)), 
							Long.parseLong((String)tempInParam.get(Const.CACHE_END)),
							Const.CACHE_RESTORE_TYPE_ZSET);
		}
		
	}
	
	/**
	 * 缴费与事件关系缓存
	* @date: 2017-2-13 
	* @author: sunyuan
	* @title: FeeAndEventRelCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class FeeAndEventRelCache extends IFeeAndEventRelCache implements Serializable{

		/**
		 * 加载
		* @date: 2017-2-13 
		* @author: sunyuan
		* @title: putAll 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void putAll(Map<String, Object> tempInParam) {
			cache.putAll((String)tempInParam.get(Const.CACHE_KEY),
					(List<Map<Object, Object>>) tempInParam.get(Const.CACHE_VALUE));
		}

		/**
		 * 查询
		* @date: 2017-2-13 
		* @author: sunyuan
		* @title: get 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<String> get(Map<String, Object> tempInParam) {
			return cache.getAll((String) tempInParam.get(Const.CACHE_KEY), 
					Long.parseLong((String)tempInParam.get(Const.CACHE_START)), 
					Long.parseLong((String)tempInParam.get(Const.CACHE_END)),
					Const.CACHE_RESTORE_TYPE_ZSET);
		}
	}
	
	/**
	 * 关闭规则缓存
	* @date: 2017-4-6 
	* @author: sunyuan
	* @title: CloseRuleCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class CloseRuleCache extends ICloseRuleCache implements Serializable{
		
		/**
		 * 加载
		* @date: 2017-4-6 
		* @author: sunyuan
		* @title: add 
		* @param tempParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void add(Map<String,Object> tempInParam){
			cache.add((String)tempInParam.get(Const.CACHE_KEY),
					(List<String>) tempInParam.get(Const.CACHE_VALUE));
		}
		
		/**
		 * 查询
		* @date: 2017-4-7 
		* @author: sunyuan
		* @title: get 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<String> get(Map<String, Object> tempInParam) {
			List<String> closeRuleList = (List<String>)cache.get((String)tempInParam.get(Const.CACHE_KEY));
			if(CommonUtils.objectIsNull(closeRuleList)){
				closeRuleList = new ArrayList<String>();
			}
			return closeRuleList;
		}
	}
	
	/**
	 * 评估规则缓存
	* @date: 2017-4-6 
	* @author: sunyuan
	* @title: EvaluateRuleCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class EvaluateRuleCache extends IEvaluateRuleCache implements Serializable{
		
		/**
		 * 加载
		* @date: 2017-4-6 
		* @author: sunyuan
		* @title: add 
		* @param tempParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void add(Map<String,Object> tempInParam){
			cache.add((String)tempInParam.get(Const.CACHE_KEY),
					(List<String>) tempInParam.get(Const.CACHE_VALUE));
		}
		
		/**
		 * 查询
		* @date: 2017-4-7 
		* @author: sunyuan
		* @title: get 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<String> get(Map<String, Object> tempInParam) {
			List<String> evaluateRuleList = (List<String>)cache.get((String)tempInParam.get(Const.CACHE_KEY));
			if(CommonUtils.objectIsNull(evaluateRuleList)){
				evaluateRuleList = new ArrayList<String>();
			}
			return evaluateRuleList;
		}
	}
	
	/**
	 * 全局规则缓存
	* @date: 2016-11-15 
	* @author: yangwl
	* @title: GlobalRuleCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class GlobalRuleCache extends IGlobalRuleCache implements Serializable{
		
		/**
		 * 加载
		* @date: 2016-11-19 
		* @author: yangwl
		* @title: add 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void add(Map<String, Object> tempInParam) {
			cache.add((String)tempInParam.get(Const.CACHE_KEY),
					(Map<String, Object>)tempInParam.get(Const.CACHE_VALUE));
		}

		/**
		 * 查询
		* @date: 2016-11-15 
		* @author: yangwl
		* @title: get 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> get(Map<String, Object> tempInParam) {
			Map<String,Object> globalRuleMap = (Map<String, Object>)cache.get((String)tempInParam.get(Const.CACHE_KEY));
			if(CommonUtils.objectIsNull(globalRuleMap)){
				globalRuleMap = new HashMap<String,Object>();
			}
			
			return globalRuleMap;
		}

	}
	
	/**
	 * 互斥规则缓存
	* @date: 2017-3-30 
	* @author: sunyuan
	* @title: MutexRuleCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class MutexRuleCache extends IMutexRuleCache implements Serializable{
		
		/**
		 * 加载
		* @date: 2017-3-30 
		* @author: sunyuan
		* @title: add 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void add(Map<String, Object> tempInParam) {
			cache.add((String)tempInParam.get(Const.CACHE_KEY),
					(List<String>) tempInParam.get(Const.CACHE_VALUE));
		}
		
		/**
		 * 查询
		* @date: 2017-3-31 
		* @author: sunyuan
		* @title: get 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<String> get(Map<String,Object> tempInParam){
			List<String> mutexRuleList = (List<String>)cache.get((String)tempInParam.get(Const.CACHE_KEY));
			if(CommonUtils.objectIsNull(mutexRuleList)){
				mutexRuleList = new ArrayList<String>();
			}
			return mutexRuleList;
		}
		
	}
	
	/**
	 * 营销案详细信息缓存
	* @date: 2016-10-8 
	* @author: sunliang 
	* @title: MarketCaseDetailCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class MarketCaseDetailCache extends IMarketCaseDetailCache implements Serializable{
		
		/**
		 * 添加
		* @date: 2017-1-16 
		* @author: sunliang 
		* @title: add 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void add(Map<String,Object> tempInParam) {
			cache.add((String)tempInParam.get(Const.CACHE_KEY),
					(IMarketCaseCachePojo)tempInParam.get(Const.CACHE_VALUE));
		}

		/**
		 * 查询
		* @date: 2016-10-8 
		* @author: sunliang 
		* @title: get 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		MarketCaseCachePojo get(Map<String,Object> tempInParam) {
			return (MarketCaseCachePojo)cache.get((String)tempInParam.get(Const.CACHE_KEY));
		}
		
	}
	
	/**
	 * 营销案和问卷调查关系缓存
	* @date: 2016-12-22 
	* @author: yuanliang
	* @title: MarketCaseQuestionCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class MarketCaseQuestionCache extends IMarketCaseQuestionCache implements Serializable{

		/**
		 * 增加
		* @date: 2016-12-22 
		* @author: yuanliang
		* @title: add 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void add(Map<String, Object> tempInParam) {
			cache.add((String)tempInParam.get(Const.CACHE_KEY), tempInParam.get(Const.CACHE_VALUE));
		}
		
		/**
		 * 查询
		* @date: 2017-1-16 
		* @author: sunliang 
		* @title: get 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> get(Map<String, Object> tempInParam) {
			return (Map<String, Object>)cache.get((String)tempInParam.get(Const.CACHE_KEY));
		}
		
	}
	
	/**
	 * 营销案推荐关闭缓存
	* @date: 2017-1-10 
	* @author: sunliang 
	* @title: MarketCaseRecommonedCloseCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class MarketCaseRecommonedCloseCache extends IMarketCaseRecommonedCloseCache implements Serializable{

		/** 推荐关闭缓存
		* @date: 2016-11-30 
		* @author: wangpei
		* @title: add 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void add(Map<String, Object> tempInParam) {
			cache.add((String)tempInParam.get(Const.CACHE_KEY),
					(List<String>)tempInParam.get(Const.CACHE_VALUE),
					Const.CACHE_RESTORE_TYPE_LIST,
					(String)tempInParam.get(Const.CACHE_DIRECTION));
		}

		/** 按照direction取值并删除
		* @date: 2016-11-30 
		* @author: wangpei
		* @title: getAndRemove 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		String getAndRemove(Map<String, Object> tempInParam) {
			return (String)cache.remove(
					(String)tempInParam.get(Const.CACHE_KEY),
					Const.CACHE_RESTORE_TYPE_LIST,
					(String)tempInParam.get(Const.CACHE_DIRECTION));
		}
		
	}
	
	/**
	 * 营销案推荐状态缓存
	* @date: 2016-11-14 
	* @author: yangwl
	* @title: MarketCaseRecommendStatusCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class MarketCaseRecommendStatusCache extends IMarketCaseRecommendStatusCache implements Serializable{
		
		/**
		 * 增加
		* @date: 2017-2-7 
		* @author: sunliang 
		* @title: add 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void add(Map<String,Object> tempInParam){
			cache.add((String)tempInParam.get(Const.CACHE_KEY), (String)tempInParam.get(Const.CACHE_VALUE));
		}
		
		/**
		 * 删除
		* @date: 2017-2-7 
		* @author: sunliang 
		* @title: remove 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void remove(Map<String,Object> tempInParam){
			cache.remove((String)tempInParam.get(Const.CACHE_KEY));
		}
		
		/**
		 * 查询
		* @date: 2016-11-14 
		* @author: yangwl
		* @title: get 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		String get(Map<String,Object> tempInParam) {
			String str = (String)cache.get((String)tempInParam.get(Const.CACHE_KEY));
			return str;
		}
		
	}
	
	/**
	 * 产品与事件关系缓存
	* @date: 2017-1-10 
	* @author: sunliang 
	* @title: ProductAndEventRelCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ProductAndEventRelCache extends IProductAndEventRelCache implements Serializable{

		/** 
		 * 加载
		* @date: 2016-11-23 
		* @author: songxj
		* @title: add 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void putAll(Map<String, Object> tempInParam) {
			cache.putAll((String)tempInParam.get(Const.CACHE_KEY),
					(List<Map<Object, Object>>) tempInParam.get(Const.CACHE_VALUE));
		}

		/** 
		 * 查询
		* @date: 2016-11-23 
		* @author: songxj
		* @title: get 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		List<String> get(Map<String, Object> tempInParam) {
			return cache.getAll((String) tempInParam.get(Const.CACHE_KEY), 
					Long.parseLong((String)tempInParam.get(Const.CACHE_START)), 
					Long.parseLong((String)tempInParam.get(Const.CACHE_END)),
					Const.CACHE_RESTORE_TYPE_ZSET);
		}
		
	}
	
	/**
	 * 查询结果列表
	* @date: 2016-10-1 
	* @author: yangwl
	* @title: ResultListCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ResultListCache extends IResultListCache implements Serializable{
		
		/**
		 * 增加
		* @date: 2016-10-1 
		* @author: yangwl
		* @title: add 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void add(Map<String, Object> tempInParam){
			cache.putAll((String)tempInParam.get(Const.CACHE_KEY),
					(List<ResultItemPojo>)tempInParam.get(Const.CACHE_VALUE),
					(String)tempInParam.get(Const.CACHE_DIRECTION));
		}	
		
        /**
         * 查询
        * @date: 2016-10-1 
        * @author: yangwl
        * @title: get 
        * @param tempInParam
        * @return 
        * @exception: 
        * @version: 1.0 
        * @description: 
        * update_version: update_date: update_author: update_note:
         */
		@Override
		List<ResultItemPojo> get(Map<String, Object> tempInParam){
			 
			return (List<ResultItemPojo>) cache.getAll(
					(String)tempInParam.get(Const.CACHE_KEY),
					Long.parseLong(tempInParam.get(Const.CACHE_START).toString()),
					Long.parseLong(tempInParam.get(Const.CACHE_END).toString()),
					Const.CACHE_RESTORE_TYPE_LIST);
		}
	}
	
	/**服务监控缓存
	* Create on 2017-3-7
	* @author: wangpei
	* @Title:ServiceMonitoringCache
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public class ServiceMonitoringCache extends IServiceMonitoringCache implements Serializable{

		/** 增加
		* @date: 2017-3-7 
		* @author: wangpei
		* @title: add 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void add(Map<String, Object> tempInParam) {
			cache.add((String)tempInParam.get(Const.CACHE_KEY),
					tempInParam.get(Const.CACHE_VALUE),
					Const.CACHE_RESTORE_TYPE_LIST,
					(String)tempInParam.get(Const.CACHE_DIRECTION));
		}

		/** 获取和删除
		* @date: 2017-3-7 
		* @author: wangpei
		* @title: getAndRemove 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		Map<String, Object> getAndRemove(Map<String, Object> tempInParam) {
			return (Map<String, Object>)cache.remove(
					(String)tempInParam.get(Const.CACHE_KEY),
					Const.CACHE_RESTORE_TYPE_LIST,
					(String)tempInParam.get(Const.CACHE_DIRECTION));
		}
		
	}
	/**
	 * 数据统计缓存
	* @date: 2016-12-20 
	* @author: sunliang 
	* @title: StatisticCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class StatisticCache extends IStatisticCache implements Serializable{

		/**
		 * 增加
		* @date: 2016-12-20 
		* @author: sunliang 
		* @title: add 
		* @param key 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void add(String key) {
			cache.increase(key);
		}

		/**
		 * 查询
		* @date: 2016-12-20 
		* @author: sunliang 
		* @title: get 
		* @param key
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		String get(String key) {
			return (String)cache.getIncrease(key);
		}
		
	}
	
	/**
	 * 待生成批量push营销案缓存
	* @date: 2017-1-10 
	* @author: sunliang 
	* @title: WaitCreateBatchPushMarketCaseCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class WaitCreateBatchPushMarketCaseCache extends IWaitCreateBatchPushMarketCaseCache implements Serializable{
		
		/**
		 * 批量增加
		* @date: 2016-10-1 
		* @author: yangwl
		* @title: putAll 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void putAll(Map<String, Object> tempInParam){
			cache.putAll((String)tempInParam.get(Const.CACHE_KEY),
					(List)tempInParam.get(Const.CACHE_VALUE),
					(String)tempInParam.get(Const.CACHE_DIRECTION));
		}
		
		/**
		 * 按照direction取值并删除
		* @date: 2016-10-1 
		* @author: yangwl
		* @title: getAndRemove 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Map<String,String>> getAndRemove(Map<String, Object> tempInParam){
			return (Map<String, Map<String, String>>) cache.remove(
					(String)tempInParam.get(Const.CACHE_KEY),
					Const.CACHE_RESTORE_TYPE_LIST,
					(String)tempInParam.get(Const.CACHE_DIRECTION));
		}
		/**
		 * 队列安全的取数据
		* @date: 2017-5-3 
		* @author: chenhao
		* @title: getByRpoplpush 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String,Map<String,String>> getByRpoplpush(Map<String, Object> tempInParam){
			return (Map<String,Map<String,String>>)cache.rPopLPush((String)tempInParam.get(Const.CACHE_KEY),
					(String)tempInParam.get("tmpKey"));
		}
		
		/**
		 * 移除
		* @date: 2016-10-1 
		* @author: yangwl
		* @title: remove 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void remove(Map<String, Object> tempInParam){
			cache.remove((String)tempInParam.get(Const.CACHE_KEY));
		}
		
		/**
		 * 通过value值删除list中的数据
		* @date: 2017-5-3 
		* @author: chenhao
		* @title: removeByLrem 
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Map<String, String>> removeByLrem(Map<String, Object> tempInParam,Map<String, Map<String,String>> rmMap) {
			Map<String,Map<String,String>> outMap = new HashMap<String,Map<String,String>>();
			for(String key:rmMap.keySet()){
				Map<String,String> inMap = new HashMap<String,String>();
				inMap.putAll(rmMap.get(key));
				outMap.put(key, inMap);
			}
			cache.lRem((String)tempInParam.get(Const.CACHE_KEY), 0, outMap);
			return outMap;
		}

		/**
		 * 取得待生成push营销案缓存list
		* @date: 2017-5-4 
		* @author: chenhao
		* @title: getAll 
		* @param tempParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> getAll(Map<String, Object> tempParam) {
			return (List<Map<String, Object>>)cache.getAll(
					(String)tempParam.get(Const.CACHE_KEY),0,-1,
					Const.CACHE_RESTORE_TYPE_LIST);
		}
	}
	
	/**
	 * 待生成外呼任务营销案缓存
	* @date: 2016-10-11 
	* @author: yangwl
	* @title: IMarketCaseCustGroupTypeAndFormulaCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class WaitCreateCallTaskMarketCaseCache extends IWaitCreateCallTaskMarketCaseCache implements Serializable{
		
		/**
		 * 增加
		* @date: 2017-3-17 
		* @author: yuanchun
		* @title: add 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void add(Map<String, Object> tempInParam){
			cache.add((String)tempInParam.get(Const.CACHE_KEY),
					(List<Map<String, Object>>) tempInParam.get(Const.CACHE_VALUE),
					Const.CACHE_RESTORE_TYPE_LIST,
					(String)tempInParam.get(Const.CACHE_DIRECTION));
		}
		
		/**
		 * 取值并删除
		* @date: 2017-3-16 
		* @author: sunliang 
		* @title: getAndRemove 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Map<String,String>> getAndRemove(Map<String, Object> tempInParam){
			return (Map<String, Map<String, String>>) cache.remove(
					(String)tempInParam.get(Const.CACHE_KEY),
					Const.CACHE_RESTORE_TYPE_LIST,
					(String)tempInParam.get(Const.CACHE_DIRECTION));
		}
		
	}
	
	/**
	 * 待生成渠道任务营销案缓存
	* @date: 2016-10-11 
	* @author: yangwl
	* @title: IMarketCaseCustGroupTypeAndFormulaCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class WaitCreateChannelTaskMarketCaseCache extends IWaitCreateChannelTaskMarketCaseCache implements Serializable{
		
		/**
		 * 增加
		* @date: 2016-10-11 
		* @author: yangwl
		* @title: add 
		* @param custGroupLabel 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void add(Map<String, Object> tempInParam){
			cache.add((String)tempInParam.get(Const.CACHE_KEY),
					(List<Map<String, Object>>) tempInParam.get(Const.CACHE_VALUE),
					Const.CACHE_RESTORE_TYPE_LIST,
					(String)tempInParam.get(Const.CACHE_DIRECTION));
		}
		
		/**
		 * 按照direction取值并删除
		* @date: 2016-10-14 
		* @author: yangwl
		* @title: getAndRemove 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Map<String,String>> getAndRemove(Map<String, Object> tempInParam){
			return (Map<String, Map<String, String>>) cache.remove(
					(String)tempInParam.get(Const.CACHE_KEY),
					Const.CACHE_RESTORE_TYPE_LIST,
					(String)tempInParam.get(Const.CACHE_DIRECTION));
		}
		
		/**
		 * 查询
		* @date: 2016-10-11 
		* @author: yangwl
		* @title: get 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> get(Map<String, Object> tempInParam){
			return cache.getAll((String)tempInParam.get(Const.CACHE_KEY),
					Long.parseLong((String)tempInParam.get(Const.CACHE_START)),
					Long.parseLong((String)tempInParam.get(Const.CACHE_END)),
					Const.CACHE_RESTORE_TYPE_LIST);
		}
	}
	
	/**
	 * 待发送批量push营销案缓存
	* @date: 2016-12-24 
	* @author: sunliang 
	* @title: WaitSendBatchPushMarketCaseCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class WaitSendBatchPushMarketCaseCache extends IWaitSendBatchPushMarketCaseCache implements Serializable{
		
		/**
		 * 增加
		* @date: 2017-1-16 
		* @author: sunliang 
		* @title: add 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void add(Map<String,List<Map<Object, Object>>> tempInParam) {
			for(String key:tempInParam.keySet()){
				cache.putAll(key, (List<Map<Object, Object>>)tempInParam.get(key));
			}
		}

/*		*//**
		 * 增加
		* @date: 2016-10-1 
		* @author: yangwl
		* @title: add 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 *//*
		@Override
		void add(Map<String, Object> marketCasePriorityTmp){
			for(String key:marketCasePriorityTmp.keySet()){
				cache.putAll(key, (List<Map<Object, Object>>)marketCasePriorityTmp.get(key));
			}
		}*/
		
		/**
		 * 查询
		* @date: 2016-10-1 
		* @author: yangwl
		* @title: get 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<String> get(Map<String, Object> tempInParam){
			
			return cache.getAll((String) tempInParam.get(Const.CACHE_KEY),
					Long.parseLong((String) tempInParam.get(Const.CACHE_START)),
					Long.parseLong((String) tempInParam.get(Const.CACHE_END)),
					Const.CACHE_RESTORE_TYPE_ZSET);
			
		}

		/** 
		 * 删除
		* @date: 2016-11-7 
		* @author: songxj
		* @title: remove 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void remove(Map<String, Object> tempInParam) {
			cache.remove((String)tempInParam.get(Const.CACHE_KEY),
					(String)tempInParam.get(Const.CACHE_MEMBER));
		}
	}
	
	/**
	 * 待同步渠道任务缓存
	* @date: 2017-1-10 
	* @author: sunliang 
	* @title: WaitSynChannelTaskCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class WaitSynChannelTaskCache extends IWaitSynChannelTaskCache implements Serializable{

		/** 增加 
		* @date: 2016-12-16 
		* @author: wangpei
		* @title: add 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void add(Map<String, Object> tempInParam) {
			cache.add((String)tempInParam.get(Const.CACHE_KEY),
					(List<String>)tempInParam.get(Const.CACHE_VALUE),
					Const.CACHE_RESTORE_TYPE_LIST,
					(String)tempInParam.get(Const.CACHE_DIRECTION));
		}

		/** 按照direction取值并删除
		* @date: 2016-12-16 
		* @author: wangpei
		* @title: getAndRemove 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		String getAndRemove(Map<String, Object> tempInParam) {
			return (String)cache.remove((String)tempInParam.get(Const.CACHE_KEY),
					Const.CACHE_RESTORE_TYPE_LIST,
					(String)tempInParam.get(Const.CACHE_DIRECTION));
		}
	}
	
}