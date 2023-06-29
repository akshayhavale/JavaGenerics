package com.app.example.generics;

public class Printer <T>{
	
	
	private T data;
	
	public Printer(T data) {
		this.data = data;
	}
	
	public void print() {
		System.out.println(data);
	}

}
