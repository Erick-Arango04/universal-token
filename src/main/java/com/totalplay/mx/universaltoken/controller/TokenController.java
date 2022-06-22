package com.totalplay.mx.universaltoken.controller;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.totalplay.mx.universaltoken.dao.SendTokenService;

@RestController
public class TokenController {
	
	@Autowired
	SendTokenService serviceToken;
	
	
	
	
	@PostMapping("/middleware/generar")
	public TokenResponse viewJson (@RequestBody TokenRequest tokenRequest ) throws ClientProtocolException, IOException {
		
		
	String secdata_value = serviceToken.sendToken(tokenRequest);
			
			return new TokenResponse("0","" + (int)(Math.random()*99999999+1),"Petición realizada con éxito.",secdata_value);
			
		
	}

}