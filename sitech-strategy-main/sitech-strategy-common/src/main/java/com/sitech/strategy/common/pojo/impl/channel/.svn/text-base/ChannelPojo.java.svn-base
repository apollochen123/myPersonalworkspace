package com.sitech.strategy.common.pojo.impl.channel;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.channel.IChannelPojo;
import com.sitech.strategy.common.pojo.inter.regioncode.IRegionCodePojo;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 渠道pojo
* @date: 2016-12-20 
* @author: sunliang 
* @title: ChannelPojo 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ChannelPojo extends BaseClass implements IChannelPojo,Serializable {
	
	/**
	 * 地市编码对象
	 */
	protected IRegionCodePojo regionCodePojo;

	/**
	 * 
	* @date: 2017-2-28 
	* @author: sunliang 
	* @title: setRegionCodePojo 
	* @param regionCodePojo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRegionCodePojo(IRegionCodePojo regionCodePojo) {
		this.regionCodePojo = regionCodePojo;
	}

	/**
	 * 通过渠道ID得到场景类型
	* @date: 2016-12-20 
	* @author: sunliang 
	* @title: getSceneTypeByChannelId 
	* @param channelId
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getSceneTypeByChannelId(String channelId) {
		String sceneType = "";
		if("14".equals(channelId) || "01".equals(channelId) || "13".equals(channelId)){
			sceneType = "01";
		}else if("08".equals(channelId)){
			sceneType = "02";
		}else if("15".equals(channelId)){
			sceneType = "03";
		}else if("17".equals(channelId) || "16".equals(channelId)|| "23".equals(channelId)){
			sceneType = "04";
		}else if("06".equals(channelId) || "10".equals(channelId)){
			sceneType = "05";
		} else if ("18".equals(channelId) || "19".equals(channelId)
				|| "25".equals(channelId) || "21".equals(channelId)
				|| "20".equals(channelId) || "09".equals(channelId)
				|| "11".equals(channelId) || "07".equals(channelId)
				|| "03".equals(channelId) || "04".equals(channelId)) {
			sceneType = "06";
		}
		
		return sceneType;
	}

	/**
	 * 得到渠道展示数量
	* @date: 2017-2-28 
	* @author: sunliang 
	* @title: getChannelShowNum 
	* @param channelShowNumList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getChannelShowNum(Map<String,Object> inParam,List<Map<String, Object>> channelShowNumList) {
		Map<String, Object> retMap = new HashMap<String, Object>();
		
		for(Map<String, Object> channelShow : channelShowNumList){
			Map<String, Object> channelShowInfo = new HashMap<String, Object>();
			if(Const.TRUE_INT.equals(channelShow.get("marketCaseFlag"))){
				//分活动列类型，分公司数量控制无作用，有多条数据，按照营销案优先级
				channelShowInfo.put("marketCaseType", channelShow.get("marketCaseType"));
				channelShowInfo.put("areaNo", channelShow.get("areaNo"));
				channelShowInfo.put("checkAreaNo", "0");//校验地市数量
				channelShowInfo.put("totalNo", channelShow.get("totalNo"));
				channelShowInfo.put("checkTotalNo", "0");//校验总数量
				retMap.put((String)channelShow.get("marketCaseType"), channelShowInfo);
			}else{
				//不分活动列类型，分公司数量有作用，有一条数据，先分公司后省公司
				channelShowInfo.put("marketCaseType", channelShow.get("marketCaseType"));
				channelShowInfo.put("areaNo", channelShow.get("areaNo"));
				channelShowInfo.put("checkAreaNo", "0");//校验地市数量
				channelShowInfo.put("totalNo", channelShow.get("totalNo"));
				channelShowInfo.put("checkTotalNo", "0");//校验总数量
				retMap.put("marketCaseType", channelShowInfo);
			}
		}
		
		if (CommonUtils.objectIsNull(retMap.get("marketCaseType"))) {
			Map<String, Object> channelShowDefault = new HashMap<String, Object>();
			//默认展示,地市两个，省公司三个
			channelShowDefault.put("marketCaseType", "");
			channelShowDefault.put("areaNo", Const.CHANNEL_SHOWNUM_REGION);
			channelShowDefault.put("checkAreaNo", "0");//校验地市数量
			channelShowDefault.put("totalNo", Const.CHANNEL_SHOWNUM_TOTAL);
			channelShowDefault.put("checkTotalNo", "0");//校验总数量
			retMap.put("marketCaseType", channelShowDefault);
		}
		return retMap;
	}

	/**
	 * 校验展示数量
	* @date: 2017-2-28 
	* @author: sunliang 
	* @title: isChannelShowNum 
	* @param marketCaseBasicMap
	* @param showNumMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public int isChannelShowNum(Map<String, Object> marketCaseBasicMap,
			Map<String, Object> showNumMap) throws StrategyError {
		int flag = 1;//0-活动不展示服务返回，1-活动展示服务继续，2-活动不展示服务继续
		Map<String, Object> marketCaseBasic = (Map<String, Object>)marketCaseBasicMap.get("marketCaseBasic");
		for(Map.Entry<String, Object> channeInfo : showNumMap.entrySet()){
			//按照地市和省公司配置的条数展示
			if("marketCaseType".equals(channeInfo.getKey())){
				Map<String, Object> channelShowInfo = (Map<String, Object>)channeInfo.getValue();
				int areaNo = Integer.parseInt((String)channelShowInfo.get("areaNo"));
				int checkAreaNo = Integer.parseInt((String)channelShowInfo.get("checkAreaNo"));
				int totalNo = Integer.parseInt((String)channelShowInfo.get("totalNo"));
				int checkTotalNo = Integer.parseInt((String)channelShowInfo.get("checkTotalNo"));
				//省公司
				if(regionCodePojo.getProvinceCode().equals(marketCaseBasic.get("regionCode")) && totalNo-areaNo > checkTotalNo - checkAreaNo){
					checkTotalNo = checkTotalNo + 1;
					channelShowInfo.put("checkTotalNo", String.valueOf(checkTotalNo));
				}else if(!regionCodePojo.getProvinceCode().equals(marketCaseBasic.get("regionCode")) && areaNo > checkAreaNo){
					checkAreaNo = checkAreaNo + 1;
					checkTotalNo = checkTotalNo + 1;
					channelShowInfo.put("checkAreaNo", String.valueOf(checkAreaNo));
					channelShowInfo.put("checkTotalNo", String.valueOf(checkTotalNo));
				}else if(checkTotalNo >= totalNo){
					flag = 0;
					return flag;
				}else{
					flag = 2;
				}
				showNumMap.put("marketCaseType", channelShowInfo);
			}
			//总条数
			if(marketCaseBasic.get("marketCaseType").equals(channeInfo.getKey())){
				Map<String, Object> channelShowInfo = (Map<String, Object>)channeInfo.getValue();
				int totalNo = Integer.parseInt((String)channelShowInfo.get("totalNo"));
				int checkTotalNo = Integer.parseInt((String)channelShowInfo.get("checkTotalNo"));
				if(totalNo > checkTotalNo ){
					checkTotalNo = checkTotalNo + 1;
					channelShowInfo.put("checkTotalNo", String.valueOf(checkTotalNo));
				}else{
					flag = 2;
				}
				showNumMap.put(channeInfo.getKey(), channelShowInfo);
			}
		}
		
		return flag;
	}

}
