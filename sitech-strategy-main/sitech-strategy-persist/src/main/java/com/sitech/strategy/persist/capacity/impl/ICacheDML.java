package com.sitech.strategy.persist.capacity.impl;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.pojo.impl.ResultItemPojo;
import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.Const;

/**
 * 缓存操控接口
* @date: 2016-9-12 
* @author: zhaoyue
* @title: ICacheDML 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ICacheDML {
	
	/**
	 * 客户群标签表达式缓存
	* @date: 2017-1-10 
	* @author: sunliang 
	* @title: ICustGroupLabelFormulaCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class ICustGroupLabelFormulaCache{
		
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
		abstract void add(Map<String, Object> tempInParam);
		
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
		abstract String get(Map<String, Object> tempInParam);
		
		/**
		 * 加载
		* @date: 2017-3-14 
		* @author: yuanchun
		* @title: addList 
		* @param tempParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void addList(Map<String, Object> tempParam);
	}
	
	/**
	 * 静态标签目标表客户群缓存
	* @date: 2017-3-14 
	* @author: liuqi
	* @title: IStaticLabelCustGroupCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IStaticLabelCustGroupCache{
		
		/**
		 * 获取和删除
		* @date: 2017-3-15 
		* @author:liuqi
		* @title: getAndRemove 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract String getAndRemove(Map<String, Object> tempInParam);
	}
	
	/**
	 * 渠道展示数量缓存
	* @date: 2017-1-10 
	* @author: sunliang 
	* @title: IChannelShowNumCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IChannelShowNumCache{
		
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
		abstract void add(Map<String, Object> tempInParam);
		
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
		abstract List<Map<String, Object>> get(Map<String, Object> tempInParam);
	}
	
	/**
	 * 渠道触发营销案缓存
	* @date: 2017-1-10 
	* @author: sunliang 
	* @title: IChannelTriggerMarketCaseCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IChannelTriggerMarketCaseCache{
		
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
		abstract void add(Map<String, Object> tempInParam);
		
		/**
		 * 查询
		* @date: 2016-10-1 
		* @author: yangwl
		* @title: get 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<String> get(Map<String, Object> tempInParam);
	}
	
	/**
	 * 缴费与事件关系缓存
	* @date: 2017-2-13 
	* @author: sunyuan
	* @title: IFeeAndEventRelCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IFeeAndEventRelCache {
		
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
		abstract void putAll(Map<String, Object> tempInParam);

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
		abstract List<String> get(Map<String, Object> tempInParam);
		
	}
	
	/** 
	 * 事件触发营销案缓存
	* @date: 2016-11-23 
	* @author: songxj
	* @title: IEventTriggerMarketCaseCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note: 
	*/
	public abstract class IEventTriggerMarketCaseCache {
		
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
		abstract void putAll(Map<String, Object> tempInParam);
		
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
		abstract List<String> get(Map<String, Object> tempInParam);
		
	}
	
	/**
	 * 关闭规则缓存
	* @date: 2017-4-6 
	* @author: sunyuan
	* @title: ICloseRuleCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class ICloseRuleCache{
		
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
		abstract void add(Map<String,Object> tempInParam);
		
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
		abstract List<String> get(Map<String,Object> tempInParam);
	}
	
	/**
	 * 评估规则缓存
	* @date: 2017-4-6 
	* @author: sunyuan
	* @title: IEvaluateRuleCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IEvaluateRuleCache{
		
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
		abstract void add(Map<String,Object> tempInParam);
		
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
		abstract List<String> get(Map<String,Object> tempInParam);
	}
	
	/**
	 * 全局规则缓存
	* @date: 2016-11-15 
	* @author: yangwl
	* @title: IGlobalRuleCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IGlobalRuleCache{
		
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
		abstract void add(Map<String, Object> tempInParam);

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
		abstract Map<String, Object> get(Map<String, Object> tempInParam);
	}
	
	/**
	 * 互斥规则缓存
	* @date: 2017-3-30 
	* @author: sunyuan
	* @title: IMutexRuleCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IMutexRuleCache{
		
		/**
		 * 加载
		* @date: 2017-3-30 
		* @author: sunyuan
		* @title: add 
		* @param tempParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void add(Map<String,Object> tempParam);
		
		/**
		 * 查询
		* @date: 2017-3-31 
		* @author: sunyuan
		* @title: get 
		* @param tempParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<String> get(Map<String,Object> tempParam);
		
	}
	/**
	 * 营销案详细信息缓存
	* @date: 2016-10-8 
	* @author: sunliang 
	* @title: IMarketCaseDetailCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IMarketCaseDetailCache{
		
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
		abstract void add(Map<String,Object> tempInParam);
		
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
		abstract MarketCaseCachePojo get(Map<String, Object> tempInParam);
		
	}
	
	/**
	 * 营销案和问卷调查关系缓存
	* @date: 2016-12-22 
	* @author: yuanliang
	* @title: IMarketCaseQuestionCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IMarketCaseQuestionCache{
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
		abstract void add(Map<String, Object> tempInParam);
		
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
		abstract Map<String, Object> get(Map<String, Object> tempInParam);
	}
	
	/**
	 * 营销案推荐关闭缓存
	* @date: 2017-1-10 
	* @author: sunliang 
	* @title: IMarketCaseRecommonedCloseCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IMarketCaseRecommonedCloseCache{
		/** 增加
		* @date: 2016-11-30 
		* @author: wangpei
		* @title: add 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		abstract void add(Map<String, Object> tempInParam);
		
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
		abstract String getAndRemove(Map<String, Object> tempInParam);
		
	}
	
	/**
	 * 营销案推荐状态缓存
	* @date: 2016-11-14 
	* @author: yangwl
	* @title:  IMarketCaseRecommendStatusCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IMarketCaseRecommendStatusCache{
		
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
		abstract void add(Map<String,Object> tempInParam);
		
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
		abstract void remove(Map<String,Object> tempInParam);
		
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
		abstract String get(Map<String,Object> tempInParam);
		
	}
	
	/**
	 * 产品与事件关系缓存
	* @date: 2017-1-10 
	* @author: sunliang 
	* @title: IProductAndEventRelCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IProductAndEventRelCache {
		
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
		abstract void putAll(Map<String, Object> tempInParam);
		
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
		abstract List<String> get(Map<String, Object> tempInParam);
		
	}
	
	/**
	 * 查询结果列表
	* @date: 2016-9-30 
	* @author: yangwl
	* @title: IResultListCache
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IResultListCache{
		
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
		abstract void add(Map<String, Object> tempInParam);
		
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
		abstract List<ResultItemPojo> get(Map<String, Object> tempInParam);
	}
	
	/**服务监控缓存
	* Create on 2017-3-7
	* @author: wangpei
	* @Title:IServiceMonitoringCache
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public abstract class IServiceMonitoringCache{
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
		abstract void add(Map<String, Object> tempInParam);
		/** 获取并删除
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
		abstract Map<String, Object> getAndRemove(Map<String, Object> tempInParam);
	}
	/**
	 * 数据统计缓存
	* @date: 2016-12-20 
	* @author: sunliang 
	* @title: IStatisticCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IStatisticCache {
		
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
		abstract void add(String key);
		
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
		abstract String get(String key);
		
	}

	/**
	 * 待生成批量push营销案缓存
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: IWaitCreateBatchPushMarketCaseCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IWaitCreateBatchPushMarketCaseCache{
		
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
		abstract void putAll(Map<String, Object> tempInParam);
		
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
		abstract Map<String, Map<String,String>> getAndRemove(Map<String, Object> tempInParam);
		
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
		abstract void remove(Map<String, Object> tempInParam);

		/**
		 * 队列安全的取得缓存list值
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
		abstract Map<String, Map<String, String>> getByRpoplpush(Map<String, Object> tempInParam);

		/**
		 * 
		* @date: 2017-5-3 
		* @author: chenhao
		* @title: removeByLrem 
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract Map<String, Map<String, String>> removeByLrem(Map<String, Object> tempInParam,Map<String, Map<String,String>> rmMap);

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
		abstract List<Map<String, Object>> getAll(Map<String, Object> tempParam);
		
	}
	
	/**
	 * 待生成外呼任务营销案缓存
	* @date: 2017-3-16 
	* @author: sunliang 
	* @title: IWaitCreateCallTaskMarketCaseCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IWaitCreateCallTaskMarketCaseCache{
		
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
		abstract void add(Map<String, Object> tempInParam);
		
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
		abstract Map<String, Map<String,String>> getAndRemove(Map<String, Object> tempInParam);
	}
	
	/**
	 * 待生成渠道任务营销案缓存
	* @date: 2017-1-10 
	* @author: sunliang 
	* @title: IWaitCreateChannelTaskMarketCaseCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IWaitCreateChannelTaskMarketCaseCache{
		
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
		abstract void add(Map<String, Object> tempInParam);
		
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
		abstract Map<String, Map<String,String>> getAndRemove(Map<String, Object> tempInParam);
		
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
		abstract List<Map<String, Object>> get(Map<String, Object> tempInParam);
	}
	
	/**
	 * 待发送批量push营销案缓存
	* @date: 2016-9-30 
	* @author: yangwl
	* @title: IWaitSendBatchPushMarketCaseCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IWaitSendBatchPushMarketCaseCache{

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
		abstract void add(Map<String, Object> tempInParam);*/
		
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
		abstract void add(Map<String,List<Map<Object, Object>>> tempInParam);
		
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
		abstract List<String> get(Map<String, Object> tempInParam);
		
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
		abstract void remove(Map<String, Object> tempInParam);
	}
	
	/**
	 * 待同步渠道任务缓存
	* @date: 2017-1-10 
	* @author: sunliang 
	* @title: IWaitSynChannelTaskCache 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IWaitSynChannelTaskCache{
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
		abstract void add(Map<String, Object> tempInParam);
		
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
		abstract String getAndRemove(Map<String, Object> tempInParam);
	}
	
/*	*//**
	 * 批量push业务营销案发送状态（发送暂停、恢复）
	* @date: 2016-9-30 
	* @author: yangwl
	* @title: IBatchPushSendStatus 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 *//*
	public abstract class IBatchPushSendStatus{
		
		*//**
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
		abstract void add(Map<String,Object> tempInParam);
		
		*//**
		 * 查询
		* @date: 2016-10-1 
		* @author: yangwl
		* @title: add 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 *//*
		abstract String get(Map<String,Object> tempInParam);
		
		*//**
		 * 移除
		* @date: 2016-9-30 
		* @author: yangwl
		* @title: remove 
		* @param key 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 *//*
		abstract void remove(Map<String,Object> tempInParam);

	}*/
	
	/**
	 * 批量push任务
	* @date: 2016-10-9 
	* @author: yangwl
	* @title: IBatchPushTask 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 *//*
	public abstract class IBatchPushTask{
		
		*//**
		 * 移除
		* @date: 2016-10-9 
		* @author: yangwl
		* @title: remove 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 *//*
		abstract void remove(Map<String, Object> tempInParam);
		
		*//**
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
		 *//*
		abstract List<String> get(Map<String, Object> tempInParam);
		
		*//**
		 * 查询长度
		* @date: 2016-10-9 
		* @author: yangwl
		* @title: getLen
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 *//*
		abstract long getLen(Map<String, Object> tempInParam);
	}*/
	

	
}
