package com.sitech.strategy.common.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类
* @date: 2016-9-5 
* @author: sunliang 
* @title: DateUtil 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public final class DateUtil {
	
	/**
	 * 时间格式：yyyy-MM-dd HH:mm:ss
	 */
    public static final String TIME_FROMAT_SIMPLE1 = new String("yyyy-MM-dd HH:mm:ss");
	/**
	 * 时间格式：yyyy/MM/dd HH:mm:ss
	 */
    public static final String TIME_FROMAT_SIMPLE2 = new String("yyyy/MM/dd HH:mm:ss");
	/**
	 * 时间格式：yyyyMMddHHmmss
	 */
    public static final String TIME_FROMAT_SIMPLE3 = new String("yyyyMMddHHmmss");
	/**
	 * 时间格式：yyyy年MM月dd日 HH点mm分ss秒
	 */
    public static final String TIME_FROMAT_SIMPLE4 = new String("yyyy年MM月dd日 HH点mm分ss秒");
    /**
     * 时间格式：yyyy-MM-dd HH:mm
     */
    public static final String TIME_FROMAT_SIMPLE5 = new String("yyyy-MM-dd HH:mm");
    /**
     * 时间格式：HH:mm:ss
     */
    public static final String TIME_FROMAT_HHMMSS = new String("HH:mm:ss");
    /**
     * 时间格式：HH:mm
     */
    public static final String TIME_FROMAT_HHMM = new String("HH:mm");
	/**
	 * 日期格式：yyyyMMdd
	 */
    public static final String DATE_FROMAT_YYYYMMDD1 = new String("yyyyMMdd");
	/**
	 * 日期格式：yyyy-MM-dd
	 */
    public static final String DATE_FROMAT_YYYYMMDD2 = new String("yyyy-MM-dd");
    /**
     * 日期格式：yyyymm
     */
    public static final String DATE_FROMAT_YYYYMM = new String("yyyyMM");
    
    public static String yMd6 = new String("yyyyMMdd060000");//6点赠费
    public static String yMd18 = new String("yyyyMMdd180000");//18点赠费
	
    /**
     * 字符串类型转时间类型
    * @date: 2016-9-5 
    * @author: sunliang 
    * @title: StringToDate 
    * @param dateStr
    * @param formatStr
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final Date StringToDate(String dateStr,String formatStr){
		SimpleDateFormat sf = new SimpleDateFormat(formatStr);
		Date date = null;
		try {
			date = sf.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	
    /**
     * 时间类型转字符串类型
    * @date: 2016-9-5 
    * @author: sunliang 
    * @title: DateToString 
    * @param date
    * @param formatStr
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final String DateToString(Date date,String formatStr){
		SimpleDateFormat sf = new SimpleDateFormat(formatStr);
		return sf.format(date);
	}
	
    /**
     * 增加天数
    * @date: 2016-9-5 
    * @author: sunliang 
    * @title: addDays 
    * @param date
    * @param addDays
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final Date addDays(Date date,int addDays){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, addDays);
		return calendar.getTime();
	}
    
    /**
     * 增加天数
    * @date: 2017-3-18 
    * @author: sunliang 
    * @title: addDays 
    * @param dateStr
    * @param addDays
    * @param inFormat
    * @param outFormat
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final String addDays(String dateStr,int addDays,String inFormat,String outFormat){
    	Date date = StringToDate(dateStr,inFormat);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, addDays);
		Date retDate = calendar.getTime();
		return DateToString(retDate,outFormat);
    }
    
    /**
     * 增加分钟
    * @date: 2016-11-7 
    * @author: sunliang 
    * @title: addMinutes 
    * @param date
    * @param addMinutes
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final Date addMinutes(Date date,int addMinutes){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MINUTE, addMinutes);
		return calendar.getTime();
    }
    
	/** 
	 * 校验时间是否为最近几小时以内
	* @date: 2016-11-29 
	* @author: songxj
	* @title: checkLatestOneHour 
	* @param queryDate
	* @param hours
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
    public static final boolean checkLatestHours(String queryDate, int hours){
		Date queryDateTime = DateUtil.StringToDate(queryDate, DateUtil.TIME_FROMAT_SIMPLE1);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(queryDateTime);
		calendar.add(Calendar.HOUR, hours);
		Date queryDateOneHourLater = calendar.getTime();
		Date nowDate = new Date();
		if (queryDateTime.before(nowDate) && nowDate.before(queryDateOneHourLater)) {
			return true;
		}
		return false;
	}
    
    /**
     * 得到当前日
    * @date: 2016-12-20 
    * @author: sunliang 
    * @title: getCurrentDay 
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final String getCurrentDay(){
    	return DateToString(new Date(),DATE_FROMAT_YYYYMMDD1);
    }
    
    /**
     * 得到当前月
    * @date: 2016-12-20 
    * @author: sunliang 
    * @title: getCurrentMonth 
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final String getCurrentMonth(){
    	return DateToString(new Date(),DATE_FROMAT_YYYYMM);
    }
    
    /**
     * 获取当月的第几天，从1开始
    * @date: 2016-11-9 
    * @author: zhangjj_crmpd
    * @title: getDayOfMonth 
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final Integer getDayOfMonth(){
    	Calendar now = Calendar.getInstance();
    	return now.get(now.DAY_OF_MONTH);
    }
    
    /**
     * 获取星期几,一周的第一天为周一
    * @date: 2016-11-9 
    * @author: zhangjj_crmpd
    * @title: getDayOfWeek 
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final Integer getDayOfWeek(){
    	Calendar now = Calendar.getInstance();
    	//一周第一天是否为星期天
    	boolean isFirstSunday = (now.getFirstDayOfWeek() == Calendar.SUNDAY);
    	//获取周几
    	int weekDay = now.get(Calendar.DAY_OF_WEEK);
    	//若一周第一天为星期天，则-1
    	if(isFirstSunday){
    		weekDay = weekDay - 1;
    		if(weekDay == 0){
    			weekDay = 7;
    		}
    	}
    	return weekDay;
    }
    
    /**
     * 判断当前时间是否在某个时间段内容
    * @date: 2016-11-16 
    * @author: yangwl
    * @title: judgeCurrentInTimePeriod 
    * @param beforTime
    * @param afterTime
    * @param format YYYY-MM-DD 或者  HH:mi:ss
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final boolean isCurrentInTimePeriod(String beforTime, String afterTime, String format){
    	boolean flag = false;
    	String nowDay = DateUtil.DateToString(new Date(), DATE_FROMAT_YYYYMMDD2);
    	if(TIME_FROMAT_HHMMSS.equals(format)){
			String nowTimeString = DateUtil.DateToString(new Date(), TIME_FROMAT_SIMPLE1);
			Date nowTime = DateUtil.StringToDate(nowTimeString, TIME_FROMAT_SIMPLE1);
			Date startTime = DateUtil.StringToDate(nowDay + " "+ beforTime, TIME_FROMAT_SIMPLE1);
			Date endTime = DateUtil.StringToDate(nowDay + " " + afterTime, TIME_FROMAT_SIMPLE1);
			if (startTime.before(nowTime) && endTime.after(nowTime)) {
				flag = true;
			}
    	}
    	if(DATE_FROMAT_YYYYMMDD2.equals(format)){
    		Date nowDate = DateUtil.StringToDate(nowDay, DATE_FROMAT_YYYYMMDD2);
    		Date startDate = DateUtil.StringToDate(beforTime, DATE_FROMAT_YYYYMMDD2);
    		Date endDate = DateUtil.StringToDate(afterTime, DATE_FROMAT_YYYYMMDD2);
    		if (startDate.before(nowDate) && endDate.after(nowDate) || startDate.equals(nowDate) || endDate.equals(nowDate)) {
    			flag = true;
    		}
    	}
    	if(TIME_FROMAT_HHMM.equals(format)){
			String nowTimeString = DateUtil.DateToString(new Date(), TIME_FROMAT_SIMPLE5);
			Date nowTime = DateUtil.StringToDate(nowTimeString, TIME_FROMAT_SIMPLE5);
			Date startTime = DateUtil.StringToDate(nowDay + " "+ beforTime, TIME_FROMAT_SIMPLE5);
			Date endTime = DateUtil.StringToDate(nowDay + " " + afterTime, TIME_FROMAT_SIMPLE5);
			if (startTime.before(nowTime) && endTime.after(nowTime)) {
				flag = true;
			}
    	}
		return flag;
    }
	
    /** 校验当前时间是否在起始时间内
	* @date: 2016-12-9 
	* @author: wangpei
	* @title: isEffective 
	* @param startTime
	* @param endTime
	* @param fromat
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public static final boolean isEffective(String startTime,String endTime,String fromat){
		if (CommonUtils.objectIsNull(startTime) || CommonUtils.objectIsNull(endTime) || CommonUtils.objectIsNull(fromat)) {
			return false;
		}
		String nowDay = DateUtil.DateToString(new Date(), fromat);
		Date nowDate = DateUtil.StringToDate(nowDay, fromat);
		Date startDate = DateUtil.StringToDate(startTime, fromat);
		Date endDate = DateUtil.StringToDate(endTime, fromat);
		if (nowDate.before(startDate) || nowDate.after(endDate)) {
			return false;
		}
		return true;
	}

	/**
     * 日期格式转换
    * @date: 2016-9-5 
    * @author: sunliang 
    * @title: stringToString 
    * @param dateStr
    * @param fromFormat
    * @param toFormat
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final String stringToString(String dateStr,String fromFormat,String toFormat){
		Date d = StringToDate(dateStr,fromFormat);
		String str = DateToString(d,toFormat);
		return str;
	}
    
    /**
     * 日期字符串转换成数据库中的Date(兼容oracle、mysql)
    * @date: 2016-9-28 
    * @author: zhangjj_crmpd
    * @title: stringToTimestamp 
    * @param dateStr
    * @param formatStr
    * @return
    * @throws ParseException 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final Timestamp string2Timestamp(String dateStr,String formatStr) throws StrategyError{
    	if(CommonUtils.objectIsNull(dateStr)){
    		return  null;
    	}
    	try {
    		SimpleDateFormat sf = new SimpleDateFormat(formatStr);
        	return new Timestamp(sf.parse(dateStr).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
			throw new StrategyError(e);
		}
    	
    }
    
    /**
     * 将数据库时间格式转换为字符串(兼容oracle、mysql)
    * @date: 2016-10-10 
    * @author: zhangjj_crmpd
    * @title: timestamp2String 
    * @param timestap
    * @param formatStr
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final String timestamp2String(Timestamp timestap,String formatStr){
    	if(CommonUtils.objectIsNull(timestap)){
    		return  null;
    	}
    	SimpleDateFormat sf = new SimpleDateFormat(formatStr);
        return sf.format(timestap);
    }
    
	  /**
	  * 下几个月最后一天的18点（字符串）
	  * @Create on 2015-9-8 
	  * @author: wangdw
	  * @Title: getLashDayOfMonth18String 
	  * @Description: 
	  * @param nextMonth
	  * @return 
	  * @version 1.0 
	  * update_date: update_author: update_note:
	  */
	 public static String getLashDayOfMonth18String(int nextMonth) {
		 SimpleDateFormat sdf=new SimpleDateFormat(yMd18);  //24进制
		 Date d = getLastDayOfMonth(nextMonth);
		 return sdf.format(d);
	 }
	
	  /**
	   * Create on 2015-4-25 
	   * @author: hanzh_bj
	   * @Title: getNextMonthFirstDate 
	   * @Description: 获取下月一号
	   * @return 
	   * @version 1.0 
	   * update_data:       update_author:       update_note:
	   */
	  public static String getNextMonthFirstDate(){
		  SimpleDateFormat sdf=new SimpleDateFormat(yMd6);  //24进制
		  Calendar c = Calendar.getInstance();
		  Date d = new Date();  
		  int year  = c.get(Calendar.YEAR);  
		  int month = c.get(Calendar.MONTH);  
		  if(month==11){
			  month = 0;
			  year = year +1;
		  }else{
			  month = month+1;
		  }
		  c.set(Calendar.YEAR, year);
		  c.set(Calendar.MONTH, month);
		  c.set(Calendar.DAY_OF_MONTH, 1);
		  d = c.getTime();
		  return sdf.format(d);
	  }
	  
	  /**
	  * 获得下几个月的最后一天18点（日期）
	  * @Create on 2015-9-8 
	  * @author: wangdw
	  * @Title: getLastDayOfMonth 
	  * @Description: 
	  * @param nextMonth
	  * @return 
	  * @version 1.0 
	  * update_date: update_author: update_note:
	  */
	 public static Date getLastDayOfMonth(int nextMonth) {
		 Calendar c = Calendar.getInstance();
  		 Date d = new Date();
		 int year = c.get(Calendar.YEAR);
		 int month = c.get(Calendar.MONTH);
		 int n = (nextMonth + month) / 12;
		 int m = (nextMonth + month) % 12;
		 year += n;
		 month = m;
		 c.set(Calendar.YEAR, year);
		 c.set(Calendar.MONTH, month);
		 int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		 c.set(Calendar.DAY_OF_MONTH, lastDay);
		 d = c.getTime();
		 return d;
	 }
	 
}
