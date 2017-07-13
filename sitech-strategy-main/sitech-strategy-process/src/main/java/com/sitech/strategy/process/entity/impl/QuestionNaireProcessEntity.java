package com.sitech.strategy.process.entity.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;
import com.sitech.strategy.process.base.BaseProcessEntity;
import com.sitech.strategy.process.entity.inter.IQuestionNaireProcessEntity;

public class QuestionNaireProcessEntity extends BaseProcessEntity implements IQuestionNaireProcessEntity {
	/**
	 * 公共数据查询操作接口
	 */
	protected IDataSelector.ICommonSelector commonSelector;	
	/**
	 * 调查问卷插入
	 */
	protected IDataInsertor.IQuestionNaireInsertor questionNaireInsertor;
	/**
	 * 调查问卷更新
	 */
	protected IDataUpdater.IQuestionNaireUpdater questionNaireUpdater;
	/**
	 * 调查问卷查询
	 */
	protected IDataSelector.IQuestionNaireSelector questionNaireSelector;
	
	/**
	 * 
	* @date: 2016-12-21 
	* @author: yuanliang
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
	 * 
	* @date: 2016-12-12 
	* @author: zhangqia 
	* @title: setQuestionNaireInsertor 
	* @param parseEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	
	public void setQuestionNaireInsertor(IDataInsertor.IQuestionNaireInsertor questionNaireInsertor) {
		this.questionNaireInsertor = questionNaireInsertor;
	}
	/**
	 * 
	* @date: 2016-12-12 
	* @author: zhangqia 
	* @title: setQuestionNaireUpdater 
	* @param parseEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setQuestionNaireUpdater(
			IDataUpdater.IQuestionNaireUpdater questionNaireUpdater) {
		this.questionNaireUpdater = questionNaireUpdater;
	}
	/**
	 * 
	* @date: 2016-12-12
	* @author: zhangqia 
	* @title: setQuestionNaireSelector 
	* @param parseEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setQuestionNaireSelector(
			IDataSelector.IQuestionNaireSelector questionNaireSelector) {
		this.questionNaireSelector = questionNaireSelector;
	}
	
	/**
	 * 
	* @date: 2016-12-14
	* @author: zhangqia 
	* @title: insertQuestionNaire 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void insertQuestionNaire(Map<String,Object> inParam)throws StrategyError{
		questionNaireInsertor.insert(inParam);
	}
	/**
	 * 
	* @date: 2016-12-14
	* @author: zhangqia 
	* @title: insertQuestionNaire 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryQuestionNaire(Map<String,Object> inParam,IQueryFilter queryFilter)throws StrategyError{
		return questionNaireSelector.selectQuestionNaireById(inParam, queryFilter);
	}
	/**
	 * 加载营销案和问卷调查ID到缓存
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: loadQuestionMarketCaseToCache 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void loadQuestionMarketCaseToCache() throws StrategyError {
		String dataBaseTime = commonSelector.selectDataBaseSysTime();
		
		IQueryFilter queryFilter= new QueryFilter();		
		//设置查询参数
		Date currDate = DateUtil.StringToDate(dataBaseTime, DateUtil.TIME_FROMAT_SIMPLE3);
		queryFilter.setSysDate(DateUtil.string2Timestamp(DateUtil.DateToString(currDate, DateUtil.TIME_FROMAT_SIMPLE3),DateUtil.TIME_FROMAT_SIMPLE3));
		
		queryFilter.setContentParCode(Const.CONTENT_PARCODE_QUESTIONID);
		
		List<Map<String, Object>> marketCaseList = questionNaireSelector.selectMarketCaseAndContentList( queryFilter);
		//解析数据
		Map<String, Object> questionMarketCaseMap=this.parseQuestionMarketCaselList(marketCaseList);
		//加载缓存
		this.addQuestionMarketCaseToCache(questionMarketCaseMap);
	}
	
	/**
	 * 将List<Map<String,Object>> 转换成  Map<marketCaseId, questionId> 
	 * redis数据结构，其中  key是  固定的字符串 ，value是 Map<marketCaseId, questionId>
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: parseQuestionMarketCaselList 
	* @param marketCaseList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	private Map<String, Object> parseQuestionMarketCaselList(List<Map<String,Object>> marketCaseList){
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		if(!CommonUtils.objectIsNull(marketCaseList)){
			for(Map<String, Object> marketCaseMap : marketCaseList){
				String marketCaseId = (String) marketCaseMap.get("marketCaseId");
				String contentParValue = (String) marketCaseMap.get("contentParValue");
				 			
				outMap.put(marketCaseId, contentParValue);
			}
		}
		
		return outMap;
	}
	
	/**
	 * 加载营销案和调查问卷ID到缓存
	* @date: 2016-12-22 
	* @author: yuanliang
	* @title: addQuestionMarketCaseToCache 
	* @param questionMarketCaseMap
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	private void addQuestionMarketCaseToCache(Map<String, Object> questionMarketCaseMap) throws StrategyError{
		
		System.out.println("QuestionMarketCaseToCache:"+questionMarketCaseMap);
		
		Map<String, Object> cacheMap=new HashMap<String, Object>();
		cacheMap.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_QUESTION);
		cacheMap.put("value", questionMarketCaseMap);
		
		questionNaireInsertor.addQuestionMarketCaseToCache(cacheMap);
		
	}
	/**
	 * 查询营销案和调查问卷ID从缓存
	* @date: 2016-12-22 
	* @author: zhangqia
	* @title: queryQuestionMarketCaseFromCache 
	* @param questionMarketCaseMap
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryQuestionMarketCaseFromCache() throws StrategyError{
		//return questionNaireSelector.selectQuestionNaireFromCache();
		return null;
	}
	/**
	 * 
	* @date: 2016-12-14
	* @author: zhangqia 
	* @title: updateQuestionNaire 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateQuestionNaire(Map<String,Object> inParam)throws StrategyError{
		questionNaireUpdater.update(inParam);
	}
}
