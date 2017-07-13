package util;

/**
 * <p>Title:应用集成平台：通信管理模块API配置信息</p>
 * <p>Description:该类主要用于配置CommagentMessage</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: si-tech</p>
 * 
 * @author machunlin
 * @version 1.0.0
 */

public class CommagentConfig {
	
	public static int COMM_PERMS = 0660;                                       /*???????*/
	
	public static int MAXCONN = 1024;                                              /*Commagent最大连接数*/
	
	public static int CMDSUCCESS = 0;                                               /*请求成功返回代码*/
	
	public static int MSGBEGIN = 0x00000001;                                /*请求数据包的第一包标志*/
	
	public static int MSGCONTINUE = 0x00000010;                       /*请求数据包的中间包标志*/
	
	public static int MSGEND = 0x00000100;                                    /*请求数据包的最后一包标志*/
	
	public static int MSGCHECK = 0x00000110;                                 /*???????*/
	
	public static int SYSNULL = 0;                                                       /*???????*/
	
	public static int SYSFREE = 1;                                                        /*???????*/
	
	public static int SYSBUSY = 2;                                                       /*???????*/
	
	public static int SYSWAIT = 3;                                                      /*???????*/
	
	public static byte ISTRUE = '1';                                                    /*常量表示最后一包*/
	
	public static byte NOTTRUE = '0';                                                /*常量表示非最后一包*/
	
	public static byte BREAKHEART = '0';                                          /*心跳包标志*/
	
	public static byte SRVREGISTER = '1';                                         /*注册包标志*/
	
	public static byte MSGREQUEST = '3';                                        /*请求包标志*/
	
	public static byte MSGRESPONSE = '4';                                      /*响应包标志*/
	
	public static byte MSGGETNEXT = '5';                                        /*???????*/
	
	public static byte MSGREADY = '6';                                             /*???????*/
	
	public static int MAXDLEN = 9999;                                               /*最大包体长度 1M*/
	
	public static int HEADLEN = 80;                                                    /*包头长度*/
	
	public static String MSGFLAG = "`DC`";                                      /*起始标志，"`DC`"*/
	
	public static String VER01 = "01";                                                  /* 版本号 "01" */
	
	public static int msgflag_LEN = 4;                                                 /* 起始标志占位长度*/
	
	public static int version_LEN = 2;                                                  /* 版本号占位长度*/
	
	public static int msglength_LEN = 4;                                             /* 消息长度，不足4位左补零，最大8000占位长度 */
	
	public static int appid_LEN = 6;                                                     /* 事务类型占位长度 */
	
	public static int transid_LEN = 10;                                                /* 事务标志，唯一的序号，不足10位左补零占位长度 */
	
	public static int transnum_LEN = 6;                                              /* 事务内分组序号（必须连续）,不足6位左补零占位长度 */
	
	public static int codetime_LEN = 6;                                              /* 生存期,单位秒(或应答标识),不足6位左补零占位长度*/
	
	public static int positionid_LEN = 8;                                             /* 任务请求客户标识占位长度 */
	
	public static int userid_LEN = 8;                                                   /* 通信代理客户标识占位长度 */
	
	public static int streamid_LEN = 8;                                               /* 通信描述符序号占位长度*/
	
	public static final int priority_LEN = 2;                                        /*优先级占位长度*/
	
	public static final int transcode_LEN = 14;                                  /*交易代码占位长度*/	
	
	public static final String RSP_BREAKHEART = "000009";        /*心跳包返回码*/
}
