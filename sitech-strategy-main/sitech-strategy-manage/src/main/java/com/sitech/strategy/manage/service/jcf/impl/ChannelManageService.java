package com.sitech.strategy.manage.service.jcf.impl;


import java.util.List;
import java.util.Map;

import com.sitech.jcfx.anno.ParamType;
import com.sitech.jcfx.anno.ParamTypes;
import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.BaseManageService;
import com.sitech.strategy.manage.base.basedto.StandardInDTO;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.inter.IChannelManageEntity;
import com.sitech.strategy.manage.entity.param.inter.IChannelManageParam;
import com.sitech.strategy.manage.service.jcf.inter.IChannelManageService;

/**
 * 渠道
* @date: 2016-9-5 
* @author: sunliang
* @title: ChannelManageService 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({	
	@ParamType(c = StandardInDTO.class, m = "queryChannelList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryChannelShowList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryPositionListByChannel", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryPositionAttrList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryPositionList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeCustGroupChannelAndDetail", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeChannelShow", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removePosition", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "savePosition", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "savePositionAttr", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveChannel", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveChannelShow", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updatePosition", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateChannelShow", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateChannelInfo", oc = StandardOutDTO.class)

})
public class ChannelManageService extends BaseManageService implements IChannelManageService {
	
	/**删除客户群下渠道及明细
	 * 渠道对象
	 */
	protected IChannelManageEntity channelManageEntity;
	/**
	 * 参数对象
	 */
	protected IChannelManageParam channelManageParam;
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: fangyuan_crmpd
	* @title: setChannelManageEntity 
	* @param channelEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannelManageEntity(IChannelManageEntity channelManageEntity) {
		this.channelManageEntity = channelManageEntity;
	}
	
	/**
	 * 
	* @date: 2016-9-15 
	* @author: fangyuan_crmpd
	* @title: setChannelManageParam 
	* @param channelManageParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannelManageParam(IChannelManageParam channelManageParam) {
		this.channelManageParam = channelManageParam;
	}
	
	/**
	 * 查询渠道列表
	* @date: 2016-9-22 
	* @author: fangyuan_crmpd
	* @title: queryChannelList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryChannelList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
	
		try {
			
			Map<String,Object> inParam  = channelManageParam.queryChannelListInParam(inDTO);
			List<Map<String,Object>> outParam = channelManageEntity.queryChannelList(inParam);
			standardOutDTO = channelManageParam.queryChannelListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 查询渠道显示列表
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: queryChannelShowList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryChannelShowList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			
			Map<String,Object> inParam = channelManageParam.queryChannelShowListInParam(inDTO);
			Map<String,Object> outParam = channelManageEntity.queryChannelShowList(inParam);
			standardOutDTO = channelManageParam.queryChannelShowListOutParam(outParam);;
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 查询运营位
	* @date: 2016-9-22 
	* @author: fangyuan_crmpd
	* @title: queryPositionListByChannel 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryPositionListByChannel(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = channelManageParam.positionListByChannelInParam(inDTO);
			Map<String,Object> outParam= channelManageEntity.queryPositionListByChannel(inParam);
			standardOutDTO = channelManageParam.positionListByChannelOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 * 查询运营位列表
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: queryPositionList 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryPositionList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			
			Map<String,Object> inParam = channelManageParam.queryPositionListInParam(inDTO);
			Map<String,Object> outParam  =channelManageEntity.queryPositionList(inParam);
 			standardOutDTO = channelManageParam.queryPositionListOutParam(outParam);		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 查询运营位属性列表
	* @date: 2016-10-31 
	* @author: wangth
	* @Title: queryPositionAttrList 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryPositionAttrList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam = channelManageParam.positionAttrInparam(inDTO);
			Map<String,Object> outParam  =channelManageEntity.queryPositionAttrList(inParam);
 			standardOutDTO = channelManageParam.positionAttrOutParam(outParam);		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;	
	}
	
	/** 
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: removeCustGroupChannelAndDetail 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO removeCustGroupChannelAndDetail(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			
			Map<String,Object> inParam = channelManageParam.removeCustGroupChannelInParam(inDTO);
			channelManageEntity.removeCustGroupChannelAndDetail(inParam);
			standardOutDTO = channelManageParam.removeCustGroupChannelOutParam();;
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 删除渠道显示
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: removeChannelShow 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removeChannelShow(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			
			Map<String,Object> inParam = channelManageParam.removeChannelShowInParam(inDTO);
			channelManageEntity.removeChannelShow(inParam);
			standardOutDTO = channelManageParam.removeChannelShowOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 * 移除运营位
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: removePosition 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removePosition(InDTO inDTO) {
		StandardOutDTO standardOutDTO = null;
		try {
			
			Map<String,Object> inParam = channelManageParam.removePositionInParam(inDTO);
			channelManageEntity.removePosition(inParam);
			standardOutDTO = channelManageParam.removeChannelShowOutParam();
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 * 移除运营位属性
	* @date: 2016-10-31 
	* @author: wangth
	* @Title: removePositionAttr 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removePositionAttr(InDTO inDTO) {
		StandardOutDTO standardOutDTO = null;
		try {
			
			Map<String,Object> inParam = channelManageParam.removePositionAttrInParam(inDTO);
			channelManageEntity.removePositionAttr(inParam);
			standardOutDTO = channelManageParam.removePositionAttrOutParam();
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 新增渠道配置
	* @date: 2016-9-27 
	* @author: fangyuan_crmpd
	* @title: saveChannel 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO saveChannel(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = channelManageParam.saveChannelInParam(inDTO);
			channelManageEntity.saveChannel(inParam);
			standardOutDTO = channelManageParam.saveChannelOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
		
		return standardOutDTO;
	}

	/**
	 * 新增渠道显示	
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: saveChannelShow 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveChannelShow(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			
			Map<String,Object> inParam = channelManageParam.saveChannelShowInParam(inDTO);
			channelManageEntity.saveChannelShow(inParam);
			standardOutDTO = channelManageParam.saveChannelShowOutParam();;
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 * 添加运营位
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: savePosition 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO savePosition(InDTO inDTO) {
		StandardOutDTO standardOutDTO = null;
		try {
			
			Map<String,Object> inParam = channelManageParam.savePositionInParam(inDTO);
			channelManageEntity.savePosition(inParam);
			standardOutDTO = channelManageParam.saveChannelShowOutParam();
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 * 保存运营位属性
	* @date: 2016-10-31 
	* @author: wangth
	* @Title: savePositionAttr 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO savePositionAttr(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			
			Map<String,Object> inParam = channelManageParam.positionAttrInparam(inDTO);
			channelManageEntity.savePositionAttr(inParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		standardOutDTO.setBean(new MBean());
		return standardOutDTO;	
	}
	
	/**
	 * 更新渠道信息
	* @date: 2016-11-17 
	* @author: tangaq
	* @title: updateChannelInfo 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO updateChannelInfo(InDTO inDTO){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			
			Map<String,Object> inParam = channelManageParam.updateChannelInfoInParam(inDTO);
			channelManageEntity.updateChannelInfo(inParam);
			standardOutDTO = channelManageParam.updateChannelInfoOutParam();
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		standardOutDTO.setBean(new MBean());
		return standardOutDTO;	
	}
	
	/**
	 * 更新渠道显示
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: updateChannelShow 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO updateChannelShow(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			
			Map<String,Object> inParam = channelManageParam.updateChannelShowInParam(inDTO);
			channelManageEntity.updateChannelShow(inParam);
			standardOutDTO = channelManageParam.updateChannelShowOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 * 更新运营位
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: updatePosition 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO updatePosition(InDTO inDTO) {
		StandardOutDTO standardOutDTO = null;
		try {
			Map<String,Object> inParam = channelManageParam.updatePositionInParam(inDTO);
			channelManageEntity.updatePosition(inParam);
			standardOutDTO = channelManageParam.updateChannelShowOutParam();
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 更新运营位属性信息
	* @date: 2016-10-31 
	* @author: wangth
	* @Title: updatePositionAttr 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO updatePositionAttr(InDTO inDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
