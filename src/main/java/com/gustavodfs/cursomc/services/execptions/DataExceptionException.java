package com.gustavodfs.cursomc.services.execptions;

public class DataExceptionException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public DataExceptionException(String msg) {
		super(msg);
	}

	
	public DataExceptionException (String msg, Throwable cause ) {
		super(msg, cause);
		
	}
	
	
	
}
