package com.sitech.strategy.persist.utils.kafka;

import kafka.producer.Partitioner;
import kafka.utils.VerifiableProperties;

/**
 * 简单分区类
* @date: 2016-9-8 
* @author: sunliang 
* @title: SimplePartitioner 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class SimplePartitioner  implements Partitioner {
	public SimplePartitioner (VerifiableProperties props) {
		
	}
	
	/**
	 * 分区算法
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: partition 
	* @param key
	* @param numPartitions
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public int partition(Object key, int numPartitions) {
		return (key.hashCode() & 0x0FFFFFFF) % numPartitions; 
	}

}