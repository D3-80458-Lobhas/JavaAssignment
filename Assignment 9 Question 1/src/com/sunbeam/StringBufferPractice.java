package com.sunbeam;

public class StringBufferPractice {



	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Sunbeam");
		StringBuffer s2 = new StringBuffer("Sunbeam");
		System.out.println(s1 == s2);
		// false
		System.out.println(s1.equals(s2)); //false
//		
//		String s3 = new String("Sunbeam");
//		System.out.println(s1 == s3);
//		// Error
//		System.out.println(s1.equals(s3));
		
		String s4 = new String("Sunbeam");
		StringBuffer s5 = new StringBuffer("Sunbeam");
		System.out.println(s4.equals(s5)); // false
		System.out.println(s4.equals(s5.toString())); //true
		
		StringBuffer s6 = s2.reverse();
		System.out.println(s6 == s2);
		// true
		System.out.println(s6.equals(s2)); //true	
		
		StringBuilder s7 = new StringBuilder("Sunbeam");
		StringBuilder s8 = new StringBuilder("Sunbeam");
		System.out.println(s7 == s8);
		// false
		System.out.println(s7.equals(s8)); //false
		
		StringBuilder sb1 = new StringBuilder("Sunbeam");
		StringBuilder sb2 = new StringBuilder("Sunbeam");
		System.out.println(sb1 == sb2);
		// false
		System.out.println(sb1.equals(sb2)); //false
		
		StringBuffer s = new StringBuffer();
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 16, 0
		s.append("1234567890");
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 16, 10
		s.append("ABCDEFGHIJKLMNOPQRSTUV");
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 34 32
	}

}
