package com.totalplay.mx.universaltoken.dao;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;


import com.totalplay.mx.universaltoken.controller.TokenRequest1;




@Service
public class SendTokenService {

    @Autowired
    private Environment environment_object;
    
    
    
    public String sendToken (TokenRequest1 tokenRequest) throws ParseException, IOException  {
    	  
      HttpClient client_object = HttpClientBuilder.create().build();

      HttpPost request_object = new HttpPost(environment_object.getProperty("end-point-token"));
      request_object.addHeader("content-Type", "application/json");
      request_object.addHeader("Accept", "application/json");
    
    	
    	// Creación de JSON
     
    	 JSONObject json_body_content = new JSONObject();
         json_body_content.put("path", "get-token");
         json_body_content.put("function", tokenRequest.getFunction());
         
        
         JSONObject json_object_body = new JSONObject();
         json_object_body.put("body", json_body_content );
         json_object_body.put("jwtMiddleware", "eyJ0eXAiOiJKV1QiLCJhbGc.iOiJIUzI1NiJ9eyJzdWIiOiIxM");
         json_object_body.put("numeroTelefonico", tokenRequest.getEmail() );
         json_object_body.put("obtenerCodigoSMS", "true");
         json_object_body.put("lada", tokenRequest.getLada());
         json_object_body.put("canal", tokenRequest.getCanal());
         
         
         StringEntity entity_object = new StringEntity(json_object_body.toString());
         request_object.setEntity(entity_object);

         HttpResponse response_object = client_object.execute(request_object);
          
             //Obtencion del Response Json
             
             String body_string = EntityUtils.toString(response_object.getEntity());
             
             JSONObject body_request_json = new JSONObject(body_string);
          
             String secdata = body_request_json.get("bean").toString();
             JSONObject secdata_json = new JSONObject(secdata);
             
            return secdata_json.get("secdata").toString();
             
        
    }
	  
}
