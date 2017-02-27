package it.uiip.digitalgarage.roboadvice.auth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import it.uiip.digitalgarage.roboadvice.auth.exception.UsernamePasswordException;
import it.uiip.digitalgarage.roboadvice.model.User;
import it.uiip.digitalgarage.roboadvice.persistence.DAOException;
import it.uiip.digitalgarage.roboadvice.persistence.idao.IDAOUser;


@Component
public class InternetAuthenticationProvider implements AuthenticationProvider {
	
	@Autowired
	IDAOUser daoUser; 
	
	@Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String name = authentication.getName();
        String password = authentication.getCredentials().toString();
        User user = null;
        try {
        	user = daoUser.loginUser(new User(name, password));
		} catch (DAOException e) {
			//throw new UsernamePasswordException(e);
		}
        if (user!=null) {
        	System.out.println(name + " " + password);
					List<GrantedAuthority> grantedAuths = new ArrayList<>();
					grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
					
					Authentication auth = new UsernamePasswordAuthenticationToken(user, password, grantedAuths);
					
					return auth;
				}else{
					throw new UsernamePasswordException("Username e/o Password Errati!");
				}
	}
 
    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.isAssignableFrom(UsernamePasswordAuthenticationToken.class);
    }
}
