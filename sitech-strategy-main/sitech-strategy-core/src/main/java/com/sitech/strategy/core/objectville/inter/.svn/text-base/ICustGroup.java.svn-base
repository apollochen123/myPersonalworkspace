package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 目标客户群对象
* @date: 2016-9-5 
* @author: yangwl
* @title: ICustGroup 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ICustGroup {
	
	/**
	 * 添加标签客户群信息
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addLabelCustGroup 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> addLabelCustGroup(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 添加导入客户群信息
	* @date: 2016-9-15 
	* @author: zhangjj_crmpd
	* @title: addLoadCustGroup 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addLoadCustGroup(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 添加数据模式客户群
	* @date: 2016-9-28 
	* @author: wangth
	* @Title: addDataCustGroup 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addDataCustGroup(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 增加单个号码到目标客户群 
	* @date: 2016-10-2 
	* @author: sunliang 
	* @title: addSingleNoToCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> addSingleNoToCustGroup(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 批量插入客户群明细表
	* @date: 2016-10-2 
	* @author: sunliang 
	* @title: addBatchNoToCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addBatchNoToCustGroup(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 增加静态标签客户群信息（hive表）
	* @date: 2017-3-14 
	* @author:liuqi
	* @title: addStaticLabelCustGroupTableInfo 
	* @param custGroupId
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addStaticLabelCustGroupTableInfo(String custGroupId) throws StrategyError;
	
	/**
	 * 创建静态标签目标客户群表（hbase表）
	* @date: 2017-3-14 
	* @author:liuqi
	* @title: createStaticLabelCustGroupTable 
	* @param cust 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void createStaticLabelCustGroupTable(String cust) throws StrategyError;
	
	/**
	 * 创建详情表和加载导入模式客户群
	* @date: 2017-1-16 
	* @author: zhangjj_crmpd
	* @title: createDetailTableAndLoadCustGroup 
	* @param tempTableStr 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void createDetailTableAndLoadCustGroup(String tempTableStr) throws StrategyError;
		
	/**
	 * 创建动态标签客户群明细文件--从hive中将明细数据导入到文件中
	* @date: 2017-2-16
	* @author: luogj
	* @title: createLabelCustGroupDetailFileDynamic 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void createLabelCustGroupDetailFileDynamic(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 创建静态标签客户群明细文件--从hive中将明细数据导入到文件中
	* @date: 2017-2-16
	* @author: luogj
	* @title: createLabelCustGroupDetailFileStatic 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void createLabelCustGroupDetailFileStatic(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 创建标签表和加载导入模式客户群
	* @date: 2017-2-11 
	* @author: zhangjj_crmpd
	* @title: createLabelTabelAndLoadCustGroup 
	* @param tempTableStr
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void createLabelTabelAndLoadCustGroup(String tempTableStr,Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查看客户群标签表结构
	* @date: 2017-2-22 
	* @author: zhangjj_crmpd
	* @title: descCustGroupTempTable 
	* @param tempTableStr
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> descCustGroupLabelTempTable(String tempTableStr) throws StrategyError;
	
	/**
	 * 删除客户群临时表
	* @date: 2017-1-16 
	* @author: zhangjj_crmpd
	* @title: dropCustGroupTemp 
	* @param tempTableStr 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void dropCustGroupTemp(String tempTableStr) throws StrategyError;

	
	/**
	 * 筛选出临时表
	* @date: 2017-1-16 
	* @author: zhangjj_crmpd
	* @title: filtrateTemporaryTab 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> filtrateTemporaryTab(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 从缓存中过滤出静态标签目标客户群
	* @date: 2017-3-14 
	* @author:liuqi
	* @title: handleStaticLabelLoadCustGroupInfo 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void handleStaticLabelLoadCustGroupInfo(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 获取客户群明细解析表达式
	* @date: 2016-10-17 
	* @author: sunliang 
	* @title: getCustGroupParseFormula 
	* @param custGroupTypeAndFormulaMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getCustGroupParseFormula(Map<String,String> custGroupTypeAndFormulaMap, String custGroupId) throws StrategyError;
	
	/** 获取用户自定义标签
	* @date: 2017-2-21 
	* @author: wangpei
	* @title: getCustGroupCustomLabel 
	* @param userParam
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,String> getCustGroupCustomLabel(Map<String,Object> userParam,  Map<String,Object> tempInParam) throws StrategyError;

	/**
	 * 处理导入目标客户群Csv
	* @date: 2017-1-17 
	* @author: zhangjj_crmpd
	* @title: handleCustGroupCsv 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void handleCustGroupCsv(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 处理客户群导入Excel文件
	* @date: 2017-1-17 
	* @author: zhangjj_crmpd
	* @title: handleCustGroupExcel 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void handleCustGroupExcel(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 处理数据源模式客户群
	* @date: 2017-1-18 
	* @author: zhangjj_crmpd
	* @title: handleDBCustGroup 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void handleDBCustGroup(Map<String, Object> inParam) throws StrategyError;

	
	/**
	 * 判断指定用户是否在指定COC目标客户群下
	* @date: 2016-11-23 
	* @author: yangwl
	* @title: isCocCustGroupUser 
	* @param inParam
	* @param cocCustGroupIdList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public boolean isCocCustGroupUser(Map<String, Object> inParam,Map<String, Object> userMap,List<String> cocCustGroupIdList) throws StrategyError;
	
	/**
	 * 判断指定用户是否在指定目标客户群
	* @date: 2016-10-2 
	* @author: sunliang 
	* @title: isCustGroupUser 
	* @param inParam
	* @param custGroupKindMap
	* @param userLabelMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public boolean isCustGroupUser(Map<String,Object> inParam,Map<String, Object> userMap,Map<String,List<String>> custGroupKindMap,Map<String,String> userLabelMap) throws StrategyError;
	
	/**
	 * 判断指定用户是否在指定导入目标客户群下
	* @date: 2016-9-15 
	* @author: sunliang 
	* @title: isLoadCustGroupUser 
	* @param inParam
	* @param custGroupIdList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public boolean isLoadCustGroupUser(Map<String, Object> inParam,Map<String, Object> userMap,List<String> custGroupIdList,Map<String,String> userLabelMap) throws StrategyError;
	
	/**
	 * 判断指定用户是否在指定标签目标客户群下
	* @date: 2016-10-2 
	* @author: sunliang 
	* @title: isLabelCustGroupUser 
	* @param inParam
	* @param custGroupIdList
	* @param userLabelMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public boolean isLabelCustGroupUser(Map<String, Object> inParam,Map<String, Object> userMap,List<String> custGroupIdList,Map<String,String> userLabelMap) throws StrategyError;
	
	/**
	 * 判断客户群是否能被删除
	* @date: 2017-2-16 
	* @author: wuJiaFu
	* @title: isRemoveCustGroup 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> isRemoveCustGroup(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	/**
	 * coc目标客户群解析
	* @date: 2017-1-18 
	* @author: zhangjj_crmpd
	* @title: parseCocCustGroup 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void parseCocCustGroup(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 解析目标客户群标签缓存
	* @date: 2016-12-29 
	* @author: sunliang 
	* @title: parseCustGoupLabelCache 
	* @param allCustGroupLabelList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<Object,Object> parseCustGoupLabelCache(List<Map<String, Object>> allCustGroupLabelList) throws StrategyError;
	
	
	/**
	 * 查询客户群基本信息列表
	* @date: 2016-10-2 
	* @author: sunliang 
	* @title: queryCustGroupList 
	* @param inParam
	* @param queryFilter
	* @param sortParamer
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupList(Map<String,Object> inParam,IQueryFilter queryFilter,ISortParamer sortParamer) throws StrategyError;
	
	/**
	 * 根据营销案ID查询客户群信息
	* @date: 2016-10-2 
	* @author: sunliang 
	* @title: queryCustGroupByMarketCaseId 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupByMarketCaseId(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError; 
	
	/**
	 *  查询客户群的数量
	* @date: 2016-10-2 
	* @author: sunliang 
	* @title: queryCustGroupById 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupById(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 * 根据客户群Id查询客户群信息（标签，导入）
	* @date: 2016-10-2 
	* @author: sunliang 
	* @title: queryCustGroupCountById 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupCountById(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 * 查询符合标签的客户群数量
	* @date: 2017-1-24 
	* @author: zhangjj_crmpd
	* @title: queryCustGroupCountByUserLabel 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupCountByUserLabel(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 *  查询二次过滤标签的人数
	* @date: 2017-4-7 
	* @author: chenhao
	* @title: queryLabelFormulaRestrictCountById 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryLabelFormulaRestrictCountById(Map<String, Object> inParam) throws StrategyError;
	/**
	 * 查询客户群处理记录
	* @date: 2017-3-7 
	* @author: tangaq
	* @title: queryCustGroupHandleRecord 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupHandleRecord(Map<String,Object> inParam) throws  StrategyError;
	
	/**
	 * 静态标签目标客户群表关联hive扩展表
	* @date: 2017-3-14 
	* @author:liuqi
	* @title: relateStaticLabelCustGroupTableToHive 
	* @param custGroupId 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void relateStaticLabelCustGroupTableToHive(String custGroupId) throws StrategyError;
	
	/**
	 * 查询数据源模式进程信息
	* @date: 2017-1-18 
	* @author: zhangjj_crmpd
	* @title: queryDBCustGroupShellProcess 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, Object>> queryDBCustGroupShellProcess(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 移除标签目标客户群
	* @date: 2017-4-25 
	* @author: zhangzx_crmpd
	* @title: removeLabelCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeLabelCustGroup(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 移除导入目标客户群
	* @date: 2017-4-25 
	* @author: zhangzx_crmpd
	* @title: removeLoadCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeLoadCustGroup(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 *移除客户群信息 
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: removeCustGroupById 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeCustGroupById(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 删除单个号码
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: removeSingleNoFromCustGroup 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeSingleNoFromCustGroup(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 批量删除客户群明细表
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: removeBatchNoFromCustGroup 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeBatchNoFromCustGroup(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 更新客户群
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: updateCustGroupById 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateCustGroupById(Map<String,Object> inParam) throws StrategyError;



	

}
