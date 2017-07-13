package com.sitech.strategy.common.pojo.impl.shortmsg;

import java.io.Serializable;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.shortmsg.IShortMsgPojo;

/**
 * 短信相关接口--空实现
* @date: 2017-2-28
* @author: luogj
* @title: ShortMsgPojoByJLMob 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ShortMsgPojo extends BaseClass implements IShortMsgPojo,
		Serializable {

	@Override
	public String getTemplateId() {
		return "";
	}
	
}
