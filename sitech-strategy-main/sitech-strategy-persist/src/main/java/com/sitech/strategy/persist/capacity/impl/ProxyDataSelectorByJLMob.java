package com.sitech.strategy.persist.capacity.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.JsonUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.persist.capacity.impl.IRDBMSDML;
import com.sitech.strategy.persist.capacity.impl.ProxyDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
/**
 * 吉林数据查询
* @date: 2017-2-9 
* @author: sunyuan
* @title: ProxyDataSelectorByJLMob 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ProxyDataSelectorByJLMob extends ProxyDataSelector{
	
	public class ActDemandSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.ActDemandSelector{
		
	}
	public class AttachSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.AttachSelector{
		
	}
	public class AuditSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.AuditSelector{
		
	}
	public class BatchPushTaskSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.BatchPushTaskSelector{
		
	}
	public class ChannelSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.ChannelSelector{
		
	}
	public class CommonSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.CommonSelector{

	}
	public class ConfigSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.ConfigSelector{
		
	}
	public class ContentSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.ContentSelector{
			
	}
	public class CoupleBackSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.CoupleBackSelector{
		
	}
	public class CustGroupSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.CustGroupSelector{
		
	}
	public class EvaluateSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.EvaluateSelector{
		
	}
	public class EventSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.EventSelector{
		
	}
	public class InventorySelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.InventorySelector{
		
	}
	public class LabelCodeNameSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.LabelCodeNameSelector{
		
	}
	public class LoginSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.LoginSelector{
		
	}
	public class MarketCaseSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.MarketCaseSelector{
		
	}
	public class MonitorSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.MonitorSelector{
		
	}
	public class OperLogSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.OperLogSelector{
		
	}
	public class PositionSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.PositionSelector{
		
	}
	public class ProductCommoditySelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.ProductCommoditySelector{
		
	}
	
	/**
	 * 用户查询操作实现类
	* @date: 2017-2-11 
	* @author: yuanchun
	* @title: ProductSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ProductSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.ProductSelector{
		
		protected IRDBMSDML.IRmProductInfo rmProductInfo;
		protected IServiceDML proceServiceDML;
		
		/**
		 * 
		* @date: 2017-2-11 
		* @author: yuanchun
		* @title: setServiceDML 
		* @param the serviceDML to setter
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setProceServiceDML(IServiceDML proceServiceDML) {
			this.proceServiceDML = proceServiceDML;
		}

		/** 
		 * @date: 2016-10-13 
		 * @author: wangpei
		 * @title: setRmProductInfo 
		 * @param rmProductInfo the rmProductInfo to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		
		public void setRmProductInfo(IRDBMSDML.IRmProductInfo rmProductInfo) {
			this.rmProductInfo = rmProductInfo;
		}
		
		/**
		 * 查询产品列表
		* @date: 2017-2-9 
		* @author: yuanchun
		* @title: selectProductList 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectProductListForPage(Map<String, Object> inParam) throws StrategyError {
			String strProductList = proceServiceDML.selectProductList(inParam);
			Map<String,Object> productList = JsonUtil.JsonStrToMap((String)strProductList);
			productList.put("currentPageCode", inParam.get("currentPageCode")==null?"1":(String)inParam.get("currentPageCode"));
			productList.put("perRecordCount", inParam.get("perRecordCount")==null?"10":(String)inParam.get("perRecordCount"));
			return productList;
		}
	}
	public class PrioritySelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.PrioritySelector{
		
	}
	public class RuleSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.RuleSelector{
		
	}
	public class ShortMessageSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.ShortMessageSelector{
		
	}
	public class StatisticSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.StatisticSelector{
		
	}
	public class SystemDealSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.SystemDealSelector{
		
	}
	public class TaskSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.TaskSelector{
		
	}
	public class TestSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.TestSelector{
		
	}
	public class TemplateSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.TemplateSelector{
		
	}

	/**
	 * 用户查询操作实现类
	* @date: 2017-2-9 
	* @author: sunyuan
	* @title: UserSelectorByJLMob 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class UserSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.UserSelector{
		protected IRDBMSDML.ICommonInfo commonInfo;
		
		
		/**
		 * 
		* @date: 2017-3-4 
		* @author: yuanchun
		* @title: setCommonInfo 
		* @param commonInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setCommonInfo(IRDBMSDML.ICommonInfo commonInfo) {
			this.commonInfo = commonInfo;
		}

		/**
		 * 
		* @date: 2017-2-12 
		* @author: sunyuan
		* @title: setRmUserLabelTmp 
		* @param rmUserLabelTmp 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmUserLabelTmp(IRDBMSDML.IRmUserLabelTmp rmUserLabelTmp) {
			this.rmUserLabelTmp = rmUserLabelTmp;
		}
		
		/**
		 * 查询用户标签
		* @date: 2017-2-9 
		* @author: sunyuan
		* @title: selectUserLabelList 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		* 20170322 luogj 增加查询标签二级类型
		 */
		public List<Map<String,Object>> selectUserLabelList(Map<String, Object> tempInParam) throws StrategyError {
			IQueryFilter userLabelListQueryFilter = iBatisQueryFilter.getSelectUserLabelListQueryFilter(tempInParam);
			List<Map<String,Object>> userLabelList = rmUserLabelTmp.selectUserLabel(userLabelListQueryFilter);
			
			IQueryFilter codeNameQueryFilter = iBatisQueryFilter.getSelectCodeNameQueryFilter(tempInParam);
			List<Map<String,Object>> codeName = commonInfo.selectCodeName(codeNameQueryFilter);
			
			//增加获取二级类型名称
			Map<String, Object> tempParam = new HashMap();
			tempParam.put("fieldEnName", "userLabelSecondType");
			codeNameQueryFilter = iBatisQueryFilter.getSelectCodeNameQueryFilter(tempParam);
			List<Map<String,Object>> userLabelSecondTypeList = commonInfo.selectCodeName(codeNameQueryFilter);
	 			
			List<Map<String,Object>> outParam = queryUserLabelListDataPro(userLabelList,codeName, userLabelSecondTypeList);
			
			return outParam;
		}
	}
	
	public class WorkConfigSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.WorkConfigSelector{
		
	}
	public class QuestionNaireSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.QuestionNaireSelector{
		
	}
