package com.sitech.strategy.common.utils;

import java.security.MessageDigest;

/**
 * MD5RowKey生成器
* @date: 2016-11-23 
* @author: sunliang 
* @title: MD5RowKeyGenerator 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class MD5RowKeyGenerator{

	/**
	 * 生成3位随机+rowkey
	* @date: 2016-11-23 
	* @author: sunliang 
	* @title: generate 
	* @param oriRowKey
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static Object generate(String oriRowKey) {
		return generatePrefix(oriRowKey) + oriRowKey;
	}

	/**
	 * MD5加密
	* @date: 2016-11-23 
	* @author: sunliang 
	* @title: getMD5 
	* @param oriRowKey
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static synchronized String getMD5(String oriRowKey) {
		char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'b', 'd', 'e', 'f' };
		try {
			byte[] btInput = oriRowKey.getBytes();

			MessageDigest mdInst = MessageDigest.getInstance("MD5");

			mdInst.update(btInput);

			byte[] md = mdInst.digest();

			int j = md.length;
			char[] str = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; ++i) {
				byte byte0 = md[i];
				str[(k++)] = hexDigits[(byte0 >>> 4 & 0xF)];
				str[(k++)] = hexDigits[(byte0 & 0xF)];
			}
			return new String(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 生产3位随机
	* @date: 2016-11-23 
	* @author: sunliang 
	* @title: generatePrefix 
	* @param oriRowKey
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static Object generatePrefix(String oriRowKey) {
		String retStr = "";
		if(!(CommonUtils.objectIsNull(oriRowKey) || "".equals(oriRowKey))){
			String result = getMD5(oriRowKey);
			retStr = result.substring(1, 2) + result.substring(3, 4) + result.substring(5, 6);
		}
		return retStr;
	}
	
	/**
	 * 测试
	* @date: 2016-11-23 
	* @author: sunliang 
	* @title: main 
	* @param args 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void main(String[] args) {
		MD5RowKeyGenerator generator = new MD5RowKeyGenerator();
		String rowkey = "123123123:12312331323";
		
		System.out.println(generator.getMD5(rowkey));
		System.out.println(generator.generatePrefix(rowkey));
		System.out.println(generator.generate(rowkey));
	}
}