package com.sitech.strategy.manage.entity.param.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.IProductCommodityManageParam;

/**
 * 
* @date: 2016-10-6 
* @author: zhangjj_crmpd
* @title: ProductCommodityManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ProductCommodityManageParam  extends BaseManageEntity  implements
		IProductCommodityManageParam {

	/**
	 * 
	* @date: 2016-10-6 
	* @author: zhangjj_crmpd
	* @title: productCommodityListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> productCommodityListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> basic = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		

		Object keyWords=basic.get("KEY_WORDS");
		if(CommonUtils.objectIsNull(keyWords)==false){//走湖北的模糊查询
			outMap.put("keyWords", basic.get("KEY_WORDS"));
			outMap.put("cataCode", basic.get("CATA_CODE"));
			outMap.put("productCommodityId", basic.get("PRODUCTCOMMODITY_ID"));
			outMap.put("productCommodityName", basic.get("PRODUCTCOMMODITY_NAME"));			
		}else{
			outMap.put("productCommodityId", basic.get("KEYS"));
			outMap.put("productCommodityName", basic.get("KEYS"));
			outMap.put("channelType", basic.get("CHANNEL_TYPE"));						
		}
		outMap.put("startNum", basic.get("STARTNUM"));
		outMap.put("endNum", basic.get("ENDNUM"));
		return outMap;
	}

	/**
	 * 
	* @date: 2016-10-6 
	* @author: zhangjj_crmpd
	* @title: productCommodityListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO productCommodityListOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		
		List<Map<String,Object>> productCommodityNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> productCommodityList = (List<Map<String, Object>>) outParam.get("productCommodityList");
		
		
		if(!CommonUtils.objectIsNull(productCommodityList)){
		  for(Map<String,Object> basic:productCommodityList){
		    Map<String,Object> productCommodityMap = new HashMap<String,Object>();
		    productCommodityMap.put("CONTENT", basic.get("content"));
		    productCommodityMap.put("PRODUCTCOMMODITY_SRC", basic.get("productCommoditySrc"));
		    productCommodityMap.put("PRODUCECOMMODITY_NOTE", basic.get("produceCommodityNote"));
		    productCommodityMap.put("CHANNEL_TYPE", basic.get("channelType"));
		    productCommodityMap.put("PRODUCTCOMMODITY_NAME", basic.get("productCommodityName"));
		    productCommodityMap.put("PRODUCTCOMMODITY_ID", basic.get("productCommodityId"));
			productCommodityNewList.add(productCommodityMap);
		
		   }
		}
		
		outMap.put("PRODUCTCOMMODITY_LIST", productCommodityNewList);
		outMap.put("TOTALRECORD", outParam.get("totalRecord"));
		
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	/**
	 * 
	* @date: 2016-10-6 
	* @author: zhangjj_crmpd
	* @title: timeConvert 
	* @param formTime
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected String timeConvert(String formTime){
		
		if(formTime.indexOf(":") < Integer.valueOf(Const.FLASE_INT)){
			return formTime+" 00:00:00";
		}
		return formTime;
	}


}

