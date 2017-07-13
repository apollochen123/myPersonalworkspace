package com.sitech.strategy.manage.service.jcf.impl;

import java.util.List;
import java.util.Map;

import com.sitech.jcfx.anno.ParamType;
import com.sitech.jcfx.anno.ParamTypes;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.BaseManageService;
import com.sitech.strategy.manage.base.basedto.StandardInDTO;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.inter.IWorkBenchManageEntity;
import com.sitech.strategy.manage.entity.param.inter.IWorkBenchManageParam;
import com.sitech.strategy.manage.service.jcf.inter.IWorkBenchManageService;

/**
 * 工作台
* @date: 2016-9-5 
* @author: tangaq
* @title: WorkBenchManageService 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */

@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "queryChannelMarketCaseOrderReportInfo", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryChannelTouchNumByRegionCode", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryMarketCaseTouchNumByRegionCode", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "qureyMarketCaseAuditNum", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "qureyMarketCaseNum", oc = StandardOutDTO.class),	
	@ParamType(c = StandardInDTO.class, m = "queryMarketCaseOrderReportSendNum", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryNoticeList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryRegionCodeConvertRate", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryUserTouchNumByRegionCode", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryProductCommodityReportInfoList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveNotice", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeNotice", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateNotice", oc = StandardOutDTO.class)
})

public class WorkBenchManageService extends BaseManageService implements IWorkBenchManageService {
	/**
	 * 工作台对象
	 */
	protected IWorkBenchManageEntity workBenchManageEntity;


