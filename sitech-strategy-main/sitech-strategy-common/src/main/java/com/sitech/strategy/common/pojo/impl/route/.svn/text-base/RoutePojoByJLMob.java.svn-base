package com.sitech.strategy.common.pojo.impl.route;

import java.io.Serializable;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.route.IRoutePojo;

/**
 * route接口--吉林移动实现
* @date: 2017-2-28
* @author: luogj
* @title: IRoutePojo 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class RoutePojoByJLMob extends BaseClass implements IRoutePojo,
		Serializable {

	/**
	 * 数据库分区规则
	 * */
	public static final String DB_AREA_A1 = new String("|2201|2207|2208|");
	public static final String DB_AREA_B1 = new String("|2202|2203|2204|2205|2206|2209|");
	
	/**
	 * routekey取值
	 * */
	private static final String ROUTE_KEY_PHONE_NO = new String("10");
	private static final String ROUTE_KEY_ID_NO = new String("11");
		
	
	/**
	 * 根据用户ID获取数据库ID标识
	* @date: 2017-2-28
	* @author: luogj
	* @title: getDBIdByIdNo 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getDBIdByIdNo(String idNo) {
		String exp = "|" + idNo.substring(0, 4) + "|";
		if( DB_AREA_A1.indexOf(exp) > -1 ){
			return "A1";
		}else if( DB_AREA_B1.indexOf(exp) > -1  ){
			return "B1";
		}
						
		return null;
	}

	@Override
	public String getRouteKeyPhoneNo() {
		return ROUTE_KEY_PHONE_NO;
	}
	
	@Override
	public String getRouteKeyIdNo() {
		return ROUTE_KEY_ID_NO;
	}

}
