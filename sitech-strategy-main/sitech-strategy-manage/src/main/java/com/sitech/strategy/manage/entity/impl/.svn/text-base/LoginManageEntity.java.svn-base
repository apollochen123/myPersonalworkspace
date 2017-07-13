package com.sitech.strategy.manage.entity.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.PagingDevice;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.impl.SortParamer;
import com.sitech.strategy.common.pojo.inter.IPagingDevice;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.ILogin;
import com.sitech.strategy.core.pojo.inter.IResultList;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.ILoginManageEntity;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;

/**
 * 登录(权限、角色、菜单)实体
* @date: 2016-9-5 
* @author: tangaq
* @title: LoginManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class LoginManageEntity extends BaseManageEntity implements ILoginManageEntity {
	/**
	 * 工号查询
	 */
	protected ILogin login;
	/**
	 * 登录(权限、角色、菜单)数据删除对象
	 */
	protected IDataDeleter.ILoginDeleter loginDeleter; 
	/**
	 * 登录(权限、角色、菜单)数据插入对象
	 */
	protected IDataInsertor.ILoginInsertor loginInsertor;
	/**
	 * 登录(权限、角色、菜单)数据查询对象
	 */
	protected IDataSelector.ILoginSelector loginSelector;
	/**
	 * 登录(权限、角色、菜单)数据更新对象
	 */
	protected IDataUpdater.ILoginUpdater loginUpdater; 
	/**
	 * 列表查询对象
	 */
	protected IResultList resultList;
	
	/** 
	 * @date: 2016-11-1 
	 * @author: xiongxq
	 * @Title: setResultList 
	 * @param resultList the resultList to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setResultList(IResultList resultList) {
		this.resultList = resultList;
	}

	/** 
	 * @date: 2016-10-27 
	 * @author: wangpei
	 * @title: setLogin 
	 * @param login the login to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setLogin(ILogin login) {
		this.login = login;
	}
	
	/** 
	 * @date: 2016-11-1 
	 * @author: xiongxq
	 * @Title: setLoginDeleter 
	 * @param loginDeleter the loginDeleter to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setLoginDeleter(IDataDeleter.ILoginDeleter loginDeleter) {
		this.loginDeleter = loginDeleter;
	}


	/** 
	 * @date: 2016-11-1 
	 * @author: xiongxq
	 * @Title: setLoginInsertor 
	 * @param loginInsertor the loginInsertor to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setLoginInsertor(IDataInsertor.ILoginInsertor loginInsertor) {
		this.loginInsertor = loginInsertor;
	}


	/** 
	 * @date: 2016-11-1 
	 * @author: xiongxq
	 * @Title: setLoginSelector 
	 * @param loginSelector the loginSelector to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setLoginSelector(IDataSelector.ILoginSelector loginSelector) {
		this.loginSelector = loginSelector;
	}


	/** 
	 * @date: 2016-11-1 
	 * @author: xiongxq
	 * @Title: setLoginUpdater 
	 * @param loginUpdater the loginUpdater to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setLoginUpdater(IDataUpdater.ILoginUpdater loginUpdater) {
		this.loginUpdater = loginUpdater;
	}


	/** 
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
	@Override
	public Map<String, Object> getLoginMsg(Map<String, Object> inParam)
			throws StrategyError {
		return login.getLoginMsg(inParam);
	}

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
	@Override
	public Map<String, Object> queryLoginNoList(
			Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter =this.settlequeryLoginNoListFilter(inParam);
		int start = Integer.valueOf(inParam.get("currentPageCode")==null?"1":(String)inParam.get("currentPageCode"));
		int	limit = Integer.valueOf(inParam.get("perRecordCount")==null?"10":(String)inParam.get("perRecordCount"));
		Map<String,Object> resMap = loginSelector.selectForPage(inParam, queryFilter, start, limit);
		if (resMap == null) {
			resMap = new HashMap<String,Object>();
		}
		Map<String,Object> outMap = new HashMap<String, Object>();
		String sum = resMap.get("sum") == null?"0":resMap.get("sum")+"";
		List<Map<String,Object>> outList = resMap.get("result") == null?new ArrayList<Map<String,Object>>():(List<Map<String,Object>>)resMap.get("result");
		outMap.put("sum", sum);
		outMap.put("currentPageCode", start+"");
		outMap.put("perRecordCount", limit+"");
		outMap.put("result", outList);
		Map<String,Object> outParam = this.getqueryLoginNoListByPagingDevice(outMap);
		return outParam;
	}
	
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
	@Override
	public Map<String, Object> queryMenuDetailById(Map<String, Object> inParam)
			throws StrategyError {
		List<Map<String, Object>> list = loginSelector.selectMenuDetailById(inParam);
		Map<String, Object> outParam = new HashMap<String, Object>();
		outParam.put("queryMenuDetailById", list);
		return outParam;
	}

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
	@Override
	public Map<String, Object> queryMenuList(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		queryFilter.setRoleId((String)inParam.get("roleId"));
		if(CommonUtils.objectIsNull(inParam.get("loginNo"))){
			 list = loginSelector.selectMenuList(inParam);
		}else{
			 list =loginSelector.selectMenuListByLoginNo(inParam);
		}
		
		List<Map<String, Object>> listMenu = loginSelector.selectRoleMenuRel(inParam, queryFilter);
		Map<String, Object> outParam = new HashMap<String, Object>();
		outParam.put("queryMenuList", list);
		outParam.put("queryRoleMenuList", listMenu);
		return outParam;
	}

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
	@Override
	public Map<String, Object> queryMenuListByLoginNo(
			Map<String, Object> inParam) throws StrategyError {
		List<Map<String ,Object>> list = loginSelector.selectMenuListByLoginNo(inParam);
		Map<String, Object> outParam = new HashMap<String ,Object>();
		outParam.put("queryMenuListByLoginNo", list);
		return outParam;
	}
	
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
	@Override
	public Map<String, Object> queryRoleList(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter =this.settleRoleListFilter(inParam);
		IPagingDevice pagingDevice = new PagingDevice();
		ISortParamer sortParamer = new SortParamer();
		IPagingDevice pagingDeviceTmp = resultList.queryResultList(inParam, queryFilter,sortParamer,pagingDevice.getInstance(inParam));
		Map<String,Object> outParam = this.getRoleListByPagingDevice(pagingDeviceTmp);
		return outParam;
	}
	
	/** 
	 * 根据工号查询角色列表
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
	@Override
	public Map<String, Object> queryRoleListByLoginNo(
			Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter =this.settleRoleListByLoginNoFilter(inParam);
		List<Map<String,Object>> roleNotList = loginSelector.select(inParam, queryFilter);
		List<Map<String,Object>> roleList = loginSelector.selectRoleByLoginNo(inParam, queryFilter);
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("roleNotList", roleNotList);
		outMap.put("roleList", roleList);
		return outMap;
	}

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
	@Override
	public Map<String, Object> queryRoleMenuRelList(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter =this.settleRoleMenuListFilter(inParam);
		IPagingDevice pagingDevice = new PagingDevice();
		ISortParamer sortParamer = new SortParamer();
		IPagingDevice pagingDeviceTmp = resultList.queryResultList(inParam, queryFilter,sortParamer,pagingDevice.getInstance(inParam));
		Map<String,Object> outParam = this.getRoleMenuRelListByPagingDevice(pagingDeviceTmp);
		return outParam;
	}
	
	/**
	 * 查询用户和角色的关系列表
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
	@Override
	public Map<String, Object> queryRoleUserRelList(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter =this.settleRoleListFilter(inParam);
		IPagingDevice pagingDevice = new PagingDevice();
		ISortParamer sortParamer = new SortParamer();
		IPagingDevice pagingDeviceTmp = resultList.queryResultList(inParam, queryFilter,sortParamer,pagingDevice.getInstance(inParam));
		Map<String,Object> outParam = this.getRoleUserRelListByPagingDevice(pagingDeviceTmp);
		return outParam;
	}
	
	
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
	@Override
	public void removeMenuById(Map<String, Object> inParam)
			throws StrategyError {
		loginDeleter.deleteMenuInfo(inParam);
	}
	
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
	@Override
	public void removeRole(Map<String, Object> inParam) throws StrategyError {
		loginDeleter.delete(inParam);
	}
	
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
	@Override
	public void removeRoleMenuRel(Map<String, Object> inParam)
			throws StrategyError {
		loginDeleter.deleteRoleMenuRel(inParam);
	}
	
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
	@Override
	public void removeRoleUserRel(Map<String, Object> inParam)
			throws StrategyError {
		loginDeleter.deleteRoleUserRel(inParam);
	}
	
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
	@Override
	public void saveMenuDetail(Map<String, Object> inParam)
			throws StrategyError {
		loginInsertor.insertMenuInfo(inParam);
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("roleId", "2016");
		map.put("menuId", inParam.get("menuId"));
		list.add(map);
		loginInsertor.insertRoleMenuRel(list);
	}
	
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
	@Override
	public void saveRole(Map<String, Object> inParam) throws StrategyError {
		loginInsertor.insert(inParam);
	}
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
	@Override
	public void saveLoginNo(Map<String, Object> inParam) throws StrategyError {
		loginInsertor.insertLoginNo(inParam);
	}
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
	@SuppressWarnings("unchecked")
	@Override
	public void saveRoleMenuRel(Map<String, Object> inParam)
			throws StrategyError {
		loginDeleter.deleteRoleMenuRel(inParam);
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		if(!CommonUtils.objectIsNull(inParam.get("list"))){
			list = (List<Map<String, Object>>) inParam.get("list");
		}
		loginInsertor.insertRoleMenuRel(list);
	}
	
	/**
	 * 保存用户和角色的关系
	* @date: 2016-10-27 
	* @author: wangth
	* @Title: saveRoleUserRel 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void saveRoleUserRel(Map<String, Object> inParam)
			throws StrategyError {
		List<Map<String,Object>> outList = (List<Map<String,Object>>)inParam.get("outList");
		if(!CommonUtils.objectIsNull(outList)){
			loginInsertor.insertBatchRoleUserRel(inParam);
		}else{
			loginInsertor.insertRoleUserRel(inParam);
		}
	}
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
	@Override
	public int updateLoginPassword(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter=new QueryFilter();
		inParam.put("dbType", queryFilter.getDbType());
		return loginUpdater.updateLoginPassword(inParam);
	}
	
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
	@Override
	public void updateMenuDetail(Map<String, Object> inParam)
			throws StrategyError {
		loginUpdater.updateMenuDetail(inParam);
	}
	
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
	@Override
	public void updateRole(Map<String, Object> inParam) throws StrategyError {
		loginUpdater.update(inParam);
	}	
	
	/**
	 * 生成IQueryFilter对象
	* @date: 2016-10-26 
	* @author: xiongxq
	* @Title: settleEmployeeNumberListFilter 
	* @param inParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settlequeryLoginNoListFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setRegionCode((String)inParam.get("regionCode"));
		queryFilter.setLoginNo((String)inParam.get("loginNo"));
		queryFilter.setLoginName((String)inParam.get("loginName"));
		return queryFilter;
	}

	/**
	 * 通过分页器获得工号列表
	* @date: 2016-10-27 
	* @author: xiongxq
	* @Title: getEmployeeNumberListByPagingDevice 
	* @param pagingDevice
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getqueryLoginNoListByPagingDevice(Map<String,Object> out){
		Map<String,Object> outParam = new HashMap<String,Object>();
		outParam.put("currentPageCode", out.get("currentPageCode"));
		outParam.put("perRecordCount", out.get("perRecordCount"));
		outParam.put("totalRecordCount", out.get("sum"));
		outParam.put("loginList", out.get("result"));
		outParam.put("queryId", "");
	    return outParam;
	}
	
	/**
	 * 通过分页器获得角色列表
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: getRoleListByPagingDevice 
	* @param pagingDevice
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getRoleListByPagingDevice(IPagingDevice pagingDevice){
		Map<String,Object> outParam = new HashMap<String,Object>();
		outParam.put("currentPageCode", pagingDevice.getCurrentPageCode());
		outParam.put("perRecordCount", pagingDevice.getPerRecordCount());
		outParam.put("totalRecordCount", pagingDevice.getTotalRecordCount());
		outParam.put("roleList", pagingDevice.getPerPageInfo());
		outParam.put("queryId", pagingDevice.getQueryId());
	    return outParam;
	}
	
	/**
	 * 通过分页器获得角色和用户的关系列表
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: getRoleUserRelListByPagingDevice 
	* @param pagingDevice
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getRoleUserRelListByPagingDevice(IPagingDevice pagingDevice){
		Map<String,Object> outParam = new HashMap<String,Object>();
		outParam.put("currentPageCode", pagingDevice.getCurrentPageCode());
		outParam.put("perRecordCount", pagingDevice.getPerRecordCount());
		outParam.put("totalRecordCount", pagingDevice.getTotalRecordCount());
		outParam.put("roleUserRelList", pagingDevice.getPerPageInfo());
		outParam.put("queryId", pagingDevice.getQueryId());
	    return outParam;
	}
	
	protected Map<String,Object> getRoleMenuRelListByPagingDevice(IPagingDevice pagingDevice){
		Map<String,Object> outParam = new HashMap<String,Object>();
		outParam.put("currentPageCode", pagingDevice.getCurrentPageCode());
		outParam.put("perRecordCount", pagingDevice.getPerRecordCount());
		outParam.put("totalRecordCount", pagingDevice.getTotalRecordCount());
		outParam.put("roleMenuRelList", pagingDevice.getPerPageInfo());
		outParam.put("queryId", pagingDevice.getQueryId());
	    return outParam;
	}
	
	/**
	 * 形成QueryFilter对象
	* @date: 2016-9-13 
	* @author: wangth
	* @title: settleRoleListFilter 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected IQueryFilter settleRoleListFilter(Map<String,Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		if(!CommonUtils.objectIsNull(inParam.get("keyWords")) ){
			queryFilter.setKeyWords((List<String>)inParam.get("keyWords"));
		}
		if(CommonUtils.objectIsNull(inParam.get("roleType"))==false ){
			queryFilter.setRoleType(inParam.get("roleType").toString());
		}
		queryFilter.setRoleName(inParam.get("roleName").toString());
		if(!CommonUtils.objectIsNull(inParam.get("regionCode"))){
			queryFilter.setRegionCode(inParam.get("regionCode").toString());
		}
		if(!CommonUtils.objectIsNull(inParam.get("operNo"))){
			queryFilter.setOperNo(inParam.get("operNo").toString());
		}
		return queryFilter;
	}
	
	protected IQueryFilter settleRoleMenuListFilter(Map<String,Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		if(!CommonUtils.objectIsNull(inParam.get("keyWords")) ){
			queryFilter.setKeyWords((List<String>)inParam.get("keyWords"));
		}
		queryFilter.setRoleName(inParam.get("roleId").toString());
		queryFilter.setRoleType(inParam.get("menuId").toString());
		
		return queryFilter;
	}

	/**
	 * 生成IQueryFilter对象
	* @date: 2016-10-27 
	* @author: xiongxq
	* @Title: settleRoleListByLoginNoFilter 
	* @param inParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleRoleListByLoginNoFilter(Map<String,Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setOperNo((String)inParam.get("loginNo"));
		queryFilter.setLoginNo((String)inParam.get("loginNo"));
		return queryFilter;
	}

}
