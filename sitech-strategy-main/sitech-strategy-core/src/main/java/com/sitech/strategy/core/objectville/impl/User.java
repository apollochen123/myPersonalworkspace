package com.sitech.strategy.core.objectville.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.inter.IMarketCasePacketPojo;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.FileUtil;
import com.sitech.strategy.common.utils.PropertiesUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IUser;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;

/**
 * 用户对象
* @date: 2016年9月5日 
* @author: wangth
* @Title: User 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public class User extends BaseClass implements IUser {
	
	/**
	 * 反馈数据插入对象
	 */
	protected IDataInsertor.ICoupleBackInsertor coupleBackInsertor;
	/**
	 * 用户删除对象
	 */
	protected IDataDeleter.IUserDeleter userDeleter;
	/**
	 * 用户查询对象
	 */
	protected IDataSelector.IUserSelector userSelector;
	/**
	 * 用户插入对象
	 */
	protected IDataInsertor.IUserInsertor userInsertor;
	/**
	 * 用户更新对象
	 */
	protected IDataUpdater.IUserUpdater userUpdater;
	
	/**
	 * 
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: setCoupleBackInsertor 
	* @param coupleBackInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCoupleBackInsertor(
			IDataInsertor.ICoupleBackInsertor coupleBackInsertor) {
		this.coupleBackInsertor = coupleBackInsertor;
	}
	/** 
	 * @date: 2016-10-21 
	 * @author: xiongxq
	 * @Title: setUserUpdater 
	 * @param userUpdater the userUpdater to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setUserUpdater(IDataUpdater.IUserUpdater userUpdater) {
		this.userUpdater = userUpdater;
	}

	/** 
	 * @date: 2016-10-20 
	 * @author: xiongxq
	 * @Title: setUserInsertor 
	 * @param userInsertor the userInsertor to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setUserInsertor(IDataInsertor.IUserInsertor userInsertor) {
		this.userInsertor = userInsertor;
	}

	/** 
	 * @date: 2016-10-19 
	 * @author: xiongxq
	 * @Title: setUserDeleter 
	 * @param userDeleter the userDeleter to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setUserDeleter(IDataDeleter.IUserDeleter userDeleter) {
		this.userDeleter = userDeleter;
	}

	/** 
	 * @date: 2016-10-19 
	 * @author: xiongxq
	 * @Title: setUserSelector 
	 * @param userSelector the userSelector to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setUserSelector(IDataSelector.IUserSelector userSelector) {
		this.userSelector = userSelector;
	}

	/** 
	 * 批量保存灰名单
	* @date: 2016-10-18 
	* @author: xiongxq
	* @Title: addBatchGrey 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void addBatchGrey(Map<String, Object> inParam) throws StrategyError {
		userInsertor.insertBatchGrey(inParam);
	}

	/** 
	 * 单个保存灰名单
	* @date: 2016-10-18 
	* @author: xiongxq
	* @Title: addSingleGrey 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void addSingleGrey(Map<String, Object> inParam) throws StrategyError {
		userInsertor.insertSingleGrey(inParam);
	}
	
	/**
	 * 增加用户接触记录
	* @date: 2017-2-9 
	* @author: sunliang 
	* @title: addUserContactRecord 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addUserContactRecord(Map<String, Object> inParam)
			throws StrategyError {
		List<Map<String,String>> userList = (List<Map<String,String>>)inParam.get("userList");
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		for(Map<String,String> userMap : userList){
			tempInParam.clear();
			tempInParam.put("idNo", (String)userMap.get("idNo"));
			tempInParam.put("seqId", (String)inParam.get("seqId"));
			coupleBackInsertor.insertContactRecordInfo(inParam,tempInParam);
		}
	}
	
	/**
	 * 增加用户推荐记录
	* @date: 2017-2-9 
	* @author: sunliang 
	* @title: addUserRecommendRecord 
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addUserRecommendRecord(Map<String,Object> inParam,List<Map<String, Object>> packetMarkCaseList)
			throws StrategyError {
		Map<String,Object> tempParam = new HashMap<String,Object>();
		for(Map<String,Object> marketCasePacketPojoMap : packetMarkCaseList){
			Map<String,Object> userMap = (Map<String, Object>) marketCasePacketPojoMap.get("userMap");
			if(!CommonUtils.objectIsNull(marketCasePacketPojoMap.get("positionInfoMap"))){
				Map<String,Object> positionInfoMap = (Map<String,Object>)marketCasePacketPojoMap.get("positionInfoMap");
				for(Map.Entry<String, Object> entry : positionInfoMap.entrySet()){
					List<IMarketCasePacketPojo> marketCasePacketPojoList = (List<IMarketCasePacketPojo>)entry.getValue();
					for(IMarketCasePacketPojo marketCasePacketPojo : marketCasePacketPojoList){
						log.debug("====addUserRecommendRecord===MarketCaseBasic", marketCasePacketPojo.getMarketCaseBasic());
						Map<String,Object> marketCaseBasicMap = (Map<String,Object>)marketCasePacketPojo.getMarketCaseBasic().get("marketCaseBasic");
						tempParam.clear();
						tempParam.put("marketCaseId", (String)marketCaseBasicMap.get("marketCaseId"));
						tempParam.put("positionId", entry.getKey());
						tempParam.put("idNo", userMap.get("idNo"));
						tempParam.put("seqId", SequenceUtil.getSequence());
						tempParam.put("channelId", CommonUtils.objectIsNull(inParam.get("channelId"))?entry.getKey() : inParam.get("channelId"));
						tempParam.put("operNo", (String)marketCaseBasicMap.get("operNo"));
						tempParam.put("operName", (String)marketCaseBasicMap.get("operName"));
						tempParam.put("regionCode", (String)marketCaseBasicMap.get("regionCode"));
						tempParam.put("numType", Const.NUM_TYPE_PHONE_NO);
						tempParam.put("numValue", inParam.get("phoneNo"));
						log.debug("====addUserRecommendRecord===tempParam===", tempParam);
						coupleBackInsertor.insertRecommendRecord(inParam,tempParam);
					}
				}
			}
		}
		
	}
	
	/**
	 * 增加用户推荐营销案记录
	* @date: 2017-4-10 
	* @author: sunyuan
	* @title: addUserRecommendMarketCase 
	* @param inParam
	* @param packetMarkCaseList
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addUserRecommendMarketCase(Map<String,Object> inParam,List<Map<String, Object>> packetMarkCaseList)
			throws StrategyError {
		Map<String,Object> tempParam = new HashMap<String,Object>();
		for(Map<String,Object> marketCasePacketPojoMap : packetMarkCaseList){
			Map<String,Object> userMap = (Map<String, Object>) marketCasePacketPojoMap.get("userMap");
			if(!CommonUtils.objectIsNull(marketCasePacketPojoMap.get("positionInfoMap"))){
				Map<String,Object> positionInfoMap = (Map<String,Object>)marketCasePacketPojoMap.get("positionInfoMap");
				for(Map.Entry<String, Object> entry : positionInfoMap.entrySet()){
					List<IMarketCasePacketPojo> marketCasePacketPojoList = (List<IMarketCasePacketPojo>)entry.getValue();
					for(IMarketCasePacketPojo marketCasePacketPojo : marketCasePacketPojoList){
						log.debug("===User.addUserRecommendMarketCase.marketCasePacketPojo.getMarketCaseBasic()===", marketCasePacketPojo.getMarketCaseBasic());
						Map<String,Object> marketCaseBasicMap = (Map<String,Object>)marketCasePacketPojo.getMarketCaseBasic().get("marketCaseBasic");
						tempParam.clear();
						tempParam.put("marketCaseId", (String)marketCaseBasicMap.get("marketCaseId"));
						tempParam.put("idNo", userMap.get("idNo"));
						tempParam.put("phoneNo", inParam.get("phoneNo"));
					}
				}
			}
		}
		if(!CommonUtils.objectIsNull(tempParam)){
			log.debug("===User.addUserRecommendMarketCase.tempParam===", tempParam);
			userInsertor.insertRecommendMarketCase(inParam,tempParam);
		}
	}
	
	/**
	 * 获取用户历史接触记录
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: getUserHisTouchRecord 
	* @param userMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> getUserHisTouchRecord(
			Map<String, Object> userMap) throws StrategyError {
		return new ArrayList<Map<String, Object>>();
	}
	
	/**
	 * 处理灰名单用户
	* @date: 2017-1-18 
	* @author: zhangjj_crmpd
	* @title: handleGreyUser  
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void handleGreyUser() throws StrategyError {
		File greyFile = new File(PropertiesUtil.getProperty("filePath.properties", "file.GreyFile"));
		File bakDesDri= new File(PropertiesUtil.getProperty("filePath.properties", "file.GreyFileBak"));
		File[] greyList = greyFile.listFiles();
		for (int i = 0; i < greyList.length; i++) {
			String fileName = greyList[i].getAbsolutePath();
			log.info("fileName:", fileName);
		   if (greyList[i].isFile()) {
			   List<String> txtList = FileUtil.readTxt(greyList[i].getAbsolutePath());
			   //log.debug("txtList:", txtList);
			   //根据文件名称区分 添加 灰名单 删除灰名单
			   if(FileUtil.getFileName(fileName).contains("_label_")){
				   if(!CommonUtils.objectIsNull(txtList)){
					   for(String txtLine:txtList){
						   /**
						    * 将每行记录解析
						    * 插入黑名单表(oracle/hbase)
						    */
						   saveGreyByGreyFile(parseGreyLine(txtLine));
					   }
					   FileUtil.moveSrcFile(greyList[i], bakDesDri);
				   }
			   }else  if(FileUtil.getFileName(fileName).contains("_delete_")){
				   if(!CommonUtils.objectIsNull(txtList)){
					   for(String txtLine:txtList){
						   /**
						    * 将每行记录解析
						    * 删除黑名单表(oracle/hbase)
						    */
						   removeGrepByGreyFile(parseGreyLine(txtLine));
					   }
					   FileUtil.moveSrcFile(greyList[i], bakDesDri);
				   }
			   }else{
				   continue;
			   }
		   }
		}
	}

	/** 
	* @date: 2016-10-31 
	* @author: xiongxq
	* @Title: queryDifferentNetPhonePoolList 
	* @param inParam
	* @param queryFilter
	* @param sortParamer
	* @return
	* @throws StrategyError 
	*@exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public List<Map<String, Object>> queryDifferentNetPhonePoolList(
			Map<String, Object> inParam, IQueryFilter queryFilter,
			ISortParamer sortParamer) throws StrategyError {
		List<Map<String,Object>> outList = userSelector.selectDifferentNetPhonePoolList(inParam, queryFilter);
		return outList;
	}

	/** 
	 * 查询灰名单列表
	* @date: 2016-10-17 
	* @author: xiongxq
	* @Title: queryGreyList 
	* @param inParam
	* @param queryFilter
	* @param sortParamer
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public List<Map<String, Object>> queryGreyList(Map<String, Object> inParam,
			IQueryFilter queryFilter, ISortParamer sortParamer)
			throws StrategyError {
		List<Map<String,Object>> GreyList = userSelector.selectGreyList(inParam, queryFilter);
		return GreyList;
	}
	
	/**
	 * 查询用户标签列表
	* @date: 2016-10-19 
	* @author: tangaq
	* @title: queryUserLabelList 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String,Object>> queryUserLabelList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		List<Map<String,Object>> userLabelList = new ArrayList<Map<String,Object>>();
		String queryLabelArchivesFlag = (String) inParam.get("queryLabelArchivesFlag");
		if (CommonUtils.objectIsNull(queryLabelArchivesFlag)) {
			userLabelList = userSelector.selectUserLabelList(inParam, queryFilter);
		}else{
			userLabelList = userSelector.selectUserLabelForPage(inParam,queryFilter);
		}
		
		return userLabelList;
	}
	
	/**
	 * 
	* @date: 2017-2-9 
	* @author: sunliang 
	* @title: queryUserNo 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> queryUserNo(Map<String, Object> inParam)
			throws StrategyError {
		List<Map<String,Object>> userNoList = new ArrayList<Map<String,Object>>();
		String numType = (String)inParam.get("numType");
		String numValue = (String)inParam.get("numValue");
		
		log.debug("queryUserNo.numType", (String)inParam.get("numType"));
		log.debug("queryUserNo.numValue", (String)inParam.get("numValue"));
		
		String idNoStr = userSelector.selectIdNoByServiceNo(numValue+numType);
		if (CommonUtils.objectIsNull(idNoStr)) {
			return userNoList;
		}
		

		String[] idNoStrs = idNoStr.split(Const.SEPARATOR_COMMA);
		for(String idNo : idNoStrs){
			Map<String,Object> userNo = new HashMap<String,Object>();
			if(Const.NUM_TYPE_PHONE_NO.equals(numType)){
				userNo.put("phoneNo", numValue);
				userNo.put("idNo", idNo);
			}else{
				userNo.put("idNo", idNo);
			}
			userNoList.add(userNo);
		}
		return userNoList;
	}
	
	/**
	 * 
	* @date: 2017-2-13 
	* @author: wuJiaFu
	* @title: queryUserIdNoByServiceNbr 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> queryUserIdNoByServiceNbr(
			Map<String, Object> inParam)
			throws StrategyError {
		return queryUserListByGreyCondition(inParam);
	}

	/**
	 * 
	* @date: 2017-2-11 
	* @author: sunliang 
	* @title: queryUserInfoByIdNo 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, String> queryUserInfoByIdNo(Map<String, Object> tempInParam)
			throws StrategyError {
		Map<String,String> userInfo = userSelector.selectUserInfoByIdNo(tempInParam);
		return userInfo;
	}
	
	/**
	 * 
	* @date: 2017-2-11 
	* @author: sunliang 
	* @title: queryUserLabelByIdNo 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, String> queryUserLabelByIdNo(Map<String, Object> tempInParam)
			throws StrategyError {
		Map<String,String> userLabel = userSelector.selectUserLabelByIdNo(tempInParam);
		return userLabel;
	}
		
	/**
>>>>>>> .r8573
	 * 删除灰名单 
	* @date: 2016-10-17 
	* @author: xiongxq
	* @Title: removeGrey 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void removeGrey(Map<String, Object> inParam) throws StrategyError {
		userDeleter.deleteGrey(inParam);
	}
	
	/**
	 * 通过黑名单文件删除黑名单记录(oracle/hbase)
	* @date: 2016-12-6 
	* @author: zhangjj_crmpd
	* @title: removeGrepByGreyFile 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeGrepByGreyFile(Map<String, Object> inParam)
			throws StrategyError {
		log.info("removeGrepByGreyFile inParam", inParam);
		Map<String, Object> greyCamelInparam = greyPacketAssemblyCamel(inParam);
		List<Map<String, Object>> userList = queryUserListByGreyCondition(inParam);
		if(CommonUtils.objectIsNull(userList)){
			return;
		}
		for(Map<String,Object> userMap : userList){
			String idNo = CommonUtils.toString(userMap.get("idNo"));
			String channelId = CommonUtils.toString(greyCamelInparam.get("channelId"));
			if(!CommonUtils.objectIsNull(idNo) && !CommonUtils.objectIsNull(channelId)){
				greyCamelInparam.put("idNo", idNo);
				userDeleter.deleteGrey(greyCamelInparam);
				userDeleter.deleteGreyFromNoSql(greyCamelInparam);
			}
		}
	}
	
	/**
	 * 通过黑名单文件入黑名单表(oracle/hbase)
	* @date: 2016-12-6 
	* @author: zhangjj_crmpd
	* @title: saveGreyByGreyFile 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void saveGreyByGreyFile(Map<String, Object> inParam) throws StrategyError {
		log.info("saveGreyByGreyFile inParam", inParam);
		Map<String, Object> greyCamelInparam = greyPacketAssemblyCamel(inParam);
		log.info("greyPacketAssemblyCamel out", greyCamelInparam);
		Map<String, Object> removeInparam = new HashMap<String, Object>();
		Map<String, String> greyUnderlineInparam = greyPacketAssemblyUnderline(inParam);
		List<Map<String, Object>> userList = queryUserListByGreyCondition(inParam);
		if(CommonUtils.objectIsNull(userList)){
			return;
		}
		log.info("userList:", userList);
		for(Map<String,Object> userMap : userList){
			String idNo = CommonUtils.toString(userMap.get("idNo").toString());
			String channelId = CommonUtils.toString(greyCamelInparam.get("channelId"));
			if(!CommonUtils.objectIsNull(idNo) && !CommonUtils.objectIsNull(channelId)){
				String serialId =  SequenceUtil.getSequence();
				greyCamelInparam.put("idNo", idNo);
				greyCamelInparam.put("serialId", serialId);
				greyUnderlineInparam.put("ID_NO", idNo);
				greyUnderlineInparam.put("SERIAL_ID", serialId);
				removeInparam.put("idNo", idNo);
				removeInparam.put("channelId", channelId);
				userDeleter.deleteGrey(removeInparam);
				log.info("greyCamelInparam insert before", greyCamelInparam);
				userInsertor.insertSingleGrey(greyCamelInparam);
				userInsertor.insertGreyInfo2NoSql(greyCamelInparam, greyUnderlineInparam);
			}
		}
	}

	/**
	 * 修改灰名单 
	* @date: 2016-10-17 
	* @author: xiongxq
	* @Title: updateGrey 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void updateGrey(Map<String, Object> inParam) throws StrategyError {
		userUpdater.updateGrey(inParam);
	}
	
	/**
	 * 灰名单报文拼接成驼峰格式
	* @date: 2016-12-6 
	* @author: zhangjj_crmpd
	* @title: greyPacketAssemblyCamel 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> greyPacketAssemblyCamel(Map<String, Object> inParam) {
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("channelId", CommonUtils.toString(inParam.get("CHANNEL_ID")));
		outMap.put("phoneNo", CommonUtils.toString(inParam.get("NUM_VALUE")));
		outMap.put("regionCode", CommonUtils.toString(inParam.get("LATN_ID")));
		outMap.put("blackType", CommonUtils.toString(inParam.get("GREY_TYPE")));
		outMap.put("startDate", CommonUtils.toString(inParam.get("START_DATE")));
		outMap.put("endDate", CommonUtils.toString(inParam.get("END_DATE")));
		outMap.put("fromTel", CommonUtils.toString(inParam.get("FROM_TEL")));
		log.info("greyPacketAssemblyCamel:", outMap);
		return outMap;
	}
	
	/**
	 * 灰名单报文拼接成下划线格式
	* @date: 2016-12-6 
	* @author: zhangjj_crmpd
	* @title: greyPacketAssemblyUnderline 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, String> greyPacketAssemblyUnderline(
			Map<String, Object> inParam) {
		Map<String,String> outMap = new HashMap<String,String>();
		outMap.put("CHANNEL_ID", CommonUtils.toString(inParam.get("CHANNEL_ID")));
		outMap.put("PHONE_NO", CommonUtils.toString(inParam.get("NUM_VALUE")));
		outMap.put("REGION_CODE", CommonUtils.toString(inParam.get("LATN_ID")));
		outMap.put("BLACK_TYPE", CommonUtils.toString(inParam.get("GREY_TYPE")));
		outMap.put("START_DATE", CommonUtils.toString(inParam.get("START_DATE")));
		outMap.put("END_DATE", CommonUtils.toString(inParam.get("END_DATE")));
		outMap.put("FROM_TEL", CommonUtils.toString(inParam.get("FROM_TEL")));
		return outMap;
	}
	
	/**
	 * 解析黑名单每行内容
	* @date: 2017-1-18 
	* @author: zhangjj_crmpd
	* @title: parseGreyLine 
	* @param txtLine
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> parseGreyLine(String txtLine) {
		log.info("parseGreyLine txtLine:", txtLine);
		Map<String,Object> greyMap = new HashMap<String, Object>();
		if(CommonUtils.objectIsNull(txtLine)){
			return greyMap;
		}
		String[] group = txtLine.split("\\$");
		for(int i=0;i<group.length;i++){
			log.debug("group[i]", group[i]);
			if(group[i].split("\\^").length>=2){
				greyMap.put(group[i].split("\\^")[0],group[i].split("\\^")[1]);
			}
		}
		return greyMap;
	}
	
	/**
	 * 根据黑名单文件条件查询用户表
	* @date: 2016-12-6 
	* @author: zhangjj_crmpd
	* @title: queryUserListByGreyCondition 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> queryUserListByGreyCondition(Map<String, Object> inParam){
		QueryFilter queryFilter = new QueryFilter();
		String numType=  CommonUtils.toString(inParam.get("NUM_TYPE"));
		String numValue = CommonUtils.toString(inParam.get("NUM_VALUE"));
		String regionCode = CommonUtils.toString(inParam.get("LATN_ID"));
		//根据NUM_TYPE,查找ID_NO
		if("1".equals(numType)){
			queryFilter.setPrdInstId(numValue);
		}else if("2".equals(numType)){
			queryFilter.setServiceNbr(numValue);
		}else if("3".equals(numType)){
			queryFilter.setUserAccount(numValue);
		}
		queryFilter.setRegionCode(regionCode);
		return userSelector.selectUserInfoList(inParam, queryFilter);//根据各种类型号码查询Id_no
	}

}
