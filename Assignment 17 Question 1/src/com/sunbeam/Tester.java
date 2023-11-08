package com.sunbeam;

import java.util.Scanner;
import java.util.stream.Stream;

public class Tester {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("ENTER NO TO CALCULATE FACTORIAL:");
			int number=sc.nextInt();
			System.out.print("FACTORIAL:"+Stream.iterate(1, x->x+1).limit(number).reduce(1, (a,e)->a*e).intValue());
		}
	}


