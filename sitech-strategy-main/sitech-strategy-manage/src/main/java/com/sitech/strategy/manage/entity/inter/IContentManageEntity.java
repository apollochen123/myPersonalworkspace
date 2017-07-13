package com.sitech.strategy.manage.entity.inter;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 内容实体
* @date: 2016-9-5 
* @author: sunliang
* @title: IContentManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IContentManageEntity {
	
	/** 查询规则明细
	* @date: 2016-10-18 
	* @author: wangpei
	* @title: queryContentDetailByDetailId 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,Object> queryContentDetailByDetailId(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询营销用语模板列表
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: queryMarketTermTempList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryMarketTermTempList(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询产品列表
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: queryProdList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryProdList(Map<String,Object> inParam) throws StrategyError;
	/**
	 * 查询问卷调查列表
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: queryQuestionNaireList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryQuestionNaireList(Map<String, Object> inParam) throws StrategyError;
	/**
	 * 根据主键查询问卷调查信息
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: queryQuestionNaireById 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryQuestionNaireById(Map<String,Object> inParam) throws StrategyError;
	/** 删除运营位内容
	* @date: 2016-10-18 
	* @author: wangpei
	* @title: removePositionAndContent 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void removePositionAndContent(Map<String,Object> inParam) throws StrategyError;	

	/** 保存内容及运营位
	* @date: 2016-10-18 
	* @author: wangpei
	* @title: saveContentInfoByPosition 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,Object> saveContentInfoByPosition(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 保存事件或渠道下的运营位信息
	* @date: 2017-2-23 
	* @author: zhangyw_crmpd
	* @title: saveContentInfoForEventOrChannel 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> saveContentInfoForEventOrChannel(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 保存营销用语模板
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: saveMarketTermTemp 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveMarketTermTemp(Map<String,Object> inParam) throws StrategyError;	
}

