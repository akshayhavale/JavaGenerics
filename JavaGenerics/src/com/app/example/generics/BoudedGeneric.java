package com.app.example.generics;

import java.io.Serializable;

/**
 * Interface if you want to bound then also need to use extend, and only one
 * class is to be bounded but can have many interfaces bounded using & symbol
 * 
 * @author akshay
 *
 * @param <T>
 */
public class BoudedGeneric<T extends Animal & Serializable> {

	private T data;
	
	public BoudedGeneric(T data) {
		this.data = data;
	}

	public void eat() {
		data.eat();
	}

}
