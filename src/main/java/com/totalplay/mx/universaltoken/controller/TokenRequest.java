package com.totalplay.mx.universaltoken.controller;

public class TokenRequest {
	
	private String function;
	private String email;
	private String canal;
	
	
	
	public TokenRequest(String function, String email, String canal) {
		this.function = function;
		this.email = email;
		this.canal = canal;
	}
	
	
	public String getFunction() {
		return function;
	}

	
	public void setFunction(String function) {
		this.function = function;
	}

	
	public String getEmail() {
		return email;
	}
	

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCanal() {
		return canal;
	}

	
	public void setCanal(String canal) {
		this.canal = canal;
	}
	
	
	

}
