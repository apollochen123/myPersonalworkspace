package com.sitech.strategy.process.entity.param.impl;

import java.util.HashMap;
import java.util.Map;
import org.dom4j.Element;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.process.base.BaseProcessEntity;
import com.sitech.strategy.process.entity.param.inter.IQuestionNaireProcessParam;

public class QuestionNaireProcessParam extends BaseProcessEntity implements
		IQuestionNaireProcessParam {
	/**
	 * 调查问卷同步服务 请求解析
	* @date: 2016-12-14
	* @author: zhangqia 
	* @title: parseToDocument 
	* @param seq_id,desc
	* @return String
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> parseQuestionNarie(Element rootNode)throws StrategyError {
		Map<String,Object> inParam = new HashMap<String,Object>();
		//获取请求参数值
		String product_id=rootNode.element("PRODUCT_ID").getText();
		String produce_name=rootNode.element("PRODUCE_NAME").getText();
		String channel_type=rootNode.element("CHANNEL_TYPE").getText();
		String content=rootNode.element("CONTENT").getText();
		String status_code=rootNode.element("STATUS_CODE").getText();
		String product_note=rootNode.element("PRODUCT_NOTE").getText();
		String eff_time=rootNode.element("EFF_TIME").getText();
		String exp_time=rootNode.element("EXP_TIME").getText();
		String produce_src=rootNode.element("PRODUCE_SRC").getText();
		//参数存储到Map中
		inParam.put("questionId", product_id+":"+channel_type);
		inParam.put("productId",product_id);
		inParam.put("produceName", produce_name);
		inParam.put("channelType", channel_type);
		inParam.put("content", content);
		inParam.put("statusCode", status_code);
		inParam.put("productNote", product_note);
		inParam.put("effTime", eff_time);
		inParam.put("expTime", exp_time);
		inParam.put("produceSrc", produce_src);
		return inParam;
	}
}
