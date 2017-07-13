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
import com.sitech.strategy.manage.entity.inter.IContentManageEntity;
import com.sitech.strategy.manage.entity.param.inter.IContentManageParam;
import com.sitech.strategy.manage.service.jcf.inter.IContentManageService;

/**
 * 内容
* @date: 2016-9-5 
* @author: sunliang
* @title: ContentManageService 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "queryContentDetailByDetailId", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryMarketTermTemp", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryProdList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryQuestionNaireList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryQuestionNaireById", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removePositionAndContent", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveContentInfoForEventOrChannel", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveContentInfoByPosition", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveMarketTermTemp", oc = StandardOutDTO.class)
})
public class ContentManageService extends BaseManageService implements IContentManageService{
	
	/**
	 * 内容入参转换对象
	 */
	protected IContentManageParam contentManageParam;
	/**
	 * 内容对象
	 */
	protected IContentManageEntity contentManageEntity;

	/** 
	 * @date: 2016-9-15 
	 * @author: xiongxq
	 * @Title: setContentManageParam 
	 * @param contentManageParam the contentManageParam to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setContentManageParam(IContentManageParam contentManageParam) {
		this.contentManageParam = contentManageParam;
	}

	/**
	 * 
	* @date: 2016-9-5 
	* @author: fangyuan_crmpd
	* @title: setContentManageEntity 
	* @param contentManageEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setContentManageEntity(IContentManageEntity contentManageEntity) {
		this.contentManageEntity = contentManageEntity;
	}

	/** 
	* @date: 2016-10-18 
	* @author: wangpei
	* @title: queryContentDetailByDetailId 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public OutDTO queryContentDetailByDetailId(InDTO inDTO) {
		StandardOutDTO standardOutDTO = null;

		try {
			
			Map<String,Object> inParam = contentManageParam.queryContentDetailBydetailIdInParam(inDTO);
			Map<String,Object> outParam = contentManageEntity.queryContentDetailByDetailId(inParam);
			standardOutDTO = contentManageParam.queryContentDetailBydetailIdOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

	/**
	 * 查询营销用语模板
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: queryMarketTermTemp 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryMarketTermTemp(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			
			Map<String,Object> inParam = contentManageParam.queryMarketTermTempInParam(inDTO);
			Map<String,Object> outParam = contentManageEntity.queryMarketTermTempList(inParam);
			standardOutDTO = contentManageParam.queryMarketTermTempOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 查询产品列表
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: queryProdList 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryProdList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			
			Map<String,Object> inParam = contentManageParam.queryProdListInParam(inDTO);
			Map<String,Object> outParam = contentManageEntity.queryProdList(inParam);
			standardOutDTO = contentManageParam.queryProdListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 * 查询问卷调查列表
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: queryQuestionNaireList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryQuestionNaireList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			
			Map<String,Object> inParam = contentManageParam.queryQuestionNaireListInParam(inDTO);
			Map<String,Object> outParam = contentManageEntity.queryQuestionNaireList(inParam);
			standardOutDTO = contentManageParam.queryQuestionNaireListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	/**
	 * 根据主键查询问卷调查信息
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: queryQuestionNaireById 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryQuestionNaireById(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			
			Map<String,Object> inParam = contentManageParam.queryQuestionNaireByIdInParam(inDTO);
			Map<String,Object> outParam = contentManageEntity.queryQuestionNaireById(inParam);
			standardOutDTO = contentManageParam.queryQuestionNaireByIdOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}	
	/** 
	* @date: 2016-10-18 
	* @author: wangpei
	* @title: removePositionAndContent 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public OutDTO removePositionAndContent(InDTO inDTO) {
		StandardOutDTO standardOutDTO = null;

		try {
			
			Map<String,Object> inParam = contentManageParam.removeContentAndPositionInParam(inDTO);
			contentManageEntity.removePositionAndContent(inParam);
			standardOutDTO = contentManageParam.removeContentAndPositionOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/** 
	* @date: 2016-10-18 
	* @author: wangpei
	* @title: saveContentInfoByPosition 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public OutDTO saveContentInfoByPosition(InDTO inDTO) {
		StandardOutDTO standardOutDTO = null;

		try {
			
			Map<String,Object> inParam = contentManageParam.saveContentInfoByPositionInParam(inDTO);
			Map<String,Object> outParam = contentManageEntity.saveContentInfoByPosition(inParam);
			standardOutDTO = contentManageParam.saveContentInfoByPositionOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 * 事件或渠道下的运营位信息保存
	* @date: 2017-2-23 
	* @author: zhangyw_crmpd
	* @title: saveContentInfoForEventOrChannel 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveContentInfoForEventOrChannel(InDTO inDTO) {
		StandardOutDTO standardOutDTO = null;

		try {
			
			Map<String,Object> inParam = contentManageParam.saveContentInfoForEventOrChannelInParam(inDTO);
			Map<String,Object> outParam = contentManageEntity.saveContentInfoForEventOrChannel(inParam);
			standardOutDTO = contentManageParam.saveContentInfoByPositionOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 * 保存营销用语模板 
	* @date: 2016-9-5 
	* @author: xiongxq
	* @Title: saveMarketTermTemp 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveMarketTermTemp(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			
			Map<String,Object> inParam = contentManageParam.saveMarketTermTempInParam(inDTO);
			contentManageEntity.saveMarketTermTemp(inParam);
			standardOutDTO = contentManageParam.saveMarketTermTempOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
}
