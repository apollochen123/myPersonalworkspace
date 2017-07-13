package com.sitech.strategy.process.batch;

import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SpringBeanFactory;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.process.base.BaseProcessBatch;
import com.sitech.strategy.process.entity.inter.IEvaluateStatisticsProcessEntity;

/**
 * 评估统计
* @date: 2016-9-28 
* @author: sunliang 
* @title: EvaluateStatistics 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class EvaluateStatistics extends BaseProcessBatch{
	/**
	 * 评估统计实体
	 */
	protected IEvaluateStatisticsProcessEntity evaluateStatisticsProcessEntity;
	
	/**
	 * 
	* @date: 2016-11-27 
	* @author: mengxi
	* @title: setEvaluateStatisticsProcessEntity 
	* @param evaluateStatisticsProcessEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEvaluateStatisticsProcessEntity(
			IEvaluateStatisticsProcessEntity evaluateStatisticsProcessEntity) {
		this.evaluateStatisticsProcessEntity = evaluateStatisticsProcessEntity;
	}



	/**
	 * 生成营销案订购统计报表数据
	* @date: 2016-11-25 
	* @author: mengxi
	* @title: generateMarketCaseOrderReportData  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void generateMarketCaseOrderReportData(){
		try {
			evaluateStatisticsProcessEntity.generateMarketCaseOrderReportData();
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}

	/**
	 * 导入产商品信息报表数据
	* @date: 2017-1-24 
	* @author: mengxi
	* @title: importProductCommodityReportData 
	* @param dirPath 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void importProductCommodityReportData(String dirPath) {
		try {
			evaluateStatisticsProcessEntity.importProductCommodityReportData(dirPath);
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	* @date: 2016-12-19 
	* @author: mengxi
	* @title: main 
	* @param args 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void main(String[] args){
		String type = null;
		String dirPath = null;
		if (args.length > 0) {
			type = args[0];
		}
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_EVALUATE);
		EvaluateStatistics evaluateStatistics = (EvaluateStatistics)springBeanFactory.getBean("evaluateStatistics");
		if("marketCaseOrderReport".equals(type)){
			evaluateStatistics.generateMarketCaseOrderReportData();
		}else if("productCommodityReport".equals(type)){
			dirPath = args[1];
			System.out.println("EvaluateStatistics.productCommodityReport.dirPath:"+dirPath);
			evaluateStatistics.importProductCommodityReportData(dirPath);
		}
	}
	
}
