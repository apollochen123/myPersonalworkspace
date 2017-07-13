package com.sitech.strategy.core.objectville.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IMarketCasePacketPojo;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.pojo.inter.channel.IChannelPojo;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IEvaluate;
import com.sitech.strategy.persist.capacity.impl.IHiveDML;
import com.sitech.strategy.persist.capacity.impl.INosqlDML;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;

/**
 * 评估对象
* @date: 2016-9-5 
* @author: yangwl
* @title: Evaluate 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class Evaluate extends BaseClass implements IEvaluate,Serializable {
	
	/**
	 * 渠道pojo
	 */
	protected IChannelPojo channelPojo;
	/**
	 * hive报表统计对象
	 */
	protected IHiveDML.IRmEvaluateStatisticsInfoHive rmEvaluateStatisticsInfoHive;
	/**
	 * 数据统计插入对象
	 */
	protected IDataInsertor.IStatisticInsertor statisticInsertor;
	/**
	 * statisticSelector对象
	 */
	protected IDataSelector.IStatisticSelector statisticSelector;
	/**
	 * 内部参数处理对象
	 */
	protected AddParamSettle addParamSettle = new AddParamSettle();
	/**
	 * 评估插入对象
	 */
	protected IDataInsertor.IEvaluateInsertor evaluateInsertor;
	/**
	 * 评估对象
	 */
	protected IDataSelector.IEvaluateSelector evaluateSelector;
	
	/**
	 * 
	* @date: 2017-2-16 
	* @author: tangaq
	* @title: setChannelPojo 
	* @param channelPojo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannelPojo(IChannelPojo channelPojo) {
		this.channelPojo = channelPojo;
	}

	/**
	 * 
	* @date: 2017-2-9 
	* @author: sunliang 
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
	* @date: 2017-2-9 
	* @author: sunliang 
	* @title: setStatisticSelector 
	* @param statisticSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setStatisticSelector(
			IDataSelector.IStatisticSelector statisticSelector) {
		this.statisticSelector = statisticSelector;
	}
	/**
	 * 
	* @date: 2016-11-27 
	* @author: mengxi
	* @title: setRmEvaluateStatisticsInfoHive 
	* @param rmEvaluateStatisticsInfoHive 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRmEvaluateStatisticsInfoHive(
			IHiveDML.IRmEvaluateStatisticsInfoHive rmEvaluateStatisticsInfoHive) {
		this.rmEvaluateStatisticsInfoHive = rmEvaluateStatisticsInfoHive;
	}
	/**
	 * 
	* @date: 2016-11-26 
	* @author: mengxi
	* @title: setEvaluateInsertor 
	* @param evaluateInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEvaluateInsertor(IDataInsertor.IEvaluateInsertor evaluateInsertor) {
		this.evaluateInsertor = evaluateInsertor;
	}

	/** 
	 * @date: 2016-11-25 
	 * @author: xiongxq
	 * @Title: setEvaluateSelector 
	 * @param evaluateSelector the evaluateSelector to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setEvaluateSelector(IDataSelector.IEvaluateSelector evaluateSelector) {
		this.evaluateSelector = evaluateSelector;
	}

	/**
	 * 
	* @date: 2016-11-26 
	* @author: mengxi
	* @title: setAddParamSettle 
	* @param addParamSettle 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAddParamSettle(AddParamSettle addParamSettle) {
		this.addParamSettle = addParamSettle;
	}
	
	/**
	 * 增加受理统计记录
	* @date: 2017-2-16 
	* @author: tangaq
	* @title: addAcceptStatisticRecord 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addAcceptStatisticRecord(Map<String, Object> inParam) throws StrategyError {
		Map<String,Object> templateParam = new HashMap<String,Object>();
		templateParam.put("regionCode", inParam.get("regionCode"));
		templateParam.put("currentDay", DateUtil.getCurrentDay());
		templateParam.put("currentMonth", DateUtil.getCurrentMonth());
		templateParam.put("sceneType", channelPojo.getSceneTypeByChannelId((String)inParam.get("channelId")));
		templateParam.put("channelId", inParam.get("channelId"));
		statisticInsertor.insertChannelAcceptStatistic(templateParam);
		templateParam.put("busiType", inParam.get("marketCaseBusiType"));
		statisticInsertor.insertBusiTypeAcceptStatistic(templateParam);
		
	}

	/**
	 * 增加实时统计记录
	* @date: 2017-2-9 
	* @author: sunliang 
	* @title: addRealStatisticRecord 
	* @param inParam
	* @param cacheMarkCaseList 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addRealStatisticRecord(Map<String, Object> inParam,
			List<Map<String, Object>> cacheMarkCaseList) throws StrategyError{
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		tempInParam.put("currentDay", inParam.get("currentDay"));
		tempInParam.put("currentMonth", inParam.get("currentMonth"));
		tempInParam.put("regionCode", inParam.get("regionCode"));
		tempInParam.put("sceneType", inParam.get("sceneType"));
		statisticInsertor.insertRealContactStatistic(tempInParam);
		
		log.debug("===addRealStatisticRecord==inParam===", inParam);
		log.debug("===addRealStatisticRecord==cacheMarkCaseList===", cacheMarkCaseList);
		int marketCaseCount = 0;
		for(Map<String,Object> marketCasePacketPojoMap : cacheMarkCaseList){
			if(!CommonUtils.objectIsNull(marketCasePacketPojoMap.get("positionInfoMap"))){
				Map<String,Object> positionInfoMap = (Map<String,Object>)marketCasePacketPojoMap.get("positionInfoMap");
				for(Map.Entry<String, Object> entry : positionInfoMap.entrySet()){
					List<IMarketCasePacketPojo> marketCasePacketPojoList = (List<IMarketCasePacketPojo>)entry.getValue();
					for(IMarketCasePacketPojo marketCasePacketPojo : marketCasePacketPojoList){
						log.debug("===addRealStatisticRecord==marketCasePacketPojo===", marketCasePacketPojo);
						Map<String,Object> marketCaseBasicMap = (Map<String,Object>)marketCasePacketPojo.getMarketCaseBasic().get("marketCaseBasic");
						String marketCaseId = (String)marketCaseBasicMap.get("marketCaseId");
						String marketCaseBusiType = (String)marketCaseBasicMap.get("marketCaseBusiType");
						tempInParam.put("busiType", marketCaseBusiType);
						tempInParam.put("marketCaseId", marketCaseId);
						log.debug("===addRealStatisticRecord==marketCaseBasicMap===", marketCaseBasicMap);
						statisticInsertor.insertBusiTypeStatistic(tempInParam);
						marketCaseCount++;
					}
				}
			}
		}
//		if (marketCaseCount>0) {
//			statisticInsertor.insertChannelRecommonedStatistic(tempInParam);
//		}
	}
	
	/**
	 * 获取营销案订购量
	* @date: 2016-11-26 
	* @author: mengxi
	* @title: getMarketCaseOrderNum 
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, Object>> getMarketCaseOrderNum() throws StrategyError{
		List<Map<String, Object>>  marketCaseList = evaluateSelector.selectMarketCaseOrderNum();
		return marketCaseList;
	}
	
	/**
	 * 获取营销案接触量
	* @date: 2016-11-26 
	* @author: mengxi
	* @title: getMarketCaseContactNum 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getMarketCaseContactNum(Map<String, Object> inParam) throws StrategyError{
		//查询营销案接触数量入参处理
		Map<String, Object> tempParam = addParamSettle.settleMarketCaseContactNumInParam(inParam);
		//查询营销案接触数量
		String count = statisticSelector.selectStatistic(tempParam);
		log.info("getMarketCaseContactNum.count", count);
		//查询营销案接触数量出参处理
		Map<String, Object> outParam = addParamSettle.settleMarketCaseContactNumOutParam(inParam,count);
		
		return outParam;
	}

	/**
	 * 导入产商品信息报表数据
	* @date: 2017-1-24 
	* @author: mengxi
	* @title: importProductCommodityReportData 
	* @param dirPath
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void importProductCommodityReportData(String dirPath) throws StrategyError {
		log.info("---------Evaluate------importProductCommodityReportData-----begin----------", "");
		File files = new File(dirPath);
		log.info("importProductCommodityReportData.files", files);
		for (File file : files.listFiles()) {
			log.info("importProductCommodityReportData.file", file);
			BufferedReader input;
			try{
				String row = new String();
				input = new BufferedReader(new FileReader(file));
				
				while ((row = input.readLine()) != null) {
					log.info("importProductCommodityReportData.row", row);
					String[] info = row.split("\\|");
					log.info("importProductCommodityReportData.info", info);
					//产商品信息报表数据入参处理
					Map<String, Object> tempParam = addParamSettle.settleProductCommodityReportDataInParam(info);
					log.info("importProductCommodityReportData.tempParam", tempParam);
					//插入产商品信息报表数据
					evaluateInsertor.insertProductCommodityReportData(tempParam);
				}
				input.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
			file.getAbsoluteFile().delete();
		}
	}
	
	/**
	 * 插入营销案产品订购量统计表
	* @date: 2016-11-26 
	* @author: mengxi
	* @title: insertMarketCaseOrderReportData 
	* @param inList
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void insertMarketCaseOrderReportData(Map<String, Object> inParam) throws StrategyError{
		evaluateInsertor.insertMarketCaseOrderReportData(inParam);
	}
	
	/**
	 * 营销案push任务统计查询
	* @date: 2017-3-13 
	* @author: tangaq
	* @title: queryMarketCasePushTaskStatistics 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryMarketCasePushTaskStatistics(Map<String, Object> inParam) throws StrategyError {
		return evaluateSelector.selectMarketCasePushTaskStatistics(inParam);
	}

	/**
	 * 查询报表列表 
	* @date: 2016-11-21 
	* @author: xiongxq
	* @Title: queryReportFormList 
	* @param inParam
	* @param queryFilter
	* @param sortParamer
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public List<Map<String, Object>> queryReportFormList(
			Map<String, Object> inParam, IQueryFilter queryFilter,
			ISortParamer sortParamer) throws StrategyError {
			//调用方法查询3天的订购量
			List<Map<String,Object>> threeList = evaluateSelector.selectThreeDayOrderNum(inParam, queryFilter);
			//调用方法查询7天的订购量
			List<Map<String,Object>> sevenList = evaluateSelector.selectSevenDayOrderNum(inParam, queryFilter);
			//调用方法查询15天的订购量
			List<Map<String,Object>> fifthList = evaluateSelector.selectFifthDayOrderNum(inParam, queryFilter);
			List<Map<String,Object>> resultList = new ArrayList<Map<String,Object>>();
			//对3天的订购量数据进行遍历得到营销案名称，发送时间，接触量，3天订购量
			for(Map<String,Object> threeMap:threeList){
				Map<String,Object> outMap = new HashMap<String,Object>();
				String key = (String)threeMap.get("marketCaseId")+(String)threeMap.get("sendDate");
				if(outMap.containsKey(key)){
					Map resultMap = (Map)outMap.get(key);
				}else{
					Map resultMap = new HashMap();
					resultMap.put("MARKET_CASE_NAME", threeMap.get("marketCaseName"));
					resultMap.put("SEND_DATE", threeMap.get("sendDate"));
					resultMap.put("TOUCH_NUM", threeMap.get("touchNum"));
					resultMap.put("THREE_ORDER_NUM", threeMap.get("threeOrderNum"));
					resultMap.put("ORDER_NUM", threeMap.get("HalOrderNum"));
					resultMap.put("ORDER_NUM", threeMap.get("SmsOrderNum"));
					resultMap.put("ORDER_NUM", threeMap.get("WapOrderNum"));
					resultMap.put("ORDER_NUM", threeMap.get("KfOrderNum"));
					resultMap.put("ORDER_NUM", threeMap.get("OtherOrderNum"));
					
					//取出营销案id作为入参查询某个营销案总的订购量
					Map<String,Object> termParam = new HashMap<String,Object>();
					termParam.put("marketCaseId", threeMap.get("marketCaseId"));
					Map<String,Object> totalMap = evaluateSelector.selectOrderNum(termParam);
					resultMap.put("TOTAL_ORDER_NUM", totalMap.get("totalOrderNum"));
					//对7天的订购量数进行遍历得到7天订购量
					for(Map<String,Object> sevenMap:sevenList){
						String sevenKey = (String)sevenMap.get("marketCaseId")+(String)sevenMap.get("sendDate");
						if(key.equals(sevenKey)){
						resultMap.put("SEVEN_ORDER_NUM", sevenMap.get("sevenOrderNum"));
						resultMap.put("ORDER_NUM", sevenMap.get("HalOrderNum"));
						resultMap.put("ORDER_NUM", sevenMap.get("SmsOrderNum"));
						resultMap.put("ORDER_NUM", sevenMap.get("WapOrderNum"));
						resultMap.put("ORDER_NUM", sevenMap.get("KfOrderNum"));
						resultMap.put("ORDER_NUM", sevenMap.get("OtherOrderNum"));
						}
					}
					for(Map<String,Object> fifthMap:fifthList){
						String fifthKey = (String)fifthMap.get("marketCaseId")+(String)fifthMap.get("sendDate");
						if(key.equals(fifthKey)){
						resultMap.put("FIFTH_ORDER_NUM", fifthMap.get("fifthOrderNum"));
						resultMap.put("ORDER_NUM", fifthMap.get("HalOrderNum"));
						resultMap.put("ORDER_NUM", fifthMap.get("SmsOrderNum"));
						resultMap.put("ORDER_NUM", fifthMap.get("WapOrderNum"));
						resultMap.put("ORDER_NUM", fifthMap.get("KfOrderNum"));
						resultMap.put("ORDER_NUM", fifthMap.get("OtherOrderNum"));
						}
					}
					outMap.put(key, resultMap);
					resultList.add(outMap);
				}
			}
			return resultList;
	}

	/**
	 * 查询渠道营销案订购汇总信息
	* @date: 2016-11-26 
	* @author: yuanliang
	* @title: selectChannelMarketCaseOrderReportInfoList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> selectChannelMarketCaseOrderReportInfoList(
			Map<String, Object> inParam) throws StrategyError {
		List<Map<String,Object>> outList = evaluateSelector.selectChannelMarketCaseOrderReportInfoList(inParam);
		return outList;
	}

	/**
	 * 根据日期参数的不同，查询昨日曝光量、当日累计曝光量
	* @date: 2016-11-26 
	* @author: yuanliang
	* @title: selectMarketCaseOrderReportSendNum 
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> selectMarketCaseOrderReportSendNum(
			IQueryFilter queryFilter) throws StrategyError {
		Map<String,Object> out = evaluateSelector.selectMarketCaseOrderReportSendNum(queryFilter);
		return out;
	}	
	/**
	 * 查询产商品信息报表
	* @date: 2017-3-3 
	* @author: hannn
	* @title: selectProductCommodityReportInfo 
	* @param inParam
	* @param queryFilter
	* @param sortParamer
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> selectProductCommodityReportInfo(Map<String, Object> inParam,IQueryFilter queryFilter, ISortParamer sortParamer)
			throws StrategyError {
		Map outParam = new HashMap<String,Object>();
		List<Map<String,Object>> productCommodityReportInfoList = evaluateSelector.selectProductCommodityReportInfo(inParam, queryFilter);
		String totalRecord = evaluateSelector.selectProductCommodityReportCount(inParam, queryFilter);
		outParam.put("productCommodityReportInfoList", productCommodityReportInfoList);
		outParam.put("totalRecord", totalRecord);
		return outParam;
	}
   /**
    * 查询全省产商品信息报表
   * @date: 2017-2-24 
   * @author: hannn
   * @title: selectProductCommodityReportInfoByProvince 
   * @param inParam
   * @param queryFilter
   * @param sortParamer
   * @return
   * @throws StrategyError 
   * @exception: 
   * @version: 1.0 
   * @description: 
   * update_version: update_date: update_author: update_note:
    */
	@Override
	public Map<String,Object> selectProductCommodityReportInfoByProvince(Map<String, Object> inParam,IQueryFilter queryFilter, ISortParamer sortParamer)
			throws StrategyError {
		Map outParam = new HashMap<String,Object>();
		List<Map<String,Object>> productCommodityReportInfoList = evaluateSelector.selectProductCommodityReportInfoByProvince(inParam, queryFilter);
		String totalRecord = evaluateSelector.selectProductCommodityReportCount(inParam, queryFilter);
		outParam.put("productCommodityReportInfoList", productCommodityReportInfoList);
		outParam.put("totalRecord", totalRecord);
		return outParam;
	}
	/**
	 * 参数处理类
	* @date: 2016-11-26 
	* @author: mengxi
	* @title: AddParamSettle 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	protected class AddParamSettle implements Serializable{
		/**
		 * 查询营销案接触数量入参处理
		* @date: 2016-11-26 
		* @author: mengxi
		* @title: settleMarketCaseContactNumInParam 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String, Object> settleMarketCaseContactNumInParam(Map<String, Object> inParam) throws StrategyError{
			Map<String, Object> outParam = new HashMap<String, Object>();
			
			String marketCaseId = (String)inParam.get("MARKET_CASE_ID");
			String sendDate = (String)inParam.get("SEND_DATE");
			outParam.put("marketCaseId", marketCaseId);
			outParam.put("currentDate", sendDate);
			outParam.put("statisType", Const.STATISTIC_TYPE_SENDTASKCOUNT);
			log.info("settleMarketCaseContactNumInParam.marketCaseId", marketCaseId);
			log.info("settleMarketCaseContactNumInParam.sendDate", sendDate);
			log.info("settleMarketCaseContactNumInParam.Const.STATISTIC_TYPE_SENDTASKCOUNT", Const.STATISTIC_TYPE_SENDTASKCOUNT);

			return outParam;
		}
		
		/**
		 * 查询营销案接触数量出参处理
		* @date: 2016-11-26 
		* @author: mengxi
		* @title: settleMarketCaseContactNumOutParam 
		* @param inParam
		* @param marketCaseTouchNumMap
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String, Object> settleMarketCaseContactNumOutParam(Map<String, Object> inParam,String count) throws StrategyError{
			Map<String, Object> outParam = new HashMap<String, Object>();
			
			outParam.put("marketCaseId", inParam.get("MARKET_CASE_ID"));
			outParam.put("sendDate",inParam.get("SEND_DATE"));
			outParam.put("reportDate",inParam.get("REPORT_DATE"));
			outParam.put("orderNum", inParam.get("ORDER_NUM"));
			outParam.put("sendNum", count);
			outParam.put("contactNum", count);
			
			return outParam;
		}

		/**
		 * 产商品信息报表数据入参处理
		* @date: 2017-1-24 
		* @author: mengxi
		* @title: settleProductCommodityReportDataInParam 
		* @param info
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public Map<String, Object> settleProductCommodityReportDataInParam(String[] info) {
			Map<String, Object> outParam = new HashMap<String, Object>();
			
			for (int j = 0; j < info.length; j++) {
				outParam.put("productcommodityType", info[0]);
				outParam.put("productcommodityId", info[1]);
				outParam.put("productcommodityName", info[2]);
				outParam.put("effTime", info[3]);
				outParam.put("cityId", info[4]);
				outParam.put("reachNum", info[5]);
				outParam.put("orderNumD", info[6]);
				outParam.put("orderNumM", info[7]);
				outParam.put("reportDate", info[8]);
			}
			
			return outParam;
		}
	}

}

