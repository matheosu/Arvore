package binary.search.exception;

public class BinaryTreeException extends RuntimeException {

	private static final long serialVersionUID = -1245329778764367338L;
	private static final String NAME_EXCEPTION = "[" + BinaryTreeException.class.getSimpleName() + "] ";
	
	public BinaryTreeException() {
		super();
	}

	public BinaryTreeException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(NAME_EXCEPTION + message, cause, enableSuppression, writableStackTrace);
	}

	public BinaryTreeException(String message, Throwable cause) {
		super(NAME_EXCEPTION + message, cause);
	}

	public BinaryTreeException(String message) {
		super(NAME_EXCEPTION + message);
	}

	public BinaryTreeException(Throwable cause) {
		super(cause);
	}
	
	

}