	/**
	 * 工作台参数处理对象
	 */
	protected IWorkBenchManageParam workBenchManageParam;
	
	
	/**
	 * 
	* @date: 2016-11-4 
	* @author: mengxi
	* @title: setWorkBenchManageEntity 
	* @param workBenchManageEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setWorkBenchManageEntity(
			IWorkBenchManageEntity workBenchManageEntity) {
		this.workBenchManageEntity = workBenchManageEntity;
	}


	/**
	 * 
	* @date: 2016-11-4 
	* @author: mengxi
	* @title: setWorkBenchManageParam 
	* @param workBenchManageParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setWorkBenchManageParam(IWorkBenchManageParam workBenchManageParam) {
		this.workBenchManageParam = workBenchManageParam;
	}

	/**
	 * 查询渠道营销案订购汇总信息
	* @date: 2016-11-26 
	* @author: yuanliang
	* @title: queryChannelMarketCaseOrderReportInfo 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryChannelMarketCaseOrderReportInfo(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = workBenchManageParam.queryChannelMarketCaseOrderReportInfoInParam(inDTO);
			List<Map<String,Object>>  outParam = workBenchManageEntity.queryChannelMarketCaseOrderReportInfo(inParam);
			standardOutDTO = workBenchManageParam.queryChannelMarketCaseOrderReportInfoOutParam(outParam); 
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 *  根据地市查询某个触点下的接触量
	* @date: 2016-12-6 
	* @author: tangaqxq
	* @Title: queryChannelTouchNumByRegionCode 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO queryChannelTouchNumByRegionCode(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = workBenchManageParam.queryChannelTouchNumByRegionCodeInParam(inDTO);
			Map<String,Object> outParam = workBenchManageEntity.queryChannelTouchNumByRegionCode(inParam);
			standardOutDTO = workBenchManageParam.queryChannelTouchNumByRegionCodeOutParam(outParam); 
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/** 
	 * 根据地市查询某个营销案大类下面的接触量
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: queryMarketCaseTouchNumByRegionCode 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO queryMarketCaseTouchNumByRegionCode(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = workBenchManageParam.queryMarketCaseTouchNumByRegionCodeInParam(inDTO);
			Map<String,Object> outParam = workBenchManageEntity.queryMarketCaseTouchNumByRegionCode(inParam);
			standardOutDTO = workBenchManageParam.queryMarketCaseTouchNumByRegionCodeOutParam(outParam); 
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 查询营销案审批数量
	* @date: 2016-11-4 
	* @author: mengxi
	* @title: qureyMarketCaseAuditNum 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO qureyMarketCaseAuditNum(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = workBenchManageParam.qureyMarketCaseAuditNumInParam(inDTO);
			Map<String,Object> outParam = workBenchManageEntity.qureyMarketCaseAuditNum(inParam);
			standardOutDTO = workBenchManageParam.qureyMarketCaseAuditNumOutParam(outParam); 
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 * 查询营销案数量
	* @date: 2016-11-8 
	* @author: mengxi
	* @title: qureyMarketCaseNum 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO qureyMarketCaseNum(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = workBenchManageParam.qureyMarketCaseNumInParam(inDTO);
			Map<String,Object> outParam = workBenchManageEntity.qureyMarketCaseNum(inParam);
			standardOutDTO = workBenchManageParam.qureyMarketCaseNumOutParam(outParam); 
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 根据日期参数的不同，查询昨日曝光量、当日累计曝光量
	* @date: 2016-11-26 
	* @author: yuanliang
	* @title: queryMarketCaseOrderReportSendNum 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryMarketCaseOrderReportSendNum(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = workBenchManageParam.queryMarketCaseOrderReportSendNumInParam(inDTO);
			Map<String,Object> outParam = workBenchManageEntity.queryMarketCaseOrderReportSendNum(inParam);
			standardOutDTO = workBenchManageParam.queryMarketCaseOrderReportSendNumOutParam(outParam); 
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 * 查询公告列表
	* @date: 2017-2-27 
	* @author: yexr
	* @title: queryNoticeList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryNoticeList(InDTO inDTO) {
	    StandardOutDTO standardOutDTO = new StandardOutDTO();		
		try {			
			Map<String,Object> inParam  = workBenchManageParam.queryNoticeListInParam(inDTO);
			Map<String,Object> outParam = workBenchManageEntity.queryNoticeList(inParam);
			standardOutDTO = workBenchManageParam.queryNoticeListOutParam(outParam); 			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}		
		return standardOutDTO;	
	}
	
	/**
	 * 查询产商品信息报表
	* @date: 2017-2-22 
	* @author: hannn
	* @title: queryProductCommodityReportInfoList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryProductCommodityReportInfoList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam  = workBenchManageParam.queryProductCommodityReportInfoListInParam(inDTO);
			Map<String,Object> outParam= workBenchManageEntity.queryProductCommodityReportInfoList(inParam);
			standardOutDTO = workBenchManageParam.queryProductCommodityReportInfoListOutParam(outParam); 
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
		return standardOutDTO;
	}
	/** 
	 * 查询各个地市的转化率
	* @date: 2016-12-7 
	* @author: tangaq
	* @Title: queryRegionCodeConvertRate 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO queryRegionCodeConvertRate(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = workBenchManageParam.queryRegionCodeConvertRateInParam(inDTO);
			Map<String,Object> outParam = workBenchManageEntity.queryRegionCodeConvertRate(inParam);
			standardOutDTO = workBenchManageParam.queryRegionCodeConvertRateOutParam(outParam); 
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/** 
	 * 根据地市查询用户接触量
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: queryUserTouchNumByRegionCode 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO queryUserTouchNumByRegionCode(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = workBenchManageParam.queryUserTouchNumByRegionCodeInParam(inDTO);
			Map<String,Object> outParam = workBenchManageEntity.queryUserTouchNumByRegionCode(inParam);
			standardOutDTO = workBenchManageParam.queryUserTouchNumByRegionCodeOutParam(outParam); 
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	
	/**
	 * 新增公告
	* @date: 2017-3-1 
	* @author: yexr
	* @title: saveNotice 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveNotice(InDTO inDTO) {
	    StandardOutDTO standardOutDTO = new StandardOutDTO();		
		try {			
			Map<String,Object> inParam  = workBenchManageParam.saveNoticeInParam(inDTO);
			workBenchManageEntity.saveNotice(inParam);
			standardOutDTO = workBenchManageParam.saveNoticeOutParam(); 			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}		
		return standardOutDTO;	
	}
	
	/**
	 * 修改公告
	* @date: 2017-3-1 
	* @author: yexr
	* @title: updateNotice 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	 @Override
	 public OutDTO updateNotice(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			
			Map<String,Object> inParam = workBenchManageParam.updateNoticeInParam(inDTO);
			workBenchManageEntity.updateNotice(inParam);
		    standardOutDTO = workBenchManageParam.updateNoticeOutParam();
		} catch (StrategyError e) {
			e.printStackTrace();
		e.processExcepByJCF();
		}		
	return standardOutDTO;	
	}

	/**
	 * 删除公告
	* @date: 2017-3-1 
	* @author: yexr
	* @title: removeNotice 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removeNotice(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {			
			Map<String,Object> inParam = workBenchManageParam.removeNoticeInParam(inDTO);
			workBenchManageEntity.removeNotice(inParam);
			standardOutDTO = workBenchManageParam.removeNoticeOutParam();		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}		
		return standardOutDTO;	
	}
	
}
