package com.sitech.strategy.common.pojo.impl.shortmsg;

import java.io.Serializable;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.shortmsg.IShortMsgPojo;

/**
 * 短信相关接口--吉林移动实现
* @date: 2017-2-28
* @author: luogj
* @title: ShortMsgPojoByJLMob 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ShortMsgPojoByJLMob extends BaseClass implements IShortMsgPojo,
		Serializable {

	/**
	 * 推荐短信的模板ID
	 * */
	public static final String TEMPLATE_ID = new String("27777012");

	@Override
	public String getTemplateId() {
		return TEMPLATE_ID;
	}
	
}
