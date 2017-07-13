package com.chen.mine.commonsConst;

public class Const {
	
	/**
	 * redis配置文件名
	 */
	public static final String REDIS_CONFIG_PROPERTIES = new String("redisConfig.properties");
	/**
	 * 插入到列表尾部
	 */
	public static final String REDIS_ADDLIST_RIGHT = new String("right");
	/**
	 * 插入到列表头部
	 */
	public static final String REDIS_ADDLIST_LEFT = new String("left");
	/**
	 * 根据排名
	 */
	public static final String REDIS_ZRANGE_BYSEQUENCE = new String("sequence");
	/**
	 * 根据分数
	 */
	public static final String REDIS_ZRANGE_BYSCORE = new String("score");
	/**
	 * 倒序
	 */
	public static final String REDIS_ZRANGE_DESC = new String("desc");
	/**
	 * 顺序
	 */
	public static final String REDIS_ZRANGE_ASC = new String("asc");

}
