package com.sitech.strategy.manage.entity.param.impl.extend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.JsonUtil;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.impl.MarketCaseManageParam;

/**
 * 吉林参数处理
* @date: 2017-2-9 
* @author: yuanchun
* @title: MarketCaseManageParamByJLMob 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class MarketCaseManageParamByJLMob extends MarketCaseManageParam {
	
	/**
	 * 查询产品入参处理
	* @date: 2017-2-9 
	* @author: yuanchun
	* @title: queryProductListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryProductListInParam(
			InDTO inDTO) {
		MBean mbean = inDTO.getMbean();
		Map<String,Object> productMap = mbean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		
		String perRecordCount = (String) JsonUtil.getObject(productMap, "BUSI_INFO.PAGE_SIZE");
		String currentPageCode = (String) JsonUtil.getObject(productMap, "BUSI_INFO.PAGE_NUM");
		inParam.put("perRecordCount", perRecordCount);
		inParam.put("currentPageCode", currentPageCode);
		inParam.put("pin", mbean.toString());
		return inParam;
	}

	/**
	 * 查询产品出参处理
	* @date: 2017-2-9 
	* @author: yuanchun
	* @title: queryProductListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryProductListOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO outDto = new StandardOutDTO();
		MBean outBean = new MBean();
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		int count = 0;
		
		if(CommonUtils.objectIsNull(outParam) == false){
			List<Map<String,Object>> inList = (List<Map<String, Object>>) JsonUtil.getObject(outParam, "ROOT.BODY.OUT_DATA.PRCLIST");
			count = Integer.parseInt(JsonUtil.getObject(outParam, "ROOT.BODY.OUT_DATA.COUNT").toString());
			
			if(CommonUtils.objectIsNull(inList) == false){
				for(Map<String,Object> product:inList){
					Map<String,Object> out = new HashMap<String, Object>();
					out.put("PRODUCT_ID", product.get("PROD_PRCID"));
					out.put("PRODUCT_TYPE", product.get("EFF_RULE_ID"));
					out.put("PRODUCT_NAME", product.get("PROD_PRC_NAME"));
					out.put("PRODUCT_TYPE_NAME", product.get("ATTR_NAME"));
					outList.add(out);
				}
			}
			outBean.setBody("CURRENT_PAGE_CODE",outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
			outBean.setBody("PER_RECORD_COUNT",outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		}
		
		outBean.setBody("PRODUCT_LIST",outList);
		outBean.setBody("TOTAL_RECORD_COUNT",count);
		outDto.setBean(outBean);
		return outDto;
	}
	
	
}
