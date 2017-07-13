package exception;

public class HrException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 48L;
	public HrException(){}
	public HrException(String msg)
	{
		super(msg);
	}
}
