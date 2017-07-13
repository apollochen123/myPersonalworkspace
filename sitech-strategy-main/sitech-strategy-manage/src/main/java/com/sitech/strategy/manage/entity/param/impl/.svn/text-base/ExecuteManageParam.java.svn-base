package com.sitech.strategy.manage.entity.param.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.IExecuteManageParam;

public class ExecuteManageParam extends BaseManageEntity implements IExecuteManageParam {
	
	/**
	 * 暂停营销案推荐入参处理
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: addPauseMarketCaseRecommendInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> addPauseMarketCaseRecommendInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> outMap = inBean.getBody();
		return outMap;
	}
	
	/**
	 * 暂停营销案推荐出参处理
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: addPauseMarketCaseRecommendOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO addPauseMarketCaseRecommendOutParam(){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outMbean = new MBean();
		standardOutDTO.setBean(outMbean);
		return standardOutDTO;
	}
	
	/**
	 * 入参处理(营销案补发时，往批量push营销案待发送营销案列表缓存添加补发数据)
	* @date: 2016-11-11 
	* @author: yuanliang
	* @title: addRepairWaitSendBatchPushMarketCaseToCacheInParam 
	* @param inDTO
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> addRepairWaitSendBatchPushMarketCaseToCacheInParam(
			InDTO inDTO) throws StrategyError {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();

		List<Map<String, Object>> waitSendBatchPushMarketCaseList = new ArrayList<Map<String, Object>>();
		
		//需要和补发界面定义一个格式，目前为了先调试定义格式是 多个补发数据之间是逗号为分隔符，每个数据是 营销案ID:YYYYMMDD 的格式。
		String repairMarketCases=(String) inMap.get("REPAIR_MARKET_CASES");
  
		String[] arr=repairMarketCases.split(Const.SEPARATOR_COMMA);
		for(String s:arr){
			String[] tmpArr=s.split(Const.SEPARATOR_COLON);
			String marketCaseId=tmpArr[0];
			String sendDate=tmpArr[1].trim();
			if (!sendDate.matches("\\d{8}")) {
				System.out.println("=============日期:+"+sendDate+" 格式不正确，应该是YYYYMMDD=============");
				throw new StrategyError("","","");
			}
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("marketCaseId", marketCaseId);
			map.put(Const.RULE_CODE_SENDDATE, sendDate);
			
			waitSendBatchPushMarketCaseList.add(map);
		}
			
		outMap.put("repairMarketCases", waitSendBatchPushMarketCaseList);
		
		return outMap;
	}
	
	/**
	 * 出参处理(营销案补发时，往批量push营销案待发送营销案列表缓存添加补发数据)
	* @date: 2016-11-11 
	* @author: yuanliang
	* @title: addRepairWaitSendBatchPushMarketCaseToCacheOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO addRepairWaitSendBatchPushMarketCaseToCacheOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outMbean = new MBean();
		standardOutDTO.setBean(outMbean);
		return standardOutDTO;
	}
	
	/**
	 * 入参处理(营销案测试时，往优先级缓存添加测试数据)
	* @date: 2016-11-7 
	* @author: yuanliang
	* @title: addBatchPushMarketCasePriorityForTestToCacheInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> addTestWaitSendBatchPushMarketCaseToCacheInParam(
			InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		String marketCaseId=(String) inMap.get("MARKET_CASE_ID");
		String tmpSendDate=(String) inMap.get("SEND_DATE");
		String sendDate=DateUtil.stringToString(tmpSendDate, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD1);

		outMap.put("marketCaseId", marketCaseId);		
		outMap.put(Const.RULE_CODE_SENDDATE, sendDate);
		return outMap;
	}

	/**
	 * 出参处理(营销案测试时，往优先级缓存添加测试数据)
	* @date: 2016-11-7 
	* @author: yuanliang
	* @title: addBatchPushMarketCasePriorityForTestToCacheOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO addTestWaitSendBatchPushMarketCaseToCacheOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outMbean = new MBean();
		standardOutDTO.setBean(outMbean);
		return standardOutDTO;
	}
	
	/**
	 * 入参处理（获得补发的营销案）
	* @date: 2016-11-16 
	* @author: yuanliang
	* @title: getRepairWaitSendBatchPushMarketCaseInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getRepairWaitSendBatchPushMarketCaseInParam(
			InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("statusCode", inMap.get("STATUS_CODE"));
		outMap.put("filterDays", inMap.get("FILTER_DAYS"));
		
		
		return outMap;
	}

	/**
	 * 出参处理（获得补发的营销案）
	* @date: 2016-11-16 
	* @author: yuanliang
	* @title: getRepairWaitSendBatchPushMarketCaseOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO getRepairWaitSendBatchPushMarketCaseOutParam(List<Map<String,Object>> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outMbean = new MBean();
		List<Map<String,Object>> marketCaseNewList = new ArrayList<Map<String,Object>>();
        Map<String,Object> outMap = new HashMap<String,Object>();
		
		List<Map<String,Object>> inList = outParam;
		if(CommonUtils.objectIsNull(inList) == false){
			for(Map<String,Object> basic:inList){
				Map<String,Object> marketCaseMap = new HashMap<String,Object>();
			    marketCaseMap.put("MARKET_CASE_ID", basic.get("marketCaseId"));
			    marketCaseMap.put("MARKET_CASE_NAME", basic.get("marketCaseName"));
			    marketCaseMap.put("TOTAL", basic.get("total"));
			    marketCaseMap.put("SEND", basic.get("send"));
			    marketCaseMap.put("REST", basic.get("rest"));
			    marketCaseMap.put("TRIGGER_DAY", basic.get("triggerDay"));

			    marketCaseNewList.add(marketCaseMap);
			}
		}
		
		outMap.put("MARKET_CASE_LIST", marketCaseNewList);
		
		outMbean.setBody(outMap);
		standardOutDTO.setBean(outMbean);
		return standardOutDTO;
	}
	
	/** 
	 * 验证营销案入参处理
	* @date: 2016-10-31 
	* @author: songxj
	* @title: marketCaseVerifyInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> marketCaseVerifyInParam(InDTO inDTO) {
		MBean inParamMbean = inDTO.getMbean();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("marketCaseId", inParamMbean.getBodyStr("MARKET_CASE_ID"));
		inParam.put("msg", inParamMbean.getBodyStr("MSG"));
		inParam.put("phoneNo", inParamMbean.getBodyStr("PHONE_NO"));
		inParam.put("currentDate", inParamMbean.getBodyStr("SEND_DATE"));
		return inParam;
	}

	/** 
	 * 验证营销案出参处理
	* @date: 2016-10-31 
	* @author: songxj
	* @title: marketCaseVerifyOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO marketCaseVerifyOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("MARKET_CASE_ID", outParam.get("marketCaseId"));
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 恢复营销案推荐暂停入参处理
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: recoverMarketCaseRecommendPauseInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> recoverMarketCaseRecommendPauseInParam(
			InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> outMap =  inBean.getBody();
		return outMap;
	}

	/**
	 * 恢复营销案推荐暂停出参处理
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: recoverMarketCaseRecommendPauseOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO recoverMarketCaseRecommendPauseOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outMbean = new MBean();
		standardOutDTO.setBean(outMbean);
		return standardOutDTO;
	}
	
	/**
	 * 插入营销案ID入参处理
	* @date: 2016-12-16 
	* @author: yuanchun
	* @Title: sendMarketIdToCacheInParam 
	* @param inDTO
	* @return outMap
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> sendMarketIdToCacheInParam(InDTO inDTO) throws StrategyError{
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		String serialId = SequenceUtil.getSequence();
		String marketCaseId=(String) inMap.get("MARKET_CASE_ID");
		String tmpSendDate=(String) inMap.get("SEND_DATE");
		String sendDate=DateUtil.stringToString(tmpSendDate, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD1);
		String operNo = (String) inMap.get("OPER_NO"); 
		outMap.put("serialId", serialId);
		outMap.put("marketCaseId", marketCaseId);
		outMap.put("operNo", operNo);
		outMap.put(Const.RULE_CODE_SENDDATE, sendDate);
		return outMap;
	}

	/**
	 * 插入营销案ID出参处理
	* @date: 2016-12-16 
	* @author: yuanchun
	* @Title: sendMarketIdToCacheOutParam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO sendMarketIdToCacheOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;	
	}

}
