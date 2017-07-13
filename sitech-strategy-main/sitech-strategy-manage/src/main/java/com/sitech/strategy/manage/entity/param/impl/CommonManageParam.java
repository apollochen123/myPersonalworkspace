package com.sitech.strategy.manage.entity.param.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.ICommonManageParam;

/**
 * 公用服务参数转换
* @date: 2016-9-14 
* @author: fangyuan_crmpd
* @title: CommonManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class CommonManageParam implements ICommonManageParam{
	
	/**
	 *  查询codeName入参处理
	* @date: 2016-10-31 
	* @author: wangth
	* @Title: queryCodeNameListInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryCodeNameListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> codeMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("fieldEnName", codeMap.get("FIELD_EN_NAME")==null?"":codeMap.get("FIELD_EN_NAME"));
		outMap.put("fieldCnName", codeMap.get("FIELD_CN_NAME")==null?"":codeMap.get("FIELD_CN_NAME"));
		return outMap;
	}
	
	/**
	 *  查询codeName出参处理
	* @date: 2016-10-31 
	* @author: wangth
	* @Title: queryCodeNameListOutParam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryCodeNameListOutParam(Map<String, Object> outParam) {
		List<Map<String,Object>> inList = (List<Map<String, Object>>) outParam.get("codeList");
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		if(CommonUtils.objectIsNull(inList) == false){
			for(Map<String,Object> inMap : inList ){
				Map<String,Object> outMap = new HashMap<String,Object>();
				outMap.put("FIELD_EN_NAME", inMap.get("fieldEnName"));
				outMap.put("FIELD_CN_NAME", inMap.get("fieldCnName"));
				outMap.put("FIELD_VALUE", inMap.get("fieldValue"));
				outMap.put("FIELD_DESC", inMap.get("fieldDesc"));
				outList.add(outMap);
			}
		}
		Map<String,Object> codeMap =new HashMap<String,Object>();
		codeMap.put("CODE_LIST", outList);
		
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		outBean.setBody(codeMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 获取序列入参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: getSequenceInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getSequenceInParam(InDTO inDTO) {
		return null;
	}

	/**
	 * 获取序列出参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: getSequenceOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO getSequenceOutParam(Map<String, Object> outParam) {
		MBean bean = new MBean();
		bean.setBody("SEQUENCE",outParam.get("sequence"));
		StandardOutDTO outDTO = new StandardOutDTO();
		outDTO.setBean(bean);
		return outDTO;
	}

	/**
	 * 发送消息测试入参处理
	* @date: 2017-3-8 
	* @author: tangaq
	* @title: sendMessageTestInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> sendMessageTestInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> msgMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("topic", msgMap.get("TOPTIC"));
		outMap.put("message", msgMap.get("MESSAGE"));
		return outMap;
	}

	/**
	 * 发送消息测试出参处理
	* @date: 2017-3-8 
	* @author: tangaq
	* @title: sendMessageTestOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO sendMessageTestOutParam(
			Map<String, Object> outParam) {
		MBean bean = new MBean();
		Map<String,Object> outMap = new HashMap();
		bean.setBody(outMap);
		StandardOutDTO outDTO = new StandardOutDTO();
		outDTO.setBean(bean);
		return outDTO;
	}

}
