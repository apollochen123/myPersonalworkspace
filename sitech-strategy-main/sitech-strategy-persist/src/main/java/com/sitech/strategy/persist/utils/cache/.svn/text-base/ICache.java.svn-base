package com.sitech.strategy.persist.utils.cache;

import java.util.List;
import java.util.Map;

/**
 * 缓存操作接口
* @date: 2016-9-11 
* @author: sunliang 
* @title: ICache 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ICache {
	
	/**
	 * 增加操作
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: add 
	* @param key
	* @param value 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void add(String key, Object value);
	
	/**
	 * 增加操作
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: add 
	* @param key
	* @param value 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void add(Object key, Object value);
    
	/**
	 * 增加操作
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: add 
	* @param key
	* @param value
	* @param milliseconds 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
    public void add(String key, Object value, int milliseconds);
    
    /**
     * 增加操作
    * @date: 2016-9-11 
    * @author: sunliang 
    * @title: add 
    * @param key
    * @param value
    * @param milliseconds 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public void add(Object key, Object value, int milliseconds);
    
    /**
	 * key-value 插入不同类型(list, string)
	* @date: 2016-9-12 
	* @author: yangwl
	* @title: set 
	* @param key
	* @param value
	* @param milliseconds 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void	add(String key,	Object value, String type, String direction);
	
	/**
	 * key-value 插入类型 zset
	* @date: 2016-9-26 
	* @author: yangwl
	* @title: add 
	* @param key
	* @param value
	* @param type
	* @param direction 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void	add(String key,	Object member,  Double score);
	
	/**
	 * key-value 插入类型 zset 增加key的过期时间设置
	* @date: 2016-9-26 
	* @author: yangwl
	* @title: add 
	* @param key
	* @param value
	* @param type
	* @param direction 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void	add(String key,	Object member,  Double score, int milliseconds);
	
	/**
	 * key-value 插入不同类型(list, string)
	* @date: 2016-9-12 
	* @author: yangwl
	* @title: set 
	* @param key
	* @param value
	* @param milliseconds 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void	add(String key,	Object value, String type, String direction, int milliseconds) ;
	

    /**
     * 获取指定key的值
    * @date: 2016-9-11 
    * @author: sunliang 
    * @title: get 
    * @param key
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public Object get(String key);
    
    /**
     * 获取指定key的值
    * @date: 2016-9-11 
    * @author: sunliang 
    * @title: get 
    * @param key
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public Object get(Object key);

    /**
     * 批量获取指定key
    * @date: 2016-9-11 
    * @author: sunliang 
    * @title: getAll 
    * @param keys
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public Map<String,Object> getAll(String[] keys);
    
    /**
	 *  返回列表key中指定区间内的元素，区间以偏移量start和stop指定。
		下标(index)参数start和stop都以0为底，也就是说，以0表示列表的第一个元素，以1表示列表的第二个元素，以此类推。
		你也可以使用负数下标，以-1表示列表的最后一个元素，-2表示列表的倒数第二个元素，以此类推。
	* @date: 2016-9-13 
	* @author: yangwl
	* @title: lRange 
	* @param key
	* @param value
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List getAll(String key, long start, long end, String type) ;
    
    /**
     * 批量获取指定key
    * @date: 2016-9-11 
    * @author: sunliang 
    * @title: getAll 
    * @param keys
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public Map<Object,Object> getAll(Object[] keys);
    
    /**
     * 查询key对应的长度
    * @date: 2016-10-9 
    * @author: yangwl
    * @title: getAll 
    * @param keys
    * @param type
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public long getLen(String key, String type);
    
    /**
     * 自增1
    * @date: 2016-12-20 
    * @author: sunliang 
    * @title: increase 
    * @param key 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public void increase(String key);
    
    /**
     * 自增操作
    * @date: 2016-12-20 
    * @author: sunliang 
    * @title: increaseBy 
    * @param key
    * @param increase 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public void increaseBy(String key,int increase);
    
    /**
     * 
    * @date: 2016-9-11 
    * @author: sunliang 
    * @title: putAll 
    * @param paraMap 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public void putAll(Map<Object,Object> paraMap);
    
    
    /**
	 * List 批量插入 
	* @date: 2016-9-12 
	* @author: yangwl
	* @title: set 
	* @param map 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void	putAll(String key, List value, String direction);
	
	/**
	 * zset批量插入
	* @date: 2016-9-26 
	* @author: yangwl
	* @title: putAll 
	* @param key
	* @param map 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void	putAll(String key, List<Map<Object, Object>> memberScoreList);
    
    /**
     * 删除指定key
    * @date: 2016-9-11 
    * @author: sunliang 
    * @title: remove 
    * @param key 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public void remove(String key);
    
    /**
	 * 按照direction移除list并且返回值
	* @date: 2016-9-30 
	* @author: yangwl
	* @title: remove 
	* @param key
	* @param type
	* @param direction
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Object remove(String key, String type, String direction ) ;
    
    /**
     * 删除指定key
    * @date: 2016-9-11 
    * @author: sunliang 
    * @title: remove 
    * @param key 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public void remove(Object key);
    
    /**
     * 清空所有缓存
    * @date: 2016-9-11 
    * @author: sunliang 
    * @title: removeAll  
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public void removeAll();
}
