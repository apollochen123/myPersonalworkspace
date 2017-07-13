package com;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.swing.JFileChooser;

import com.sun.org.apache.xml.internal.security.utils.Constants;



import sun.misc.BASE64Encoder;



	

	public class DESDecode_139Mail {
	        DESDecode_139Mail(){
	        }
	        /** 
	     * DES�㷨��Կ  Jio0421LJjkko90t
	     */  
	    //private static final String PASSWORD="Jio0421LJjkko90t";
	    /** 
	     * ���ݼ��ܣ��㷨��DES�� 
	     */  
	 
	        public static String encryptBasedDes(String KEY,String data,String  code) {
	                String encryptedData = null;
	                try {
	                        // DES�㷨Ҫ����һ�������ε������Դ
	                        SecureRandom sr = new SecureRandom();
	                        DESKeySpec deskey = new DESKeySpec(KEY.getBytes(code));
	                        // ����һ���ܳ׹�����Ȼ��������DESKeySpecת����һ��SecretKey����
	                        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
	                        SecretKey key = keyFactory.generateSecret(deskey);
	                        // ���ܶ���
	                        Cipher cipher = Cipher.getInstance("DES");
	                        cipher.init(Cipher.ENCRYPT_MODE, key, sr);
	                        // ���ܣ������ֽ����������ַ���
	                        BASE64Encoder be=new BASE64Encoder();
	                        encryptedData = be.encode(cipher.doFinal(data.getBytes(code)));
	                } catch (Exception e) {
	                      
	                }
	                return encryptedData;
	        }  
	    /** 
	     * ���ݽ��ܣ��㷨��DES�� 
	     */  
	    @SuppressWarnings("restriction")
	        public static String decryptBasedDes(String KEY,String cryptData,String  code) {  
	        String decryptedData = null;  
	        try {  
	            // DES�㷨Ҫ����һ�������ε������Դ  
	            SecureRandom sr = new SecureRandom();  
	            DESKeySpec deskey = new DESKeySpec(KEY.getBytes(code));  
	            // ����һ���ܳ׹�����Ȼ��������DESKeySpecת����һ��SecretKey����  
	            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");  
	            SecretKey key = keyFactory.generateSecret(deskey);  
	            // ���ܶ���  
	            Cipher cipher = Cipher.getInstance("DES");  
	            cipher.init(Cipher.DECRYPT_MODE, key, sr);  
	            // ���ַ�������Ϊ�ֽ����飬������  
	            decryptedData = new String(cipher.doFinal(new sun.misc.BASE64Decoder().decodeBuffer(cryptData)));  
	        } catch (Exception e) {  
	           
	        }  
	        return decryptedData;  
	    }  
	    
	    /**
	         * ��DES��������������ֽ� bytKey��Ϊ8�ֽڳ����ǽ��ܵ�����
	         */
	        public static void main(String[] args) {
//	              String  orgData = "12345";
	                
	                String orgData="12345";
	                String enData = DESDecode_139Mail.encryptBasedDes("Jio0421LJjkko90t",orgData,"utf-8");
	                System.out.println("����ǰ����:"+orgData);
	                System.out.println("��������:"+enData);
	                System.out.println("��������:"+DESDecode_139Mail.decryptBasedDes("Jio0421LJjkko90t",enData,"utf-8"));
	        }
	    /**
	         * ����������ַ���ʽ�������ֽ�������ʽ�� �������ַ�����AD67EA2F3BE6E5AD
	         * �����ֽ����飺{173,103,234,47,59,230,229,173}
	         */
	        private static byte[] getKeyByStr(String str) {
	                byte[] bRet = new byte[str.length() / 2];
	                for (int i = 0; i < str.length() / 2; i++) {
	                        Integer itg = new Integer(16 * getChrInt(str.charAt(2 * i))
	                                        + getChrInt(str.charAt(2 * i + 1)));
	                        bRet[i] = itg.byteValue();
	                }
	                return bRet;
	        }

	        /**
	         * ����һ��16�����ַ���10����ֵ ���룺0-F
	         */
	        private static int getChrInt(char chr) {
	                int iRet = 0;
	                if (chr == "0".charAt(0))
	                        iRet = 0;
	                if (chr == "1".charAt(0))
	                        iRet = 1;
	                if (chr == "2".charAt(0))
	                        iRet = 2;
	                if (chr == "3".charAt(0))
	                        iRet = 3;
	                if (chr == "4".charAt(0))
	                        iRet = 4;
	                if (chr == "5".charAt(0))
	                        iRet = 5;
	                if (chr == "6".charAt(0))
	                        iRet = 6;
	                if (chr == "7".charAt(0))
	                        iRet = 7;
	                if (chr == "8".charAt(0))
	                        iRet = 8;
	                if (chr == "9".charAt(0))
	                        iRet = 9;
	                if (chr == "A".charAt(0))
	                        iRet = 10;
	                if (chr == "B".charAt(0))
	                        iRet = 11;
	                if (chr == "C".charAt(0))
	                        iRet = 12;
	                if (chr == "D".charAt(0))
	                        iRet = 13;
	                if (chr == "E".charAt(0))
	                        iRet = 14;
	                if (chr == "F".charAt(0))
	                        iRet = 15;
	                return iRet;
	        }

	}

