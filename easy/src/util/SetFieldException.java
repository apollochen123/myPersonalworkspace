package util;

/**
 * <p>Title:应用集成平台</p>
 * <p>Description:用于处理CommagentMessage时抛出该异常</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: si-tech</p>
 * 
 * @author machunlin
 * @version 1.0.0
 */

public class SetFieldException extends AppException {

	private static final long serialVersionUID = 8591683709000204172L;

	public SetFieldException(String errMessage) {
		super(errMessage);
	}

	/**
	 * 用于在程序中抛出新的SetFieldException
	 * 
	 * @param ec
	 *            错误代码
	 * @param message
	 *            错误信息
	 */
	public SetFieldException(int errCode) {
		super(errCode, "");
	}

	/**
	 * 用于在程序中抛出新的SetFieldException
	 * 
	 * @param ec
	 *            错误代码
	 * @param message
	 *            错误信息
	 */
	public SetFieldException(int errCode, String errMessage) {
		super(errCode, errMessage);
	}

	/**
	 * 用于在ejb或javabean中收到非SetFieldException的异常时进行包装，实现异常链
	 * 
	 * @param errCode
	 *            错误代码
	 * @param errMessage
	 *            错误信息
	 * @param cause
	 *            导致抛出本异常的原因异常
	 */
	public SetFieldException(int errCode, String errMessage, Throwable cause) {
		super(errCode, errMessage, cause);
	}
}
