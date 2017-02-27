package it.uiip.digitalgarage.roboadvice.auth.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public abstract class UserAuth implements Serializable, UserDetails, CredentialsContainer {
	
	public static enum TIPO_USER{INTERNET,INTRANET}
	
	private static final long serialVersionUID = -9019341603348974803L;
	private Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
	
	private TIPO_USER tipoUser;
	
	public UserAuth(TIPO_USER tipoUser) {
		this.tipoUser = tipoUser;
	}
	
	public TIPO_USER getTipoUser() {
		return tipoUser;
	}
	
	public boolean isInternet(){
		return this.tipoUser == TIPO_USER.INTERNET;
	}
	
	public boolean isIntranet(){
		return this.tipoUser == TIPO_USER.INTRANET;
	}
	
	@Override
	public void eraseCredentials() {
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return grantedAuthorities;
	}
	
	public void addAuthority(GrantedAuthority grantedAuthority) {
		this.grantedAuthorities.add(grantedAuthority);
	}

	@Override
	public String getPassword() {
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}

