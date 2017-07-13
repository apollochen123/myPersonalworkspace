package com.sitech.strategy.manage.entity.param.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.IActDemandManageParam;

/**
 * 活动需求对象
* @date: 2016-10-20 
* @author: wangth
* @Title: ActDemandManageParam 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public class ActDemandManageParam implements IActDemandManageParam {
	
	/**
	 * 查询活动需求列表入参
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: queryActDemandListInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryActDemandListInParam(InDTO inDTO)  throws StrategyError{
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_ACT);
		outMap.put("sortFlag", inMap.get("SORT_FLAG"));
		outMap.put("sortField", inMap.get("SORT_FIELD"));
		outMap.put("queryId", inMap.get("QUERY_ID"));
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("keyWords", inMap.get("KEY_WORDS"));
		outMap.put("actClass", inMap.get("ACT_CLASS"));
		outMap.put("actType", inMap.get("ACT_TYPE"));
		outMap.put("statusCode", inMap.get("STATUS_CODE"));
		outMap.put("startTime", inMap.get("START_TIME"));
		outMap.put("endTime", inMap.get("END_TIME"));
		
		
		if(CommonUtils.objectIsNull(inMap.get("ACT_DEMAND_START_DATA")) == false){
			Timestamp operTimeStart = DateUtil.string2Timestamp(this.timeConvert((String)inMap.get("ACT_DEMAND_START_DATA")), DateUtil.TIME_FROMAT_SIMPLE1);
			outMap.put("actDemandStartDate", operTimeStart);
			}
		
		if(CommonUtils.objectIsNull(inMap.get("ACT_DEMAND_END_DATA")) == false){
			Timestamp operTimeEnd = DateUtil.string2Timestamp(this.timeConvert((String)inMap.get("ACT_DEMAND_END_DATA")), DateUtil.TIME_FROMAT_SIMPLE1);
			outMap.put("actDemandEndDate", operTimeEnd);
			}
		return outMap;
	}
	
	/**
	 * 查询活动列表出参
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: queryActDemandListOutParam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryActDemandListOutParam(
			Map<String, Object> outParam) {
		return settleActDemandListOutParams(outParam);
	}
	
	/**
	 * 查询活动需求详细信息入参
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: queryActDemandDetailInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryActDemandDetailInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("serialId", inMap.get("SERIAL_ID"));
		return outMap;
	}
	
	/**
	 * 查询活动需求详细信息出参
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: queryActDemandDetailOutParam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryActDemandDetailOutParam(
			Map<String, Object> outParam) {
		return settleActDemandDetailOutParams(outParam);
	}
	
	/**
	 * 移除活动需求入参
	* @date: 2016-10-21 
	* @author: wangth
	* @Title: removeActDemandInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> removeActDemandInParam(InDTO inDTO) {
		MBean inMbean = inDTO.getMbean();
		Map<String,Object> inMap = inMbean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("serialId",inMap.get("SERIAL_ID"));
		return outMap;
	}
	
	/**
	 * 移除活动需求出参
	* @date: 2016-10-21 
	* @author: wangth
	* @Title: removeActDemandOutParam 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO removeActDemandOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;	
	}
	
	/**
	 *保存活动需求入参
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: saveActDemandInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveActDemandInParam(InDTO inDTO) {
		MBean inMbean = inDTO.getMbean();
		Map<String,Object> inMap = inMbean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("actName",inMap.get("ACT_NAME"));
		outMap.put("actType",inMap.get("ACT_TYPE"));
		outMap.put("actClass",inMap.get("ACT_CLASS"));
		outMap.put("startTime",inMap.get("START_TIME"));
		outMap.put("endTime",inMap.get("END_TIME"));
		outMap.put("actDesc",inMap.get("ACT_DESC"));
		outMap.put("actTarget",inMap.get("ACT_TARGET"));
		outMap.put("targetUserDesc",inMap.get("TARGETUSER_DESC"));
		outMap.put("targerFileName",inMap.get("TARGETFILE_NAME"));
		outMap.put("tfSystemName",inMap.get("TF_SYSTEM_NAME") );
		outMap.put("policyDesc",inMap.get("POLICY_DESC"));
		outMap.put("policyFileName",inMap.get("POLICYFILE_NAME"));
		outMap.put("pfSystemName",inMap.get("PF_SYSTEM_NAME") );
		outMap.put("channelId",inMap.get("CHANNEL_ID"));
		outMap.put("channelRuleDesc",inMap.get("CHANNELRULE_DESC"));
		outMap.put("workOrdercloseDesc",inMap.get("WORKORDERCLOSE_DESC"));
		outMap.put("workOrderCloseFileName",inMap.get("WORKORDERCLOSEFILE_NAME"));
		outMap.put("wfSystemName",inMap.get("WF_SYSTEM_NAME") );
		outMap.put("assessRuleDesc",inMap.get("ASSESSRULE_DESC"));
		outMap.put("assessRuleFileName",inMap.get("ASSESSRULEFILE_NAME"));
		outMap.put("rufSystemName",inMap.get("RUF_SYSTEM_NAME"));
		outMap.put("assessReportFileName",inMap.get("ASSESSREPORTFILE_NAME"));
		outMap.put("refSystemName",inMap.get("REPF_SYSTEM_NAME") );
		outMap.put("operNo",inMap.get("OPER_NO"));
		outMap.put("operName",inMap.get("OPER_NAME"));
		outMap.put("groupId",inMap.get("GROUP_ID"));
		outMap.put("groupName",inMap.get("GROUP_NAME"));
		outMap.put("statusCode",inMap.get("STATUS_CODE"));
		return outMap;
	}
	
	/**
	 *保存 活动需求出参
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: saveActDemandOutParam 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveActDemandOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;	
	}
	
	/**
	 * 更新活动需求入参
	* @date: 2016-10-21 
	* @author: wangth
	* @Title: updateActDemandInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> updateActDemandInParam(InDTO inDTO) {
		MBean inMbean = inDTO.getMbean();
		Map<String,Object> inMap = inMbean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("serialId", inMap.get("SERIAL_ID"));
		outMap.put("actName",inMap.get("ACT_NAME"));
		outMap.put("actType",inMap.get("ACT_TYPE"));
		outMap.put("actClass",inMap.get("ACT_CLASS"));
		outMap.put("startTime",inMap.get("START_TIME"));
		outMap.put("endTime",inMap.get("END_TIME"));
		outMap.put("actDesc",inMap.get("ACT_DESC"));
		outMap.put("actTarget",inMap.get("ACT_TARGET"));
		outMap.put("targetUserDesc",inMap.get("TARGETUSER_DESC"));
		outMap.put("targerFileName",inMap.get("TARGETFILE_NAME"));
		outMap.put("tfSystemName",inMap.get("TF_SYSTEM_NAME") );
		outMap.put("policyDesc",inMap.get("POLICY_DESC"));
		outMap.put("policyFileName",inMap.get("POLICYFILE_NAME"));
		outMap.put("pfSystemName",inMap.get("PF_SYSTEM_NAME") );
		outMap.put("channelId",inMap.get("CHANNEL_ID"));
		outMap.put("channelRuleDesc",inMap.get("CHANNELRULE_DESC"));
		outMap.put("workOrdercloseDesc",inMap.get("WORKORDERCLOSE_DESC"));
		outMap.put("workOrderCloseFileName",inMap.get("WORKORDERCLOSEFILE_NAME"));
		outMap.put("wfSystemName",inMap.get("WF_SYSTEM_NAME") );
		outMap.put("assessRuleDesc",inMap.get("ASSESSRULE_DESC"));
		outMap.put("assessRuleFileName",inMap.get("ASSESSRULEFILE_NAME"));
		outMap.put("rufSystemName",inMap.get("RUF_SYSTEM_NAME"));
		outMap.put("assessReportFileName",inMap.get("ASSESSREPORTFILE_NAME"));
		outMap.put("refSystemName",inMap.get("REPF_SYSTEM_NAME") );
		outMap.put("operNo",inMap.get("OPER_NO"));
		outMap.put("operName",inMap.get("OPER_NAME"));
		outMap.put("groupId",inMap.get("GROUP_ID"));
		outMap.put("groupName",inMap.get("GROUP_NAME"));
		outMap.put("statusCode",inMap.get("STATUS_CODE"));
		return outMap;
	}
	
	/**
	 * 更新活动需求出参
	* @date: 2016-10-21 
	* @author: wangth
	* @Title: updateActDemandOutParam 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO updateActDemandOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;	
	}
	
	/**
	 * 处理活动需求列表出参参数
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: settleActDemandListOutParams 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected StandardOutDTO settleActDemandListOutParams(Map<String,Object> outParam){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> actDemandList = (List<Map<String,Object>>)outParam.get("actDemandList");
		List<Map<String,Object>> actDemandNewList = new ArrayList<Map<String,Object>>();
		
		if(!CommonUtils.objectIsNull(actDemandList)){
			for(Map<String,Object> map :actDemandList){
				Map<String,Object> noMap = new HashMap<String,Object>();
				noMap.put("SERIAL_ID", map.get("serialId"));
				noMap.put("ACT_NAME",map.get("actName"));
				noMap.put("ACT_TYPE",map.get("actType"));
				noMap.put("ACT_CLASS",map.get("actClass"));
				noMap.put("MARKET_CASE_LEVEL",map.get("marketCaseLevel"));
				noMap.put("MARKET_CASE_TYPE",map.get("marketCaseType"));

				if(CommonUtils.objectIsNull(map.get("startTime")) == false){
					noMap.put("START_TIME",DateUtil.stringToString((String)map.get("startTime"), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2));
				}
				if(CommonUtils.objectIsNull(map.get("endTime")) == false){
					noMap.put("END_TIME",DateUtil.stringToString((String)map.get("endTime"), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2));
				}
				noMap.put("ACT_DESC",map.get("actDesc"));
				noMap.put("ACT_TARGET", map.get("actTarget"));
				noMap.put("TARGETUSER_DESC", map.get("targetUserDesc"));
				noMap.put("POLICY_DESC", map.get("policyDesc"));
				noMap.put("CHANNEL_ID", map.get("channelId"));
				noMap.put("CHANNELRULE_DESC", map.get("channelRuleDesc"));
				noMap.put("WORKORDERCLOSE_DESC", map.get("workOrdercloseDesc"));
				noMap.put("ASSESSRULE_DESC", map.get("assessRuleDesc"));
				noMap.put("OPER_NO",map.get("operNo"));
				noMap.put("OPER_NAME",map.get("operName"));
				noMap.put("OPER_TIME",map.get("operTime"));
				noMap.put("GROUP_ID",map.get("groupId"));
				noMap.put("GROUP_NAME",map.get("groupName"));
				noMap.put("STATUS_CODE",map.get("statusCode"));
				actDemandNewList.add(noMap);
			}
		}
		outMap.put("ACTDEMAND_LIST", actDemandNewList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		outBean.setBody(outMap);
		
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 处理活动需求详细信息出参参数
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: settleActDemandOutParams 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected StandardOutDTO settleActDemandDetailOutParams(Map<String,Object> outParam){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> noMap = new HashMap<String,Object>();
		List<Map<String,Object>> attachList = (List<Map<String,Object>>)outParam.get("attachList");
		List<Map<String,Object>> attachNewList = new ArrayList<Map<String,Object>>();
		if(CommonUtils.objectIsNull(attachList)==false){
			for(Map<String,Object> inMap:attachList){
				Map<String,Object> outMap = new HashMap<String,Object>();
				outMap.put("OPER_DATE", inMap.get("operDate"));
				outMap.put("ATTACH_TYPE", inMap.get("attachType"));
				outMap.put("BUSI_ID", inMap.get("busiId"));
				outMap.put("ATTACH_NAME", inMap.get("attachName"));
				outMap.put("BUSI_TYPE", inMap.get("busiType"));
				outMap.put("SERIAL_ID", inMap.get("serialId"));
				outMap.put("OPER_NAME", inMap.get("operName"));
				outMap.put("SYSTEM_NAME", inMap.get("systemName"));
				outMap.put("OPER_TIME", inMap.get("operTime"));
				outMap.put("OPER_NO", inMap.get("operNo"));
				outMap.put("NOTE", inMap.get("note"));
				attachNewList.add(outMap);
			}
			
			
		}
		
		
		
		noMap.put("SERIAL_ID", outParam.get("serialId"));
		noMap.put("ACT_TYPE",outParam.get("actType"));
		noMap.put("ACT_CLASS",outParam.get("actClass"));
		noMap.put("ACT_NAME", outParam.get("actName"));
		noMap.put("START_TIME",DateUtil.stringToString((String)outParam.get("startTime"), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2));
		noMap.put("END_TIME",DateUtil.stringToString((String)outParam.get("endTime"), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2));
		noMap.put("ACT_TARGET",outParam.get("actTarget"));
		noMap.put("TARGETUSER_DESC",outParam.get("targetUserDesc"));
		noMap.put("POLICY_DESC",outParam.get("policyDesc"));
		noMap.put("CHANNEL_ID",outParam.get("channelId"));
		noMap.put("POLICY_DESC", outParam.get("policyDesc"));
		noMap.put("CHANNELRULE_DESC",outParam.get("channelRuleDesc"));
		noMap.put("WORKORDERCLOSE_DESC",outParam.get("workOrdercloseDesc"));
		noMap.put("ASSESSRULE_DESC",outParam.get("assessRuleDesc"));
		noMap.put("ACT_DESC",outParam.get("actDesc"));
		noMap.put("MARKET_CASE_LEVEL",outParam.get("marketCaseLevel"));
		noMap.put("MARKET_CASE_TYPE",outParam.get("marketCaseType"));
		
		noMap.put("OPER_NO",outParam.get("operNo"));
		noMap.put("OPER_NAME",outParam.get("operName"));
		noMap.put("OPER_TIME",outParam.get("operTime"));
		noMap.put("GROUP_ID",outParam.get("groupId"));
		noMap.put("STATUS_CODE",outParam.get("statusCode"));
		noMap.put("ATTACHLIST",attachNewList);
		outBean.setBody("ACT_MAP",noMap);
		
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	  * 时间参数的转换
	* @date: 2016-9-21 
	* @author: tangaq
	* @Title: timeConvert 
	* @param time
	* @return inParamTime
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected String timeConvert(String inParamTime){
		if(inParamTime.indexOf(":")<Integer.valueOf(Const.FLASE_INT)){
			return inParamTime+" 00:00:00";
		}
		return inParamTime;
	}
}
