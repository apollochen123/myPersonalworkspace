package com.sitech.strategy.recommend.entity.impl.extend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IMarketCasePacketPojo;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.recommend.entity.impl.ParseRecommendEntity;
import com.sitech.strategy.recommend.entity.inter.IParseRecommendEntity;

/**
 * 推荐解析实体
* @date: 2016-9-5 
* @author: sunliang 
* @title: ParseEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ParseRecommendEntityByHBMob extends ParseRecommendEntity implements IParseRecommendEntity,Serializable{
/*	*//**
	 * 解析渠道触发推荐
	* @date: 2016-11-26 
	* @author: zhangqi 
	* @title: parseChannelTriggerRecommend 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 *//*
	@Override
	public Map<String, Object> parseChannelTriggerRecommend(Map<String, Object> inParam) throws StrategyError{
		//插入接触（用户访问量）
		String seqId = this.insertUserContactRecord(inParam);
		//获得推荐营销案列表
		Map<String, Object> marketCasePacketPojoMap = recommedAlgo.getRecommedMarketCaseHBList(inParam);
		//解析
		Map<String, Object> outParam = this.parsePacketMarketCaseMap(inParam,marketCasePacketPojoMap);
		//记录推荐量
		//this.recordRecommendWSInfo(inParam, outParam, seqId);
		return outParam;
	}*/
	
	/**
	 * 
	* @date: 2016-11-21 
	* @author: zhangqia
	* @title: parsePacketMarketCaseMap 
	* @param inParam，marketCasePacketPojoMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	/*protected Map<String, Object> parsePacketMarketCaseMap(Map<String, Object> inParam,Map<String, Object> marketCasePacketPojoMap){
		Map<String, Object> outParam = new HashMap<String, Object>();
		Map<String, Object> positionMap = (Map<String, Object>) marketCasePacketPojoMap.get("positionInfoMap");
		List<Map<String, Object>> positionIdList = (List<Map<String, Object>>)inParam.get("positionIdList");
		List<String> actIdList = new ArrayList<String>();
		List<String> positionInfoList = new ArrayList<String>();
		//解析运营位下的营销案内容
		for(Map<String, Object> positionInfoMap : positionIdList){
			List<IMarketCasePacketPojo> returnMarketCasePacketPojoList =(List<IMarketCasePacketPojo>) positionMap.get((String)positionInfoMap.get("positionId"));
			for(IMarketCasePacketPojo marketCasePacketPojo : returnMarketCasePacketPojoList){
				Map<String, Object> marketCaseBasicList =(Map<String, Object>) marketCasePacketPojo.getMarketCaseBasic().get("marketCaseBasic");
				List<Map<String, Object>> marketCaseContentList =(List<Map<String, Object>>) marketCasePacketPojo.getContentMap().get("marketCaseContent");
				for(Map<String, Object> marketCaseContent:marketCaseContentList ){
					List<Map<String, Object>> params =(List<Map<String, Object>>) marketCaseContent.get("params");
					for(Map<String, Object> param:params){
						positionInfoList.add((String) param.get("contentParValue"));
					}
				}
				actIdList.add((String)marketCaseBasicList.get("marketCaseId"));
				
			}
		}
		outParam.put(Const.PACKET_PARAM_NODE_POSITION_INFO_LIST, positionInfoList);
		outParam.put(Const.PACKET_PARAM_NODE_ACT_LIST, actIdList);
		return outParam;
	}*/
}
