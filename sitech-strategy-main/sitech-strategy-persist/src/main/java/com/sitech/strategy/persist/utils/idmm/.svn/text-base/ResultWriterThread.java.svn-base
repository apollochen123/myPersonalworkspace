package com.sitech.strategy.persist.utils.idmm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sitech.strategy.common.pojo.impl.IdmmProducerProp;


public class ResultWriterThread extends Thread {
	private static Log log = LogFactory.getLog(ResultWriterThread.class);
	private static Map<String, List<String>> logMap = new HashMap<String, List<String>>();   
	public static final String FILE_SEPERATOR = System.getProperty("file.separator");
	private static SimpleDateFormat deal_sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
	public static String logEncoding = IdmmProducerProp.logEncoding;
	public static String logWritesize = IdmmProducerProp.logWritesize;
	
	static{                                                                                                                                                               
		new ResultWriterThread().start();  
	}                                                                                                                                                                     
	                                                                                                                                                                      
	public void run(){    
		new OutputLogMap().start();  
	}
	
	class OutputLogMap extends Thread{                                                                                                                                  
		public void run(){                                                                                                                                                  
			while(true){                                                                                                                                                      
				if(logMap == null || logMap.size() == 0){                                                                                                                   
					//休眠                                                                                                                                                        
					try {                                                                                                                                                         
						Thread.sleep(5 * 1000);                                                                   
					} catch (Exception e) {                                                                                                                                       
						log.error("结果输出失败",e);                                                                                                                                
					}                                                                                                                                                             
				}else{                                                                                                                                                          
					try{                                                                                                                                                          
						Map<String, List<String>> logTempMap = new HashMap<String, List<String>>();                                                                               
						synchronized(logMap){                                                                                                                                     
							logTempMap.putAll(logMap);                                                                                                                            
							logMap.clear();                                                                                                                                         
						}                                                                                                                                                           
						if(logTempMap == null || logTempMap.size() == 0){                                                                                                       
							continue;                                                                                                                                                 
						}                                                                                                                                                           
						for(String key: logTempMap.keySet()){                                                                                                                     
							List<String> values = logTempMap.get(key);                                                                                                              
							if(values == null || values.size() == 0){                                                                                                                 
								continue;                                                                                                                                               
							}                                                                                                                                                         
							String filePath = key.substring(0, key.lastIndexOf(FILE_SEPERATOR));                                                                            
							File dir = new File(filePath);                                                                                                                            
							if(!dir.exists()){                                                                                                                                        
								dir.mkdirs();                                                                                                                                           
							}                                                                                                                                                         
							filePath = key;                                                                                                                                           
							BufferedWriter bw = null;                                                                                                                                 
							try{                                                                                                                                                      
								bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath, true), logEncoding));                  
								int i = 0;                                                                                                                                              
								while(values.size() > 0){                                                                                                                               
									bw.write(values.get(0));                                                                                                                              
									bw.newLine();                                                                                                                                         
									if( i == Integer.parseInt(logWritesize)){                                                                   
										bw.flush();                                                                                                                                         
										i = 0;                                                                                                                                              
									}                                                                                                                                                     
									i ++;                                                                                                                                                 
									values.remove(0);                                                                                                                                     
								}                                                                                                                                                       
							}catch(Exception e){                                                                                                                                      
								log.error("结果输出失败",e);                                                                                                                            
							}finally{                                                                                                                                                 
								try{                                                                                                                                                    
									if(bw !=null){                                                                                                                                        
										bw.flush();                                                                                                                                         
										bw.close();                                                                                                                                         
									}                                                                                                                                                     
								}catch(Exception e){                                                                                                                                    
									log.error("结果输出失败",e);                                                                                                                          
								}                                                                                                                                                       
							}                                                                                                                                                         
						}                                                                                                                                                           
						Thread.sleep(5 * 1000);                                                                                                                                     
					}catch(Exception e){                                                                                                                                          
						log.error("结果输出失败",e);                                                                                                                                
					}                                                                                                                                                             
				}                                                                                                                                                               
			}                                                                                                                                                                 
		}                                                                                                                                                                   
	}    
	
	/**
	 * 
	* @date: 2017-2-8 
	* @author: chenmy
	* @title: inputProducerLogMap 
	* @param dmmLogVo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* key为日志输出路径 : /路径/日期/文件名
	 */
	public static void inputLogMap(String logDir, DmmLogVo dmmLogVo){                                                                                                                    
		String key = logDir + FILE_SEPERATOR + dmmLogVo.getReqTime().substring(0,8) +
				FILE_SEPERATOR + dmmLogVo.getMethodName() + "_" + dmmLogVo.getTopic() + ".txt";                                                                                 
//		System.out.println("key:"+key);
		synchronized(logMap){                                                                                                                                             
			List<String> list = logMap.get(key);                                                                                                                            
			if(list == null){                                                                                                                                                 
				list = new ArrayList<String>();                                                                                                                                 
				logMap.put(key, list);                                                                                                                                        
			}                                                                                                                                                                 
			list.add(getLogString(dmmLogVo));                                                                                                                          
		}                                                                                                                                                                   
	} 
	
	
	/**
	 * 
	* @date: 2017-2-8 
	* @author: chenmy
	* @title: getLogString 
	* @param dmmLogVo
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 日志格式：请求时间yyyyMMddHHmmssSSS|返回时间yyyyMMddHHmmssSSS|消息id|消息主题|消息内容|手机号码
	 */
	public static String getLogString(DmmLogVo dmmLogVo){
		StringBuffer value = new StringBuffer();
		value.append(dmmLogVo.getReqTime());
		value.append("|");
		value.append(dmmLogVo.getRespTime());
		value.append("|");
		value.append(dmmLogVo.getMsgId());
		value.append("|");
		value.append(dmmLogVo.getTopic());
		value.append("|");
		value.append(dmmLogVo.getMessage());
		value.append("|");
		value.append(dmmLogVo.getPhoneNo());
		return value.toString();
	}
	
	/**
	 * 获取年月日，如：20170102
	* @date: 2017-2-8 
	* @author: chenmy
	* @title: toDateString 
	* @param date
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String toDateString(Date date) {
		if (date == null) {
			return "";
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int month = calendar.get(2) + 1;
		int day = calendar.get(5);
		int year = calendar.get(1);
		String monthStr;
		if (month < 10) {
			monthStr = "0" + month;
		} else {
			monthStr = "" + month;
		}
		String dayStr;
		if (day < 10) {
			dayStr = "0" + day;
		} else {
			dayStr = "" + day;
		}
		String yearStr = "" + year;
		return yearStr + monthStr + dayStr;
	}
	
	 public static boolean isNull(String str) {
	        if(str==null||str.length()==0)
	        return true; else return false;
	 }
	 
	 public static String getDealDateStr(Date date){
			return deal_sdf.format(date);
	 }
}
