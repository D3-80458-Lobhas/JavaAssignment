package com.sunbeam;

public class StringPractice {

	public StringPractice() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String s1 = "Sunbeam";
		String s2 = "Sunbeam";
		System.out.println(s1 == s2); //true
		System.out.println(s1.equals(s2)); //true
		
		String s3 = new String("Sunbeam");
		String s4 = new String("Sunbeam");
		System.out.println(s3 == s4); //false
		System.out.println(s3.equals(s4)); //true
		
		System.out.println(s1 == s3); //false
		System.out.println(s1.equals(s3)); //true
		
		String s5 = "Sun" + "beam";
		System.out.println(s1 == s5); //true
		System.out.println(s1.equals(s5)); //true
		
		String s6 = "Sun";
		String s7 = s6 + "beam";
		System.out.println(s1 == s7); //false
		System.out.println(s1.equals(s7)); //true
		
		String s8 = new String("Sunbeam").intern();
		System.out.println(s1 == s8); //true
		System.out.println(s1.equals(s8)); //true
		
		String s9 = "SunBeam";
		System.out.println(s1 == s9); // false
		System.out.println(s1.equals(s9)); // false
		System.out.println(s1.equalsIgnoreCase(s9)); // true
		System.out.println(s1.compareTo(s9)); // 32
		System.out.println(s1.compareToIgnoreCase(s9)); //0
		
	}

}
