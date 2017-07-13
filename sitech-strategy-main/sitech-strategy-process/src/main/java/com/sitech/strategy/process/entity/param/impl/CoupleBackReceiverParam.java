package com.sitech.strategy.process.entity.param.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.JsonUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.process.base.BaseProcessEntity;
import com.sitech.strategy.process.entity.param.inter.ICoupleBackReceiverParam;

/**
 * 消息反馈参数处理
* @date: 2016-11-26 
* @author: sunliang 
* @title: CoupleBackReceiverParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class CoupleBackReceiverParam extends BaseProcessEntity implements
		ICoupleBackReceiverParam,Serializable {
	
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
		 * 接收受理消息入参处理
		* @date: 2017-2-14 
		* @author: yexr
		* @title: receiveAcceptCoupleBackInParam 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override	
		public Map<String, Object> receiveAcceptCoupleBackInParam(Object  inParam) {
			log.info("show receiveAcceptCoupleBackInParam", inParam);
			String AcceptStr = (String)inParam;
			String[] AcceptArr = AcceptStr.split("#\\|");
			String[] AcceptArr1=AcceptArr[1].split("#~");	
			Map<String,Object> inMap = new HashMap<String,Object>();
			if("PROD_OFFER_INST_NEW".equals(AcceptArr[0])){					
			//新受理销售品
	//		String busiAppId = (String)salesArr[0];
	//		String systemId = (String)salesArr[1];
	//		String seqId = (String)salesArr[2];
	//		String channelId = (String)salesArr[3];
			String titleType = (String)AcceptArr[0];
			String timestap = (String)AcceptArr1[0];
			String latnId = (String)AcceptArr1[1];
			String prodInstId = (String)AcceptArr1[2];
			String developerCode = (String)AcceptArr1[3];
			String createDate = (String)AcceptArr1[4];
			String staffId = (String)AcceptArr1[5];
			String prodOfferId = (String)AcceptArr1[6];
			String partnerDeveloperCode = (String)AcceptArr1[7];
			String prodOfferInstId = (String)AcceptArr1[8];
			inMap.put("titleType",titleType);
			inMap.put("timestap",timestap);
			inMap.put("latnId",latnId);
			inMap.put("prodInstId",prodInstId);
			inMap.put("developerCode",developerCode);
			inMap.put("createDate",createDate);
			inMap.put("staffId",staffId);
			inMap.put("prodOfferId",prodOfferId);
			inMap.put("partnerDeveloperCode",partnerDeveloperCode);
			inMap.put("prodOfferInstId",prodOfferInstId);
			String idNo = latnId+prodInstId;
			inMap.put("idNo",idNo);
			System.out.println("show inMap"+inMap);
			return inMap;
			}
			//属性（换卡）
			if("ORDER_ITEM_NEW".equals(AcceptArr[0])){
				String titleType = (String)AcceptArr[0];
				String timestap = (String)AcceptArr1[0];
				String latnId = (String)AcceptArr1[1];
				String prodInstId = (String)AcceptArr1[2];
				String developerCode = (String)AcceptArr1[3];			
				String serviceNbr = (String)AcceptArr1[4];
				String staffId = (String)AcceptArr1[5];
				String finishTime = (String)AcceptArr1[6];
				String extSystem = (String)AcceptArr1[7];
				String orderItemId = (String)AcceptArr1[8];		
				inMap.put("titleType",titleType);
				inMap.put("timestap",timestap);
				inMap.put("latnId",latnId);
				inMap.put("prodInstId",prodInstId);
				inMap.put("developerCode",developerCode);
				inMap.put("serviceNbr",serviceNbr);
				inMap.put("staffId",staffId);
				inMap.put("finishTime",finishTime);
				inMap.put("extSystem",extSystem);
				inMap.put("orderItemId",orderItemId);
				inMap.put("marketCaseId","20170302151139103677772");
				inMap.put("custGroupId","20170302150826999100021");
				//inMap.put("custGroupId","20170301204329101100001");
				String idNo = latnId+prodInstId;
				Map<String,Object> userMap = new HashMap<String,Object>();
				userMap.put("idNo",idNo);
				inMap.put("idNo", idNo);
				log.info("show idNo", idNo);
				Map<String,String> resMap = (Map<String,String>)userSelector.selectUserInfoByIdNo(userMap);
				log.info("show userinfo", resMap);
				inMap.put("resMap", resMap);
				System.out.println("show inMap"+inMap);
					return inMap;
			}
			//新受理补贴
			if("TB_BIL_PRE_INST_NEW".equals(AcceptArr[0])){
				String titleType = (String)AcceptArr[0];
				String timestap = (String)AcceptArr1[0];
				String latnId = (String)AcceptArr1[1];
				String prodInstId = (String)AcceptArr1[2];
				String developerCode = (String)AcceptArr1[3];
				String acctId = (String)AcceptArr1[4];
				String staffId = (String)AcceptArr1[5];			         
				String preInstId = (String)AcceptArr1[6];
				String optDate = (String)AcceptArr1[7];
				String preRuleId = (String)AcceptArr1[8];	
				String billingCycleBegin = (String)AcceptArr1[9];
				String billingCycleEnd = (String)AcceptArr1[10];
				String partnerDeveloperCode = (String)AcceptArr1[11];
				String objType = (String)AcceptArr1[12];
				inMap.put("titleType",titleType);
				inMap.put("timestap",timestap);
				inMap.put("latnId",latnId);
				inMap.put("prodInstId",prodInstId);
				inMap.put("developerCode",developerCode);
				inMap.put("acctId",acctId);
				inMap.put("staffId",staffId);
				inMap.put("preInstId",preInstId);
				inMap.put("optDate",optDate);
				inMap.put("preRuleId",preRuleId);			
				inMap.put("billingCycleBegin",billingCycleBegin);
				inMap.put("billingCycleEnd",billingCycleEnd);
				inMap.put("partnerDeveloperCode",partnerDeveloperCode);
				inMap.put("objType",objType);
				String idNo = latnId+prodInstId;
				inMap.put("idNo",idNo);
				System.out.println("show inMap"+inMap);
				return inMap;	
			}
			//新受理产品
			if("PROD_INST_NEW".equals(AcceptArr[0])){
	            String titleType = (String)AcceptArr[0];
				String timestap = (String)AcceptArr1[0];
				String latnId = (String)AcceptArr1[1];
				String prodInstId = (String)AcceptArr1[2];
				String developerCode = (String)AcceptArr1[3]; 		
				String staffId = (String)AcceptArr1[4];			         
				String ownerCustId = (String)AcceptArr1[5];
				String acctId = (String)AcceptArr1[6];
				String serviceNbr = (String)AcceptArr1[7];
				String prodOfferInstId = (String)AcceptArr1[8];
				String installAddr = (String)AcceptArr1[9];	
				String certiNbr = (String)AcceptArr1[10];
				String productId = (String)AcceptArr1[11];
				String partnerDeveloperCode = (String)AcceptArr1[12];
				String mainProdOfferInstId = (String)AcceptArr1[13];
				inMap.put("titleType",titleType);
				inMap.put("timestap",timestap);
				inMap.put("latnId",latnId);
				inMap.put("prodInstId",prodInstId);
				inMap.put("developerCode",developerCode);		
				inMap.put("staffId",staffId);
				inMap.put("ownerCustId",ownerCustId);
				inMap.put("acctId",acctId);
				inMap.put("serviceNbr",serviceNbr);
				inMap.put("prodOfferInstId",prodOfferInstId);			
				inMap.put("installAddr",installAddr);
				inMap.put("certiNbr",certiNbr);
				inMap.put("productId",productId);
				inMap.put("partnerDeveloperCode",partnerDeveloperCode);
				inMap.put("mainProdOfferInstId",mainProdOfferInstId);
				String idNo = latnId+prodInstId;
				inMap.put("idNo",idNo);
				System.out.println("show inMap"+inMap);
				return inMap;	
			}
			return null;
		}

	/**
	 * 接收反馈消息入参处理
	* @date: 2016-11-26 
	* @author: sunliang 
	* @title: receiveCoupleBackInParam 
	* @param o
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> receiveCoupleBackInParam(Object o) throws StrategyError{
		Map<String,Object> rootMap = JsonUtil.JsonStrToMap(o.toString());
		Map<String,Object> map = (Map<String,Object>)JsonUtil.getObject(rootMap, "ROOT.BODY");
		Map<String,Object> inParam = new HashMap<String, Object>();
		String titleType = CommonUtils.objectIsNull(map.get("TITLE_TYPE")) ? "" : (String)map.get("TITLE_TYPE");
		if (Const.COUPLEBACK_TITLE_TYPE_RECEIPT.equals(titleType)) {
			//回单
			inParam = receiveRecordInParam(map);
		}else if(Const.COUPLEBACK_TITLE_TYPE_CLICK.equals(titleType)){
			//点击
			inParam = clickRecordInParam(map);
		}else if(Const.COUPLEBACK_TITLE_TYPE_CALLCONTACT.equals(titleType)){
			//通话记录
			inParam = channelCallContactInParam(map);
		}else if(Const.COUPLEBACK_TITLE_TYPE_SMSCONTACT.equals(titleType)){
			//短信日志
			inParam = channelSMSContactInParam(map);
		}else if(Const.COUPLEBACK_TITLE_TYPE_SMSPULL.equals(titleType)){
			//短信上行
			inParam = sMSPullInParam(map);
		}else if(Const.COUPLEBACK_TITLE_TYPE_PUSHARRIVE.equals(titleType)){
			//任务到达
			inParam = pushArriveInParam(map);
		}
		
		return inParam;
	}
	
	/** 
	 * 渠道通话接触参数处理
	* @date: 2017-1-10 
	* @author: wangpei
	* @title: channelCallContactInParam 
	* @param param
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected Map<String, Object> channelCallContactInParam(Map<String,Object> param) throws StrategyError{
		Map<String,Object> commonMap = param.get("COMMON_INFO") == null ? new HashMap<String, Object>() : (Map<String,Object>)param.get("COMMON_INFO");
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("systemId", CommonUtils.objectIsNull(commonMap.get("SYSTEM_ID")) ? "" : commonMap.get("SYSTEM_ID"));
		inParam.put("titleType", CommonUtils.objectIsNull(param.get("TITLE_TYPE")) ? "" : param.get("TITLE_TYPE"));
		inParam.put("seqId", CommonUtils.objectIsNull(param.get("SEQ_ID")) ? "" : param.get("SEQ_ID"));
		inParam.put("channelId", CommonUtils.objectIsNull(param.get("CHANNEL_ID")) ? "" : param.get("CHANNEL_ID"));
		inParam.put("operNo", CommonUtils.objectIsNull(param.get("OPER_NO")) ? "" : param.get("OPER_NO"));
		inParam.put("operName", CommonUtils.objectIsNull(param.get("OPER_NAME")) ? "" : param.get("OPER_NAME"));
		inParam.put("regionCode", CommonUtils.objectIsNull(param.get("REGION_CODE")) ? "" : param.get("REGION_CODE"));
		inParam.put("callNo", CommonUtils.objectIsNull(param.get("CALL_NO")) ? "" : param.get("CALL_NO"));
		inParam.put("calledNo", CommonUtils.objectIsNull(param.get("CALLED_NO")) ? "" : param.get("CALLED_NO"));
		inParam.put("callTime", CommonUtils.objectIsNull(param.get("CALL_TIME")) ? "" : param.get("CALL_TIME"));
		List<Map<String,String>> newPositionList = new ArrayList<Map<String,String>>();
		if(!CommonUtils.objectIsNull(param.get("POSITION_INFO_LIST"))){
			List<Map<String,String>> positionList = (List<Map<String,String>>)param.get("POSITION_INFO_LIST");
			for(Map<String,String> positionMap : positionList){
				Map<String,String> newPositionMap = new HashMap<String,String>();
				newPositionMap.put("positionId", CommonUtils.objectIsNull(positionMap.get("POSITION_ID")) ? "" : positionMap.get("POSITION_ID"));
				newPositionMap.put("serviceNbr", CommonUtils.objectIsNull(positionMap.get("SERVICE_NBR")) ? "" : positionMap.get("SERVICE_NBR"));
				String idNo = userSelector.selectIdNoByServiceNo(CommonUtils.objectIsNull(positionMap.get("SERVICE_NBR")) ? "" : positionMap.get("SERVICE_NBR"));
				
				if(CommonUtils.objectIsNull(idNo)){
					idNo = SequenceUtil.getSequence();
				}
				newPositionMap.put("idNo",idNo);
				log.info("receiveCoupleBackInParam.idNo", idNo);
				newPositionList.add(newPositionMap);
			}
		}
		inParam.put("positionList", newPositionList);
		log.info("newPositionList", inParam);
		return inParam;
	}

	/** 渠道短信接触参数处理
	* @date: 2017-1-10 
	* @author: wangpei
	* @title: channelSMSContactInParam 
	* @param param
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected Map<String, Object> channelSMSContactInParam(Map<String,Object> param) throws StrategyError{
		Map<String,Object> commonMap = param.get("COMMON_INFO") == null ? new HashMap<String, Object>() : (Map<String,Object>)param.get("COMMON_INFO");
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("systemId", CommonUtils.objectIsNull(commonMap.get("SYSTEM_ID")) ? "" : commonMap.get("SYSTEM_ID"));
		inParam.put("titleType", CommonUtils.objectIsNull(param.get("TITLE_TYPE")) ? "" : param.get("TITLE_TYPE"));
		inParam.put("seqId", CommonUtils.objectIsNull(param.get("SEQ_ID")) ? "" : param.get("SEQ_ID"));
		inParam.put("channelId", CommonUtils.objectIsNull(param.get("CHANNEL_ID")) ? "" : param.get("CHANNEL_ID"));
		inParam.put("operNo", CommonUtils.objectIsNull(param.get("OPER_NO")) ? "" : param.get("OPER_NO"));
		inParam.put("operName", CommonUtils.objectIsNull(param.get("OPER_NAME")) ? "" : param.get("OPER_NAME"));
		inParam.put("regionCode", CommonUtils.objectIsNull(param.get("REGION_CODE")) ? "" : param.get("REGION_CODE"));

		inParam.put("phoneNo", CommonUtils.objectIsNull(param.get("PHONE_NO")) ? "" : param.get("PHONE_NO"));
		inParam.put("sendTime", CommonUtils.objectIsNull(param.get("SEND_TIME")) ? "" : param.get("SEND_TIME"));
		inParam.put("sendContent", CommonUtils.objectIsNull(param.get("SEND_CONTENT")) ? "" : param.get("SEND_CONTENT"));
		inParam.put("fromTel", CommonUtils.objectIsNull(param.get("FROM_TEL")) ? "" : param.get("FROM_TEL"));
		
		List<Map<String,String>> newPositionList = new ArrayList<Map<String,String>>();
		if(!CommonUtils.objectIsNull(param.get("POSITION_INFO_LIST"))){
			List<Map<String,String>> positionList = (List<Map<String,String>>)param.get("POSITION_INFO_LIST");
			for(Map<String,String> positionMap : positionList){
				Map<String,String> newPositionMap = new HashMap<String,String>();
				newPositionMap.put("positionId", CommonUtils.objectIsNull(positionMap.get("POSITION_ID")) ? "" : positionMap.get("POSITION_ID"));
				newPositionMap.put("serviceNbr", CommonUtils.objectIsNull(positionMap.get("SERVICE_NBR")) ? "" : positionMap.get("SERVICE_NBR"));
				String idNo = userSelector.selectIdNoByServiceNo(positionMap.get("SERVICE_NBR"));
				if(CommonUtils.objectIsNull(idNo)){
					idNo = SequenceUtil.getSequence();
				}
				newPositionMap.put("idNo", idNo);
				newPositionList.add(newPositionMap);
			}
		}
		inParam.put("positionList", newPositionList);
		return inParam;
	}

	/**
	 *  点击记录参数处理
	* @date: 2017-1-10 
	* @author: wangpei
	* @title: clickRecordInParam 
	* @param param
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected Map<String, Object> clickRecordInParam(Map<String,Object> param) throws StrategyError{
		String numType = CommonUtils.objectIsNull(param.get("NUM_TYPE")) ? "" : (String)param.get("NUM_TYPE");
		String numValue = CommonUtils.objectIsNull(param.get("NUM_VALUE")) ? "" : (String)param.get("NUM_VALUE");
		Map<String,Object> commonMap = param.get("COMMON_INFO") == null ? new HashMap<String, Object>() : (Map<String,Object>)param.get("COMMON_INFO");
		String idNo = userSelector.selectIdNoByServiceNo(numValue+numType);
		if(CommonUtils.objectIsNull(idNo)){
			idNo = SequenceUtil.getSequence();
		}
		log.info("receiveCoupleBackInParam.idNo", idNo);
		
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("systemId", CommonUtils.objectIsNull(commonMap.get("SYSTEM_ID")) ? "" : commonMap.get("SYSTEM_ID"));
		inParam.put("busiAppId", CommonUtils.objectIsNull(commonMap.get("BUSI_APP_ID")) ? "" : commonMap.get("BUSI_APP_ID"));
		inParam.put("titleType", CommonUtils.objectIsNull(param.get("TITLE_TYPE")) ? "" : param.get("TITLE_TYPE"));
		inParam.put("seqId", CommonUtils.objectIsNull(param.get("SEQ_ID")) ? "" : param.get("SEQ_ID"));
		inParam.put("channelId", CommonUtils.objectIsNull(param.get("CHANNEL_ID")) ? "" : param.get("CHANNEL_ID"));
		inParam.put("operNo", CommonUtils.objectIsNull(param.get("OPER_NO")) ? "" : param.get("OPER_NO"));
		inParam.put("operName", CommonUtils.objectIsNull(param.get("OPER_NAME")) ? "" : param.get("OPER_NAME"));
		inParam.put("regionCode", CommonUtils.objectIsNull(param.get("REGION_CODE")) ? "" : param.get("REGION_CODE"));
		inParam.put("numType", numType);
		inParam.put("numValue", numValue);
		inParam.put("idNos", idNo);
		inParam.put("content", CommonUtils.objectIsNull(param.get("CONTENT")) ? "" : param.get("CONTENT"));
		List<Map<String,String>> newPositionList = new ArrayList<Map<String,String>>();
		if(!CommonUtils.objectIsNull(param.get("POSITION_INFO_LIST"))){
			List<Map<String,String>> positionList = (List<Map<String,String>>)param.get("POSITION_INFO_LIST");
			for(Map<String,String> positionMap : positionList){
				Map<String,String> newPositionMap = new HashMap<String,String>();
				newPositionMap.put("positionId", CommonUtils.objectIsNull(positionMap.get("POSITION_ID")) ? "" : positionMap.get("POSITION_ID"));
				newPositionMap.put("actId", CommonUtils.objectIsNull(positionMap.get("ACT_ID")) ? "" : positionMap.get("ACT_ID"));
				newPositionMap.put("serviceNbr", CommonUtils.objectIsNull(positionMap.get("SERVICE_NBR")) ? "" : positionMap.get("SERVICE_NBR"));
				newPositionList.add(newPositionMap);
			}
		}
		inParam.put("positionList", newPositionList);
		log.info("newPositionList", inParam);
		return inParam;
	}

	/** 
	 * 推送到达参数处理
	* @date: 2017-1-10 
	* @author: wangpei
	* @title: pushArriveInParam 
	* @param param
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected Map<String, Object> pushArriveInParam(Map<String,Object> param) throws StrategyError{
		Map<String,Object> commonMap = param.get("COMMON_INFO") == null ? new HashMap<String, Object>() : (Map<String,Object>)param.get("COMMON_INFO");

		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("busiAppId", CommonUtils.objectIsNull(commonMap.get("BUSI_APP_ID")) ? "" : commonMap.get("BUSI_APP_ID"));
		inParam.put("systemId", CommonUtils.objectIsNull(commonMap.get("SYSTEM_ID")) ? "" : commonMap.get("SYSTEM_ID"));
		inParam.put("titleType", CommonUtils.objectIsNull(param.get("TITLE_TYPE")) ? "" : param.get("TITLE_TYPE"));
		inParam.put("seqId", CommonUtils.objectIsNull(param.get("SEQ_ID")) ? "" : param.get("SEQ_ID"));
		inParam.put("channelId", CommonUtils.objectIsNull(param.get("CHANNEL_ID")) ? "" : param.get("CHANNEL_ID"));
		
		inParam.put("statusCode", CommonUtils.objectIsNull(param.get("STATUS_CODE")) ? "" : param.get("STATUS_CODE"));
		inParam.put("receiveTime", CommonUtils.objectIsNull(param.get("RECEIVE_TIME")) ? "" : param.get("RECEIVE_TIME"));
		
		String idNo = userSelector.selectIdNoByServiceNo("");
		if(CommonUtils.objectIsNull(idNo)){
			idNo = SequenceUtil.getSequence();
		}
		inParam.put("idNo",idNo);
		log.info("receiveCoupleBackInParam.idNo", idNo);
		
		return inParam;
	}
	
	/** 回单参数处理
	* @date: 2017-1-10 
	* @author: wangpei
	* @title: receiveRecordInParam 
	* @param param
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected Map<String, Object> receiveRecordInParam(Map<String,Object> param) throws StrategyError{
		String numType = CommonUtils.objectIsNull(param.get("NUM_TYPE")) ? "" : (String)param.get("NUM_TYPE");
		String numValue = CommonUtils.objectIsNull(param.get("NUM_VALUE")) ? "" : (String)param.get("NUM_VALUE");
		Map<String,Object> commonMap = param.get("COMMON_INFO") == null ? new HashMap<String, Object>() : (Map<String,Object>)param.get("COMMON_INFO");
		String idNos = userSelector.selectIdNoByServiceNo(numValue+numType);
		//log.info("receiveCoupleBackInParam.idNo", idNo);
		
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("systemId", CommonUtils.objectIsNull(commonMap.get("SYSTEM_ID")) ? "" : commonMap.get("SYSTEM_ID"));
		inParam.put("titleType", CommonUtils.objectIsNull(param.get("TITLE_TYPE")) ? "" : param.get("TITLE_TYPE"));
		inParam.put("seqId", CommonUtils.objectIsNull(param.get("SEQ_ID")) ? "" : param.get("SEQ_ID"));
		inParam.put("channelId", CommonUtils.objectIsNull(param.get("CHANNEL_ID")) ? "" : param.get("CHANNEL_ID"));
		inParam.put("operNo", CommonUtils.objectIsNull(param.get("OPER_NO")) ? "" : param.get("OPER_NO"));
		inParam.put("operName", CommonUtils.objectIsNull(param.get("OPER_NAME")) ? "" : param.get("OPER_NAME"));
		inParam.put("regionCode", CommonUtils.objectIsNull(param.get("REGION_CODE")) ? "" : param.get("REGION_CODE"));
		inParam.put("numType", numType);
		inParam.put("numValue", numValue);
		inParam.put("idNos", idNos);
		inParam.put("methodCode", CommonUtils.objectIsNull(param.get("METHOD_CODE")) ? "" : param.get("METHOD_CODE"));
		inParam.put("contactFlag", CommonUtils.objectIsNull(param.get("CONTACT_FLAG")) ? "" : param.get("CONTACT_FLAG"));
		inParam.put("statusCode", CommonUtils.objectIsNull(param.get("STATUS_CODE")) ? "" : param.get("STATUS_CODE"));
		inParam.put("operTime", CommonUtils.objectIsNull(param.get("OPER_TIME")) ? "" : param.get("OPER_TIME"));
		inParam.put("resultsCode", CommonUtils.objectIsNull(param.get("RESULTS_CODE")) ? "" : param.get("RESULTS_CODE"));
		inParam.put("acceptCode", CommonUtils.objectIsNull(param.get("ACCEPT_CODE")) ? "" : param.get("ACCEPT_CODE"));
		inParam.put("note", CommonUtils.objectIsNull(param.get("NOTE")) ? "" : param.get("NOTE"));
		
		List<Map<String,String>> newPositionList = new ArrayList<Map<String,String>>();
		if(!CommonUtils.objectIsNull(param.get("POSITION_INFO_LIST"))){
			List<Map<String,String>> positionList = (List<Map<String,String>>)param.get("POSITION_INFO_LIST");
			for(Map<String,String> positionMap : positionList){
				Map<String,String> newPositionMap = new HashMap<String,String>();
				newPositionMap.put("positionId", CommonUtils.objectIsNull(positionMap.get("POSITION_ID")) ? "" : positionMap.get("POSITION_ID"));
				newPositionMap.put("taskId", CommonUtils.objectIsNull(positionMap.get("TASK_ID")) ? "" : positionMap.get("TASK_ID"));
				newPositionMap.put("actId", CommonUtils.objectIsNull(positionMap.get("ACT_ID")) ? "" : positionMap.get("ACT_ID"));
				newPositionList.add(newPositionMap);
			}
		}
		inParam.put("positionList", newPositionList);
		return inParam;
	}
	
	/**
	 * 接收资费反馈入参处理
	* @date: 2017-4-6 
	* @author: zhangyw_crmpd
	* @title: receivePostageOrderInParam 
	* @param o
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> receivePostageOrderInParam(Object o) throws StrategyError{
		Map<String,Object> rootMap = JsonUtil.JsonStrToMap(o.toString());
		Map<String,Object> param = (Map<String,Object>)JsonUtil.getObject(rootMap, "ROOT.BODY");
		Map<String,Object> inParam = new HashMap<String,Object>();		
		List<Map<String,String>> newPositionList = new ArrayList<Map<String,String>>();
		
		if(!CommonUtils.objectIsNull(param.get("TABLES"))){
			List<Map<String,Object>> tables = (List<Map<String,Object>>)param.get("TABLES");
			for(Map<String, Object> tablesnMap : tables){
				if(tablesnMap.get("TABLENAME").equals("UR_USERPRC_INFO")){
					List<Map<String,Object>> datarecords = (List<Map<String,Object>>)tablesnMap.get("DATARECORDS");
					System.out.println(datarecords.toString());
					for(Map<String,Object> datarecordsMap : datarecords){
						if(datarecordsMap.get("OP").equals("I")){
							Map<String,String> closMap = (Map<String,String>)datarecordsMap.get("COLS");
								String prodPrcid = (String)closMap.get("PROD_PRCID");
								String idNo = String.valueOf(closMap.get("ID_NO"));
								String orderDate = (String)closMap.get("ORDER_DATE");
								log.info("receivePostageOrderInParam.prodPrcid", prodPrcid);
								log.info("receivePostageOrderInParam.idNo", idNo);
								log.info("receivePostageOrderInParam.orderDate", orderDate);
								inParam.put("prodPrcid", prodPrcid);
								inParam.put("idNo", idNo);
								inParam.put("seqId", SequenceUtil.getSequence());
								inParam.put("orderDate", orderDate);
								
						}
					}
				}
			}
		}
		
		return inParam;
	}
	/**
	 *  短信上行参数处理
	* @date: 2017-1-10 
	* @author: wangpei
	* @title: sMSPullInParam 
	* @param param
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected Map<String, Object> sMSPullInParam(Map<String,Object> param) throws StrategyError{
		Map<String,Object> commonMap = param.get("COMMON_INFO") == null ? new HashMap<String, Object>() : (Map<String,Object>)param.get("COMMON_INFO");
		String idNo = userSelector.selectIdNoByServiceNo((String)param.get("SERVICE_NBR"));
		if(CommonUtils.objectIsNull(idNo)){
			idNo = SequenceUtil.getSequence();
		}
		log.info("receiveCoupleBackInParam.idNo", idNo);
		
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("serviceNbr", CommonUtils.objectIsNull(param.get("SERVICE_NBR")) ? "" : param.get("SERVICE_NBR"));
		inParam.put("systemId", CommonUtils.objectIsNull(commonMap.get("SYSTEM_ID")) ? "" : commonMap.get("SYSTEM_ID"));
		inParam.put("busiAppId", CommonUtils.objectIsNull(commonMap.get("BUSI_APP_ID")) ? "" : commonMap.get("BUSI_APP_ID"));
		inParam.put("titleType", CommonUtils.objectIsNull(param.get("TITLE_TYPE")) ? "" : param.get("TITLE_TYPE"));
		inParam.put("seqId", CommonUtils.objectIsNull(param.get("SEQ_ID")) ? "" : param.get("SEQ_ID"));
		inParam.put("positionId", CommonUtils.objectIsNull(param.get("POSITION _ID")) ? "" : param.get("POSITION _ID"));
		inParam.put("channelId", CommonUtils.objectIsNull(param.get("CHANNEL_ID")) ? "" : param.get("CHANNEL_ID"));
		inParam.put("idNo", idNo);
		inParam.put("fromTel", CommonUtils.objectIsNull(param.get("FROM_TEL")) ? "" : param.get("FROM_TEL"));
		inParam.put("replyTime", CommonUtils.objectIsNull(param.get("REPLY_TIME")) ? "" : param.get("REPLY_TIME"));
		inParam.put("replyContent", CommonUtils.objectIsNull(param.get("REPLY_CONTENT")) ? "" : param.get("REPLY_CONTENT"));

		return inParam;
	}

	public static void main(String[] args){
		/*System.out.println("start");
		String o = "{\"ROOT\":{\"BODY\":{\"HEADER\":{\"ROUTING\":{\"ROUTE_KEY\":\"\",\"ROUTE_VALUE\":\"\"}},\"COMMON_INFO\":{\"BUSI_APP_ID\":\"\",\"SYSTEM_ID\":\"SYSTEM_08\"},\"TITLE_TYPE\":\"1002\",\"SQL_ID\":\"\",\"CHANNEL_ID\":\"08\",\"OPER_NO\":\"aaa\",\"OPER_NAME\":\"bbb\",\"REGION_CODE\":\"551\",\"NUM_TYPE\":\"1001\",\"NUM_VALUE\":\"13622332423\",\"METHOD_CODE\":\"\",\"CONTACT_FLAG\":\"\",\"STATUS_CODE\":\"\",\"OPER_TIME\":\"\",\"ACCEPT_CODE\":\"\",\"NOTE\":\"\",\"POSITION_INFO_LIST\":[{\"POSITION_ID\":\"POSITION_01_07\",\"TASK_ID\":\"10001\",\"ACT_ID\":\"10002\"},{\"POSITION_ID\":\"POSITION_01_08\",\"TASK_ID\":\"1111\",\"ACT_ID\":\"2222\"}]}}}";
		try {
			new CoupleBackReceiverParam().receiveCoupleBackInParam(o);
		} catch (StrategyError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");*/
		
		String o = "{                                                                           "
				+"    \"ROOT\": {                                                             "
				+"        \"HEADER\": {                                                       "
				+"            \"ROUTING\": {                                                  "
				+"                \"ROUTE_KEY\": \"10\",                                      "
				+"                \"ROUTE_VALUE\": \"13500938912\"                            "
				+"            },                                                              "
				+"            \"DB_ID\": \"B1\",                                              "
				+"            \"TRACE_ID\": \"04201704060002041018dx0000591233\",             "
				+"            \"KEEP_LIVE\": \"13500938912\",                                 "
				+"            \"CHANNEL_ID\": \"04\",                                         "
				+"            \"PHONE_NO\": \"13500938912\",                                  "
				+"            \"PARENT_CALL_ID\": \"B309267124007F65BE1CB4910308B79B\",       "
				+"            \"USERNAME\": \"\",                                             "
				+"            \"ENDUSRIP\": \"10.161.72.232\",                                "
				+"            \"PASSWORD\": \"\",                                             "
				+"            \"POOL_ID\": \"33\"                                             "
				+"        },                                                                  "
				+"        \"BODY\": {                                                         "
				+"            \"OPR_INFO\": {                                                 "
				+"                \"OP_CODE\": \"1018\",                                      "
				+"                \"ACTION_ID\": \"11040\",                                   "
				+"                \"ORDER_LINE_ID\": \"L17040600000060\"                      "
				+"            },                                                              "
				+"            \"TABLES\": [                                                   "
				+"                {                                                           "
				+"                    \"TABLENAME\": \"UR_USERPRC_INFO\",                     "
				+"                    \"DATARECORDS\": [                                      "
				+"                        {                                                   "
				+"                            \"COLS\": {                                     "
				+"                                \"OP_CODE\": \"1018\",                      "
				+"                                \"ORDER_DATE\": \"20170406000205\",         "
				+"                                \"STATE\": \"A\",                           "
				+"                                \"SERV_ORDER_ID\": \"L17040600000060\",     "
				+"                                \"REMARK\": \"\",                           "
				+"                                \"STATE_DATE\": \"20170406000205\",         "
				+"                                \"PRODPRCINS_ID\": 60000316356791,          "
				+"                                \"CANCLE_SOURCE\": \"\",                    "
				+"                                \"LOGIN_ACCEPT\": 10000711214299,           "
				+"                                \"PRICING_ID\": 0,                          "
				+"                                \"EXP_DATE\": \"20170501000000\",           "
				+"                                \"PROD_ID\": \"22PAZ0837\",                 "
				+"                                \"PROD_PRCID\": \"22CAZ03926\",             "
				+"                                \"GROUP_ID\": 0,                            "
				+"                                \"RELPRCINS_ID\": 0,                        "
				+"                                \"PARPRC_ID\": \"0\",                       "
				+"                                \"DEVELOP_LOGIN\": \"\",                    "
				+"                                \"EFF_DATE\": \"20170406000205\",           "
				+"                                \"ID_NO\": 220910200015312143,              "
				+"                                \"PROD_MAIN_FLAG\": \"1\",                  "
				+"                                \"OP_TIME\": \"20170406000205\",            "
				+"                                \"TEAM_ID\": 0,                             "
				+"                                \"DATA_OPSOURCE\": \"\",                    "
				+"                                \"LOGIN_NO\": \"dx0000\",                   "
				+"                                \"FINISH_FLAG\": \"N\",                     "
				+"                                \"ORDER_SOURCE\": \"04\",                   "
				+"                                \"TRANPRCINS_ID\": 0,                       "
				+"                                \"ORDER_LOGINNO\": \"\"                     "
				+"                            },                                              "
				+"                            \"OP\": \"I\"                                   "
				+"                        }                                                   "
				+"                    ]                                                       "
				+"                }                                                           "
				+"            ]                                                               "
				+"        }                                                                   "
				+"    }                                                                       "
				+"}							";
		Map<String,Object> rootMap = JsonUtil.JsonStrToMap(o.toString());
		Map<String,Object> param = (Map<String,Object>)JsonUtil.getObject(rootMap, "ROOT.BODY");
		Map<String,Object> inParam = new HashMap<String,Object>();		
		List<Map<String,String>> newPositionList = new ArrayList<Map<String,String>>();
		
		if(!CommonUtils.objectIsNull(param.get("TABLES"))){
			List<Map<String,Object>> tables = (List<Map<String,Object>>)param.get("TABLES");
			for(Map<String, Object> tablesnMap : tables){
				if(tablesnMap.get("TABLENAME").equals("UR_USERPRC_INFO")){
					List<Map<String,Object>> datarecords = (List<Map<String,Object>>)tablesnMap.get("DATARECORDS");
					System.out.println(datarecords.toString());
					for(Map<String,Object> datarecordsMap : datarecords){
						if(datarecordsMap.get("OP").equals("I")){
							Map<String,String> closMap = (Map<String,String>)datarecordsMap.get("COLS");
								String prodPrcid = (String)closMap.get("PROD_PRCID");
								String idNo = String.valueOf(closMap.get("ID_NO"));
								String orderDate = (String)closMap.get("ORDER_DATE");
								System.out.println("--------------"+prodPrcid+"-------"+idNo+"********"+orderDate);
								inParam.put("prodPrcid", prodPrcid);
								inParam.put("idNo", idNo);
						}
					}
				}
			}
		}
		
   }
}
