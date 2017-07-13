package com.sitech.strategy.core.objectville.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.pojo.inter.hive.IHiveDBName;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.FileUtil;
import com.sitech.strategy.common.utils.MD5RowKeyGenerator;
import com.sitech.strategy.common.utils.PropertiesUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IAttach;
import com.sitech.strategy.core.objectville.inter.ICustGroup;
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;

/**
 * 目标客户群对象
* @date: 2016-9-9 
* @author: wangth
* @Title: CustGroup 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public class CustGroup extends BaseClass implements ICustGroup,Serializable {
	
	/**
	 * 附件对象
	 */
	protected IAttach attach;
	
	/**
	 * 营销案对象
	 */
	protected IMarketCase marketCase;
	/**
	 * 查询参数处理内部类
	 */
	protected QueryParamSettle queryParamSettle = new QueryParamSettle();
	/**
	 * 客户群删除对象
	 */
	protected IDataDeleter.ICustGroupDeleter custGroupDeleter;
	/**
	 * 客户群插入对象
	 */
	protected IDataInsertor.ICustGroupInsertor custGroupInsertor;
	/**
	 * 客户群更新对象
	 */
	protected IDataUpdater.ICustGroupUpdater custGroupUpdater;
	/**
	 * 客户群查询对象
	 */
	protected IDataSelector.ICustGroupSelector custGroupSelector;
	/**
	 * hive表pojo对象
	 */
	protected IHiveDBName hiveDBName;
	/**
	 * 系统处理插入对象
	 */
	protected IDataInsertor.ISystemDealInsertor systemDealInsertor;
	/**
	 * 系统处理查询对象
	 */
	protected IDataSelector.ISystemDealSelector systemDealSelector;
	/**
	 * 系统处理查询对象
	 */
	protected IDataUpdater.ISystemDealUpdater systemDealUpdater;
	
	/**
	 * 公共查询对象
	 */
	protected IDataSelector.ICommonSelector commonSelector;
	/**
	 * 工号查询对象
	 */
	protected IDataSelector.ILoginSelector loginSelector;
	
	/**
	 * 附件查询对象
	 */
	protected IDataSelector.IAttachSelector attachSelector;
	
	/**
	 * 用户查询对象
	 */
	protected IDataSelector.IUserSelector userSelector;
	
	/**
	 * 清单插入对象
	 */
	protected IDataInsertor.IInventoryInsertor inventoryInsertor;
	
	/**
	 * 清单删除对象
	 */
	protected IDataDeleter.IInventoryDeleter inventoryDeleter;
	
	/**
	 * 
	* @date: 2016-10-23 
	* @author: wangth
	* @Title: setAttach 
	* @param attach 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAttach(IAttach attach) {
		this.attach = attach;
	}

	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setCustGroupInsertor 
	* @param custGroupInsertor 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupInsertor(
			IDataInsertor.ICustGroupInsertor custGroupInsertor) {
		this.custGroupInsertor = custGroupInsertor;
	}
	
	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setCustGroupDeleter 
	* @param custGroupDeleter 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupDeleter(IDataDeleter.ICustGroupDeleter custGroupDeleter) {
		this.custGroupDeleter = custGroupDeleter;
	}
	
	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setCustGroupUpdater 
	* @param custGroupUpdater 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupUpdater(IDataUpdater.ICustGroupUpdater custGroupUpdater) {
		this.custGroupUpdater = custGroupUpdater;
	}
	
	/**
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setCustGroupSelector 
	* @param custGroupSelector 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupSelector(
			IDataSelector.ICustGroupSelector custGroupSelector) {
		this.custGroupSelector = custGroupSelector;
	}
	
	/**
	 * 
	* @date: 2016-12-22 
	* @author: sunliang 
	* @title: setHiveDBName 
	* @param hiveDBName 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setHiveDBName(IHiveDBName hiveDBName) {
		this.hiveDBName = hiveDBName;
	}


	/**
	 * 
	* @date: 2016-10-23 
	* @author: wangth
	* @Title: setSystemDealInsertor 
	* @param systemDealInsertor 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSystemDealInsertor(
			IDataInsertor.ISystemDealInsertor systemDealInsertor) {
		this.systemDealInsertor = systemDealInsertor;
	}
	
	/**
	 * 
	* @date: 2017-1-16 
	* @author: zhangjj_crmpd
	* @title: setCommonSelector 
	* @param commonSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCommonSelector(IDataSelector.ICommonSelector commonSelector) {
		this.commonSelector = commonSelector;
	}
	
	/**
	 * 
	* @date: 2017-1-18 
	* @author: zhangjj_crmpd
	* @title: setSystemDealSelector 
	* @param systemDealSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSystemDealSelector(
			IDataSelector.ISystemDealSelector systemDealSelector) {
		this.systemDealSelector = systemDealSelector;
	}
	
	/**
	 * 
	* @date: 2017-1-18 
	* @author: zhangjj_crmpd
	* @title: setSystemDealUpdater 
	* @param systemDealUpdater 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSystemDealUpdater(
			IDataUpdater.ISystemDealUpdater systemDealUpdater) {
		this.systemDealUpdater = systemDealUpdater;
	}
	
	/**
	 * 
	* @date: 2017-1-18 
	* @author: zhangjj_crmpd
	* @title: setLoginSelector 
	* @param loginSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setLoginSelector(IDataSelector.ILoginSelector loginSelector) {
		this.loginSelector = loginSelector;
	}
	
	/**
	 * 
	* @date: 2017-2-17
	* @author: luogj
	* @title: setAttachSelector 
	* @param attachSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAttachSelector(IDataSelector.IAttachSelector attachSelector) {
		this.attachSelector = attachSelector;
	}
	
	/**
	 * 
	* @date: 2017-2-23 
	* @author: zhangjj_crmpd
	* @title: setUserSelector 
	* @param userSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setUserSelector(IDataSelector.IUserSelector userSelector) {
		this.userSelector = userSelector;
	}
	
	/**
	 * 
	* @date: 2017-3-20 
	* @author: liuqi
	* @title: getInventoryInsertor 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public IDataInsertor.IInventoryInsertor getInventoryInsertor() {
		return inventoryInsertor;
	}
	
	/**
	 * 
	* @date: 2017-3-20 
	* @author: liuqi
	* @title: setInventoryInsertor 
	* @param inventoryInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setInventoryInsertor(IDataInsertor.IInventoryInsertor inventoryInsertor) {
		this.inventoryInsertor = inventoryInsertor;
	}
	
	/**
	 * 
	* @date: 2017-4-25 
	* @author: zhangzx_crmpd
	* @title: setInventoryDeleter 
	* @param inventoryDeleter 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setInventoryDeleter(IDataDeleter.IInventoryDeleter inventoryDeleter) {
		this.inventoryDeleter = inventoryDeleter;
	}

	/**
	 * 批量添加客户群
	* @date: 2016-9-9 
	* @author: wangth
	* @Title: addBatchNoToCustGroup 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addBatchNoToCustGroup(Map<String,Object> inParam) throws StrategyError {
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		custGroupInsertor.insertCustGroupDetail(inParam,tempInParam);
	}
	
	/**
	 * 增加静态标签目标客户群信息（hive表）
	* @date: 2017-3-14 
	* @author: liuqi
	* @title: addStaticLabelCustGroupTableInfo 
	* @param custGroupId
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addStaticLabelCustGroupTableInfo(String custGroupId) throws StrategyError{
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("custGroupId", custGroupId);
		custGroupInsertor.insertStaticLabelCustGroupTableInfo(inParam);
	}
	
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
	@Override
	public void createStaticLabelCustGroupTable(String custGroupId) throws StrategyError{
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("custGroupId", custGroupId);
		custGroupInsertor.createCustGroupDetailHbaseTable(inParam, inParam);
	}
	
	/**
	 * 添加数据库模式目标客户群
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addDataCustGroup 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addDataCustGroup(Map<String,Object> inParam) throws StrategyError {
		String custGroupId = (String) inParam.get("custGroupId");
		if(!CommonUtils.objectIsNull(inParam.get("custGroupUpdate"))){
			this.updateDBCustGroup(inParam);
		}else{
			if(!CommonUtils.objectIsNull(custGroupId)){
				saveDataCustGroup(inParam);
				settleDBCustGroupShellProcessParam(inParam);
				
			}
		}
		
	
	}
	
	/**
	 * 添加导入目标客户群
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addLoadCustGroup 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addLoadCustGroup (Map<String,Object> inParam) throws StrategyError {
		
		Map<String, Object> inMap = new HashMap<String, Object>();
		inMap.put("serialId",SequenceUtil.getSequence());
		inMap.put("busiId",inParam.get("custGroupId"));
		inMap.put("busiType",inParam.get("custGroupType"));
		inMap.put("statusCode",Const.MARKET_CASE_STATUS_DEFAULT);
		inMap.put("inventoryName",inParam.get("custGroupId"));
		saveLoadCustGroup(inParam);
		inventoryInsertor.insertInventoryInfo(inMap, inMap);
		
	}
	
	/**
	 * 添加标签目标客户群
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
	@Override
	public Map<String, Object> addLabelCustGroup (Map<String,Object> inParam) throws StrategyError {
		String custGroupId = (String) inParam.get("custGroupId");
		Map<String, Object> idMap = new HashMap<String, Object>();
		if(CommonUtils.objectIsNull(custGroupId)){
			idMap = saveLabelCustGroup(inParam);
		}else{
			updateLabelCustGroup(inParam);
		}
		return idMap;
	}		


	/**
	 *  添加单个号码到目标客户群
	* @date: 2016-9-9 
	* @author: wangth
	* @Title: addSingleNoToCustGroup 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> addSingleNoToCustGroup(Map<String,Object> inParam) throws StrategyError {
		//将服务号码 保存到rm_custgroup_custGroupId_detail_info
		 Map<String, Object> tempInParam = saveSingleNo2CustGroupDetailInfo(inParam);
		 log.info("addSingleNoToCustGroup", inParam);
		 if(!(Boolean) tempInParam.get("result")){
			 return tempInParam;
		 }
		//将标签信息保存到rm_custgroup_custGroupId_label_info
		 tempInParam = saveSingleNo2CustGroupLabelInfo(inParam);
		return tempInParam;
	}
	
	/**
	 * 创建详情表和加载导入模式客户群
	* @date: 2017-1-16 
	* @author: zhangjj_crmpd
	* @title: createDetailTableAndLoadCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void createDetailTableAndLoadCustGroup(String tempTableStr) throws StrategyError {
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		tempInParam.put("tableStr", tempTableStr.substring(0,tempTableStr.lastIndexOf("_")));
		tempInParam.put("tempTableStr", tempTableStr);
		String tableStrFileName=(String) tempInParam.get("tableStr");
		String[] name = tableStrFileName.split("_");
		String custGroupId = name[2];
		long start = System.currentTimeMillis();
		Date startTime = new Date();
		//将客户群明细导入数据
		custGroupInsertor.custGroupDetailLoadToHive(tempInParam, tempInParam);
		long end = System.currentTimeMillis();
		Date endTime = new Date();
		
		//先注释
		//将成功导入的用户数量存在custGroupInfo表中 
		//表名为rm_custgroup_custGroupId_detail
		//String custGroupId=tableStrFileName.substring(22, 45);
		Map<String,Object> custGroupIdInParam = new HashMap<String, Object>();
		custGroupIdInParam.put("tableStrFileName", tableStrFileName);
		List<Map<String,Object>> outMap=custGroupSelector.getCustGroupDetailCountFromHive(custGroupIdInParam);
		String count = CommonUtils.objectIsNull(outMap.get(0).get("count"))?  "0": (String)outMap.get(0).get("count");
		Map<String,Object> countParam = new HashMap<String, Object>();
		countParam.put("custGroupNum", count);
		countParam.put("custGroupId", custGroupId);
		custGroupUpdater.updateCustGroupDetailCountInfo(countParam);
		countParam.put("disposeTime", end-start);
		countParam.put("startTime", DateUtil.DateToString(startTime, DateUtil.TIME_FROMAT_SIMPLE3) );
		countParam.put("endTime", DateUtil.DateToString(endTime, DateUtil.TIME_FROMAT_SIMPLE3));
		//将此客户群关联的营销案进程表刷新
		//marketCase.updateMarketCaseShellProcessByCustGroupId(tempInParam, countParam);
		//保存客户群数据处理记录信息
		//saveCustGroupHandleRecord(countParam);
	}
	
	/**
	 * 创建详情表和加载导入模式客户群
	* @date: 2017-1-16 
	* @author: zhangjj_crmpd
	* @title: createLabelTabelAndLoadCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void createLabelTabelAndLoadCustGroup(String tempTableStr,Map<String,Object> inParam) throws StrategyError {
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		tempInParam.put("tableStr", tempTableStr.substring(0,tempTableStr.lastIndexOf("_")));
		inParam.put("tableStr", tempTableStr.substring(0,tempTableStr.lastIndexOf("_")));
		tempInParam.put("tempTableStr", tempTableStr);
		custGroupInsertor.custGroupLabelLoadToHive(inParam, tempInParam);
	}
	
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
	@Override
	public void createLabelCustGroupDetailFileDynamic(Map<String,Object> inParam) throws StrategyError{
		custGroupInsertor.createLabelCustGroupDetailFileDynamic(inParam);
	}
	
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
	@Override
	public void createLabelCustGroupDetailFileStatic(Map<String,Object> inParam) throws StrategyError{
		custGroupInsertor.createLabelCustGroupDetailFileStatic(inParam);
	}
	
	/**
	 * 删除导入目标客户群
	* @date: 2017-4-25 
	* @author: zhangzx_crmpd
	* @title: deleteLoadCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void deleteLoadCustGroup(Map<String, Object> inParam) throws StrategyError {		
		//删除基本数据
		custGroupDeleter.deleteCustGroup(inParam);
		
		Map<String,Object> tempInParam = new HashMap<String, Object>();
		tempInParam.put("busiId", inParam.get("custGroupId"));
		attach.removeAttach(tempInParam);
		
	}
	
	/**
	 * 查看客户群标签表结构
	* @date: 2017-2-22 
	* @author: zhangjj_crmpd
	* @title: descCustGroupLabelTempTable 
	* @param tempTableStr
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> descCustGroupLabelTempTable(String tempTableStr)
			throws StrategyError {
		Map<String,Object> tempInParam = new HashMap<String, Object>();
		Map<String,Object> tempOutParam = new HashMap<String, Object>();
		tempInParam.put("tempTableStr", tempTableStr);
		tempOutParam.put("descTable", commonSelector.descTable(tempInParam));
		return tempOutParam;
	}
	
	/**
	 * 删除客户群临时表
	* @date: 2017-1-16 
	* @author: zhangjj_crmpd
	* @title: dropCustGroupTemp 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void dropCustGroupTemp(String tempTableStr) throws StrategyError {
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		tempInParam.put("tableStr", tempTableStr.substring(0,tempTableStr.lastIndexOf("_")));
		tempInParam.put("tempTableStr", tempTableStr);
		custGroupDeleter.dropCustGroupTemp(tempInParam);
		
	}
	
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
	@Override
	public Map<String, Object> filtrateTemporaryTab(Map<String, Object> inParam) throws StrategyError {
		List<Map<String, Object>>  resultList = commonSelector.showTables(inParam);
		List<String> tempTableList = new ArrayList<String>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		if(!CommonUtils.objectIsNull(resultList)){
			for(Map<String,Object> resultMap : resultList){
				String tabName = CommonUtils.toString(resultMap.get("tab_name"));
				if(tabName.endsWith(CommonUtils.toString(inParam.get("tablePostfix")) )){
					tempTableList.add(tabName);
				}
			}
		}
		outMap.put("tempTableList", tempTableList);
		return outMap;
	}
	
	/**
	 * 从缓存中过滤出目标客户群(静态标签类型)
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
	@Override
	public void  handleStaticLabelLoadCustGroupInfo(Map<String, Object> inParam) throws StrategyError{
		
		Map<String, Object> tempInParam = new HashMap<String, Object>();
			tempInParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_CUSTGROUP_HIVETABLENAME);
			tempInParam.put(Const.CACHE_START, "0");
			tempInParam.put(Const.CACHE_END, "-1");
			tempInParam.put(Const.CACHE_DIRECTION, "1");
			
			boolean boo=true;
			while(boo){
				String custGroupTableNameStr=custGroupDeleter.getAndDeleteCustGroupTableNameCache(tempInParam);
				if(custGroupTableNameStr==null||custGroupTableNameStr==""){
					return;
				}
				String custId="";
				String[] cust=null;
						if(!CommonUtils.objectIsNull(custGroupTableNameStr)){
							cust=custGroupTableNameStr.split("_");
							custId =cust[2];
							Map<String, Object> inPar = new HashMap<String, Object>();
							inPar.put("custGroupId", custId);
							custGroupInsertor.createCustGroupDetailHbaseTable(inPar, inPar);
							custGroupInsertor.createRelateStaticLabelCustGroupTableToHive(inPar);
							custGroupInsertor.insertStaticLabelCustGroupTableInfo(inPar);																										
				}
			}						
	}
	
	/**
	 * 获取客户群明细解析表达式
	* @date: 2016-10-17 
	* @author: sunliang 
	* @title: getCustGroupParseFormula 
	* @param custGroupTypeAndFormulaMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getCustGroupParseFormula(Map<String,String> custGroupTypeAndFormulaMap, String custGroupId){
		Set<String> custGroupTypeSet = custGroupTypeAndFormulaMap.keySet();
		String sql = null;
		
		for(String custGroupType : custGroupTypeSet){
			if(Const.CUSTGROUP_TYPE_LOAD.equals(custGroupType)){
				sql = hiveDBName.getCustGroupSQLByLoadMode(custGroupTypeAndFormulaMap,custGroupType);
			}else if(Const.CUSTGROUP_TYPE_LABEL.equals(custGroupType)){
				sql = hiveDBName.getCustGroupSQLByLabelMode(custGroupTypeAndFormulaMap,custGroupType);
			}if(Const.CUSTGROUP_TYPE_LABEL_STATIC.equals(custGroupType)){
				sql = hiveDBName.getCustGroupSQLByLoadMode(custGroupTypeAndFormulaMap,custGroupType);
			}
		}
		
		return sql;
	}
	
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
	@Override
	public Map<String,String> getCustGroupCustomLabel(Map<String, Object> userParam,Map<String, Object> tempInParam) throws StrategyError {
		return custGroupSelector.selectCustGroupCustomLabel(userParam, tempInParam);
	}

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
	@Override
	public void handleCustGroupCsv(Map<String, Object> inParam) throws StrategyError {
		/*1将Csv文件读取到List<Map<string,object>>中
		 * 2.Csv第一列写入到detail_info文件当中
		 * 3.将第一行数据入到RM_CUSTGROUP_客户群Id_LABEL_INFO.head文件中
		 * 4.将其余数据入到RM_CUSTGROUP_客户群Id_LABEL_INFO.label文件中
		 */
		File excelFile = new File(PropertiesUtil.getProperty("filePath.properties", "LoadCustGroupByExcel"));
		File bakDesDri= new File(PropertiesUtil.getProperty("filePath.properties", "LoadCustGroupByExcelBak"));
		File[] excelList = excelFile.listFiles();
		for (int i = 0; i < excelList.length; i++) {
			String fileName = excelList[i].getAbsolutePath();
			log.info("fileName:", fileName);
		   if (excelList[i].isFile() && fileName.toUpperCase().endsWith(".CSV")) {
			   List<List<String>> excelContentList = FileUtil.readCsv(excelList[i].getAbsolutePath());
			   log.debug("excelContentList:", excelContentList);
			   String labelInfoFileName=FileUtil.getFileName(fileName).replace("DETAIL", "LABEL");
			   writeCustGroupDetailInfo(excelContentList,FileUtil.getFileName(fileName)+".txt");
			   writeCustGroupLabelInfo(excelContentList,labelInfoFileName+".label",labelInfoFileName+".head");
			   FileUtil.moveSrcFile(excelList[i], bakDesDri);
		   }
		}
		
	}
	
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
	@Override
	public void handleCustGroupExcel(Map<String, Object> inParam) throws StrategyError {
		/*1将excel文件读取到List<Map<string,object>>中
		 * 2.excel第一列写入到detail_info文件当中
		 * 3.将第一行数据入到RM_CUSTGROUP_客户群Id_LABEL_INFO.head文件中
		 * 4.将其余数据入到RM_CUSTGROUP_客户群Id_LABEL_INFO.label文件中
		 */
		File excelFile = new File(PropertiesUtil.getProperty("filePath.properties", "LoadCustGroupByExcel"));
		File bakDesDri= new File(PropertiesUtil.getProperty("filePath.properties", "LoadCustGroupByExcelBak"));
		File[] excelList = excelFile.listFiles();
		if(CommonUtils.objectIsNull(excelList) ){
			return;
		}
		for (int i = 0; i < excelList.length; i++) {
			String fileName = excelList[i].getAbsolutePath();
			log.info("fileName:", fileName);
		   if (excelList[i].isFile() && (fileName.toUpperCase().endsWith(".XLS") || fileName.toUpperCase().endsWith(".XLSX"))) {
			   List<List<String>> excelContentList = FileUtil.readExcel(excelList[i].getAbsolutePath());
			   String labelInfoFileName=FileUtil.getFileName(fileName).replace("DETAIL", "LABEL");
			   writeCustGroupDetailInfo(excelContentList,FileUtil.getFileName(fileName)+".txt");
			   writeCustGroupLabelInfo(excelContentList,labelInfoFileName+".label",labelInfoFileName+".head");
			   FileUtil.moveSrcFile(excelList[i], bakDesDri);
		   }
		}
		
	}
	
	/**
	 * 
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
	@Override
	public void handleDBCustGroup(Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		//根据BusiID查找数据源客户群 sql字段
		String busiId = inParam.get("busiId").toString();
		queryFilter.setCustGroupId(busiId);
		Map<String, Object> custGroupMap = queryCustGroupById(inParam, queryFilter);
		Map<String, Object> tempInParam = custGroupMap;
		tempInParam.put("tableStr", "Rm_custGroup_"+custGroupMap.get("custGroupId")+"_detail_info");
		//创建目标客户群明细表
		createDBCustGroup(custGroupMap,tempInParam);
		writeSqoopInfo(tempInParam.get("tableStr").toString(),custGroupMap.get("relatedDataSourceName").toString());
		//更新进程表数据
		updateShellProcessStatus(inParam);
	}
	
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
	@Override
	public boolean isCocCustGroupUser(Map<String, Object> inParam,Map<String, Object> userMap,List<String> cocCustGroupIdList) throws StrategyError {
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		String rowKey = (String)MD5RowKeyGenerator.generate((String)userMap.get("phoneNo"));
		for(String custGroupId : cocCustGroupIdList){
			//校验用户是否在目标客户群明细表中
			rowKey = rowKey + "|" + custGroupId;
			tempInParam.put(Const.NOSQL_ROWKEY, rowKey);
			tempInParam.put("startRow", rowKey);
			tempInParam.put("stopRow", rowKey+Const.SEPARATOR_TILDE);
			//湖北客户群今日生成昨天的数据，故查询前一日客户群数据
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(DateUtil.StringToDate((String)inParam.get("queryDate"), DateUtil.DATE_FROMAT_YYYYMMDD1));
			calendar.add(Calendar.DAY_OF_MONTH, -1);
			String queryDate = DateUtil.DateToString(calendar.getTime(), DateUtil.DATE_FROMAT_YYYYMMDD1);
			tempInParam.put("queryDate", queryDate);
			Map<String, Map<String,Map<String,String>>> custGroupDetailMap =  custGroupSelector.selectCocCustomerGroupByRowKey(tempInParam);
			if(!CommonUtils.objectIsNull(custGroupDetailMap)){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 判断指定用户是否在指定目标客户群
	* @date: 2016-9-16 
	* @author: sunliang 
	* @title: isCustGroupUser 
	* @param inParam
	* @param custGroupKindMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public boolean isCustGroupUser(Map<String, Object> inParam,Map<String, Object> userMap,
			Map<String,List<String>> custGroupKindMap,Map<String,String> userLabelMap) throws StrategyError {
		
		//导入模式目标客户群判断
		List<String> loadCustGroupIdList = (List<String>)custGroupKindMap.get(Const.CUSTGROUP_TYPE_LOAD);
		if(loadCustGroupIdList!=null && this.isLoadCustGroupUser(inParam,userMap,loadCustGroupIdList, userLabelMap)){
			 return true;
		}
		
		//数据源模式目标客户群判断
		List<String> dbCustGroupIdList = (List<String>)custGroupKindMap.get(Const.CUSTGROUP_TYPE_DB);
		if(dbCustGroupIdList!=null && this.isLoadCustGroupUser(inParam,userMap,dbCustGroupIdList, userLabelMap)){
			 return true;
		}
		
		//标签模式目标客户群判断
		List<String> labelCustGroupIdList = (List<String>)custGroupKindMap.get(Const.CUSTGROUP_TYPE_LABEL);
		if(labelCustGroupIdList!=null && this.isLabelCustGroupUser(inParam,userMap,labelCustGroupIdList,userLabelMap)){
			 return true;
		}

		//COC模式目标客户群判断
		List<String> cocCustGroupIdList = (List<String>)custGroupKindMap.get(Const.CUSTGROUP_TYPE_COC);
		if(cocCustGroupIdList!=null && this.isCocCustGroupUser(inParam,userMap,cocCustGroupIdList)){
			 return true;
		}
		
		//静态标签模式客户群判断
		List<String> staticLabelCustGroupIdList = (List<String>)custGroupKindMap.get(Const.CUSTGROUP_TYPE_LABEL_STATIC);
		if(staticLabelCustGroupIdList!=null && this.isLoadCustGroupUser(inParam,userMap,staticLabelCustGroupIdList, userLabelMap)){
			 return true;
		}
		
		return false;
	}
	
	/**
	 * 判断指定用户是否在指定标签目标客户群下
	* @date: 2016-9-15 
	* @author: sunliang 
	* @title: isLabelCustGroupUser 
	* @param inParam
	* @param custGroupIdList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public boolean isLabelCustGroupUser(Map<String, Object> inParam,Map<String, Object> userMap,List<String> labelCustGroupIdList,Map<String,String> userLabelMap) throws StrategyError {
		
		Map<String,String> custGroupIdAndLabelMap = new HashMap<String,String>();
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		
		//查询客户群标签表达式
		for(String custGroupId : labelCustGroupIdList){
			log.debug("====isLabelCustGroupUser====custGroupId==", custGroupId);
			tempInParam.put("key", Const.CACHE_DATATYPE_CUSTGROUP_LABELFORMULA+custGroupId);
			String custGroupLabel = custGroupSelector.getCustGroupLabelFromCache(tempInParam);
			log.debug("====isLabelCustGroupUser====custGroupLabel==", custGroupLabel);
			custGroupIdAndLabelMap.put(custGroupId, custGroupLabel);
		}
		
		//校验标签
		boolean b = filterLabelCustGroup(userLabelMap,custGroupIdAndLabelMap);
		return b;
	}
	
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
	@Override
	public boolean isLoadCustGroupUser(Map<String, Object> inParam,Map<String, Object> userMap,List<String> loadCustGroupIdList,Map<String,String> userLabelMap) throws StrategyError {
		Map<String,String> custGroupIdAndLabelMap = new HashMap<String,String>();
		for(String custGroupId : loadCustGroupIdList){
			//校验用户的idNo是否在目标客户群明细表中
			IQueryFilter queryFilter = new QueryFilter();
			queryFilter.setCustGroupId(custGroupId);
			Map<String, String> custGroupDetailMap =  custGroupSelector.selectCustGroupDetailByIdNo(userMap, queryFilter);
			if(!CommonUtils.objectIsNull(custGroupDetailMap) && custGroupDetailMap.get("idNo").equals(userMap.get("idNo"))){
				Map<String, Object> tempInParam = new HashMap<String, Object>();
				tempInParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_CUSTGROUP_LABELFORMULA + custGroupId);
				log.debug("===isLoadCustGroupUser===tempInParam===", tempInParam);
				String custGroupLabel = custGroupSelector.getCustGroupLabelFromCache(tempInParam);
				log.debug("===isLoadCustGroupUser===custGroupLabel===", custGroupLabel);
				if(CommonUtils.objectIsNull(custGroupLabel)){
					return true;
				}else{
					custGroupIdAndLabelMap.put(custGroupId, custGroupLabel);
					//校验标签
					boolean b = filterLabelCustGroup(userLabelMap,custGroupIdAndLabelMap);
					log.debug("===isLoadCustGroupUser===b===", b);
					return b;
				}
			}
			
		}
		return false;
	}	
	
	/**
	 * 判断客户群是否能被删除
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: isRemoveCustGroup 
	* @param inParam
	* @return outList
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> isRemoveCustGroup(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError{
		List<Map<String,Object>> outList = custGroupSelector.selectCustGroupAndActRealation(inParam, queryFilter);
		//在本方法里判断客户群是否能被删除
		
		return outList;
	}
	
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
	@Override
	public Map<Object, Object> parseCustGoupLabelCache(
			List<Map<String, Object>> allCustGroupLabelList)
			throws StrategyError {
		Map<Object, Object> allCustGroupLabelMap = new HashMap<Object, Object>();
		for(Map<String,Object> allCustGroupLabel : allCustGroupLabelList){
			if(!CommonUtils.objectIsNull(allCustGroupLabel.get("labelFormula"))){				
				allCustGroupLabelMap.put(Const.CACHE_DATATYPE_CUSTGROUP_LABELFORMULA + allCustGroupLabel.get("custGroupId"), allCustGroupLabel.get("labelFormula"));
			}else if(!CommonUtils.objectIsNull(allCustGroupLabel.get("label_formula_restrict"))){
				allCustGroupLabelMap.put(Const.CACHE_DATATYPE_CUSTGROUP_LABELFORMULA + allCustGroupLabel.get("custGroupId"), allCustGroupLabel.get("label_formula_restrict"));
			}
		}
		return allCustGroupLabelMap;
	}
	
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
	@Override
	public void parseCocCustGroup(Map<String, Object> inParam) throws StrategyError {
		String xmlPath = inParam.get("xmlPath").toString();
		String[] tagNames = new String[]{"customGroupId", "customDesc", "customName", "customRules", "dataTime", "rowNumber", 
				"userId", "sendTime", "startDate", "endDate", "listTableName", "updateCycle"};
		Map<String, Object> outParamMap = new HashMap<String, Object>();
		outParamMap = parseXmlToRmCustGroupInfo(xmlPath, tagNames);
		outParamMap.put("custGroupId", outParamMap.get("customGroupId"));
		
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setCustGroupId(outParamMap.get("custGroupId").toString());
		List<Map<String, Object>> custGroupList = custGroupSelector.selectCustGroupList(inParam, queryFilter);
		outParamMap = prepareCustgroupParam(outParamMap);
		if (custGroupList.size() < 1) {
			custGroupInsertor.insertCustGroup(outParamMap, outParamMap);
		} else {
			outParamMap.put("updateNo", outParamMap.remove("operNo"));
			outParamMap.put("updateName", outParamMap.remove("operName"));
			outParamMap.put("updateTime", outParamMap.remove("operTime"));
			custGroupUpdater.updateCustGroupById(outParamMap);
		}
		File file = new File(xmlPath);
		file.delete();
	}
	
	/** 
	 * 参数处理
	* @date: 2016-10-31 
	* @author: songxj
	* @title: prepareCustgroupParam 
	* @param outParamMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected Map<String, Object> prepareCustgroupParam(
			Map<String, Object> outParamMap) throws StrategyError {
		outParamMap.put("custGroupName", outParamMap.get("customName"));
		outParamMap.put("custGroupType", Const.CUSTGROUP_TYPE_COC);
		outParamMap.put("operTime", DateUtil.stringToString(outParamMap.get("sendTime").toString(), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3));
		
		String startTime = "";
		if (null == outParamMap.get("startDate")) {
			startTime = DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3);
		} else {
			startTime = DateUtil.stringToString(outParamMap.get("startDate").toString(), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		}
		String endTime = "";
		if (null == outParamMap.get("endDate")) {
			endTime = DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3);
		} else {
			endTime = DateUtil.stringToString(outParamMap.get("endDate").toString(), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		}
		outParamMap.put("startTime", startTime);
		outParamMap.put("endTime", endTime);
		outParamMap.put("custGroupNum", outParamMap.get("rowNumber"));
		outParamMap.put("custGroupDesc", outParamMap.get("customDesc")+Const.SEPARATOR_AND+Const.SEPARATOR_DOLLARSIGN+
				Const.SEPARATOR_AND+Const.SEPARATOR_DOLLARSIGN+outParamMap.get("customRules"));
		outParamMap.put("operNo", outParamMap.get("userId"));
		outParamMap.put("statusCode", "04");
		outParamMap.put("operName", getLoginNameByLoginId(outParamMap));
		outParamMap.put("relatedDataSourceType", "coc");
		outParamMap.put("relatedDataSourceName", outParamMap.get("listTableName"));
		return outParamMap;
	}

	/** 
	 * 参数处理
	* @date: 2016-10-31 
	* @author: songxj
	* @title: parseXmlToRmCustGroupInfo 
	* @param outParamMap
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected Map<String, Object> parseXmlToRmCustGroupInfo(String xmlPath,
			String[] tagNames) throws StrategyError {
		Map<String, Object> outParamMap = new HashMap<String, Object>();
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(xmlPath);
			NodeList nl = null;
			Node node = null;
			String value = null;
			for (String tagName: tagNames) {
				nl = doc.getElementsByTagName(tagName);
				if (nl.getLength() > 0) {
					node = nl.item(0);
					if(node.hasChildNodes()){
						value = node.getFirstChild().getNodeValue();
						outParamMap.put(tagName, value);
					}
				}
			}
		} catch (DOMException e) {
			e.printStackTrace();
			throw new StrategyError(e);
		} catch (FactoryConfigurationError e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
			throw new StrategyError(e);
		} catch (SAXException e) {
			e.printStackTrace();
			throw new StrategyError(e);
		} catch (IOException e) {
			e.printStackTrace();
			throw new StrategyError(e);
		}
		return outParamMap;
	}

	/**
	 * 查询客户群基本信息列表
	* @date: 2016-9-9 
	* @author: wangth
	* @Title: queryCustGroupList 
	* @param queryFilter
	* @param sortParamer
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryCustGroupList(Map<String,Object> inParam,IQueryFilter queryFilter,ISortParamer sortParamer) throws StrategyError {
		queryParamSettle.settleQueryCustGroupListParam(inParam, queryFilter);
		Map<String,Object> tempInParam = new HashMap<String, Object>();
		tempInParam.putAll(inParam);
		tempInParam.put("startPage", inParam.get("currentPageCode"));
		tempInParam.put("limit", inParam.get("perRecordCount"));
		Map<String,Object> custGroupMap = custGroupSelector.selectCustGroupListByPage(inParam, tempInParam);
		custGroupMap.putAll(tempInParam);
		return custGroupMap;
	}
	
	/**
	 * 根据营销案ID查询客户群信息
	* @date: 2016-9-9 
	* @author: wangth
	* @Title: queryCustGroupByMarketCaseId 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Map<String,Object> queryCustGroupByMarketCaseId(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		Map<String,Object> custGroupBasicMap = (Map<String, Object>) custGroupSelector.selectCustGroupList(inParam,queryFilter);
		return custGroupBasicMap;
	}
	
	/**
	 * 查询客户群的数量
	* @date: 2016-9-9 
	* @author: wangth
	* @Title: queryCustGroupCountById 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryCustGroupCountById(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		custGroupSelector.selectCustGroupCountById(inParam,queryFilter);
		return null;
	}
	
	/**
	 *  根据客户群Id查询客户群信息（标签，导入）
	* @date: 2016-9-9 
	* @author: wangth
	* @Title: queryCustGroupById 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	* 2017-2-17 luogj 对于导入型客户群，增加查询附件名称；对于标签型客户群，增加查询标签类型
	* 2017-04-14 songhui_crmpd	使标签客户群查询包含静态标签
	 */
	@Override
	public Map<String, Object> queryCustGroupById(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		Map<String, Object> custGroupLabel = new HashMap<String, Object>();		
//		Map<String, Object> custGroupAttribute = new HashMap<String,Object>();
		
		List<Map<String, Object>> attachList = new ArrayList();
		Map<String,Object> attachMap = new HashMap<String,Object>();
		
		if(Const.CUSTGROUP_TYPE_LABEL.equals(inParam.get("custGroupType")) || Const.CUSTGROUP_TYPE_LABEL_STATIC.equals(inParam.get("custGroupType"))){
			custGroupLabel = custGroupSelector.selectCustGroupLabel(inParam, queryFilter);
		}else if(Const.CUSTGROUP_TYPE_LOAD.equals(inParam.get("custGroupType"))){
			Map<String, Object> tempInParam = new HashMap<String, Object>();
			tempInParam.put("busiId", inParam.get("custGroupId"));
			attachList = attachSelector.selectAttachs(tempInParam);
			
			if(CommonUtils.objectIsNull(attachList) == false){
				attachMap = attachList.get(0);
			}
		}
		
//		custGroupAttribute = custGroupSelector.selectCustGroupAttribute(inParam, queryFilter);
		List<Map<String,Object>> custGroupList = (List<Map<String,Object>>) custGroupSelector.selectCustGroupList(inParam,queryFilter);
		Map<String,Object> custGroupMap = new HashMap<String,Object>();
		if(CommonUtils.objectIsNull(custGroupList) == false){
			custGroupMap = custGroupList.get(0);
			System.out.println("#$#$#$#$#$CustGropu__custGroupMap>>>="+custGroupMap);
		}
								
		custGroupMap.putAll(custGroupLabel);
		custGroupMap.putAll(attachMap);
//		if(!CommonUtils.objectIsNull(custGroupAttribute)){
//			custGroupMap.putAll(custGroupAttribute);
//		}
		
	   /* IQueryFilter queryFil = new QueryFilter();
	    queryFil.setCustGroupId((String)inParam.get("custGroupId"));
		List<Map<String,Object>> userList = userSelector.selectUserLabelList(inParam, queryFil);
		if(!CommonUtils.objectIsNull(userList)){
			custGroupMap.put("USER_LABEL_LIST", userList);
		}*/
		return custGroupMap;
	}
	
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
	* 新增根据客户群id计算标签客户群数量
	 */
	@Override
	public Map<String, Object> queryCustGroupCountByUserLabel(
			Map<String, Object> inParam) throws StrategyError {
		if(!CommonUtils.objectIsNull(inParam.get("custGroupId"))){
		Map<String, Object> custGroupLabel = new HashMap<String, Object>();	
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setCustGroupId((String)inParam.get("custGroupId"));
		custGroupLabel = custGroupSelector.selectCustGroupLabel(inParam, queryFilter);
		inParam.put("groupFormula", custGroupLabel.get("calculateFormula"));
		}
		
		List<Map<String, Object>> outList =  custGroupSelector.selectCustGroupCountByUserLabel(inParam);
		Map<String, Object> outMap = new HashMap<String, Object>();
		if(!CommonUtils.objectIsNull(outList)){
			outMap.put("count", outList.get(0).get("count"));
		}
		return outMap;
	}
	
	/**
	 * 查询二次过滤标签的人数
	* @date: 2017-4-7 
	* @author: chenhao
	* @title: queryLabelFormulaRestrictCountById 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryLabelFormulaRestrictCountById(
			Map<String, Object> inParam) throws StrategyError {
		Map<String, Object> custGroupAttribute = new HashMap<String, Object>();
		if(!CommonUtils.objectIsNull(inParam.get("custGroupId"))){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setCustGroupId((String)inParam.get("custGroupId"));
		custGroupAttribute = custGroupSelector.selectCustGroupAttribute(inParam, queryFilter);
		}
//		System.out.println("chenhao++++++++++++++++++++++++++++++++++"+custGroupAttribute.get("label_formula_restrict"));
		inParam.put("label_formula_restrict",custGroupAttribute.get("label_formula_restrict"));
		List<Map<String, Object>> outList =  custGroupSelector.selectLabelFormulaRestrictCountById(inParam);
		Map<String, Object> outMap = new HashMap<String, Object>();
		if(!CommonUtils.objectIsNull(outList)){
			outMap.put("count", outList.get(0).get("count"));
		}
		return outMap;
	}
	
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
	@Override
	public Map<String, Object> queryCustGroupHandleRecord(Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setCustGroupId((String)inParam.get("custGroupId"));
		List<Map<String, Object>> outList =  custGroupSelector.selectCustGroupHandleRecord(inParam, queryFilter);
		Map<String, Object> outMap = new HashMap<String, Object>();
		if(!CommonUtils.objectIsNull(outList)){
			outMap.put("custGroupHandleRecordList",outList);
		}
		return outMap;
	}
	
	/**
	 * 静态标签目标客户群表关联hive（hive扩展表）
	* @date: 2017-3-14 
	* @author:liuqi
	* @title: relateStaticLabelCustGroupTableToHive 
	* @param custGroupId 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void relateStaticLabelCustGroupTableToHive(String custGroupId) throws StrategyError{
		Map<String, Object> outMap = new HashMap<String, Object>();
		outMap.put("custGroupId", custGroupId);
		custGroupInsertor.createRelateStaticLabelCustGroupTableToHive(outMap);
		
	}
	
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
	@Override
	public List<Map<String, Object>> queryDBCustGroupShellProcess(
			Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		//queryFilter.setProcessNo(Const.SHELLPROCESS_NO_CUSGGROUPDB);  数据源模式目前已不需要
		queryFilter.setBusiType(Const.BUSI_TYPE_CUSTGROUP);
		queryFilter.setStatusCode(Const.MARKET_CASE_STATUS_DEFAULT);//进程表处理状态与客户群状态相同
		return systemDealSelector.selectShellProcessExecuteList(inParam, queryFilter);
	}
	
	/**
	 * 批量移除客户群
	* @date: 2016-9-9 
	* @author: wangth
	* @Title: removeBatchNoFromCustGroup 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeBatchNoFromCustGroup(Map<String,Object> inParam) throws StrategyError {
		custGroupDeleter.deleteCustGroup(inParam);
	}
	
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
	@Override
	public void removeLabelCustGroup(Map<String, Object> inParam) throws StrategyError {
		Map<String, Object> tempInParam = inParam;
		tempInParam.put("custGroupId",inParam.get("custGroupId"));
		
		Map<String, Object> inMap = new HashMap<String, Object>();
		inMap.put("busiId",inParam.get("custGroupId"));

		custGroupDeleter.deleteCustGroup(tempInParam);
		inventoryDeleter.deleteInventoryInfo(inMap);	
		custGroupDeleter.deleteCustGroupLabel(tempInParam);
		
	}
	
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
	@Override
	public void removeLoadCustGroup(Map<String, Object> inParam) throws StrategyError {
		Map<String, Object> inMap = new HashMap<String, Object>();
		inMap.put("busiId",inParam.get("custGroupId"));
		
		deleteLoadCustGroup(inParam);
		inventoryDeleter.deleteInventoryInfo(inMap);
	}
	
	/**
	 * 移除客户群信息
	* @date: 2016-9-9 
	* @author: wangth
	* @Title: removeCustGroupById 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeCustGroupById(Map<String,Object> inParam) throws StrategyError {
		custGroupDeleter.deleteCustGroup(inParam);
	}
	
	/**
	 * 移除单个号码
	* @date: 2016-9-9 
	* @author: wangth
	* @Title: removeSingleNoFromCustGroup 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeSingleNoFromCustGroup(Map<String,Object> inParam) throws StrategyError {
		custGroupDeleter.deleteCustGroup(inParam);
	}
	
	/**
	 * 更新客户群
	* @date: 2016-9-9 
	* @author: wangth
	* @Title: updateCustGroupById 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateCustGroupById(Map<String,Object> inParam) throws StrategyError {
		custGroupUpdater.updateCustGroup(inParam);
	}
	
	/**
	 * 创建数据源模式客户群
	* @date: 2017-1-18 
	* @author: zhangjj_crmpd
	* @title: createDBCustGroup 
	* @param custGroupMap
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void createDBCustGroup(Map<String, Object> custGroupMap,
			Map<String, Object> tempInParam) throws StrategyError {
		custGroupInsertor.createCustGroupHiveTable(custGroupMap,tempInParam);
	}
	
	/**
	 * 客户群报文拼接成下划线格式
	* @date: 2017-2-23 
	* @author: zhangjj_crmpd
	* @title: custGroupPacketAssemblyUnderline 
	* @param userMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, String> custGroupPacketAssemblyUnderline(
			Map<String, String> userMap) {
		Map<String,String> outMap = new HashMap<String, String>();
		if(!CommonUtils.objectIsNull(userMap.get("idNo"))){
			outMap.put("ID_NO", CommonUtils.toString(userMap.get("idNo")));
			
		}
		if(!CommonUtils.objectIsNull(userMap.get("regionCode"))){
			outMap.put("REGION_CODE", CommonUtils.toString(userMap.get("regionCode")));
			
		}
		if(!CommonUtils.objectIsNull(userMap.get("serviceNbr"))){
			outMap.put("SERVICE_NBR", CommonUtils.toString(userMap.get("serviceNbr")));
			
		}
		return outMap;
	}
	
	/**
	 * 标签表达式校验
	* @date: 2016-9-23 
	* @author: zhaoyue
	* @title: filterLabelCustGroup 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected boolean filterLabelCustGroup(Map<String,String> userLabel,Map<String,String> custGroupIdAndLabelMap){
		
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		//String[] labelKeys = Const.CUST_GROUP_LABEL_KEYS;
		if (CommonUtils.objectIsNull(userLabel)) {
			return false;
		}
		Set<String> labelKeys = userLabel.keySet();
		for(String labelKey : labelKeys){
			engine.put(labelKey, userLabel.get(labelKey));
		}
		String labelExpr = "";
		for(String custGroupId : custGroupIdAndLabelMap.keySet()){
			labelExpr = (String)custGroupIdAndLabelMap.get(custGroupId);
		}
		labelExpr = CommonUtils.convertLabelExprToJsExpr(labelExpr);
		try {
			if((Boolean) engine.eval(labelExpr)){
				return true;
			}
		} catch (ScriptException e) {
			log.debug("=======filterLabelCustGroup==Exception=====", e.getMessage());
		}
		return false;
	}
	
	/**
	 * 得到标签模式客户群解析SQL
	* @date: 2016-10-17 
	* @author: sunliang 
	* @title: getLabelModeParseSQL 
	* @param custGroupTypeAndFormulaMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected String getLabelModeParseSQL(Map<String,String> custGroupTypeAndFormulaMap){
		return null;
	}
	
	/** 
	 * 根据登录工号查询登录名称
	* @date: 2016-12-2 
	* @author: songxj
	* @title: getLoginNameByLoginId 
	* @param outParamMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected String getLoginNameByLoginId(Map<String, Object> outParamMap) throws StrategyError {
		String loginNo = (String) outParamMap.get("userId");
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setLoginNo(loginNo);
		Map<String, Object> outMap = loginSelector.selectLoginNo(outParamMap, queryFilter);
		System.out.println("====outmap==="+outMap);
		if (!CommonUtils.objectIsNull(outMap)) {
			return (String) outMap.get("loginName");
		}
		return "";
	}
	
	/**
	 * 处理客户群附件参数
	* @date: 2016-10-23 
	* @author: wangth
	* @Title: settleCustGroupAttachParam 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void settleCustGroupAttachParam(Map<String,Object> inParam)throws StrategyError{
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		tempInParam.put("serialId", SequenceUtil.getSequence());
		tempInParam.put("busiId", inParam.get("custGroupId"));
		tempInParam.put("busiType", Const.BUSI_TYPE_CUSTGROUP);
		tempInParam.put("attachName", inParam.get("fileName"));
		tempInParam.put("systemName", inParam.get("systemName"));
		tempInParam.put("note", inParam.get("note"));
		tempInParam.put("operName", inParam.get("operName"));
		tempInParam.put("operNo", inParam.get("operNo"));
		tempInParam.put("operDate", inParam.get("operDate"));
		attach.addSingleAttach(tempInParam);
	}
	
	/**
	 * 处理数据源目标客群进程参数并保存
	* @date: 2016-11-14 
	* @author: zhangjj_crmpd
	* @title: settleDBCustGroupShellProcessParam 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	
	protected void settleDBCustGroupShellProcessParam(Map<String,Object> inParam)throws StrategyError{
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		tempInParam.put("serialId", SequenceUtil.getSequence());
		tempInParam.put("busiId", inParam.get("custGroupId"));
		tempInParam.put("busiType", Const.BUSI_TYPE_CUSTGROUP);
		tempInParam.put("processNo", Const.SHELLPROCESS_NO_CUSGGROUPDB);
		tempInParam.put("processName", Const.SHELLPROCESS_NAME_CUSGGROUPDB);
		tempInParam.put("updateTime", inParam.get("operTime"));
		systemDealInsertor.insertShellProcessExecuteInfo(tempInParam);
	}
	
	/**
	 * 处理导入目标客群进程参数处理(已不需要入进程表)
	* @date: 2016-10-23 
	* @author: wangth
	* @Title: settleCustGroupShellProcessParam 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Deprecated
	protected void settleLoadCustGroupShellProcessParam(Map<String,Object> inParam)throws StrategyError{
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		tempInParam.put("serialId", SequenceUtil.getSequence());
		tempInParam.put("busiId", inParam.get("custGroupId"));
		tempInParam.put("busiType", Const.BUSI_TYPE_CUSTGROUP);
		//tempInParam.put("processNo", Const.SHELLPROCESS_NO_CUSGGROUPIMPORT);
		//tempInParam.put("processName", Const.SHELLPROCESS_NAME_CUSGGROUPIMPORT);
		tempInParam.put("updateTime", inParam.get("operTime"));
		systemDealInsertor.insertShellProcessExecuteInfo(tempInParam);
		tempInParam = new HashMap<String,Object>();
		tempInParam.put("serialId", SequenceUtil.getSequence());
		tempInParam.put("busiId", inParam.get("custGroupId"));
		tempInParam.put("busiType", Const.BUSI_TYPE_CUSTGROUP);
		//tempInParam.put("processNo", Const.SHELLPROCESS_NAME_LABEL);
		//tempInParam.put("processName", Const.SHELLPROCESS_NO_LABEL);
		tempInParam.put("updateTime", inParam.get("operTime"));
		systemDealInsertor.insertShellProcessExecuteInfo(tempInParam);
	}
	
	/**
	 * 保存客户群处理记录
	* @date: 2017-3-10 
	* @author: zhangjj_crmpd
	* @title: saveCustGroupHandleRecord 
	* @param countParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void saveCustGroupHandleRecord(Map<String, Object> countParam) throws StrategyError {
		Map<String,Object> tempInParam = new HashMap<String, Object>();
		tempInParam.put("custGroupId", countParam.get("custGroupId"));
		tempInParam.put("serialId", SequenceUtil.getSequence());
		tempInParam.put("disposeStep", Const.CUSTGROUP_DETAIL_FILE_HANDLESTEP_FIRST);
		tempInParam.put("disposeDesc", Const.CUSTGROUP_DETAIL_FILE_HANDLESTEP_DESC_FIRST);
		tempInParam.put("disposeTime", countParam.get("disposeTime"));
		tempInParam.put("startTime", countParam.get("startTime"));
		tempInParam.put("endTime", countParam.get("endTime"));
		tempInParam.put("disposeStatus", Const.MARKET_CASE_STATUS_EXE);
		tempInParam.put("dataNum", countParam.get("custGroupNum"));
		custGroupInsertor.insertCustGroupHandleRecord(countParam, tempInParam);
		
	}
	
	
	/** 保存数据库模式客户群
	* @date: 2016-10-12 
	* @author: wangpei
	* @title: saveDataCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected void saveDataCustGroup(Map<String,Object> inParam) throws StrategyError {
		Map<String,Object> tempInParam = new HashMap<String, Object>();
		//inParam.put("custGroupId",SequenceUtil.getSequence());
		tempInParam.put("operTime", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3));
		tempInParam.putAll(inParam);
		custGroupInsertor.insertCustGroup(inParam,tempInParam);
	}
	
	/**
	 * 保存导入目标客户群
	* @date: 2016-9-15 
	* @author: zhangjj_crmpd
	* @title: saveLoadCustGroup 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void saveLoadCustGroup (Map<String,Object> inParam) throws StrategyError {
		Map<String,Object> tempInParam = new HashMap<String, Object>();
		tempInParam.put("custGroupId",SequenceUtil.getSequence());
		tempInParam.put("operTime", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3));
		tempInParam.putAll(inParam);
		//保存基本数据
		custGroupInsertor.insertCustGroup(inParam,tempInParam);
		//custGroupInsertor.insertCustGroupFile(inParam, tempInParam);
		//this.settleLoadCustGroupShellProcessParam(tempInParam);
		tempInParam.put("operDate", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3));
		this.settleCustGroupAttachParam(tempInParam);
	}	
	
	/**
	 * 保存标签目标客户群
	* @date: 2016-9-15 
	* @author: zhangjj_crmpd
	* @title: saveLabelCustGroup 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 2017-2-12: luogj: 增加逻辑，如果是静态标签，则需要使用spark录入客户群明细信息
	 */
	protected Map<String, Object> saveLabelCustGroup(Map<String,Object> inParam) throws StrategyError {
		
		Map<String, Object> tempInParam = inParam;
		String custGroupId = SequenceUtil.getSequence();
		String custGroupNum = "";
		tempInParam.put("custGroupId",custGroupId);
		Map<String, Object> inMap = new HashMap<String, Object>();
		inMap.put("serialId",SequenceUtil.getSequence());
		inMap.put("busiId",custGroupId);
		inMap.put("busiType",inParam.get("custGroupType"));
		inMap.put("statusCode",Const.MARKET_CASE_STATUS_DEFAULT);
		inMap.put("inventoryName",custGroupId);
		
		tempInParam.put("operTime", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3));
		tempInParam.put("groupFormula", inParam.get("labelFormula"));
		tempInParam.put("calculateFormula", inParam.get("calculateFormula"));			
		if( Const.LABEL_TYPE_STATIC.equals(tempInParam.get("labelType")) ){			
			custGroupInsertor.createCustGroupDetailSparkTable(inParam, tempInParam);				
			custGroupInsertor.insertCustGroupDetailSparkTable(inParam, tempInParam);
			
			//数表返回值
			Map<String,Object> countMap = custGroupSelector.selectCustGroupDetailCountInSparkTable(tempInParam);
			//System.out.println("countMap++++++++++++++++"+countMap);
			custGroupNum = (String) countMap.get("count");
			//将hive表名插入缓存   List
			List<String> retList = new ArrayList<String>();
			retList.add("RM_CUSTGROUP_" + custGroupId + "_DETAIL_INFO_HIVE");
			Map<String,Object> custGroupLabelHiveTableNameCache = new HashMap<String,Object>();
			custGroupLabelHiveTableNameCache.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_CUSTGROUP_HIVETABLENAME);
			custGroupLabelHiveTableNameCache.put(Const.CACHE_DIRECTION, Const.CACHE_RESTORE_DIRECTION_LEFT);
			custGroupLabelHiveTableNameCache.put(Const.CACHE_VALUE, retList);
			
			log.debug("saveLabelCustGroup.custGroupLabelHiveTableNameCache", custGroupLabelHiveTableNameCache);
			custGroupInsertor.addCustGoupLabelHiveTableNameToCache(custGroupLabelHiveTableNameCache);
			
		}
		tempInParam.put("custGroupNum", custGroupNum);
		//System.out.println("chenhao++++++++++++++++++++++++++++++++count:"+custGroupNum);
		custGroupInsertor.insertCustGroup(inParam,tempInParam);
		inventoryInsertor.insertInventoryInfo(inMap, inMap);
		custGroupInsertor.insertCustGroupLabel(inParam,tempInParam);
		
		Map<String, Object> idMap = new HashMap<String, Object>();
		idMap.put("custGroupId", tempInParam.get("custGroupId"));
		return idMap;
	}


	
	/**
	 * 将服务号码 保存到rm_custgroup_custGroupId_detail_info
	* @date: 2017-2-23 
	* @author: zhangjj_crmpd
	* @title: saveSingleNo2CustGroupDetailInfo 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> saveSingleNo2CustGroupDetailInfo(Map<String, Object> inParam) throws StrategyError {
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setServiceNbr(CommonUtils.toString(inParam.get("phoneNo")));
		String  idNos = userSelector.selectIdNoByServiceNo(inParam.get("phoneNo")+Const.NUM_TYPE_PHONE_NO);
		if(CommonUtils.objectIsNull(idNos) ){
			tempInParam.put("result", false);
			return tempInParam;
		}
		String idNo =idNos.split(Const.SEPARATOR_COMMA)[0];
		tempInParam.put("idNo", idNo);
		tempInParam.put("custGroupId", inParam.get("custGroupId"));
		inParam.put("idNo", idNo);
		Map<String, String> userMap = userSelector.selectUserInfoByIdNo(tempInParam);
		tempInParam.putAll(custGroupInsertor.insertCustGroupDetailHbase(tempInParam, custGroupPacketAssemblyUnderline(userMap)));
		return tempInParam;
	}
	
	/**
	 * 将标签信息保存到rm_custgroup_custGroupId_label_info
	* @date: 2017-2-23 
	* @author: zhangjj_crmpd
	* @title: saveSingleNo2CustGroupLabelInfo 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> saveSingleNo2CustGroupLabelInfo(Map<String, Object> inParam) throws StrategyError {
		List<Map<String, Object>> positionInfoList =  (List<Map<String, Object>>) inParam.get("positionInfoList");
		if(CommonUtils.objectIsNull(positionInfoList) || CommonUtils.objectIsNull(inParam.get("idNo"))){
			return inParam;
		}
		Map<String,String> param = new HashMap<String, String>();
		for(Map<String, Object> positionInfo : positionInfoList){
			for(Map.Entry<String, Object> me : positionInfo.entrySet()){
				if(!CommonUtils.objectIsNull(me.getValue())){
					param.put(me.getKey(), CommonUtils.toString( me.getValue()));
				}
			}
			
		}
		inParam.putAll(custGroupInsertor.insertCustGroupLabelHbase(inParam, param));
		return inParam;
	}
	
	/**
	 * 修改数据源模式客户群
	* @date: 2017-3-7 
	* @author: tangaq
	* @title: updateDBCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void updateDBCustGroup (Map<String,Object> inParam) throws StrategyError{
		inParam.put("updateTime", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3));
		inParam.put("updateTime", DateUtil.string2Timestamp((String)inParam.get("updateTime"), DateUtil.TIME_FROMAT_SIMPLE3));
		inParam.put("exeTime", DateUtil.string2Timestamp((String)inParam.get("exeTime"), DateUtil.TIME_FROMAT_SIMPLE3));
		updateCustGroupById(inParam);
		
	}
	
	/**
	 * 修改导入目标客户群
	* @date: 2016-9-15 
	* @author: zhangjj_crmpd
	* @title: updateLoadCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void updateLoadCustGroup (Map<String,Object> inParam) throws StrategyError {
		inParam.put("updateTime", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3));
		custGroupUpdater.updateCustGroup(inParam);
	}
	
	/**
	 * 修改标签目标客户群
	* @date: 2016-9-15 
	* @author: zhangjj_crmpd
	* @title: updateLabelCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void updateLabelCustGroup (Map<String,Object> inParam) throws StrategyError {
		inParam.put("updateTime", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3));
		custGroupUpdater.updateCustGroupLabel(inParam);
	}
	
	/**
	 * 
	* @date: 2017-1-18 
	* @author: zhangjj_crmpd
	* @title: updateShellProcessStatus 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void updateShellProcessStatus(Map<String, Object> inParam) throws StrategyError {
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		tempInParam.put("serialId", inParam.get("serialId"));
		tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_EXE);
		systemDealUpdater.updateShellProcessExecuteInfo(tempInParam);
		
	}
	
	/**
	 * 将服务号码以及该号码关联的标签字段写人RM_CUSTGROUP_客户群Id_LABEL_INFO.label/.head
	* @date: 2017-1-17 
	* @author: zhangjj_crmpd
	* @title: writeCustGroupLabelInfo 
	* @param excelContentList
	* @param string
	* @param string2 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void writeCustGroupLabelInfo(List<List<String>> excelContentList,
			String fileName, String fileNameHead) throws StrategyError {
		if(CommonUtils.objectIsNull(excelContentList) || CommonUtils.objectIsNull(fileName)){
			return;
		}
		List<String> detailInfoList = new ArrayList<String>();
		List<String> createInfoList = new ArrayList<String>();
		for(int i=0;i<excelContentList.size();i++){
			if(i==0){
				createInfoList.add(CommonUtils.listToString(excelContentList.get(i), Const.SEPARATOR_COMMA));
				continue;
			}
			detailInfoList.add(CommonUtils.listToString(excelContentList.get(i), Const.SEPARATOR_COMMA));
		}
		log.info("detailInfoList:", detailInfoList);
		log.info("writeCustGroupLabelInfo fileName:", fileName);
		FileUtil.write2File(createInfoList, fileNameHead);
		FileUtil.write2File(detailInfoList, fileName);
		
	}

	/**
	 * 将服务号码写入RM_CUSTGROUP_客户群Id_DETAIL_INFO.TXT
	* @date: 2017-1-17 
	* @author: zhangjj_crmpd
	* @title: writeCustGroupDetailInfo 
	* @param excelContentList
	* @param string 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void writeCustGroupDetailInfo(List<List<String>> excelContentList,
			String fileName) throws StrategyError {
		if(CommonUtils.objectIsNull(excelContentList) || CommonUtils.objectIsNull(fileName)){
			return;
		}
		List<String> detailInfoList = new ArrayList<String>();
		for(int i=1;i<excelContentList.size();i++){
			if(CommonUtils.objectIsNull(excelContentList.get(i))){
				continue;
			}
			detailInfoList.add(excelContentList.get(i).get(0));
		}
		log.info("detailInfoList:", detailInfoList);
		log.info("writeCustGroupDetailInfo fileName:", fileName);
		FileUtil.write2File(detailInfoList, fileName);
		
	}
	
	/**
	 * 写入sqoop执行的脚本
	* @date: 2017-1-18 
	* @author: zhangjj_crmpd
	* @title: writeSqoopInfo 
	* @param tableStr
	* @param sql 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void writeSqoopInfo(String tableStr, String sql) throws StrategyError {
		String fileName = PropertiesUtil.getProperty("filePath.properties", "DBCustGroupSqoop");
		String lineSeparator = System.getProperty("line.separator", "\n");
		 try {
			RandomAccessFile randomFile = new RandomAccessFile(fileName, "rw");
			 long fileLength = randomFile.length();
			 randomFile.seek(fileLength);
			 randomFile.writeBytes(lineSeparator);
			 randomFile.writeBytes(tableStr+Const.SEPARATOR_AND+sql);
			 randomFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new StrategyError(e);
		} catch (IOException e) {
			e.printStackTrace();
			throw new StrategyError(e);
		}
	}
	
	/**
	 * 查询参数整理
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: QueryParamSettle 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	protected class QueryParamSettle implements Serializable{
		
		/**
		 * 处理，查询客户群列表参数
		* @date: 2016-10-17 
		* @author: wangth
		* @Title: settleQueryCustGroupListParam 
		* @param inParam
		* @param queryFilter 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@SuppressWarnings("unchecked")
		protected void settleQueryCustGroupListParam(Map<String,Object> inParam,IQueryFilter queryFilter){
			queryFilter.setCustGroupStartDate((String)inParam.get("custGroupStartDate"));
			queryFilter.setCustGroupEndDate((String)inParam.get("custGroupEndDate"));
			List<String> keyWords = ((List<String>)inParam.get("keyWords"));
			queryFilter.setKeyWords(keyWords);
			queryFilter.setCustGroupType((String)inParam.get("custGroupType"));
			queryFilter.setStatusCode((String)inParam.get("custGroupStatus"));
			String withoutBlack = (String)inParam.get("withoutBlack")==null?"false":(String)inParam.get("withoutBlack");
			if(withoutBlack.equals(Const.TRUE_LOWER)){
				queryFilter.setWithoutBlack(withoutBlack);
			}
			
		}
	}



}
