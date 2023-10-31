package com.sunbeam;

public class Palindrome {

	public Palindrome() {
	}

		    public static void main(String[] args) {
		        String input = "madam";
		        System.out.println(isPalindrome(input));
		    }

		    public static boolean isPalindrome(String str) {
		        int start = 0;
		        int end = str.length() - 1;
		        while (start < end) {
		            if (str.charAt(start) != str.charAt(end)) {
		                return false;
		            }
		            start++;
		            end--;
		        }
		        return true;
		    }	
	}

