package com.sitech.strategy.manage.entity.param.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.IChannelManageParam;

/**
 * 渠道运营位参数转换
* @date: 2016-9-14 
* @author: fangyuan_crmpd
* @title: ChannelManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ChannelManageParam implements IChannelManageParam{
	

	/**
	 * 根据渠道查询运营位入参转换
	* @date: 2016-9-15 
	* @author: fangyuan_crmpd
	* @title: positionListByChannelInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> positionListByChannelInParam(InDTO inDTO) {
		return null;
	}

	/**
	 * 根据渠道查询运营位出参转换
	* @date: 2016-9-15 
	* @author: fangyuan_crmpd
	* @title: positionListByChannelOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO positionListByChannelOutParam(Map<String, Object> outParam) {
		
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		
		List<Map<String,Object>> inList = (List<Map<String, Object>>) outParam.get("positionList");
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		
		if(CommonUtils.objectIsNull(inList) == false){
		  for(Map<String,Object> map: inList){
		    Map<String,Object> channelMap = new HashMap<String,Object>();
		    channelMap.put("POSITION_ID",map.get("positionId"));
		    channelMap.put("POSITION_NAME",map.get("positionName"));
		    channelMap.put("POSITION_DESC",map.get("positionDesc"));
		    channelMap.put("OPER_NO", map.get("operNo"));
		    channelMap.put("OPER_TIME", map.get("operTime"));
		    channelMap.put("OPER_NAME", map.get("operName"));
		    channelMap.put("UPDATE_NO", map.get("updateNo"));
		    channelMap.put("UPDATE_TIME", map.get("updateTime"));
		    channelMap.put("UPDATE_NAME", map.get("updateName"));
		    outList.add(channelMap);
		  }
		} 
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("POSITION_LIST", outList);
		
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);		
		return standardOutDTO;
	}
	
	/**
	 * 运营位属性入参
	* @date: 2016-10-30 
	* @author: wangth
	* @Title: positionAttrInparam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> positionAttrInparam(InDTO inDTO){
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> position = new HashMap<String,Object>();
		List<Map<String,Object>> list = (List<Map<String, Object>>) inMap.get("LIST");
		List<Map<String,Object>> positionList = new ArrayList<Map<String,Object>>();
		if(!CommonUtils.objectIsNull(list)){
			for(Map<String,Object> positionMap:list){
				Map<String,Object> inParam = new HashMap<String,Object>();
				inParam.put("serialId",SequenceUtil.getSequence());
				inParam.put("relId", positionMap.get("REL_ID") );
				inParam.put("attributeName", positionMap.get("ATTRIBUTE_NAME"));
				inParam.put("attributeCode", positionMap.get("ATTRIBUTE_CODE"));
				inParam.put("attributeValue", positionMap.get("ATTRIBUTE_VALUE"));
				positionList.add(inParam);
			}
		}
		
		position.put("relId", inMap.get("REL_ID"));
		position.put("positionList", positionList);
		return position;
	}
	
	/**
	 * 运营位属性出参
	* @date: 2016-10-30 
	* @author: wangth
	* @Title: positionAttrOutParam 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO positionAttrOutParam(Map<String,Object> outParam){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> positionAttrList = (List<Map<String,Object>>)outParam.get("positionAttrList");
		List<Map<String,Object>> positionAttrNewList = new ArrayList<Map<String,Object>>();
		
		if(!CommonUtils.objectIsNull(positionAttrList)){
			for(Map<String,Object> map :positionAttrList){
				Map<String,Object> noMap = new HashMap<String,Object>();
				noMap.put("REL_ID", (String)map.get("relId"));
				noMap.put("ATTRIBUTE_TYPE", (String)map.get("attributeType"));
				noMap.put("ATTRIBUTE_NAME", (String)map.get("attributeName"));
				noMap.put("ATTRIBUTE_CODE", (String)map.get("attributeCode"));
				noMap.put("ATTRIBUTE_VALUE", (String)map.get("attributeValue"));
				positionAttrNewList.add(noMap);
			}
		}
		outMap.put("POSITIONATTR_LIST", positionAttrNewList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		outBean.setBody(outMap);
		
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 查询渠道入参转换
	* @date: 2016-9-15 
	* @author: fangyuan_crmpd
	* @title: queryChannelListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryChannelListInParam(InDTO inDTO){
		return settleChannelInfoInParams(inDTO);
	}
	
	/**
	 * 查询渠道列表出参转换
	* @date: 2016-9-15 
	* @author: fangyuan_crmpd
	* @title: queryChannelListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryChannelListOutParam(List<Map<String,Object>> outParam){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		
		if(CommonUtils.objectIsNull(outParam) == false){
		  for(Map<String,Object> map: outParam){
	          Map<String,Object> channelMap = new HashMap<String,Object>();
		      channelMap.put("CHANNEL_ID",map.get("channelId"));
		      channelMap.put("CHANNEL_TYPE",map.get("channelType"));
		      channelMap.put("CHANNEL_NAME",map.get("channelName"));
		      channelMap.put("CHANNEL_DESC",map.get("channelDesc"));
		      channelMap.put("SCENE_TYPE",map.get("sceneType"));
		      channelMap.put("OPER_NO", map.get("operNo"));
	          channelMap.put("OPER_TIME", map.get("operTime"));
		      channelMap.put("OPER_NAME", map.get("operName"));
		      channelMap.put("UPDATE_NO", map.get("updateNo"));
		      channelMap.put("UPDATE_TIME", map.get("updateTime"));
		      channelMap.put("UPDATE_NAME", map.get("updateName"));
		      channelMap.put("CHANNEL_IMAGE_URL", map.get("channelImageUrl"));
		      channelMap.put("ORDER_NO", map.get("orderNo"));
		      channelMap.put("CHANNEL_STATUS", map.get("channelStatus"));
		      outList.add(channelMap);
		  }
		} 
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("CHANNEL_LIST", outList);
		
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);		
		return standardOutDTO;
	}
	
	/**
	 * 查询渠道显示列表入参转换
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: queryChannelShowListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryChannelShowListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("channelId",inMap.get("CHANNEL_ID"));
		inParam.put("queryListType", Const.QUERY_LIST_TYPE_CS );
		inParam.put("sortFlag", inMap.get("SORT_FLAG"));
		inParam.put("sortField", inMap.get("SORT_FIELD"));
		inParam.put("queryId", inMap.get("QUERY_ID"));
		inParam.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		inParam.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		inParam.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		return inParam;
	}

	/**
	 * 查询渠道显示列表出参转换
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: queryChannelShowListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryChannelShowListOutParam(
			Map<String, Object> outParam) {
		List<Map<String,Object>> inList = (List<Map<String,Object>>)outParam.get("channelShowList");
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		if(CommonUtils.objectIsNull(inList) == false){
			for(Map<String,Object> inMap : inList){
				Map<String,Object> outMap = new HashMap<String,Object>();
				outMap.put("CHANNEL_ID", inMap.get("channelId"));
				outMap.put("SERIAL_ID", inMap.get("serialId"));
				outMap.put("MARKET_CASE_TYPE", inMap.get("marketCaseType"));
				outMap.put("MARKET_CASE_FLAG", inMap.get("marketCaseFlag"));
				outMap.put("AREA_FLAG", inMap.get("areaFlag"));
				outMap.put("AREA_NO", inMap.get("areaNo"));
				outMap.put("TOTAL_NO", inMap.get("totalNo"));
				outList.add(outMap);
			}
		}
		Map<String,Object> channelShowMap = new HashMap<String,Object>();
		channelShowMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		channelShowMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		channelShowMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		channelShowMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		channelShowMap.put("CHANNEL_SHOW_LIST", outList);
		
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean bean = new MBean();
		bean.setBody(channelShowMap);
		standardOutDTO.setBean(bean);
		return standardOutDTO;
	}
	
	/**
	 *查询运营位列表入参
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: queryPositionListInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryPositionListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_POST);
		outMap.put("sortFlag", inMap.get("SORT_FLAG"));
		outMap.put("sortField", inMap.get("SORT_FIELD"));
		outMap.put("queryId", inMap.get("QUERY_ID"));
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("positionId", (String)inMap.get("POSITION_ID"));
		outMap.put("positionName", (String)inMap.get("POSITION_NAME"));
		outMap.put("operNo", (String)inMap.get("OPER_NO"));
		outMap.put("operName", (String)inMap.get("OPER_TIME"));
		outMap.put("operTime", (String)inMap.get("OPER_NAME"));
		outMap.put("positionDesc", (String)inMap.get("POSITION_DESC"));
		outMap.put("keyWords", (String)inMap.get("KEY_WORDS"));
		outMap.put("channelId", (String)inMap.get("CHANNEL_ID"));
		outMap.put("positionType", (String)inMap.get("POSITION_TYPE"));
		return outMap;
	}
	
	/**
	 * 查询运营位出参
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: queryPositionListOutParam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryPositionListOutParam(Map<String, Object> outParam) {
		
		return settlePositionOutParams(outParam);
	}
	
	/** 删除客户群渠道入参处理
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: removeCustGroupChannelInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public Map<String, Object> removeCustGroupChannelInParam(InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String, Object> body = bean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("relId", body.get("REL_ID"));
		return inParam;
	}

	/** 删除客户群渠道出参处理
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: removeCustGroupChannelOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public StandardOutDTO removeCustGroupChannelOutParam() {
		StandardOutDTO outDTO = new StandardOutDTO();
		outDTO.setBean(new MBean());
		return outDTO;
	}

	/**
	 * 删除渠道显示入参转换
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: removeChannelShowInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> removeChannelShowInParam(InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String,Object> inMap = bean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("serialId", inMap.get("SERIAL_ID"));
		return inParam;
	}

	/**
	 * 删除渠道显示出参转化
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: removeChannelShowOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO removeChannelShowOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean bean = new MBean();
		standardOutDTO.setBean(bean);
		return standardOutDTO;
	}
	
	/**
	 * 移除运营位入参
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: removePositionInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> removePositionInParam(InDTO inDTO) {
		return settlePositionInParams(inDTO);
	}
	
	/**
	 * 移除运营位出参
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: removePositionOutParam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removePositionOutParam(Map<String,Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean bean = new MBean();
		standardOutDTO.setBean(bean);
	}
	
	/**
	 * 删除运营位属性入参处理
	* @date: 2016-11-14 
	* @author: fangyuan_crmpd
	* @title: removePositionAttrInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> removePositionAttrInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String, Object> inMap = inBean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("relId", inMap.get("REL_ID"));
		return inParam; 
	}
	
	/**
	 * 删除运营位属性出参处理
	* @date: 2016-11-14 
	* @author: fangyuan_crmpd
	* @title: removePositionAttrOutParam  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO removePositionAttrOutParam() {
		MBean mbean = new MBean();
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
		
	}
	
	/**
	 * 保存运营位入参
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: savePositionInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> savePositionInParam(InDTO inDTO) {
		return settlePositionInParams(inDTO);
	}
	/**
	 * 保存运营位出参
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: savePositionInparam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void savePositionOutparam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean bean = new MBean();
		standardOutDTO.setBean(bean);
	}

	
	/**
	 * 新增渠道入参转换
	* @date: 2016-10-5 
	* @author: fangyuan_crmpd
	* @title: saveChannelInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> saveChannelInParam(InDTO inDTO) {
	   return settleChannelInfoInParams(inDTO);
	}

	/**
	 * 新增渠道出参转换
	* @date: 2016-10-5 
	* @author: fangyuan_crmpd
	* @title: saveChannelOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO saveChannelOutParam() {
		MBean mbean = new MBean();
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}

	/**
	 * 新增渠道显示入参转换
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: saveChannelShowInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveChannelShowInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("channelId", inMap.get("CHANNEL_ID"));
		inParam.put("serialId", SequenceUtil.getSequence());
		inParam.put("areaFlag", inMap.get("AREA_FLAG"));
		inParam.put("marketCaseType", inMap.get("MARKET_CASE_TYPE"));
		inParam.put("marketCaseFlag", inMap.get("MARKET_CASE_FLAG"));
		inParam.put("areaNo", inMap.get("AREA_NO"));
		inParam.put("totalNo", inMap.get("TOTAL_NO"));
		return inParam;
	}

	/**
	 * 新增渠道显示出参转换
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: saveChannelShowOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveChannelShowOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean bean = new MBean();
		standardOutDTO.setBean(bean);
		return standardOutDTO;
	}

	/**
	 * 更新渠道信息入参处理
	* @date: 2016-11-17 
	* @author: tangaq
	* @title: updateChannelInfoInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> updateChannelInfoInParam(InDTO inDTO) {
		return this.settleChannelInfoInParams(inDTO);
	}

	/**
	 * 更新渠道信息出参处理
	* @date: 2016-11-17 
	* @author: tangaq
	* @title: updateChannelInfoOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO updateChannelInfoOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean bean = new MBean();
		standardOutDTO.setBean(bean);
		return standardOutDTO;
	}

	/**
	 * 更新渠道显示入参转换
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: updateChannelShowInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> updateChannelShowInParam(InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String,Object> inMap = bean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("serialId", inMap.get("SERIAL_ID"));
		inParam.put("channelId", inMap.get("CHANNEL_ID"));
		inParam.put("areaNo", inMap.get("AREA_NO"));
		inParam.put("totalNo", inMap.get("TOTAL_NO"));
		inParam.put("marketCaseFlag", inMap.get("MARKET_CASE_FLAG"));
		inParam.put("marketCaseType", inMap.get("MARKET_CASE_TYPE"));
		inParam.put("areaFlag", inMap.get("AREA_FLAG"));
		return inParam;
	}

	/**
	 * 更新渠道显示出参转换
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: updateChannelShowOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO updateChannelShowOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean bean = new MBean();
		standardOutDTO.setBean(bean);
		return standardOutDTO;
	}
	
	/**
	 * 更新运营位入参
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: updatePositionInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> updatePositionInParam(InDTO inDTO) {
		return settlePositionInParams(inDTO);
	}
	
	/**
	 * 更新运营位出参
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: updatePositionOutParam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updatePositionOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean bean = new MBean();
		standardOutDTO.setBean(bean);
	}
	
	/**
	 * 渠道基本信息入参处理
	* @date: 2016-10-15 
	* @author: wangth
	* @Title: channelInfoInParams 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> settleChannelInfoInParams(InDTO inDTO){
		MBean bean = inDTO.getMbean();
		Map<String,Object> map = bean.getBody();
	    Map<String,Object> channelMap = new HashMap<String, Object>();
	    channelMap.put("channelId",map.get("CHANNEL_ID"));
        channelMap.put("channelType",map.get("CHANNEL_TYPE"));
        channelMap.put("channelName",map.get("CHANNEL_NAME"));
        channelMap.put("channelDesc",map.get("CHANNEL_DESC"));
        channelMap.put("sceneType",map.get("SCENE_TYPE"));
        channelMap.put("operNo", map.get("OPER_NO"));
        channelMap.put("operTime", map.get("OPER_TIME"));
        channelMap.put("operName", map.get("OPER_NAME"));
        channelMap.put("updateNo", map.get("UPDATE_NO"));
        channelMap.put("updateTime", map.get("UPDATE_TIME"));
        channelMap.put("updateName", map.get("UPDATE_NAME"));
        channelMap.put("channelImageUrl", map.get("CHANNEL_IMAGE_URL"));
        channelMap.put("orderNo", map.get("ORDER_NO"));
        channelMap.put("channelStatus", map.get("CHANNEL_STATUS"));
		return channelMap;
	}
	
	/**
	 * 处理运营位出参参数
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: settlePositionInfoParams 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected StandardOutDTO settlePositionOutParams(Map<String,Object> outParam){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> positionList = (List<Map<String,Object>>)outParam.get("positionList");
		List<Map<String,Object>> positionNewList = new ArrayList<Map<String,Object>>();
		
		if(!CommonUtils.objectIsNull(positionList)){
			for(Map<String,Object> map :positionList){
				Map<String,Object> noMap = new HashMap<String,Object>();
				noMap.put("POSITION_ID", (String)map.get("positionId"));
				noMap.put("POSITION_NAME", (String)map.get("positionName"));
				noMap.put("CHANNEL_ID", (String)map.get("channelId"));
				noMap.put("CHANNEL_NAME", (String)map.get("channelName"));
				noMap.put("POSITION_DESC", (String)map.get("positionDesc"));
				positionNewList.add(noMap);
			}
		}
		outMap.put("POSITION_LIST", positionNewList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		outBean.setBody(outMap);
		
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 处理运营位入参参数
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: settlePositionInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> settlePositionInParams(InDTO inDTO){
		MBean inMbean = inDTO.getMbean();
		Map<String,Object> inMap = inMbean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("positionId", (String)inMap.get("POSITION_ID"));
		outMap.put("positionName", (String)inMap.get("POSITION_NAME"));
		outMap.put("positionType", (String)inMap.get("POSITION_TYPE"));
		outMap.put("operNo", (String)inMap.get("OPER_NO"));
		outMap.put("operName", (String)inMap.get("OPER_NAME"));
		outMap.put("operTime", (String)inMap.get("OPER_TIME"));
		outMap.put("positionDesc", (String)inMap.get("POSITION_DESC"));
		outMap.put("channelId", (String)inMap.get("CHANNEL_ID"));
		return outMap;
	}

}
