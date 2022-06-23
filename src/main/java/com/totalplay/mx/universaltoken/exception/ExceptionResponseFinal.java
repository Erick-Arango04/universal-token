package com.totalplay.mx.universaltoken.exception;

public class ExceptionResponseFinal {
	
	private ExceptionResponse results;
	
	
	ExceptionResponseFinal(String result, String resultIdentifier, String resultRescription){
		
		results = new ExceptionResponse(result, resultIdentifier, resultRescription);
	}

	
	public ExceptionResponse getResults() {
		
		return results;
	}
}
