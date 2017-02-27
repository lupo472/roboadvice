package it.uiip.digitalgarage.roboadvice.auth;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import it.uiip.digitalgarage.roboadvice.auth.exception.AccountDeletedException;
import it.uiip.digitalgarage.roboadvice.auth.exception.UsernamePasswordException;


public class InternetAuthenticationFailureHandler implements AuthenticationFailureHandler{
	
	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException ,ServletException {
		if(exception.getClass() == AccountDeletedException.class){
			AccountDeletedException exc = (AccountDeletedException)exception;
			response.sendRedirect("/serviceadvisor-web/#/");
			return;
		}else if(exception.getClass() == UsernamePasswordException.class){
			UsernamePasswordException exc = (UsernamePasswordException)exception;
			response.sendRedirect("/serviceadvisor-web/#/");
			return;
		}else{
			response.sendRedirect("/serviceadvisor-web/#/");
			return;
		}
	}

}

