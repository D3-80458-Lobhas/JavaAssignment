package com.sunbeam;

import java.util.Scanner;

enum Gender{Male,Female}
	public class Person {
	private String name;
	private int age;
	Gender gender;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Gender getGender() {
		return gender;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		name= sc.next();
		System.out.print("Enter Age: ");
		age = sc.nextInt();
		System.out.println("Enter Gender: ");
		Gender[] arr= Gender.values();
		for(Gender i: arr)
			System.out.print(i.ordinal()+". "+i.name()+ " ");
		System.out.println();
		gender=arr[sc.nextInt()];

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=").append(name).append(", age=").append(age).append(", gender=").append(gender)
				.append("]");
		return builder.toString();
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
