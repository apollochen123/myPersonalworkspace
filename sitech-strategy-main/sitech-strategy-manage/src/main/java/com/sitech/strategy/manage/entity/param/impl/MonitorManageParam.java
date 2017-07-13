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
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.IMonitorManageParam;

/**
 * 监控参数转换
* @date: 2016-9-14 
* @author: fangyuan_crmpd
* @title: MonitorManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class MonitorManageParam implements IMonitorManageParam {
	
	/**
	 * 查询作业运行监控列表入参处理
	* @date: 2016-11-7 
	* @author: fangyuan_crmpd
	* @title: queryWorkOperMonitorListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryWorkOperMonitorListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String, Object> inMap = inBean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("workName", inMap.get("WORK_NAME"));
		String stTime = (String) inMap.get("START_TIME");
		String edTime = (String) inMap.get("END_TIME");
		if(CommonUtils.objectIsNull(stTime) == false){
			  String startTime = DateUtil.stringToString(stTime,DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
			  inParam.put("startTime", startTime);	
		}
		if(CommonUtils.objectIsNull(edTime) == false){
			  String endTime = DateUtil.stringToString(edTime,DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
			  inParam.put("endTime", endTime);	
		}
		inParam.put("queryListType", Const.QUERY_LIST_TYPE_WOM);
		inParam.put("queryId", inMap.get("QUERY_ID"));
		inParam.put("sortFlag", inMap.get("SORT_FLAG"));
		inParam.put("sortField", inMap.get("SORT_FIELD"));
		inParam.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		inParam.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		inParam.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		return inParam;
	}
	
	/**
	 * 查询作业运行监控列表出参处理
	* @date: 2016-11-7 
	* @author: fangyuan_crmpd
	* @title: queryWorkOperMonitorListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryWorkOperMonitorListOutParam(
			Map<String, Object> outParam) {
		List<Map<String, Object>> inList = (List<Map<String, Object>>) outParam.get("queryWorkOperMonitorList");
		List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
		if(CommonUtils.objectIsNull(inList) == false){
			for(Map<String, Object> inMap : inList){
				Map<String, Object> outMap = new HashMap<String, Object>();
				outMap.put("WORK_CODE", inMap.get("workCode"));
				outMap.put("WORK_NAME", inMap.get("workName"));
				String stTime = (String) inMap.get("startTime");
				String edTime = (String) inMap.get("endTime");
				if(CommonUtils.objectIsNull(stTime) == false){
					  String startTime = DateUtil.stringToString(stTime,DateUtil.TIME_FROMAT_SIMPLE3, DateUtil.TIME_FROMAT_SIMPLE1);
					  outMap.put("START_TIME", startTime);	
				}
				if(CommonUtils.objectIsNull(edTime) == false){
					  String endTime = DateUtil.stringToString(edTime,DateUtil.TIME_FROMAT_SIMPLE3, DateUtil.TIME_FROMAT_SIMPLE1);
					  outMap.put("END_TIME", endTime);	
				}
				outMap.put("WORK_PERIOD", inMap.get("workPeriod"));
				outMap.put("WORK_STATUS", inMap.get("workStatus"));
				outList.add(outMap);
			}
		}
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("QUERY_WORK_OPER_MONITOR_LIST", outList);
		map.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		map.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		map.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		map.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		outBean.setBody(map);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 *  根据作业编码查询作业运行告警详细信息入参处理
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: queryWorkOperWarningDetailByWorkCodeInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryWorkOperWarningDetailByWorkCodeInParam(
			InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String, Object> inMap = inBean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("workCode", inMap.get("WORK_CODE"));
		return inParam;
	}
	
	/**
	 * 根据作业编码查询作业运行告警详细信息出参处理
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: queryWorkOperWarningDetailByWorkCodeOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryWorkOperWarningDetailByWorkCodeOutParam(
			Map<String, Object> outParam) {
		Map<String, Object> inMap = (Map<String, Object>) outParam.get("workOperWarningDetailMap");
		Map<String, Object> detailMap = new HashMap<String, Object>();
		detailMap.put("WORK_CODE", inMap.get("workCode"));
		detailMap.put("WORK_STATUS", inMap.get("workStatus"));
		String time = (String) inMap.get("runingTime");
		if(CommonUtils.objectIsNull(time) == false){
			  String runingTimes = DateUtil.stringToString(time,DateUtil.TIME_FROMAT_SIMPLE3, DateUtil.TIME_FROMAT_SIMPLE1);
			  detailMap.put("RUNING_TIME", runingTimes);	
		}
		detailMap.put("MAX_VALUE", inMap.get("maxValue"));
		detailMap.put("MIN_VALUE", inMap.get("minValue"));
		detailMap.put("MONITOR_PHONE_NO", inMap.get("monitorPhoneNo"));
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String, Object> outMap = new HashMap<String, Object>();
		outMap.put("QUERY_WORK_OPER_WARNING_DETAIL", detailMap);
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 根据作业编码删除作业运行告警详细信息入参处理
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: removeWorkOperWarningDetailByWorkCodeInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> removeWorkOperWarningDetailByWorkCodeInParam(
			InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String, Object> inMap = inBean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("workCode", inMap.get("WORK_CODE"));
		return inParam;
	}
	
	/**
	 * 根据作业编码删除作业运行告警详细信息出参处理
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: removeWorkOperWarningDetailByWorkCodeOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO removeWorkOperWarningDetailByWorkCodeOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 保存作业运行告警详细信息入参处理
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: saveWorkOperWarningDetailInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveWorkOperWarningDetailInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String, Object> inMap = inBean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("workCode", inMap.get("WORK_CODE"));
		inParam.put("workStatus", inMap.get("WORK_STATUS"));
		String time = (String) inMap.get("RUNING_TIME");
		if(CommonUtils.objectIsNull(time) == false){
			  String runingTimes = DateUtil.stringToString(time,DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
			  inParam.put("runingTime", runingTimes);	
		}
		inParam.put("maxValue", inMap.get("MAX_VALUE"));
		inParam.put("minValue", inMap.get("MIN_VALUE"));
		inParam.put("monitorPhoneNo", inMap.get("MONITOR_PHONE_NO"));
		return inParam;
	}
	
	/**
	 * 保存作业运行告警详细信息出参处理
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: saveWorkOperWarningDetailOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveWorkOperWarningDetailOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 时间格式转换
	* @date: 2016-11-14 
	* @author: fangyuan_crmpd
	* @title: timeConvert 
	* @param formTime
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected String timeConvert(String formTime){
		if(formTime.indexOf(":") < Integer.valueOf(Const.FLASE_INT)){
			return formTime+" 00:00:00";
		}
		return formTime;
	}
}
