package com.totalplay.mx.universaltoken.controller;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.totalplay.mx.universaltoken.service.SendTokenService;

@RestController
public class TokenController {
	
	@Autowired
	SendTokenService serviceToken;
	
	
	
	@PostMapping("/middleware/generar")
	public void viewJson () throws ClientProtocolException, IOException {
		
		serviceToken.sendToken();
		
	}

}
