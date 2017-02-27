package it.uiip.digitalgarage.roboadvice.auth.exception;

import org.springframework.security.core.AuthenticationException;

public class UsernamePasswordException extends AuthenticationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String codeMessage;
	
	public UsernamePasswordException(String message,String codeMessage, Throwable cause) {
		super(message, cause);
		this.codeMessage = codeMessage;
	}

	public UsernamePasswordException(String message,String codeMessage) {
		super(message);
		this.codeMessage = codeMessage;
	}
	
	public UsernamePasswordException (Throwable e){
		super(e.getMessage(),e);
	}
	
	public UsernamePasswordException (String message){
		super(message);
		this.codeMessage = message;
	}
	
	public String getCodeMessage() {
		return codeMessage;
	}

}

