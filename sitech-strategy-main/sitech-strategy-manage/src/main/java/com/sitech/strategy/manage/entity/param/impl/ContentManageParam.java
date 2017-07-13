package com.sitech.strategy.manage.entity.param.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.IContentManageParam;

/**
 * 内容参数转换
* @date: 2016-9-14 
* @author: fangyuan_crmpd
* @title: ContentManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ContentManageParam implements IContentManageParam{

	/** 
	* @date: 2016-10-18 
	* @author: wangpei
	* @title: queryContentDetailBydetailIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public Map<String, Object> queryContentDetailBydetailIdInParam(InDTO inDTO) {
		Map<String, Object> body = inDTO.getMbean().getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("contentId", body.get("CONTENT_ID"));
		inParam.put("contentDetailId", body.get("CONTENT_DETAIL_ID"));
		return inParam;
	}

	

	/** 
	* @date: 2016-10-18 
	* @author: wangpei
	* @title: queryContentDetailBydetailIdOutParam 
	* @param inMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public StandardOutDTO queryContentDetailBydetailIdOutParam(Map<String, Object> inMap) {
		List<Map<String, Object>> detailList = (List<Map<String, Object>>) inMap.get("params");
		List<Map<String, Object>> params = new ArrayList<Map<String,Object>>();
		if (!CommonUtils.objectIsNull(detailList)) {
			for (Map<String, Object> map : detailList) {
				Map<String, Object> param = new HashMap<String, Object>();
				param.put("CONTENT_PAR_CODE", map.get("contentParCode"));
				param.put("CONTENT_PAR_NAME", map.get("contentParName"));
				param.put("CONTENT_PAR_VALUE", map.get("contentParValue"));
				param.put("CONTENT_PAR_DESC", map.get("contentParDesc"));
				param.put("BATCH_NO", map.get("batchNo"));
				params.add(param);
			}
		}
		StandardOutDTO outDto = new StandardOutDTO();
		MBean bean = new MBean();
		bean.setBody("CONTENT_ID",inMap.get("contentId"));
		bean.setBody("CONTENT_DETAIL_ID",inMap.get("contentDetailId"));
		bean.setBody("PARAMS",params);
		outDto.setBean(bean);
		return outDto;
	}



	/** 
	 * 查询营销用语模板的入参处理
	* @date: 2016-9-15 
	* @author: xiongxq
	* @Title: queryMarketTermTempInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryMarketTermTempInParam(InDTO inDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 *  查询产品列表的入参处理
	* @date: 2016-9-15 
	* @author: xiongxq
	* @Title: queryProdListInParam 
	* @param inDTO
	* @return 
	*@exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryProdListInParam(InDTO inDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * 查询营销用语模板的出参处理
	* @date: 2016-9-15 
	* @author: xiongxq
	* @Title: queryMarketTermTempOutParam 
	* @param inMap
	* @return 
	*@exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO queryMarketTermTempOutParam(Map<String, Object> inMap) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * 查询产品列表的入参处理
	* @date: 2016-9-15 
	* @author: xiongxq
	* @Title: queryProdListOutParam 
	* @param inMap
	* @return 
	*@exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO queryProdListOutParam(Map<String, Object> inMap) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 查询问卷调查入参处理
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: queryQuestionNaireListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryQuestionNaireListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_QUESTION);
		if(CommonUtils.objectIsNull(inMap.get("KEY_WORDS"))){
			outMap.put("keyWords", new ArrayList<String>());
		}else{
			outMap.put("keyWords", (List<String>)inMap.get("KEY_WORDS"));
		}		
		outMap.put("channelType", inMap.get("CHANNEL_TYPE"));
		
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("queryId", inMap.get("QUERY_ID"));
		
		return outMap;
	}
	/**
	 * 查询问卷调查出差处理
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: queryQuestionNaireListOutParam 
	* @param inMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryQuestionNaireListOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		List<Map<String,Object>> questionNaireList = (List<Map<String,Object>>)outParam.get("questionNaireList");
		List<Map<String,Object>> questionNaireNewList = new ArrayList<Map<String,Object>>();
		
		if(CommonUtils.objectIsNull(questionNaireList)==false){
			for(Map<String,Object> auditMap:questionNaireList){
				Map<String,Object> noMap = new HashMap<String,Object>();
			noMap.put("QUESTION_ID", auditMap.get("questionId"));	
			noMap.put("PRODUCT_ID", auditMap.get("productId"));
			noMap.put("PRODUCE_NAME", auditMap.get("produceName"));
			noMap.put("CHANNEL_TYPE", auditMap.get("channelType"));	
			noMap.put("CONTENT", auditMap.get("content"));

			String effTime = (String)auditMap.get("effTime");
			if(effTime !=null && !"".equals(effTime)){
				effTime = DateUtil.stringToString(effTime, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE1);
				noMap.put("EFF_TIME", effTime);
			}else{
				noMap.put("EFF_TIME", "");
			}
			String expTime = (String)auditMap.get("expTime");
			if(expTime !=null && !"".equals(expTime)){
				expTime = DateUtil.stringToString(expTime, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE1);
				noMap.put("EXP_TIME", expTime);
			}else{
				noMap.put("EXP_TIME", "");
			}			
 
			questionNaireNewList.add(noMap);
		  }
		} 
		outMap.put("QUESTIONNAIRE_LIST", questionNaireNewList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		outBean.setBody(outMap);
		
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}	
	/**
	 * 
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: queryQuestionNaireByIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryQuestionNaireByIdInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
 
		//注意:QUESTION_ID是主键，目前是PRODUCT_ID:CHANNEL_TYPE 格式，即是通过冒号分隔符组合
		outMap.put("questionId", inMap.get("QUESTION_ID"));
		
		return outMap;
	}
	/**
	 * 
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: queryQuestionNaireById 
	* @param inMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryQuestionNaireByIdOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		Map<String,Object> questionMap =  outParam;
 
		if(CommonUtils.objectIsNull(questionMap)==false){
 
			outMap.put("PRODUCT_ID", questionMap.get("productId"));
			outMap.put("PRODUCT_NAME", questionMap.get("produceName"));
			outMap.put("CONTENT", questionMap.get("content"));
			outMap.put("PRODUCT_NOTE", questionMap.get("productNote"));
 
			String effTime = (String)questionMap.get("effTime");
			if(effTime !=null && !"".equals(effTime)){
				effTime = DateUtil.stringToString(effTime, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE1);
				outMap.put("EFF_TIME", effTime);
			}else{
				outMap.put("EFF_TIME", "");
			}
			String expTime = (String)questionMap.get("expTime");
			if(expTime !=null && !"".equals(expTime)){
				expTime = DateUtil.stringToString(expTime, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE1);
				outMap.put("EXP_TIME", expTime);
			}else{
				outMap.put("EXP_TIME", "");
			}			
 
		} 
 		outBean.setBody(outMap);
		
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}	
	/** 删除内容及运营位入参处理
	* @date: 2016-10-18 
	* @author: wangpei
	* @title: removeContentAndPositionInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public Map<String, Object> removeContentAndPositionInParam(InDTO inDTO) {
		Map<String, Object> body = inDTO.getMbean().getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("positionId", body.get("POSITION_ID"));
		inParam.put("contentId", body.get("CONTENT_ID"));
		inParam.put("contentDetailId", body.get("CONTENT_DETAIL_ID"));
		return inParam;
	}



	/** 删除内容及运营位出参处理
	* @date: 2016-10-18 
	* @author: wangpei
	* @title: removeContentAndPositionOutParam 
	* @param inMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public StandardOutDTO removeContentAndPositionOutParam() {
		StandardOutDTO outDTO = new StandardOutDTO();
		outDTO.setBean(new MBean());
		return outDTO;
	}



	/** 
	* @date: 2016-10-18 
	* @author: wangpei
	* @title: saveContentInfoByPositionInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public Map<String, Object> saveContentInfoByPositionInParam(InDTO inDTO) {
		Map<String, Object> body = inDTO.getMbean().getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		List<Map<String, Object>> custGroupList = (List<Map<String, Object>>) body.get("CUST_GROUP_LIST");
		Map<String, Object> contentInfo = (Map<String, Object>) body.get("CONTENT_INFO");
		List<Map<String, Object>> addCustGroup = new ArrayList<Map<String,Object>>();
		Map<String, Object> addContentInfo = new HashMap<String, Object>();
		if (!CommonUtils.objectIsNull(custGroupList)) {
			for (Map<String, Object> map : custGroupList) {
				Map<String, Object> custGroup = new HashMap<String, Object>();
				custGroup.put("relId", map.get("REL_ID"));
				custGroup.put("custGroupId", map.get("CUST_GROUP_ID"));
				addCustGroup.add(custGroup);
			}
		}
		inParam.put("custGroupList", addCustGroup);
		
		if (!CommonUtils.objectIsNull(contentInfo)) {
			addContentInfo.put("contentId", contentInfo.get("CONTENT_ID"));
			addContentInfo.put("contentDetailId", contentInfo.get("CONTENT_DETAIL_ID"));
			addContentInfo.put("positionId", contentInfo.get("POSITION_ID"));
			addContentInfo.put("channelId", contentInfo.get("CHANNEL_ID"));
			List<Map<String, Object>> params = (List<Map<String, Object>>) contentInfo.get("PARAMS");
			List<Map<String, Object>> newParams = new ArrayList<Map<String,Object>>();
			if (!CommonUtils.objectIsNull(params)) {
				for (Map<String, Object> map : params) {
					Map<String, Object> param = new HashMap<String, Object>();
					param.put("contentDetailType", map.get("CONTENT_DETAIL_TYPE"));
					param.put("contentParCode", map.get("CONTENT_PAR_CODE"));
					param.put("contentParName", map.get("CONTENT_PAR_NAME"));
					param.put("contentParValue", map.get("CONTENT_PAR_VALUE"));
					param.put("contentParDesc", map.get("CONTENT_PAR_DESC"));
					param.put("batchNo", map.get("BATCH_NO"));
					newParams.add(param);
				}
			}
			addContentInfo.put("params", newParams);
		}
		inParam.put("contentInfo", addContentInfo);
		return inParam;
	}
	
	/**
	 * 事件或渠道下的运营位信息的保存
	* @date: 2017-2-23 
	* @author: zhangyw_crmpd
	* @title: saveContentInfoForEventOrChannelInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveContentInfoForEventOrChannelInParam(InDTO inDTO) {
		Map<String, Object> body = inDTO.getMbean().getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		List<Map<String, Object>> custGroupList = (List<Map<String, Object>>) body.get("CUST_GROUP_LIST");
		Map<String, Object> contentInfo = (Map<String, Object>) body.get("CONTENT_INFO");
		List<Map<String, Object>> addCustGroup = new ArrayList<Map<String,Object>>();
		Map<String, Object> addContentInfo = new HashMap<String, Object>();
		if (!CommonUtils.objectIsNull(custGroupList)) {
			for (Map<String, Object> map : custGroupList) {
				Map<String, Object> custGroup = new HashMap<String, Object>();
				custGroup.put("relId", map.get("REL_ID"));
				custGroup.put("custGroupId", map.get("CUST_GROUP_ID"));
				addCustGroup.add(custGroup);
			}
		}
		inParam.put("custGroupList", addCustGroup);
		
		if (!CommonUtils.objectIsNull(contentInfo)) {
			addContentInfo.put("contentId", contentInfo.get("CONTENT_ID"));
			addContentInfo.put("contentDetailId", contentInfo.get("CONTENT_DETAIL_ID"));
			addContentInfo.put("positionId", contentInfo.get("POSITION_ID"));
			addContentInfo.put("channelId", contentInfo.get("CHANNEL_ID"));
			addContentInfo.put("eventId", contentInfo.get("EVENT_ID"));
			List<Map<String, Object>> params = (List<Map<String, Object>>) contentInfo.get("PARAMS");
			List<Map<String, Object>> newParams = new ArrayList<Map<String,Object>>();
			if (!CommonUtils.objectIsNull(params)) {
				for (Map<String, Object> map : params) {
					Map<String, Object> param = new HashMap<String, Object>();
					param.put("contentDetailType", map.get("CONTENT_DETAIL_TYPE"));
					param.put("contentParCode", map.get("CONTENT_PAR_CODE"));
					param.put("contentParName", map.get("CONTENT_PAR_NAME"));
					param.put("contentParValue", map.get("CONTENT_PAR_VALUE"));
					param.put("contentParDesc", map.get("CONTENT_PAR_DESC"));
					param.put("batchNo", map.get("BATCH_NO"));
					newParams.add(param);
				}
			}
			addContentInfo.put("params", newParams);
		}
		inParam.put("contentInfo", addContentInfo);
		return inParam;
	}

	/** 
	* @date: 2016-10-18 
	* @author: wangpei
	* @title: saveContentInfoByPositionOutParam 
	* @param inMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public StandardOutDTO saveContentInfoByPositionOutParam(Map<String, Object> outMap) {
		MBean outBean = new MBean();
		List<Map<String, Object>> outList = (List<Map<String, Object>>) outMap.get("outList");
		List<Map<String, Object>> newOutList = new ArrayList<Map<String,Object>>();
		if (!CommonUtils.objectIsNull(outList)) {
			for (Map<String, Object> map : outList) {
				Map<String, Object> m = new HashMap<String, Object>();
				m.put("MARKET_CASE_CUST_GROUP_REL_ID", map.get("marketCasecustGroupRelId"));
				m.put("CUST_GROUP_CHANNEL_REL_ID", map.get("custGroupChannelRelId"));
				m.put("CUST_GROUP_ID", map.get("custGroupId"));
				m.put("CHANNEL_ID", map.get("channelId"));
				m.put("EVENT_ID", map.get("eventId"));
				m.put("CONTENT_ID", map.get("contentId"));
				m.put("POSITION_ID", map.get("POSITION_ID"));
				m.put("CONTENT_DETAIL_ID", map.get("contentDetailId"));
				newOutList.add(m);
			}
		}
		outBean.setBody("OUT_LIST",newOutList);
		StandardOutDTO outDTO = new StandardOutDTO();
		outDTO.setBean(outBean);
		return outDTO;
	}

	/**
	 * 保存营销用语模板入参处理
	* @date: 2016-9-15 
	* @author: xiongxq
	* @Title: saveMarketTermTempInParam 
	* @param inDTO
	* @return 
	*@exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> saveMarketTermTempInParam(InDTO inDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 保存营销用语模板出参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: saveMarketTermTempOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveMarketTermTempOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

}
