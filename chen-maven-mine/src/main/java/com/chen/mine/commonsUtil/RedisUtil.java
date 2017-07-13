package com.chen.mine.commonsUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.chen.mine.commonsConst.Const;
import redis.clients.jedis.BinaryJedisCluster;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtil {
	/**
	 * JedisCluster和 BinaryJedisCluster类似，与JedisCluster差别在于BinaryJedisCluster采用默认的getBytes(),
	 * 以下实现统一采用BinaryJedisCluster
	 */
	private static BinaryJedisCluster binaryJedisCluster;
	/**
	 * 单例类，类初始化时，完成实例化
	 * 类在创建的同时，已经创建好一个对象供外部使用，以后不再改变，所以天生是线程安全的。
	 */
	private static final RedisUtil INSTANCE = new RedisUtil();
	
	private RedisUtil(){
		if(INSTANCE == null){
			init();
		}
	}
	public static RedisUtil getInstence(){
		return INSTANCE;
	}
	/**
	 * 初始化binaryJedisCluster
	* @date: 2017年5月19日 
	* @author: chenhao
	* @title: init  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void init(){
		//初始化节点信息
		System.out.println("===========start to get hostAndPort==========");
		Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
		String hostPort = PropertiesUtil.getProperty(Const.REDIS_CONFIG_PROPERTIES, "redis.host");
		String[] spiltHost = hostPort.split(" ");
		for(String one:spiltHost){
			System.out.println("host and port:"+one);
			String[] oneHostAndPort = one.split(":");
			String host = oneHostAndPort[0];
			int port = Integer.parseInt(oneHostAndPort[1]); 
			HostAndPort hostAndPort = new HostAndPort(host,port);
			jedisClusterNodes.add(hostAndPort);	
		}
		//设置Jedis连接池信息
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		jedisPoolConfig.setMaxTotal(Integer.parseInt(PropertiesUtil.getProperty(Const.REDIS_CONFIG_PROPERTIES, "redis.pool.maxTotal")));
		jedisPoolConfig.setMaxTotal(Integer.parseInt(PropertiesUtil.getProperty(Const.REDIS_CONFIG_PROPERTIES, "redis.pool.maxTotal")));
		jedisPoolConfig.setMaxIdle(Integer.parseInt(PropertiesUtil.getProperty(Const.REDIS_CONFIG_PROPERTIES, "redis.pool.maxIdle")));
		jedisPoolConfig.setMinIdle(Integer.parseInt(PropertiesUtil.getProperty(Const.REDIS_CONFIG_PROPERTIES, "redis.pool.minTotal")));
		jedisPoolConfig.setTimeBetweenEvictionRunsMillis(Long.parseLong(PropertiesUtil.getProperty(Const.REDIS_CONFIG_PROPERTIES, "redis.pool.timeBetweenEvictionRunsMillis")));
		jedisPoolConfig.setMinEvictableIdleTimeMillis(Long.parseLong(PropertiesUtil.getProperty(Const.REDIS_CONFIG_PROPERTIES, "redis.pool.minEvictableIdleTimeMillis")));
		jedisPoolConfig.setTestOnBorrow(Boolean.parseBoolean(PropertiesUtil.getProperty(Const.REDIS_CONFIG_PROPERTIES, "redis.pool.testOnBorrow")));
		
		//初始化binaryJedisCluster
		binaryJedisCluster = new BinaryJedisCluster(jedisClusterNodes, 
		        Integer.parseInt(PropertiesUtil.getProperty(Const.REDIS_CONFIG_PROPERTIES, "redis.timeout")), 
		        Integer.parseInt(PropertiesUtil.getProperty(Const.REDIS_CONFIG_PROPERTIES, "redis.timeout")),
				Integer.parseInt(PropertiesUtil.getProperty(Const.REDIS_CONFIG_PROPERTIES,"redis.pool.maxRedirections")),
				jedisPoolConfig);
		System.out.println("=========binaryJedisCluster start========================");
	}
	
	/**
	 * 设置key过期时间
	* @date: 2017年5月19日 
	* @author: chenhao
	* @title: keyTimeOut 
	* @param key
	* @param seconds
	* @return 设置成功返回1 ，key不存在或者不能为 key设置过期时间时返回 0 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public long keyTimeOut(String key,int seconds){
	    return binaryJedisCluster.expire(key.getBytes(), seconds);
	}
	
	/**
	 * 以时间戳设置过期时间
	* @date: 2017年5月19日 
	* @author: chenhao
	* @title: keyTimeOutByMilliseconds 
	* @param key
	* @param milliseconds
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public long keyTimeOutByMilliseconds(String key,long unixTime){
		return binaryJedisCluster.expireAt(key.getBytes(), unixTime);
	}
	
	/**
	 * 取得key的过期时间
	* @date: 2017年5月19日 
	* @author: chenhao
	* @title: getTimeOfKey 
	* @param key
	* @return 距离过期还有多少秒
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public long getTimeOfKey(String key){	
		return binaryJedisCluster.ttl(key.getBytes());
	}

	/**
	 * 移除key的过期时间
	* @date: 2017年5月19日 
	* @author: chenhao
	* @title: rmKeyTimeOut 
	* @param key
	* @return 过期时间移除成功返回 1，key 不存在或 key 没有设置过期时间，返回 0
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public long rmKeyTimeOut(String key){
		return binaryJedisCluster.persist(key.getBytes());
	}
	
	
	/**
	 * 判断key是否存在
	* @date: 2017年5月19日 
	* @author: chenhao
	* @title: existsKey 
	* @param key
	* @return 设置成功返回1 ，key不存在或者不能为 key设置过期时间时返回 0 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public boolean existsKey(String key){
		return binaryJedisCluster.exists(key.getBytes());
	}
	
	/**
	 * 仅当 newkey不存在时,将 key改名为 newkey.
	* @date: 2017年5月19日 
	* @author: chenhao
	* @title: renameKey 
	* @param key
	* @param newKey
	* @return  修改成功时,返回 1
	* @exception: 
	* @version: 1.0 
	* @description: key和newKey需要在一个slot上，如name，{name}new，以括号内内容hash
	*               否则会引起CROSSSLOT Keys in request don't hash to the same slot
	* update_version: update_date: update_author: update_note:
	 */
	public long renameKey(String key,String newKey){
		 return binaryJedisCluster.renamenx(key.getBytes(), newKey.getBytes());
	}
	
	/**
	 * 删除key
	* @date: 2017年5月19日 
	* @author: chenhao
	* @title: delKey 
	* @param key
	* @return 返回删除key的数量
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public long delKey(String key){
		return binaryJedisCluster.del(key.getBytes());
	}
	

	/**
	 * 获取map，set，list，zset，String的长度，未传type返还0
	* @date: 2017年5月22日 
	* @author: chenhao
	* @title: getLength 
	* @param key
	* @param type 想要获取长度的类型,map请传：1;set请传:2;list请传:3;zset请传:4;String请传:5
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public long getLength(String key,int type){
		switch(type){
		   case 1:{
			   return binaryJedisCluster.hlen(key.getBytes());
		   }
		   case 2:{
			   return binaryJedisCluster.scard(key.getBytes());
		   }
		   case 3:{
			   return binaryJedisCluster.hlen(key.getBytes());
		   }
		   case 4:{
			   return binaryJedisCluster.zcard(key.getBytes());
		   }
		   case 5:{
			   return binaryJedisCluster.strlen(key.getBytes());
		   }
		   default :{
			   return 0;
		   }
		}
	}

	/*****************String 操作********************/
	
	
	/**
	 * 设置key和value
	* @date: 2017年5月19日 
	* @author: chenhao
	* @title: set 
	* @param key
	* @param value 
	* @param nx key不存在时，是否新建key，新建true，不新建false
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void set(String key,String value,boolean nx){
		if(true == nx){
			binaryJedisCluster.set(key.getBytes(), value.getBytes());
		}else{
			binaryJedisCluster.setnx(key.getBytes(), value.getBytes());
		}
		
	}
//	public void set(){
//		binaryJedisCluster.set(key, value, nxxx, expx, time)
//	}
	
	/**
	 * 根据key，取得String的value值
	* @date: 2017年5月21日 
	* @author: chenhao
	* @title: get 
	* @param key
	* @return String类型的value值
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String get(String key){
		return new String(binaryJedisCluster.get(key.getBytes()));
	} 
	
	/**
	 * 根据key，返还截取的字符串
	* @date: 2017年5月21日 
	* @author: chenhao
	* @title: getrange 
	* @param key
	* @param start
	* @param end 
	* @exception: 
	* @version: 1.0 
	* @description: 如：value值=chen hao 。start=1，end，2 返回 he
	* update_version: update_date: update_author: update_note:
	 */
	public String getrange(String key ,long start,long end){
		return new String(binaryJedisCluster.getrange(key.getBytes(), start, end));
	}
	
	/**
	 * 用value覆盖给定 key 所储存的字符串值，覆盖的位置从偏移量 offset 开始。
	* @date: 2017年5月21日 
	* @author: chenhao
	* @title: setTrange 
	* @param key
	* @param offset
	* @param value 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setrange(String key,long offset,String value){
		binaryJedisCluster.setrange(key.getBytes(), offset, value.getBytes());
	}
	
	/**
	 * 取得旧值，set新值
	* @date: 2017年5月21日 
	* @author: chenhao
	* @title: getOldSetNew 
	* @param key
	* @param newValue
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getOldSetNew(String key,String newValue){
		return new String(binaryJedisCluster.getSet(key.getBytes(), newValue.getBytes()));
	}
	
	/**
	 * set对应偏移量的值
	* @date: 2017年5月21日 
	* @author: chenhao
	* @title: setBit 
	* @param key
	* @param offset
	* @param value
	* @return key所在偏移量原持有的值，true and false 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public boolean setBit(String key,long offset,boolean value){
		return binaryJedisCluster.setbit(key.getBytes(), offset, value);
	}
	
	/**
	 * 取得偏移量位值
	* @date: 2017年5月21日 
	* @author: chenhao
	* @title: getBit 
	* @param key
	* @param offset
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public boolean getBit(String key,long offset){
		return binaryJedisCluster.getbit(key.getBytes(), offset);
	}
	
	/**
	 * 取得对应key的偏移量为true/1的个数
	* @date: 2017年5月21日 
	* @author: chenhao
	* @title: getBitCount 
	* @param key
	* @return 偏离位为true/1的个数
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public long getBitCount(String key){
		return binaryJedisCluster.bitcount(key.getBytes());
	}
	
	/**
	 * 批量插入
	* @date: 2017年5月21日 
	* @author: chenhao
	* @title: mset 
	* @param keysvalues 
	* @exception: 
	* @version: 1.0 
	* @description:慎用。集群模式下，需要不同的key需要在一个slot上 。slot分配根据key的hash值，可以使用{aa}b,aa,让之在一个slot上
	* update_version: update_date: update_author: update_note:
	 */
	public void mset(byte[]... keysvalues){
		binaryJedisCluster.mset(keysvalues);
	}
	/**
	 * 批量多取
	* @date: 2017年5月21日 
	* @author: chenhao
	* @title: mget 
	* @param keys
	* @return 
	* @exception: 慎用，集群模式下，需要不同的key需要在一个slot上，可以使用{aa}b,aa,让之在一个slot上
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<byte[]> mget(byte[]... keys){
		return binaryJedisCluster.mget(keys);
	}
	
	/**
	 * 增加1，拥有原子性，可以用作秒杀活动
	* @date: 2017年5月21日 
	* @author: chenhao
	* @title: incr 
	* @param key
	* @return 返回增加后的值。如果值包含错误的类型，或字符串类型的值不能表示为数字，那么返回一个错误
	* @exception: 
	* @version: 1.0 
	* @description: 如果 key 不存在，那么 key 的值会先被初始化为 0 ，然后再执行 INCR 
	* update_version: update_date: update_author: update_note:
	 */
	public long incr(String key){
		return binaryJedisCluster.incr(key.getBytes());
	}
	
	/**
	 * 增加value值
	* @date: 2017年5月21日 
	* @author: chenhao
	* @title: incrby 
	* @param key
	* @param incrValue
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public long incrby(String key,long incrValue){
		return binaryJedisCluster.incrBy(key.getBytes(), incrValue);
	}
	
	/**
	 * value值减去1
	* @date: 2017年5月21日 
	* @author: chenhao
	* @title: decr 
	* @param key
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public long decr(String key){
		return binaryJedisCluster.decr(key.getBytes());
	}
	
	/**
	 * 减去原子值
	* @date: 2017年5月21日 
	* @author: chenhao
	* @title: decrby 
	* @param key
	* @param decrValue
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public long decrby(String key,long decrValue){
		return binaryJedisCluster.decrBy(key.getBytes(),decrValue);
	}
	
	/**
	 *  用于为指定的 key 追加值
	* @date: 2017年5月21日 
	* @author: chenhao
	* @title: appendString 
	* @param key
	* @param appendValue
	* @return 追加后的数目
	* @exception: 
	* @version: 1.0 
	* @description: ey 已经存在并且是一个字符串， APPEND 命令将 value 追加到 key 原来的值的末尾
	*              key 不存在， APPEND 就简单地将给定 key 设为 value ，就像执行 SET key value 一样。
	* update_version: update_date: update_author: update_note:
	 */
	public long appendString(String key,String appendValue){
		return binaryJedisCluster.append(key.getBytes(), appendValue.getBytes());
	}
	
	
	/*********************************Map****************************************/
	/**
	 * 添加一个hash
	* @date: 2017年5月22日 
	* @author: chenhao
	* @title: hset 
	* @param key
	* @param field 新增map的key
	* @param value 新增map的value
	* @param ifnx 是否覆盖原field的value，true时不覆盖原value。
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void hset(String key,String field,Object value,Boolean ifnx){
		if(null != value){
			if(true == ifnx){
				binaryJedisCluster.hsetnx(key.getBytes(), field.getBytes(), SerializeUtil.serialize(value));
			}else{
				binaryJedisCluster.hset(key.getBytes(), field.getBytes(), SerializeUtil.serialize(value));
			}
		}
	}
	
	/**
	 * 批量添加hash
	* @date: 2017年5月22日 
	* @author: chenhao
	* @title: hmset 
	* @param key
	* @param inMap 放入hash的Map
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void hmset(String key ,Map<String,Object> inMap){
		Map <byte[],byte[]> map = new HashMap<byte[],byte[]>();
		if(!inMap.isEmpty()){
	 		for(Map.Entry<String, Object> m:inMap.entrySet()){
	 			Object valueResult = m.getValue();
	 			if(valueResult != null){
	 				map.put(m.getKey().getBytes(),SerializeUtil.serialize(valueResult));
	 			}
			}
			binaryJedisCluster.hmset(key.getBytes(), map);
		}
	}
	
	/**
	 * 取hash
	* @date: 2017年5月22日 
	* @author: chenhao
	* @title: hget 
	* @param key
	* @param field
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Object hget(String key ,String field){
		byte[] result = binaryJedisCluster.hget(key.getBytes(), field.getBytes());
		if(result != null){
			return SerializeUtil.deSerialize(result);
		}else{
			return null;
		}
	}
	
	/**
	 * 批量取hash
	* @date: 2017年5月22日 
	* @author: chenhao
	* @title: hmget 
	* @param key
	* @param fields
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Object> hmget(String key,List<String> fields){
		List<Object> resultList = new ArrayList<Object>();
		byte[][] in = new byte[fields.size()][];
		for(int i=0;i<fields.size();i++){
			byte[] b = fields.get(i).getBytes();
			in[i] = b;
		}
		List<byte[]> l= binaryJedisCluster.hmget(key.getBytes(), in);
		for(byte[] r:l){
			if(r!=null) resultList.add(SerializeUtil.deSerialize(r));
		}
		return resultList;
	}
	
	/**
	 * 取得map所有值
	* @date: 2017年5月22日 
	* @author: chenhao
	* @title: hgetAll 
	* @param key
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> hgetAll(String key){
		Map<String,Object> resultMap = new HashMap<String,Object>();
		Map<byte[],byte[]> res = binaryJedisCluster.hgetAll(key.getBytes());
		for(Map.Entry<byte[],byte[]> r :res.entrySet()){
			resultMap.put(new String(r.getKey()), SerializeUtil.deSerialize(r.getValue()));
		}
		return resultMap;
	}
	/**
	 * 根据key，field删除
	* @date: 2017年5月22日 
	* @author: chenhao
	* @title: hdel 
	* @param key
	* @param field
	* @return 删除成功返回1，失败返回0
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public long hdel(String key,String field){
		return binaryJedisCluster.hdel(key.getBytes(),field.getBytes());
	}
	
	/**
	 * 批量删除
	* @date: 2017年5月22日 
	* @author: chenhao
	* @title: hdel 
	* @param key
	* @param fields
	* @return 返回删除成功数，失败返回0
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public long hdel(String key,List<String> fields){
		byte[][] in = new byte[fields.size()][];
		for(int i=0;i<fields.size();i++){
			byte[] s = fields.get(i).getBytes();
			in [i] =s;
		}
		return binaryJedisCluster.hdel(key.getBytes(), in);
	}
	
	/**
	 * hash的field值增加increment值（可以为负数）
	* @date: 2017年5月22日 
	* @author: chenhao
	* @title: hincr 
	* @param key
	* @param field
	* @param increment
	* @return 增加的结果
	* @exception: 
	* @version: 1.0 
	* @description: 如果哈希表的 key 不存在，一个新的哈希表被创建并执行 HINCRBY 命令。
                                                    如果指定的字段不存在，那么在执行命令前，字段的值被初始化为 0 。
                                                    对一个储存字符串值的字段执行 HINCRBY 命令将造成一个错误。
	* update_version: update_date: update_author: update_note:
	 */
	public long hincr(String key,String field,long increment){
		return binaryJedisCluster.hincrBy(key.getBytes(), field.getBytes(), increment);
	}
	
	/*************************List**************************************/
	/**
	 * list插入
	* @date: 2017年5月22日 
	* @author: chenhao
	* @title: listAdd 
	* @param key 
	* @param value 
	* @param nx 列表不存在时是否新建列表，不新建列表false，新建列表true
	* @param formWhere l:表头添加 ；r：表尾添加
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void listAdd(String key,Object value,boolean nx,String formWhere){
		if(true == nx){
			if(Const.REDIS_ADDLIST_LEFT.equals(formWhere)){
				binaryJedisCluster.lpush(key.getBytes(), SerializeUtil.serialize(value));
			}else{
				binaryJedisCluster.rpush(key.getBytes(), SerializeUtil.serialize(value));
			}
		}else{
			if(Const.REDIS_ADDLIST_LEFT.equals(formWhere)){
				binaryJedisCluster.lpushx(key.getBytes(), SerializeUtil.serialize(value));
			}else{
				binaryJedisCluster.rpushx(key.getBytes(), SerializeUtil.serialize(value));
			}
		}
	}
	
	/**
	 * 批量插入list
	* @date: 2017年5月22日 
	* @author: chenhao
	* @title: listAdd 
	* @param key
	* @param listValue
	* @param nx nx 列表不存在时是否新建列表，不新建列表false，新建列表true
	* @param formWhere 传入left从表头插入，right从表尾插入
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void listAdds(String key,List<Object> listValue,boolean nx,String formWhere){
		byte[][] in = new byte[listValue.size()][];
		if(true == nx){
			if(Const.REDIS_ADDLIST_LEFT.equals(formWhere)){
				for(int i=0;i<listValue.size();i++){
					byte[] b = SerializeUtil.serialize(listValue.get(i));
					in[i] =b;
				}
				binaryJedisCluster.lpush(key.getBytes(), in);
			}else{
				for(int i=0;i<listValue.size();i++){
					byte[] b = SerializeUtil.serialize(listValue.get(i));
					in[i] =b;
				}
				binaryJedisCluster.rpush(key.getBytes(), in);
			}
		}else{
			if(Const.REDIS_ADDLIST_LEFT.equals(formWhere)){
				for(int i=0;i<listValue.size();i++){
					byte[] b = SerializeUtil.serialize(listValue.get(i));
					in[i] =b;
				}
				binaryJedisCluster.lpushx(key.getBytes(),in);
			}else{
				for(int i=0;i<listValue.size();i++){
					byte[] b = SerializeUtil.serialize(listValue.get(i));
					in[i] =b;
				}
				binaryJedisCluster.rpushx(key.getBytes(), in);
			}
		}
	}
	
	/**
	 * 移除并返回list头或者尾（非阻塞方式）list空时返回null
	* @date: 2017年5月22日 
	* @author: chenhao
	* @title: listGet 
	* @param key
	* @param formWhere 传入left从表头弹出，right从表尾弹出
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Object listGet(String key,String formWhere){
		byte [] result = null;
		if(Const.REDIS_ADDLIST_LEFT.equals(formWhere)){
			result = binaryJedisCluster.lpop(key.getBytes());
		}else{
			result = binaryJedisCluster.rpop(key.getBytes());
		}
		return SerializeUtil.deSerialize(result);
	}
	
	/**
	 * 用于移除列表的最后一个元素，并将该元素添加到另一个列表并返回
	* @date: 2017年5月22日 
	* @author: chenhao
	* @title: listGetSafe 
	* @param key
	* @param backUpKey
	* @param formWhere
	* @return 
	* @exception: 可以用于安全队列和循环列表
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Object listGetSafe(String key,String backUpKey){
		byte [] result = null;
		result = binaryJedisCluster.rpoplpush(key.getBytes(), backUpKey.getBytes());
		return SerializeUtil.deSerialize(result);
	}
	
	/**
	 * 按值删除list中的某个值，
	* @date: 2017年5月22日 
	* @author: chenhao
	* @title: lRem 
	* @param key
	* @param count
	* @param value
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: count > 0 : 从表头开始向表尾搜索，移除与 VALUE 相等的元素，数量为 COUNT 。count < 0 : 从表尾开始向表头搜索，移除与 VALUE 相等的元素，数量为 COUNT 的绝对值。count = 0 : 移除表中所有与 VALUE 相等的值。
	* update_version: update_date: update_author: update_note:
	 */
	public long lRem(String key,long count,Object value){
		long result = binaryJedisCluster.lrem(key.getBytes(), count, SerializeUtil.serialize(value));
		return result;
	}
	
	/**
	 * 对一个列表进行修剪(trim)，就是说，让列表只保留指定区间内的元素，不在指定区间之内的元素都将被删除。
	* @date: 2017年5月22日 
	* @author: chenhao
	* @title: ltrim 
	* @param key
	* @param start
	* @param end 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void ltrim(String key,long start,int end){
		binaryJedisCluster.ltrim(key.getBytes(),start,end);
	}
	
	/**
	 * 批量获取List
	* @date: 2017年5月22日 
	* @author: chenhao
	* @title: lgetAll 
	* @param key
	* @param start
	* @param end
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Object> lgetAll(String key,long start,long end){
		List<Object> result = new ArrayList<Object>();
		List<byte[]> l = binaryJedisCluster.lrange(key.getBytes(), start, end);
		for(byte[] b:l){
			result.add(SerializeUtil.deSerialize(b));
		}
		return result;
	}

	/********************************set****************************************************/
	/**
	 * 单个添加到set中
	* @date: 2017年5月22日 
	* @author: chenhao
	* @title: setAdd 
	* @param key
	* @param value 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAdd(String key,Object value){
		binaryJedisCluster.sadd(key.getBytes(), SerializeUtil.serialize(value));
	}
	/**
	 * 批量添加到set
	* @date: 2017年5月22日 
	* @author: chenhao
	* @title: setAdds 
	* @param key
	* @param value 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAdds(String key,Set<Object> value){
		byte[][] in = new byte[value.size()][];
		int i =0;
		Iterator<Object> iter = value.iterator();
		while(iter.hasNext()){
			in[i] = SerializeUtil.serialize(iter.next());
			i++;
		}
		binaryJedisCluster.sadd(key.getBytes(), in);
	}
	
	/**
	 * set求差，交，并。
	* @date: 2017年5月22日 
	* @author: chenhao
	* @title: setCalculate 
	* @param keys
	* @param sign 1:求差集（注意差集仅为前集减去后集） ;2:求交集;3:求并集
	* @param ifstore 是否将计算结果保存到storeKey
	* @param storeKey 
	* @return 计算后的结果
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Set<Object> setCalculate(List<String> keys,int sign,boolean ifstore,String storeKey){
		byte[][] in = new byte[keys.size()][];
		for(int i = 0;i<keys.size();i++){
			byte[] b = keys.get(i).getBytes();
			in[i] = b;
		}
		Set<byte[]> result = null; 
		switch(sign){
		    case 1 :{
		    	if(ifstore == true){
		    		binaryJedisCluster.sdiffstore(storeKey.getBytes(), in);
		    		result = binaryJedisCluster.smembers(storeKey.getBytes());
		    	}else{
		    		result = binaryJedisCluster.sdiff(in);
		    	}
		    	break;
		    }
		    case 2: {
		    	if(ifstore == true){
		    		binaryJedisCluster.sinterstore(storeKey.getBytes(), in);
		    		result = binaryJedisCluster.smembers(storeKey.getBytes());
		    	}else{
		    		result = binaryJedisCluster.sinter(in);
		    	}
		    	break;
		    }
		    case 3: {
		    	if(ifstore == true){
		    		binaryJedisCluster.sunionstore(storeKey.getBytes(), in);
		    		result = binaryJedisCluster.smembers(storeKey.getBytes());
		    	}else{
		    		result = binaryJedisCluster.sunion(in);
		    	}
		    	break;
		    }
		}
		Set<Object> resultSet = new HashSet<Object>();
		Iterator<byte[]> iter = result.iterator();
		while(iter.hasNext()){
			resultSet.add(SerializeUtil.deSerialize(iter.next()));
		}
		return resultSet;
	}
	
	/**
	 * 返回集合中的所有成员
	* @date: 2017年5月22日 
	* @author: chenhao
	* @title: sgetAll 
	* @param key
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Set<Object> sgetAll(String key){
		Set<byte[]> result = binaryJedisCluster.smembers(key.getBytes());
		Set<Object> resultSet = new HashSet<Object>();
		Iterator<byte[]> iter = result.iterator();
		while(iter.hasNext()){
			resultSet.add(SerializeUtil.deSerialize(iter.next()));
		}
		return resultSet;
	}
	
	/**
	 *判断一个对象是否在set中
	* @date: 2017年5月23日 
	* @author: chenhao
	* @title: sIsMember 
	* @param key
	* @param member
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public boolean sIsMember(String key,Object member){
		return binaryJedisCluster.sismember(key.getBytes(), SerializeUtil.serialize(member));
	}
	
	/**
	 * 把一个对象从一个key移动到另一个key
	* @date: 2017年5月23日 
	* @author: chenhao
	* @title: smove 
	* @param fromkey
	* @param toKey
	* @param obj 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void smove(String fromkey,String toKey,Object obj){
		 binaryJedisCluster.smove(fromkey.getBytes(), toKey.getBytes(), SerializeUtil.serialize(obj));
	}
	
	/**
	 * 移除并返回集合中的一个随机元素
	* @date: 2017年5月23日 
	* @author: chenhao
	* @title: sget 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Object sget(String key){
		return SerializeUtil.serialize(binaryJedisCluster.spop(key.getBytes()));
	}
	
	/**
	 * 移除集合中一个或者多个成员
	* @date: 2017年5月23日 
	* @author: chenhao
	* @title: srem 
	* @param key
	* @param value
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public long sDelete(String key,Object... values){
		Object[] objs = values;
		byte[][] in = new byte[values.length][];
		for(int i = 0;i<values.length;i++){
			in[i] = SerializeUtil.serialize( objs[i]);
		}
		return binaryJedisCluster.srem(key.getBytes(),in);
	}
	
	/**************************zset*******************************/
	/**
	 * zset添加
	* @date: 2017年5月23日 
	* @author: chenhao
	* @title: zsetAdd 
	* @param key
	* @param score
	* @param member 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void zsetAdd(String key,double score,Object member){
		binaryJedisCluster.zadd(key.getBytes(), score,  SerializeUtil.serialize(member));
	}
	
	/**
	 * zset批量添加
	* @date: 2017年5月23日 
	* @author: chenhao
	* @title: zsetAdd 
	* @param key
	* @param scoreMembers 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void zsetAdd(String key,Map<Object,Double> scoreMembers){
		Map<byte[], Double> in = new HashMap<byte[],Double>();
		for(Map.Entry<Object,Double> entry:scoreMembers.entrySet()){
			in.put(SerializeUtil.serialize(entry.getKey()), entry.getValue());
		}
		binaryJedisCluster.zadd(key.getBytes(), in);
	}
	
	/**
	 * 计算在有序集合中指定区间分数的成员数
	* @date: 2017年5月23日 
	* @author: chenhao
	* @title: zcount 
	* @param key
	* @param scoreStart
	* @param scoreEnd
	* @return 成员数
	* @exception: 
	* @version: 1.0 
	* @description: 入参形如："(1.5", "3.0" 表示1.5<sorce<=3.0。加"("代表不取等。
	* update_version: update_date: update_author: update_note:
	 */
	public long zcount(String key,String scoreStart,String scoreEnd){
		return binaryJedisCluster.zcount(key.getBytes(),scoreStart.getBytes(), scoreEnd.getBytes());
	}
//	public long zlexcount(String key,Object startMember,Object endMember){
//		return binaryJedisCluster.zlexcount(key.getBytes(), SerializeUtil.serialize(startMember), SerializeUtil.serialize(endMember));
//	}
	
	/**
	 *通过索引区间,或者分数返回有序集合成指定区间内的成员
	* @date: 2017年5月23日 
	* @author: chenhao
	* @title: zrange 
	* @param key
	* @param methods 索引区间查询：sequence；分数排序查询：score
	* @param orderMethod 分数高-->低（区间大-->小）：desc ；分数低-->高（区间小-->大）：asc 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 按分数排序时：入参形如："(1.5", "3.0" 表示1.5<sorce<=3.0。加"("代表不取等。
	*               按序列排序时：入参请传整数
	* update_version: update_date: update_author: update_note:
	 */
	public List<Object> zrange (String key,String methods,String orderMethod,String start,String end){
		Set<byte[]> result = null;
		List<Object> resultList = new ArrayList<Object>();
		if(Const.REDIS_ZRANGE_BYSEQUENCE.equals(methods)){
			if(Const.REDIS_ZRANGE_ASC.equals(orderMethod)){
				result = binaryJedisCluster.zrange(key.getBytes(), Long.parseLong(start), Long.parseLong(end));
			}else{
				result = binaryJedisCluster.zrevrange(key.getBytes(), Long.parseLong(start), Long.parseLong(end));
			}
		}else if(Const.REDIS_ZRANGE_BYSCORE.equals(methods)){
			if(Const.REDIS_ZRANGE_ASC.equals(orderMethod)){
				result =  binaryJedisCluster.zrangeByScore(key.getBytes(), start.getBytes(), end.getBytes());
			}else{
				result =  binaryJedisCluster.zrevrangeByScore(key.getBytes(), end.getBytes(), start.getBytes());			
			}
		}else{
			try {
				throw new Exception("please pass a current value!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		Iterator<byte[]> iter = result.iterator();
		while(iter.hasNext()){
			resultList.add(SerializeUtil.deSerialize(iter.next()));
		}
		return resultList;
	}
	
	/**
	 * 有序集合中对指定成员的分数加上增量 score
	* @date: 2017年5月23日 
	* @author: chenhao
	* @title: zincr 
	* @param key
	* @param member
	* @param score
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public double zincr(String key,Object member,Double score){
		return binaryJedisCluster.zincrby(key.getBytes(), score,SerializeUtil.serialize(member));
	}
	
	/**
	 * 返回有序集合中指定成员的排名，从0开始
	* @date: 2017年5月23日 
	* @author: chenhao
	* @title: zrank 
	* @param key
	* @param member
	* @param orderMethod 分数高-->低（区间大-->小）：desc ；分数低-->高（区间小-->大）：asc 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public long zrank(String key ,Object member,String orderMethod){
		if(Const.REDIS_ZRANGE_DESC.equals(orderMethod)){
			return binaryJedisCluster.zrevrank(key.getBytes(), SerializeUtil.serialize(member));
		}else{
			return binaryJedisCluster.zrank(key.getBytes(), SerializeUtil.serialize(member));
		}
	}
	
	/**
	 * 通过索引区间,或者分数删除有序集合成指定区间内的成员
	* @date: 2017年5月24日 
	* @author: chenhao
	* @title: zremInterval 
	* @param key
	* @param methods
	* @param start
	* @param end
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 按分数排序时：入参形如："(1.5", "3.0" 表示1.5<sorce<=3.0。加"("代表不取等。
	*               按序列排序时：入参请传整数
	* update_version: update_date: update_author: update_note:
	 */
	public long zDeleteInterval(String key,String methods,String start,String end){
		if(Const.REDIS_ZRANGE_BYSEQUENCE.equals(methods)){
			return binaryJedisCluster.zremrangeByRank(key.getBytes(), Long.parseLong(start), Long.parseLong(end));		}
		if(Const.REDIS_ZRANGE_BYSCORE.equals(methods)){
			return binaryJedisCluster.zremrangeByScore(key.getBytes(), start.getBytes(), end.getBytes());
		}
		return 0;
	}
	
	/**
	 * 批量删除
	* @date: 2017年5月24日 
	* @author: chenhao
	* @title: zDeletes 
	* @param key
	* @param members
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public long zDeletes(String key,Set<Object> members){
		byte[][] in = new byte[members.size()][];
		int i = 0;
		for(Object obj:members){
			byte[] b = SerializeUtil.serialize(obj);
			in[i] = b;
			i++;
		}
		return binaryJedisCluster.zrem(key.getBytes(), in);
	}
	
	/**
	 * 删除zset对象
	* @date: 2017年5月24日 
	* @author: chenhao
	* @title: zDelete 
	* @param key
	* @param member
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public long zDelete(String key,Object member){
		return  binaryJedisCluster.zrem(key.getBytes(), SerializeUtil.serialize(member));
	}
	
	/**
	 * 返回对象的分数
	* @date: 2017年5月24日 
	* @author: chenhao
	* @title: zGetScore 
	* @param key
	* @param member
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Double zGetScore(String key,Object member){
		return binaryJedisCluster.zscore(key.getBytes(), SerializeUtil.serialize(member));
	}
	
	public static void main(String[] args) {
//		RedisUtil a = RedisUtil.getInstence();
		
	}
	
	
}
