package com.sitech.strategy.manage.service.jcf.inter;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;

/**
 * 登录(权限、角色、菜单)
* @date: 2016-9-5 
* @author: sunliang
* @title: ILoginManageService 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ILoginManageService {
	
	/** 校验登录信息
	* @date: 2016-10-27 
	* @author: wangpei
	* @title: getLoginMsg 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public OutDTO getLoginMsg(InDTO inDTO);
	
	/**
	 * 查询工号列表
	* @date: 2016-10-26 
	* @author: xiongxq
	* @Title: queryLoginNoList 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryLoginNoList(InDTO inDTO);
	
	/**
	 * 查询菜单详情
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: queryMenuDetailById 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryMenuDetailById(InDTO inDTO);

	/**
	 * 查询菜单列表
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: queryMenuList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryMenuList(InDTO inDTO);
	
	/**
	 * 通过工号查询菜单列表
	* @date: 2016-10-29 
	* @author: fangyuan_crmpd
	* @title: queryMenuListByLoginNo 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryMenuListByLoginNo(InDTO inDTO);

	/**
	 * 查询角色列表
	* @date: 2016-10-26 
	* @author: wangth
	* @Title: queryRoleList 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryRoleList(InDTO inDTO);
	
	/**
	 *根据工号查询角色列表 
	* @date: 2016-10-27 
	* @author: xiongxq
	* @Title: queryRoleListByLoginNo 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryRoleListByLoginNo(InDTO inDTO);

	/**
	 * 查询角色和菜单关系列表
	* @date: 2016-10-28 
	* @author: zhangjj_crmpd
	* @title: queryRoleMenuRelList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryRoleMenuRelList(InDTO inDTO);
	
	/**
	 * 查询用户和角色关系列表
	* @date: 2016-10-27 
	* @author: wangth
	* @Title: queryRoleList 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryRoleUserRelList(InDTO inDTO);
	
	/**
	 * 删除菜单
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: removeMenuById 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO removeMenuById(InDTO inDTO);
	
	/**
	 * 移除角色
	* @date: 2016-10-26 
	* @author: wangth
	* @Title: removeRole 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO removeRole(InDTO inDTO);
	
	/**
	 * 删除角色与菜单关系
	* @date: 2016-10-28 
	* @author: zhangjj_crmpd
	* @title: removeRoleUserRel 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO removeRoleMenuRel(InDTO inDTO);
	
	/**
	 * 移除角色和用户关系
	* @date: 2016-10-27 
	* @author: wangth
	* @Title: removeRole 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO removeRoleUserRel(InDTO inDTO);
	
	/**
	 * 保存菜单详细信息
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: saveMenuDetail 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO saveMenuDetail(InDTO inDTO);

	/**
	 * 保存角色信息
	* @date: 2016-10-26 
	* @author: wangth
	* @Title: saveRole 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO saveRole(InDTO inDTO);
	/**
	 * 保存工号信息
	* @date: 2017-1-22 
	* @author: hannn
	* @title: saveLoginNo 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO saveLoginNo(InDTO inDTO);
	/**
	 * 保存角色与菜单关系
	* @date: 2016-10-28 
	* @author: zhangjj_crmpd
	* @title: saveRoleMenuRel 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO saveRoleMenuRel(InDTO inDTO);
	
	/**
	 * 保存角色和用户关系
	* @date: 2016-10-27 
	* @author: wangth
	* @Title: saveRole 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO saveRoleUserRel(InDTO inDTO);
	
	/**
	 * 修改工号密码
	* @date: 2016-11-30 
	* @author: yuanliang
	* @title: updateLoginPassword 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO updateLoginPassword(InDTO inDTO);

	/**
	 * 修改菜单详细信息
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: updateMenuDetail 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO updateMenuDetail(InDTO inDTO);
	
	/**
	 * 更新角色信息
	* @date: 2016-10-26 
	* @author: wangth
	* @Title: updateRole 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO updateRole(InDTO inDTO);
}
