package com.example.demo.services.exception;

public class ObjectNotFoundExcepction extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundExcepction(String msg) {
		super(msg);
	}
}
