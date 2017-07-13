package util;

/**
 * <p>Title:Ӧ�ü���ƽ̨</p>
 * <p>Description:���ڴ���CommagentMessageʱ�׳����쳣</p>
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
	 * �����ڳ������׳��µ�SetFieldException
	 * 
	 * @param ec
	 *            �������
	 * @param message
	 *            ������Ϣ
	 */
	public SetFieldException(int errCode) {
		super(errCode, "");
	}

	/**
	 * �����ڳ������׳��µ�SetFieldException
	 * 
	 * @param ec
	 *            �������
	 * @param message
	 *            ������Ϣ
	 */
	public SetFieldException(int errCode, String errMessage) {
		super(errCode, errMessage);
	}

	/**
	 * ������ejb��javabean���յ���SetFieldException���쳣ʱ���а�װ��ʵ���쳣��
	 * 
	 * @param errCode
	 *            �������
	 * @param errMessage
	 *            ������Ϣ
	 * @param cause
	 *            �����׳����쳣��ԭ���쳣
	 */
	public SetFieldException(int errCode, String errMessage, Throwable cause) {
		super(errCode, errMessage, cause);
	}
}
