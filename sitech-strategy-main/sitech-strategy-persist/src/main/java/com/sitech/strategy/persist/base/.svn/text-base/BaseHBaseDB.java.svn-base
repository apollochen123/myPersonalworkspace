package com.sitech.strategy.persist.base;

import java.io.Serializable;

import com.sitech.strategy.common.pojo.inter.hbase.IHbaseRowKey;
import com.sitech.strategy.common.pojo.inter.hbase.IHbaseTableName;
import com.sitech.strategy.persist.utils.HBaseUtil;

/**
 * hbase数据处理基类
* @date: 2016-9-10 
* @author: sunliang 
* @title: BaseHBaseDB 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class BaseHBaseDB extends BaseClass implements Serializable{
	
	/**
	 * hbaseDao对象
	 */
	protected HBaseUtil hbaseDao = HBaseUtil.getInstance();
	/**
	 * hbase表名称对象
	 */
	protected IHbaseTableName hbaseTableName;

	/**
	 * 
	* @date: 2017-1-5 
	* @author: zhangjj_crmpd
	* @title: setHbaseTableName 
	* @param hbaseTableName 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setHbaseTableName(IHbaseTableName hbaseTableName) {
		this.hbaseTableName = hbaseTableName;
	}

	
}
