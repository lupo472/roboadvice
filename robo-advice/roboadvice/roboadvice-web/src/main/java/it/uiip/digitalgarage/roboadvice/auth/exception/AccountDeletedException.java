package it.uiip.digitalgarage.roboadvice.auth.exception;

import org.springframework.security.core.AuthenticationException;

public class AccountDeletedException extends AuthenticationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String codeMessage;

	public AccountDeletedException(String message,String codeMessage, Throwable cause) {
		super(message, cause);
		this.codeMessage = codeMessage;
	}

	public AccountDeletedException(String message,String codeMessage) {
		super(message);
		this.codeMessage = codeMessage;
	}
	
	public String getCodeMessage() {
		return codeMessage;
	}

}

