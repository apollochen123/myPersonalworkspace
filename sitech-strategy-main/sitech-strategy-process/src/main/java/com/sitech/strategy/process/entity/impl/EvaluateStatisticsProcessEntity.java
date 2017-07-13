package com.sitech.strategy.process.entity.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IEvaluate;
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.process.base.BaseProcessEntity;
import com.sitech.strategy.process.entity.inter.IEvaluateStatisticsProcessEntity;

/**
 * 评估统计预处理实体
* @date: 2016-11-25 
* @author: mengxi
* @title: EvaluateStatisticsProcessEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class EvaluateStatisticsProcessEntity extends BaseProcessEntity implements IEvaluateStatisticsProcessEntity {
	/**
	 * 报表统计对象
	 */
	protected IEvaluate evaluate;

	/**
	 * 营销案对象
	 */
	protected IMarketCase marketCase;

	/**
	 * 
	* @date: 2016-11-26 
	* @author: mengxi
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
	 * 
	* @date: 2016-11-26 
	* @author: mengxi
	* @title: setMarketCase 
	* @param marketCase 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCase(IMarketCase marketCase) {
		this.marketCase = marketCase;
	}

	/**
	 * 生成营销案统计报表数据
	* @date: 2016-11-25 
	* @author: mengxi
	* @title: generateMarketCaseOrderReportData 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void generateMarketCaseOrderReportData() throws StrategyError {
		//获取营销案订购量
		log.info("---------generateMarketCaseOrderReportData----getMarketCaseOrderNum-----begin----------", "");
		List<Map<String, Object>>  marketCaseOrderNumList = evaluate.getMarketCaseOrderNum();
		log.info("---------generateMarketCaseOrderReportData----getMarketCaseOrderNum-----end----------", "");
		//获取营销案接触量
		log.info("---------generateMarketCaseOrderReportData----getMarketCaseContactNum-----begin----------", "");
		List<Map<String, Object>>  marketCaseContactNumList = this.getMarketCaseContactNum(marketCaseOrderNumList);
		log.info("---------generateMarketCaseOrderReportData----getMarketCaseContactNum-----end----------", "");
		//获取营销案详细
		log.info("---------generateMarketCaseOrderReportData----getMarketCaseDetail-----begin----------", "");
		List<Map<String, Object>>  marketCaseStatisticsDataList = this.getMarketCaseDetail(marketCaseContactNumList);
		log.info("---------generateMarketCaseOrderReportData----getMarketCaseDetail-----end----------", "");
		//插入营销案产品订购量统计表
		log.info("---------generateMarketCaseOrderReportData----insertMarketCaseOrderReportData-----begin----------", "");
		this.insertMarketCaseOrderReportData(marketCaseStatisticsDataList);
		log.info("---------generateMarketCaseOrderReportData----insertMarketCaseOrderReportData-----end----------", "");
	}
	

	/**
	 * 获取营销案接触量
	* @date: 2016-11-26 
	* @author: mengxi
	* @title: getMarketCaseContactNum 
	* @param inList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> getMarketCaseContactNum(List<Map<String, Object>> inList)throws StrategyError{
		List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
		
		if(!CommonUtils.objectIsNull(inList)){
			for(Map<String, Object> inMap:inList){
				Map<String, Object> outMap = evaluate.getMarketCaseContactNum(inMap);
				outList.add(outMap);
				log.info("getMarketCaseContactNum.outMap:", outMap);
			}
		}
		log.info("getMarketCaseContactNum.outList:", outList);
		return outList;
	}
	
	/**
	 * 获取营销案详细信息
	* @date: 2016-11-26 
	* @author: mengxi
	* @title: getMarketCaseDetail 
	* @param inList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> getMarketCaseDetail(List<Map<String, Object>> inList)throws StrategyError{
		List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
		
		if(!CommonUtils.objectIsNull(inList)){
			for(Map<String, Object> inMap:inList){
				Map<String,Object> outMap = marketCase.getStatisticsMarketCaseDetail(inMap);
				outList.add(outMap);
			}
		}
		
		return outList;
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
	protected void insertMarketCaseOrderReportData(List<Map<String, Object>> inList)throws StrategyError{
		if(!CommonUtils.objectIsNull(inList)){
			for(Map<String, Object> inParam:inList){
				evaluate.insertMarketCaseOrderReportData(inParam);
			}
		}
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
	public void importProductCommodityReportData(String dirPath)throws StrategyError {
		log.info("---------EvaluateStatisticsProcessEntity------importProductCommodityReportData-----begin----------", "");
		evaluate.importProductCommodityReportData(dirPath);
	}
}