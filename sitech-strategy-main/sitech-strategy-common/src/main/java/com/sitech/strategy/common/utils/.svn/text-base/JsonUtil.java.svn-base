package com.sitech.strategy.common.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sitech.strategy.common.pojo.impl.IdmmTopicConfig;

/**
 * Create on 2016-11-23
 * @author: wangpei
 * @Title:JsonUtil
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public class JsonUtil {
	/** 从map里面取值
	* @date: 2016-11-28 
	* @author: wangpei
	* @title: getObject 
	* @param map
	* @param path
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public static Object getObject(Map map, String path) {
	    if ((null == path) || ("".equals(path)) || (null == map)) return null;
	    Map subMap = map;
	    String[] keys = path.split("\\.");
	    if (keys.length < 2) return subMap.get(path);
	    int i = 0;
	    for (; i < keys.length - 1; ++i) {
	      if (null == subMap)
	        return null;

	      subMap = (Map) subMap.get(keys[i]);
	    }
	    if (null == subMap) return null;
	    return subMap.get(keys[i]);
	 }
	
	/** 转成json字符串
	* @date: 2016-11-23 
	* @author: wangpei
	* @title: objectToJsonStr 
	* @param o
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public static String objectToJsonStr(Object o){
		if (o == null) {
			return null;
		}
		return JSONObject.toJSONString(o);
	}
	
	/** string转jsonObject
	* @date: 2016-11-23 
	* @author: wangpei
	* @title: stringToJson 
	* @param text
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public static JSONObject stringToJson(String text){
		return JSONObject.parseObject(text);
	}
	
	/**
	 * json字符串转Map
	* @date: 2016-11-26 
	* @author: wangpei 
	* @title: JsonStrToMap 
	* @param json
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static Map<String,Object> JsonStrToMap(String jsonStr){
		Map <String,Object> out = new HashMap<String, Object>();
		if (CommonUtils.objectIsNull(jsonStr)) {
			return out;
		}
		JSONObject object = JSONObject.parseObject(jsonStr);
		for(JSONObject.Entry<String,Object> entry:object.entrySet()){
			String key = entry.getKey();
			Object value = entry.getValue();
			if (value instanceof JSONObject) {
				JSONObject o2 = (JSONObject)value;
				out.put(key,JsonStrToMap(JSONObject.toJSONString(o2)));
			}else if (value instanceof JSONArray) {
				JSONArray arr = (JSONArray)value;
				List<Object> list = new ArrayList<Object>();
				for (Object o3 : arr) {
					list.add(JsonStrToMap(JSONObject.toJSONString(o3)));
				}
				out.put(key, list);
			}else {
				out.put(key, value);
			}
		}
		
		return out;
	}
	

	/**
	 * 配置文件字符串转为对象 List<IdmmTopicConfig>
	* @date: 2017-2-10 
	* @author: chenmy
	* @title: JsonStrToIdmmTopicConfigList 
	* @param reader
	* @param cl
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static List<IdmmTopicConfig> JsonStrToIdmmTopicConfigList(Reader reader, Class cl){
		List<IdmmTopicConfig> list =null;
		BufferedReader br = null;
		StringBuffer sb=null;
		try{
			br = new BufferedReader(reader);
			sb = new StringBuffer();
			String line;
			while((line=br.readLine()) != null){
				sb.append(line);
			}
			System.out.println(sb.toString());
			list = JSON.parseArray(sb.toString(), cl);
		}catch(Exception e ){
			e.printStackTrace();
		}finally{
			try {
				if(br != null){
					br.close();
				}
				if(reader != null){
					reader.close();
				}			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return list;
		}
		 
	}
	
	
	
	public static void main(String[] args) {
//		String json = "{\"ROOT\":{\"BODY\":{\"HEADER\":{\"ROUTING\":{\"ROUTE_KEY\":\"\",\"ROUTE_VALUE\":\"\"}},\"COMMON_INFO\":{\"BUSI_APP_ID\":\"\",\"SYSTEM_ID\":\"SYSTEM_08\"},\"TITLE_TYPE\":\"1002\",\"SQL_ID\":\"\",\"CHANNEL_ID\":\"08\",\"OPER_NO\":\"aaa\",\"OPER_NAME\":\"bbb\",\"REGION_CODE\":\"551\",\"NUM_TYPE\":\"1001\",\"NUM_VALUE\":\"13622332423\",\"METHOD_CODE\":\"\",\"CONTACT_FLAG\":\"\",\"STATUS_CODE\":\"\",\"OPER_TIME\":\"\",\"ACCEPT_CODE\":\"\",\"NOTE\":\"\",\"POSITION_INFO_LIST\":[{\"POSITION_ID\":\"\",\"TASK_ID\":\"\",\"ACT_ID\":\"\"},{\"POSITION_ID\":\"\",\"TASK_ID\":\"\",\"ACT_ID\":\"\"}]}}}";
//		Map<String,Object> m = JsonStrToMap(json);
//		System.out.println("==="+m);
//		System.out.println("===list==="+(List<Map<String,Object>>)getObject(m,"ROOT.BODY.POSITION_INFO_LIST"));
	
		String json = "[{        \"clientID\" : \"Sub129Middle0\",        \"topic\" : \"TSmsMiddleDest0\",        \"userName\" : \"\",        \"password\" : \"\",        \"fluxNum\" : \"40\"     },{        \"clientID\" : \"Sub129Middle1\",        \"topic\" : \"TSmsMiddleDest1\",        \"userName\" : \"\",        \"password\" : \"\",        \"fluxNum\" : \"40\"          },{        \"clientID\" : \"Sub129Middle2\",        \"topic\" : \"TSmsMiddleDest2\",        \"userName\" : \"\",        \"password\" : \"\",        \"fluxNum\" : \"40\"          },{        \"clientID\" : \"Sub129Middle3\",        \"topic\" : \"TSmsMiddleDest3\",        \"userName\" : \"\",        \"password\" : \"\",        \"fluxNum\" : \"40\"          },{        \"clientID\" : \"Sub129Middle4\",        \"topic\" : \"TSmsMiddleDest4\",        \"userName\" : \"\",        \"password\" : \"\",        \"fluxNum\" : \"40\"          },{        \"clientID\" : \"Sub129Middle5\",        \"topic\" : \"TSmsMiddleDest5\",        \"userName\" : \"\",        \"password\" : \"\",        \"fluxNum\" : \"40\"          },{        \"clientID\" : \"Sub129Middle6\",        \"topic\" : \"TSmsMiddleDest6\",        \"userName\" : \"\",        \"password\" : \"\",        \"fluxNum\" : \"40\"          },{        \"clientID\" : \"Sub129Middle7\",        \"topic\" : \"TSmsMiddleDest7\",        \"userName\" : \"\",        \"password\" : \"\",        \"fluxNum\" : \"40\"          },{        \"clientID\" : \"Sub129Middle8\",        \"topic\" : \"TSmsMiddleDest8\",        \"userName\" : \"\",        \"password\" : \"\",        \"fluxNum\" : \"40\"          },{        \"clientID\" : \"Sub129Middle9\",        \"topic\" : \"TSmsMiddleDest9\",        \"userName\" : \"\",        \"password\" : \"\",        \"fluxNum\" : \"40\"          },{        \"clientID\" : \"Sub129Middle0\",        \"topic\" : \"TSmsMiddleDest0\",        \"userName\" : \"\",        \"password\" : \"\",        \"fluxNum\" : \"40\"     },{        \"clientID\" : \"Sub129Middle1\",        \"topic\" : \"TSmsMiddleDest1\",        \"userName\" : \"\",        \"password\" : \"\",        \"fluxNum\" : \"40\"          },{        \"clientID\" : \"Sub129Middle2\",        \"topic\" : \"TSmsMiddleDest2\",        \"userName\" : \"\",        \"password\" : \"\",        \"fluxNum\" : \"40\"          },{        \"clientID\" : \"Sub129Middle3\",        \"topic\" : \"TSmsMiddleDest3\",        \"userName\" : \"\",        \"password\" : \"\",        \"fluxNum\" : \"40\"          },{        \"clientID\" : \"Sub129Middle4\",        \"topic\" : \"TSmsMiddleDest4\",        \"userName\" : \"\",        \"password\" : \"\",        \"fluxNum\" : \"40\"          },{        \"clientID\" : \"Sub129Middle5\",        \"topic\" : \"TSmsMiddleDest5\",        \"userName\" : \"\",        \"password\" : \"\",        \"fluxNum\" : \"40\"          },{        \"clientID\" : \"Sub129Middle6\",        \"topic\" : \"TSmsMiddleDest6\",        \"userName\" : \"\",        \"password\" : \"\",        \"fluxNum\" : \"40\"          },{        \"clientID\" : \"Sub129Middle7\",        \"topic\" : \"TSmsMiddleDest7\",        \"userName\" : \"\",        \"password\" : \"\",        \"fluxNum\" : \"40\"          },{        \"clientID\" : \"Sub129Middle8\",        \"topic\" : \"TSmsMiddleDest8\",        \"userName\" : \"\",        \"password\" : \"\",        \"fluxNum\" : \"40\"          },{        \"clientID\" : \"Sub129Middle9\",        \"topic\" : \"TSmsMiddleDest9\",        \"userName\" : \"\",        \"password\" : \"\",        \"fluxNum\" : \"40\"          }]";
		List<IdmmTopicConfig> list = JSON.parseArray(json, IdmmTopicConfig.class);
		for(int i=0;i<list.size();i++){
			IdmmTopicConfig idmmTopicConfig = (IdmmTopicConfig)list.get(i);
			System.out.print(idmmTopicConfig.getClientID() +"   "+idmmTopicConfig.getTopic());
			System.out.println("");
		}
	
	}
}
