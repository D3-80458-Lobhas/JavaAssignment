package com.sunbeam;

import java.util.Arrays;

public class Tester {

	public Tester() {
	}

	public static void main(String[] args) {
		Student arr[]=new Student[] {
				new Student(1,"lobhas","kalyan",50),
				new Student(2,"zoro","mumbai",60),
				new Student(3,"luffy","thane",70),
				new Student(4,"sanji","pune",80),
				new Student(5,"usopp","hinjewadi",10),
				new Student(6,"franky","kalyan",30),
				new Student(7,"doflamingo","kalyan",30)};
		System.out.println();

		for(Student p:arr)
			System.out.println(p);
		Arrays.sort(arr, new StudentSortComparator());
		System.out.println("After Sort: ");
		for(Student p:arr)
			System.out.println(p);
		


	}
	}


