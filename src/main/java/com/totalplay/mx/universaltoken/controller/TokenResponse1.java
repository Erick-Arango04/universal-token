package com.totalplay.mx.universaltoken.controller;


public class TokenResponse1 {
	
	
	private String result;
	private String resultIdentifier;
	private String resultDescription;
	private String code;
	
	
	
	public TokenResponse1(String result, String resultIdentifier, String resultDescription, String code ) {
		this.result = result;
		this.resultIdentifier = resultIdentifier;
		this.resultDescription = resultDescription;
		this.code = code;
		
	}
	
	
	public String getResult() {
		return result;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResultIdentifier() {
		return resultIdentifier;
	}
	public void setResultIdentifier(String resultIdentifier) {
		this.resultIdentifier = resultIdentifier;
	}
	public String getResultDescription() {
		return resultDescription;
	}
	public void setResultDescription(String resultDescription) {
		resultDescription = resultDescription;
	}
	
	

}
