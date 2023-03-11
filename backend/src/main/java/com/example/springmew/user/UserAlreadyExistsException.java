package com.example.springmew.user;

public class UserAlreadyExistsException extends Throwable {
	public UserAlreadyExistsException(String message) {
		super(message);
	}
}