//	public class ProductCommonReportInfoSelector extends com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.ProductCommonReportInfoSelector{
//		
//	}
	

	/**
	 * 吉林查询用户标签列表数据处理
	* @date: 2017-2-8 
	* @author: sunyuan
	* @title: queryUserLabelListDataPro
	* @param UserLabelList
	* @param CodeName
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 20170321 luogj 增加用户标签二级类型入参
	 */
	protected List<Map<String,Object>> queryUserLabelListDataPro(List<Map<String,Object>> userLabelList,List<Map<String,Object>> codeName, List<Map<String,Object>> userLabelSecondTypeList) throws StrategyError {

		
		//用于减少循环
		List<Map<String,Object>> userLabelSecondTypeListBak = new ArrayList<Map<String,Object>>();
		userLabelSecondTypeListBak.addAll(userLabelSecondTypeList);
		List<Map<String,Object>> userLabelListBak = new ArrayList<Map<String,Object>>();
		userLabelListBak.addAll(userLabelList);
		
		List<Map<String,Object>> outParam = new ArrayList<Map<String,Object>>();
		for(Map<String,Object> codeNameMap : codeName){
			Map<String,Object> typeMap = new HashMap<String,Object>();
			//标签类型值
			String fieldDesc = (String) codeNameMap.get("fieldDesc");
			//标签类型编码
			String fieldValue = (String) codeNameMap.get("fieldValue");
			typeMap.put("fieldDesc", fieldDesc);
			
			//二级类型处理
			List<Map<String,Object>> secondTypeList = new ArrayList<Map<String,Object>>();
			for(Map<String,Object> secondType : userLabelSecondTypeListBak){
				if( secondType.get("assiFieldValue").equals(fieldValue) ){
					Map<String,Object> secondTypeMap = new HashMap<String,Object>();
					secondTypeMap.put("secondTypeDesc", secondType.get("fieldDesc"));
					
					List<Map<String,Object>> labelList = new ArrayList<Map<String,Object>>();
					for(Map<String,Object> userLabelMap : userLabelListBak){
						if( fieldValue.equals(userLabelMap.get("userLabelType")) 
							&& secondType.get("fieldValue").equals( ((String)userLabelMap.get("userLabelKey")).substring(0, 7) ) 
						){
							Map<String,Object> labelMap = new HashMap<String,Object>();
							labelMap.put("userLabelName",userLabelMap.get("userLabelName"));
							labelMap.put("userLabelKey",userLabelMap.get("userLabelKey"));
							labelMap.put("userLabelType",userLabelMap.get("userLabelType"));
							labelMap.put("userLabelBoxtype",userLabelMap.get("userLabelBoxtype"));
							labelMap.put("busiCaliber",userLabelMap.get("busiCaliber"));
							labelMap.put("labelWhere",userLabelMap.get("labelWhere"));
							labelMap.put("updateFreq",userLabelMap.get("updateFreq"));
							labelList.add(labelMap);
							
							//delete userLabelList
							userLabelList.remove(userLabelMap);
						}
					}
					secondTypeMap.put("lableList", labelList);
					secondTypeList.add(secondTypeMap);
					
					//reset userLabelListBak
					userLabelListBak.clear();
					userLabelListBak.addAll(userLabelList);

					//delete userLabelSecondTypeList
					userLabelSecondTypeList.remove(secondType);
				}
			}
			typeMap.put("secondTypeList", secondTypeList);//
			outParam.add(typeMap);
			
			//reset userLabelSecondTypeListBak
			userLabelSecondTypeListBak.clear();
			userLabelSecondTypeListBak.addAll(userLabelSecondTypeList);
		}
		
		return outParam;
	}
	
}
