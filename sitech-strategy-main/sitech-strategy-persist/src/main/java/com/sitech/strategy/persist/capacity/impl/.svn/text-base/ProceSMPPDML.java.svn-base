package com.sitech.strategy.persist.capacity.impl;

import java.io.Serializable;
import java.util.Map;

import com.sitech.strategy.persist.base.BaseMessageDB;

/**
 * Create on 2017-1-20
 * @author: wangpei
 * @Title:ProceSMPPDML
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public class ProceSMPPDML extends BaseMessageDB implements ISMPPDML,Serializable{

	/** 
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: bindLink  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void bindLink() {
		sMPPUtil.bindLink();
	}

	/** 判断连接是否断开,返回int=0表示连接正常
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: checkStatus 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public int checkStatus() {
		return sMPPUtil.checkStatus();
	}

	/**  断开连接 
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: unbindLink  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void unbindLink() {
		sMPPUtil.unbindLink();
	}

	/** 用SMPP协议发送信息
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: send 
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public void send(Map<String, Object> tempInParam) {
		sMPPUtil.sendMsg((String)tempInParam.get("sendContent"), (String)tempInParam.get("phoneNo"),(String)tempInParam.get("sendPort"));
	}

}
