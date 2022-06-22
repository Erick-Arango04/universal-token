package com.totalplay.mx.universaltoken.controller;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class TokenRequest {
	
	
	
	@Size(min = 3, max = 5, message = "valores validos, email o sms ")
	@NotBlank
	private String function;
	
	@NotBlank(message = "ingresa un numero de ")
	private String email;
	
	// en caso de que se mande la lada debe de tener esta validacion
	@Size(min = 3, max = 3, message = "lada invalida")
	private String lada;
	
	@NotBlank
	@Size(min = 5, max = 20)
	private String canal;
	
	
	
	public TokenRequest(String function, String email, String canal, String lada) {
		this.function = function;
		this.lada = lada;
		this.email = email;
		this.canal = canal;
	}
	
	
	public String getLada() {
		return lada;
	}


	public void setLada(String lada) {
		this.lada = lada;
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
