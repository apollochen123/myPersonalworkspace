package com.sitech.strategy.common.pojo.impl.regioncode;

import java.io.Serializable;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.regioncode.IRegionCodePojo;

/**
 * 吉林regionCode接口
* @date: 2017-2-24 
* @author: sunliang 
* @title: RegionCodePojoByJLMob 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class RegionCodePojoByJLMob extends BaseClass implements
		IRegionCodePojo, Serializable {
	
	/**
	 * 地市编码 2201长春,2202吉林,2203延吉,2204四平,2205通化,2206白城,2207辽源,2208松原,2209白山,2210省中心,2211无归属,2200吉林省
	 */
	public final String[] regionCode = new String[]{"2201","2202","2203","2204","2205","2206","2207","2208","2209","2210","2211"};

	/**
	 * 省级编码
	 */
	public final String provinceCode = new String("2200");

	/**
	 * 获取所有地市编码
	* @date: 2017-2-24 
	* @author: sunliang 
	* @title: getRegionCode 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String[] getRegionCode() {
		return regionCode;
	}

	/**
	 * 获取省份编码
	* @date: 2017-2-24 
	* @author: sunliang 
	* @title: getProvinceCode 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getProvinceCode() {
		return provinceCode;
	}

}
