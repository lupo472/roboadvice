package it.uiip.digitalgarage.roboadvice.auth;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import it.uiip.digitalgarage.roboadvice.logic.model.User;

public class InternetAuthenticationSuccessHandler implements AuthenticationSuccessHandler{
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,HttpServletResponse response, Authentication authentication)	throws IOException, ServletException {
		if(authentication!=null){
			if(authentication.getPrincipal() instanceof User){
				request.getSession().setAttribute("user", ((User) authentication.getPrincipal()));
			}
		}
		response.sendRedirect("profilo/");
	}

}

