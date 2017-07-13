package service;

import java.util.List;

import bean.AttendBean;
import bean.PaymentBean;
import domain.AttendType;
import domain.Manager;

public interface EmpManager {

		//登录失败
		public static final int LOGIN_FAIL=0;
		//普通员工登录
		public static final int LOGIN_EMP=1;
		//经理登录
		public static final int LOGIN_MGR=2;
		
		//不能打卡
		public static final int NO_PUNCH=0;
	    //只能上班打卡
		public static final int COME_PUNCH=1;
	    //只能下班打卡
		public static final int LEAVE_PUNCH=2;
	    //既可以上班打卡，也可以下班打卡
		public static final int BOTH_PUNCH=3;
	   
		//打卡失败
		public static final int PUNCH_FAIL=0;
	    //已经打卡
		public static final int PUNCHED=1;
	    //打卡成功
		public static final int PUNCH_SUCC=2;

		// 以上午11点为上午时间
		public static final int AM_LIMIT = 11;
	    // 以上午9点之前为正常上班
		public static final int COME_LIMIT = 9;
		// 以上午9~11点之间算迟到
		public static final int LATE_LIMIT = 11;
		// 以下午18点之后算正常下班
		public static final int LEAVE_LIMIT = 18;
		// 以下午16~18点之间算早退
		public static final int EARLY_LIMIT = 16;    
		
		/**以经理身份登录
		 * @param mgr 登录经理
		 * @return登录确认号，0为失败，1为登录emp，2为登录mgr
		 * */
		int validLogin(Manager mgr);
		
		/*自动打卡，周一至周五，早上7点为每个员工插入旷工纪录
		 * */
		void autoPunch();
		
		/**每月1号自动结算工资
		 * */
		void autoPay();
		
		/**验证是否可以打卡
		 * @param String empName
		 * @param dutyDay 日期
		 * @return 打卡类别
		 */
		int validPunch(String empName,String dutyDay);
		
		/**打卡
		 * @param String empName
		 * @param dutyDay 日期
		 * 是否是上班打卡boolean isCome
		 * @return 打卡结果
		 */
		int punch(String empName,String dutyDay,boolean isCome);
		/**
		 * 根据员工浏览自己的工资
		 * @param empName 员工名
		 * @return 该员工的工资列表
		 */
		List<PaymentBean> empSalary(String empName);
		
		/**
	 	 * 员工查看自己的最近三天非正常打卡
		 * @param empName 员工名
		 * @return 该员工的最近三天的非正常打卡
		 */
		List<AttendBean> unAttend(String empName);
		
		/**
		 * 返回全部的出勤类别
		 * @return 全部的出勤类别
		 */
		List<AttendType> getAllType();
		
		/**
		 * 添加申请
		 * @param attId 申请的出勤ID
		 * @param typeId 申请的类型ID
		 * @param reason 申请的理由
		 * @return 添加的结果
		 */
		boolean addApplication(int attId , int typeId , String reason);
}
