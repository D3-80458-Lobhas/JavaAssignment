package com.sunbeam;

public class Tester {

	static <T extends Displayable> void printDisplayableBox(T b)
	{
		((Displayable)b.get()).display();
	}
	
	public static <T extends Displayable> void printAnyBox(T b) {
		System.out.println(b.get().toString());
		}
	
	public static void main(String[] args) {
		Book book=new Book("abc",500);
		Person person= new Person("luffy",20);
		Car car=new Car("Tesla",50);
		printDisplayableBox(book);
		printDisplayableBox(person);
		printDisplayableBox(car);
		printAnyBox(book);
		printAnyBox(person);
		printAnyBox(car);
	}

}
