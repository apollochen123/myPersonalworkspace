package com.sitech.strategy.manage.entity.inter;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 登录(权限、角色、菜单)实体
* @date: 2016-9-5 
* @author: tangaq
* @title: ILoginManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ILoginManageEntity {
	
	/** 获取登录信息
	* @date: 2016-10-27 
	* @author: wangpei
	* @title: getLoginMsg 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String, Object> getLoginMsg(Map<String, Object> inParam) throws StrategyError;

	/**
	 * 查询工号列表
	* @date: 2016-10-26 
	* @author: xiongxq
	* @Title: queryLoginNoList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryLoginNoList(Map<String,Object> inParam) 
			throws StrategyError;
		
	/**
	 * 查询菜单详细信息
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: queryMenuDetailById 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryMenuDetailById(Map<String, Object> inParam) throws StrategyError;

	/**
	 * 查询菜单列表
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: queryMenuList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryMenuList(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 通过工号查询菜单列表
	* @date: 2016-10-29 
	* @author: fangyuan_crmpd
	* @title: queryMenuListByLoginNo 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryMenuListByLoginNo(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 查询角色列表
	* @date: 2016-10-26 
	* @author: wangth
	* @Title: queryRoleList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryRoleList(Map<String,Object> inParam)throws StrategyError;
	
	/**
	 *根据工号查询角色列表 
	* @date: 2016-10-27 
	* @author: xiongxq
	* @Title: queryRoleListByLoginNo 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryRoleListByLoginNo(Map<String,Object> inParam)throws StrategyError;

	/**
	 * 查询角色与菜单关系列表
	* @date: 2016-10-28 
	* @author: zhangjj_crmpd
	* @title: queryRoleMenuRelList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryRoleMenuRelList(Map<String,Object> inParam)throws StrategyError;

	/**
	 * 查询用户 和角色关系列表
	* @date: 2016-10-27 
	* @author: wangth
	* @Title: queryRoleUserRelList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryRoleUserRelList(Map<String,Object> inParam)throws StrategyError;
	
	/**
	 * 删除菜单
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: removeMenuById 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeMenuById(Map<String, Object> inParam) throws StrategyError; 
	
	/**
	 * 移除角色信息
	* @date: 2016-10-26 
	* @author: wangth
	* @Title: removeRole 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeRole(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 删除角色与菜单关系
	* @date: 2016-10-28 
	* @author: zhangjj_crmpd
	* @title: removeRoleMenuRel 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeRoleMenuRel(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 移除用户和角色的关系
	* @date: 2016-10-27 
	* @author: wangth
	* @Title: removeRoleUserRel 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeRoleUserRel(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 保存菜单详细信息
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: saveMenuDetail 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveMenuDetail(Map<String, Object> inParam) throws StrategyError; 
	
	/**
	 * 保存角色信息
	* @date: 2016-10-26 
	* @author: wangth
	* @Title: saveRole 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveRole(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 保存角色与菜单关系
	* @date: 2016-10-28 
	* @author: zhangjj_crmpd
	* @title: saveRoleMenuRel 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveRoleMenuRel(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 添加用户和角色色关系
	* @date: 2016-10-27 
	* @author: wangth
	* @Title: saveRole 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveRoleUserRel(Map<String,Object> inParam) throws StrategyError;
	/**
	 * 修改工号密码
	* @date: 2016-11-30 
	* @author: yuanliang
	* @title: updateLoginPassword 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public int updateLoginPassword(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 修改菜单详细信息
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: updateMenuDetail 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateMenuDetail(Map<String, Object> inParam) throws StrategyError; 
	
	/**
	 * 更新角色信息
	* @date: 2016-10-26 
	* @author: wangth
	* @Title: updateRole 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateRole(Map<String,Object> inParam) throws StrategyError;	
	/**
	 * 保存工号
	* @date: 2017-1-22 
	* @author: hannn
	* @title: saveLoginNo 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveLoginNo(Map<String,Object> inParam) throws StrategyError;
}
