package it.uiip.digitalgarage.roboadvice.model;

public class User {
	
	private Long id;
	private String username;
	private String password;
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	

}
