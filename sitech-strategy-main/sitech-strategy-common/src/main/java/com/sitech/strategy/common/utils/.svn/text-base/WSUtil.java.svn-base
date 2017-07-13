package com.sitech.strategy.common.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

/**
 * WebService工具类
* @date: 2016-11-17 
* @author: zhangqia 
* @title: WSUtil 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class WSUtil {
	/**
	 * 请求参数非法返回
	 */
	public static String parameter_Illegal=getException("1","请求参数非法");
	/**
	 * 调用成功返回
	 */
	public static String return_success=getException("0","SUCCESS");
	
	/**
	 * 调用失败返回
	 */
	public static String return_failure=getException("1","FAILURE");
	/**
	 * 无匹配内容返回
	 */
	public static String Record_Not_Exist=getException("2","无匹配内容");
	/**
	 * 其他异常返回
	 */
	public static String other_Exception=getException("99","其他异常");
	/**
	 * 判断String的内容是不是一个合法的XML格式
	* @date: 2016-11-17
	* @author: zhangqia 
	* @title: parseToDocument 
	* @param xmlstr
	* @return Document
	* @exception: DocumentException
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static Document parseToDocument(String xmlstr) { 
        Document document = null;
        try { 
            document =DocumentHelper.parseText(xmlstr); 
        } catch (DocumentException e) { 
           return document=null;
        } 
        return document; 
    }
	/**
	 * 程序异常时返回报文格式
	* @date: 2016-11-17
	* @author: zhangqia 
	* @title: parseToDocument 
	* @param code,desc
	* @return String
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String getException(String code,String desc){
		String exceptionName="<ROOT>"+
						"<RETURN_CODE>"+code+"</RETURN_CODE>"+
						"<RETURN_MSG>"+desc+"</RETURN_MSG>"+
						"</ROOT>";
		return exceptionName;
		
	}
	/**
	 * 策略解析服务获取主报文格式
	* @date: 2016-11-17
	* @author: zhangqia 
	* @title: parseToDocument 
	* @param seq_id,desc
	* @return String
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String getSoapBoby(String seq_id,String num_value,String contents){
		String soapBoby="<ROOT>"+
		        "<RETURN_CODE>0</RETURN_CODE>"+
				"<RETURN_MSG>查询成功</RETURN_MSG>"+
				"<USER_MSG>"+num_value+"</USER_MSG>"+
				"<DETAIL_MSG></DETAIL_MSG>"+
				"<OUT_DATA>"+
					"<SEQ_ID>"+seq_id+"</SEQ_ID>"+
					"<AD_INFOS>"+
						"<AD_INFO>"+contents+"</AD_INFO>"+
					"</AD_INFOS>"+
				"</OUT_DATA>"+
				"</ROOT>";
		        return soapBoby;
	}
	/**
	 * 策略解析服务Content报文
	* @date: 2016-11-17
	* @author: zhangqia 
	* @title: parseToDocument 
	* @param seq_id,desc
	* @return String
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String getSoapContent(String content_par_value,String content_key ){
		String content=
		"<CONTENTS>"+
				"<CONTENT>"+
					"<ORDER_NO>1</ORDER_NO>"+
					"<CONTENT_DETAILS>"+
						"<CONTENT_DETAIL>"+
							"<PARAMS>"+
								"<PARAM>"+
									"<CONTENT_KEY>"+content_key+"</CONTENT_KEY>"+
									"<CONTENT_VALUE>"+content_par_value+"</CONTENT_VALUE>"+
								"</PARAM>"+
							"</PARAMS>"+
						"</CONTENT_DETAIL>"+
					"</CONTENT_DETAILS>"+
				"</CONTENT>"+
			"</CONTENTS>";
		return content;
	}
}
