package com.sitech.strategy.process.service.ws.impl;

import com.sitech.strategy.process.entity.inter.IQuestionNaireProcessEntity;
import com.sitech.strategy.process.entity.param.inter.IQuestionNaireProcessParam;
import com.sitech.strategy.process.service.ws.inter.IQuestionNaireProcessService;
import java.util.HashMap;
import java.util.Map;
import org.dom4j.Document;
import org.dom4j.Element;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.utils.WSUtil;
/**
 * 营销中心客服问卷调查同步接口
* @date: 2016年12月12日 
* @author: zhangqia
* @Title: QuestionNaireService 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public class QuestionNaireProcessService implements IQuestionNaireProcessService {
	/**
	 * 调查问卷实体
	 */
	protected IQuestionNaireProcessEntity questionNaireProcessEntity;
	
	protected IQuestionNaireProcessParam questionNaireProcessParam;
	

	/**
	 * 
	* @date: 2016-12-12 
	* @author: zhangqia 
	* @title: setQuestionNaireProcessEntity 
	* @param  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	
	public void setQuestionNaireProcessEntity(
			IQuestionNaireProcessEntity questionNaireProcessEntity) {
		this.questionNaireProcessEntity = questionNaireProcessEntity;
	}
	/**
	 * 
	* @date: 2016-12-12 
	* @author: zhangqia 
	* @title: setQuestionNaireProcessParam 
	* @param  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	
	public void setQuestionNaireProcessParam(
			IQuestionNaireProcessParam questionNaireProcessParam) {
		this.questionNaireProcessParam = questionNaireProcessParam;
	}
	/**
	 * 客服系统问卷调查同步接口
	* @date: 2016-12-12 
	* @author: zhangqia
	* @Title: questionNaire 
	* @param xml
	* @throws  
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String questionNaire(String xmlStr){
		Document doc=WSUtil.parseToDocument(xmlStr);
		if(doc==null){
			return WSUtil.parameter_Illegal;
		}
		try{
			Map<String,Object> inParam = new HashMap<String,Object>();
			//获取Root节点
			Element rootNode=doc.getRootElement();
			//解析请求转为MAP
			inParam=questionNaireProcessParam.parseQuestionNarie(rootNode);
			//设置过滤条件
			QueryFilter queryFilter =new QueryFilter();
			String question_id=(String) inParam.get("questionId");
			queryFilter.setQuestionId(question_id);
			//查询问卷ID 存在则更新数据 不存在则插入数据
			Map<String,Object> map =questionNaireProcessEntity.queryQuestionNaire(inParam, queryFilter);
			if(map!=null){
				questionNaireProcessEntity.updateQuestionNaire(inParam);
			}else{
				questionNaireProcessEntity.insertQuestionNaire(inParam);
			}
			return WSUtil.return_success;
		}catch(Exception e){
			return WSUtil.return_failure;
		}
		
	}
}