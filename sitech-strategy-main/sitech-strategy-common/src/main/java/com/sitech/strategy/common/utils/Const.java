package com.sitech.strategy.common.utils;

/**
 * 常量
* @date: 2016-9-5 
* @author: sunliang 
* @title: Const 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public final class Const {
	
	/**
	 * 短信等级
	 * */
	public static final String SHORT_MSG_LEVEL_HIGH = new String("high");
	public static final String SHORT_MSG_LEVEL_MIDDLE = new String("middle");
	public static final String SHORT_MSG_LEVEL_LOW = new String("low");
	
	/**
	 * 实时营销的OPCODE
	 * */
	public static final String RM_OP_CODE = new String("5431");
	
	/**
	 * 套餐生效方式
	 * */
	public static final String PROD_EFFECT_TYPE_CUR_DAY = new String("1001");//立即生效
	public static final String PROD_EFFECT_TYPE_NEXT_DAY = new String("1003");//次日生效
	public static final String PROD_EFFECT_TYPE_NEXT_MONTH = new String("1065");//次月1日生效
		
	/**
	 * 附件类型
	 */
	public static final String ATTACH_FILE_TYPE_TARGET = new String("00");
	public static final String ATTACH_FILE_TYPE_POLICY = new String("01");
	public static final String ATTACH_FILE_TYPE_CLOSERULE = new String("02");
	public static final String ATTACH_FILE_TYPE_ASSESSRLUE = new String("03");
	public static final String ATTACH_FILE_TYPE_ASSESSREPORT = new String("04");
	public static final String ATTACH_FILE_TYPE_ACTCONFIG = new String("05");
	public static final String ATTACH_FILR_TYPE_AUDITRECORD = new String("06");
	
	/**
	 * bean文件加载列表
	 */
	public static final String[] BEAN_FILE_TYPE_COMMON = new String[]{"/commonBean.xml"};
	public static final String[] BEAN_FILE_TYPE_PROCESS = new String[]{"/commonBean.xml","persistByBaseNosql.xml","/coreBean.xml","persist.xml","/processEntity.xml","/processBatch.xml","processStream.xml"};
	public static final String[] BEAN_FILE_TYPE_EVENT = new String[]{"/commonBean.xml","persistByBaseNosql.xml","persist.xml","/coreBean.xml","/eventEntity.xml","/eventStream.xml"};
	public static final String[] BEAN_FILE_TYPE_RECOMMEND = new String[]{"/commonBean.xml","persistByBaseNosql.xml","persist.xml","/coreBean.xml","/recommendEntity.xml","/recommendBatch.xml","/recommendStream.xml"};
	public static final String[] BEAN_FILE_TYPE_NOSQL = new String[]{"/commonBean.xml","persistByBaseNosql.xml","persist.xml","/coreBean.xml","/processEntity.xml","/processBatch.xml","processStream.xml"};
	public static final String[] BEAN_FILE_TYPE_ALL = new String[]{"/jcf-config.xml","/db.xml","/commonBean.xml","persistByBaseNosql.xml","persistByBaseIBatis.xml","/persist.xml","/coreBean.xml","/processEntity.xml","/recommendEntity.xml","/manageEntity.xml","/eventEntity.xml","/processBatch.xml","/recommendBatch.xml"};
	public static final String[] BEAN_FILE_TYPE_EVALUATE = new String[]{"/jcf-config.xml","/db.xml","/commonBean.xml","persistByBaseNosql.xml","persistByBaseIBatis.xml","/persist.xml","/coreBean.xml","/processEntity.xml","/recommendEntity.xml","/manageEntity.xml","/eventEntity.xml","/processBatch.xml","/recommendBatch.xml"};
	
	/**
	 * 业务类型
	 */
	public static final String BUSI_TYPE_MARKETCSAE = new String("00");
	public static final String BUSI_TYPE_CUSTGROUP = new String("01");
	public static final String BUSI_TYPE_TASKADJUST = new String("02");
	public static final String BUSI_TYPE_SEQ = new String("09");//序列
	
	/**
	 * cache存储类型
	 */
	public static final String CACHE_RESTORE_TYPE_STRING = new String("string");
	public static final String CACHE_RESTORE_TYPE_LIST = new String("list");
	public static final String CACHE_RESTORE_TYPE_ZSET = new String("zset");
	public static final String CACHE_RESTORE_DIRECTION_RIGHT = new String("right");
	public static final String CACHE_RESTORE_DIRECTION_LEFT = new String("left");
	
	/**
	 * 标签类型
	 * */
	public static final String LABEL_TYPE_DYNAMIC = new String("00");
	public static final String LABEL_TYPE_STATIC = new String("01");
	
	/**
	 * 客户群标签表达式
	 */
	public static final String CACHE_DATATYPE_CUSTGROUP_LABELFORMULA = new String("rm:custGroupLabelFormula:custGroupId.to.custGroupLableFormula:");
	/**
	 * 静态标签客户群生成Hive表名缓存
	 */
	public static final String CACHE_DATATYPE_CUSTGROUP_HIVETABLENAME = new String("rm:custGroupLabelHiveTableName");
	/**
	 * 渠道展示数量
	 */
	public static final String CACHE_DATATYPE_CHANNEL_SHOWNUM = new String("rm:channelShowNum:channelId.to.channelShowNum:");
	/**
	 * 渠道触发营销案缓存
	 */
	public static final String CACHE_DATATYPE_MARKETCASE_CHANNELTRIGGER = new String("rm:channelTriggerMarketCase:regionCodeAndpositionId.to.marketCaseId:");
	/**
	 * 事件触发营销案缓存
	 */
	public static final String CACHE_DATATYPE_MARKETCASE_EVENTTRIGGER = new String("rm:eventTriggerMarketCase:regionCodeAndEventId.to.marketCaseId:");
	/** 
	* 互斥规则 
	*/ 
	public static final String CACHE_DATATYPE_RULE_MUTEXRULE = new String("rm:mutexRuleCache:"); 
	/** 
	* 关闭规则 
	*/ 
	public static final String CACHE_DATATYPE_RULE_CLOSE = new String("rm:marketCaseCloseRule:productId.to.marketCaseId:"); 
	/** 
	* 评估规则 
	*/ 
	public static final String CACHE_DATATYPE_RULE_EVALUATE = new String("rm:marketCaseEvaluateRule:productId.to.marketCaseId:"); 
	/**
	 * 全局规则
	 */
	public static final String CACHE_DATATYPE_RULE_GLOBALRULE = new String("rm:globalRuleCache");
	/**
	 * 营销案详细信息
	 */
	public static final String CACHE_DATATYPE_MARKETCASE_DETAIL = new String("rm.marketCaseDetail:marketCaseId.to.marketCaseDetail:");
	/**
	 * 营销案与问卷ID缓存
	 */
	public static final String CACHE_DATATYPE_MARKETCASE_QUESTION = new String("rm:marketCaseQuestion");
	/**
	 * 营销案推荐关闭缓存
	 */
	public static final String CACHE_DATATYPE_MARKETCASE_RECOMMONEDCLOSE =  new String("rm:marketCaseRecommendClose");
	/**
	 * 营销案推荐状态缓存
	 */
	public static final String CACHE_DATATYPE_MARKETCASE_RECOMMENDSTATUS = new String("rm:marketCaseRecommendStatus:marketCaseId.to.marketCaseRecommendStatus:");
	/**
	 * 产品与事件关系缓存
	 */
	public static final String CACHE_DATATYPE_EVENT_PRODUCT = new String("rm:productAndEventRel:productId.to.eventId:");
	/**
	 * 事件渠道
	 */
	public static final String CACHE_DATATYPE_EVENTTRIGGERCHANNEL = new String("eventTriggerChannel");
	/**
	 * 费用与事件关系缓存
	 */
	public static final String CACHE_DATATYPE_EVENT_FEE = new String("rm:feeAndEventRel:"); 
	/**
	 * 将查询结果放入缓存
	 */
	public static final String CACHE_DATATYPE_RESULTLIST =  new String("rm:resultList:queryId.to.resultList:");
	/**
	 * 服务监控缓存
	 */
	public static final String CACHE_DATATYPE_SERVICEMONITORING =  new String("rm:serviceMonitoring");
	/**
	 * 数据统计缓存
	 */
	public static final String CACHE_DATATYPE_STATISTIC =  new String("rm:statistic:key.to.totalNum:");
	/**
	 * 待生成批量push任务营销案缓存
	 */
	public static final String CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATE = new String("rm:waitCreateBatchPushMarketCase");
	/**
	 * 待生成的push任务发短信营销案缓存
	 */
	public static final String CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEMSG= new String("{rm:waitCreateBatchPushMsgMarketCase}");
	/**
	 * 待生成的push任务发短信营销案临时缓存
	 */
	public static final String CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEMSG_TMP= new String("{rm:waitCreateBatchPushMsgMarketCase}Tmp");

	/**
	 * 待生成的push任务送套餐营销案缓存
	 */
	public static final String CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEPROD= new String("{rm:waitCreateBatchPushProdMarketCase}");
	/**
	 * 待生成的push任务送套餐营销案临时缓存
	 */
	public static final String CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEPROD_TMP= new String("{rm:waitCreateBatchPushProdMarketCase}Tmp");
	/**
	 * 待生成外呼任务营销案缓存
	 */
	public static final String CACHE_DATATYPE_MARKETCASE_CALLTASK_WAITCREATE = new String("rm:waitCreateCallTaskMarketCase");
	/**
	 * 待生成渠道任务营销案缓存
	 */
	public static final String CACHE_DATATYPE_MARKETCASE_CHANNELTASK_WAITCREATE =  new String("rm:waitCreateChannelTaskMarketCase");
	/**
	 * 待发送批量push营销案缓存
	 */
	public static final String CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITSNED = new String("rm:waitSendBatchPushMarketCase");
	/**
	 * 待同步渠道任务缓存
	 */
	public static final String CACHE_DATATYPE_MARKETCASE_CHANNELTASK_WAITSYN =  new String("rm:waitSynChannelTask");
	
	/**
	 * 缓存key
	 */
	public static final String CACHE_KEY = new String("key");
	/**
	 * 缓存value
	 */
	public static final String CACHE_VALUE = new String("value");
	/**
	 * 缓存查询开始位置
	 */
	public static final String CACHE_START = new String("start");
	/**
	 * 缓存查询结束位置
	 */
	public static final String CACHE_END = new String("end");
	/**
	 * 缓存位置方向
	 */
	public static final String CACHE_DIRECTION = new String("direction");
	/**
	 * 缓存有序集合成员
	 */
	public static final String CACHE_MEMBER = new String("member");
	/**
	 * 缓存有序集合分值
	 */
	public static final String CACHE_SCORE = new String("score");
	
	/**
	 * 生成渠道任务的渠道
	 */
	public static final String[] CHANNEL_GENERATECHANNELTASK = new String[]{"06","10","16","17"};
	/**
	 * 额外生成渠道任务触点及运营位
	 */
	public static final String[] CHANNEL_GENERATECHANNELTASK_EXTRA = new String[]{"03","13","15"};
	public static final String[] POSITION_GENERATECHANNELTASK_EXTRA = new String[]{"_03_99","POSITION_13_02","POSITION_15_02"};
	/**
	 * 需短信提醒运营位
	 */
	public static final String[] POSITION_GENERATECHANNELTASK_MSGNOTICE = new String[]{"POSITION_16_02","POSITION_17_02"};
	/**
	 * 批量push运营位
	 */
	public static final String POSITION_02_01= new String("POSITION_02_01");
	public static final String POSITION_01_02= new String("POSITION_01_02");
	public static final String BATCHPUSHMSG = new String("batchPushMsg");
	public static final String BATCHPUSHPROD = new String("batchPushProd");

	/**
	 * 生成批量push任务的渠道
	 */
	public static final String[] CHANNEL_GENERATEBATCHPUSHTASK = new String[]{"04"};
	
	/**
	 * 渠道编码
	 */
	public static final String CHANNEL_CUREDULITY_SERVICE = new String("1000000124");
	public static final String CHANNEL_EURFING_SERVICE = new String("1000000112");
	public static final String CHANNEL_PAYMENT_SERVICE = new String("1000000234");
	public static final String CHANNEL_WECHAR_SERVICE = new String("1000000114");
	
	/**
	 * 事件触发渠道值
	 */
	public static final String EVENT_TRIGGER_CHANNEL_FRONTDESK = new String("11");//营业前台
	public static final String EVENT_TRIGGER_CHANNEL_CUSTOMERSERVICE = new String("17");//10086客服
	public static final String EVENT_TRIGGER_CHANNEL_ONLINEHALL = new String("02");//网上营业厅
	public static final String EVENT_TRIGGER_CHANNEL_APPLEHALL = new String("03");//掌上营业厅
	public static final String EVENT_TRIGGER_CHANNEL_WAP = new String("09");//一级WAP
	public static final String EVENT_TRIGGER_CHANNEL_SHORTHALL = new String("04");//短信营业厅
	public static final String EVENT_TRIGGER_CHANNEL_IVR = new String("06");//IVR
	
	/**
	 * 渠道展示数量默认值
	 */
	public static final String CHANNEL_SHOWNUM_REGION = new String("2");
	public static final String CHANNEL_SHOWNUM_TOTAL = new String("5");
	
	/**
	 * 事件渠道ID
	 */
	public static final String CHANNEL_ID_EVENT = new String("11");
	
	/**
	 * 目标客户群类型
	 */
	public static final String CUSTGROUP_TYPE_ALL= new String("01");
	public static final String CUSTGROUP_TYPE_LOAD= new String("02");//导入模式
	public static final String CUSTGROUP_TYPE_LABEL= new String("03");//动态标签
	public static final String CUSTGROUP_TYPE_DB= new String("04");
	public static final String CUSTGROUP_TYPE_COC= new String("05");
	public static final String CUSTGROUP_TYPE_LABEL_STATIC= new String("06");//静态标签
	public static final String CUSTGROUP_TYPE_BLACK= new String("08");

	/**
	 * componentType(组件类型)
	 */
	public static final String COMPONENT_TYPE_MARKETCASE = new String("01");
	public static final String COMPONENT_TYPE_CUSTGROUP = new String("02");
	public static final String COMPONENT_TYPE_CHANNEL = new String("03");
	public static final String COMPONENT_TYPE_POSITION = new String("04");
	public static final String COMPONENT_TYPE_CONTENT = new String("05");
	public static final String COMPONENT_TYPE_RULE = new String("06");
	public static final String COMPONENT_TYPE_EVENT = new String("07");
	public static final String COMPONENT_TYPE_PRODUCTCOMMODITY = new String("08");
	public static final String COMPONENT_TYPE_TEMPLATE = new String("09");
	public static final String COMPONENT_TYPE_TASKADJUST = new String("10");
	
	/**
	 * 反馈消息类型
	 */
	public static final String COUPLEBACK_TITLE_TYPE_CLICK = new String("1001");
	public static final String COUPLEBACK_TITLE_TYPE_RECEIPT = new String("1002");
	public static final String COUPLEBACK_TITLE_TYPE_PUSHARRIVE = new String("1003");
	public static final String COUPLEBACK_TITLE_TYPE_CALLCONTACT = new String("1004");
	public static final String COUPLEBACK_TITLE_TYPE_SMSPULL = new String("1005");
	public static final String COUPLEBACK_TITLE_TYPE_SMSCONTACT = new String("1006");
	
	/**
     * 客户群标签元素
     */
    public static final String CUST_GROUP_LABEL_KEYS [] = new String[]{"LATN_ID","PRD_INST_STAS_ID","PRD_ID","CHRG_LEVEL","INNER_MONTH","EXTEND_PAYMETHOD_NAME","OWE_CHARGE","DEV_NUM","LOS_NUM","ZZB_FLAG","ZZB_OFR_TYPE_ID","ZZB_CHRG_LEVEL","ZFK_FLAG","WIDE_TER","TERM_TYPE","TERM_FLAG","STAR_FLAG","HOLD_GRADE","HOLD_CHN","HIGH_FLAG","BTMS","SMZ_FLAG","LLXF","TCXF","MBQ_FLAG","QF_FLAG","ZK_FLAG","IF_YZF","XZ_NAME","IF_PREPAY","ITV_FLAG","SMART_FLAG","CARRY_MODE","FOUR_FLAG","DG_FLUX_FLAG","FLOW_FLAG","ISNT_DGJT_FLOWPACK","LAN_NUM_201510","HDITV_FLAG","FB_RULE_FLAG","FB_HC_RULE_FLAG","PRE_NET_NUM","LAN_NUM","ISNT_NF","NF_RULE_RE_MONTH","TYPE_E8","SPEED_UPPER_LIMIT","REASON_ID","FB_FLAG","TASK_NAME","ISNT_SMART","ISNT_FLOW","ISNT_4GCARD","ISNT_CRT_FB","ISNT_IFREE","ISNT_WJH","ISNT_BJR4GKZD","TERM_TYPE_NEW","LAST_MONTH_FLOW","ZH_INNER_MONTHS","ZTTZ","YTH_FLAG","R129_SBZ_FLAG","DBH_FLAG","YSYF","DK_FLAG","ISNT_ACCT_ITV","NF_END_MONTHS","PRE_RULE_TYPE","NF_TYPE","TASK_TYPE","GROUP_NAME_FOR_WT","PRICE_MONTHLY_PAYMENT","PHOTO_GROUP_CODE","PHOTO_VPN_CODE","YYXF","LLZL","TCZL","FK_NUM","CZ_FLAG","FK_FLAG","OFR_BIG_TYPE","OFR_TYPE","GROUP_NAME","SPEED_ID","CRT_DATE","COMPLETE_DATE","EFF_DATE","OFR_EFF_DATE","FB_BILLING_CYCLE_END","BTSC","PRE_RULE_ID","TYPE_NEW_ZZB","BIND_NBR","AVG_FEE_AGO_TOTAL","C_CHRG_LEVEL","C_OFR_ID","NF_PRE_RULE_ID","NF_PRE_TOTAL_CHARGE","TYPE_LIST","ISNT_TS","SPEED_TARGET","SPEED_ACTUAL","PHONE","ISNT_ITV","ISNT_WT_ITV","SZK_CHRG_LEVEL","TASK_NAME1","CARRY_MODE_DESC","PHOTO_FLAG","TERM_MONTHS","ISNT_WLGJ_TARGET","TERM_TYPE1","TERM_TYPE2","TERM_TYPE3","ISNT_4GGN","ST_FAV_CHANNEL_ID","ISNT_KXP","ISNT_GRDZ_TC","ISNT_GM","ISNT_CHCBHM","ISNT_KTGJMY","THIS_MONTH_FLOW","ZZ_FLAG","ISNT_SXGJ","ISNT_ACCT_OWE","KD_INNER_MONTHS","CPLB","ZZB_XL_FLAG","REASON_DESC","BLWLGJBT_FLAG","DLX_FLAG","DC_FLAG","ISNT_WT_TS","IF_WT","DEV_CODE","PRODUCT_TYPE","IP5_FLAG","YYZL","FLUX_CHARGE","ISNT_YJT","SJ_INNER_MONTHS"};
    
    /**
     * 客户群明细文件处理步骤
     * 目前处理步骤分为两步:
     * 1.生成客户群明细临时表,导入客户群服务号码数据
     * 2.生成客户群明细表,校验客户群明细临时表数据并导入客户群明细表
     * 
     */
    public static final String CUSTGROUP_DETAIL_FILE_HANDLESTEP_FIRST = new String("01");
    public static final String CUSTGROUP_DETAIL_FILE_HANDLESTEP_SECOND = new String("02");
    
    public static final String CUSTGROUP_DETAIL_FILE_HANDLESTEP_DESC_FIRST = new String("生成客户群明细临时表,导入客户群服务号码数据");
    public static final String CUSTGROUP_DETAIL_FILE_HANDLESTEP_DESC_SECOND = new String("生成客户群明细表,校验客户群明细临时表数据并导入客户群明细表");
    
    
	/**
	 * 默认分页属性
	 */
	public static final int DEFAULT_CURRENT_PAGE = 1;
	public static final int DEFAULT_PER_RECORD_COUNT = 10;
	public static final int DEFAULT_TOTAL_RECORD_COUNT = 0;
	
	/**
	 * 分页Id
	 */
	public static final String DEFAULT_PAGING_SEQ = new String("queryId");
	
	/**
	 * 事件大类
	 */
	public static final String EVENT_TYPE_FLOW = new String("1001");
	public static final String EVENT_TYPE_FEE = new String("1002");
	public static final String EVENT_TYPE_BUSI = new String("1003");
	
	/**
	 * 事件小类
	 */
	public static final String EVENT_CLASS_FLOW_SURPLUS = new String("10010001");//剩余流量事件
	public static final String EVENT_CLASS_FLOW_SET = new String("10010002");//套外流量事件
	public static final String EVENT_CLASS_FEE_SETFLOW = new String("10020001");//套外流量费用事件
	public static final String EVENT_CLASS_FEE_PAY = new String("10020002");//缴费事件
	public static final String EVENT_CLASS_BUSI_REALNAME = new String("10030001");//实名制事件
	
	/**
	 * 缴费支付金额
	 */
	public static final String FEE_PAY_START = new String("feePayStart");//费用支付起始金额
	public static final String FEE_PAY_END = new String("feePayEnd");//费用支付截止金额
	
	/**
	 * 组织类型
	 */
	public static final String GROUP_TYPE_MARKET_DEPARTMENT = new String("01");
	public static final String GROUP_TYPE_CUSTOMER_SERVICE_DEPARTMENT = new String("02");
	
	/**
	 * hive表客户群
	 */
	public static final String HIVE_TABLE_CUSTGROUP_LOAD = new String("custgroup_");
	
	/**
	 * 各种真与假
	 */
	public static final String TRUE_INT= new String("1");
	public static final String FLASE_INT= new String("0");
	public static final String TRUE_STR= new String("Y");
	public static final String FLASE_STR= new String("N");
	public static final String TRUE_UPPER= new String("TRUE");
	public static final String FLASE_UPPER= new String("FLASE");
	public static final String TRUE_LOWER= new String("true");
	public static final String FLASE_LOWER= new String("flase");
	
	/**
	 * Map的key类型
	 */
	public static final String KEY_TYPE_COUNT=new String("count");
	
	/**
	 * 营销案级别
	 */
	public static final String MARKET_CASE_LEVEL_SYNERGY = new String("02");
	
	/**
	 * 营销案类型(吉林移动)
	 */
	public static final String MARKET_CASE_TYPE_BATCH = new String("01");//批量类
	public static final String MARKET_CASE_TYPE_REAL = new String("02");//实时类
	
	/**
	 * 营销案类型
	 */
	public static final String MARKET_CASE_TYPE_MARKETING = new String("01");//营销类
	public static final String MARKET_CASE_TYPE_SERVICE = new String("02");//服务类
	public static final String MARKET_CASE_TYPE_PUBLIC_WELFARE = new String("03");//公益类
	
	/**
	 * 营销案业务类型
	 */
	public static final String MARKET_CASE_BUSI_TYPE_CALL = new String("01");//外呼
	
	/**
	 * 营销案状态
	 */
	public static final String MARKET_CASE_STATUS_DEFAULT= new String("00");
	public static final String MARKET_CASE_STATUS_NEW= new String("01");//新建
	public static final String MARKET_CASE_STATUS_AUDIT= new String("02");//服务待审批
	public static final String MARKET_CASE_STATUS_BACK= new String("03");
	public static final String MARKET_CASE_STATUS_EXE= new String("04");//执行中
	public static final String MARKET_CASE_STATUS_SUSPEND= new String("05");
	public static final String MARKET_CASE_STATUS_FINISH= new String("06");
	public static final String MARKET_CASE_STATUS_AUDIT_BUSSINESS= new String("08");//业务待审批
	public static final String MARKET_CASE_STATUS_PLANE = new String("09");//活动策划中
	public static final String MARKET_CASE_STATUS_DATACHECK = new String("10");//数据验证中
	public static final String MARKET_CASE_STATUS_CHECK = new String("11");//业务验证中
	public static final String MARKET_CASE_STATUS_WAITING = new String("12");//活动待推送
	public static final String MARKET_CASE_STATUS_GRAY = new String("13");//灰度发布
	public static final String MARKET_CASE_STATUS_ALREADY = new String("14");//活动已推送
	public static final String MARKET_CASE_STATUS_ALREADYSUN = new String("15");//活动已推送分公司
	public static final String MARKET_CASE_STATUS_CLOSE = new String("16");//活动关闭
	//测试中
	public static final String MARKET_CASE_STATUS_TEST= new String("07");
	public static final String MARKET_CASE_STATUS_DRAFT= new String("99");//草稿
	
	
	/**
	 * 审批状态
	 */
	public static final String MARKET_CASE_AUDIT_VIEW_PEND = new String("01");
	public static final String MARKET_CASE_AUDIT_VIEW_PASS = new String("02");
	public static final String MARKET_CASE_AUDIT_VIEW_BACK = new String("03");
	
	/**
	 * 审批顺序
	 */
	public static final String MARKET_CASE_AUDIT_ORDER_FIRST = new String("1");
	public static final String MARKET_CASE_AUDIT_ORDER_SECOND = new String("2");
	public static final String MARKET_CASE_AUDIT_ORDER_THRID = new String("3");
	public static final String MARKET_CASE_AUDIT_ORDER_FORTH = new String("4");
	public static final String MARKET_CASE_AUDIT_ORDER_FIFTH = new String("5");
	public static final String MARKET_CASE_AUDIT_ORDER_SIXTH = new String("6");
	
	/**
	 * 营销案默认优先级
	 */
	public static final String MARKET_CASE_DEFAULT_PRIORITY = new String("10");

	/**
	 * nosql rowkey
	 */
	public static final String NOSQL_ROWKEY = new String("rowkey");
	/**
	 * 号码类型
	 */
	public static final String NUM_TYPE_PHONE_NO = new String("1001");
	public static final String NUM_TYPE_DIAL_NO = new String("1002");//拨号账号
	public static final String NUM_TYPE_DIAL_IC = new String("1004");//拨号账号+身体证后4拉
	public static final String NUM_TYPE_CONTACT_NO = new String("1005");//联系人号码
	public static final String NUM_TYPE_ID_NO = new String("1006");
	public static final String NUM_TYPE_CUST_NO = new String("1007");
	public static final String NUM_TYPE_ACCOUNT_NO = new String("1008");
	
	/**
	 * 配置文件名称
	 */
	public static final String PROPERTIES_FILE_NAME_CONF= new String("conf.properties");
	public static final String PROPERTIES_FILE_NAME_DATASOURCE= new String("datasource.properties");
	public static final String PROPERTIES_FILE_NAME_HBASE= new String("hbase.properties");
	public static final String PROPERTIES_FILE_NAME_HIVE= new String("hive.properties");
	public static final String PROPERTIES_FILE_NAME_IMPALA= new String("impala.properties");
	public static final String PROPERTIES_FILE_NAME_KAFKA= new String("kafka.properties");
	public static final String PROPERTIES_FILE_NAME_REDIS= new String("rm_redis.properties");
	public static final String PROPERTIES_FILE_NAME_SPARK= new String("spark.properties");
	public static final String PROPERTIES_FILE_NAME_SPARKAPP= new String("sparkapp.properties");
	public static final String PROPERTIES_FILE_NAME_SMPP= new String("smppsender.properties");
	public static final String PROPERTIES_FILE_NAME_IDMM= new String("idmm.properties");
	
	/**
	 * 报文拼装方式
	 */
	public static final String PACKET_ASSEMBLY_TYPE= new String("json");
	
	/**
	 * 报文格式类型
	 */
	public static final String PACKET_PARAM_FORMAT_XML= new String("xml");
	public static final String PACKET_PARAM_FORMAT_JSON= new String("json");
	
	/**
	 * 报文节点名称
	 */
	public static final String PACKET_PARAM_NODE_POSITION_INFO_LIST= new String("POSITION_INFO_LIST");
	public static final String PACKET_PARAM_NODE_POSITION_ID= new String("POSITION_ID");
	public static final String PACKET_PARAM_NODE_ACT_LIST= new String("ACT_LIST");
	public static final String PACKET_PARAM_NODE_START_DATE= new String("START_DATE");
	public static final String PACKET_PARAM_NODE_ACT_NAME= new String("ACT_NAME");
	public static final String PACKET_PARAM_NODE_ACT_ID= new String("ACT_ID");
	public static final String PACKET_PARAM_NODE_ACT_BUSI_TYPE = new String("ACT_BUSI_TYPE");
	public static final String PACKET_PARAM_NODE_END_DATE= new String("END_DATE");
	public static final String PACKET_PARAM_NODE_ORDER_NO= new String("ORDER_NO");
	public static final String PACKET_PARAM_NODE_SEQ_ID= new String("SEQ_ID");
	public static final String PACKET_PARAM_NODE_ACT_DESC= new String("ACT_DESC");
	public static final String PACKET_PARAM_NODE_CONTENT_LIST= new String("CONTENT_LIST");
	public static final String PACKET_PARAM_NODE_CONTENT_ID= new String("CONTENT_ID");
	public static final String PACKET_PARAM_NODE_CONTENT_DETAIL_LIST= new String("CONTENT_DETAIL_LIST");
	public static final String PACKET_PARAM_NODE_PARAM_LIST= new String("PARAM_LIST");
	public static final String PACKET_PARAM_NODE_CONTENT_KEY= new String("CONTENT_KEY");
	public static final String PACKET_PARAM_NODE_CONTENT_VALUE= new String("CONTENT_VALUE");
	public static final String PACKET_PARAM_NODE_USER_LABEL_ID= new String("USER_LABEL_ID");
	public static final String PACKET_PARAM_NODE_USER_LABEL_NAME= new String("USER_LABEL_NAME");
	public static final String PACKET_PARAM_NODE_USER_LABEL_VALUE= new String("USER_LABEL_VALUE");
	public static final String PACKET_PARAM_NODE_TOUCH_HIS_LIST= new String("TOUCH_HIS_LIST");
	public static final String PACKET_PARAM_NODE_CHANNEL_ID= new String("CHANNEL_ID");
	public static final String PACKET_PARAM_NODE_SERVICE_NBR= new String("SERVICE_NBR");
	public static final String PACKET_PARAM_NODE_METHOD_NAME= new String("METHOD_NAME");
	public static final String PACKET_PARAM_NODE_CONTACT_FLAG= new String("CONTACT_FLAG");
	public static final String PACKET_PARAM_NODE_OPER_TIME= new String("OPER_TIME");
	public static final String PACKET_PARAM_NODE_ACCEPT_NAME= new String("ACCEPT_NAME");
	public static final String PACKET_PARAM_NODE_NOTE= new String("NOTE");
	public static final String PACKET_PARAM_NODE_USER_LABEL_LIST= new String("USER_LABEL_LIST");
	public static final String PACKET_PARAM_NODE_PROD_OFFER_ID= new String("PROD_OFFER_ID");
	public static final String PACKET_PARAM_NODE_PROD_OFFER_NAME= new String("PROD_OFFER_NAME");
	public static final String PACKET_PARAM_NODE_PROD_MONEY= new String("PROD_MONEY");
	public static final String PACKET_PARAM_NODE_PROD_MONTHS= new String("PROD_MONTHS");
	public static final String PACKET_PARAM_NODE_PROD_PRESTORE_MONEY= new String("PROD_PRESTORE_MONEY");
	public static final String PACKET_PARAM_NODE_PROD_GIVE_MONEY= new String("PROD_GIVE_MONEY");
	public static final String PACKET_PARAM_NODE_PRE_RULE_ID= new String("PRE_RULE_ID");
	public static final String PACKET_PARAM_NODE_PRE_RULE_NAME= new String("PRE_RULE_NAME");
	public static final String PACKET_PARAM_NODE_PRE_MONEY= new String("PRE_MONEY");
	public static final String PACKET_PARAM_NODE_PRE_MONTHS= new String("PRE_MONTHS");
	public static final String PACKET_PARAM_NODE_PRE_PRESTORE_MONEY= new String("PRE_PRESTORE_MONEY");
	public static final String PACKET_PARAM_NODE_PRE_GIVE_MONEY= new String("PRE_GIVE_MONEY");
	public static final String PACKET_PARAM_NODE_GROUP_ID= new String("GROUP_ID");
	public static final String PACKET_PARAM_NODE_GROUP_NAME= new String("GROUP_NAME");
	public static final String PACKET_PARAM_NODE_GROUP_MONEY= new String("GROUP_MONEY");
	public static final String PACKET_PARAM_NODE_GROUP_MONTHS= new String("GROUP_MONTHS");
	public static final String PACKET_PARAM_NODE_GROUP_PRESTORE_MONEY= new String("GROUP_PRESTORE_MONEY");
	public static final String PACKET_PARAM_NODE_GROUP_GIVE_MONEY= new String("GROUP_GIVE_MONEY");
	
	/**
	 * 查询列表类型
	 */
	public static final String QUERY_LIST_TYPE_AD= new String("Audit");
	public static final String QUERY_LIST_TYPE_ACT= new String("ActDemand");
	public static final String QUERY_LIST_TYPE_ADR= new String("Auditor");
	public static final String QUERY_LIST_TYPE_CG= new String("CustGroup");
	public static final String QUERY_LIST_TYPE_CGT= new String("CustGroupTemp");
	public static final String QUERY_LIST_TYPE_CS= new String("ChannelShow");
	public static final String QUERY_LIST_TYPE_DLAD= new String("DownLoadAudit");
	public static final String QUERY_LIST_TYPE_DNPP= new String("DifferentNetPhonePool");
	public static final String QUERY_LIST_TYPE_GREY= new String("GREY");
	public static final String QUERY_LIST_TYPE_LOGIN= new String("LOGIN");
	public static final String QUERY_LIST_TYPE_MC= new String("MarketCase");
	public static final String QUERY_LIST_TYPE_MCT= new String("MarketCaseTemp");
	public static final String QUERY_LIST_TYPE_GSC= new String("GlobalStrategyConfig");
	public static final String QUERY_LIST_TYPE_PD= new String("Product");
	public static final String QUERY_LIST_TYPE_POST= new String("Position");
	public static final String QUERY_LIST_TYPE_ROLE= new String("Role");
	public static final String QUERY_LIST_TYPE_ROLEDETAIL= new String("RoleDetail");
	public static final String QUERY_LIST_TYPE_ROLEDETAILLIST= new String("RoleDetailList");
	public static final String QUERY_LIST_TYPE_ROLEUSERREL= new String("RoleUserRel");
	public static final String QUERY_LIST_TYPE_PROD= new String("PRODUCT");
	public static final String QUERY_LIST_TYPE_PC= new String("priorityConfig");
	public static final String QUERY_LIST_TYPE_SMAC= new String("ShortMsgAccessCode");
	public static final String QUERY_LIST_TYPE_SM= new String("ShortMsg");
	public static final String QUERY_LIST_TYPE_TL = new String("TempLable");
	public static final String QUERY_LIST_TYPE_UD = new String("userData");
	public static final String QUERY_LIST_TYPE_WC = new String("WorkConfig");
	public static final String QUERY_LIST_TYPE_WOM = new String("WorkOperMonitor");
	public static final String QUERY_LIST_TYPE_TEMPLATE = new String("Template");
	public static final String QUERY_LIST_TYPE_CHOICE = new String("CHOICE");
	public static final String QUERY_LIST_TYPE_REPORTFORM = new String("ReportForm");
	public static final String QUERY_LIST_TYPE_QUESTION = new String("Question");
	public static final String QUERY_LIST_TYPE_PRODUCTREPORT = new String("productReport");
	/**
	 * 用户标签各场景使用时的查询字段
	 */
	public static final String[] QUERY_USER_LABEL_ITEM_BATCHPUSH= new String[]{"LATN_ID","PRD_INST_STAS_ID","PRD_ID","CHRG_LEVEL","INNER_MONTH","EXTEND_PAYMETHOD_NAME","OWE_CHARGE","DEV_NUM","LOS_NUM","ZZB_FLAG","ZZB_OFR_TYPE_ID","ZZB_CHRG_LEVEL","ZFK_FLAG","WIDE_TER","TERM_TYPE","TERM_FLAG","STAR_FLAG","HOLD_GRADE","HOLD_CHN","HIGH_FLAG","BTMS","SMZ_FLAG","LLXF","TCXF","MBQ_FLAG","QF_FLAG","ZK_FLAG","IF_YZF","XZ_NAME","IF_PREPAY","ITV_FLAG","SMART_FLAG","CARRY_MODE","FOUR_FLAG","DG_FLUX_FLAG","FLOW_FLAG","ISNT_DGJT_FLOWPACK","LAN_NUM_201510","HDITV_FLAG","FB_RULE_FLAG","FB_HC_RULE_FLAG","PRE_NET_NUM","LAN_NUM","ISNT_NF","NF_RULE_RE_MONTH","TYPE_E8","SPEED_UPPER_LIMIT","REASON_ID","FB_FLAG","TASK_NAME","ISNT_SMART","ISNT_FLOW","ISNT_4GCARD","ISNT_CRT_FB","ISNT_IFREE","ISNT_WJH","ISNT_BJR4GKZD","TERM_TYPE_NEW","LAST_MONTH_FLOW","ZH_INNER_MONTHS","ZTTZ","YTH_FLAG","R129_SBZ_FLAG","DBH_FLAG","YSYF","DK_FLAG","ISNT_ACCT_ITV","NF_END_MONTHS","PRE_RULE_TYPE","NF_TYPE","TASK_TYPE","GROUP_NAME_FOR_WT","PRICE_MONTHLY_PAYMENT","PHOTO_GROUP_CODE","PHOTO_VPN_CODE","YYXF","LLZL","TCZL","FK_NUM","CZ_FLAG","FK_FLAG","OFR_BIG_TYPE","OFR_TYPE","GROUP_NAME","SPEED_ID","CRT_DATE","COMPLETE_DATE","EFF_DATE","OFR_EFF_DATE","FB_BILLING_CYCLE_END","BTSC","PRE_RULE_ID","TYPE_NEW_ZZB","BIND_NBR","AVG_FEE_AGO_TOTAL","C_CHRG_LEVEL","C_OFR_ID","NF_PRE_RULE_ID","NF_PRE_TOTAL_CHARGE","TYPE_LIST","ISNT_TS","SPEED_TARGET","SPEED_ACTUAL","PHONE","ISNT_ITV","ISNT_WT_ITV","SZK_CHRG_LEVEL","TASK_NAME1","CARRY_MODE_DESC","PHOTO_FLAG","TERM_MONTHS","ISNT_WLGJ_TARGET","TERM_TYPE1","TERM_TYPE2","TERM_TYPE3","ISNT_4GGN","ST_FAV_CHANNEL_ID","ISNT_KXP","ISNT_GRDZ_TC","ISNT_GM","ISNT_CHCBHM","ISNT_KTGJMY","THIS_MONTH_FLOW","ZZ_FLAG","ISNT_SXGJ","ISNT_ACCT_OWE","KD_INNER_MONTHS","CPLB","ZZB_XL_FLAG","REASON_DESC","BLWLGJBT_FLAG","DLX_FLAG","DC_FLAG","ISNT_WT_TS","IF_WT","DEV_CODE","PRODUCT_TYPE","IP5_FLAG","YYZL","FLUX_CHARGE","ISNT_YJT","SJ_INNER_MONTHS"};
	
	/**
	 * 规则类型
	 */
	public static final String RULE_TYPE_CLOSE = new String("close");
	public static final String RULE_TYPE_TRIGGERRULE = new String("triggerRule");
	public static final String RULE_TYPE_GLOBALRULE_NODISTURB = new String("noDisturb");
	public static final String RULE_TYPE_GLOBALRULE_TOUCHCOUNT = new String("touchCount");
	public static final String RULE_TYPE_GLOBALRULE_TOUCHTIME = new String("touchTime");
	public static final String RULE_TYPE_FREQUENCY = new String("frequency");
	public static final String RULE_TYPE_MUTEX = new String("mutex");
	public static final String RULE_TYPE_UNTROUBLE = new String("unTrouble");
	public static final String RULE_TYPE_EVENT_PRODUCT = new String("productEvent");
	public static final String RULE_TYPE_EVENT_SYNERGY = new String("synergy");
	public static final String RULE_TYPE_EVENTTRIGGERCHANNEL = new String("eventTriggerChannel");
	public static final String RULE_TYPE_TASKADJUST = new String("taskAdjust");
	public static final String RULE_TYPE_EVALUATE = new String("evaluate");
	
	/**
	 * 规则编码
	 */
	public static final String RULE_CODE_SENDPORT = new String("sendPort");
	public static final String RULE_CODE_SENDDATE = new String("sendDate");
	public static final String RULE_CODE_TOUCHPERID = new String("touchPerid");
	public static final String RULE_CODE_STARTEND = new String("start-end");
	public static final String RULE_CODE_FREQUENCYRULE_DAYSPACE = new String("daySpace");
	public static final String RULE_CODE_FREQUENCYRULE_DAYTOUCHNUM = new String("dayTouchNum");
	public static final String RULE_CODE_FREQUENCYRULE_MONTHDAY = new String("monthDay");
	public static final String RULE_CODE_FREQUENCYRULE_FREQUENCYTYPE = new String("frequencyType");
	public static final String RULE_CODE_FREQUENCYRULE_TOUCHTOTAL = new String("touchTotal");
	public static final String RULE_CODE_FREQUENCYRULE_TOUCHPERIDL = new String("touchPerid");
	public static final String RULE_CODE_FREQUENCYRULE_WEEKDAY = new String("weekDay");
	public static final String RULE_CODE_MUTEXRULE_MUTEXMARKETCASE = new String("mutexMarketCase");
	public static final String RULE_CODE_UNTROUBLE_UNTROUBLECUST = new String("unTroubleCust");
	public static final String RULE_CODE_UNTROUBLE_UNTROUBLECUSTTYPE = new String("unTroubleCustType");
	public static final String RULE_CODE_UNTROUBLE_UNTROUBLETIME = new String("unTroubleTime");
	public static final String RULE_CODE_EVENT_PRODUCTID = new String("productId");
	public static final String RULE_CODE_EVENTTRIGGERCHANNEL = new String("eventTriggerChannel");
	public static final String RULE_CODE_CLOSE = new String("close");
	public static final String RULE_CODE_CLOSEPRODUCTID = new String("offerProductId");
	public static final String RULE_CODE_SYNERGY_ISCHANNELSYNERGY = new String("isChannelSynergy");
	public static final String RULE_CODE_SYNERGY_SYNERGYCHANNEL = new String("synergyChannel");
	public static final String RULE_CODE_TASKADJUST_FREQUENCYTYPE = new String("frequencyType");
	public static final String RULE_CODE_TASKADJUST_TOUCHTOTAL = new String("touchTotal");
	public static final String RULE_CODE_TASKADJUST_TASKADJUSTTYPE = new String("taskAdjustType");
	
	/**
	 * 规则编码值
	 */
	public static final String RULE_VALUE_DAY = new String("1");
	public static final String RULE_VALUE_WEEK = new String("2");
	public static final String RULE_VALUE_MONTH = new String("3");
	public static final String RULE_VALUE_GLOBALRULE_RULEID = new String("10000");
	public static final String RULE_PAR_CODE_MONTH = new String("monthDay");
	public static final String RULE_PAR_CODE_WEEK = new String("weekDay");
	public static final String RULE_PAR_CODE_DAY= new String("frequencyType");
	public static final String RULE_PAR_CODE_SOMEDAY = new String("dateTime");
	public static final String RULE_PAR_CODE_FRE= new String("frequencyType");
	
	/**
	 * 角色ID
	 */
	public static final String ROLE_ID_MARKETCASE_PLAN = new String("20170309112725101100001");//活动策划化中角色ID
	public static final String ROLE_ID_MARKETCASE_DATA = new String("20170309112725101100002");//活动数据验证中角色ID
	public static final String ROLE_ID_MARKETCASE_SERVICE = new String("20170309112725101100003");//活动业务验证中角色ID
    public static final String ROLE_ID_MARKETCASE_GRAY = new String("20170309112725101100004");//活动灰度发布角色ID
	
	/**
	 * 进程编号
	 */
    public static final String SHELLPROCESS_NO_WAITCREATEBATCHPUSH = new String("01");
	public static final String SHELLPROCESS_NO_WAITCREATEBATCHPUSHMSG = new String("16");
	public static final String SHELLPROCESS_NO_WAITCREATEBATCHPUSHPROD = new String("15");
	public static final String SHELLPROCESS_NO_WAITSENDBATCHPUSH = new String("02");
	public static final String SHELLPROCESS_NO_WAITCREATECALLTASK = new String("03");//外呼任务进程编号
	public static final String SHELLPROCESS_NO_WAITCREATECHANNELTASK = new String("04");
	public static final String SHELLPROCESS_NO_CUSGGROUPDB = new String("06");
	public static final String SHELLPROCESS_NO_SYNBASICDATA = new String("07");
	public static final String SHELLPROCESS_NO_SYNRMLOGINMSGINFO = new String("08");
	public static final String SHELLPROCESS_NO_SYNRMUSERRELINFO = new String("09");
	public static final String SHELLPROCESS_NO_SYNRMUSERLABELINFO = new String("10");
	public static final String SHELLPROCESS_NO_SYNCHANNELTASK = new String("11");
	public static final String SHELLPROCESS_NO_TASKADJUST = new String("12");
	public static final String SHELLPROCESS_NO_SYNRMUSERINFO = new String("13");
	public static final String SHELLPROCESS_NO_MARKETCASESTATUSCHANGE = new String("14");//营销案状态变更进程编号
	
	
	/**
	 * 进程名称
	 */
	public static final String SHELLPROCESS_NAME_WAITCREATEBATCHPUSHMSG = new String("loadWaitCreateBatchPushMarketCaseToCacheMsg");
	public static final String SHELLPROCESS_NAME_WAITCREATEBATCHPUSHPROD = new String("loadWaitCreateBatchPushMarketCaseToCacheProd");
	public static final String SHELLPROCESS_NAME_WAITSENDBATCHPUSH = new String("loadWaitSendBatchPushCache");
	public static final String SHELLPROCESS_NAME_WAITCREATECALLTASK = new String("loadWaitCreateCallTaskCache");
	public static final String SHELLPROCESS_NAME_WAITCREATECHANNELTASK = new String("loadWaitCreateChannelTaskCache");
	public static final String SHELLPROCESS_NAME_CUSGGROUPDB = new String("custGroupDb");
	public static final String SHELLPROCESS_NAME_SYNBASICDATA = new String("synBasicData");
	public static final String SHELLPROCESS_NAME_SYNRMLOGINMSGINFO = new String("synRmLoginMsgInfo");
	public static final String SHELLPROCESS_NAME_SYNRMUSERRELINFO = new String("synRmUserRelInfo");
	public static final String SHELLPROCESS_NAME_SYNRMUSERLABELINFO = new String("synRmUserLabelInfo");
	public static final String SHELLPROCESS_NAME_SYNCHANNELTASK = new String("synChannelTask");
	public static final String SHELLPROCESS_NAME_TASKADJUST = new String("taskAdjust");
	public static final String SHELLPROCESS_NAME_SYNRMUSERINFO = new String("synRmUserInfo");
	public static final String SHELLPROCESS_NAME_MARKETCASESTATUSCHANGE = new String("marketCaseStatusChange");//营销案状态变更进程名

	
	/**
	 * spark应用名
	 */
	public static final String SPARK_APPNAME_SPARKSTREAMINGTEST= new String("SparkStreamingTest");
	public static final String SPARK_APPNAME_RECEIVEACCEPTCOUPLEBACK = new String("ReceiveAcceptCoupleBack");
	public static final String SPARK_APPNAME_RECEIVECOUPLEBACK= new String("ReceiveCoupleBack");
	public static final String SPARK_APPNAME_RECEIVEPRODORDER= new String("ReceiveProdOrder");
	public static final String SPARK_APPNAME_RECEIVEFLOW= new String("ReceiveFlow");
	public static final String SPARK_APPNAME_RECEIVEFEE= new String("ReceiveFee");
	public static final String SPARK_APPNAME_RECEIVEBUSI= new String("ReceiveBusi");

	public static final String SPARK_APPNAME_RECEIVEGROUPMSGEVENT= new String("ReceiveGroupMsgEvent");
	public static final String SPARK_APPNAME_RECEIVETRIGGERMSGEVENT= new String("ReceiveTriggerMsgEvent");
	
	public static final String SPARK_APPNAME_GENERATEBATCHPUSHTASK= new String("GenerateBatchPushTaskPush");
	public static final String SPARK_APPNAME_GENERATECHANNELTASK= new String("GenerateChannelTaskPush");
	public static final String SPARK_APPNAME_GENERATECALLTASK= new String("GenerateCallTask");
	public static final String SPARK_APPNAME_LOADCALLCOUPLEBACK= new String("LoadCallCoupleBack");
	
	
	/**
	 * 分隔符,系统内禁止使用|线为分隔符
	 */
	public static final String SEPARATOR_COMMA= new String(",");
	public static final String SEPARATOR_UNDERLINE= new String("_");
	public static final String SEPARATOR_SUBSTRACTKEY= new String("-");
	public static final String SEPARATOR_DOLLARSIGN= new String("$");
	public static final String SEPARATOR_COLON= new String(":");
	public static final String SEPARATOR_AND= new String("&");
	public static final String SEPARATOR_TIPNO= new String("\\^");
	public static final String SEPARATOR_TILDE= new String("~");
	public static final String SEPARATOR_SOLIDUS= new String("/");
	public static final String SEPARATOR_BACKSLASH= new String("\\");
	public static final String SEPARATOR_16BIT0A = new String (new byte[]{0x01}); 
	
	
	/**
	 * 数据统计类型
	 */
	public static final String STATISTIC_TYPE_REALCONTACT_DAY = new String("realcontactByDay");
	public static final String STATISTIC_TYPE_REALCONTACT_MONTH = new String("realcontactByMonth");
	public static final String STATISTIC_TYPE_REALACCEPT_DAY = new String("channelRealAcceptByDay");
	public static final String STATISTIC_TYPE_CHANNELREALCONTACT_DAY = new String("channelRealcontactByDay");
	public static final String STATISTIC_TYPE_CHANNELRECOMMEND = new String("channelRecommend");
	public static final String STATISTIC_TYPE_MARKETCASEORDERBYMONTH = new String("marketCaseOrderByMonth");
	public static final String STATISTIC_TYPE_MARKETCASEORDERBYDAY = new String("marketCaseOrderByDay");
	public static final String STATISTIC_TYPE_MARKETCASEACCEPT = new String("marketCaseAccept");
	public static final String STATISTIC_TYPE_MARKETCASERECOMMEND = new String("marketCaseRecommend");
	public static final String STATISTIC_TYPE_CREATETASKCOUNT = new String("createTaskCount");
	public static final String STATISTIC_TYPE_SENDTASKCOUNT = new String("sendTaskCount");
	
	/**
	 * 系统应用类型，用于控制加载数据操作工具类
	 */
	public static final String SYSTEM_APP_TYPE_SIMPLEAPP= new String("simpleApp");
	public static final String SYSTEM_APP_TYPE_APP= new String("app");
	public static final String SYSTEM_APP_TYPE_SPARKSHELL= new String("sparkShell");
	public static final String SYSTEM_APP_TYPE_SPARKSTREAMING= new String("sparkStreaming");
	
	/**
	 * 系统环境类型
	 */
	public static final String SYSTEM_ENV_TYPE_DEV= new String("dev");
	public static final String SYSTEM_ENV_TYPE_TEST= new String("test");
	public static final String SYSTEM_ENV_TYPE_PROD= new String("prod");
	
	/**
	 * 关系数据库数据源
	 */
	public static final String DATABASE_RELATIONAL_SOURCE = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_DATASOURCE,"DATASOURCE.TYPE");
	
	/**
	 * 表名后缀
	 */
	public static final String TABLENAME_POSTFIX_CUSTGROUP_DETAIL_TEMP=new String("_detail_info_temp");
	public static final String TABLENAME_POSTFIX_CUSTGROUP_LABEL_TEMP=new String("_label_info_temp");
	/**
	 * 任务类型
	 */
	public static final String TASK_TYPE_VERIFY = new String("00");
	public static final String TASK_TYPE_NORMAL = new String("01");
	public static final String TASK_TYPE_EVENT = new String("07");
	/**
	 * 任务分区
	 */
	public static final String TASK_TYPE_EVENT_PARTITION = new String("99");
	/**
	 * 任务调配类型(按号码/按条件)
	 */
	public static final String TASKADJUST_TYPE_TASKID = new String("01");
	public static final String TASKADJUST_TYPE_CONDITION = new String("02");
	
	
	/**
	 * 模板类型
	 */
	public static final String TEMPLATE_TYPE_MARKETCASE = new String("01");
	public static final String TEMPLATE_TYPE_CUSTGROUP = new String("02");
	
	/**
	 * 推送类型
	 */
	public static final String TRIGGER_MODE_PUSH = new String("01");
	public static final String TRIGGER_MODE_NOTPUSH = new String("02");
	
	/**
	 * 灰名单id
	 */
	public static final String GREY_CUST_ID = new String("21");
	
	/**
	 * 湖北项目中订购量类型
	 */
	public static final String ORDER_NUM_THREE = new String("3");
	public static final String ORDER_NUM_SEVEN = new String("7");
	public static final String ORDER_NUM_FIFTH = new String("15");
	/**
	 * 湖北项目中默认发送号码
	 */
	public static final String DEFAULT_SOURCE_ADDR = new String("10086");
	/**
	 * rm_contentdetail_info表中 content_par_code 字段
	 */
	public static final String CONTENT_PARCODE_QUESTIONID= new String("questionId");
	public static final String IS_DRAFT= new String("1");//营销案草稿标志
	
}