package com.sitech.strategy.process.entity.impl;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.FileUtil;
import com.sitech.strategy.common.utils.PropertiesUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.ICustGroup;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;
import com.sitech.strategy.process.base.BaseProcessEntity;
import com.sitech.strategy.process.entity.inter.ICustGroupProcessEntity;

/**
 * 目标客户群实体
* @date: 2016-9-5 
* @author: sunliang 
* @title: CustGroupEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class CustGroupProcessEntity extends BaseProcessEntity implements
		ICustGroupProcessEntity {
	
	protected ICustGroup custGroup;
	protected IDataInsertor.ICustGroupInsertor custGroupInsertor;
	protected IDataSelector.ICommonSelector commonSelector;
	protected IDataSelector.ICustGroupSelector custGroupSelector;
	protected IDataDeleter.ICustGroupDeleter custGroupDeleter;
	protected IDataUpdater.ICustGroupUpdater custGroupUpdater;
	protected IDataSelector.ILoginSelector loginSelector;
	protected IDataSelector.ISystemDealSelector systemDealSelector;
	protected IDataUpdater.ISystemDealUpdater systemDealUpdater;

	/**
	 * 
	* @date: 2016-11-25 
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
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setCustGroup 
	* @param custGroup 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroup(ICustGroup custGroup) {
		this.custGroup = custGroup;
	}

	/**
	 * 
	* @date: 2016-10-30 
	* @author: zhangjj_crmpd
	* @title: setCustGroupDeleter 
	* @param custGroupDeleter 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupDeleter(IDataDeleter.ICustGroupDeleter custGroupDeleter) {
		this.custGroupDeleter = custGroupDeleter;
	}

	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setCustGroupInsertor 
	* @param custGroupInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupInsertor(
			IDataInsertor.ICustGroupInsertor custGroupInsertor) {
		this.custGroupInsertor = custGroupInsertor;
	}

	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setCustGroupSelector 
	* @param custGroupSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupSelector(
			IDataSelector.ICustGroupSelector custGroupSelector) {
		this.custGroupSelector = custGroupSelector;
	}

	/** 
	* @date: 2016-10-31 
	* @author: songxj
	* @title: setCustGroupUpdater 
	* @param custGroupUpdater 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setCustGroupUpdater(IDataUpdater.ICustGroupUpdater custGroupUpdater) {
		this.custGroupUpdater = custGroupUpdater;
	}

	/** 
	* @date: 2016-12-2 
	* @author: songxj
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
	* @date: 2016-11-14 
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
	* @date: 2016-11-14 
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
	 * 处理数据源模式客户群(数据源模式目前已不需要)
	* @date: 2016-11-14 
	* @author: zhangjj_crmpd
	* @title: handleDBCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Deprecated
	public void handleDBCustGroup(Map<String,Object> inParam) throws StrategyError {
		List<Map<String, Object>>  systemDeallist =  custGroup.queryDBCustGroupShellProcess(inParam);
		if(CommonUtils.objectIsNull(systemDeallist)){
			return;
		}
		for(Map<String, Object> systemDealMap : systemDeallist){
			custGroup.handleDBCustGroup(systemDealMap);
		}
		
	}
	
	/**
	 * 处理导入目标客户群明细表(临时表)
	* @date: 2016-10-30 
	* @author: zhangjj_crmpd
	* @title: handleLoadCustGroupDetailInfo 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void handleLoadCustGroupDetailInfo(Map<String, Object> inParam)
			throws StrategyError {
		//查询hive表名称(过滤出客户群详情临时表)
		inParam.put("tablePostfix", Const.TABLENAME_POSTFIX_CUSTGROUP_DETAIL_TEMP);
		Map<String, Object> filtrateOutMap = custGroup.filtrateTemporaryTab(inParam);
		List<String> tempTableList= (List<String>) filtrateOutMap.get("tempTableList");
		Map<String,Object> tempInParam = new HashMap<String, Object>();
		if(!CommonUtils.objectIsNull(tempTableList)){
			for(String tempTableStr: tempTableList){
				custGroup.createDetailTableAndLoadCustGroup(tempTableStr);
				custGroup.dropCustGroupTemp(tempTableStr);
			}
		}
	}
	
	/**
	 * 处理导入目标客户群Csv
	* @date: 2016-11-25 
	* @author: zhangjj_crmpd
	* @title: handleCustGroupCsv 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void handleCustGroupCsv(Map<String,Object> inParam) throws StrategyError{
		custGroup.handleCustGroupCsv(inParam);
	}
	
	/**
	 * 处理客户群导入Excel文件
	* @date: 2016-11-24 
	* @author: zhangjj_crmpd
	* @title: handleCustGroupExcel 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void handleCustGroupExcel(Map<String,Object> inParam) throws StrategyError{
		custGroup.handleCustGroupExcel(inParam);
	}
	
	/**
	 * 处理导入目标客户群标签表(临时表)
	* @date: 2016-11-25 
	* @author: zhangjj_crmpd
	* @title: handleLoadCustGroupLabelInfo 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void handleLoadCustGroupLabelInfo(Map<String,Object> inParam) throws StrategyError{
		inParam.put("tablePostfix", Const.TABLENAME_POSTFIX_CUSTGROUP_LABEL_TEMP);
		Map<String, Object> filtrateOutMap = custGroup.filtrateTemporaryTab(inParam);
		List<String> tempTableList = (List<String>) filtrateOutMap.get("tempTableList");
		Map<String,Object> tempInParam = new HashMap<String, Object>();
		Map<String,Object> descInParam = new HashMap<String, Object>();
		if(!CommonUtils.objectIsNull(tempTableList)){
			for(String tempTableStr: tempTableList){
				tempInParam = custGroup.descCustGroupLabelTempTable(tempTableStr);
				custGroup.createLabelTabelAndLoadCustGroup(tempTableStr,tempInParam);
				custGroup.dropCustGroupTemp(tempTableStr);
			}
		}
	}
	
	/**
	 * 处理静态标签导入目标客户群
	* @date: 2017-3-14 
	* @author: liuqi
	* @title: handleStaticLabelLoadCustGroupInfo 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void handleStaticLabelLoadCustGroupInfo(Map<String,Object> inParam) throws StrategyError{
		
		 custGroup.handleStaticLabelLoadCustGroupInfo(inParam);
		 
	}
	
	/**
	 * 加载目标客户群标签到缓存
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: loadCustGoupLabelToCache 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void loadCustGoupLabelToCache() throws StrategyError{
		//查询全部目标客户群标签
		List<Map<String, Object>> allCustGroupLabelList = this.queryAllCustGoupLabel();
		//解析目标客户群标签缓存
		Map<Object, Object> custGroupLabelCache = this.parseCustGoupLabelCache(allCustGroupLabelList);
		//加载目标客户群标签
		this.addCustGoupLabelToCache(custGroupLabelCache);
	}
		
	/** 
	 * coc目标客户群解析
	* @date: 2016-10-31 
	* @author: songxj
	* @title: parseCocCustGroup 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void parseCocCustGroup(Map<String, Object> inParam)
			throws StrategyError {
		custGroup.parseCocCustGroup(inParam);
	}

	/**
	 * 查询目标客户群数量
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: queryCustGroupCountById 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryCustGroupCountById(Map<String, Object> inParam) throws StrategyError{
		//在spark中查询目标客户群的用户数
		custGroup.queryCustGroupCountById(new HashMap<String,Object>(), null);
		return null;
	}
	
	
	/**
	 * 加载目标客户群缓存
	* @date: 2016-12-29 
	* @author: sunliang 
	* @title: addCustGoupLabelToCache 
	* @param CustGoupLabel
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void addCustGoupLabelToCache(Map<Object,Object> custGroupLabelCache) throws StrategyError{
		custGroupInsertor.addCustGroupLabelToCache(custGroupLabelCache);
	}
	
	/**
	 * 解析目标客户群标签缓存
	* @date: 2016-12-29 
	* @author: sunliang 
	* @title: parseCustGoupLabelCache 
	* @param allCustGroupLabelList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<Object,Object> parseCustGoupLabelCache(List<Map<String, Object>> allCustGroupLabelList) throws StrategyError{
		return custGroup.parseCustGoupLabelCache(allCustGroupLabelList);
	}
	
	
	/**
	 * 查询全部目标客户群标签
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: queryAllCustGoupLabel 
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> queryAllCustGoupLabel() throws StrategyError{
		List<Map<String, Object>> queryAllCustGoupLabelList = custGroupSelector.selectAllCustGroupLabelList();
		log.debug("===queryAllCustGoupLabel.queryAllCustGoupLabelList=STEP1==", queryAllCustGoupLabelList);
		List<Map<String, Object>> queryAllCustGoupAttributeList	= custGroupSelector.selectAllCustGroupAttribute();
		log.debug("===queryAllCustGoupLabel.queryAllCustGoupAttributeList===", queryAllCustGoupAttributeList);
		queryAllCustGoupLabelList.addAll(queryAllCustGoupAttributeList);
		log.debug("===queryAllCustGoupLabel.queryAllCustGoupLabelList=STEP2==", queryAllCustGoupLabelList);
		return  queryAllCustGoupLabelList;
	}


	
	
	

}
