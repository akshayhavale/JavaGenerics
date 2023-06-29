package com.app.example.generics;

import java.io.Serializable;

public class Cat extends Animal implements Serializable{

	@Override
	public void eat() {
		System.out.println("Cat is eating....");
	}

}
