package com.totalplay.mx.universaltoken.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.totalplay.mx.universaltoken.dao.SendTokenService;

@RestController
public class TokenController {
	
	@Autowired
	SendTokenService serviceToken;
	
	
	
	
	@PostMapping("/middleware/generar")
	public TokenResponse1 viewJson (@Valid @RequestBody TokenRequest tokenRequest ) throws ClientProtocolException, IOException {
		
		
	String secdata_value = serviceToken.sendToken(tokenRequest);
			
			return new TokenResponse1("0","" + (int)(Math.random()*99999999+1),"Petición realizada con éxito.",secdata_value);
			
		
	}

}