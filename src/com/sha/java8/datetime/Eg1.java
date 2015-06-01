package com.sha.java8.datetime;

import java.time.Duration;
import java.time.Instant;

public class Eg1 {
	public static void main(String[] args) {
		Instant start = Instant.now();
		System.out.println(start);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Instant end = Instant.now();
		System.out.println(end);
		
		Duration duration = Duration.between(start, end);
		System.out.println("Difference is " + duration.toMillis() + " in miliseconds");
	}
}
