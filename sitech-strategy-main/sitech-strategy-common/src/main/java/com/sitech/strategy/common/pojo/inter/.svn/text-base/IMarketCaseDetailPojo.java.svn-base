package com.sitech.strategy.common.pojo.inter;

import java.util.Map;

import com.sitech.strategy.common.pojo.impl.SortParamer;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 营销案明细对象接口
* @date: 2016-9-5 
* @author: sunliang 
* @title: IMarketCaseDetailPojo 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IMarketCaseDetailPojo {
	
	/**
	 * 
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: getMarketCaseId 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getMarketCaseId() ;

	/**
	 * 
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: setMarketCaseId 
	* @param marketCaseId 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseId(String marketCaseId);

	/**
	 * 
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: getDetailMap 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getDetailMap() ;

	/**
	 * 
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: setDetailMap 
	* @param detailMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setDetailMap(Map<String, Object> detailMap);
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: getSortParamer 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public SortParamer getSortParamer();
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setSortParamer 
	* @param sortParamer 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSortParamer(SortParamer sortParamer);
	
	/**
	 * marketCaseDetailPojo转换为marketCaseCachePojo
	* @date: 2016-9-15 
	* @author: yangwl
	* @title: marketCaseDetailPojoToCachePojo 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public IMarketCaseCachePojo toMarketCaseCachePojo(Map<String,Object> marketCaseDetail) throws StrategyError;

}
