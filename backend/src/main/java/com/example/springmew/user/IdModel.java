package com.example.springmew.user;

public record IdModel(Long id, Integer something) {

	public String toString() {
		return "IdModel(id: " + id + ")";
	}
}