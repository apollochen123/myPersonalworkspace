package com.sitech.strategy.common.utils;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * 序列号工具类
* @date: 2016-9-9 
* @author: sunliang 
* @title: SequenceUtil 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class SequenceUtil {
	
	/**
	 * 配置文件名称
	 */
	private static final String fileName = "sequence.properties";
	/**
	 * ijdbc配置文件
	 */
	private static final String ijdbc = "ijdbc.properties";
	/**
	 * 默认队列长度
	 */
	private static final long length = Long.parseLong( PropertiesUtil.getProperty(fileName, "length").trim());
	/**
	 * 初始值序列
	 */
	private static final long init = Long.parseLong( PropertiesUtil.getProperty(fileName, "init").trim());
	/**
	 * 机器标识
	 */
	private static final String cip =PropertiesUtil.getProperty(ijdbc, "server_id") != null ? PropertiesUtil.getProperty(ijdbc, "server_id") : PropertiesUtil.getProperty(fileName, "server_id");
	/**
	 * 时间格式，yyyyMMddHHmmss
	 */
	private static SimpleDateFormat simpleDateFormat=new SimpleDateFormat(DateUtil.TIME_FROMAT_SIMPLE3);
	/**
	 * 序列号队列
	 */
	private static List<String> list = Collections.synchronizedList(new LinkedList());
	
	/**
	 * 初始化队列
	 */
	static{
		addSize();
	}
	
	/**
	 * 取序列
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getSequence 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public synchronized static String getSequence(){
		if(list.size()<1){
			addSize();
		}
		String seq = simpleDateFormat.format(new Date())+list.remove(0);
		return seq;
	}
	
	/**
	 * 初始化队列方法
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: addSize  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	private static void addSize(){
		System.out.println("cip=" + cip);
		for(long i = init; i<=length; i++){
			list.add(cip+""+i);
		}
		System.out.println("list=" + list.get(0));
	}
	
	/**
	 * 多线程序列测试
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: MyThread 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	private static class MyThread extends Thread{
		
		/**
		 * 多线程测试
		* @date: 2016-9-12 
		* @author: sunliang 
		* @title: run  
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void run() {
			for(int i = 0;i<50000;i++){
				SequenceUtil.getSequence();
			}
			System.out.println(this.getId()+":结束 剩余序列个数："+list.size());
		}
		
		/**
		 * 测试主方法
		* @date: 2016-9-12 
		* @author: sunliang 
		* @title: main 
		* @param args 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public static void main(String[] args) {
			MyThread t1 = new MyThread();
			t1.start();
			MyThread t2 = new MyThread();
			t2.start();
			MyThread t3 = new MyThread();
			t3.start();
			MyThread t4 = new MyThread();
			t4.start();
			MyThread t5 = new MyThread();
			t5.start();
			MyThread t6 = new MyThread();
			t6.start();
			MyThread t7 = new MyThread();
			t7.start();
			MyThread t8 = new MyThread();
			t8.start();
			MyThread t9 = new MyThread();
			t9.start();
			MyThread t10 = new MyThread();
			t10.start();
			
			System.out.println("SequenceUtil.getSequ()=" + SequenceUtil.getSequence());
		}
	}
}
