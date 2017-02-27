package it.uiip.digitalgarage.roboadvice.auth.model;




public class InternetUser extends UserAuth {
	
	private static final long serialVersionUID = -9019341603348974803L;
	
	private String numeroConto;
	
	
	public InternetUser() {
		super(TIPO_USER.INTERNET);
	}
	
	@Override
	public String getUsername() {
		return getNumeroConto();
	}
	
	public void setUsername(String numeroConto) {
		this.setNumeroConto(numeroConto);
	}
	
	public String getNumeroConto() {
		return numeroConto;
	}
	
	public void setNumeroConto(String numeroConto) {
		this.numeroConto = numeroConto;
	}
	

}

