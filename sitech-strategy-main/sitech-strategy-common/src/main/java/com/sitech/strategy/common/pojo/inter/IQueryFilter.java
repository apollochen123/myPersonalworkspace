package com.sitech.strategy.common.pojo.inter;

import java.sql.Timestamp;
import java.util.List;

/**
 * 查询过滤器接口
* @date: 2016-9-5 
* @author: sunliang 
* @title: IQueryFilter 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IQueryFilter {
	
	/**
	 * 
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: getAccessCode 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getAccessCode();
	/**
	 * 
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: setAccessCode 
	* @param accessCode 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAccessCode(String accessCode);
	/**
	 * 
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: getAccessCodeServiceType 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getAccessCodeServiceType();
	/**
	 * 
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: setAccessCodeServiceType 
	* @param accessCodeServiceType 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAccessCodeServiceType(String accessCodeServiceType);
	/** 
	* @date: 2017-3-9 
	* @author: wangpei
	* @title: getAcctId 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public String getAcctId();
	/** 
	* @date: 2017-3-9 
	* @author: wangpei
	* @title: setAcctId 
	* @param actId 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setAcctId(String actId);

	/**
	 * 
	* @date: 2016-10-28 
	* @author: tangaq
	* @title: getActDemandClass 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getActDemandClass();
	/**
	 * 
	* @date: 2016-10-28 
	* @author: tangaq
	* @title: setActDemandClass 
	* @param actDemandClass 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setActDemandClass(String actDemandClass);
	/**
	 * 
	* @date: 2016-10-21 
	* @author: wangth
	* @Title: getActDemandId 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getActDemandId();
	
	/**
	 * 
	* @date: 2016-10-21 
	* @author: wangth
	* @Title: setActDemandId 
	* @param actDemandId 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setActDemandId(String actDemandId);
	
	/**
	 * 
	* @date: 2016-10-28 
	* @author: tangaq
	* @title: getActDemaName 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getActDemandName();
	/**
	 * 
	* @date: 2016-10-28 
	* @author: tangaq
	* @title: setActDemandName 
	* @param actDemandName 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setActDemandName(String actDemandName);
	/**
	 * 
	* @date: 2016-10-28 
	* @author: tangaq
	* @title: getActDemandType 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getActDemandType();
	
	/**
	 * 
	* @date: 2016-10-28 
	* @author: tangaq
	* @title: setActDemandType 
	* @param actDemandType 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setActDemandType(String actDemandType);
	
	/**
	 * 
	* @date: 2016-12-23 
	* @author: zhangjj_crmpd
	* @title: getActId 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getActId();
	
	/**
	 * 
	* @date: 2016-12-23 
	* @author: zhangjj_crmpd
	* @title: setActId 
	* @param actId 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setActId(String actId);
	
	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: getApplyRegionCode 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getApplyRegionCode();
	
	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: setApplyRegionCode 
	* @param applyRegionCode 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setApplyRegionCode(String applyRegionCode);
	
	/**
	 * 
	* @date: 2016-10-15 
	* @author: wangth
	* @Title: getAuditNo 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getAuditNo();

	/**
	 * 
	* @date: 2016-10-15 
	* @author: wangth
	* @Title: setAuditNo 
	* @param auditNo 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAuditNo(String auditNo);

	/**
	 * 
	* @date: 2016-10-15 
	* @author: wangth
	* @Title: getAuditOrder 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getAuditOrder();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setAuditOrder 
	 * @param auditOrder the auditOrder to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setAuditOrder(String auditOrder);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getAuditRecordId 
	 * @return the auditRecordId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getAuditRecordId();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setAuditRecordId 
	 * @param auditRecordId the auditRecordId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setAuditRecordId(String auditRecordId);

	/**
	 * 
	* @date: 2016-10-18 
	* @author: wangth
	* @Title: getAuditStatus 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getAuditStatus();

	/**
	 * 
	* @date: 2016-10-18 
	* @author: wangth
	* @Title: setAuditStatus 
	* @param auditStatus 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAuditStatus(String auditStatus);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getAuditType 
	 * @return the auditType
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public String getAuditType();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setAuditType 
	 * @param auditType the auditType to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setAuditType(String auditType);
	/**
	 * 
	* @date: 2016-12-21 
	* @author: zhangjj_crmpd
	* @title: getBatchNo 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getBatchNo();
	/**
	 * 
	* @date: 2016-12-21 
	* @author: zhangjj_crmpd
	* @title: setBatchNo 
	* @param batchNo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setBatchNo(String batchNo);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getBusiId 
	 * @return the busiId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getBusiId();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setBusiId 
	 * @param busiId the busiId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setBusiId(String busiId);

	/**
	 * 
	* @date: 2016-10-18 
	* @author: wangth
	* @Title: getBusiType 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getBusiType();

	/**
	 * 
	* @date: 2016-10-18 
	* @author: wangth
	* @Title: setBusiType 
	* @param busiType 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setBusiType(String busiType);
	/**
	 * @date: 2016-10-27
	 * @author: xiongxq
	 * @Title: getCategroy
	 * @return the categroy
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public String getCategroy();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getChannelId 
	 * @return the channelId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getChannelId();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setChannelId 
	 * @param channelId the channelId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setChannelId(String channelId);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getChannelIdArray 
	 * @return the channelIdArray
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public List<String> getChannelIdArray();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getChannelName 
	 * @return the channelName
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getChannelName();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setChannelName 
	 * @param channelName the channelName to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setChannelName(String channelName);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getChannelType 
	 * @return the channelType
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getChannelType();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setChannelType 
	 * @param channelType the channelType to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setChannelType(String channelType);

	/**
	 * 
	* @date: 2016-10-27 
	* @author: xiongxq
	* @Title: setCategroy 
	* @param categroy 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCategroy(String categroy);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setChannelIdArray 
	 * @param channelIdArray the channelIdArray to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setChannelIdArray(List<String> channelIdArray);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getCustGroupCreateLoginNo 
	 * @return the custGroupCreateLoginNo
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getCustGroupCreateLoginNo();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setCustGroupCreateLoginNo 
	 * @param custGroupCreateLoginNo the custGroupCreateLoginNo to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setCustGroupCreateLoginNo(String custGroupCreateLoginNo);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getCustGroupEndDate 
	 * @return the custGroupEndDate
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getCustGroupEndDate();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setCustGroupEndDate 
	 * @param custGroupEndDate the custGroupEndDate to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setCustGroupEndDate(String custGroupEndDate);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getCustGroupId 
	 * @return the custGroupId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getCustGroupId();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setCustGroupId 
	 * @param custGroupId the custGroupId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setCustGroupId(String custGroupId);
	/** 
	 * @date: 2016-12-21 
	 * @author: wangpei
	 * @title: getCustId 
	 * @return the custId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public String getCustId();
	
	/** 
	 * @date: 2016-12-21 
	 * @author: wangpei
	 * @title: setCustId 
	 * @param custId the custId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setCustId(String custId);
	
	/**
	 * 
	* @date: 2016-11-11 
	* @author: fangyuan_crmpd
	* @title: getCustName 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getCustName();

	/**
	 * 
	* @date: 2016-11-11 
	* @author: fangyuan_crmpd
	* @title: setCustName 
	* @param custName 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustName(String custName);

	/**
	 * 
	* @date: 2016-11-11 
	* @author: fangyuan_crmpd
	* @title: getCustNameOrServiceNbr 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getCustNameOrServiceNbr();

	/**
	 * 
	* @date: 2016-11-11 
	* @author: fangyuan_crmpd
	* @title: setCustNameOrServiceNbr 
	* @param custNameOrServiceNbr 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustNameOrServiceNbr(String custNameOrServiceNbr);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getCustGroupName 
	 * @return the custGroupName
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getCustGroupName();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setCustGroupName 
	 * @param custGroupName the custGroupName to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setCustGroupName(String custGroupName);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getCustGroupStartDate 
	 * @return the custGroupStartDate
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getCustGroupStartDate();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setCustGroupStartDate 
	 * @param custGroupStartDate the custGroupStartDate to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setCustGroupStartDate(String custGroupStartDate);

	/**
	 * 
	* @date: 2016-10-16 
	* @author: wangth
	* @Title: getCustGroupType 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getCustGroupType();

	/**
	 * 
	* @date: 2016-10-16 
	* @author: wangth
	* @Title: setCustGroupType 
	* @param custGroupType 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupType(String custGroupType);

	/**
	 * 
	* @date: 2016-10-31 
	* @author: tangaq
	* @title: getCustGroupDetailFileName 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getCustGroupDetailFileName();

	/**
	 * 
	* @date: 2016-10-31 
	* @author: tangaq
	* @title: setCustGroupDetailFileName 
	* @param custGroupDetailFileName 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupDetailFileName(String custGroupDetailFileName);

	/**
	 * 
	* @date: 2016-10-16 
	* @author: wangth
	* @Title: getCustGroupOperTime 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getCustGroupOperTime();

	/**
	 * 
	* @date: 2016-10-16 
	* @author: wangth
	* @Title: setCustGroupOperTime 
	* @param custGroupOperTime 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupOperTime(String custGroupOperTime);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getContentId 
	 * @return the contentId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getContentId();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setContentId 
	 * @param contentId the contentId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setContentId(String contentId);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getContentDetailId 
	 * @return the contentDetailId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getContentDetailId();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setContentDetailId 
	 * @param contentDetailId the contentDetailId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setContentDetailId(String contentDetailId);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getContentName 
	 * @return the contentName
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getContentName();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setContentName 
	 * @param contentName the contentName to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setContentName(String contentName);
	/**
	 * 
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: getContentParCode 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getContentParCode();
	/**
	 * 
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: setContentParCode 
	* @param contentParCode 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setContentParCode(String contentParCode);

	/**
	 * 
	* @date: 2017-4-4 
	* @author: sunyuan
	* @title: setContenParValue 
	* @param contenParValue 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setContentParValue(String contenParValue);
	
	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getComponentId 
	 * @return the componentId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getComponentId();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setComponentId 
	 * @param componentId the componentId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setComponentId(String componentId);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getComponentType 
	 * @return the componentType
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public String getComponentType();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setComponentType 
	 * @param componentType the componentType to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setComponentType(String componentType);
	
	/**
	 * 
	* @date: 2016-10-27 
	* @author: yuanliang
	* @title: getDbType 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getDbType();

	/**
	 * 
	* @date: 2016-10-27 
	* @author: yuanliang
	* @title: setDbType 
	* @param dbType 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setDbType(String dbType);
	
	/**
	 * 
	* @date: 2017-3-29 
	* @author: yuanchun
	* @title: getEventChannelId  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getEventChannelId();
	
	/**
	 * 
	* @date: 2017-3-29 
	* @author: yuanchun
	* @title: setEventChannelId 
	* @param string 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEventChannelId(String string);
	
	/** 
	 * @date: 2016-12-21 
	 * @author: wangpei
	 * @title: getEdwDeptId 
	 * @return the edwDeptId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public String getEdwDeptId();

	/** 
	 * @date: 2016-12-21 
	 * @author: wangpei
	 * @title: setEdwDeptId 
	 * @param edwDeptId the edwDeptId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setEdwDeptId(String edwDeptId);
	/**
	 * 
	* @date: 2016-11-23 
	* @author: xiongxq
	* @Title: getEndTime 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getEndTime();
	
	/**
	 * 
	* @date: 2016-11-23 
	* @author: xiongxq
	* @Title: setEndTime 
	* @param endTime 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEndTime(String endTime);
	
	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: getEndDate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Timestamp getEndDate();
	
	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: setEndDate 
	* @param endDate 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEndDate(Timestamp endDate);
	
	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getEventDetailId 
	 * @return the eventDetailId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getEventDetailId();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setEventDetailId 
	 * @param eventDetailId the eventDetailId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setEventDetailId(String eventDetailId);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getEventId 
	 * @return the eventId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getEventId();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setEventId 
	 * @param eventId the eventId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setEventId(String eventId);
	
	/**
	 * 
	* @date: 2017-3-7 
	* @author: sunliang 
	* @title: getEventType 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getEventType();

	/**
	 * 
	* @date: 2017-3-7 
	* @author: sunliang 
	* @title: setEventType 
	* @param eventType 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEventType(String eventType);

	/**
	 * 
	* @date: 2016-11-23 
	* @author: yuanliang
	* @title: getEventDetailType 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getEventDetailType();
	/**
	 * 
	* @date: 2016-11-23 
	* @author: yuanliang
	* @title: setEventDetailType 
	* @param eventDetailType 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEventDetailType(String eventDetailType);
	/**
	 * 
	* @date: 2016-11-23 
	* @author: yuanliang
	* @title: getEventParCode 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getEventParCode();
	/**
	 * 
	* @date: 2016-11-23 
	* @author: yuanliang
	* @title: setEventParCode 
	* @param eventParCode 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEventParCode(String eventParCode);
	
	/**
	 * 
	* @date: 2017-3-9 
	* @author: yuanchun
	* @title: getFieldDesc 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getFieldDesc();
	
	/**
	 * 
	* @date: 2017-3-9 
	* @author: yuanchun
	* @title: setFieldDesc 
	* @param fieldDesc 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setFieldDesc(String fieldDesc);
	
	/**
	 * 
	* @date: 2017-4-14 
	* @author: dongyh
	* @title: getFieldValueDesc  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getFieldValueDesc();
	
	/**
	 * 
	* @date: 2017-4-14 
	* @author: dongyh
	* @title: setFieldValueDesc 
	* @param fieldValueDesc 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setFieldValueDesc(String fieldValueDesc);
	
	/**
	 * 
	* @date: 2016-11-14 
	* @author: fangyuan_crmpd
	* @title: getFieldEnName 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getFieldEnName();

	/**
	 * 
	* @date: 2016-10-31 
	* @author: wangth
	* @Title: setFieldEnName 
	* @param fieldEnName 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setFieldEnName(String fieldEnName);

	/**
	 * 
	* @date: 2016-10-31 
	* @author: wangth
	* @Title: setFieldCnName 
	* @param fieldCnName 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setFieldCnName(String fieldCnName);

	/**
	 * 
	* @date: 2016-11-14 
	* @author: fangyuan_crmpd
	* @title: getFieldValue 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getFieldValue();

	/**
	 * 
	* @date: 2016-11-14 
	* @author: fangyuan_crmpd
	* @title: setFieldValue 
	* @param fieldValue 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setFieldValue(String fieldValue);
	
	/**
	 * 
	* @date: 2016-11-26 
	* @author: xiongxq
	* @Title: getFifthDay 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getFifthDay();
	
	/**
	 * 
	* @date: 2016-11-26 
	* @author: xiongxq
	* @Title: setFifthDay 
	* @param fifthDay 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setFifthDay(String fifthDay);
	
	/** 
	 * @date: 2016-12-21 
	 * @author: wangpei
	 * @title: getGridId 
	 * @return the gridId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public String getGridId();

	/** 
	 * @date: 2016-12-21 
	 * @author: wangpei
	 * @title: setGridId 
	 * @param gridId the gridId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setGridId(String gridId);
	
    /**
     * 
    * @date: 2017-1-11 
    * @author: tangaq
    * @title: getGroupCode 
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	public String getGroupCode();
    
	/**
	 * 
	* @date: 2017-1-11 
	* @author: tangaq
	* @title: setGroupCode 
	* @param groupCode 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setGroupCode(String groupCode);
	
	/**
	 * 
	* @date: 2016-10-14 
	* @author: wangth
	* @Title: getGroupId 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getGroupId();

	/**
	 * 
	* @date: 2016-10-14 
	* @author: wangth
	* @Title: setGroupId 
	* @param groupId 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setGroupId(String groupId);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getIdNo 
	 * @return the idNo
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getIdNo();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setIdNo 
	 * @param idNo the idNo to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setIdNo(String idNo);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getKeyWords 
	 * @return the keyWords
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public List<String> getKeyWords();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setKeyWords 
	 * @param keyWords the keyWords to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setKeyWords(List<String> keyWords);

	/** 
	 * @date: 2016-10-27 
	 * @author: wangpei
	 * @title: getLoginNo 
	 * @return the loginNo
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public String getLoginNo();

	/**
	 * 
	* @date: 2016-10-27 
	* @author: xiongxq
	* @Title: setLoginNo 
	* @param loginNo 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setLoginNo(String loginNo);

	/**
	 * 
	* @date: 2016-10-27 
	* @author: xiongxq
	* @Title: getLoginName 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getLoginName();

	/**
	 * 
	* @date: 2016-10-27 
	* @author: xiongxq
	* @Title: setLoginName 
	* @param loginName 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setLoginName(String loginName);

	/**
	 * 
	* @date: 2016-10-27 
	* @author: yangwl
	* @title: getLoadMarketCaseCache 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getLoadMarketCaseCache();

	/**
	 * 
	* @date: 2016-10-27 
	* @author: yangwl
	* @title: setLoadMarketCaseCache 
	* @param loadMarketCaseCache 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setLoadMarketCaseCache(String loadMarketCaseCache);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getMarketCaseCacheKey 
	 * @return the marketCaseCacheKey
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getMarketCaseCacheKey();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setMarketCaseCacheKey 
	 * @param marketCaseCacheKey the marketCaseCacheKey to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setMarketCaseCacheKey(String marketCaseCacheKey);
	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getMarketCaseId 
	 * @return the marketCaseId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getMarketCaseId();
	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setMarketCaseId 
	 * @param marketCaseId the marketCaseId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setMarketCaseId(String marketCaseId);
	/**
	 * 
	* @date: 2017-1-10 
	* @author: yuanchun
	* @title: getMarketCaseLevel 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	
	public String getMarketCaseLevel();
	/**
	 * 
	* @date: 2017-1-10 
	* @author: yuanchun
	* @title: setMarketCaseLevel 
	* @param marketCaseLevel 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	
	public void setMarketCaseLevel(String marketCaseLevel);
	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getMarketCaseName 
	 * @return the marketCaseName
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getMarketCaseName();
	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setMarketCaseName 
	 * @param marketCaseName the marketCaseName to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setMarketCaseName(String marketCaseName);
	/**
	 * 
	* @date: 2017-1-10 
	* @author: yuanchun
	* @title: getMarketCaseQueryFlagByPermission 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	
	public String getMarketCaseQueryFlagByPermission();
	/**
	 * 
	* @date: 2017-1-10 
	* @author: yuanchun
	* @title: setMarketCaseQueryFlagByPermission 
	* @param marketCaseQueryFlagByPermission 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	
	public void setMarketCaseQueryFlagByPermission(
			String marketCaseQueryFlagByPermission);
	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getMarketCaseStartDate 
	 * @return the marketCaseStartDate
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getMarketCaseStartDate();
	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setMarketCaseStartDate 
	 * @param marketCaseStartDate the marketCaseStartDate to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setMarketCaseStartDate(String marketCaseStartDate);
	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getMarketCaseEndDate 
	 * @return the marketCaseEndDate
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getMarketCaseEndDate();
	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setMarketCaseEndDate 
	 * @param marketCaseEndDate the marketCaseEndDate to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setMarketCaseEndDate(String marketCaseEndDate);
	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getMarketCaseCreateLoginNo 
	 * @return the marketCaseCreateLoginNo
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getMarketCaseCreateLoginNo();
	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setMarketCaseCreateLoginNo 
	 * @param marketCaseCreateLoginNo the marketCaseCreateLoginNo to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setMarketCaseCreateLoginNo(String marketCaseCreateLoginNo);
	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getMarketCaseType 
	 * @return the marketCaseType
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getMarketCaseType();
	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setMarketCaseType 
	 * @param marketCaseType the marketCaseType to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setMarketCaseType(String marketCaseType);
	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getMarketCaseBusiType 
	 * @return the marketCaseBusiType
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getMarketCaseBusiType();
	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setMarketCaseBusiType 
	 * @param marketCaseBusiType the marketCaseBusiType to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setMarketCaseBusiType(String marketCaseBusiType);
	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getMarketStatusCode 
	 * @return the marketStatusCode
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getMarketStatusCode();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setMarketStatusCode 
	 * @param marketStatusCode the marketStatusCode to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setMarketStatusCode(String marketStatusCode);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getMarketCaseValidDate 
	 * @return the marketCaseValidDate
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getMarketCaseValidDate();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setMarketCaseValidDate 
	 * @param marketCaseValidDate the marketCaseValidDate to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setMarketCaseValidDate(String marketCaseValidDate);

	/**
	 * 
	* @date: 2016-11-4 
	* @author: tangaq
	* @title: getMenuName 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getMenuName();

	/**
	 * 
	* @date: 2016-11-4 
	* @author: tangaq
	* @title: setMenuName 
	* @param menuName 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMenuName(String menuName);
	/**
	 * 
	* @date: 2017-2-28 
	* @author: yexr
	* @title: setNoticeName 
	* @param noticeName 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setNoticeName(String noticeName);
	/**
	 * 
	* @date: 2017-2-28 
	* @author: yexr
	* @title: getNoticeName 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getNoticeName();

	/**
	 * 
	* @date: 2016-12-2 
	* @author: xiongxq
	* @Title: getOldLoginPassword 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getOldLoginPassword();
	
	/**
	 * 
	* @date: 2016-12-2 
	* @author: xiongxq
	* @Title: setOldLoginPassword 
	* @param oldLoginPassword 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setOldLoginPassword(String oldLoginPassword);
	
	/**
	 * 
	* @date: 2016-10-27 
	* @author: xiongxq
	* @Title: setOptionValue 
	* @param optionValue 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setOptionValue(String optionValue);

	/** 
	* @date: 2016-10-26 
	* @author: wangpei
	* @title: getOperName 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public String getOperName();

	/** 
	* @date: 2016-10-26 
	* @author: wangpei
	* @title: setOperName 
	* @param operName 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setOperName(String operName);

	/** 
	* @date: 2016-10-26 
	* @author: wangpei
	* @title: getOperNo 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public String getOperNo();

	/** 
	* @date: 2016-10-26 
	* @author: wangpei
	* @title: setOperNo 
	* @param operNO 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setOperNo(String operNO);

	/** 
	 * @date: 2016-10-26 
	 * @author: wangpei
	 * @title: getOperTime 
	 * @return the operTime
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public Timestamp getOperTime();

	/** 
	 * @date: 2016-10-26 
	 * @author: wangpei
	 * @title: setOperTime 
	 * @param operTime the operTime to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setOperTime(Timestamp operTime);

	/** 
	 * @date: 2016-10-26 
	 * @author: wangpei
	 * @title: getOperTimeStart 
	 * @return the operTimeStart
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public Timestamp getOperTimeStart();

	/** 
	 * @date: 2016-10-26 
	 * @author: wangpei
	 * @title: setOperTimeStart 
	 * @param operTimeStart the operTimeStart to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setOperTimeStart(Timestamp operTimeStart);

	/** 
	 * @date: 2016-10-26 
	 * @author: wangpei
	 * @title: getOperTimeEnd 
	 * @return the operTimeEnd
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public Timestamp getOperTimeEnd();

	/** 
	 * @date: 2016-10-26 
	 * @author: wangpei
	 * @title: setOperTimeEnd 
	 * @param operTimeEnd the operTimeEnd to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setOperTimeEnd(Timestamp operTimeEnd);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getPhoneNo 
	 * @return the phoneNo
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getPhoneNo();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setPhoneNo 
	 * @param phoneNo the phoneNo to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setPhoneNo(String phoneNo);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getPositionId 
	 * @return the positionId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public String getPositionId();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setPositionId 
	 * @param positionId the positionId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setPositionId(String positionId);
	
	/**
	* @date: 2017-4-8 
	* @author: dongyh
	* @title: getPosition 
	* @param positionType
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getPositionType();
	
	/**
	* @date: 2017-4-8 
	* @author: dongyh
	* @title: setPositionType 
	* @param positionType 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPositionType(String positionType);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getParentComponentType 
	 * @return the parentComponentType
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getParentComponentType();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setParentComponentType 
	 * @param parentComponentType the parentComponentType to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setParentComponentType(String parentComponentType);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getParentRelId 
	 * @return the parentRelId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getParentRelId();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setParentRelId 
	 * @param parentRelId the parentRelId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setParentRelId(String parentRelId);
	
	/**
	 * 
	* @date: 2017-1-25 
	* @author: zhangjj_crmpd
	* @title: getProcessNo 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getProcessNo();
	
	/**
	 * 
	* @date: 2017-1-25 
	* @author: zhangjj_crmpd
	* @title: setProcessNo 
	* @param processNo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setProcessNo(String processNo);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getProductId 
	 * @return the productId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getProductId();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setProductId 
	 * @param productId the productId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setProductId(String productId);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getProductName 
	 * @return the productName
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getProductName();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setProductName 
	 * @param productName the productName to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setProductName(String productName);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getProductType 
	 * @return the productType
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getProductType();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setProductType 
	 * @param productType the productType to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setProductType(String productType);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getParentComponentId 
	 * @return the parentComponentId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getParentComponentId();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setParentComponentId 
	 * @param parentComponentId the parentComponentId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setParentComponentId(String parentComponentId);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getProductCommodityId 
	 * @return the productCommodityId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getProductCommodityId();
	/**
	* @date: 2017-2-24 
	* @author: hannn
	* @title: setCityId 
	* @param cityId 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCityId(String cityId);
	/**
	* @date: 2017-2-24 
	* @author: hannn
	* @title: getCityId 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getCityId() ;
	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setProductCommodityId 
	 * @param productCommodityId the productCommodityId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setProductCommodityId(String productCommodityId);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getProductCommodityName 
	 * @return the productCommodityName
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getProductCommodityName();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setProductCommodityName 
	 * @param productCommodityName the productCommodityName to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setProductCommodityName(String productCommodityName);
    /**
     * 
    * @date: 2016-12-21 
    * @author: yuanliang
    * @title: getQuestionId 
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	public String getQuestionId();
	/**
	 * 
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: setQuestionId 
	* @param questionId 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setQuestionId(String questionId);
	/**
	 * 
	* @date: 2016-11-16 
	* @author: yuanliang
	* @title: setRangeStartDate 
	* @param rangeStartDate 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRangeStartDate(String rangeStartDate);

	/**
	 * 
	* @date: 2016-11-16 
	* @author: yuanliang
	* @title: setRangeEndDate 
	* @param rangeEndDate 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRangeEndDate(String rangeEndDate);
	
	/**
	 * 
	* @date: 2017-1-6 
	* @author:liuqi
	* @title: getRecommonedStartTime 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getRecommonedStartTime(); 
	
	/**
	 * 
	* @date: 2017-1-6 
	* @author:liuqi
	* @title: setRecommonedStartTime 
	* @param recommonedStartTime 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRecommonedStartTime(String recommonedStartTime);
	
	/**
	 * 
	* @date: 2017-1-6 
	* @author:liuqi
	* @title: getRecommonedEndTime 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getRecommonedEndTime(); 
	
	/**
	 * 
	* @date: 2017-1-6 
	* @author:liuqi
	* @title: setRecommonedEndTime 
	* @param recommonedEndTime 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRecommonedEndTime(String recommonedEndTime);
	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getRegionCode 
	 * @return the regionCode
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public String getRegionCode();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setRegionCode 
	 * @param regionCode the regionCode to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setRegionCode(String regionCode);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getRegionCodeArray 
	 * @return the regionCodeArray
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public List<String> getRegionCodeArray();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setRegionCodeArray 
	 * @param regionCodeArray the regionCodeArray to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setRegionCodeArray(List<String> regionCodeArray);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getRelId 
	 * @return the relId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public String getRelId();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setRelId 
	 * @param relId the relId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setRelId(String relId);
	
	/**
	* @date: 2016-11-26 
	* @author: xiongxq
	* @Title: getReportDate 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getReportDate();
	
	/**
	 * 
	* @date: 2016-11-26 
	* @author: xiongxq
	* @Title: setReportDate 
	* @param reportDate 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setReportDate(String reportDate);
	
	/**
	 * 
	* @date: 2016-10-27 
	* @author: wangth
	* @Title: getRoleId 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getRoleId();

	/**
	 * 
	* @date: 2016-10-27 
	* @author: wangth
	* @Title: setRoleId 
	* @param roleId 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRoleId(String roleId);

	/**
	 * 
	* @date: 2016-10-27 
	* @author: wangth
	* @Title: getRoleType 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getRoleType();

	/**
	 * 
	* @date: 2016-10-27 
	* @author: wangth
	* @Title: setRoleType 
	* @param roleType 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRoleType(String roleType);

	/**
	 * 
	* @date: 2016-10-27 
	* @author: wangth
	* @Title: getRoleName 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getRoleName();

	/**
	 * 
	* @date: 2016-10-27 
	* @author: wangth
	* @Title: setRoleName 
	* @param roleName 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRoleName(String roleName);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setRuleDetailId 
	 * @param ruleDetailId the ruleDetailId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setRuleDetailId(String ruleDetailId);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getRuleId 
	 * @return the ruleId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getRuleId();

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: setRuleId 
	 * @param ruleId the ruleId to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setRuleId(String ruleId);

	/** 
	 * @date: 2016-10-12 
	 * @author: wangpei
	 * @title: getRuleDetailId 
	 * @return the ruleDetailId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public String getRuleDetailId();
	/**
	 * 
	* @date: 2016-12-21 
	* @author: zhangjj_crmpd
	* @title: getRuleDetailType 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getRuleDetailType();
	/**
	 * 
	* @date: 2016-12-21 
	* @author: zhangjj_crmpd
	* @title: setRuleDetailType 
	* @param ruleDetailType 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRuleDetailType(String ruleDetailType);
	
	/**
	 * 
	* @date: 2016-12-22 
	* @author: zhangjj_crmpd
	* @title: getRuleParCode 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getRuleParCode();
	
	/**
	 * 
	* @date: 2016-12-22 
	* @author: zhangjj_crmpd
	* @title: setRuleParCode 
	* @param ruleParCode 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRuleParCode(String ruleParCode);
	
	/**
	 * 
	* @date: 2016-11-26 
	* @author: xiongxq
	* @Title: getSevenDay 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getSevenDay();
	
	/**
	 * 
	* @date: 2016-11-26 
	* @author: xiongxq
	* @Title: setSevenDay 
	* @param sevenDay 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSevenDay(String sevenDay);
	
	/**
	 * 
	* @date: 2017-1-25 
	* @author: zhangjj_crmpd
	* @title: getStatusCode 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getStatusCode();
	
	/**
	 * 
	 * @date: 2016-11-14
	 * @author: zhangjj_crmpd
	 * @title: setStatusCode
	 * @param statusCode
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setStatusCode(String statusCode);
	
	/** 
	 * @date: 2016-10-26 
	 * @author: wangpei
	 * @title: getSysDate 
	 * @return the sysDate
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public Timestamp getSysDate();

	/** 
	 * @date: 2016-10-26 
	 * @author: wangpei
	 * @title: setSysDate 
	 * @param sysDate the sysDate to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setSysDate(Timestamp sysDate);
	
	/**
	 * 
	* @date: 2016-11-23 
	* @author: xiongxq
	* @Title: getStartTime 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getStartTime();
	
	/**
	 * 
	* @date: 2016-11-23 
	* @author: xiongxq
	* @Title: setStartTime 
	* @param startTime 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setStartTime(String startTime);
	
	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: getStartDate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Timestamp getStartDate();
	
	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: setStartDate 
	* @param startDate 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setStartDate(Timestamp startDate);

	/**
	 * 
	* @date: 2016-11-11 
	* @author: fangyuan_crmpd
	* @title: getServiceNbr 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getServiceNbr();

	/**
	 * 
	* @date: 2016-11-11 
	* @author: fangyuan_crmpd
	* @title: setServiceNbr 
	* @param serviceNbr 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setServiceNbr(String serviceNbr);
	
	/** 
	 * @date: 2016-12-21 
	 * @author: wangpei
	 * @title: getServiceNo 
	 * @return the serviceNo
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public String getServiceNo();

	/** 
	 * @date: 2016-12-21 
	 * @author: wangpei
	 * @title: setServiceNo 
	 * @param serviceNo the serviceNo to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setServiceNo(String serviceNo);
	
	/**
	 * 
	* @date: 2016-11-23 
	* @author: fangyuan_crmpd
	* @title: getSerType 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getSerType();
	
	/**
	 * 
	* @date: 2016-11-23 
	* @author: fangyuan_crmpd
	* @title: setSerType 
	* @param serType 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSerType(String serType);
	/**
	 * 
	* @date: 2016-11-26 
	* @author: yuanliang
	* @title: getSendDate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getSendDate();
	/**
	 * 
	* @date: 2016-11-26 
	* @author: yuanliang
	* @title: setSendDate 
	* @param sendDate 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSendDate(String sendDate);
	/**
	 * 
	* @date: 2016-12-21 
	* @author: zhangjj_crmpd
	* @title: getTaskadjustId 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getTaskadjustId();
	/**
	 * 
	* @date: 2016-12-21 
	* @author: zhangjj_crmpd
	* @title: setTaskadjustId 
	* @param taskAdjustId 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTaskadjustId(String taskAdjustId);
	
	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: setTaskName 
	* @param taskName 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTaskName(String taskName);
	
	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: getTaskName 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getTaskName();
	/**
	 * 
	* @date: 2016-11-26 
	* @author: xiongxq
	* @Title: getThreeDay 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getThreeDay();
	/**
	 * 
	* @date: 2016-11-26 
	* @author: xiongxq
	* @Title: setThreeDay 
	* @param threeDay 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setThreeDay(String threeDay);
	/**
	 * 
	* @date: 2016-10-27 
	* @author: tangaq
	* @title: getTemplateName 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getTemplateName() ;

	/**
	 * 
	* @date: 2016-10-27 
	* @author: tangaq
	* @title: setTemplateName 
	* @param templateName 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTemplateName(String templateName);

	/**
	 * 
	* @date: 2016-11-11 
	* @author: tangaq
	* @title: getTemplateType 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getTemplateType();

	/**
	 * 
	* @date: 2016-11-11 
	* @author: tangaq
	* @title: setTemplateType 
	* @param templateType 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTemplateType(String templateType);

	/**
	 * 
	* @date: 2016-10-19 
	* @author: tangaq
	* @title: getUserLabelName 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getUserLabelName();

	/**
	 * 
	* @date: 2016-10-19 
	* @author: tangaq
	* @title: setUserLabelName 
	* @param labelName 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setUserLabelName(String userLabelName);

	/**
	 * 
	* @date: 2016-10-19 
	* @author: tangaq
	* @title: getUserLabelCode 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getUserLabelCode();

	/**
	 * 
	* @date: 2016-10-19 
	* @author: tangaq
	* @title: setUserLabelCode 
	* @param labelCode 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setUserLabelCode(String userLabelCode);

	/**
	 * 
	* @date: 2016-11-7 
	* @author: sunliang 
	* @title: getUpdateTime 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Timestamp getUpdateTime();

	/**
	 * 
	* @date: 2016-11-7 
	* @author: sunliang 
	* @title: setUpdateTime 
	* @param updateTime 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setUpdateTime(Timestamp updateTime);
	/**
	 * 
	* @date: 2016-10-20 
	* @author: zhangqia
	* @title: getSendTime 
	* @param  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getSendTime();
	/**
	 * 
	* @date: 2016-10-20 
	* @author: zhangqia
	* @title: setSendTime 
	* @param triggerMode 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSendTime(String sendTime);
	
	/**
	 * 
	* @date: 2016-12-1 
	* @author: hannn
	* @title: getTriggerMode 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getTriggerMode();
	/**
	 * 
	* @date: 2016-12-1 
	* @author: hannn
	* @title: setTriggerMode 
	* @param triggerMode 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTriggerMode(String triggerMode);
	
	/**
	 * 
	* @date: 2017-4-24 
	* @author: songhui_crmpd
	* @title: getWithoutBlack 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	
	public String getWithoutBlack();
	
	/**
	 * 
	* @date: 2017-4-24 
	* @author: songhui_crmpd
	* @title: setWithoutBlack 
	* @param withoutBLack 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setWithoutBlack(String withoutBLack);
	
}


