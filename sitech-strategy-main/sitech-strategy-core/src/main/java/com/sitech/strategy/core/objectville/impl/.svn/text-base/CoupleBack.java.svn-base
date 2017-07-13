package com.sitech.strategy.core.objectville.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sitech.jcfx.dt.MBean;
import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.impl.hbase.HbaseRowKey;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.ICoupleBack;
import com.sitech.strategy.core.objectville.inter.ICustGroup;
import com.sitech.strategy.core.objectville.inter.IEvaluate;
import com.sitech.strategy.core.objectville.inter.ITask;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;

/**
 * 反馈对象
* @date: 2016-9-26 
* @author: wangth
* @Title: Feedback 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public class CoupleBack extends BaseClass implements ICoupleBack,Serializable {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -946440518309122091L;
	
	/**
	 * 目标客户群对象
	 */
	protected ICustGroup custGroup;
	/**
	 * 反馈插入对象
	 */
	protected IDataInsertor.ICoupleBackInsertor coupleBackInsertor;
	/**
	 * 反馈查询对象
	 */
	protected IDataSelector.ICoupleBackSelector coupleBackSelector;
	/**
	 * 评估对象
	 */
	protected IEvaluate evaluate;
	/**
	 * 营销案查询
	 */
	protected IDataSelector.IMarketCaseSelector marketCaseSelector;
	/**
	 * 用户查询对象
	 */
	protected IDataSelector.IUserSelector userSelector;
	
	/**
	 * 任务对象
	 */
	protected ITask task;
	
	/**
	 * 数据统计接口对象
	 */
	protected IDataInsertor.IStatisticInsertor statisticInsertor;
	
	/**
	 * 
	* @date: 2017-4-7 
	* @author: zhangyw_crmpd
	* @title: setStatisticInsertor 
	* @param statisticInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setStatisticInsertor(
			IDataInsertor.IStatisticInsertor statisticInsertor) {
		this.statisticInsertor = statisticInsertor;
	}

	/**
	 * 
	* @date: 2017-3-2 
	* @author: tangaq
	* @title: setCustGroup 
	* @param custGroup 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroup(ICustGroup custGroup) {
		this.custGroup = custGroup;
	}

	/**
	 * 
	* @date: 2016-9-29 
	* @author: wangth
	* @Title: setCoupleBackInsertor 
	* @param coupleBackInsertor 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCoupleBackInsertor(
			IDataInsertor.ICoupleBackInsertor coupleBackInsertor) {
		this.coupleBackInsertor = coupleBackInsertor;
	}

	/** 
	 * @date: 2016-11-30 
	 * @author: wangpei
	 * @title: setMarketCaseSelector 
	 * @param marketCaseSelector the marketCaseSelector to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setMarketCaseSelector(
			IDataSelector.IMarketCaseSelector marketCaseSelector) {
		this.marketCaseSelector = marketCaseSelector;
	}
	
	/**
	 * 
	* @date: 2017-2-16 
	* @author: tangaq
	* @title: setCoupleBackSelector 
	* @param coupleBackSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCoupleBackSelector(
			IDataSelector.ICoupleBackSelector coupleBackSelector) {
		this.coupleBackSelector = coupleBackSelector;
	}
	
	/**
	 * 
	* @date: 2017-2-16 
	* @author: tangaq
	* @title: setEvaluate 
	* @param evaluate 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEvaluate(IEvaluate evaluate) {
		this.evaluate = evaluate;
	}

	/** 
	 * @date: 2016-11-30 
	 * @author: wangpei
	 * @title: setUserSelector 
	 * @param userSelector the userSelector to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setUserSelector(IDataSelector.IUserSelector userSelector) {
		this.userSelector = userSelector;
	}
	
	/**
	 * 
	* @date: 2017-3-2 
	* @author: tangaq
	* @title: setTask 
	* @param task 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTask(ITask task) {
		this.task = task;
	}

	/**
	    * 保存受理记录
	   * @date: 2017-2-14 
	   * @author: yexr
	   * @title: saveAcceptRecordInfo 
	   * @param inParam
	   * @throws StrategyError 
	   * @exception: 
	   * @version: 1.0 
	   * @description: 
	   * update_version: update_date: update_author: update_note:
	    */
		public void saveAcceptRecordInfo(Map<String, Object> inParam)throws StrategyError {
			log.info("saveAcceptRecordInfo", inParam);
			Map<String, String> tempInParam = new HashMap<String, String>();
			tempInParam = this.settleAcceptRecordParam(inParam);
			if(!CommonUtils.objectIsNull(tempInParam)){
				inParam.put("ID_NO", tempInParam.get("ID_NO"));
				inParam.put("SEQ_ID", tempInParam.get("SEQ_ID"));
				log.info("show saveAcceptRecordInfo", inParam);
				coupleBackInsertor.insertAcceptRecordInfo(inParam, tempInParam );
			}
			if(!CommonUtils.objectIsNull(inParam.get("seqId"))){
				Map<String,Object> acceptMap =  this.getRecommendRecordInfo(inParam);
				evaluate.addAcceptStatisticRecord(acceptMap);
			}
			
			}

	/**
	 * 保存渠道外呼接触信息
	* @date: 2016-10-10 
	* @author: zhaoyue
	* @title: saveChannelCallContactInfo 
	* @param inParam
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void saveChannelCallContactInfo(Map<String, Object> inParam,Map<String, Object> tempInParam) throws StrategyError {
		String systemId = "";
		if (!CommonUtils.objectIsNull(inParam)) {
			systemId = (String) CommonUtils.replaceNull(inParam.get("systemId"));
		}
		String seqId =  (String) CommonUtils.replaceNull(inParam.get("seqId"));
		String regionCode =  (String) CommonUtils.replaceNull(inParam.get("regionCode"));
		String channelId =  (String) CommonUtils.replaceNull(inParam.get("channelId"));
		String operNo =  (String) CommonUtils.replaceNull(inParam.get("operNo"));
		String operName =  (String) CommonUtils.replaceNull(inParam.get("operName"));
		String callNo =  (String) CommonUtils.replaceNull(inParam.get("callNo"));
		String calledNo =  (String) CommonUtils.replaceNull(inParam.get("calledNo"));
		String callTime =  (String) CommonUtils.replaceNull(inParam.get("callTime"));
		String titleType = (String )CommonUtils.replaceNull(inParam.get("titleType"));
		List<Map<String,Object>> positioList = inParam.get("positionList") == null ? new ArrayList<Map<String,Object>>() : (List<Map<String,Object>>)inParam.get("positionList");
		for (Map<String, Object> map : positioList) {
			Map<String, Object> tempParam = new HashMap<String, Object>();
			tempParam.put("TYTLE_TYPE", titleType);
			tempParam.put("SYSTEM_ID", systemId);
			tempParam.put("CHANNEL_ID", channelId);
			tempParam.put("OPER_NO", operNo);
			tempParam.put("OPER_NAME", operName);
			tempParam.put("SEQ_ID", seqId);
			tempParam.put("REGION_CODE", regionCode);
			tempParam.put("CALL_NO", callNo);
			tempParam.put("CALLED_NO", calledNo);
			tempParam.put("CALL_TIME", callTime);
			tempParam.put("SERVICE_NO",CommonUtils.replaceNull(map.get("serviceNbr")));
			tempParam.put("POSITION_ID",CommonUtils.replaceNull(map.get("positionId")));
			tempParam.put("ID_NO",CommonUtils.replaceNull(map.get("idNo")));
			tempParam.put("INSERT_TIME",DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1));
            
			coupleBackInsertor.insertChannelCallContactInfo(tempParam);
		}
	}

	/**
	 * 保存渠道短信接触信息
	* @date: 2016-10-10 
	* @author: zhaoyue
	* @title: saveChannelSMSContactInfo 
	* @param inParam
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void saveChannelSMSContactInfo(Map<String, Object> inParam) throws StrategyError{
		String systemId = "";
		if (!CommonUtils.objectIsNull(inParam)) {
			systemId = (String) CommonUtils.replaceNull(inParam.get("systemId"));
		}
		String seqId =  (String) CommonUtils.replaceNull(inParam.get("seqId"));
		String regionCode =  (String) CommonUtils.replaceNull(inParam.get("regionCode"));
		String channelId =  (String) CommonUtils.replaceNull(inParam.get("channelId"));
		String operNo =  (String) CommonUtils.replaceNull(inParam.get("operNo"));
		String operName =  (String) CommonUtils.replaceNull(inParam.get("operName"));
		
		String phoneNo =  (String) CommonUtils.replaceNull(inParam.get("phoneNo"));
		String sendTime =  (String) CommonUtils.replaceNull(inParam.get("sendTime"));
		String sendContent =  (String) CommonUtils.replaceNull(inParam.get("sendContent"));
		String fromTel =  (String) CommonUtils.replaceNull(inParam.get("fromTel"));
		String titleType = (String )CommonUtils.replaceNull(inParam.get("titleType"));
		List<Map<String,Object>> positioList = inParam.get("positionList") == null ? new ArrayList<Map<String,Object>>() : (List<Map<String,Object>>)inParam.get("positionList");
		for (Map<String, Object> map : positioList) {
			Map<String, Object> tempParam = new HashMap<String, Object>();
			tempParam.put("TYTLE_TYPE", titleType);
			tempParam.put("PHONE_NO", phoneNo);
			tempParam.put("SEND_TIME", sendTime);
			tempParam.put("SEND_CONTENT", sendContent);
			tempParam.put("FROM_TEL", fromTel);
			
			tempParam.put("SYSTEM_ID", systemId);
			tempParam.put("CHANNEL_ID", channelId);
			tempParam.put("OPER_NO", operNo);
			tempParam.put("OPER_NAME", operName);
			tempParam.put("SEQ_ID", seqId);
			tempParam.put("REGION_CODE", regionCode);
			tempParam.put("SERVICE_NO",CommonUtils.replaceNull(map.get("serviceNbr")));
			tempParam.put("POSITION_ID",CommonUtils.replaceNull(map.get("positionId")));
			tempParam.put("CLICK_TIME",DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1));
	        String idNo = (String)map.get("idNo");
			
			if (!CommonUtils.objectIsNull(idNo)) {
				tempParam.put("ID_NO", idNo);
				coupleBackInsertor.insertChannelSMSContactInfo(tempParam);
			}
		}
	}

	/**
	 * 保存点击记录
	* @date: 2016-10-10 
	* @author: zhaoyue
	* @title: saveClickRecordInfo 
	* @param inParam
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void saveClickRecordInfo(Map<String, Object> inParam) throws StrategyError {
		    log.info("saveClickRecordInfo:", inParam);
			String systemId = "";
			if (!CommonUtils.objectIsNull(inParam)) {
				systemId = (String) CommonUtils.replaceNull(inParam.get("systemId"));
			}
			String busiAppId = (String) CommonUtils.replaceNull(inParam.get("busiAppId"));
			String seqId =  (String) CommonUtils.replaceNull(inParam.get("seqId"));
			String idNos = (String) CommonUtils.replaceNull(inParam.get("idNos"));
			String regionCode =  (String) CommonUtils.replaceNull(inParam.get("regionCode"));
			String channelId =  (String) CommonUtils.replaceNull(inParam.get("channelId"));
			String operNo =  (String) CommonUtils.replaceNull(inParam.get("operNo"));
			String operName =  (String) CommonUtils.replaceNull(inParam.get("operName"));
			String numType =  (String) CommonUtils.replaceNull(inParam.get("numType"));
			String numValue =  (String) CommonUtils.replaceNull(inParam.get("numValue"));
			List<Map<String,Object>> positioList = inParam.get("positionList") == null ? new ArrayList<Map<String,Object>>() : (List<Map<String,Object>>)inParam.get("positionList");
			for (Map<String, Object> map : positioList) {
				Map<String, Object> tempParam = new HashMap<String, Object>();
				tempParam.put("SYSTEM_ID", systemId);
				tempParam.put("BUSI_APP_ID", busiAppId);
				tempParam.put("CHANNEL_ID", channelId);
				tempParam.put("OPER_NO", operNo);
				tempParam.put("OPER_NAME", operName);
				tempParam.put("SEQ_ID", seqId);
				tempParam.put("REGION_CODE", regionCode);
				tempParam.put("NUM_TYPE", numType);
				tempParam.put("NUM_VALUE", numValue);
				tempParam.put("ACT_ID",CommonUtils.replaceNull(map.get("actId")));
				tempParam.put("SERVICE_NO",CommonUtils.replaceNull(map.get("serviceNbr")));
				tempParam.put("POSITION_ID",CommonUtils.replaceNull(map.get("positionId")));
				tempParam.put("CLICK_TIME",DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1));

				if (!CommonUtils.objectIsNull(idNos)) {
					String idNoArr[] = idNos.split(Const.SEPARATOR_COMMA);
					for (String idNo : idNoArr) {
						tempParam.put("ID_NO", idNo);
						coupleBackInsertor.insertClickRecordInfo(tempParam);
					}
				}else{
					coupleBackInsertor.insertClickRecordInfo(tempParam);
				}
			}
		
	}
	
	/**
	 * 保存资费订购信息
	* @date: 2017-4-6 
	* @author: zhangyw_crmpd
	* @title: savePostageRecordInfo 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void savePostageRecordInfo(Map<String, Object> inParam)
			throws StrategyError {
		Map<String, String> tempInParam = new HashMap<String,String>();
		Map<String, Object> InParamForfor = new HashMap<String,Object>();
		String prodPrcid = (String)inParam.get("prodPrcid");
		String idNo = (String)inParam.get("idNo");
		String seqId = (String)inParam.get("seqId");
		String orderDate = (String)inParam.get("orderDate");
		//根据资费在  查询评估规则缓存    查询营销案ID
		List<String> marketCaseEvaluateCacheIdList = marketCaseSelector.getMarketCaseIdByPostageIdFromEvaluateCache(inParam);
		System.out.println("*********marketCaseEvaluateCacheIdList.toString**********"+marketCaseEvaluateCacheIdList.toString());
		String marketCaseId = "";
		for(int i=0;i<marketCaseEvaluateCacheIdList.size();i++){
			marketCaseId = marketCaseEvaluateCacheIdList.get(i);
			tempInParam.clear();
			InParamForfor.clear();
			InParamForfor.put("ID_NO", idNo);
			InParamForfor.put("SEQ_ID", seqId);
			InParamForfor.put("MARKETCASE_ID", marketCaseId);
			tempInParam.put("ID_NO", idNo);
			tempInParam.put("PROD_PRCID", prodPrcid);
			tempInParam.put("MARKETCASE_ID", marketCaseId);
			tempInParam.put("SEQ_ID", seqId);
			tempInParam.put("ORDER_DATE", orderDate);
			//查询用户推荐营销案表 
			HbaseRowKey hbase = new HbaseRowKey();
			inParam.put("marketCaseId", marketCaseId);
			String rowKey = hbase.getUserRecommendMarketCaseRowkey(inParam);
			inParam.put("rowKey", rowKey);
			Map<String, String> userMarketCase =  coupleBackSelector.selectUserRecommendMarketCaseInfo(inParam);
			System.out.println("**********userMarketCase***************"+userMarketCase.toString());
			
			
			//只有用户被推荐了该营销案，也办理了该营销案下的资费才会统计明细和订购量
			if (!CommonUtils.objectIsNull(userMarketCase)) {
				//插入订购量明细
				System.out.println("******comein insertAcceptRecordInfo***********");
				coupleBackInsertor.insertAcceptRecordInfo(InParamForfor,tempInParam);
				System.out.println("******back insertAcceptRecordInfo***********");
				//记录订购量缓存
				addmarketCaseOrderCache(marketCaseId);
			}
			
			//互斥规则，插入用户受理营销案表
			//coupleBackInsertor.insertUserAcceptMarketcaseInfo(InParamForfor,tempInParam);
			
			//协同规则   查询营销案详细缓存，获取营销案的协同渠道     备注：五月份添加该规则
			/*Map<String,Object> MarketCaseIdMap = new HashMap<String,Object>();
			MarketCaseIdMap.put("marketCaseId", marketCaseId);
			MarketCaseCachePojo marketCaseCash =  marketCaseSelector.getMarketCaseDetailFromCache(MarketCaseIdMap);
			if(!CommonUtils.objectIsNull(marketCaseCash)){
				Map<String,Object> marketCaseRule = marketCaseCash.getRuleMap();
			}*/
			//查询协同规的协同渠道    插入关闭缓存    插入关闭表    原有的服务  还没有测试过
			//addrecommendClose(tempInParam);
		}
		//根据资费查询关闭规则缓存，获取营销案Id
		List<String> marketCaseCloseCacheIdList = marketCaseSelector.getMarketCaseIdByPostageIdFromCloseCache(inParam);
		System.out.println("*********marketCaseCloseCacheIdList.toString**********"+marketCaseCloseCacheIdList.toString());
		for(int i=0;i<marketCaseCloseCacheIdList.size();i++){
			marketCaseId = marketCaseCloseCacheIdList.get(i);
			Map<String,Object> MarketCaseIdMap = new HashMap<String,Object>();
			MarketCaseIdMap.put("marketCaseId", marketCaseId);
			//查询营销案详情缓存，获取营销案下所配置的渠道
			MarketCaseCachePojo marketCaseCash =  marketCaseSelector.getMarketCaseDetailFromCache(MarketCaseIdMap);
			
			Map<String,Object> marketCaseRel1 = marketCaseCash.getMarketCaseRel();
			System.out.println("*************marketCaseRel1***************"+marketCaseRel1);
			
			if(!CommonUtils.objectIsNull(marketCaseCash)){
				Map<String,Object> marketCaseRel = marketCaseCash.getMarketCaseRel();
				System.out.println("*************marketCaseRel***************"+marketCaseRel);
				List<String> channelIdList =  getChannelIdFromCacheMap(marketCaseRel);
				System.out.println("*********channelIdList***********"+channelIdList.toString());
				String channelId = "";
				for(int a=0;a<channelIdList.size();a++){
					channelId =  channelIdList.get(a);
					Map<String,Object> closeInParam = new HashMap<String,Object>();
					closeInParam.put("idNo", idNo);
					closeInParam.put("marketCaseId", marketCaseId);
					closeInParam.put("channelId", channelId);
					//入推荐关闭表
					addrecommendCloseHbase(closeInParam);
				}
			}
		}
															
		
				
	}
		
	/**
	 * 保存推送到达信息
	* @date: 2016-10-10 
	* @author: zhaoyue
	* @title: savePushArriveInfo 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void savePushArriveInfo(Map<String,Object> inParam) throws StrategyError {
		String systemId = "";
		if (!CommonUtils.objectIsNull(inParam)) {
			systemId = (String) CommonUtils.replaceNull(inParam.get("systemId"));
		}
		String busiAppId = (String) CommonUtils.replaceNull(inParam.get("busiAppId"));
		String seqId =  (String) CommonUtils.replaceNull(inParam.get("seqId"));
		String idNo = (String) CommonUtils.replaceNull(inParam.get("idNos"));
		String regionCode =  (String) CommonUtils.replaceNull(inParam.get("regionCode"));
		String channelId =  (String) CommonUtils.replaceNull(inParam.get("channelId"));
		String titleType = (String )CommonUtils.replaceNull(inParam.get("titleType"));
		
		Map<String, Object> tempParam = new HashMap<String, Object>();
		tempParam.put("TYTLE_TYPE", titleType);
		tempParam.put("BUSI_APP_ID", busiAppId);
		tempParam.put("SYSTEM_ID", systemId);
		tempParam.put("CHANNEL_ID", channelId);
		tempParam.put("SEQ_ID", seqId);
		tempParam.put("REGION_CODE", regionCode);
		tempParam.put("ID_NO", idNo);
		tempParam.put("STATUS_CODE",CommonUtils.replaceNull(inParam.get("statusCode")));
		tempParam.put("RECEIVE_TIME",CommonUtils.replaceNull(inParam.get("receiveTime")));
		
		coupleBackInsertor.insertPushArriveInfo(tempParam);
				
		
		
	}

	/**
	 * 回单记录
	* @date: 2016-10-10 
	* @author: zhaoyue
	* @title: saveReceiptRecordInfo 
	* @param inParam
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void saveReceiptRecordInfo(Map<String, Object> inParam) throws StrategyError {

		List<Map<String,Object>> positioList = (List<Map<String,Object>>)inParam.get("positionList");
		if (!CommonUtils.objectIsNull(positioList)) {
			Map<String, Object> map = positioList.get(0);
			Map<String, Object> tempInParam = new HashMap<String, Object>();
			tempInParam.put("SYSTEM_ID", inParam.get("systemId"));
			tempInParam.put("CHANNEL_ID", inParam.get("channelId"));
			tempInParam.put("OPER_NO", inParam.get("operNo"));
			tempInParam.put("OPER_NAME", inParam.get("operName"));
			tempInParam.put("SEQ_ID", inParam.get("seqId"));
			tempInParam.put("REGION_CODE", inParam.get("regionCode"));
			tempInParam.put("NUM_TYPE", inParam.get("numType"));
			tempInParam.put("NUM_VALUE", inParam.get("numValue"));
			tempInParam.put("ID_NO", inParam.get("idNos"));
			tempInParam.put("METHOD_CODE", inParam.get("methodCode"));
			tempInParam.put("CONTACT_FLAG", inParam.get("contactFlag"));
			tempInParam.put("STATUS_CODE", inParam.get("statusCode"));
			tempInParam.put("RESULTS_CODE", inParam.get("resultsCode"));
			tempInParam.put("ACCEPT_CODE", inParam.get("acceptCode"));
			tempInParam.put("NOTE", inParam.get("note"));
			tempInParam.put("ACT_ID",map.get("actId"));
			tempInParam.put("TASK_ID",map.get("taskId"));
			tempInParam.put("POSITION_ID",map.get("positionId"));
			tempInParam.put("RECEIPT_TIME",DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1));
			String idNos = (String) inParam.get("idNos");
			if (!CommonUtils.objectIsNull(idNos)) {
				String idNoArr[] = idNos.split(Const.SEPARATOR_COMMA);
				for (String idNo : idNoArr) {
					tempInParam.put("ID_NO", idNo);
					coupleBackInsertor.insertReceiptRecordInfo(tempInParam);
				}
			}else{
				coupleBackInsertor.insertReceiptRecordInfo(tempInParam);
			}
			
			//查询协同规则
			if (!CommonUtils.objectIsNull(map.get("actId")) && ("0".equals(inParam.get("contactFlag"))||"1".equals(inParam.get("contactFlag")))) {
				//插入关闭缓存及插入关闭表
				addrecommendClose(tempInParam);
			}
			
		}
		
		
	}

	/**
	 * 保存推荐成功量
	* @date: 2016-10-10 
	* @author: zhaoyue
	* @title: saveRecomAcceptRecordInfo 
	* @param inParam
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void saveRecomAcceptRecordInfo(Map<String, Object> inParam,Map<String, Object> tempInParam) {
		
	}

	/**
	 * 保存短信受理记录
	* @date: 2016-10-10 
	* @author: zhaoyue
	* @title: saveSmsAcceptRecordInfo 
	* @param inParam
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void saveSmsAcceptRecordInfo(Map<String, Object> inParam) throws StrategyError{
		String systemId = "";
		if (!CommonUtils.objectIsNull(inParam)) {
			systemId = (String) CommonUtils.replaceNull(inParam.get("systemId"));
		}
		String seqId =  (String) CommonUtils.replaceNull(inParam.get("seqId"));
		String idNos = (String) CommonUtils.replaceNull(inParam.get("idNos"));
		String regionCode =  (String) CommonUtils.replaceNull(inParam.get("regionCode"));
		String channelId =  (String) CommonUtils.replaceNull(inParam.get("channelId"));
		String content =  (String) CommonUtils.replaceNull(inParam.get("content"));
		String operNo =  (String) CommonUtils.replaceNull(inParam.get("operNo"));
		String operName =  (String) CommonUtils.replaceNull(inParam.get("operName"));
		String numType =  (String) CommonUtils.replaceNull(inParam.get("numType"));
		String numValue =  (String) CommonUtils.replaceNull(inParam.get("numValue"));
		List<Map<String,Object>> positioList = inParam.get("positionList") == null ? new ArrayList<Map<String,Object>>() : (List<Map<String,Object>>)inParam.get("positionList");
		for (Map<String, Object> map : positioList) {
			Map<String, Object> tempParam = new HashMap<String, Object>();
			String titleType = (String )CommonUtils.replaceNull(inParam.get("titleType"));
			tempParam.put("TYTLE_TYPE", titleType);
			tempParam.put("SYSTEM_ID", systemId);
			tempParam.put("CONTENT", content);
			tempParam.put("CHANNEL_ID", channelId);
			tempParam.put("OPER_NO", operNo);
			tempParam.put("OPER_NAME", operName);
			tempParam.put("SEQ_ID", seqId);
			tempParam.put("REGION_CODE", regionCode);
			tempParam.put("NUM_TYPE", numType);
			tempParam.put("NUM_VALUE", numValue);
			tempParam.put("ACT_ID",CommonUtils.replaceNull(map.get("actId")));
			tempParam.put("TASK_ID",CommonUtils.replaceNull(map.get("taskId")));
			tempParam.put("SERVICE_NO",CommonUtils.replaceNull(map.get("serviceNbr")));
			tempParam.put("POSITION_ID",CommonUtils.replaceNull(map.get("positionId")));
			tempParam.put("SEL_IN_ORG_ID",CommonUtils.replaceNull(map.get("selInOrgId")));
			tempParam.put("CLICK_TIME",DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1));

			if (!CommonUtils.objectIsNull(idNos)) {
				String idNoArr[] = idNos.split(Const.SEPARATOR_COMMA);
				for (String idNo : idNoArr) {
					tempParam.put("ID_NO", idNo);
					coupleBackInsertor.insertSMSAcceptRecordInfo(tempParam);
				}
			}else{
				coupleBackInsertor.insertSMSAcceptRecordInfo(tempParam);
			}
		}
	}

	/**
	 * 保存短信上行信息
	* @date: 2016-10-10 
	* @author: zhaoyue
	* @title: saveSMSPullInfo 
	* @param inParam
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void saveSMSPullInfo(Map<String, Object> inParam) throws StrategyError{
		String systemId = "";
		if (!CommonUtils.objectIsNull(inParam)) {
			systemId = (String) CommonUtils.replaceNull(inParam.get("systemId"));
		}
		String seqId =  (String) CommonUtils.replaceNull(inParam.get("seqId"));
		String idNo = (String) CommonUtils.replaceNull(inParam.get("idNo"));
		String channelId =  (String) CommonUtils.replaceNull(inParam.get("channelId"));
		String fromTel =  (String) CommonUtils.replaceNull(inParam.get("fromTel"));
		String replyTime =  (String) CommonUtils.replaceNull(inParam.get("replyTime"));
		String replyContent =  (String) CommonUtils.replaceNull(inParam.get("replyContent"));
		String busiAppId = (String) CommonUtils.replaceNull(inParam.get("busiAppId"));
		
		Map<String, Object> tempParam = new HashMap<String, Object>();
		String titleType = (String )CommonUtils.replaceNull(inParam.get("titleType"));
		tempParam.put("TYTLE_TYPE", titleType);
		tempParam.put("SYSTEM_ID", systemId);
		tempParam.put("FROM_TEL", fromTel);
		tempParam.put("CHANNEL_ID", channelId);
		tempParam.put("REPLY_TIME", replyTime);
		tempParam.put("BUSI_APP_ID", busiAppId);
		tempParam.put("REPLY_CONTENT", replyContent);
		tempParam.put("SEQ_ID", seqId);
		tempParam.put("SERVICE_NO",CommonUtils.replaceNull(inParam.get("serviceNbr")));
		tempParam.put("POSITION_ID",CommonUtils.replaceNull(inParam.get("positionId")));

			if (!CommonUtils.objectIsNull(idNo)) {
				tempParam.put("ID_NO", idNo);
				coupleBackInsertor.insertSMSPullInfo(tempParam);
			}
	}
	
	/** 增加推荐关闭到缓存及hbase
	* @date: 2016-11-30 
	* @author: wangpei
	* @title: addrecommendClose 
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected void addrecommendClose(Map<String, Object> tempInParam) throws StrategyError{
		if (!CommonUtils.objectIsNull(tempInParam.get("ACT_ID"))) {
			String marketCaseId = (String) tempInParam.get("ACT_ID");
			String channelId = (String) tempInParam.get("CHANNEL_ID");
			String idNos = userSelector.selectIdNoByServiceNo((String) tempInParam.get("NUM_VALUE")+(String) tempInParam.get("NUM_TYPE"));
			if (CommonUtils.objectIsNull(idNos)) {
				return;
			}
			//Set<String> recommonedClose = new HashSet<String>();
			String[] idNoArr = idNos.split(Const.SEPARATOR_COMMA);
			//先关闭当前渠道
			for (String idNo : idNoArr) {
				Map<String, Object> inParam  = new HashMap<String, Object>();
				inParam.put("marketCaseId", marketCaseId);
				inParam.put("idNo", idNo);
				inParam.put("channelId", channelId);
				addrecommendCloseHbase(inParam);
				System.out.println("*********come into addrecommendCloseHbase"+inParam.toString());
				//recommonedClose.add(marketCaseId+":"+channelId+":"+idNo);
			}
			//获取当前营销案的协同渠道（吉林暂时没有该协同，后续放开调试）----zhangyw
			/*MarketCaseCachePojo marketCaseCachePojo = getMarketCaseCachePojoById(marketCaseId);
			if (!CommonUtils.objectIsNull(marketCaseCachePojo)){
				List<String> synergyChannelList = getSynergyChannels(marketCaseCachePojo,tempInParam);
				for (String synergyChannelId: synergyChannelList) {
					for (String idNo : idNoArr) {
						Map<String, Object> inParam  = new HashMap<String, Object>();
						inParam.put("marketCaseId", marketCaseId);
						inParam.put("idNo", idNo);
						inParam.put("channelId", synergyChannelId);
						addrecommendCloseHbase(inParam);
						recommonedClose.add(marketCaseId+":"+synergyChannelId+":"+idNo);
					}
				}
			}*/
			//插入关闭缓存--暂时不用，需要放开即可
			//addrecommendCloseCache(recommonedClose);
		}
	}

	/** 插入推荐关闭缓存
	* @date: 2016-11-30 
	* @author: wangpei
	* @title: addrecommendCloseCache 
	* @param closeList
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected void addrecommendCloseCache(Set<String> closeSet) throws StrategyError{
		Map<String,Object> tempParam = new HashMap<String, Object>();
		tempParam.put("closeSet", closeSet);
		coupleBackInsertor.addRecommonedCloseToCache(tempParam);
	}
	/**
	 * 添加营销案订购量缓存
	* @date: 2017-4-7 
	* @author: zhangyw_crmpd
	* @title: addmarketCaseOrderCache 
	* @param marketCaseId
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void addmarketCaseOrderCache(String marketCaseId) throws StrategyError{
		Map<String,Object> tempParam = new HashMap<String, Object>();
		tempParam.put("marketCaseId", marketCaseId);
		tempParam.put("currentDay", DateUtil.getCurrentDay());
		tempParam.put("currentMonth", DateUtil.getCurrentMonth());
		statisticInsertor.insertMarketCaseOrderStatistic(tempParam);
	}
	/** 插入推荐关闭hbase表
	* @date: 2016-11-30 
	* @author: wangpei
	* @title: addrecommendCloseHbase 
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected void addrecommendCloseHbase(Map<String, Object> tempInParam) throws StrategyError{
		
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("MARKET_CASE_ID", tempInParam.get("marketCaseId"));
		param.put("CHANNEL_ID", tempInParam.get("channelId"));
		param.put("ID_NO", tempInParam.get("idNo"));
		coupleBackInsertor.insertRecommendClose(tempInParam, param);
	}
	
	/**
	 * 添加单个号码到客户群
	* @date: 2017-3-2 
	* @author: tangaq
	* @title: addSingleNoToCustGroup 
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void addSingleNoToCustGroup(Map<String, Object> tempInParam) throws StrategyError{
		Map<String,Object> tempParam = new HashMap<String,Object>();
		List<Map<String,Object>> positionList = new ArrayList<Map<String,Object>>();
		tempParam.put("marketCaseId",tempInParam.get("marketCaseId"));
		tempParam.put("custGroupId",tempInParam.get("custGroupId"));
		tempParam.put("positionInfoList",positionList);
		tempParam.put("operName", tempInParam.get(""));
		tempParam.put("operNo", tempInParam.get(""));
		tempParam.put("phoneNo", tempInParam.get("serviceNbr"));
		tempParam.put("regionCode", tempInParam.get("latnId"));
		custGroup.addSingleNoToCustGroup(tempParam);
		
	}
	
	/**
	 * 得到推荐记录信息
	* @date: 2017-2-16 
	* @author: tangaq
	* @title: getRecommendRecordInfo 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getRecommendRecordInfo(Map<String,Object> inParam) throws StrategyError{
		log.info("show getRecommendRecordInfo:",inParam);
		Map<String,Object> recommendMap = new HashMap<String,Object>();
		String latnId = (String)inParam.get("latnId");
		String prodInstId = (String)inParam.get("prodInstId");
		
		if(!"NULL".equals(latnId) || !"NULL".equals(prodInstId)){
			String idNo = latnId+prodInstId;
			inParam.put("idNo", idNo);
		}

		//inParam.put("seqId","20170213103202103331851");
		HbaseRowKey hbase = new HbaseRowKey();
		String rowKey = hbase.getRecommendRecordRowkey(inParam);
		inParam.put("rowKey", rowKey);
		
		Map<String,String> outMap = coupleBackSelector.selectRecommendRecordInfo(inParam);
		recommendMap.put("marketCaseId",outMap.get("marketCaseId"));
		//recommendMap.put("marketCaseId","20170216112729101653166");
		MarketCaseCachePojo marketCaseCash =  marketCaseSelector.getMarketCaseDetailFromCache(recommendMap);
		
		if(!CommonUtils.objectIsNull(marketCaseCash)){
			Map<String,Object> marketCaseBasic = marketCaseCash.getMarketCaseMap();
			recommendMap.put("marketCaseBusiType",marketCaseBasic.get("marketCaseBusiType"));
		}
		
		recommendMap.put("channelId",outMap.get("channelId"));
		recommendMap.put("regionCode", latnId);
		System.out.println("show recommendMap"+recommendMap);
		return recommendMap;
	}

	/** 获取营销案缓存
	* @date: 2016-11-30 
	* @author: wangpei
	* @title: getMarketCaseCachePojoById 
	* @param marketCaseId
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected MarketCaseCachePojo getMarketCaseCachePojoById(String marketCaseId) throws StrategyError {
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		tempInParam.put("marketCaseId", marketCaseId);
		return marketCaseSelector.getMarketCaseDetailFromCache(tempInParam);
	}
	
	/**
	 * 从营销案详情缓存marketCaseRelMap中获取渠道列表
	* @date: 2017-4-11 
	* @author: zhangyw_crmpd
	* @title: getChannelIdFromCacheMap 
	* @param marketCaseRel
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<String> getChannelIdFromCacheMap(Map<String,Object> marketCaseRel){
		List<String> channelIdList = new ArrayList<String>();
		Map<String, Object> map01  =  (Map<String, Object>)marketCaseRel.get("01");
		for (Map.Entry<String, Object> item : map01.entrySet()) {
			String marketCaseIdTemp =  item.getKey();
			System.out.println("********marketCaseIdTemp*****"+marketCaseIdTemp);
			Map<String, Object> mapMarketCase  =  (Map<String, Object>)map01.get(marketCaseIdTemp);
			System.out.println("********mapMarketCase*************"+mapMarketCase);
			for (Map.Entry<String, Object> item1 : mapMarketCase.entrySet()) {
				String custGroupIdDesc =  item1.getKey();
				Map<String, Object> map02  =  (Map<String, Object>)mapMarketCase.get(custGroupIdDesc);
				System.out.println("********map02*************"+map02);
				for (Map.Entry<String, Object> item3 : map02.entrySet()) {
					String custGroupIdTemp =  item3.getKey();
					Map<String, Object> mapCustGroup  =  (Map<String, Object>)map02.get(custGroupIdTemp);
					System.out.println("********mapCustGroup*************"+mapCustGroup);
					for (Map.Entry<String, Object> item4 : mapCustGroup.entrySet()) {
						String channelOrEventDesc =  item4.getKey();
						Map<String, Object> map02Or07  =  (Map<String, Object>)mapCustGroup.get(channelOrEventDesc);
						System.out.println("********map02Or07*************"+map02Or07);
						for (Map.Entry<String, Object> item5 : map02Or07.entrySet()) {
							String channelOrEventTemp =  item5.getKey();
							if(channelOrEventDesc.equals("03")){
								channelIdList.add(channelOrEventTemp);
							}else{
								Map<String, Object> mapEvent  =  (Map<String, Object>)map02Or07.get(channelOrEventTemp);
								System.out.println("********mapEvent*************"+mapEvent);
								for (Map.Entry<String, Object> item6 : mapEvent.entrySet()) {
									String RuleOrPositionDesc =  item6.getKey();
									if(RuleOrPositionDesc.equals("04")){
										Map<String, Object> map04  =  (Map<String, Object>)mapEvent.get(RuleOrPositionDesc);
										System.out.println("********map04*************"+map04);
										for (Map.Entry<String, Object> item7 : map04.entrySet()) {
											String PositionId = item7.getKey();
											channelIdList.add(PositionId);
										}
									}
								}
							}
						}
						System.out.println("***********channelIdList**********"+channelIdList.toString());
					}
				}
			}
			
		}
		return channelIdList;
	}
	/** 获取协同的渠道ID
	* @date: 2016-11-30 
	* @author: wangpei
	* @title: getSynergyChannels 
	* @param marketCaseCachePojo
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected List<String> getSynergyChannels(MarketCaseCachePojo marketCaseCachePojo,Map<String, Object> inParam){
		String channelId = (String) inParam.get("CHANNEL_ID");
		String marketCaseId = (String) inParam.get("ACT_ID");
		List<String> synergyChannels = new ArrayList<String>();
		Map<String, Object> ruleMap = marketCaseCachePojo.getRuleMap();
		Map<String,Object> marketCaseRel = marketCaseCachePojo.getMarketCaseRel();
		
		if (CommonUtils.objectIsNull(marketCaseRel)) {
			return synergyChannels;
		}
		
		Map<String,Object> marketCaseRelMap = (Map<String,Object>)marketCaseRel.get(Const.COMPONENT_TYPE_MARKETCASE);
		if (CommonUtils.objectIsNull(marketCaseRelMap)) {
			return synergyChannels;
		}
		
		Map<String,Object> marketCaseDetailRelMap = (Map<String,Object>)marketCaseRelMap.get(marketCaseId);
		if (CommonUtils.objectIsNull(marketCaseDetailRelMap)) {
			return synergyChannels;
		}
		
		Map<String,Object> custGroupRelMap = (Map<String, Object>) marketCaseDetailRelMap.get(Const.COMPONENT_TYPE_CUSTGROUP);
		if (CommonUtils.objectIsNull(custGroupRelMap)) {
			return synergyChannels;
		}
		
		for (Entry<String, Object> entry : custGroupRelMap.entrySet()) {
			Map<String,Object> custGroupDetailRelMap = (Map<String, Object>) entry.getValue();
			if (CommonUtils.objectIsNull(custGroupDetailRelMap)) {
				continue;
			}
			
			Map<String,Object> channelRelMap = (Map<String, Object>) custGroupDetailRelMap.get(Const.COMPONENT_TYPE_CHANNEL);
			if (CommonUtils.objectIsNull(channelRelMap)) {
				continue;
			}
			
			Map<String,Object> channelDetailRelMap = (Map<String, Object>) channelRelMap.get(channelId);
			if (CommonUtils.objectIsNull(channelDetailRelMap)) {
				continue;
			}
			
			List<String> ruleRelMap = (List<String>) channelDetailRelMap.get(Const.COMPONENT_TYPE_RULE);
			if (CommonUtils.objectIsNull(ruleRelMap)) {
				continue;
			}
			
			for (String ruleId : ruleRelMap) {
				List<Map<String,Object>> ruleList = (List<Map<String, Object>>) ruleMap.get(ruleId);
				if (CommonUtils.objectIsNull(ruleList)) {
					continue;
				}
				
				for (Map<String, Object> ruleDetail : ruleList) {
					if (Const.RULE_TYPE_EVENT_SYNERGY.equals(ruleDetail.get("ruleDetailType"))) {
						List<Map<String, Object>> params = (List<Map<String, Object>>) ruleDetail.get("params");
						if (CommonUtils.objectIsNull(params)) {
							continue;
						}
						for (Map<String, Object> param : params) {
							if (Const.RULE_CODE_SYNERGY_SYNERGYCHANNEL.equals(param.get("ruleParCode")) && !CommonUtils.objectIsNull(param.get("ruleParValue")) && !synergyChannels.contains((String)param.get("ruleParValue"))) {
								synergyChannels.add((String)param.get("ruleParValue"));
							}
						}
					}
				}
			}
		}
		return synergyChannels;
	} 
	
	/**
	 * 处理受理记录参数
	* @date: 2017-2-16 
	* @author: tangaq
	* @title: settleAcceptRecord 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,String> settleAcceptRecordParam(Map<String,Object> inParam) throws StrategyError{
		Map<String,String> paramMap = new HashMap<String,String>();
		Map<String,String> outMap = new HashMap<String,String>();
		paramMap.put("TITLE_TYPE", CommonUtils.toString(inParam.get("titleType")));
		paramMap.put("TIMESTAP", CommonUtils.toString(inParam.get("timestap")));
		paramMap.put("LATN_ID", CommonUtils.toString(inParam.get("latnId")));
		paramMap.put("PROD_INST_ID", CommonUtils.toString(inParam.get("prodInstId")));
		paramMap.put("DEVELOPER_CODE", CommonUtils.toString(inParam.get("developerCode")));
		paramMap.put("STAFF_ID", CommonUtils.toString(inParam.get("staffId")));
		paramMap.put("ID_NO", CommonUtils.toString(inParam.get("idNo")));
		String seqId = "";
		if(CommonUtils.objectIsNull(inParam.get("seqId"))){
			seqId = SequenceUtil.getSequence();
		}else{
			seqId = (String)inParam.get("seqId");
		}
		paramMap.put("SEQ_ID",seqId);
		
		if("PROD_OFFER_INST_NEW".equals(inParam.get("titleType"))){
			paramMap.put("CREATE_DATE", CommonUtils.toString(inParam.get("createDate")));
			paramMap.put("PROD_OFFER_ID", CommonUtils.toString(inParam.get("prodOfferId")));
			paramMap.put("PARTNER_DEVELOPER_CODE", CommonUtils.toString(inParam.get("partnerDeveloperCode")));
			paramMap.put("PROD_OFFER_INST_ID", CommonUtils.toString(inParam.get("prodOfferInstId")));
		}else if("ORDER_ITEM_NEW".equals(inParam.get("titleType"))){
			System.out.println("get inParam"+inParam);
			paramMap.put("SERVICE_NBR", CommonUtils.toString(inParam.get("serviceNbr")));
			paramMap.put("FINISH_TIME", CommonUtils.toString(inParam.get("finishTime")));
			paramMap.put("EXT_SYSTEM", CommonUtils.toString(inParam.get("extSystem")));
			paramMap.put("ORDER_ITEM_ID", CommonUtils.toString(inParam.get("orderItemId")));
			Map<String,Object> resMap = (Map<String,Object>)inParam.get("resMap");
			if(!CommonUtils.objectIsNull(resMap)){
				if(!Const.FLASE_INT.equals(resMap.get("4Guser"))){
					this.addSingleNoToCustGroup(inParam);
					return outMap;
				}
			}
			
		}else if("TB_BIL_PRE_INST_NEW".equals(inParam.get("titleType"))){
			paramMap.put("ACCT_ID", CommonUtils.toString(inParam.get("acctId")));
			paramMap.put("PRE_INST_ID", CommonUtils.toString(inParam.get("preInstId")));
			paramMap.put("OPT_DATE", CommonUtils.toString(inParam.get("optDate")));
			paramMap.put("PRE_RULE_ID", CommonUtils.toString(inParam.get("preRuleId")));
			paramMap.put("BILLING_CYCLE_BEGIN", CommonUtils.toString(inParam.get("billingCycleBegin")));
			paramMap.put("BILLING_CYCLE_END", CommonUtils.toString(inParam.get("billingCycleEnd")));
			paramMap.put("OBJ_TYPE", CommonUtils.toString(inParam.get("objType")));
		}else if("PROD_INST_NEW".equals(inParam.get("titleType"))){
			paramMap.put("OWNER_CUST_ID", CommonUtils.toString(inParam.get("ownerCustId")));
			paramMap.put("ACCT_ID", CommonUtils.toString(inParam.get("acctId")));
			paramMap.put("SERVICE_NBR", CommonUtils.toString(inParam.get("serviceNbr")));
			paramMap.put("PROD_OFFER_INST_ID", CommonUtils.toString(inParam.get("prodOfferInstId")));
			paramMap.put("INSTALL_ADDR", CommonUtils.toString(inParam.get("installAddr")));
			paramMap.put("CERTI_NBR", CommonUtils.toString(inParam.get("certiNbr")));
			paramMap.put("PRODUCT_ID", CommonUtils.toString(inParam.get("productId")));
			paramMap.put("INSTALL_ADDR", CommonUtils.toString(inParam.get("installAddr")));
			paramMap.put("PARTNER_DEVELOPER_CODE", CommonUtils.toString(inParam.get("partnerDeveloperCode")));
			paramMap.put("MAIN_PROD_OFFER_INST_ID", CommonUtils.toString(inParam.get("mainProdOfferInstId")));
		}
		
		return paramMap;
		
	}
	
	
}
