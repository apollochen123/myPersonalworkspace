package com.sitech.strategy.common.pojo.impl.regioncode;

import java.io.Serializable;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.regioncode.IRegionCodePojo;

/**
 * 湖北regionCode接口
* @date: 2016-11-26 
* @author: yangwl
* @title: AHRegionCode 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class RegionCodePojoByHBMob extends BaseClass implements IRegionCodePojo, Serializable{
	/**
	 * 地市编码 270武汉, 710襄阳, 711鄂州, 712孝感, 713黄冈, 714黄石, 715咸宁, 716荆州, 717宜昌, 718恩施, 719十堰, 722随州, 724荆门, 728江汉, 730天门, 729潜江, 999 客服
	 */
	public final String[] regionCode = new String[]{"270","710","711","712","713","714","715","716","717","718","719","722","724","728","730","729","999"};

	/**
	 * 省级编码
	 */
	public final String provinceCode = new String("10");
	
	/**
	 * 获取所有地市编码
	* @date: 2016-11-26 
	* @author: zhangqia
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
	* @date: 2016-11-26 
	* @author: zhangqia
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
