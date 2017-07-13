package com.sitech.strategy.manage.service.jcf.impl;

import java.util.Map;

import com.sitech.jcfx.anno.ParamType;
import com.sitech.jcfx.anno.ParamTypes;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.BaseManageService;
import com.sitech.strategy.manage.base.basedto.StandardInDTO;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.inter.IProductCommodityManageEntity;
import com.sitech.strategy.manage.entity.param.inter.IProductCommodityManageParam;
import com.sitech.strategy.manage.service.jcf.inter.IProductCommodityManageService;



@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "queryProductCommodityList", oc = StandardOutDTO.class),
})
/**
 * 产商品
* @date: 2016-10-6 
* @author: zhangjj_crmpd
* @title: ProductCommodityManageService 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ProductCommodityManageService extends BaseManageService implements IProductCommodityManageService{
	
	/**
	 * 营销案对象
	 */
	protected IProductCommodityManageEntity productCommodityManageEntity;
	/**
	 * 参数转换对象
	 */
	protected IProductCommodityManageParam productCommodityManageParam;
	
	/**
	 * 
	* @date: 2016-10-9 
	* @author: zhangjj_crmpd
	* @title: setProductCommodityManageEntity 
	* @param productCommodityManageEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setProductCommodityManageEntity(
			IProductCommodityManageEntity productCommodityManageEntity) {
		this.productCommodityManageEntity = productCommodityManageEntity;
	}

	/**
	 * 
	* @date: 2016-10-9 
	* @author: zhangjj_crmpd
	* @title: setProductCommodityManageParam 
	* @param productCommodityManageParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setProductCommodityManageParam(
			IProductCommodityManageParam productCommodityManageParam) {
		this.productCommodityManageParam = productCommodityManageParam;
	}

	/**
	 * 
	* @date: 2016-9-27 
	* @author: zhangjj_crmpd
	* @title: queryProductCommodityList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryProductCommodityList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = productCommodityManageParam.productCommodityListInParam(inDTO);
			Map<String,Object> outParam= productCommodityManageEntity.queryProductCommodityList(inParam);
			
			standardOutDTO = productCommodityManageParam.productCommodityListOutParam(outParam);
					
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
	
		return standardOutDTO;
	}
	
	
}
