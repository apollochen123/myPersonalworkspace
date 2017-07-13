package com.sitech.strategy.persist.base;

import java.io.Serializable;

import com.sitech.strategy.persist.capacity.impl.IMsgDML;
import com.sitech.strategy.persist.utils.SMPPUtil;
import com.sitech.strategy.persist.utils.kafka.KafkaProducerUtil;

/**
 * 消息数据处理基类
* @date: 2016-9-10 
* @author: sunliang 
* @title: BaseMessageDB 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class BaseMessageDB extends BaseClass implements Serializable{
	public SMPPUtil sMPPUtil = SMPPUtil.getInstance();
	public KafkaProducerUtil kafkaProducerUtil = KafkaProducerUtil.getInstance();
}
