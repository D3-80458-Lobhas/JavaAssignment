package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class sort {

	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
		if(c.compare(arr[i], arr[j]) > 0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
		}
	}

		
	public static void main(String[] args) {
		Double arr[]= {10.5,51.1,81.4,61.6,75.5,76.7,90.8,45.4,62.4};
		System.out.println("Before Sort: ");
		for(Double p:arr)
			System.out.println(p);
		selectionSort(arr, new DoubleComporator());
		System.out.println("After Sort: ");
		for(Double p:arr)
			System.out.println(p);

}
}
