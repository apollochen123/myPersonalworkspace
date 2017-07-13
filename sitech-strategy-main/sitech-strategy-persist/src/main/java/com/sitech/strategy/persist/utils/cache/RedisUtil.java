package com.sitech.strategy.persist.utils.cache;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.BinaryJedisCluster;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisPoolConfig;

import com.sitech.jcfx.dt.MBean;
import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.LogUtil;
import com.sitech.strategy.common.utils.PropertiesUtil;
import com.sitech.strategy.common.utils.SerializeUtil;
import com.sitech.strategy.persist.base.BaseClass;

/**
 * redis工具类
* @date: 2016-9-11 
* @author: sunliang 
* @title: RedisUtil 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class RedisUtil extends BaseClass implements ICache{
	
	private static Const cost;
	private static LogUtil logUtil;
	/**
	 * JedisClusterhe BinaryJedisCluster类似，与JedisCluster差别在于BinaryJedisCluster采用默认的getBytes(),
	 * 以下实现统一采用BinaryJedisCluster
	 */
	private static BinaryJedisCluster binaryJedisCluster;
	/**
	*单例类.在类初始化时，已经自行实例化
	*类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的。
	*/
	private static final RedisUtil INSTANCE = new RedisUtil();

	private RedisUtil() {
		if(INSTANCE == null){
			init();
		}	
	}
	
	private static void init(){
		try{
			//初始化节点信息
			Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
			String hostPort = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_REDIS,"redis.host");
			System.out.println("========hostPort=======" + hostPort);
			String[] split_host = hostPort.split(" "); 
	  		List<String> hostList = new ArrayList(Arrays.asList(split_host));
			for(String string : hostList){
				System.out.println("host and port:" + (string.split(":"))[0] + ":" + (string.split(":"))[1]);
				HostAndPort hostAndPort = new HostAndPort((string.split(":"))[0],Integer.parseInt((string.split(":"))[1]));
				jedisClusterNodes.add(hostAndPort);
			}
			System.out.println("host:" + hostPort);
			
			JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
			jedisPoolConfig.setMaxTotal(Integer.parseInt(PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_REDIS, "redis.pool.maxTotal")));
			jedisPoolConfig.setMaxIdle(Integer.parseInt(PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_REDIS, "redis.pool.maxIdle")));
			jedisPoolConfig.setMinIdle(Integer.parseInt(PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_REDIS, "redis.pool.minTotal")));
			jedisPoolConfig.setTimeBetweenEvictionRunsMillis(Long.parseLong(PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_REDIS, "redis.pool.timeBetweenEvictionRunsMillis")));
			jedisPoolConfig.setMinEvictableIdleTimeMillis(Long.parseLong(PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_REDIS, "redis.pool.minEvictableIdleTimeMillis")));
			jedisPoolConfig.setTestOnBorrow(Boolean.parseBoolean(PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_REDIS, "redis.pool.testOnBorrow")));
			
