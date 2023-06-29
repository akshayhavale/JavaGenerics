package com.app.example.generics;

import java.util.Arrays;
import java.util.List;

public class TestGenerics {

	public static void main(String[] args) {

		Printer<String> printer = new Printer<String>("Hello world");
		printer.print();

		// BoundedGeneric testing
		BoudedGeneric<Cat> cat = new BoudedGeneric<>(new Cat());
		cat.eat();
		
		//Method as Generic
		printSomething("Hello Once Again..");
		
		//wildcard
		List<String> list = Arrays.asList("Akshay","Mahesh","Darshan");
		printList(list);

	}
	
	/*
	 * If we want to use this Method to be generic then use T before the return type specifying
	 */
	private static <T> void printSomething(T data) {
		System.out.println(data);
	}
	
	/*
	 * Take List as any type may by List<Integer> or List<String>
	 * so in like this situation use ? as wildcard
	 */
	private static void printList(List<?> list) {
		System.out.println(list);
	}

}
