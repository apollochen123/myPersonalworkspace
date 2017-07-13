package com.sitech.strategy.manage.service.jcf.impl;

import java.util.Map;

import com.sitech.jcfx.anno.ParamType;
import com.sitech.jcfx.anno.ParamTypes;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.BaseManageService;
import com.sitech.strategy.manage.base.basedto.StandardInDTO;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.inter.IEvaluateManageEntity;
import com.sitech.strategy.manage.entity.param.inter.IEvaluateManageParam;
import com.sitech.strategy.manage.service.jcf.inter.IEvaluateManageService;

/**
 * 评估(查询、报表)
* @date: 2016-9-5 
* @author: tangaq
* @title: EvaluateManageService 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "queryAreaMarketSpaceData", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryMarketCaseRelCustList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryPushTaskStatistics", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryReportFormList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryUserTouchViewList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryUserReceiptRecordList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryReportFormStatistics", oc = StandardOutDTO.class)
	
})	
public class EvaluateManageService extends BaseManageService implements IEvaluateManageService {
	
	/**
	 * 评估(查询)对象
	 */
	protected IEvaluateManageEntity evaluateManageEntity;
	/**
	 * 参数转换对象
	 */
	protected IEvaluateManageParam evaluateManageParam;
	
	/**
	 * 
	* @date: 2016-10-17 
	* @author: fangyuan_crmpd
	* @title: setEvaluateManageEntity 
	* @param evaluateManageEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEvaluateManageEntity(IEvaluateManageEntity evaluateManageEntity) {
		this.evaluateManageEntity = evaluateManageEntity;
	}
	
	/**
	 * 
	* @date: 2016-10-17 
	* @author: fangyuan_crmpd
	* @title: setEvaluateManageParam 
	* @param evaluateManageParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEvaluateManageParam(IEvaluateManageParam evaluateManageParam) {
		this.evaluateManageParam = evaluateManageParam;
	}
	
	/**
	 * 查询区域市场空间数据
	* @date: 2016-11-9 
	* @author: fangyuan_crmpd
	* @title: queryAreaMarketSpaceData 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryAreaMarketSpaceData(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = evaluateManageParam.queryAreaMarketSpaceDataInParam(inDTO);
			Map<String,Object> outParam = evaluateManageEntity.queryAreaMarketSpaceData(inParam);
			standardOutDTO = evaluateManageParam.queryAreaMarketSpaceDataOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 查询营销案客户关系列表
	* @date: 2016-10-17 
	* @author: fangyuan_crmpd
	* @title: queryMarketCaseRelCustList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryMarketCaseRelCustList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = evaluateManageParam.queryMarketCaseRelCustListInParam(inDTO);
			Map<String,Object> outParam = evaluateManageEntity.queryMarketCaseRelCustList(inParam);
			standardOutDTO = evaluateManageParam.queryMarketCaseRelCustListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/** 
	 * 营销案push任务统计
	* @date: 2016-10-29 
	* @author: songxj
	* @title: queryPushTaskStatistics 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO queryPushTaskStatistics(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam  = evaluateManageParam.queryPushTaskStatisticsInParam(inDTO);
			Map<String,Object> outParam = evaluateManageEntity.queryPushTaskStatistics(inParam);
			standardOutDTO = evaluateManageParam.queryPushTaskStatisticsOutParam(outParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;
	}
	
	/** 
	 * 查询报表列表
	* @date: 2016-11-21 
	* @author: xiongxq
	* @Title: queryReportFormList 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO queryReportFormList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = evaluateManageParam.queryReportFormListInParam(inDTO);
			Map<String,Object> outParam = evaluateManageEntity.queryReportFormList(inParam);
			standardOutDTO = evaluateManageParam.queryReportFormListOutParam(outParam);
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

	/**
	 * 查询营销案报表统计
	* @date: 2017-4-17 
	* @author: yuanchun
	* @title: queryReportFormStatistics 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryReportFormStatistics(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = evaluateManageParam.queryReportFormStatisticsInParam(inDTO);
			Map<String,Object> outParam = evaluateManageEntity.queryReportFormStatistics(inParam);
			standardOutDTO = evaluateManageParam.queryReportFormStatisticsOutParam(outParam);
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	
	/**
	 * 查询用户接触视图列表
	* @date: 2016-11-9 
	* @author: fangyuan_crmpd
	* @title: queryUserTouchViewList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryUserTouchViewList(InDTO inDTO) {
		 StandardOutDTO standardOutDTO = new StandardOutDTO();
			
			try {
				
				Map<String,Object> inParam = evaluateManageParam.queryUserTouchViewListInParam(inDTO);
				Map<String,Object> outParam= evaluateManageEntity.queryUserTouchViewList(inParam);
				standardOutDTO = evaluateManageParam.queryUserTouchViewListOutParam(outParam);
				
			}catch (StrategyError e) {
				e.printStackTrace();
				e.processExcepByJCF();
			}	
			
			return standardOutDTO;
	}
	
	/**
	 * 查询用户回单反馈列表
	* @date: 2017-1-9 
	* @author:liuqi
	* @title: queryUserReceiptRecordList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryUserReceiptRecordList(InDTO inDTO) {
		 StandardOutDTO standardOutDTO = new StandardOutDTO();
			
			try {
				
				Map<String,Object> inParam = evaluateManageParam.queryUserReceiptRecordListInParam(inDTO);
				Map<String,Object> outParam= evaluateManageEntity.queryUserReceiptRecordList(inParam);
				standardOutDTO = evaluateManageParam.queryUserReceiptRecordListOutParam(outParam);
				
			}catch (StrategyError e) {
				e.printStackTrace();
				e.processExcepByJCF();
			}	
			
			return standardOutDTO;
		}

}

