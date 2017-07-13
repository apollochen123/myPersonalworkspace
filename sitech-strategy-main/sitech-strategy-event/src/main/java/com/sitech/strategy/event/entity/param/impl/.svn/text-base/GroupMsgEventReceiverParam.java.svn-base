package com.sitech.strategy.event.entity.param.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.JsonUtil;
import com.sitech.strategy.event.base.BaseClass;
import com.sitech.strategy.event.entity.param.inter.IGroupMsgEventReceiverParam;

/**
 * Create on 2017-1-20
 * @author: wangpei
 * @Title:GroupMsgEventReceiverParam
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public class GroupMsgEventReceiverParam extends BaseClass implements IGroupMsgEventReceiverParam,Serializable{



	/**
	 * 接收宽带密码服务消息入参处理
	* @date: 2017-3-10 
	* @author: tangaq
	* @title: recevicerBroadbandPasswordSerivceInParam 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> recevicerBroadbandPasswordSerivceInParam(
			Object inParam) {
		log.info("show receiveAcceptCoupleBackInParam", inParam);
		Map<String,Object> root = JsonUtil.JsonStrToMap((String)inParam);
        Map<String,Object> inMap = new HashMap<String,Object>();
		String lantId = (String)root.get("LATN_ID");
		String userAccount = (String)root.get("USER_ACCOUNT");
		String mainNbr = (String)root.get("MAIN_NBR");
		String routeUser = (String)root.get("ROUTE_USER");
		String actId = (String)root.get("ACT_ID");
		String idNo = lantId+userAccount;
		
		inMap.put("lantId",lantId);
		inMap.put("userAccount",userAccount);
		inMap.put("mainNbr",mainNbr);
		inMap.put("routeUser",routeUser);
		inMap.put("marketCaseId",actId);
		inMap.put("idNo",idNo);
		inMap.put("flowCode","10001");
		inMap.put("sendContentRoute","您好，根据电信网络维护报告，您账号为"+userAccount+"的宽带上网出现了“密码错误”记录，可能是由于您路由器内设置密码错误导致，为了快速恢复网络，请回复以下文字进行操作：回复文字“同步”代表同步密码，可以将您的上网密码同步为路由器内的错误密码，同步后可直接上网，无需重新配置路由器。回复文字“重置”可重置密码，重置后请按照短信指引重新配置路由器内的密码。");
		inMap.put("sendContent","您好，根据电信网络维护报告，您账号为"+userAccount+"的宽带上网出现了“密码错误”记录，为了快速恢复网络，请回复文字“重置”进行重置密码操作，重置后重新连接可恢复网络 ");

		if(CommonUtils.objectIsNull(mainNbr)){
			return null;
		}else{
			return inMap;
		}
		
		
	}

	/** 
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: receiveGroupMsgEventParam 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> receiveGroupMsgEventParam(Object inParam) {
		Map<String,Object> root = JsonUtil.JsonStrToMap((String)inParam);
		Map<String,Object> res = (Map<String,Object>)root.get("ROOT");
		Map<String,Object> body = (Map<String,Object>)res.get("BODY");
		Map<String,Object> paramMap = new HashMap<String,Object>();
		String total = (String)body.get("TOTEL");
		String latnId = (String)body.get("LATNID");

		String pin = "{ \"TcpCont\": {\"ServiceCode\": \"scc.infoquery.online.SubInstInfo_V1.0\",\"TransactionID\": \"1102001201604191520301232212\",\"SystemCode\": \"1102\",\"SysSubCode\": \"001\", \"SystemSign\": \"SCC110293701\",\"ReqTime\": \"20160419152030\"}, \"SvcCont\": {\"ORDER_INFO\": [{\"PROD_INST\": {\"ACC_NBR\": \""+total+"\",\"LATN_ID\": \""+latnId+"\",\"CODE_TYPE\":\"\",\"MAIN_PROD_INST_ID\":\"\",\"PROD_INST_ID\":\"\",\"OFFER_ID\":\"\",\"PRODUCT_ID\":\"\",\"STATUS_CD\":\"110000,110098\" }}]}}";
		paramMap.put("pin",pin);
		paramMap.put("inParam",root);
		return paramMap;
	}

}
