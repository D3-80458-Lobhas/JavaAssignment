package com.sunbeam;

import java.util.function.Predicate;

public class Tester {

	
	public static int countIf(String[] arr, Predicate<String> cond) {
		int count = 0;
		for(String str: arr) {
		if(cond.test(str))
		count++;
		}
		return count;
		}

	public static void main(String[] args) {
			String[] arr = { "Nilesh", "Shubham", "Pratik", "Omkar", "Prashant" };
			int cnt = countIf(arr, new Predicate<String>() {
			public boolean test(String s) {
			return s.length() > 6;
			}
			});
			System.out.println("Result: " + cnt); // 2
			
			System.out.println("Result: " + countIf(arr,(x -> x.length()>6))); // 2
			
			}
	}


