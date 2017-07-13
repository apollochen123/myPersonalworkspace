package com.sitech.strategy.manage.service.jcf.impl;

import java.util.Map;

import com.sitech.jcfx.anno.ParamType;
import com.sitech.jcfx.anno.ParamTypes;
import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.BaseManageService;
import com.sitech.strategy.manage.base.basedto.StandardInDTO;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.inter.ILoginManageEntity;
import com.sitech.strategy.manage.entity.param.inter.ILoginManageParam;
import com.sitech.strategy.manage.service.jcf.inter.ILoginManageService;

/**
 * 登录(权限、角色、菜单)
* @date: 2016-9-5 
* @author: tangaq
* @title: LoginManageService 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "getLoginMsg", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryLoginNoList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryMenuDetailById", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryMenuList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryMenuListByLoginNo", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryRoleList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryRoleMenuRelList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryRoleUserRelList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryRoleListByLoginNo", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeMenuById", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeRole", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeRoleMenuRel", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeRoleUserRel", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveMenuDetail", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveRole", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveLoginNo", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveRoleMenuRel", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveRoleUserRel", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateLoginPassword", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateMenuDetail", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateRole", oc = StandardOutDTO.class)
})	
public class LoginManageService extends BaseManageService implements ILoginManageService {
	
	/**
	 * 登录实体对象
	 */
	protected ILoginManageEntity loginManageEntity;
	/**
	 * 登录参数处理对象
	 */
	protected ILoginManageParam loginManageParam;
	
	/**
	 * 
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: setLoginManageEntity 
	* @param loginManageEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setLoginManageEntity(ILoginManageEntity loginManageEntity) {
		this.loginManageEntity = loginManageEntity;
	}
	
	/**
	 * 
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: setLoginManageParam 
	* @param loginManageParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setLoginManageParam(ILoginManageParam loginManageParam) {
		this.loginManageParam = loginManageParam;
	}

	/** 
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
	
	@Override
	public OutDTO getLoginMsg(InDTO inDTO) {
		StandardOutDTO standardOutDTO = null;
		
		try {
			
			Map<String,Object> inParam = loginManageParam.getLoginMsgInParam(inDTO);
			Map<String,Object> outParam = loginManageEntity.getLoginMsg(inParam);
			standardOutDTO = loginManageParam.getLoginMsgOutParam(outParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
		
		return standardOutDTO;	
	}

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
	@Override
	public OutDTO queryLoginNoList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = loginManageParam.queryLoginNoListInParam(inDTO);
			Map<String,Object> outParam = loginManageEntity.queryLoginNoList(inParam);
			standardOutDTO = loginManageParam.queryLoginNoListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 * 查询菜单详细信息
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
	@Override
	public OutDTO queryMenuDetailById(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = loginManageParam.queryMenuDetailByIdInParam(inDTO);
			Map<String,Object> outParam = loginManageEntity.queryMenuDetailById(inParam);
			standardOutDTO = loginManageParam.queryMenuDetailByIdOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
		
		return standardOutDTO;	
	}

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
	@Override
	public OutDTO queryMenuList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = loginManageParam.queryMenuListInParam(inDTO);
			Map<String,Object> outParam = loginManageEntity.queryMenuList(inParam);
			standardOutDTO = loginManageParam.queryMenuListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
		
		return standardOutDTO;	
	}
	
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
	@Override
	public OutDTO queryMenuListByLoginNo(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = loginManageParam.queryMenuListByLoginNoInParam(inDTO);
			Map<String,Object> outParam = loginManageEntity.queryMenuListByLoginNo(inParam);
			standardOutDTO = loginManageParam.queryMenuListByLoginNoOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
		
		return standardOutDTO;	
	}

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
	@Override
	public OutDTO queryRoleList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String,Object> inParam = loginManageParam.roleInParam(inDTO);
			Map<String,Object> outParam = loginManageEntity.queryRoleList(inParam);
			standardOutDTO = loginManageParam.roleOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 * 根据工号查询角色列表
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
	public OutDTO queryRoleListByLoginNo(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
	
		try {
			Map<String,Object> inParam = loginManageParam.queryRoleListByLoginNoInParam(inDTO);
			Map<String,Object> outParam = loginManageEntity.queryRoleListByLoginNo(inParam);
			standardOutDTO = loginManageParam.queryRoleListByLoginNoOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

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
	@Override
	public OutDTO queryRoleMenuRelList(InDTO inDTO) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 查询角色和用户关系列表
	* @date: 2016-10-27 
	* @author: wangth
	* @Title: queryRoleUserRelList 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryRoleUserRelList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String,Object> inParam = loginManageParam.roleUserRelInParam(inDTO);
			Map<String,Object> outParam = loginManageEntity.queryRoleUserRelList(inParam);
			standardOutDTO = loginManageParam.roleUserRelOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
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
	@Override
	public OutDTO removeMenuById(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = loginManageParam.removeMenuByIdInParam(inDTO);
			loginManageEntity.removeMenuById(inParam);
			standardOutDTO = loginManageParam.removeMenuByIdOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
		
		return standardOutDTO;	
	}
	
	/**
	 * 移除角色信息
	* @date: 2016-10-26 
	* @author: wangth
	* @Title: removeRole 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removeRole(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam = loginManageParam.roleInParam(inDTO);
			loginManageEntity.removeRole(inParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		standardOutDTO.setBean(new MBean());
		return standardOutDTO;	
	}
	
	/**
	 * 删除角色与菜单关系
	* @date: 2016-10-28 
	* @author: zhangjj_crmpd
	* @title: removeRoleMenuRel 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removeRoleMenuRel(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam = loginManageParam.roleMenuRelInParam(inDTO);
			loginManageEntity.removeRoleMenuRel(inParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		standardOutDTO.setBean(new MBean());
		return standardOutDTO;	
	}
	
	/**
	 * 移除角色和用户关系
	* @date: 2016-10-27 
	* @author: wangth
	* @Title: removeRoleUserRel 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removeRoleUserRel(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam = loginManageParam.removeRoleUserRelInParam(inDTO);
			loginManageEntity.removeRoleUserRel(inParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		standardOutDTO.setBean(new MBean());
		return standardOutDTO;	
	}
	
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
	@Override
	public OutDTO saveMenuDetail(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = loginManageParam.saveMenuDetailInParam(inDTO);
			loginManageEntity.saveMenuDetail(inParam);
			standardOutDTO = loginManageParam.saveMenuDetailOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
		
		return standardOutDTO;	
	}
	
	/**
	 * 保存角色
	* @date: 2016-10-26 
	* @author: wangth
	* @Title: saveRole 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveRole(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam = loginManageParam.roleInParam(inDTO);
			loginManageEntity.saveRole(inParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		standardOutDTO.setBean(new MBean());
		return standardOutDTO;	
	}
	/**
	 * 新增工号
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
	@Override
	public OutDTO saveLoginNo(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam = loginManageParam.loginNoInParam(inDTO);
			loginManageEntity.saveLoginNo(inParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		standardOutDTO.setBean(new MBean());
		return standardOutDTO;	
	}
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
	@Override
	public OutDTO saveRoleMenuRel(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam = loginManageParam.roleMenuRelInParam(inDTO);
			loginManageEntity.saveRoleMenuRel(inParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		standardOutDTO.setBean(new MBean());
		return standardOutDTO;
	}
	
	/**
	 * 保存用户和角色关系
	* @date: 2016-10-27 
	* @author: wangth
	* @Title: saveRoleUserRel 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveRoleUserRel(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam = loginManageParam.saveRoleUserRelInParam(inDTO);
			loginManageEntity.saveRoleUserRel(inParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		standardOutDTO.setBean(new MBean());
		return standardOutDTO;	
	}
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
	@Override
	public OutDTO updateLoginPassword(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam = loginManageParam.updateLoginPasswordInParam(inDTO);
			int row=loginManageEntity.updateLoginPassword(inParam);
			standardOutDTO = loginManageParam.updateLoginPasswordOutParam(row);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;
	}

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
	@Override
	public OutDTO updateMenuDetail(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = loginManageParam.updateMenuDetailInParam(inDTO);
			loginManageEntity.updateMenuDetail(inParam);
			standardOutDTO = loginManageParam.updateMenuDetailOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
		
		return standardOutDTO;		
	}
	
	/**
	 * 更新角色
	* @date: 2016-10-26 
	* @author: wangth
	* @Title: updateRole 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO updateRole(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam = loginManageParam.roleInParam(inDTO);
			loginManageEntity.updateRole(inParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		standardOutDTO.setBean(new MBean());
		return standardOutDTO;	
	}
}
