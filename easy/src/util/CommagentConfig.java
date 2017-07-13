package util;

/**
 * <p>Title:Ӧ�ü���ƽ̨��ͨ�Ź���ģ��API������Ϣ</p>
 * <p>Description:������Ҫ��������CommagentMessage</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: si-tech</p>
 * 
 * @author machunlin
 * @version 1.0.0
 */

public class CommagentConfig {
	
	public static int COMM_PERMS = 0660;                                       /*???????*/
	
	public static int MAXCONN = 1024;                                              /*Commagent���������*/
	
	public static int CMDSUCCESS = 0;                                               /*����ɹ����ش���*/
	
	public static int MSGBEGIN = 0x00000001;                                /*�������ݰ��ĵ�һ����־*/
	
	public static int MSGCONTINUE = 0x00000010;                       /*�������ݰ����м����־*/
	
	public static int MSGEND = 0x00000100;                                    /*�������ݰ������һ����־*/
	
	public static int MSGCHECK = 0x00000110;                                 /*???????*/
	
	public static int SYSNULL = 0;                                                       /*???????*/
	
	public static int SYSFREE = 1;                                                        /*???????*/
	
	public static int SYSBUSY = 2;                                                       /*???????*/
	
	public static int SYSWAIT = 3;                                                      /*???????*/
	
	public static byte ISTRUE = '1';                                                    /*������ʾ���һ��*/
	
	public static byte NOTTRUE = '0';                                                /*������ʾ�����һ��*/
	
	public static byte BREAKHEART = '0';                                          /*��������־*/
	
	public static byte SRVREGISTER = '1';                                         /*ע�����־*/
	
	public static byte MSGREQUEST = '3';                                        /*�������־*/
	
	public static byte MSGRESPONSE = '4';                                      /*��Ӧ����־*/
	
	public static byte MSGGETNEXT = '5';                                        /*???????*/
	
	public static byte MSGREADY = '6';                                             /*???????*/
	
	public static int MAXDLEN = 9999;                                               /*�����峤�� 1M*/
	
	public static int HEADLEN = 80;                                                    /*��ͷ����*/
	
	public static String MSGFLAG = "`DC`";                                      /*��ʼ��־��"`DC`"*/
	
	public static String VER01 = "01";                                                  /* �汾�� "01" */
	
	public static int msgflag_LEN = 4;                                                 /* ��ʼ��־ռλ����*/
	
	public static int version_LEN = 2;                                                  /* �汾��ռλ����*/
	
	public static int msglength_LEN = 4;                                             /* ��Ϣ���ȣ�����4λ���㣬���8000ռλ���� */
	
	public static int appid_LEN = 6;                                                     /* ��������ռλ���� */
	
	public static int transid_LEN = 10;                                                /* �����־��Ψһ����ţ�����10λ����ռλ���� */
	
	public static int transnum_LEN = 6;                                              /* �����ڷ�����ţ�����������,����6λ����ռλ���� */
	
	public static int codetime_LEN = 6;                                              /* ������,��λ��(��Ӧ���ʶ),����6λ����ռλ����*/
	
	public static int positionid_LEN = 8;                                             /* ��������ͻ���ʶռλ���� */
	
	public static int userid_LEN = 8;                                                   /* ͨ�Ŵ���ͻ���ʶռλ���� */
	
	public static int streamid_LEN = 8;                                               /* ͨ�����������ռλ����*/
	
	public static final int priority_LEN = 2;                                        /*���ȼ�ռλ����*/
	
	public static final int transcode_LEN = 14;                                  /*���״���ռλ����*/	
	
	public static final String RSP_BREAKHEART = "000009";        /*������������*/
}
