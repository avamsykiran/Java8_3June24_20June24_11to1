package com.cts.jf.exceptions;

public class BankingException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BankingException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public BankingException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BankingException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BankingException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}	
}