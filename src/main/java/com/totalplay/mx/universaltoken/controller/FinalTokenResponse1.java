package com.totalplay.mx.universaltoken.controller;

public class FinalTokenResponse1 {

	
    private TokenResponse1 results;
    private String code;
	
	FinalTokenResponse1(String result, String resultIdentifier, String resultDescription, String code ){
		
		results = new TokenResponse1( result, resultIdentifier, resultDescription);
		this.code = code;
		
	}
	
	public TokenResponse1 getResults() {
		return results;
	}
	
	public String getCode() {
		return code;
	}

	
	
	
	
	
	
	
}
