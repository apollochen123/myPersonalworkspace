package com.sitech.strategy.persist.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.impl.conn.SchemeRegistryFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;

/**
* Create on 2017-1-5
* @author: wangpei
* @Title:HttpUtil
* @Description：
* @version 1.0
* update_data: update_author: update_note:
*/
public class HttpUtil{
  private static Log log = LogFactory.getLog(HttpUtil.class);
  public static final int HTTP_METHOD_GET = 1;
  public static final int HTTP_METHOD_POST = 2;
  private static Charset CHARSET = Charset.forName("GBK");
  private static DefaultHttpClient httpClient = null;
  private static final int HTTPCLIENT_MAXTOTAL = 100;
  private static final int HTTPCLIENT_MAXPERROUTE =  20;
  private static final int HTTPCLIENT_CONTIMEOUT = 60000;
  private static final int HTTPCLIENT_SOTIMEOUT =  50000;

  /** 
  * @date: 2017-1-5 
  * @author: wangpei
  * @title: setCharset 
  * @param charset 
  * @exception: 
  * @version: 1.0 
  * @description: 
  * update_version: update_date: update_author: update_note: 
  */
  public static void setCharset(String charset){
    if ((null != charset) && (!("".equals(charset))))
      CHARSET = Charset.forName(charset);
  }

  /** 
   * @date: 2017-1-5 
   * @author: wangpei
   * @title: setTimeout 
   * @param timeout 
   * @exception: 
   * @version: 1.0 
   * @description: 
   * update_version: update_date: update_author: update_note: 
   */
  public static void setTimeout(int timeout){
    httpClient.getParams().setParameter("http.socket.timeout", Integer.valueOf(timeout));
  }

  /** 
   * @date: 2017-1-5 
   * @author: wangpei
   * @title: invoke 
   * @param url
   * @param pin
   * @return 
   * @exception: 
   * @version: 1.0 
   * @description: 
   * update_version: update_date: update_author: update_note: 
  */
  public static String invoke(String url, String pin){
    return invoke(url, 2, pin);
  }

  /** 
   * @date: 2017-1-5 
   * @author: wangpei
   * @title: invoke 
   * @param url
   * @param method
   * @param pin
   * @return 
   * @exception: 
   * @version: 1.0 
   * @description: 
   * update_version: update_date: update_author: update_note: 
   */
  private static String invoke(String url, int method, String pin) {
    if (log.isDebugEnabled())
      log.debug("pin=" + pin);
    try
    {
      url = url.trim();
      HttpUriRequest request = httpMethod(url, method, pin);
      HttpResponse response = httpClient.execute(request);
      HttpEntity entity = response.getEntity();
      StatusLine status = response.getStatusLine();
      int statusCode = status.getStatusCode();
      String returnStr = EntityUtils.toString(entity, CHARSET);
      if (200 != statusCode)
      {
        log.debug("http status code " + statusCode + "\n" + returnStr);
      }

      return returnStr;
    }
    catch (ClientProtocolException cpe) {
      throw new RuntimeException("call [" + url + "] error!", cpe);
    }
    catch (IOException ioe) {
      throw new RuntimeException("call [" + url + "] error!", ioe);
    }
  }

  /** 
   * @date: 2017-1-5 
   * @author: wangpei
   * @title: httpMethod 
   * @param url
   * @param method
   * @param pin
   * @return 
   * @exception: 
   * @version: 1.0 
   * @description: 
   * update_version: update_date: update_author: update_note: 
   */
  private static HttpUriRequest httpMethod(String url, int method, String pin){
    switch (method)
    {
    case 1:
      return new HttpGet(url);
    case 2:
      HttpPost httpPost = new HttpPost(url);
      if ((null != pin) && (!("".equals(pin)))) {
        StringEntity reqEntity = new StringEntity(pin, CHARSET);
        if ('<' == pin.charAt(0)) {
          reqEntity.setContentType("application/xml;charset=" + CHARSET.name());
          httpPost.setHeader("Accept", "application/xml");
        }
        else {
          reqEntity.setContentType("application/json;charset=" + CHARSET.name());
          httpPost.setHeader("Accept", "application/json");
        }
        httpPost.setEntity(reqEntity);
      }
      return httpPost;
    }

    throw new RuntimeException("http method [" + method + "] no implement!");
  }

  static
  {
    PoolingClientConnectionManager conMan = new PoolingClientConnectionManager(SchemeRegistryFactory.createDefault());
    conMan.setMaxTotal(HTTPCLIENT_MAXTOTAL);
    conMan.setDefaultMaxPerRoute(HTTPCLIENT_MAXPERROUTE);

    httpClient = new DefaultHttpClient(conMan);

    HttpParams params = httpClient.getParams();
    HttpConnectionParams.setConnectionTimeout(params, HTTPCLIENT_CONTIMEOUT);
    HttpConnectionParams.setSoTimeout(params, HTTPCLIENT_SOTIMEOUT);
  }
}