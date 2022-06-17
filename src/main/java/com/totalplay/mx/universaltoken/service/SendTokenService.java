package com.totalplay.mx.universaltoken.service;

import java.io.IOException;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;



@Service
public class SendTokenService {

    @Autowired
    private Environment environment_object;
    
    
    
    public void sendToken() throws ClientProtocolException, IOException {
    
      HttpClient client_object = HttpClientBuilder.create().build();

      HttpPost request_object = new HttpPost(environment_object.getProperty("end-point-token"));
      request_object.addHeader("content-Type", "application/json");
      request_object.addHeader("Accept", "application/json");
    
    	
    	// Creación de JSON
     
    	 JSONObject json_body_content = new JSONObject();
         json_body_content.put("path", "get-token");
         json_body_content.put("function", "sms");
         
        
         JSONObject json_object_body = new JSONObject();
         json_object_body.put("body", json_body_content );
         json_object_body.put("jwtMiddleware", "eyJ0eXAiOiJKV1QiLCJhbGc.iOiJIUzI1NiJ9eyJzdWIiOiIxM");
         json_object_body.put("numeroTelefonico", "5631159899");
         json_object_body.put("obtenerCodigoSMS", "true");
         json_object_body.put("lada", "+52");
         json_object_body.put("canal", "Middleware");
         
         
         StringEntity entity_object = new StringEntity(json_object_body.toString());
         request_object.setEntity(entity_object);

         HttpResponse response_object = client_object.execute(request_object);
       
         System.out.print(response_object.getStatusLine().getStatusCode());
    	
    }
	  
	
	
	
	
	
}
