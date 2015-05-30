package com.sha.java8.eg.first;

public class TestInterfaceMain {
	public static void main(String[] args) {
		TestInterface tester = () -> System.out.println("Java 8 is working");
		tester.test();
	}
}
