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
import com.sitech.strategy.manage.entity.inter.ICommonManageEntity;
import com.sitech.strategy.manage.entity.param.inter.ICommonManageParam;
import com.sitech.strategy.manage.service.jcf.inter.ICommonManageService;

/**
 * 公用服务
* @date: 2016-9-5 
* @author: sunliang
* @title: CommonManageService 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "queryCodeNameList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "getSequence", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "sendMessageTest", oc = StandardOutDTO.class)
})
public class CommonManageService extends BaseManageService implements ICommonManageService {
	
	/**
	 * 公共对象
	 */
	protected ICommonManageEntity commonManageEntity; 
	/**
	 * 公共对象参数转换
	 */
	protected ICommonManageParam commonManageParam;
	
	/** 
	 * @date: 2016-10-24 
	 * @author: wangpei
	 * @title: setCommonManageParam 
	 * @param commonManageParam the commonManageParam to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setCommonManageParam(ICommonManageParam commonManageParam) {
		this.commonManageParam = commonManageParam;
	}

	/**
	 * 
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: setCommonManageEntity 
	* @param commonEntity 
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCommonManageEntity(ICommonManageEntity commonManageEntity) {
		this.commonManageEntity = commonManageEntity;
	}

	/**
	 *  查询codeName
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: queryCodeName 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryCodeNameList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = commonManageParam.queryCodeNameListInParam(inDTO);
			Map<String,Object> outParam = commonManageEntity.queryCodeNameList(inParam);
			standardOutDTO = commonManageParam.queryCodeNameListOutParam(outParam);
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 获取序列
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getSequence 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO getSequence(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			Map<String,Object> inParam  = commonManageParam.getSequenceInParam(inDTO);
			Map<String,Object> outParam = commonManageEntity.getSequence(inParam);
			standardOutDTO = commonManageParam.getSequenceOutParam(outParam);
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
			
		}
		
		return standardOutDTO;	
	}

	/**
	 * 发送消息测试
	* @date: 2017-3-8 
	* @author: tangaq
	* @title: sendMessageTest 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO sendMessageTest(InDTO inDTO) {
	StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = commonManageParam.sendMessageTestInParam(inDTO);
			Map<String,Object> outParam = commonManageEntity.sendMessageTest(inParam);
			standardOutDTO = commonManageParam.sendMessageTestOutParam(outParam);
			
		} catch (StrategyError e) {
				e.printStackTrace();
				e.processExcepByJCF();
				
			}
			
			return standardOutDTO;	
	}
	
}
