package com.sunbeam;

public class Tester {

	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count=0;
		for (T ele : arr) 
			if(c.compare(ele, key))
				count++;
		return count;
		}
	
	public static void main(String[] args) {
		Integer [] arr = {44, 77, 22, 22,22,55, 55, 66,54,50,50};
		Integer key = 50;
		int cnt = countIf(arr, key, (x,y)-> Double.compare(x, y)==0);
		System.out.println("Count = " + cnt);
	}
}
