package com.sitech.strategy.manage.entity.param.inter;

import java.util.Map;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;

/**
 * 用户参数转换
* @date: 2016-9-14 
* @author: fangyuan_crmpd
* @title: IUserManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IUserManageParam {
	
	/**
	 *查询异网号码池列表入参处理 
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: queryDifferentNetPhonePoolListInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryDifferentNetPhonePoolListInParam(InDTO inDTO);

	/**
	 * 查询异网号码池列表出参处理 
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: queryDifferentNetPhonePoolListOutParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryDifferentNetPhonePoolListOutParam(Map<String,Object> outParam);

	/**
	 * 查询灰名单列表入参处理
	* @date: 2016-10-15 
	* @author: xiongxq
	* @Title: queryGreyListInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryGreyListInParam(InDTO inDTO);
	
	/**
	 * 查询灰名单列表出参处理
	* @date: 2016-10-15 
	* @author: xiongxq
	* @Title: queryGreyListOutParam 
	* @param inMap
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryGreyListOutParam(Map<String,Object> inMap);
	
	/**
	 * 查询用户回单记录入参处理
	* @date: 2017-3-12 
	* @author: wuJiaFu
	* @title: queryReceiptRecordListInParam 
	* @param inDTO
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryReceiptRecordListInParam(InDTO inDTO) throws StrategyError;
	
	/**
	 * 查询用户回单记录出参处理
	* @date: 2017-3-12 
	* @author: wuJiaFu
	* @title: queryReceiptRecordListOutParam 
	* @param inMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryReceiptRecordListOutParam(Map<String,Object> inMap);
	/**
	 * 查询用户推荐记录信息入参处理
	* @date: 2017-2-13 
	* @author: wuJiaFu
	* @title: queryRecommendRecordListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryRecommendRecordListInParam(InDTO inDTO) throws StrategyError;
	
	/**
	 * 查询用户推荐记录出参处理
	* @date: 2017-2-13 
	* @author: wuJiaFu
	* @title: queryRecommendRecordListOutParam 
	* @param inMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryRecommendRecordListOutParam(Map<String,Object> inMap);
	
	/**
	 * 查询用户资料入参处理
	* @date: 2016-11-7 
	* @author: fangyuan_crmpd
	* @title: queryUserDataListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryUserDataListInParam(InDTO inDTO);
	
	/**
	 * 查询用户资料出参处理
	* @date: 2016-11-7 
	* @author: fangyuan_crmpd
	* @title: queryUserDataListOutParam 
	* @param inMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryUserDataListOutParam(Map<String,Object> outParam);
	
	
	/**
	 * 查询用户标签列表入参处理
	* @date: 2016-10-19 
	* @author: tangaq
	* @title: queryUserLabelListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryUserLabelListInParam(InDTO inDTO);
	
	/**
	 * 查询用户标签列表出参处理
	* @date: 2016-10-19 
	* @author: tangaq
	* @title: queryUserLabelListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryUserLabelListOutParam(Map<String,Object> outParam);
	
	/**
	 * 删除灰名单入参处理
	* @date: 2016-10-16 
	* @author: xiongxq
	* @Title: removeGreyInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> removeGreyInParam(InDTO inDTO);

	/**
	 * 删除灰名单出参处理
	* @date: 2016-10-16 
	* @author: xiongxq
	* @Title: removeGreyOutParam 
	* @param 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO removeGreyOutParam();
	
	/**
	 *  删除异网号码池入参处理
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: removeDifferentNetPhonePoolInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> removeDifferentNetPhonePoolInParam(InDTO inDTO);
	
	/**
	 *  删除异网号码池出参处理
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: removeDifferentNetPhonePoolOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO removeDifferentNetPhonePoolOutParam();
	
	/**
	 * 删除用户标签入参处理
	* @date: 2016-10-27 
	* @author: fangyuan_crmpd
	* @title: removeUserLabelInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> removeUserLabelInParam(InDTO inDTO);

	/**
	 * 删除用户标签出参处理
	* @date: 2016-10-27 
	* @author: fangyuan_crmpd
	* @title: removeUserLabelOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO removeUserLabelOutParam();

	/**
	 * 批量保存灰名单入参处理
	* @date: 2016-10-16 
	* @author: xiongxq
	* @Title: saveBatchGreyInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> saveBatchGreyInParam(InDTO inDTO);

	/**
	 *批量保存灰名单出参处理 
	* @date: 2016-10-16 
	* @author: xiongxq
	* @Title: saveBatchGreyOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO saveBatchGreyOutParam();
	
	/**
	 * 保存异网号码池  入参处理
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: saveDifferentNetPhonePoolInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> saveDifferentNetPhonePoolInParam(InDTO inDTO);
	
	/**
	 * 保存异网号码池 出参处理
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: saveDifferentNetPhonePoolOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO saveDifferentNetPhonePoolOutParam();
	
	/**
	 * 保存单个灰名单入参处理
	* @date: 2016-10-16 
	* @author: xiongxq
	* @Title: saveSingleGreyInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> saveSingleGreyInParam(InDTO inDTO);

	/**
	 *保存单个灰名单出参处理 
	* @date: 2016-10-16 
	* @author: xiongxq
	* @Title: saveSingleGreyOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO saveSingleGreyOutParam();

	/**
	 * 新增用户标签入参处理
	* @date: 2016-10-24 
	* @author: fangyuan_crmpd
	* @title: saveUserLabelInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> saveUserLabelInParam(InDTO inDTO);
	
	/**
	 * 新增用户标签出参处理
	* @date: 2016-10-24 
	* @author: fangyuan_crmpd
	* @title: saveUserLabelOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO saveUserLabelOutParam();
	
	/**
	 * 修改灰名单入参处理
	* @date: 2016-10-16 
	* @author: xiongxq
	* @Title: updateGreyInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> updateGreyInParam(InDTO inDTO);
	
	/**
	 * 修改灰名单出参处理
	* @date: 2016-10-16 
	* @author: xiongxq
	* @Title: updateGreyOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO updateGreyOutParam();
	
	/**
	 * 修改异网号码池入参处理 
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: updateDifferentNetPhonePoolInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> updateDifferentNetPhonePoolInParam(InDTO inDTO);
	
	/**
	 * 修改异网号码池出参处理 
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: updateDifferentNetPhonePoolOutParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO updateDifferentNetPhonePoolOutParam(Map<String,Object> outParam);
	
	/**
	 * 更新用户标签入参处理
	* @date: 2016-10-27 
	* @author: fangyuan_crmpd
	* @title: updateUserLabelInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> updateUserLabelInParam(InDTO inDTO);
	
	/**
	 * 更新用户标签出参处理
	* @date: 2016-10-27 
	* @author: fangyuan_crmpd
	* @title: updateUserLabelOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO updateUserLabelOutParam();
}
