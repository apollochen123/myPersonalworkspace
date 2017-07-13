package com.sitech.strategy.process.service.jcf.impl;

import java.util.Map;

import com.sitech.jcfx.anno.ParamType;
import com.sitech.jcfx.anno.ParamTypes;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IMonitor;
import com.sitech.strategy.process.base.BaseProcessService;
import com.sitech.strategy.process.base.basedto.StandardInDTO;
import com.sitech.strategy.process.base.basedto.StandardOutDTO;
import com.sitech.strategy.process.entity.inter.ICoupleBackProcessEntity;
import com.sitech.strategy.process.entity.param.inter.ICoupleBackProcessParam;
import com.sitech.strategy.process.service.jcf.inter.ICoupleBackProcessService;

/**
 * 反馈服务
* @date: 2016-11-28 
* @author: sunliang 
* @title: CoupleBackProcessService 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "realReceiptRecord", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "recommonedTaskClose", oc = StandardOutDTO.class)

})
public class CoupleBackProcessService extends BaseProcessService implements
		ICoupleBackProcessService {
	
	/**
	 * 反馈处理实体
	 */
	protected ICoupleBackProcessEntity coupleBackProcessEntity;
	/**
	 * 反馈处理参数处理实体
	 */
	protected ICoupleBackProcessParam coupleBackProcessParam;
	/**
	 * 监控
	 */
	protected IMonitor monitor;
	/**
	 * 
	* @date: 2016-11-28 
	* @author: sunliang 
	* @title: setCoupleBackProcessEntity 
	* @param coupleBackProcessEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCoupleBackProcessEntity(
			ICoupleBackProcessEntity coupleBackProcessEntity) {
		this.coupleBackProcessEntity = coupleBackProcessEntity;
	}
	
	/**
	 * 
	* @date: 2016-11-28 
	* @author: sunliang 
	* @title: setCoupleBackProcessParam 
	* @param coupleBackProcessParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCoupleBackProcessParam(
			ICoupleBackProcessParam coupleBackProcessParam) {
		this.coupleBackProcessParam = coupleBackProcessParam;
	}
	/** 
	* @date: 2017-3-9 
	* @author: yangyf_crmpd
	* @title: setMonitor 
	* @param monitor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setMonitor(IMonitor monitor) {
		this.monitor = monitor;
	}
	/**
	 * 实时回单
	* @date: 2016-11-28 
	* @author: sunliang 
	* @title: realReceiptRecord 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO realReceiptRecord(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam = coupleBackProcessParam.realReceiptRecordInParam(inDTO);
			coupleBackProcessEntity.receiveCoupleBack(inParam);
			standardOutDTO = coupleBackProcessParam.realReceiptRecordOutParam();
			monitor.addServiceMonitoringToCache(inParam, inDTO.getMbean().toString(), standardOutDTO.getBean().toString());
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;
	}

	/** 任务关闭
	* @date: 2016-12-26 
	* @author: wangpei
	* @title: recommonedTaskClose 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO recommonedTaskClose(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam = coupleBackProcessParam.recommonedTaskCloseInParam(inDTO);
			coupleBackProcessEntity.recommonedTaskClose(inParam);
			standardOutDTO = coupleBackProcessParam.recommonedTaskCloseOutParam();
		} catch (StrategyError e) {
			e.processExcepByJCF();
		}
		return standardOutDTO;
	}

}
