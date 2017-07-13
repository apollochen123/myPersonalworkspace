package com.sitech.strategy.process.batch;

import java.util.HashMap;

import org.apache.commons.collections.map.HashedMap;

import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SpringBeanFactory;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.process.base.BaseProcessBatch;
import com.sitech.strategy.process.entity.impl.CustGroupProcessEntity;
import com.sitech.strategy.process.entity.inter.ICustGroupProcessEntity;

/**
 * 导入目标客户群清单到Hive表
* @date: 2016-10-30 
* @author: zhangjj_crmpd
* @title: LoadCustGroup 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class LoadCustGroup extends BaseProcessBatch{
	
	/**
	 * 处理数据源模式客户群
	* @date: 2016-11-15 
	* @author: zhangjj_crmpd
	* @title: handleDBCustGroup  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void handleDBCustGroup() {
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_ALL);
		ICustGroupProcessEntity custGroupProcessEntity = (CustGroupProcessEntity)springBeanFactory.getBean("custGroupProcessEntity");
		try {
			custGroupProcessEntity.handleDBCustGroup(new HashMap());
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 处理导入目标客户群Csv
	* @date: 2016-11-25 
	* @author: zhangjj_crmpd
	* @title: handleLoadCustGroupCsv  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void handleLoadCustGroupCsv() {
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_NOSQL);
		ICustGroupProcessEntity custGroupProcessEntity = (CustGroupProcessEntity)springBeanFactory.getBean("custGroupProcessEntity");
		try {
			custGroupProcessEntity.handleCustGroupCsv(new HashMap());
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 处理导入目标客户群Excel
	* @date: 2016-11-23 
	* @author: zhangjj_crmpd
	* @title: handleLoadCustGroupExcel  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void handleLoadCustGroupExcel() {
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_NOSQL);
		ICustGroupProcessEntity custGroupProcessEntity = (CustGroupProcessEntity)springBeanFactory.getBean("custGroupProcessEntity");
		try {
			custGroupProcessEntity.handleCustGroupExcel(new HashMap());
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 处理导入目标客户群明细表
	* @date: 2016-11-15 
	* @author: zhangjj_crmpd
	* @title: handleLoadCustGroupDetailInfo  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void handleLoadCustGroupDetailInfo(){
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_ALL);
		ICustGroupProcessEntity custGroupProcessEntity = (CustGroupProcessEntity)springBeanFactory.getBean("custGroupProcessEntity");
		try {
			custGroupProcessEntity.handleLoadCustGroupDetailInfo(new HashMap());
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 处理导入目标客户群标签表
	* @date: 2016-11-25 
	* @author: zhangjj_crmpd
	* @title: handleLoadCustGroupLabelInfo  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void handleLoadCustGroupLabelInfo() {
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_NOSQL);
		ICustGroupProcessEntity custGroupProcessEntity = (CustGroupProcessEntity)springBeanFactory.getBean("custGroupProcessEntity");
		try {
			custGroupProcessEntity.handleLoadCustGroupLabelInfo(new HashMap());
		} catch (StrategyError e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 处理静态标签导入目标客户群表
	* @date: 2017-3-14 
	* @author:liuqi
	* @title: handleStaticLabelLoadCustGroupInfo  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void handleStaticLabelLoadCustGroupInfo() {
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_ALL);
		ICustGroupProcessEntity custGroupProcessEntity = (CustGroupProcessEntity)springBeanFactory.getBean("custGroupProcessEntity");
		try {
			custGroupProcessEntity.handleStaticLabelLoadCustGroupInfo(new HashMap());
		} catch (StrategyError e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		String type = args[0];
		if("handleLoadCustGroupDetailInfo".equals(type)){
			handleLoadCustGroupDetailInfo();
		}else if("handleDBCustGroup".equals(type)){
			handleDBCustGroup();
		}else if("handleLoadCustGroupExcel".equals(type)){
			handleLoadCustGroupExcel();
		}else if("handleLoadCustGroupLabelInfo".equals(type)){
			handleLoadCustGroupLabelInfo();
		}else if("handleStaticLabelLoadCustGroupInfo".equals(type)){
			handleStaticLabelLoadCustGroupInfo();
		}else if("handleLoadCustGroupCsv".equals(type)){
			handleLoadCustGroupCsv();
		}
	}

}
