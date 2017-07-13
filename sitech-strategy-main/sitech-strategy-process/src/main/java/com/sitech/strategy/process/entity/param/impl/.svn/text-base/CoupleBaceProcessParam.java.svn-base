package com.sitech.strategy.process.entity.param.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.JsonUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.process.base.BaseProcessEntity;
import com.sitech.strategy.process.base.basedto.StandardOutDTO;
import com.sitech.strategy.process.entity.param.inter.ICoupleBackProcessParam;

/**
 * 实时反馈服务参数处理
* @date: 2016-11-28 
* @author: sunliang 
* @title: CoupleBaceProcessParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class CoupleBaceProcessParam extends BaseProcessEntity implements
		ICoupleBackProcessParam {
	
	/**
	 * 用户查询
	 */
	protected IDataSelector.IUserSelector userSelector;

	/**
	 * 
	* @date: 2016-12-9 
	* @author: sunliang 
	* @title: setUserSelector 
	* @param userSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setUserSelector(IDataSelector.IUserSelector userSelector) {
		this.userSelector = userSelector;
	}

	/**
	 * 实时回单反馈服务入参处理
	* @date: 2016-11-28 
	* @author: sunliang 
	* @title: realReceiptRecordInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> realReceiptRecordInParam(InDTO inDTO) throws StrategyError{
		MBean mbean = inDTO.getMbean();
		Map<String,Object> map = (Map<String,Object>)mbean.getBody();
		Map<String,String> commonMap = (Map<String,String>)map.get("COMMON_INFO");
		System.out.println("==========CoupleBackReceiverParam.receiveCoupleBackInParam.map=========" + map);
		
		String numType = CommonUtils.objectIsNull(map.get("NUM_TYPE")) ? "" : (String)map.get("NUM_TYPE");
		String numValue = CommonUtils.objectIsNull(map.get("NUM_VALUE")) ? "" : (String)map.get("NUM_VALUE");
		log.info("receiveCoupleBackInParam.numType", numType);
		log.info("receiveCoupleBackInParam.numValue", numValue);
		String idNos = userSelector.selectIdNoByServiceNo(numValue+numType);
		log.info("receiveCoupleBackInParam.idNos", idNos);
		
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("callTime", new Date());
		inParam.put("serviceName", "realReceiptRecord");
		inParam.put("systemId", CommonUtils.objectIsNull(commonMap.get("SYSTEM_ID")) ? "" : commonMap.get("SYSTEM_ID"));
		inParam.put("titleType", CommonUtils.objectIsNull(map.get("TITLE_TYPE")) ? "" : map.get("TITLE_TYPE"));
		inParam.put("seqId", CommonUtils.objectIsNull(map.get("SEQ_ID")) ? "" : map.get("SEQ_ID"));
		inParam.put("channelId", CommonUtils.objectIsNull(map.get("CHANNEL_ID")) ? "" : map.get("CHANNEL_ID"));
		inParam.put("operNo", CommonUtils.objectIsNull(map.get("OPER_NO")) ? "" : map.get("OPER_NO"));
		inParam.put("operName", CommonUtils.objectIsNull(map.get("OPER_NAME")) ? "" : map.get("OPER_NAME"));
		inParam.put("regionCode", CommonUtils.objectIsNull(map.get("REGION_CODE")) ? "" : map.get("REGION_CODE"));
		inParam.put("numType", numType);
		inParam.put("numValue", numValue);
		inParam.put("idNos", idNos);
		inParam.put("methodCode", CommonUtils.objectIsNull(map.get("METHOD_CODE")) ? "" : map.get("METHOD_CODE"));
		inParam.put("contactFlag", CommonUtils.objectIsNull(map.get("CONTACT_FLAG")) ? "" : map.get("CONTACT_FLAG"));
		inParam.put("statusCode", CommonUtils.objectIsNull(map.get("STATUS_CODE")) ? "" : map.get("STATUS_CODE"));
		inParam.put("operTime", CommonUtils.objectIsNull(map.get("OPER_TIME")) ? "" : map.get("OPER_TIME"));
		inParam.put("resultsCode", CommonUtils.objectIsNull(map.get("RESULTS_CODE")) ? "" : map.get("RESULTS_CODE"));
		inParam.put("acceptCode", CommonUtils.objectIsNull(map.get("ACCEPT_CODE")) ? "" : map.get("ACCEPT_CODE"));
		inParam.put("note", CommonUtils.objectIsNull(map.get("NOTE")) ? "" : map.get("NOTE"));
		
		List<Map<String,String>> newPositionList = new ArrayList<Map<String,String>>();
		if(!CommonUtils.objectIsNull(map.get("POSITION_INFO_LIST"))){
			List<Map<String,String>> positionList = (List<Map<String,String>>)map.get("POSITION_INFO_LIST");
			for(Map<String,String> positionMap : positionList){
				Map<String,String> newPositionMap = new HashMap<String,String>();
				newPositionMap.put("positionId", CommonUtils.objectIsNull(positionMap.get("POSITION_ID")) ? "" : positionMap.get("POSITION_ID"));
				newPositionMap.put("taskId", CommonUtils.objectIsNull(positionMap.get("TASK_ID")) ? "" : positionMap.get("TASK_ID"));
				newPositionMap.put("actId", CommonUtils.objectIsNull(positionMap.get("ACT_ID")) ? "" : positionMap.get("ACT_ID"));
				newPositionList.add(newPositionMap);
			}
		}
		inParam.put("positionList", newPositionList);
		
		System.out.println("==========CoupleBackReceiverParam.receiveCoupleBackInParam.inParam=========" + inParam);
		return inParam;
	}

	/**
	 * 实时回单反馈服务出参处理
	* @date: 2016-11-28 
	* @author: sunliang 
	* @title: realReceiptRecordInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO realReceiptRecordOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);		
		return standardOutDTO;
	}

	/** 
	* @date: 2016-12-26 
	* @author: wangpei
	* @title: recommonedTaskCloseInParam 
	* @param inDTO
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public Map<String, Object> recommonedTaskCloseInParam(InDTO inDTO)
			throws StrategyError {
		MBean mbean = inDTO.getMbean();
		Map<String,Object> map = (Map<String,Object>)mbean.getBody();
		return map;
	}

	/** 
	* @date: 2016-12-26 
	* @author: wangpei
	* @title: recommonedTaskCloseOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public StandardOutDTO recommonedTaskCloseOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);		
		return standardOutDTO;
	}

}
