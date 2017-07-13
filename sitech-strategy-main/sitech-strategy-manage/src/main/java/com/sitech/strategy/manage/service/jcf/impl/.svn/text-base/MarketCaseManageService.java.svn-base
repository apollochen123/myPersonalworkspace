package com.sitech.strategy.manage.service.jcf.impl;

import java.util.List;
import java.util.Map;

import com.sitech.jcfx.anno.ParamType;
import com.sitech.jcfx.anno.ParamTypes;
import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;
import com.sitech.strategy.common.pojo.inter.IMarketCaseDetailPojo;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.BaseManageService;
import com.sitech.strategy.manage.base.basedto.StandardInDTO;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.inter.IMarketCaseManageEntity;
import com.sitech.strategy.manage.entity.param.inter.IMarketCaseManageParam;
import com.sitech.strategy.manage.service.jcf.inter.IMarketCaseManageService;

/**
 * 营销案
* @date: 2016-9-5 
* @author: sunliang
* @title: MarketCaseManageService 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "assignMarketCasePermissionById", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryMarketCaseBasicByName", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryMarketCaseDetailById", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryMarketCaseDetailList", oc = StandardOutDTO.class),	
	@ParamType(c = StandardInDTO.class, m = "queryMarketCaseList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryMarketCaseListByPermission", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryMarketCaseTempList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryMarketCaseAuditDetailById", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryProductList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeMarketCaseById", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeMarketCaseCustGroupRelAndDetailByRelId", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "restartAndPauseMarketCaseById", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveMarketCaseBasic", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveMarketCaseCustGroupRel", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveMarketCaseDetail", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveMarketCaseTempByMCId", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateMarketCaseDetailByTemplate", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateMarketCaseStatus", oc = StandardOutDTO.class)
})
public class MarketCaseManageService extends BaseManageService implements IMarketCaseManageService{
	
	/**
	 * 营销案对象
	 */
	protected IMarketCaseManageEntity marketCaseManageEntity;
	/**
	 * 参数转换对象
	 */
	protected IMarketCaseManageParam marketCaseManageParam;
	
	/**
	 * 
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: setMarketCaseManageEntity 
	* @param marketCaseManageEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseManageEntity(IMarketCaseManageEntity marketCaseManageEntity) {
		this.marketCaseManageEntity = marketCaseManageEntity;
	}
	
    /**
     * 
    * @date: 2016-9-14 
    * @author: tangaq
    * @title: setMarketCaseManageParam 
    * @param marketCaseManageParam 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	public void setMarketCaseManageParam(
			IMarketCaseManageParam marketCaseManageParam) {
		this.marketCaseManageParam = marketCaseManageParam;
	}

	/**
	 * 权限下放
	* @date: 2016-9-5 
	* @author: tangaq
	* @Title: assignMarketCasePermissionById 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO assignMarketCasePermissionById(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = marketCaseManageParam.assignMarketCasePermissionByIdInParam(inDTO);
			marketCaseManageEntity.assignMarketCasePermissionById(inParam);
			standardOutDTO = marketCaseManageParam.assignMarketCasePermissionByIdOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
		
		return standardOutDTO;
	}
	/**
	 * 根据营销案名称查询营销案信息
	* @date: 2017-3-7 
	* @author: yuanliang
	* @title: queryMarketCaseByName 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryMarketCaseBasicByName(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = marketCaseManageParam.queryMarketCaseBasicByNameInParam(inDTO);
			List<Map<String,Object>> outParam = marketCaseManageEntity.queryMarketCaseBasicByName(inParam);
			standardOutDTO = marketCaseManageParam.queryMarketCaseBasicByNameOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
		
		return standardOutDTO;
	}
	
	/**
	 * 根据ID查询营销案详细信息
	* @date: 2016-9-5 
	* @author: tangaq
	* @Title: queryMarketCaseDetailById 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryMarketCaseDetailById(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = marketCaseManageParam.queryMarketCaseIdInParam(inDTO);
			Map<String,Object> outParam = marketCaseManageEntity.queryMarketCaseDetailById(inParam);
			standardOutDTO = marketCaseManageParam.queryMarketCaseOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
		
		return standardOutDTO;
	}
	
	/**
	 * 查询营销案详细信息列表
	* @date: 2017-3-3 
	* @author: yuanliang
	* @title: queryMarketCaseDetailList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryMarketCaseDetailList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = marketCaseManageParam.queryMarketCaseDetailListInParam(inDTO);
			List<IMarketCaseDetailPojo> outParam = marketCaseManageEntity.queryMarketCaseDetailList(inParam);
			standardOutDTO = marketCaseManageParam.queryMarketCaseDetailListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
		
		return standardOutDTO;
	}
	
	/**
	 * 查询营销案列表
	* @date: 2016-9-5 
	* @author: tangaq
	* @Title: queryMarketCaseList 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryMarketCaseList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = marketCaseManageParam.queryMarketCaseListInParam(inDTO);
			Map<String,Object> outParam= marketCaseManageEntity.queryMarketCaseList(inParam);
			standardOutDTO = marketCaseManageParam.queryMarketCaseListOutParam(outParam);
					
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
	
		return standardOutDTO;
	}
	
	/**
	 * 根据权限查询营销案列表
	* @date: 2017-1-5 
	* @author: yuanchun
	* @title: queryMarketCaseListByPermission 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryMarketCaseListByPermission(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = marketCaseManageParam.queryMarketCaseListByPermissionInParam(inDTO);
			Map<String,Object> outParam= marketCaseManageEntity.queryMarketCaseListByPermission(inParam);
			standardOutDTO = marketCaseManageParam.queryMarketCaseListByPermissionOutParam(outParam);
					
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
	
		return standardOutDTO;
	}
	
	/**
	 * 查询营销案模板列表
	* @date: 2016-9-5 
	* @author: tangaq
	* @Title: queryMarketCaseTempList 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryMarketCaseTempList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = marketCaseManageParam.queryMarketCaseTempListInParam(inDTO);
			Map<String,Object> outParam = marketCaseManageEntity.queryMarketCaseTempList(inParam);
			standardOutDTO = marketCaseManageParam.queryMarketCaseTempListOutParam(outParam);
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
		
		return standardOutDTO;
	}
	
	/**
	 * 根据ID查询营销案、审批详细信息
	* @date: 2016-10-1 
	* @author: tangaq
	* @title: queryMarketCaseAuditDetailById 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryMarketCaseAuditDetailById(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
		  
			Map<String,Object> inParam = marketCaseManageParam.queryMarketCaseAuditDetailByIdInParam(inDTO);
		    Map<String,Object> outParam= marketCaseManageEntity.queryMarketCaseAuditDetailById(inParam);
		    standardOutDTO = marketCaseManageParam.queryMarketCaseAuditDetailByIdOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
		
		return standardOutDTO;
	}
	
	/** 查询产品列表(销售品，定价组，补贴规则)
	* @date: 2016-10-12 
	* @author: wangpei
	* @title: queryProductList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public OutDTO queryProductList(InDTO inDTO){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
		  
			Map<String,Object> inParam = marketCaseManageParam.queryProductListInParam(inDTO);
		    Map<String,Object> outParam= marketCaseManageEntity.queryProductList(inParam);
		    standardOutDTO = marketCaseManageParam.queryProductListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
		
		return standardOutDTO;
	}
	
	/**
	 * 删除营销案
	* @date: 2016-9-5 
	* @author: tangaq
	* @Title: removeMarketCaseById 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removeMarketCaseById(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = marketCaseManageParam.removeMarketCaseByIdInParam(inDTO);
			marketCaseManageEntity.removeMarketCaseById(inParam);
			standardOutDTO = marketCaseManageParam.removeMarketCaseByIdOutParam();
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
		
		return standardOutDTO;
	}
	
	/** 更具关系Id删除营销案与客户群关系及明细
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: removeMarketCaseCustGroupRelAndDetailByRelId 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO removeMarketCaseCustGroupRelAndDetailByRelId(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam = marketCaseManageParam.removeMarketCaseCustGroupRelByIdInParam(inDTO);
			marketCaseManageEntity.removeMarketCaseCustGroupRelAndDetailByRelId(inParam);
			MBean outBean = new MBean();
			standardOutDTO.setBean(outBean);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;
	}

	/**
	 * 暂停重新启动营销案(终止营销案)
	* @date: 2016-9-5 
	* @author: tangaq
	* @Title: restartAndPauseMarketCaseById 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO restartAndPauseMarketCaseById(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam =  marketCaseManageParam.restartAndPauseMarketCaseByIdInParam(inDTO);
			marketCaseManageEntity.restartAndPauseMarketCaseById(inParam);
			standardOutDTO = marketCaseManageParam.restartAndPauseMarketCaseByIdOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
		
		return standardOutDTO;
	}
	
	/** 保存营销案基本信息
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: saveMarketCaseBasic 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public OutDTO saveMarketCaseBasic(InDTO inDTO) {
		StandardOutDTO standardOutDTO = null;
		try {
			Map<String,Object> inParam = marketCaseManageParam.saveMarketCaseBasicInParam(inDTO);
			Map<String,Object> outParam = marketCaseManageEntity.saveMarketCaseBasic(inParam);
			standardOutDTO = marketCaseManageParam.saveMarketCaseBasicOutParam(outParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;
	}

	/** 保存营销案客户群关系
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: saveMarketCaseCustGroupRel 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public OutDTO saveMarketCaseCustGroupRel(InDTO inDTO) {
		StandardOutDTO standardOutDTO = null;
		try {
			Map<String,Object> inParam = marketCaseManageParam.saveMarketCaseCustGroupRelInParam(inDTO);
			Map<String,Object>outParam = marketCaseManageEntity.saveMarketCaseCustGroupRel(inParam);
			standardOutDTO = marketCaseManageParam.saveMarketCaseCustGroupRelOutParam(outParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;
	}
	
	/**
	 * 保存营销案详细信息
	* @date: 2016-9-5 
	* @author: tangaq
	* @Title: saveMarketCaseDetail 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveMarketCaseDetail(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			
			Map<String,Object> inParam = marketCaseManageParam.saveMarketCaseDetailInParam(inDTO);
			Map<String,Object> outParam = marketCaseManageEntity.saveMarketCaseDetail(inParam);
			standardOutDTO = marketCaseManageParam.saveMarketCaseDetailOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

	/**
	 * 根据模板修改营销案详细信息
	* @date: 2016-11-15 
	* @author: tangaq
	* @title: updateMarketCaseDetailByTemplate 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO updateMarketCaseDetailByTemplate(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			
			Map<String,Object> inParam = marketCaseManageParam.updateMarketCaseByTemplateInParam(inDTO);
		    marketCaseManageEntity.updateMarketCaseDetailByTemplate(inParam);
			standardOutDTO = marketCaseManageParam.updateMarketCaseByTemplateOutParam();
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

	/**
	 * 修改营销案状态
	* @date: 2016-12-19 
	* @author: tangaq
	* @title: updateMarketCaseStatus 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO updateMarketCaseStatus(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			
			Map<String,Object> inParam = marketCaseManageParam.updateMarketCaseStatusInParam(inDTO);
			marketCaseManageEntity.updateMarketCaseStatus(inParam);
			standardOutDTO = marketCaseManageParam.updateMarketCaseStatusOutParam();
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}


	
}
