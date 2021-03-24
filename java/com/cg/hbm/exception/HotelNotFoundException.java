package com.cg.hbm.exception;

public class HotelNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public HotelNotFoundException(String message) {
		super(message);
	}

	/*
	 * public HotelNotFoundException(String message, Throwable cause, boolean
	 * enableSuppression, boolean writableStackTrace) { super(message, cause,
	 * enableSuppression, writableStackTrace); // TODO Auto-generated constructor
	 * stub }
	 * 
	 * public HotelNotFoundException(String message, Throwable cause) {
	 * super(message, cause); // TODO Auto-generated constructor stub }
	 * 
	 * public HotelNotFoundException(Throwable cause) { super(cause); // TODO
	 * Auto-generated constructor stub }
	 * 
	 */
}