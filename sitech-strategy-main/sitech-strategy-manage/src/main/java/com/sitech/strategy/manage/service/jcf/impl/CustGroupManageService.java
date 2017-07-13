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
import com.sitech.strategy.manage.entity.inter.ICustGroupManageEntity;
import com.sitech.strategy.manage.entity.param.inter.ICustGroupManageParam;
import com.sitech.strategy.manage.service.jcf.inter.ICustGroupManageService;

/**
 * 目标客户群
* @date: 2016-9-5 
* @author: sunliang
* @title: CustGroupManageService 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
* 2017-2-15 luogj 增加createLabelCustGroupDetailFile服务
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "addBatchNoToCustGroup", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "addSingleNoToCustGroup", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "createLabelCustGroupDetailFile", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryCustGroupById", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryCustGroupCountByUserLabel", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryCustGroupLabelItem", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryCustGroupHandleRecord", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryCustGroupList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryCustGroupDetailFileList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryCustGroupRelationListByCustGroupId", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryCustGroupTempList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryLabelCodeNameList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryLabelValueByCode", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeBatchNoFromCustGroup", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeCustGroupById", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeCustGroupRelationById", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeSingleNoFromCustGroup", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveCustGroup", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveCustGroupRelation", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryLabelFormulaRestrictCountById", oc = StandardOutDTO.class)
})
public class CustGroupManageService extends BaseManageService implements ICustGroupManageService {

	/**
	 * 目标客户群对象
	 */
	protected ICustGroupManageEntity custGroupManageEntity;
	/**
	 * 目标客户群参数转换对象
	 */
	protected ICustGroupManageParam custGroupManageParam;
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: setCustGroupManageEntity 
	* @param custGroupManageEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupManageEntity(ICustGroupManageEntity custGroupManageEntity) {
		this.custGroupManageEntity = custGroupManageEntity;
	}

	/**
	 *  
	 * @date: 2016-9-14 
	 * @author: xiongxq
	 * @Title: setCustGroupManageParam 
	 * @param custGroupManageParam the custGroupManageParam to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setCustGroupManageParam(ICustGroupManageParam custGroupManageParam) {
		this.custGroupManageParam = custGroupManageParam;
	}

	/**
	 *添加 批量号码到目标客户群
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: addBatchNoToCustGroup 
	* @param inDTO
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO addBatchNoToCustGroup(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = custGroupManageParam.addBatchNoToCustGroupInParam(inDTO);
			custGroupManageEntity.addBatchNoToCustGroup(inParam);
			standardOutDTO = custGroupManageParam.addBatchNoToCustGroupOutParam();
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
	
		return standardOutDTO;
	}
	
	/**
	 * 添加单个号码到目标客户群
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: addSingleNoToCustGroup 
	* @param inDTO
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO addSingleNoToCustGroup(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
	 
		try {
			
			Map<String,Object> inParam = custGroupManageParam.addSingleNoToCustGroupInParam(inDTO);
			custGroupManageEntity.addSingleNoToCustGroup(inParam);
			standardOutDTO = custGroupManageParam.addSingleNoToCustGroupOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 创建标签客户群明细文件--从hive中将明细数据导入到文件中
	* @date: 2017-2-16
	* @author: luogj
	* @title: createLabelCustGroupDetailFile 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO createLabelCustGroupDetailFile(InDTO inDTO){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			Map<String,Object> inParam = custGroupManageParam.createLabelCustGroupDetailFileInParam(inDTO);
			custGroupManageEntity.createLabelCustGroupDetailFile(inParam);
			standardOutDTO = custGroupManageParam.createLabelCustGroupDetailFileOutParam();		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 根据ID查询客户群信息
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupById 
	* @param inDTO
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryCustGroupById(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = custGroupManageParam.queryCustGroupByIdInParam(inDTO);
			Map<String,Object> outParam = custGroupManageEntity.queryCustGroupById(inParam);
			standardOutDTO = custGroupManageParam.queryCustGroupByIdOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 查询符合标签的客户群数量
	* @date: 2017-1-24 
	* @author: zhangjj_crmpd
	* @title: queryCustGroupCountByUserLabel 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryCustGroupCountByUserLabel(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = custGroupManageParam.queryCustGroupCountByUserLabelInParam(inDTO);
			Map<String,Object> outParam = custGroupManageEntity.queryCustGroupCountByUserLabel(inParam);
			standardOutDTO = custGroupManageParam.queryCustGroupCountByUserLabelOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	/**
	 * 查询二次过滤标签的人数
	* @date: 2017-4-7 
	* @author: chenhao
	* @title: queryCustGroupCountByUserLabel 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryLabelFormulaRestrictCountById(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = custGroupManageParam.queryLabelFormulaRestrictCountByIdInParam(inDTO);
			Map<String,Object> outParam = custGroupManageEntity.queryLabelFormulaRestrictCountById(inParam);
			standardOutDTO = custGroupManageParam.queryLabelFormulaRestrictCountByIdOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	

	
	/**
	 * 查询客户群明细文件列表
	* @date: 2016-10-30 
	* @author: tangaq
	* @title: queryCustGroupDetailFileList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryCustGroupDetailFileList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
		
		Map<String,Object> inParam = custGroupManageParam.queryCustGroupDetailFileListInParam(inDTO);
		Map<String,Object> outParam = custGroupManageEntity.queryCustGroupDetailFileList(inParam);
		standardOutDTO = custGroupManageParam.queryCustGroupDetailFileListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
		
	}

	/**
	 * 查询客户群处理记录
	* @date: 2017-3-7 
	* @author: tangaq
	* @title: queryCustGroupHandleRecord 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryCustGroupHandleRecord(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = custGroupManageParam.queryCustGroupHandleRecordInParam(inDTO);
			Map<String,Object> outParam = custGroupManageEntity.queryCustGroupHandleRecord(inParam);
			standardOutDTO = custGroupManageParam.queryCustGroupHandleRecordOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

	/**
	 * 查询客户群标签元素
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupLabelItem 
	* @param inDTO
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryCustGroupLabelItem(InDTO inDTO) {	
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = custGroupManageParam.queryCustGroupLabelItemInParam(inDTO);
			List<Map<String,Object>> outParam = custGroupManageEntity.queryCustGroupLabelItem(inParam);
			standardOutDTO = custGroupManageParam.queryCustGroupLabelItemOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 查询客户群列表
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupList 
	* @param inDTO
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryCustGroupList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = custGroupManageParam.queryCustGroupListInParam(inDTO);
			Map<String,Object> outParam = custGroupManageEntity.queryCustGroupList(inParam);
			standardOutDTO =  custGroupManageParam.queryCustGroupListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 根据客户群ID查询客户群关系列表
	* @date: 2016-11-24 
	* @author: fangyuan_crmpd
	* @title: queryCustGroupRelationListByCustGroupId 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryCustGroupRelationListByCustGroupId(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = custGroupManageParam.queryCustGroupRelationListByCustGroupIdInParam(inDTO);
			Map<String,Object> outParam = custGroupManageEntity.queryCustGroupRelationListByCustGroupId(inParam);
			standardOutDTO = custGroupManageParam.queryCustGroupRelationListByCustGroupIdOutParam(outParam);
			 
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 查询客户群模板列表
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupTempList 
	* @param inDTO
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryCustGroupTempList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = custGroupManageParam.queryCustGroupTempListInParam(inDTO);
			Map<String,Object> outParam = custGroupManageEntity.queryCustGroupTempList(inParam);
			standardOutDTO = custGroupManageParam.queryCustGroupTempListOutParam(outParam);
			 
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 查询标签码表列表
	* @date: 2017-3-4 
	* @author: yuanchun
	* @title: queryLabelCodeNameList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryLabelCodeNameList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = custGroupManageParam.queryLabelCodeNameListInParam(inDTO);
			Map<String,Object> outParam = custGroupManageEntity.queryLabelCodeNameList(inParam);
			standardOutDTO = custGroupManageParam.queryLabelCodeNameListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 根据标签元素代码查询标签元素值
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryLabelValueByCode 
	* @param inDTO
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryLabelValueByCode(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = custGroupManageParam.queryLabelValueByCodeInParam(inDTO);
			Map<String,Object> outParam = custGroupManageEntity.queryLabelValueByCode(inParam);
			standardOutDTO = custGroupManageParam.queryLabelValueByCodeOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 批量删除号码
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: removeBatchNoFromCustGroup 
	* @param inDTO
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removeBatchNoFromCustGroup(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
	
		try {
			
			Map<String,Object> inParam = custGroupManageParam.removeBatchNoFromCustGroupInParam(inDTO);
			custGroupManageEntity.removeBatchNoFromCustGroup(inParam);
			standardOutDTO = custGroupManageParam.removeBatchNoFromCustGroupOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 根据id删除客户群
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: removeCustGroupById 
	* @param inDTO
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removeCustGroupById(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = custGroupManageParam.removeCustGroupByIdInParam(inDTO);
			Map<String,Object> outParam = custGroupManageEntity.removeCustGroupById(inParam);
			standardOutDTO = custGroupManageParam.removeCustGroupByIdOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

	/**
	 * 根据子客户群ID删除父客户群与子客户的关系
	* @date: 2016-11-28 
	* @author: fangyuan_crmpd
	* @title: removeCustGroupRelationById 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removeCustGroupRelationById(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = custGroupManageParam.removeCustGroupRelationByIdInParam(inDTO);
			custGroupManageEntity.removeCustGroupRelationById(inParam);
			standardOutDTO = custGroupManageParam.removeCustGroupRelationByIdOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 删除单个号码
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: removeSingleNoFromCustGroup 
	* @param inDTO
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removeSingleNoFromCustGroup(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = custGroupManageParam.removeSingleNoFromCustGroupInParam(inDTO);
			custGroupManageEntity.removeSingleNoFromCustGroup(inParam);
			standardOutDTO = custGroupManageParam.removeSingleNoFromCustGroupOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
   
	/**
	 * 保存目标客户群信息
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: saveCustGroup 
	* @param inDTO
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveCustGroup(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = custGroupManageParam.saveCustGroupInParam(inDTO);
			Map<String, Object> outParam = custGroupManageEntity.saveCustGroup(inParam);
			standardOutDTO = custGroupManageParam.saveCustGroupOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 保存目标客户群与子客户群关系
	* @date: 2016-11-24 
	* @author: fangyuan_crmpd
	* @title: saveCustGroupRelation 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveCustGroupRelation(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = custGroupManageParam.saveCustGroupRelationInParam(inDTO);
			custGroupManageEntity.saveCustGroupRelation(inParam);
			standardOutDTO = custGroupManageParam.saveCustGroupRelationOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
}