//			binaryJedisCluster = new BinaryJedisCluster(jedisClusterNodes, 
//					        Integer.parseInt(PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_REDIS, "redis.timeout")), 
//					        Integer.parseInt(PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_REDIS, "redis.timeout")),
//							Integer.parseInt(PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_REDIS,"redis.pool.maxRedirections")),
//							PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_REDIS, "redis.pass"),
//							jedisPoolConfig);
			binaryJedisCluster = new BinaryJedisCluster(jedisClusterNodes, 
	        Integer.parseInt(PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_REDIS, "redis.timeout")), 
	        Integer.parseInt(PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_REDIS, "redis.timeout")),
			Integer.parseInt(PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_REDIS,"redis.pool.maxRedirections")),
			jedisPoolConfig);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取redis的单实例
	* @date: 2016-9-12 
	* @author: yangwl
	* @title: getInstance 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static RedisUtil getInstance() {  
        return INSTANCE;
    }
	
	/**
	 * string  key-value 插入redis 
	* @date: 2016-9-12 
	* @author: yangwl
	* @title: set 
	* @param key
	* @param value 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void	add(String key,	Object value) {	
		binaryJedisCluster.set(key.getBytes(), SerializeUtil.serialize(value));	
	} 

	
	/**
	 * string  key-value key过期时间 插入redis 
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
	@Override
	public void	add(String key,	Object value, int milliseconds)	{
		binaryJedisCluster.setex(key.getBytes(), milliseconds, SerializeUtil.serialize(value));
	}
	
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
	@Override
	public void	add(String key,	Object value, String type, String direction) {
		//String 保存到redis
		if(cost.CACHE_RESTORE_TYPE_STRING.equals(type)){
			binaryJedisCluster.set(key.getBytes(), SerializeUtil.serialize(value));	
		}
		
		//List 保存到redis
		if(cost.CACHE_RESTORE_TYPE_LIST .equals(type)){
			if(cost.CACHE_RESTORE_DIRECTION_RIGHT.equals(direction)){
				if(value instanceof List){
					this.rPush(key, (List)value);
				}else{
					this.rPush(key, value);
				}
			}else{
				if(value instanceof List){
					this.lPush(key, (List)value);
				}else{
					this.lPush(key, value);
				}
			}
		}
	}
	
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
	@Override
	public void	add(String key,	Object member,  Double score) {
		binaryJedisCluster.zadd(key.getBytes(), score, SerializeUtil.serialize(member));
	}
	
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
	@Override
	public void	add(String key,	Object member,  Double score, int milliseconds) {
		binaryJedisCluster.zadd(key.getBytes(), score, SerializeUtil.serialize(member));
		binaryJedisCluster.expire(key.getBytes(), milliseconds);
	}
	
	/**
	 * key-value 插入不同类型(list, string) 增加key的过期时间设置
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
	@Override
	public void	add(String key,	Object value, String type, String direction, int milliseconds) {
		//String 保存到redis
		if(cost.CACHE_RESTORE_TYPE_STRING.equals(type)){
			binaryJedisCluster.setex(key.getBytes(), milliseconds, SerializeUtil.serialize(value));
		}
		
		//List 保存到redis
		if(cost.CACHE_RESTORE_TYPE_LIST.equals(type)){
			if(cost.CACHE_RESTORE_DIRECTION_RIGHT.equals(direction)){
				if(value instanceof List){
					this.rPush(key, (List)value);
				}else{
					this.rPush(key, value);
				}
			}else{
				if(value instanceof List){
					this.rPush(key, (List)value);
				}else{
					this.rPush(key, value);
				}
			}
			binaryJedisCluster.expire(key.getBytes(), milliseconds);
		}
	}
	
	/**
	 * String  根据key从redis取value
	* @date: 2016-9-12 
	* @author: yangwl
	* @title: get 
	* @param key
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Object get(String key) {
		byte[] result=binaryJedisCluster.get(key.getBytes());
		if(null==result){
			return null;
		}else{
			Object str = SerializeUtil.unserialize(result);	
			return str;
		}
		
	}
	
	public String getIncrease(String key){
		String s = null;
		byte[] result=binaryJedisCluster.get(key.getBytes());
		
		if(null!=result){
			try {
				s = new String(result, "UTF-8");
			} catch (UnsupportedEncodingException e) {	
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return s;
	}

	/**
	 * String 根据批量的keys获取批量的values
	* @date: 2016-9-12 
	* @author: yangwl
	* @title: get 
	* @param keys
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getAll(String[]	keys) {	
		Map<String,	Object>	rmap = null; 
		if(keys!=null){	
			rmap = new HashMap<String, Object>(); 
			for(String key:keys){ 
				rmap.put(key, SerializeUtil.unserialize(binaryJedisCluster.get(key.getBytes()))); 
			} 
		} 
		return rmap; 
	}
	
	/**
     * 查询key对应的长度
    * @date: 2016-10-9 
    * @author: yangwl
    * @title: getAll 
    * @param key
    * @param type
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	@Override
    public long getLen(String key, String type){
		//List
		long keyLen = 0;
		if(cost.CACHE_RESTORE_TYPE_LIST.equals(type)){
			keyLen =  binaryJedisCluster.llen(key.getBytes());
		}
		return keyLen;
	}
	
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
	@Override
	public List getAll(String key, long start, long end, String type) {
		List valueList = new ArrayList();
		if("list".equals(type)){
			List<byte[]> keyList = binaryJedisCluster.lrange(key.getBytes(), start, end);
			for(int i = 0; i < keyList.size(); i++){
				valueList.add(SerializeUtil.unserialize(keyList.get(i)));
			}
		}
		if("zset".equals(type)){
			Set<byte[]> members = binaryJedisCluster.zrange(key.getBytes(), start, end);
			Iterator<byte[]> it	= members.iterator(); 
			while(it.hasNext()){ 
				byte[] member = it.next();
				valueList.add(SerializeUtil.unserialize(member));
			} 
		}
		return valueList;
	}
	
	/**
	 * String 批量插入 keys-values
	* @date: 2016-9-12 
	* @author: yangwl
	* @title: set 
	* @param map 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void	putAll(Map<Object,Object> map)	{ 
		
		if(map==null||map.isEmpty()){ 
			return;	
		} 

		Set<Object>	set	= map.keySet();	
		Iterator<Object> it	= set.iterator(); 
		while(it.hasNext()){ 
			Object key = it.next();
			if(key instanceof String){
				String keyStr = key.toString();
				binaryJedisCluster.set(keyStr.getBytes(), SerializeUtil.serialize(map.get(keyStr))); 
			}	
		} 
	} 

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
	@Override
	public void	putAll(String key, List value, String direction)	{ 
		if(cost.CACHE_RESTORE_DIRECTION_RIGHT.equals(direction)){
			this.rPush(key, value);
		}else{
			this.lPush(key, value);
		}
	}
	
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
	@Override
	public void	putAll(String key, List<Map<Object, Object>> memberScoreList){
		log.debug("=========putAll===key=", key);
		log.debug("=========putAll==memberScoreList==", memberScoreList);
		if(memberScoreList==null || memberScoreList.isEmpty()){ 
			return;	
		}
		for(Map<Object, Object> memberScoreMap:memberScoreList){
			for(Object memberScore:memberScoreMap.keySet()){
				log.debug("memberScoreMap.get(memberScore)------------------", memberScoreMap.get(memberScore));
				log.debug("(Double)memberScoreMap.get(memberScore)------------------", (Double)memberScoreMap.get(memberScore));
				log.debug("SerializeUtil.serialize(memberScore)------------------", SerializeUtil.serialize(memberScore));
				binaryJedisCluster.zadd(key.getBytes(), (Double)memberScoreMap.get(memberScore), SerializeUtil.serialize(memberScore));
			}
		}
	}
	
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
	@Override
	public void increase(String key){
		binaryJedisCluster.incr(key.getBytes());
	}
	
	/**
	 * 自增操作
	* @date: 2016-12-20 
	* @author: sunliang 
	* @title: increaseBy  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void increaseBy(String key,int increase){
		binaryJedisCluster.incrBy(key.getBytes(), increase);
	}
	
	/**
	 * string  key 从redis中移除
	* @date: 2016-9-12 
	* @author: yangwl
	* @title: remove 
	* @param key 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void remove(String key) {
		binaryJedisCluster.del(key.getBytes());
	}

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
	@Override
	public Object remove(String key, String type, String direction ) {
		Object result = "";
		if(Const.CACHE_RESTORE_TYPE_LIST.equals(type)){
			if(Const.CACHE_RESTORE_DIRECTION_RIGHT.equals("direction")){
				result = SerializeUtil.unserialize(binaryJedisCluster.rpop(key.getBytes()));
			}else{
				result = SerializeUtil.unserialize(binaryJedisCluster.lpop(key.getBytes()));
			}
		}
		return result;
	}
	
	/** 
	 * set集合中按照key移除member数据
	* @date: 2016-11-7 
	* @author: songxj
	* @title: remove 
	* @param key
	* @param member
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Object remove(String key, String member){
		Long result = binaryJedisCluster.zrem(key.getBytes(), SerializeUtil.serialize(member));
		return result;
	}
	
	/**
	 * 命令RPOPLPUSH在一个原子时间内，执行以下两个动作：
		将列表source中的最后一个元素(尾元素)弹出，并返回给客户端。
		将source弹出的元素插入到列表destination，作为destination列表的的头元素
	* @date: 2017-4-24 
	* @author: sunliang 
	* @title: rPopLPush 
	* @param srckey
	* @param dstkey
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Object rPopLPush(String srckey,String dstkey) {
		byte[] result = binaryJedisCluster.rpoplpush(srckey.getBytes(), dstkey.getBytes());
		if(null==result){
			return null;
		}else{
			Object str = SerializeUtil.unserialize(result);	
			return str;
		}
	}
	
	/**
	 * 根据参数count的值，移除列表中与参数value相等的元素
	* @date: 2017-4-24 
	* @author: sunliang 
	* @title: lRem 
	* @param key
	* @param count
	* @param value
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public long lRem(String key,long count,Object value){
		long result = binaryJedisCluster.lrem(key.getBytes(), count, SerializeUtil.serialize(value));
		return result;
	}
	
	/**
	 * Redis Cluster 不支持批量删除key
	* @date: 2016-9-12 
	* @author: yangwl
	* @title: removeAll  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
	}

	
	/**
	 *List 单个left插入
	* @date: 2016-9-13 
	* @author: yangwl
	* @title: lPush 
	* @param key
	* @param value 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void lPush(String key, Object value) {
		binaryJedisCluster.lpush(key.getBytes(), SerializeUtil.serialize(value));
		
	}
	
	/**
	 *List 批量left插入
	* @date: 2016-9-13 
	* @author: yangwl
	* @title: lPush 
	* @param key
	* @param value 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void lPush(String key, List value) {
		for(int i = 0; i < value.size(); i++){
			binaryJedisCluster.lpush(key.getBytes(), SerializeUtil.serialize(value.get(i)));
		}
		
	}
	
	/**
	 *List 单个right插入
	* @date: 2016-9-13 
	* @author: yangwl
	* @title: rPush 
	* @param key
	* @param value 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void rPush(String key, Object value) {
		binaryJedisCluster.rpush(key.getBytes(), SerializeUtil.serialize(value));
	}
	
	/**
	 *List 批量right插入
	* @date: 2016-9-13 
	* @author: yangwl
	* @title: rPush 
	* @param key
	* @param value 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void rPush(String key, List value) {
		for(int i = 0; i < value.size(); i++){
			binaryJedisCluster.rpush(key.getBytes(), SerializeUtil.serialize(value.get(i)));
		}
	}
	
	@Override
	public void add(Object key, Object value) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void add(Object key, Object value, int milliseconds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Object key) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Object, Object> getAll(Object[] keys) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 
	* @date: 2016-12-25 
	* @author: sunliang 
	* @title: addWaitSendBatchPushCache  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void addWaitSendBatchPushCache() {
		RedisUtil binaryJedisCluster = RedisUtil.getInstance();
		List<Map<Object, Object>> memberScoreList = new ArrayList<Map<Object,Object>>();
		Map<Object, Object> map = new HashMap<Object,Object>();
		map.put("20161227161749101100206", 0.0);
		memberScoreList.add(map);

		binaryJedisCluster.putAll(Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITSNED,memberScoreList);
		System.out.println("addWaitSendBatchPushCache end");
	}
	
	/**
	 * 
	* @date: 2016-12-25 
	* @author: sunliang 
	* @title: addWaitCreateCallTaskCache  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void addWaitCreateCallTaskCache() {
		RedisUtil binaryJedisCluster = RedisUtil.getInstance();
		List<Map<String,Map<String,String>>> l = new ArrayList<Map<String,Map<String,String>>>();
		Map<String,Map<String,String>> m1 = new HashMap<String,Map<String,String>>();
		
		Map<String,String> u1 = new HashMap<String,String>();
		u1.put(Const.CUSTGROUP_TYPE_LOAD, "RM_CUSTGROUP_20170323210126072101917_DETAIL_INFO");
		
/*		Map<String,String> u2 = new HashMap<String,String>();
		u2.put(Const.CUSTGROUP_TYPE_LABEL, "L001002004 = 2201");*/
		
		m1.put("20170324154048017100002:20170323210126072101917", u1);
		//m1.put("20170318111216069147938:20170317152231069128646", u1);
		//m1.put("20170318113803073146885:20170318113624069149349", u2);
		l.add(m1);

		binaryJedisCluster.putAll(Const.CACHE_DATATYPE_MARKETCASE_CALLTASK_WAITCREATE,l,"");
		System.out.println("addWaitCreateCallTaskCache end");
	}
	
	/**
	 * 
	* @date: 2017-4-14 
	* @author: sunliang
	* @title: addWaitCreateBatchPushMsgCache  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void addWaitCreateBatchPushMsgCache() {
		RedisUtil binaryJedisCluster = RedisUtil.getInstance();
		List<Map<String,Map<String,String>>> l = new ArrayList<Map<String,Map<String,String>>>();
		Map<String,Map<String,String>> m1 = new HashMap<String,Map<String,String>>();
		
		Map<String,String> u1 = new HashMap<String,String>();
		//生产
		//u1.put(Const.CUSTGROUP_TYPE_LOAD, "RM_CUSTGROUP_20170413202508071100315_DETAIL_INFO_HIVE");
		//测试
		u1.put(Const.CUSTGROUP_TYPE_LOAD, "RM_CUSTGROUP_20170315201843101100000_DETAIL_INFO_HIVE");
		
/*		Map<String,String> u2 = new HashMap<String,String>();
		u2.put(Const.CUSTGROUP_TYPE_LABEL, "L001002004 = 2201");*/
		
		//生产
		//m1.put("20170414103456017100048:20170413202508071100315", u1);
		//测试
		m1.put("20170410142450150100090:20170315201843101100000", u1);
		
		//m1.put("20170318111216069147938:20170317152231069128646", u1);
		//m1.put("20170318113803073146885:20170318113624069149349", u2);
		l.add(m1);

		binaryJedisCluster.putAll(Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEMSG,l,"");
		System.out.println("addWaitCreateBatchPushMsgCache end");
	}
	
	public static void insertIncrease(){
		RedisUtil binaryJedisCluster = RedisUtil.getInstance();
		String key = Const.CACHE_DATATYPE_STATISTIC + Const.STATISTIC_TYPE_REALCONTACT_MONTH + Const.SEPARATOR_COLON + "201612" +Const.SEPARATOR_COLON + "551";
		System.out.println("key= " + key);
		binaryJedisCluster.increase(key);
		String key1 = Const.CACHE_DATATYPE_STATISTIC + Const.STATISTIC_TYPE_REALCONTACT_DAY + Const.SEPARATOR_COLON + "20161221" +Const.SEPARATOR_COLON + "551";
		System.out.println("key1= " + key1);
		binaryJedisCluster.increase(key1);
		String key2 = Const.CACHE_DATATYPE_STATISTIC + Const.STATISTIC_TYPE_CHANNELRECOMMEND + Const.SEPARATOR_COLON + "02" + Const.SEPARATOR_COLON + "20161221" +Const.SEPARATOR_COLON + "551";
		System.out.println("key2= " + key2);
		binaryJedisCluster.increase(key2);
		String key3 = Const.CACHE_DATATYPE_STATISTIC + Const.STATISTIC_TYPE_MARKETCASERECOMMEND + Const.SEPARATOR_COLON + "06" + Const.SEPARATOR_COLON + "20161221" +Const.SEPARATOR_COLON + "551";
		System.out.println("key3= " + key3);
		binaryJedisCluster.increase(key3);
	}
	

	
	public static void main(String[] args)  {
		
		//addWaitCreateCallTaskCache();
		//getWaitCreateCallTaskCache();
		
		//addWaitCreateBatchPushMsgCache();
		//geWaitCreateBatchPushMsgCache();
		//geWaitCreateBatchPushProdCache();
		//testRPOPLPUSH();
		
	//getMarketCaseCachePojo();
		//getChannelTriggerMarketCase();
		//getEventTriggerMarketCase();
		//getFeeAndEventCache();
		//getGlobalRuleCache();
		//getWaitCreateCallTaskMarketCase();
		//getWaitCreateBatchPushMsgMarketCase();
		//getWaitCreateBatchPushProdMarketCase();
		//getCustGroupLabelFormula();
		testchenhao();
		//test();
		//testRPOPLPUSH();
		
	}
	
	public static void test(){
		RedisUtil binaryJedisCluster = RedisUtil.getInstance();
		String a = (String) binaryJedisCluster.get("apple");
		System.out.println(a);
	}
	public static void testRPOPLPUSH(){
		RedisUtil binaryJedisCluster = RedisUtil.getInstance();
		String srckey = Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEPROD;
		String dstkey = Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEPROD_TMP;
		
//		Map<String,Map<String,String>> m = (Map<String,Map<String,String>>)binaryJedisCluster.rPopLPush(srckey, dstkey);

		List<Map<String,Object>> srclist = (List<Map<String,Object>>)binaryJedisCluster.getAll(srckey,0,-1,Const.CACHE_RESTORE_TYPE_LIST);
    	List<Map<String,Object>> dstlist = (List<Map<String,Object>>)binaryJedisCluster.getAll(dstkey,0,-1,Const.CACHE_RESTORE_TYPE_LIST);
		
//		Map<String,Map<String,String>> outMap = new HashMap<String,Map<String,String>>();
//		for(String key:m.keySet()){
//			Map<String,String> inMap = new HashMap<String,String>();
//			inMap.putAll(m.get(key));
//			outMap.put(key, inMap);
//		}
		
//    	long a = binaryJedisCluster.lRem(dstkey,0,outMap);
//    	System.out.println("删除了"+a);
//     	System.out.println("m= " + m);
		System.out.println("srclist= " + srclist);
		System.out.println("dstlist= " + dstlist);
	}
	
	public static void testchenhao() {
		RedisUtil binaryJedisCluster = RedisUtil.getInstance();
		String srckey = "{testLpushList}";
		String dstKey = "{testLpushList}tmp";
		//建立一个假list
		List<Map<String,Object>> testList = new ArrayList<Map<String, Object>>();
		for(int i = 0 ; i < 10 ; i++){
			Map<String,Object> testMap = new HashMap<String,Object>();
			Map<String,String> inMap = new HashMap<String,String>();
			inMap.put("in", "1234543243AA");
			testMap.put("a"+i, inMap);
			testList.add(testMap);
		}
		System.out.println(testList);
		binaryJedisCluster.rPush(srckey,testList);
	
//		List<Map<String,Object>> testResultList = (List<Map<String,Object>>)binaryJedisCluster.getAll(srckey, 0, -1, "list");
//		System.out.println("srckey取一个之前"+testResultList);
//		Map<String,Map<String,String>> getOne = (Map<String,Map<String,String>>) binaryJedisCluster.rPopLPush(srckey, dstKey);
//		
//		Map<String,Map<String,String>> outMap = new HashMap<String,Map<String,String>>();
//		for(String key:getOne.keySet()){
//			Map<String,String> inMap = new HashMap<String,String>();
//			inMap.putAll(getOne.get(key));
//			outMap.put(key, inMap);
//		}
//		
//		List<Map<String,Object>> testResultList2 = (List<Map<String,Object>>)binaryJedisCluster.getAll(srckey, 0, -1, "list");
//		List<Map<String,Object>> testResultList3 = (List<Map<String,Object>>)binaryJedisCluster.getAll(dstKey, 0, -1, "list");
//		System.out.println("getOne取得的值，放入了dstKey"+getOne);
//		System.out.println("srckey取一个之后"+testResultList2);
//		System.out.println("dstKey删除之前"+testResultList3);
//		//binaryJedisCluster.lRem(dstKey,0,outMap);
//		List<Map<String,Object>> testResultList4 = (List<Map<String,Object>>)binaryJedisCluster.getAll(dstKey, 0, -1, "list");
//		System.out.println("dstKey删除之后"+testResultList4);
	}
	
	public static void getStr(){
		RedisUtil binaryJedisCluster = RedisUtil.getInstance();
		String key = "rm:statistic:key.to.totalNum:marketCaseRecommend:07:20161221:551";
		String s = (String)binaryJedisCluster.getIncrease(key);
		System.out.println("s= " + s);
	}
	
	public static void getWaitCreateCallTaskCache() {
		RedisUtil binaryJedisCluster = RedisUtil.getInstance();
		Object list = binaryJedisCluster.remove(Const.CACHE_DATATYPE_MARKETCASE_CALLTASK_WAITCREATE,Const.CACHE_RESTORE_TYPE_LIST,"");
		
		System.out.println("==========list===========" + list);
	}
	
	public static void geWaitCreateBatchPushMsgCache() {
		RedisUtil binaryJedisCluster = RedisUtil.getInstance();
		Object list = binaryJedisCluster.remove(Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEMSG,Const.CACHE_RESTORE_TYPE_LIST,"");
		
		System.out.println("==========list===========" + list);
	}
	
	public static void geWaitCreateBatchPushProdCache() {
		RedisUtil binaryJedisCluster = RedisUtil.getInstance();
		Object list = binaryJedisCluster.remove(Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEPROD,Const.CACHE_RESTORE_TYPE_LIST,"");
		
		System.out.println("==========list===========" + list);
	}
	
	public static void getMarketCaseCachePojo(){
		RedisUtil binaryJedisCluster = RedisUtil.getInstance();
		MarketCaseCachePojo marketCaseCachePojo = (MarketCaseCachePojo)binaryJedisCluster.get("rm.marketCaseDetail:marketCaseId.to.marketCaseDetail:20170510164815017100147");
		System.out.println("marketCaseCachePojo.getContentMap()" + marketCaseCachePojo.getContentMap());
		System.out.println("marketCaseCachePojo.getRuleMap()" + marketCaseCachePojo.getRuleMap());
		System.out.println("marketCaseCachePojo.getMarketCaseRel()" + marketCaseCachePojo.getMarketCaseRel());
		System.out.println("marketCaseCachePojo.getMarketCaseMap()" + marketCaseCachePojo.getMarketCaseMap());
		System.out.println("marketCaseCachePojo.getPositionMap()" + marketCaseCachePojo.getPositionMap());
		System.out.println("marketCaseCachePojo.getGlobalRuleMap()" + marketCaseCachePojo.getGlobalRuleMap());
		System.out.println("marketCaseCachePojo.getCustGroupMap()" + marketCaseCachePojo.getCustGroupMap());
	}
	
	public static void getChannelTriggerMarketCase(){
		RedisUtil binaryJedisCluster = RedisUtil.getInstance();
		List<String> list = (List<String>)binaryJedisCluster.getAll("rm:channelTriggerMarketCase:regionCodeAndpositionId.to.marketCaseId:2201:POSITION_01_01",0,-1,Const.CACHE_RESTORE_TYPE_ZSET);
		System.out.println("getChannelTriggerMarketCase" + list.toString());
		
	}
	
	public static void getEventTriggerMarketCase(){
		RedisUtil binaryJedisCluster = RedisUtil.getInstance();
		List<String> list = (List<String>)binaryJedisCluster.getAll("rm:eventTriggerMarketCase:regionCodeAndEventId.to.marketCaseId:2201:10010001001",0,-1,Const.CACHE_RESTORE_TYPE_ZSET);
		System.out.println("getEventTriggerMarketCase" + list.toString());
		
	}
	
	public static void getFeeAndEventCache(){
		RedisUtil binaryJedisCluster = RedisUtil.getInstance();
		List<String> list = (List<String>)binaryJedisCluster.getAll("rm:feeAndEventRel:11",0,-1,Const.CACHE_RESTORE_TYPE_ZSET);
		System.out.println("getFeeAndEventCache" + list.toString());
		
	}
	
	public static void getGlobalRuleCache(){
		RedisUtil binaryJedisCluster = RedisUtil.getInstance();
		Map m = (Map)binaryJedisCluster.get(Const.CACHE_DATATYPE_RULE_GLOBALRULE);
		System.out.println("getGlobalRuleCache" + m.toString());
	}
	
	public static void getWaitCreateCallTaskMarketCase(){
		RedisUtil binaryJedisCluster = RedisUtil.getInstance();
		List<String> list = (List<String>)binaryJedisCluster.getAll("rm:waitCreateCallTaskMarketCase",0,-1,Const.CACHE_RESTORE_TYPE_LIST);
		System.out.println("getWaitCreateCallTaskMarketCase" + list.toString());
	}
	
	public static void getWaitCreateBatchPushMsgMarketCase(){
		RedisUtil binaryJedisCluster = RedisUtil.getInstance();
		List<String> list = (List<String>)binaryJedisCluster.getAll(Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEMSG,0,-1,Const.CACHE_RESTORE_TYPE_LIST);
		System.out.println("getWaitCreateBatchPushMsgMarketCase" + list.toString());
	}
	
	public static void getWaitCreateBatchPushProdMarketCase(){
		RedisUtil binaryJedisCluster = RedisUtil.getInstance();
		List<String> list = (List<String>)binaryJedisCluster.getAll(Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEPROD,0,-1,Const.CACHE_RESTORE_TYPE_LIST);
		System.out.println("getWaitCreateBatchPushProdMarketCase" + list.toString());
	}
	
	public static void getCustGroupLabelFormula(){
		RedisUtil binaryJedisCluster = RedisUtil.getInstance();
		String str = (String)binaryJedisCluster.get("rm:custGroupLabelFormula:custGroupId.to.custGroupLableFormula:" + "20170323210126072101917");
		System.out.println("getCustGroupLabelFormula=" + str);
	}

}
