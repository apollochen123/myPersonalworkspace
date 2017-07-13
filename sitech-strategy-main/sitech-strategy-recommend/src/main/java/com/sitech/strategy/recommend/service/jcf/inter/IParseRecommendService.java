package com.sitech.strategy.recommend.service.jcf.inter;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;

/**
 * 推荐解析服务
* @date: 2016-9-5 
* @author: sunliang 
* @title: IParseService 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IParseRecommendService {
	
	/**
	 * 客户经理任务解析接口
	* @date: 2016-10-19 
	* @author: yangwl
	* @title: parseChannelTaskRecommend 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO parseChannelTaskRecommend(InDTO inDTO);
	
	/**
	 * 实时解析推荐内容
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: parseRecommendContent 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO parseRecommendContent(InDTO inDTO);
	
	/**
	 * 测试事件触发
	* @date: 2017-2-26 
	* @author: sunliang 
	* @title: testEventTrigger 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO testEventTrigger(InDTO inDTO);
	
}
