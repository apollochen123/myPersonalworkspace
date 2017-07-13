package com.sitech.strategy.manage.entity.param.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.ILoginManageParam;

/**
 * 登录(权限、角色、菜单)参数转换
* @date: 2016-9-14 
* @author: fangyuan_crmpd
* @title: LoginManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class LoginManageParam implements ILoginManageParam {
	
	/** 获取登录信息数据入参
	* @date: 2016-10-27 
	* @author: wangpei
	* @title: getLoginMsgInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> getLoginMsgInParam(InDTO inDTO) {
		Map<String, Object> body = inDTO.getMbean().getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("loginNo", body.get("LOGIN_NO"));
		return inParam;
	}

	/** 获取登录信息数据出参
	* @date: 2016-10-27 
	* @author: wangpei
	* @title: getLoginMsgOutParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public StandardOutDTO getLoginMsgOutParam(Map<String,Object> outParam) {
		StandardOutDTO outDTO = new StandardOutDTO();
		MBean out = new MBean();
		Map<String,Object> param = new HashMap<String, Object>();
		if (!CommonUtils.objectIsNull(outParam)) {
			param.put("LOGIN_NO", outParam.get("loginNo"));
			param.put("LOGIN_NAME", outParam.get("loginName"));
			param.put("REGION_CODE", outParam.get("regionCode"));
			param.put("GROUP_ID", outParam.get("groupId"));
			param.put("GROUP_CODE", outParam.get("groupCode"));
			param.put("GROUP_NAME", outParam.get("groupName"));
			param.put("LEVEL_CODE", outParam.get("levelCode"));	
			param.put("PHONE", outParam.get("phone"));
			param.put("PASSWORD", outParam.get("password"));
		}
		out.setBody("LOGIN_MSG",param);
		outDTO.setBean(out);
		return outDTO;
	}

	/** 
	 * 查询工号列表入参处理
	* @date: 2016-10-26 
	* @author: xiongxq
	* @Title: queryLoginNoListInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryLoginNoListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("loginNo",inMap.get("LOGIN_NO")==null?"":inMap.get("LOGIN_NO"));
		outMap.put("loginName", inMap.get("LOGIN_NAME")==null?"":inMap.get("LOGIN_NAME"));
		outMap.put("regionCode", inMap.get("REGION_CODE")==null?"":inMap.get("REGION_CODE"));
		outMap.put("sortFlag", inMap.get("SORT_FLAG"));
		outMap.put("sortField", inMap.get("SORT_FIELD"));
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_LOGIN);
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("queryId", inMap.get("QUERY_ID"));
		return outMap;
	}

	/** 
	 *查询工号列表出参处理 
	* @date: 2016-10-26 
	* @author: xiongxq
	* @Title: queryLoginNoListOutParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO queryLoginNoListOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		List<Map<String,Object>> numberList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> outList = (List<Map<String, Object>>) outParam.get("loginList");
		if(CommonUtils.objectIsNull(outList) == false){
			for(Map<String,Object> basic : outList){
				Map<String,Object> numberMap = new HashMap<String,Object>();
				numberMap.put("LOGIN_NO", basic.get("loginNo"));
				numberMap.put("LOGIN_NAME", basic.get("loginName"));
				numberMap.put("GROUP_NAME", basic.get("groupName"));
				numberMap.put("REGION_CODE", basic.get("regionCode"));
				numberMap.put("USER_ID", basic.get("userId"));
				numberMap.put("GROUP_ID", basic.get("groupId"));
				numberMap.put("GROUP_CODE", basic.get("groupCode"));
				numberMap.put("PHONE", basic.get("phone"));
				numberMap.put("LEVEL_CODE", basic.get("levelCode"));
				numberList.add(numberMap);
			}
		}
		outMap.put("LOGIN_NUMBER_LIST",numberList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 查询菜单详细信息入参处理
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: queryMenuDetailByIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryMenuDetailByIdInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("menuId", inMap.get("MENU_ID"));
		return inParam;
	}

	/**
	 * 查询菜单详细信息出参处理
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: queryMenuDetailByIdOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryMenuDetailByIdOutParam(
			Map<String, Object> outParam) {
		List<Map<String,Object>> list = (List<Map<String, Object>>) outParam.get("queryMenuDetailById");
		List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
		if(CommonUtils.objectIsNull(list) == false){
			for(Map<String, Object> inMap : list){
			Map<String,Object> outMap = new HashMap<String,Object>();
			outMap.put("MENU_ID", inMap.get("menuId"));
			outMap.put("MENU_NAME", inMap.get("menuName"));
			outMap.put("MENU_LEVEL", inMap.get("menuLevel"));
			outMap.put("PARENT_MENU_ID", inMap.get("parentMenuId"));
			outMap.put("MENU_ORDER", inMap.get("menuOrder"));
			outMap.put("LINK_URL", inMap.get("linkUrl"));
			outMap.put("MENU_STATUS", inMap.get("menuStatus"));
			outMap.put("MENU_TYPE", inMap.get("menuType"));
			outMap.put("ICON_NAME", inMap.get("iconName"));
			outMap.put("MENU_DESC", inMap.get("menuDesc"));
			outMap.put("PARENT_MENU_NAME", inMap.get("parentMenuName"));
			outList.add(outMap);
			}	
		}
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean bean = new MBean();
		bean.setBody("QUERY_MENU_DETAIL_LIST", outList);
		standardOutDTO.setBean(bean);
		return standardOutDTO;
	}

	/**
	 * 查询菜单列表入参处理
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: queryMenuListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryMenuListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("roleId", inMap.get("ROLE_ID"));
		inParam.put("loginNo", inMap.get("LOGIN_NO"));
		return inParam;
	}
	
	/**
	 * 查询菜单列表出参处理
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: queryMenuListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryMenuListOutParam(Map<String, Object> outParam) {
		List<Map<String, Object>> inList =  (List<Map<String, Object>>) outParam.get("queryMenuList"); 
		List<Map<String, Object>> roleMenuList =  (List<Map<String, Object>>) outParam.get("queryRoleMenuList"); 
		List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> outRoleMenuList = new ArrayList<Map<String, Object>>();
		if(CommonUtils.objectIsNull(inList) == false){
			for(Map<String, Object> inMap : inList){
			Map<String,Object> outMap = new HashMap<String,Object>();
			outMap.put("MENU_ID", inMap.get("menuId"));
			outMap.put("MENU_NAME", inMap.get("menuName"));
			outMap.put("MENU_LEVEL", inMap.get("menuLevel"));
			outMap.put("PARENT_MENU_ID", inMap.get("parentMenuId"));
			outMap.put("MENU_ORDER", inMap.get("menuOrder"));
			outMap.put("LINK_URL", inMap.get("linkUrl"));
			outMap.put("MENU_STATUS", inMap.get("menuStatus"));
			outMap.put("MENU_TYPE", inMap.get("menuType"));
			outMap.put("ICON_NAME", inMap.get("iconName"));
			outMap.put("MENU_DESC", inMap.get("menuDesc"));
			outMap.put("PARENT_MENU_NAME", inMap.get("parentMenuName"));
			outList.add(outMap);
			}	
		}
		if(!CommonUtils.objectIsNull(roleMenuList)){
			for(Map<String, Object> inMap : roleMenuList){
				Map<String,Object> outMap = new HashMap<String,Object>();
				outMap.put("MENU_ID", inMap.get("menuId"));
				outMap.put("ROLE_ID", inMap.get("roleId"));
				outRoleMenuList.add(outMap);
			}
		}
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean bean = new MBean();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("QUERY_MENU_LIST", outList);
		map.put("QUERY_ROLE_MENU_LIST", outRoleMenuList);
		bean.setBody(map);
		standardOutDTO.setBean(bean);
		return standardOutDTO;
	}
	
	/**
	 * 通过工号查询菜单列表入参处理
	* @date: 2016-10-29 
	* @author: fangyuan_crmpd
	* @title: queryMenuListByLoginNoInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryMenuListByLoginNoInParam(InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String, Object> inMap = bean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("loginNo", inMap.get("LOGIN_NO"));
		return inParam; 
	}

	/**
	 * 通过工号查询菜单列表出参处理
	* @date: 2016-10-29 
	* @author: fangyuan_crmpd
	* @title: queryMenuListByLoginNoOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryMenuListByLoginNoOutParam(
			Map<String, Object> outParam) {
		List<Map<String, Object>> inList =  (List<Map<String, Object>>) outParam.get("queryMenuListByLoginNo"); 
		List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
		if(CommonUtils.objectIsNull(inList) == false){
			for(Map<String, Object> inMap : inList){
			Map<String,Object> outMap = new HashMap<String,Object>();
			outMap.put("MENU_ID", inMap.get("menuId"));
			outMap.put("MENU_NAME", inMap.get("menuName"));
			outMap.put("MENU_LEVEL", inMap.get("menuLevel"));
			outMap.put("PARENT_MENU_ID", inMap.get("parentMenuId"));
			outMap.put("MENU_ORDER", inMap.get("menuOrder"));
			outMap.put("LINK_URL", inMap.get("linkUrl"));
			outMap.put("MENU_STATUS", inMap.get("menuStatus"));
			outMap.put("MENU_TYPE", inMap.get("menuType"));
			outMap.put("ICON_NAME", inMap.get("iconName"));
			outMap.put("MENU_DESC", inMap.get("menuDesc"));
			outMap.put("PARENT_MENU_NAME", inMap.get("parentMenuName"));
			outList.add(outMap);
			}	
		}
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean bean = new MBean();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("QUERY_MENU_LIST_BY_LOGIN_NO", outList);
		bean.setBody(map);
		standardOutDTO.setBean(bean);
		return standardOutDTO;
	}

	/**
	 * 根据工号查询角色列表入参处理 
	* @date: 2016-10-27 
	* @author: xiongxq
	* @Title: queryRoleListByLoginNoInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryRoleListByLoginNoInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_ROLEDETAIL);
		outMap.put("queryList", Const.QUERY_LIST_TYPE_ROLEDETAILLIST);
		outMap.put("loginNo", inMap.get("LOGIN_NO"));
		return outMap;
	}

	/**
	 * 根据工号查询角色列表出参处理 
	* @date: 2016-10-27 
	* @author: xiongxq
	* @Title: queryRoleListByLoginNoOutParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO queryRoleListByLoginNoOutParam(Map<String,Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> roleList = (List<Map<String,Object>>)outParam.get("roleList");
		List<Map<String,Object>> roleNotList = (List<Map<String,Object>>)outParam.get("roleNotList");
		List<Map<String,Object>> roleNewList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> roleNotNewList = new ArrayList<Map<String,Object>>();
		if(!CommonUtils.objectIsNull(roleNotList)){
			for(Map<String,Object> map :roleNotList){
				Map<String,Object> noMap = new HashMap<String,Object>();
				noMap.put("ROLE_ID", (String)map.get("roleId"));
				noMap.put("ROLE_NAME", (String)map.get("roleName"));
				noMap.put("ROLE_DESC", (String)map.get("roleDesc"));
				noMap.put("ROLE_TYPE", (String)map.get("roleType"));
				roleNotNewList.add(noMap);
			}
		}
		if(!CommonUtils.objectIsNull(roleList)){
			for(Map<String,Object> map :roleList){
				Map<String,Object> noMap = new HashMap<String,Object>();
				noMap.put("ROLE_ID", (String)map.get("roleId"));
				noMap.put("ROLE_NAME", (String)map.get("roleName"));
				noMap.put("ROLE_DESC", (String)map.get("roleDesc"));
				noMap.put("ROLE_TYPE", (String)map.get("roleType"));
				roleNewList.add(noMap);
			}
		}
		outMap.put("ROLE_LIST", roleNewList);
		outMap.put("ROLE_NOT_LIST", roleNotNewList);
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 删除菜单入参处理
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: removeMenuByIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> removeMenuByIdInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("menuId", inMap.get("MENU_ID"));
		return inParam;
	}
	
	/**
	 * 删除菜单出参处理
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: removeMenuByIdOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO removeMenuByIdOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/** 
	 * 删除角色与用户关系入参处理
	* @date: 2016-10-29 
	* @author: xiongxq
	* @Title: removeRoleUserRelInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> removeRoleUserRelInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> basic = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("loginNo", basic.get("LOGIN_NO"));
		outMap.put("roleId", basic.get("ROLE_ID"));
		return outMap;
	}

	/**
	 * 删除角色与用户 关系出参处理
	* @date: 2016-10-29 
	* @author: xiongxq
	* @Title: removeRoleUserRelOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO removeRoleUserRelOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean mbean = new MBean();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}
	
	/**
	 * 角色入参处理
	* @date: 2016-10-26 
	* @author: wangth
	* @Title: roleInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> roleInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> basic = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("operNo", basic.get("OPER_NO"));
		outMap.put("regionCode", basic.get("REGION_CODE"));
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_ROLE);
		outMap.put("sortFlag", basic.get("SORT_FLAG"));
		outMap.put("sortField", basic.get("SORT_FIELD"));
		outMap.put("queryId", basic.get("QUERY_ID"));
		outMap.put("currentPageCode", basic.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", basic.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", basic.get("TOTAL_RECORD_COUNT"));
		
		if(!CommonUtils.objectIsNull(basic.get("ROLE_ID"))){
			outMap.put("roleId", basic.get("ROLE_ID")==null?"":basic.get("ROLE_ID"));
		}else{
			outMap.put("roleId", SequenceUtil.getSequence());
		}
		outMap.put("roleName", basic.get("ROLE_NAME")==null?"":basic.get("ROLE_NAME"));
		outMap.put("roleType", basic.get("ROLE_TYPE")==null?"":basic.get("ROLE_TYPE"));
		outMap.put("roleDesc", basic.get("ROLE_DESC")==null?"":basic.get("ROLE_DESC"));
		outMap.put("keyWords", basic.get("KEY_WORDS")== null?"":basic.get("KEY_WORDS"));
		outMap.put("operTime", new Date());
		return outMap;
	}
	
	/**
	 * 角色出参处理
	* @date: 2016-10-26 
	* @author: wangth
	* @Title: roleOutParam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO roleOutParam(Map<String, Object> outParam) {
		
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		
		List<Map<String,Object>> roleNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> roleList = (List<Map<String, Object>>) outParam.get("roleList");
		
		if(!CommonUtils.objectIsNull(roleList)){
			  for(Map<String,Object> basic:roleList){
			    Map<String,Object> roleMap = new HashMap<String,Object>();
			    roleMap.put("ROLE_ID", basic.get("roleId"));
			    roleMap.put("ROLE_TYPE", basic.get("roleType"));
			    roleMap.put("ROLE_NAME", basic.get("roleName"));
			    roleMap.put("ROLE_DESC", basic.get("roleDesc"));
			    roleMap.put("OPER_NO", basic.get("operNo"));
			    roleMap.put("OPER_NAME", basic.get("operName"));
			    roleMap.put("OPER_TIME", basic.get("operTime"));
			    roleMap.put("REGION_CODE_NAME", basic.get("regionCodeName"));
			    roleNewList.add(roleMap);
			   }
			}
			outMap.put("ROLE_LIST", roleNewList);
			outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
			outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
			outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
			outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
			
			outBean.setBody(outMap);
			standardOutDTO.setBean(outBean);
			return standardOutDTO;
	}

	/**
	 * 角色和菜单关系入参
	* @date: 2016-10-28 
	* @author: zhangjj_crmpd
	* @title: roleMenuRelInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> roleMenuRelInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> basic = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_ROLEUSERREL);
		outMap.put("sortFlag", basic.get("SORT_FLAG"));
		outMap.put("sortField", basic.get("SORT_FIELD"));
		outMap.put("queryId", basic.get("QUERY_ID"));
		outMap.put("currentPageCode", basic.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", basic.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", basic.get("TOTAL_RECORD_COUNT"));
		
		outMap.put("roleId", basic.get("ROLE_ID")==null?"":basic.get("ROLE_ID"));
		outMap.put("MenuId", basic.get("MENU_ID")==null?"":basic.get("MENU_ID"));
		outMap.put("loginNo", basic.get("LOGIN_NO")==null?"":basic.get("LOGIN_NO"));
		outMap.put("keyWords", basic.get("KEY_WORDS")== null?"":basic.get("KEY_WORDS"));
		
		String menuIds = (String)basic.get("MENU_IDS");
		String [] arr = menuIds.split("@");
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		for(int i=0;i<arr.length;i++){
			String menuId = arr[i];
			Map<String,Object> arrMap = new HashMap<String,Object>();
			arrMap.put("menuId", menuId);
			arrMap.put("roleId", basic.get("ROLE_ID")==null?"":basic.get("ROLE_ID"));
			list.add(arrMap);
		}
		outMap.put("list", list);
		
		return outMap;
	}
	
	
	/**
	 * 角色菜单出参
	* @date: 2016-10-28 
	* @author: zhangjj_crmpd
	* @title: roleMenuRelOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO roleMenuRelOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		
		List<Map<String,Object>> roleUserRelNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> roleMenuRelList = (List<Map<String, Object>>) outParam.get("roleMenuRelList");
		
		if(!CommonUtils.objectIsNull(roleMenuRelList)){
			  for(Map<String,Object> basic:roleMenuRelList){
			    Map<String,Object> roleUserRelMap = new HashMap<String,Object>();
			    roleUserRelMap.put("ROLE_ID", basic.get("roleId"));
			    roleUserRelMap.put("MENU_ID", basic.get("menuId"));
			    roleUserRelNewList.add(roleUserRelMap);
			   }
			}
			outMap.put("ROLEUSERREL_LIST", roleUserRelNewList);
			outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
			outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
			outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
			outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
			
			outBean.setBody(outMap);
			standardOutDTO.setBean(outBean);
			return standardOutDTO;
	}

	/**
	 * 角色和用户关系入参
	* @date: 2016-10-27 
	* @author: wangth
	* @Title: roleUserRelInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> roleUserRelInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> basic = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_ROLEUSERREL);
		outMap.put("sortFlag", basic.get("SORT_FLAG"));
		outMap.put("sortField", basic.get("SORT_FIELD"));
		outMap.put("queryId", basic.get("QUERY_ID"));
		outMap.put("currentPageCode", basic.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", basic.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", basic.get("TOTAL_RECORD_COUNT"));
		
		outMap.put("roleId", basic.get("ROLE_ID")==null?"":basic.get("ROLE_ID"));
		outMap.put("loginNo", basic.get("LOGIN_NO")==null?"":basic.get("LOGIN_NO"));
		outMap.put("keyWords", basic.get("KEY_WORDS")== null?"":basic.get("KEY_WORDS"));
		return outMap;
	}
	
	/**
	 * 角色和用户关系出参
	* @date: 2016-10-27 
	* @author: wangth
	* @Title: roleUserRelOutParam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO roleUserRelOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		
		List<Map<String,Object>> roleUserRelNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> roleUserRelList = (List<Map<String, Object>>) outParam.get("roleUserRelList");
		
		if(!CommonUtils.objectIsNull(roleUserRelList)){
			  for(Map<String,Object> basic:roleUserRelList){
			    Map<String,Object> roleUserRelMap = new HashMap<String,Object>();
			    roleUserRelMap.put("ROLE_ID", basic.get("roleId"));
			    roleUserRelMap.put("LOGIN_NO", basic.get("loginNo"));
			    roleUserRelNewList.add(roleUserRelMap);
			   }
			}
			outMap.put("ROLEUSERREL_LIST", roleUserRelNewList);
			outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
			outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
			outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
			outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
			
			outBean.setBody(outMap);
			standardOutDTO.setBean(outBean);
			return standardOutDTO;
	}

	
	/**
	 * 保存菜单详细信息入参处理
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: saveMenuDetailInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveMenuDetailInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("menuId", SequenceUtil.getSequence());
		inParam.put("menuName", inMap.get("MENU_NAME"));
		inParam.put("menuLevel", inMap.get("MENU_LEVEL"));
		inParam.put("parentMenuId", inMap.get("PARENT_MENU_ID"));
		inParam.put("menuOrder", inMap.get("MENU_ORDER"));
		inParam.put("linkUrl", inMap.get("LINK_URL"));
		inParam.put("menuStatus", inMap.get("MENU_STATUS"));
		inParam.put("menuType", inMap.get("MENU_TYPE"));
		inParam.put("menuDesc", inMap.get("MENU_DESC"));
		return inParam;
	}
	
	/**
	 * 保存菜单详细信息出参处理
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: saveMenuDetailOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveMenuDetailOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 保存角色与用户关系入参处理 
	* @date: 2016-10-29 
	* @author: xiongxq
	* @Title: saveRoleUserRelInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> saveRoleUserRelInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> basic = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		String roleIdArr = (String)basic.get("ROLE_ID_ARR");
		String [] arr = roleIdArr.split(",");
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		for(int i=0;i<arr.length;i++){
			String roleId = arr[i];
			Map<String,Object> arrMap = new HashMap<String,Object>();
			arrMap.put("roleId", roleId);
			arrMap.put("loginNo", basic.get("LOGIN_NO"));
			outList.add(arrMap);
		}
		outMap.put("outList", outList);
		return outMap;
	}

	/** 
	 * 保存角色与用户关系出参处理
	* @date: 2016-10-29 
	* @author: xiongxq
	* @Title: saveRoleUserRelOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO saveRoleUserRelOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean mbean = new MBean();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}
	/**
	 * 入参：修改工号密码
	* @date: 2016-11-30 
	* @author: yuanliang
	* @title: updateLoginPasswordInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> updateLoginPasswordInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("loginNo", inMap.get("LOGIN_NO"));
		inParam.put("oldLoginPassword", inMap.get("OLD_LOGIN_PASSWORD"));
		inParam.put("loginPassword", inMap.get("LOGIN_PASSWORD"));

		return inParam;
	}
	/**
	 * 出参：修改工号密码
	* @date: 2016-11-30 
	* @author: yuanliang
	* @title: updateLoginPasswordOutParam 
	* @param row
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO updateLoginPasswordOutParam(int row) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		outBean.setBody("UPDATE_ROW", row+"");
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}	
	/**
	 * 修改菜单详细信息入参处理
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: updateMenuDetailInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> updateMenuDetailInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("menuId", inMap.get("MENU_ID"));
		inParam.put("menuName", inMap.get("MENU_NAME"));
		inParam.put("menuOrder", inMap.get("MENU_ORDER"));
		inParam.put("linkUrl", inMap.get("LINK_URL"));
		inParam.put("menuStatus", inMap.get("MENU_STATUS"));
		inParam.put("menuType", inMap.get("MENU_TYPE"));
		inParam.put("menuDesc", inMap.get("MENU_DESC"));
		return inParam;
	}
	
	/**
	 * 修改菜单详细信息出参处理
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: updateMenuDetailOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO updateMenuDetailOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	/**
	 * 工号入参
	* @date: 2017-1-22 
	* @author: hannn
	* @title: loginNoInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> loginNoInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> basic = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_ROLE);
		outMap.put("sortFlag", basic.get("SORT_FLAG"));
		outMap.put("sortField", basic.get("SORT_FIELD"));
		outMap.put("queryId", basic.get("QUERY_ID"));
		outMap.put("currentPageCode", basic.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", basic.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", basic.get("TOTAL_RECORD_COUNT"));
		
		outMap.put("loginNo", basic.get("LOGIN_NO")==null?"":basic.get("LOGIN_NO"));
		outMap.put("loginName", basic.get("LOGIN_NAME")==null?"":basic.get("LOGIN_NAME"));
		outMap.put("groupName", basic.get("GROUP_NAME")==null?"":basic.get("GROUP_NAME"));
		outMap.put("regionCode", basic.get("REGION_CODE")== null?"":basic.get("REGION_CODE"));
		outMap.put("userId", basic.get("USER_ID")==null?"":basic.get("USER_ID"));
		outMap.put("groupId", basic.get("GROUP_ID")==null?"":basic.get("GROUP_ID"));
		outMap.put("groupCode", basic.get("GROUP_CODE")== null?"":basic.get("GROUP_CODE"));
		outMap.put("phone", basic.get("PHONE")== null?"":basic.get("PHONE"));
		outMap.put("password", basic.get("PASSWORD")== null?"":basic.get("PASSWORD"));
		outMap.put("levelCode", basic.get("LEVEL_CODE")== null?"":basic.get("LEVEL_CODE"));
	    outMap.put("keyWords", basic.get("KEY_WORDS")== null?"":basic.get("KEY_WORDS"));
	   return outMap;
	}
	/**
	 * 工号出参
	* @date: 2017-1-22 
	* @author: hannn
	* @title: loginNoOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
public StandardOutDTO loginNoOutParam(Map<String, Object> outParam) {
		
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		List<Map<String,Object>> numberList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> outList = (List<Map<String, Object>>) outParam.get("loginList");
				
		if(!CommonUtils.objectIsNull(outList)){
			  for(Map<String,Object> basic:outList){
				  
				Map<String,Object> numberMap = new HashMap<String,Object>();
				numberMap.put("LOGIN_NO", basic.get("loginNo"));
				numberMap.put("LOGIN_NAME", basic.get("loginName"));
				numberMap.put("GROUP_NAME", basic.get("groupName"));
				numberMap.put("REGION_CODE", basic.get("regionCode"));
				numberMap.put("USER_ID", basic.get("userId"));
				numberMap.put("GROUP_ID", basic.get("groupId"));
				numberMap.put("GROUP_CODE", basic.get("groupCode"));
				numberMap.put("PHONE", basic.get("phone"));
				numberMap.put("LEVEL_CODE", basic.get("levelCode"));
				numberMap.put("PASSWORD", basic.get("password"));
				numberList.add(numberMap);

			   }
			}
			outMap.put("LOGIN_NUMBER_LIST",numberList);
			outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
			outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
			outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
			outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
			
			outBean.setBody(outMap);
			standardOutDTO.setBean(outBean);
			return standardOutDTO;
	}
}
