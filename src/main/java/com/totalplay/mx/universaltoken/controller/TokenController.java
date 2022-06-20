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
	
	
	@GetMapping("/prueba")
	public TokenRequest prueba() {
		
		
		return new TokenRequest("sms", 23456789, "Middleware");
	}
	
	
	@PostMapping("/middleware/generar")
	public void viewJson (@RequestBody TokenRequest tokenRequest ) throws ClientProtocolException, IOException {
		
		serviceToken.sendToken(tokenRequest);
		
	}

}
