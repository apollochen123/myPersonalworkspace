package com.sitech.strategy.common.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Create on 2016-12-10
 * @author: wangpei
 * @Title:Test
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public class Test {
	public static void main(String[] args) {
		Map<String,String> userLabel = new HashMap<String, String>();
		userLabel.put("SPEED_TARGET", "100");
		userLabel.put("LAN_NUM", "1");
		userLabel.put("WIDE_TER", "1");
		userLabel.put("EXTEND_PAYMETHOD_TYPE", "2");
		userLabel.put("CARRY_MODE", "2");
		userLabel.put("SPEED_ACTUAL", "100");
		userLabel.put("SPEED_ID", "4");
		String label = "SPEED_ACTUAL>SPEED_ID";
		System.out.println(DateUtil.isCurrentInTimePeriod("2016-12-15", "2016-12-17", DateUtil.DATE_FROMAT_YYYYMMDD2));
	}
	
	
protected static boolean filterLabelCustGroup(Map<String,String> userLabel,String label){
		
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		//String[] labelKeys = Const.CUST_GROUP_LABEL_KEYS;
		if (CommonUtils.objectIsNull(userLabel)) {
			return false;
		}
		Set<String> labelKeys = userLabel.keySet();
		for(String labelKey : labelKeys){
			engine.put(labelKey, userLabel.get(labelKey));
		}
		String labelExpr = CommonUtils.convertLabelExprToJsExpr(label);
		try {
			if((Boolean) engine.eval(labelExpr)){
				return true;
			}
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		return false;
	}
}
