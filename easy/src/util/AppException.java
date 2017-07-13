package util;

import java.io.*;

/**
 * <p>Title: </p>
 * <p>Description: all business operate produces exception must inherit this </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: beijing si-tech information technology company</p>
 * @author breeze
 * @version 1.0
 */

public class AppException extends Exception {

  /** true：当前jdk版本1.4异常链已实现； false：低于1.4，自身实现异常链 */
  public final static boolean release14;
  /** A wrapped Throwable */
  protected Throwable cause = null;
  /** 初始错误代码 = -1 */
  protected static int errCode = -1;

  static {
    String vers = System.getProperty("java.version");
    if (vers.compareTo("1.4.0") >= 0) {
      release14 = true;
    }
    else {
      release14 = false;
    }
  }

  public AppException() {
    super("unknown Error occurred in application");
  }

  public AppException(int ec) {
    super("unknown Error occurred in application");
    errCode = ec;
  }

  public AppException(String message) {
    super(message);
  }

  public AppException(int ec, String message) {
    super(message);
    errCode = ec;
  }

  public AppException(String message, Throwable cause) {
    super(message);
    this.cause = cause;
  }

  public AppException(int ec, String message, Throwable cause) {
    super(message);
    errCode = ec;
    this.cause = cause;
  }

  public void printStackTrace() {
    // Print the stack trace for this exception.
    super.printStackTrace();
    if (!release14 && cause != null) {
      System.err.println("caused by:");
      cause.printStackTrace();
    }
  }

  public void printStackTrace(PrintStream s) {
    // Print the stack trace for this exception.
    super.printStackTrace(s);
    if (!release14 && cause != null) {
      s.println("caused by:");
      cause.printStackTrace(s);
    }
  }

  public void printStackTrace(PrintWriter w) {
    // Print the stack trace for this exception.
    super.printStackTrace(w);
    if (!release14 && cause != null) {
      w.println("caused by:");
      cause.printStackTrace(w);
    }
  }

  /**
   * return errCode with system level
   * @return default -1 unclassed exception
   */
  public int getErrorCode() {
    return errCode;
  }

  public String getMessage(){
    String msg=super.getMessage();
    if(msg.trim().equals("")){
      //msg=SystemUtils.getErrMsg(StringUtils.FormatStr(String.valueOf(errCode),4,"0"));
    }
    return msg;
  }

  /**
   * get the exception which this caseed by
   * @return source exception
   */
  public Throwable getCause() {
    return cause;
  }
}
