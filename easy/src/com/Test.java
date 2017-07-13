package com;



import java.text.SimpleDateFormat;
import java.util.Date;

import util.CommagentConfig;
import util.CommagentContext;

public class Test {

	//31413e627fa02f84

	
		public void callService() throws Exception {
			String mml = "PHONE_NO=13558992655,COMMAND_CODE=905,STREAM_ID=,LANGUAGE=CN,LOOK=TRUE";
			//String mml = "MM_TYPE=SIM, METHOD=EN, MM=MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCraZ435an0seGndFyyYeqKqXiCf2ordxeHwbELfAauFR3mRRmaSTW37qsusiTNFT3joMjBcjSEbKoKlxcMCPkqSXcN0JCYxhteRSgUxzu2CXoeYU7teeFW+0D7/4cxpK1F2p+D52rrPB4Wmy5d8gHxjtTh9ztS/si6/QxfJY9r8rkSKgwkvhdm8KilxwCH6VGcpR+00E8SYjXMc4ek8Oa5S4fNvESoCmkSNvyTQ2exdLxeZsDrSg6ZFaF2/wpVEnU0+mZX8g1fwH0vTGrpseMO0CNXi7M1/ACB/rUW91CwyYDseF366b1gbnzXWDDdmhUBA+F3M59AxH91VZs8g8TJAgMBAAECggEADLjKBVwGQSLynHsGZjbeMWxihUzvlEpCdNDrUu7hkAoBLhXy0ICefAg6rDyMfqwU69ADFlhjjXCDLkYIb9w6oejR7TSNhsktPtHjJ6ehxuDtL1QJh5aEIvCC4jEU15phQc34CNIkHVFY6lSaHF7ZxhPTuPGgdYhzXW1qfaVL/7bk6zwiC8dF4zh541fuUtAmPMKDtAeY52Jz5Kg2/A7Qyz0D+YELe547KBKIN9zi5/RZAJYpOzUdxh5aAog6nP8Mv3iUOK7ZT3akc1cVt7UbQLdQFsOAhnMB14ytZwazkXBCht5GnU+8yGbgUrYoNufsQaJWRuEMk27vh8OuNAtwAQKBgQDWOvvo86qZFzyuaIWQgu8iLttZ5PLjp5JeOj2PWw0dQyktjn1WlyChH+CAe5eUTytc7e5kxPhkeCnRK7/iTqc6Wi++qPyeRT/K1/XgOiEvEUH0XzHaQ4Ds+XeGNQVtmkk2W2Gf9LVq77twI/mNDqFhT/yIT4xoKza08cnGKfhVRQKBgQDM1XDOkJXumeT4xmxMFeZXK6SyGWAbeIeraE92YSnY7quoOD6q349RuFquElmTIRAPLfzlVz+B9VXpgrUzih7tdXVodYiyj47OcoU5EK4FXkMxmQEK8yMPm/ly5fB8w8X6MQvtahSiAwh8Mi+/wKYCWK6CxmztlcpERDgmWZ2/tQKBgQC6zgY59LfO9LdCMfw9rh7NxOQa+AxgPQ/hwJFLfw7pdFXk1roulmuqdDx0bNEZTwu15feZwTQDj9CPB8IzmXgy5s95Rqu5axMcUsKhOq8S9s53Q8cZ1wEGIuZ5jaRlFUM/9eEj9ON5EwBz4brKqHZKf8/qIMuDTiNPFwNmG9TirQKBgDga8pYx9k9vqc8Wko1YpkoUMz1xQ+jiX87seG+Fd6/q1+vw1AF70MbihzwM3Ko3MS3nO9EZz9Rp/clDOxzN5WDHfoxJPVMjjUsxBRq3XeMsiZ0pOqbkKCNbZr05DGEwQqcgDhNOri4eRJG4MWoFe7NC1TIO5cFB+TAvu22NuG7NAoGAAXwzLegGYvdqRuhE7hSJQ6LgNkrjOTTzL0ZnKKo/9f95MoL6TMiCOi7RVg8G4Ore4KPalfxM90xPI4ey3Oaani7Hi1FUc5GNRbqti3Xqb4pGt9s6znMz6bWg/vgxuIiRBBkBLRQ18bDYI+Wst6T/osY+Lhvje9WrWpeJdbUZ/Hs=, data={\"imsi\":\"460040040000115\"@@@\"iccid\":\"898602B0231710000002\"}";
			
			//String mml="<ROOT><HEADER><POOL_ID>31</POOL_ID><CONTACT_ID></CONTACT_ID><USERNAME>CRMOP</USERNAME><PASSWORD>42yuxJJur6DrspEjCNQdlg==</PASSWORD><CHANNEL_ID>11</CHANNEL_ID><ROUTING><ROUTE_KEY>12</ROUTE_KEY><ROUTE_VALUE>11502025424065</ROUTE_VALUE></ROUTING></HEADER><BODY><LOGIN_NO>aagh5P</LOGIN_NO><PHONE_NO>13880688637</PHONE_NO><SELECT_TYPE>8281</SELECT_TYPE><BEGIN_DATE>20170511</BEGIN_DATE><END_DATE>20170516</END_DATE><TIME_TYPE>0</TIME_TYPE><CELL_FLAG>0</CELL_FLAG><CUST_FLAG>0</CUST_FLAG><GROUP_ID>10008</GROUP_ID><CUST_SERV_FLAG>1</CUST_SERV_FLAG><OLD_STATUS>0</OLD_STATUS><GPRS_FLAG>0</GPRS_FLAG><OP_CODE>11</OP_CODE></BODY></ROOT>";
			//����������
			CommagentContext ctrl = CommagentContext.conn_server("10.109.208.146", 33333);
			
			
			ctrl.send_msg_cli(CommagentConfig.MSGREQUEST, "810000", mml, 
					CommagentConfig.MSGBEGIN|CommagentConfig.MSGEND, 
					"1111",10);
			
				
			//��ȡ����Ӧ��
			String result = ctrl.recv_msg_cli().getMsgbodyAsString();
			ctrl.stop_conn();
			System.out.println("result="+new String(result.getBytes("GBK"),"GBK"));
		}
		public static void main(String[] args) throws Exception{
//			Test cli = new Test();
//			cli.callService();
//			System.out.println(257&0x00000100);
			   Date currentTime = new Date(95,7,6);
			   SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/YYYY");
			   String dateString = formatter.format(currentTime);
			   System.out.println(dateString);
			   
		}	
}
