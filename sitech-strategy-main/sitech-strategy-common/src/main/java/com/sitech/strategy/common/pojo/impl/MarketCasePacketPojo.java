package com.sitech.strategy.common.pojo.impl;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.IMarketCasePacketPojo;

/**
 * 推荐营销案内容报文对象
* @date: 2016-9-5 
* @author: sunliang 
* @title: MarketCasePacketPojo 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class MarketCasePacketPojo extends BaseClass implements IMarketCasePacketPojo{
	/**
	 * 营销案内容
	 */
	protected Map<String,Object> contentMap;
	/**
	 * 接触控制
	 */
	protected Map<String,Object> channelTouchControl;
	/**
	 * 接触控制
	 */
	protected List<Map<String,String>> globalTouchControl;
	/**
	 * 标签信息
	 */
	protected Map<String,String> labelInfo;
	/**
	 * 营销案基本信息
	 */
	protected Map<String,Object> marketCaseBasic;
	/**
	 * 
	* @date: 2016-9-15 
	* @author: sunliang 
	* @title: getContentMap 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getContentMap() {
		return contentMap;
	}
	
	/** 
	 * @date: 2017-2-13 
	 * @author: wangpei
	 * @title: getChannelTouchControl 
	 * @return the channelTouchControl
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	@Override
	public Map<String,Object> getChannelTouchControl() {
		return channelTouchControl;
	}

	/**
	 * 
	* @date: 2017-2-11 
	* @author: sunliang 
	* @title: getGolbalTouchControl 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, String>> getGlobalTouchControl() {
		return globalTouchControl;
	}
	
	/**
	 * 
	* @date: 2016-10-18 
	* @author: yangwl
	* @title: getLabelInfo 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, String> getLabelInfo() {
		return labelInfo;
	}
	
	/**
	 * 
	* @date: 2016-9-20 
	* @author: zhaoyue
	* @title: getMarketCaseBasic 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getMarketCaseBasic() {
		return marketCaseBasic;
	}
	
	/**
	 * 
	* @date: 2016-9-15 
	* @author: sunliang 
	* @title: setContentMap 
	* @param contentMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setContentMap(Map<String, Object> contentMap) {
		this.contentMap = contentMap;
	}
	
	/** 
	* @date: 2017-2-13 
	* @author: wangpei
	* @title: setChannelTouchControl 
	* @param channelTouchControl 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void setChannelTouchControl(Map<String,Object> channelTouchControl) {
		this.channelTouchControl = channelTouchControl;
	}

	/**
	 * 
	* @date: 2017-2-11 
	* @author: sunliang 
	* @title: setGolbalTouchControl 
	* @param golbalTouchControl 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setGlobalTouchControl(List<Map<String, String>> globalTouchControl) {
		this.globalTouchControl = globalTouchControl;
	}
	
	/**
	 * 
	* @date: 2016-10-18 
	* @author: yangwl
	* @title: setLabelInfo 
	* @param labelInfo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setLabelInfo(Map<String, String> labelInfo) {
		this.labelInfo = labelInfo;
	}

	/**
	 * 
	* @date: 2016-9-20 
	* @author: zhaoyue
	* @title: setMarketCaseBasic 
	* @param marketCaseBasic 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseBasic(Map<String, Object> marketCaseBasic) {
		this.marketCaseBasic = marketCaseBasic;
	}
	
}
