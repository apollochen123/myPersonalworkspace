package com.sitech.strategy.process.entity.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.ICoupleBack;
import com.sitech.strategy.core.objectville.inter.ITask;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.process.base.BaseProcessEntity;
import com.sitech.strategy.process.entity.inter.ICoupleBackProcessEntity;

/**
 * 反馈记录实体
* @date: 2016-9-12 
* @author: sunliang 
* @title: CoupleBackEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class CoupleBackProcessEntity extends BaseProcessEntity implements
		ICoupleBackProcessEntity,Serializable {
	
	/**
	 * 反馈对象
	 */
	protected ICoupleBack coupleBack;
	/**
	 * 反馈查询
	 */
	protected IDataSelector.ICoupleBackSelector coupleBackSelector;
	/**
	 * 任务
	 */
	protected ITask task;
	/**
	 * 
	* @date: 2016-10-20 
	* @author: sunliang 
	* @title: setCoupleBack 
	* @param coupleBack 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCoupleBack(ICoupleBack coupleBack) {
		this.coupleBack = coupleBack;
	}

	
	/** 
	 * @date: 2016-12-26 
	 * @author: wangpei
	 * @title: setCoupleBackSelector 
	 * @param coupleBackSelector the coupleBackSelector to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setCoupleBackSelector(
			IDataSelector.ICoupleBackSelector coupleBackSelector) {
		this.coupleBackSelector = coupleBackSelector;
	}

	/** 
	 * @date: 2016-12-26 
	 * @author: wangpei
	 * @title: setTask 
	 * @param task the task to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setTask(ITask task) {
		this.task = task;
	}


	/**
	 * 接收反馈记录
	* @date: 2016-11-26 
	* @author: sunliang 
	* @title: receiveCoupleBack 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void receiveCoupleBack(Map<String,Object> inParam) throws StrategyError{

		String titleType = (String)inParam.get("titleType");
		
		if(Const.COUPLEBACK_TITLE_TYPE_RECEIPT.equals(titleType)){
			//回单
			coupleBack.saveReceiptRecordInfo(inParam);
		}else if (Const.COUPLEBACK_TITLE_TYPE_CLICK.equals(titleType)) {
			coupleBack.saveClickRecordInfo(inParam);
		}else if (Const.COUPLEBACK_TITLE_TYPE_CALLCONTACT.equals(titleType)){
			coupleBack.saveChannelCallContactInfo(inParam,inParam);
		}else if (Const.COUPLEBACK_TITLE_TYPE_SMSCONTACT.equals(titleType)){
			coupleBack.saveChannelSMSContactInfo(inParam);
		}else if(Const.COUPLEBACK_TITLE_TYPE_SMSPULL.equals(titleType)){
			coupleBack.saveSMSPullInfo(inParam);
		}else if(Const.COUPLEBACK_TITLE_TYPE_PUSHARRIVE.equals(titleType)){
			coupleBack.savePushArriveInfo(inParam);
		}
	}

	/** 任务关闭
	* @date: 2016-12-26 
	* @author: wangpei
	* @title: recommonedTaskClose 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void recommonedTaskClose(Map<String, Object> inParam)
			throws StrategyError {
		task.recommonedTaskClose(inParam);
	}
	
	/**
	 * 接收受理反馈记录
	* @date: 2017-2-14 
	* @author: yexr
	* @title: receiveAcceptCoupleBack 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
    @Override
	public void receiveAcceptCoupleBack(Map<String, Object> inParam)throws StrategyError {
     if(!CommonUtils.objectIsNull(inParam)){
    	 log.info("show receiveAcceptCoupleBack Entity", inParam);
    	 coupleBack.saveAcceptRecordInfo(inParam);
     }
	}

    /**
     * 接收资费信息反馈记录
    * @date: 2017-4-7 
    * @author: zhangyw_crmpd
    * @title: receivePostAgeOrder 
    * @param inParam
    * @throws StrategyError 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	@Override
	public void receivePostAgeOrder(Map<String, Object> inParam)
			throws StrategyError {
		log.info("show receivePostAgeOrder Entity", inParam);
		coupleBack.savePostageRecordInfo(inParam);
	}
	
}
